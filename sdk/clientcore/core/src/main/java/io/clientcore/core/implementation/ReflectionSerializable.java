// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.implementation;

import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonWriter;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * Utility class that handles creating and using {@code JsonSerializable} and {@code XmlSerializable} reflectively while
 * they are in beta.
 */
public final class ReflectionSerializable {
    private static final ClientLogger LOGGER = new ClientLogger(ReflectionSerializable.class);
    private static final Map<Class<?>, ReflectiveInvoker> FROM_JSON_CACHE;

    static {
        FROM_JSON_CACHE = new ConcurrentHashMap<>();
    }

    /**
     * Whether {@code JsonSerializable} is supported and the {@code bodyContentClass} is an instance of it.
     *
     * @param bodyContentClass The body content class.
     * @return Whether {@code bodyContentClass} can be used as {@code JsonSerializable}.
     */
    public static boolean supportsJsonSerializable(Class<?> bodyContentClass) {
        return JsonSerializable.class.isAssignableFrom(bodyContentClass);
    }

    /**
     * Serializes the {@code jsonSerializable} as an instance of {@code JsonSerializable}.
     *
     * @param jsonSerializable The {@code JsonSerializable} body content.
     * @return The {@link ByteBuffer} representing the serialized {@code jsonSerializable}.
     * @throws IOException If an error occurs during serialization.
     */
    public static ByteBuffer serializeJsonSerializableToByteBuffer(JsonSerializable<?> jsonSerializable)
        throws IOException {
        return serializeJsonSerializableWithReturn(jsonSerializable, AccessibleByteArrayOutputStream::toByteBuffer);
    }

    /**
     * Serializes the {@code jsonSerializable} as an instance of {@code JsonSerializable}.
     *
     * @param jsonSerializable The {@code JsonSerializable} content.
     * @return The {@code byte[]} representing the serialized {@code jsonSerializable}.
     * @throws IOException If an error occurs during serialization.
     */
    public static byte[] serializeJsonSerializableToBytes(JsonSerializable<?> jsonSerializable) throws IOException {
        return serializeJsonSerializableWithReturn(jsonSerializable, AccessibleByteArrayOutputStream::toByteArray);
    }

    /**
     * Serializes the {@code jsonSerializable} as an instance of {@code JsonSerializable}.
     *
     * @param jsonSerializable The {@code JsonSerializable} content.
     * @return The {@link String} representing the serialized {@code jsonSerializable}.
     * @throws IOException If an error occurs during serialization.
     */
    public static String serializeJsonSerializableToString(JsonSerializable<?> jsonSerializable) throws IOException {
        return serializeJsonSerializableWithReturn(jsonSerializable, aos -> aos.toString(StandardCharsets.UTF_8));
    }

    private static <T> T serializeJsonSerializableWithReturn(JsonSerializable<?> jsonSerializable,
        Function<AccessibleByteArrayOutputStream, T> returner) throws IOException {
        try (AccessibleByteArrayOutputStream outputStream = new AccessibleByteArrayOutputStream();
            JsonWriter jsonWriter = JsonWriter.toStream(outputStream)) {
            jsonWriter.writeJson(jsonSerializable).flush();

            return returner.apply(outputStream);
        }
    }

    /**
     * Serializes the {@code jsonSerializable} as an instance of {@code JsonSerializable}.
     *
     * @param jsonSerializable The {@code JsonSerializable} content.
     * @param outputStream Where the serialized {@code JsonSerializable} will be written.
     * @throws IOException If an error occurs during serialization.
     */
    public static void serializeJsonSerializableIntoOutputStream(JsonSerializable<?> jsonSerializable,
        OutputStream outputStream) throws IOException {
        try (JsonWriter jsonWriter = JsonWriter.toStream(outputStream)) {
            jsonWriter.writeJson(jsonSerializable).flush();
        }
    }

    /**
     * Deserializes the {@code json} as an instance of {@code JsonSerializable}.
     *
     * @param jsonSerializable The {@code JsonSerializable} represented by the {@code json}.
     * @param json The JSON being deserialized.
     * @return An instance of {@code jsonSerializable} based on the {@code json}.
     * @throws IOException If an error occurs during deserialization.
     */
    public static Object deserializeAsJsonSerializable(Class<?> jsonSerializable, byte[] json) throws IOException {
        if (FROM_JSON_CACHE.size() >= 10000) {
            FROM_JSON_CACHE.clear();
        }

        ReflectiveInvoker readJson = FROM_JSON_CACHE.computeIfAbsent(jsonSerializable, clazz -> {
            try {
                return ReflectionUtils.getMethodInvoker(clazz,
                    jsonSerializable.getDeclaredMethod("fromJson", JsonReader.class));
            } catch (Exception e) {
                throw LOGGER.throwableAtError().log(e, IllegalStateException::new);
            }
        });

        try (JsonReader jsonReader = JsonReader.fromBytes(json)) {
            return readJson.invokeStatic(jsonReader);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw LOGGER.throwableAtError().log(e, IOException::new);
        }
    }

    private ReflectionSerializable() {
    }
}
