// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Azure SQL Managed Instance source.
 */
@Fluent
public final class SqlMISource extends TabularSource {
    /*
     * Copy source type.
     */
    private String type = "SqlMISource";

    /*
     * SQL reader query. Type: string (or Expression with resultType string).
     */
    private Object sqlReaderQuery;

    /*
     * Name of the stored procedure for a Azure SQL Managed Instance source. This cannot be used at the same time as
     * SqlReaderQuery. Type: string (or Expression with resultType string).
     */
    private Object sqlReaderStoredProcedureName;

    /*
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     */
    private Object storedProcedureParameters;

    /*
     * Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     */
    private Object isolationLevel;

    /*
     * Which additional types to produce.
     */
    private Object produceAdditionalTypes;

    /*
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None",
     * "PhysicalPartitionsOfTable", "DynamicRange". Type: string (or Expression with resultType string).
     */
    private Object partitionOption;

    /*
     * The settings that will be leveraged for Sql source partitioning.
     */
    private SqlPartitionSettings partitionSettings;

    /**
     * Creates an instance of SqlMISource class.
     */
    public SqlMISource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the sqlReaderQuery property: SQL reader query. Type: string (or Expression with resultType string).
     * 
     * @return the sqlReaderQuery value.
     */
    public Object sqlReaderQuery() {
        return this.sqlReaderQuery;
    }

    /**
     * Set the sqlReaderQuery property: SQL reader query. Type: string (or Expression with resultType string).
     * 
     * @param sqlReaderQuery the sqlReaderQuery value to set.
     * @return the SqlMISource object itself.
     */
    public SqlMISource withSqlReaderQuery(Object sqlReaderQuery) {
        this.sqlReaderQuery = sqlReaderQuery;
        return this;
    }

    /**
     * Get the sqlReaderStoredProcedureName property: Name of the stored procedure for a Azure SQL Managed Instance
     * source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType
     * string).
     * 
     * @return the sqlReaderStoredProcedureName value.
     */
    public Object sqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName;
    }

    /**
     * Set the sqlReaderStoredProcedureName property: Name of the stored procedure for a Azure SQL Managed Instance
     * source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType
     * string).
     * 
     * @param sqlReaderStoredProcedureName the sqlReaderStoredProcedureName value to set.
     * @return the SqlMISource object itself.
     */
    public SqlMISource withSqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        return this;
    }

    /**
     * Get the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     * 
     * @return the storedProcedureParameters value.
     */
    public Object storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     * 
     * @param storedProcedureParameters the storedProcedureParameters value to set.
     * @return the SqlMISource object itself.
     */
    public SqlMISource withStoredProcedureParameters(Object storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get the isolationLevel property: Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     * 
     * @return the isolationLevel value.
     */
    public Object isolationLevel() {
        return this.isolationLevel;
    }

    /**
     * Set the isolationLevel property: Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     * 
     * @param isolationLevel the isolationLevel value to set.
     * @return the SqlMISource object itself.
     */
    public SqlMISource withIsolationLevel(Object isolationLevel) {
        this.isolationLevel = isolationLevel;
        return this;
    }

    /**
     * Get the produceAdditionalTypes property: Which additional types to produce.
     * 
     * @return the produceAdditionalTypes value.
     */
    public Object produceAdditionalTypes() {
        return this.produceAdditionalTypes;
    }

    /**
     * Set the produceAdditionalTypes property: Which additional types to produce.
     * 
     * @param produceAdditionalTypes the produceAdditionalTypes value to set.
     * @return the SqlMISource object itself.
     */
    public SqlMISource withProduceAdditionalTypes(Object produceAdditionalTypes) {
        this.produceAdditionalTypes = produceAdditionalTypes;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for Sql read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange". Type: string (or Expression with resultType
     * string).
     * 
     * @return the partitionOption value.
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for Sql read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange". Type: string (or Expression with resultType
     * string).
     * 
     * @param partitionOption the partitionOption value to set.
     * @return the SqlMISource object itself.
     */
    public SqlMISource withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for Sql source partitioning.
     * 
     * @return the partitionSettings value.
     */
    public SqlPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for Sql source partitioning.
     * 
     * @param partitionSettings the partitionSettings value to set.
     * @return the SqlMISource object itself.
     */
    public SqlMISource withPartitionSettings(SqlPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMISource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMISource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMISource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMISource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMISource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMISource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (partitionSettings() != null) {
            partitionSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (sourceRetryCount() != null) {
            jsonWriter.writeUntypedField("sourceRetryCount", sourceRetryCount());
        }
        if (sourceRetryWait() != null) {
            jsonWriter.writeUntypedField("sourceRetryWait", sourceRetryWait());
        }
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        }
        if (queryTimeout() != null) {
            jsonWriter.writeUntypedField("queryTimeout", queryTimeout());
        }
        if (additionalColumns() != null) {
            jsonWriter.writeUntypedField("additionalColumns", additionalColumns());
        }
        jsonWriter.writeStringField("type", this.type);
        if (this.sqlReaderQuery != null) {
            jsonWriter.writeUntypedField("sqlReaderQuery", this.sqlReaderQuery);
        }
        if (this.sqlReaderStoredProcedureName != null) {
            jsonWriter.writeUntypedField("sqlReaderStoredProcedureName", this.sqlReaderStoredProcedureName);
        }
        if (this.storedProcedureParameters != null) {
            jsonWriter.writeUntypedField("storedProcedureParameters", this.storedProcedureParameters);
        }
        if (this.isolationLevel != null) {
            jsonWriter.writeUntypedField("isolationLevel", this.isolationLevel);
        }
        if (this.produceAdditionalTypes != null) {
            jsonWriter.writeUntypedField("produceAdditionalTypes", this.produceAdditionalTypes);
        }
        if (this.partitionOption != null) {
            jsonWriter.writeUntypedField("partitionOption", this.partitionOption);
        }
        jsonWriter.writeJsonField("partitionSettings", this.partitionSettings);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlMISource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlMISource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlMISource.
     */
    public static SqlMISource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlMISource deserializedSqlMISource = new SqlMISource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedSqlMISource.withSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedSqlMISource.withSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedSqlMISource.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedSqlMISource.withDisableMetricsCollection(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedSqlMISource.withQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedSqlMISource.withAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedSqlMISource.type = reader.getString();
                } else if ("sqlReaderQuery".equals(fieldName)) {
                    deserializedSqlMISource.sqlReaderQuery = reader.readUntyped();
                } else if ("sqlReaderStoredProcedureName".equals(fieldName)) {
                    deserializedSqlMISource.sqlReaderStoredProcedureName = reader.readUntyped();
                } else if ("storedProcedureParameters".equals(fieldName)) {
                    deserializedSqlMISource.storedProcedureParameters = reader.readUntyped();
                } else if ("isolationLevel".equals(fieldName)) {
                    deserializedSqlMISource.isolationLevel = reader.readUntyped();
                } else if ("produceAdditionalTypes".equals(fieldName)) {
                    deserializedSqlMISource.produceAdditionalTypes = reader.readUntyped();
                } else if ("partitionOption".equals(fieldName)) {
                    deserializedSqlMISource.partitionOption = reader.readUntyped();
                } else if ("partitionSettings".equals(fieldName)) {
                    deserializedSqlMISource.partitionSettings = SqlPartitionSettings.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSqlMISource.withAdditionalProperties(additionalProperties);

            return deserializedSqlMISource;
        });
    }
}
