// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * VMwareCbt specific update migration item input.
 */
@Fluent
public final class VMwareCbtUpdateMigrationItemInput extends UpdateMigrationItemProviderSpecificInput {
    /*
     * The class type.
     */
    private String instanceType = "VMwareCbt";

    /*
     * The target VM name.
     */
    private String targetVmName;

    /*
     * The target VM size.
     */
    private String targetVmSize;

    /*
     * The target resource group ARM Id.
     */
    private String targetResourceGroupId;

    /*
     * The target availability set ARM Id.
     */
    private String targetAvailabilitySetId;

    /*
     * The target availability zone.
     */
    private String targetAvailabilityZone;

    /*
     * The target proximity placement group ARM Id.
     */
    private String targetProximityPlacementGroupId;

    /*
     * The target boot diagnostics storage account ARM Id.
     */
    private String targetBootDiagnosticsStorageAccountId;

    /*
     * The target network ARM Id.
     */
    private String targetNetworkId;

    /*
     * The test network ARM Id.
     */
    private String testNetworkId;

    /*
     * The list of NIC details.
     */
    private List<VMwareCbtNicInput> vmNics;

    /*
     * The list of disk update properties.
     */
    private List<VMwareCbtUpdateDiskInput> vmDisks;

    /*
     * The license type.
     */
    private LicenseType licenseType;

    /*
     * The SQL Server license type.
     */
    private SqlServerLicenseType sqlServerLicenseType;

    /*
     * The license type for Linux VM's.
     */
    private LinuxLicenseType linuxLicenseType;

    /*
     * The OS name selected by user.
     */
    private String userSelectedOSName;

    /*
     * A value indicating whether auto resync is to be done.
     */
    private String performAutoResync;

    /*
     * The target VM tags.
     */
    private Map<String, String> targetVmTags;

    /*
     * The tags for the target disks.
     */
    private Map<String, String> targetDiskTags;

    /*
     * The tags for the target NICs.
     */
    private Map<String, String> targetNicTags;

    /**
     * Creates an instance of VMwareCbtUpdateMigrationItemInput class.
     */
    public VMwareCbtUpdateMigrationItemInput() {
    }

    /**
     * Get the instanceType property: The class type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the targetVmName property: The target VM name.
     * 
     * @return the targetVmName value.
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Set the targetVmName property: The target VM name.
     * 
     * @param targetVmName the targetVmName value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetVmName(String targetVmName) {
        this.targetVmName = targetVmName;
        return this;
    }

    /**
     * Get the targetVmSize property: The target VM size.
     * 
     * @return the targetVmSize value.
     */
    public String targetVmSize() {
        return this.targetVmSize;
    }

    /**
     * Set the targetVmSize property: The target VM size.
     * 
     * @param targetVmSize the targetVmSize value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetVmSize(String targetVmSize) {
        this.targetVmSize = targetVmSize;
        return this;
    }

    /**
     * Get the targetResourceGroupId property: The target resource group ARM Id.
     * 
     * @return the targetResourceGroupId value.
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the targetResourceGroupId property: The target resource group ARM Id.
     * 
     * @param targetResourceGroupId the targetResourceGroupId value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the targetAvailabilitySetId property: The target availability set ARM Id.
     * 
     * @return the targetAvailabilitySetId value.
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the targetAvailabilitySetId property: The target availability set ARM Id.
     * 
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetAvailabilitySetId(String targetAvailabilitySetId) {
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        return this;
    }

    /**
     * Get the targetAvailabilityZone property: The target availability zone.
     * 
     * @return the targetAvailabilityZone value.
     */
    public String targetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * Set the targetAvailabilityZone property: The target availability zone.
     * 
     * @param targetAvailabilityZone the targetAvailabilityZone value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * Get the targetProximityPlacementGroupId property: The target proximity placement group ARM Id.
     * 
     * @return the targetProximityPlacementGroupId value.
     */
    public String targetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }

    /**
     * Set the targetProximityPlacementGroupId property: The target proximity placement group ARM Id.
     * 
     * @param targetProximityPlacementGroupId the targetProximityPlacementGroupId value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput
        withTargetProximityPlacementGroupId(String targetProximityPlacementGroupId) {
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     * 
     * @return the targetBootDiagnosticsStorageAccountId value.
     */
    public String targetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * Set the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     * 
     * @param targetBootDiagnosticsStorageAccountId the targetBootDiagnosticsStorageAccountId value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput
        withTargetBootDiagnosticsStorageAccountId(String targetBootDiagnosticsStorageAccountId) {
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        return this;
    }

    /**
     * Get the targetNetworkId property: The target network ARM Id.
     * 
     * @return the targetNetworkId value.
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Set the targetNetworkId property: The target network ARM Id.
     * 
     * @param targetNetworkId the targetNetworkId value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * Get the testNetworkId property: The test network ARM Id.
     * 
     * @return the testNetworkId value.
     */
    public String testNetworkId() {
        return this.testNetworkId;
    }

    /**
     * Set the testNetworkId property: The test network ARM Id.
     * 
     * @param testNetworkId the testNetworkId value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTestNetworkId(String testNetworkId) {
        this.testNetworkId = testNetworkId;
        return this;
    }

    /**
     * Get the vmNics property: The list of NIC details.
     * 
     * @return the vmNics value.
     */
    public List<VMwareCbtNicInput> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the vmNics property: The list of NIC details.
     * 
     * @param vmNics the vmNics value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withVmNics(List<VMwareCbtNicInput> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the vmDisks property: The list of disk update properties.
     * 
     * @return the vmDisks value.
     */
    public List<VMwareCbtUpdateDiskInput> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the vmDisks property: The list of disk update properties.
     * 
     * @param vmDisks the vmDisks value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withVmDisks(List<VMwareCbtUpdateDiskInput> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the licenseType property: The license type.
     * 
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type.
     * 
     * @param licenseType the licenseType value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the sqlServerLicenseType property: The SQL Server license type.
     * 
     * @return the sqlServerLicenseType value.
     */
    public SqlServerLicenseType sqlServerLicenseType() {
        return this.sqlServerLicenseType;
    }

    /**
     * Set the sqlServerLicenseType property: The SQL Server license type.
     * 
     * @param sqlServerLicenseType the sqlServerLicenseType value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType) {
        this.sqlServerLicenseType = sqlServerLicenseType;
        return this;
    }

    /**
     * Get the linuxLicenseType property: The license type for Linux VM's.
     * 
     * @return the linuxLicenseType value.
     */
    public LinuxLicenseType linuxLicenseType() {
        return this.linuxLicenseType;
    }

    /**
     * Set the linuxLicenseType property: The license type for Linux VM's.
     * 
     * @param linuxLicenseType the linuxLicenseType value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withLinuxLicenseType(LinuxLicenseType linuxLicenseType) {
        this.linuxLicenseType = linuxLicenseType;
        return this;
    }

    /**
     * Get the userSelectedOSName property: The OS name selected by user.
     * 
     * @return the userSelectedOSName value.
     */
    public String userSelectedOSName() {
        return this.userSelectedOSName;
    }

    /**
     * Set the userSelectedOSName property: The OS name selected by user.
     * 
     * @param userSelectedOSName the userSelectedOSName value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withUserSelectedOSName(String userSelectedOSName) {
        this.userSelectedOSName = userSelectedOSName;
        return this;
    }

    /**
     * Get the performAutoResync property: A value indicating whether auto resync is to be done.
     * 
     * @return the performAutoResync value.
     */
    public String performAutoResync() {
        return this.performAutoResync;
    }

    /**
     * Set the performAutoResync property: A value indicating whether auto resync is to be done.
     * 
     * @param performAutoResync the performAutoResync value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withPerformAutoResync(String performAutoResync) {
        this.performAutoResync = performAutoResync;
        return this;
    }

    /**
     * Get the targetVmTags property: The target VM tags.
     * 
     * @return the targetVmTags value.
     */
    public Map<String, String> targetVmTags() {
        return this.targetVmTags;
    }

    /**
     * Set the targetVmTags property: The target VM tags.
     * 
     * @param targetVmTags the targetVmTags value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetVmTags(Map<String, String> targetVmTags) {
        this.targetVmTags = targetVmTags;
        return this;
    }

    /**
     * Get the targetDiskTags property: The tags for the target disks.
     * 
     * @return the targetDiskTags value.
     */
    public Map<String, String> targetDiskTags() {
        return this.targetDiskTags;
    }

    /**
     * Set the targetDiskTags property: The tags for the target disks.
     * 
     * @param targetDiskTags the targetDiskTags value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetDiskTags(Map<String, String> targetDiskTags) {
        this.targetDiskTags = targetDiskTags;
        return this;
    }

    /**
     * Get the targetNicTags property: The tags for the target NICs.
     * 
     * @return the targetNicTags value.
     */
    public Map<String, String> targetNicTags() {
        return this.targetNicTags;
    }

    /**
     * Set the targetNicTags property: The tags for the target NICs.
     * 
     * @param targetNicTags the targetNicTags value to set.
     * @return the VMwareCbtUpdateMigrationItemInput object itself.
     */
    public VMwareCbtUpdateMigrationItemInput withTargetNicTags(Map<String, String> targetNicTags) {
        this.targetNicTags = targetNicTags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
        if (vmDisks() != null) {
            vmDisks().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("targetVmName", this.targetVmName);
        jsonWriter.writeStringField("targetVmSize", this.targetVmSize);
        jsonWriter.writeStringField("targetResourceGroupId", this.targetResourceGroupId);
        jsonWriter.writeStringField("targetAvailabilitySetId", this.targetAvailabilitySetId);
        jsonWriter.writeStringField("targetAvailabilityZone", this.targetAvailabilityZone);
        jsonWriter.writeStringField("targetProximityPlacementGroupId", this.targetProximityPlacementGroupId);
        jsonWriter.writeStringField("targetBootDiagnosticsStorageAccountId",
            this.targetBootDiagnosticsStorageAccountId);
        jsonWriter.writeStringField("targetNetworkId", this.targetNetworkId);
        jsonWriter.writeStringField("testNetworkId", this.testNetworkId);
        jsonWriter.writeArrayField("vmNics", this.vmNics, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("vmDisks", this.vmDisks, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("licenseType", this.licenseType == null ? null : this.licenseType.toString());
        jsonWriter.writeStringField("sqlServerLicenseType",
            this.sqlServerLicenseType == null ? null : this.sqlServerLicenseType.toString());
        jsonWriter.writeStringField("linuxLicenseType",
            this.linuxLicenseType == null ? null : this.linuxLicenseType.toString());
        jsonWriter.writeStringField("userSelectedOSName", this.userSelectedOSName);
        jsonWriter.writeStringField("performAutoResync", this.performAutoResync);
        jsonWriter.writeMapField("targetVmTags", this.targetVmTags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("targetDiskTags", this.targetDiskTags,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("targetNicTags", this.targetNicTags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VMwareCbtUpdateMigrationItemInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VMwareCbtUpdateMigrationItemInput if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VMwareCbtUpdateMigrationItemInput.
     */
    public static VMwareCbtUpdateMigrationItemInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VMwareCbtUpdateMigrationItemInput deserializedVMwareCbtUpdateMigrationItemInput
                = new VMwareCbtUpdateMigrationItemInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.instanceType = reader.getString();
                } else if ("targetVmName".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetVmName = reader.getString();
                } else if ("targetVmSize".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetVmSize = reader.getString();
                } else if ("targetResourceGroupId".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetResourceGroupId = reader.getString();
                } else if ("targetAvailabilitySetId".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetAvailabilitySetId = reader.getString();
                } else if ("targetAvailabilityZone".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetAvailabilityZone = reader.getString();
                } else if ("targetProximityPlacementGroupId".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetProximityPlacementGroupId = reader.getString();
                } else if ("targetBootDiagnosticsStorageAccountId".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetBootDiagnosticsStorageAccountId
                        = reader.getString();
                } else if ("targetNetworkId".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.targetNetworkId = reader.getString();
                } else if ("testNetworkId".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.testNetworkId = reader.getString();
                } else if ("vmNics".equals(fieldName)) {
                    List<VMwareCbtNicInput> vmNics = reader.readArray(reader1 -> VMwareCbtNicInput.fromJson(reader1));
                    deserializedVMwareCbtUpdateMigrationItemInput.vmNics = vmNics;
                } else if ("vmDisks".equals(fieldName)) {
                    List<VMwareCbtUpdateDiskInput> vmDisks
                        = reader.readArray(reader1 -> VMwareCbtUpdateDiskInput.fromJson(reader1));
                    deserializedVMwareCbtUpdateMigrationItemInput.vmDisks = vmDisks;
                } else if ("licenseType".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.licenseType
                        = LicenseType.fromString(reader.getString());
                } else if ("sqlServerLicenseType".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.sqlServerLicenseType
                        = SqlServerLicenseType.fromString(reader.getString());
                } else if ("linuxLicenseType".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.linuxLicenseType
                        = LinuxLicenseType.fromString(reader.getString());
                } else if ("userSelectedOSName".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.userSelectedOSName = reader.getString();
                } else if ("performAutoResync".equals(fieldName)) {
                    deserializedVMwareCbtUpdateMigrationItemInput.performAutoResync = reader.getString();
                } else if ("targetVmTags".equals(fieldName)) {
                    Map<String, String> targetVmTags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVMwareCbtUpdateMigrationItemInput.targetVmTags = targetVmTags;
                } else if ("targetDiskTags".equals(fieldName)) {
                    Map<String, String> targetDiskTags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVMwareCbtUpdateMigrationItemInput.targetDiskTags = targetDiskTags;
                } else if ("targetNicTags".equals(fieldName)) {
                    Map<String, String> targetNicTags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVMwareCbtUpdateMigrationItemInput.targetNicTags = targetNicTags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVMwareCbtUpdateMigrationItemInput;
        });
    }
}
