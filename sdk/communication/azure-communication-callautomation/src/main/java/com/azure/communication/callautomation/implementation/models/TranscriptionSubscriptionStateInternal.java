// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Transcription subscription state.
 */
public final class TranscriptionSubscriptionStateInternal
    extends ExpandableStringEnum<TranscriptionSubscriptionStateInternal> {
    /**
     * Static value disabled for TranscriptionSubscriptionStateInternal.
     */
    @Generated
    public static final TranscriptionSubscriptionStateInternal DISABLED = fromString("disabled");

    /**
     * Static value inactive for TranscriptionSubscriptionStateInternal.
     */
    @Generated
    public static final TranscriptionSubscriptionStateInternal INACTIVE = fromString("inactive");

    /**
     * Static value active for TranscriptionSubscriptionStateInternal.
     */
    @Generated
    public static final TranscriptionSubscriptionStateInternal ACTIVE = fromString("active");

    /**
     * Creates a new instance of TranscriptionSubscriptionStateInternal value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public TranscriptionSubscriptionStateInternal() {
    }

    /**
     * Creates or finds a TranscriptionSubscriptionStateInternal from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TranscriptionSubscriptionStateInternal.
     */
    @Generated
    public static TranscriptionSubscriptionStateInternal fromString(String name) {
        return fromString(name, TranscriptionSubscriptionStateInternal.class);
    }

    /**
     * Gets known TranscriptionSubscriptionStateInternal values.
     * 
     * @return known TranscriptionSubscriptionStateInternal values.
     */
    @Generated
    public static Collection<TranscriptionSubscriptionStateInternal> values() {
        return values(TranscriptionSubscriptionStateInternal.class);
    }
}
