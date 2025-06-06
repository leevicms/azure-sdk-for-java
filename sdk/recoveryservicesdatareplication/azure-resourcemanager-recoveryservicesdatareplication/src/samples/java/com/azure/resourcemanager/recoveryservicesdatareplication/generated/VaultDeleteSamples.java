// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

/**
 * Samples for Vault Delete.
 */
public final class VaultDeleteSamples {
    /*
     * x-ms-original-file: 2024-09-01/Vault_Delete.json
     */
    /**
     * Sample code: Deletes the vault.
     * 
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void deletesTheVault(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager.vaults().delete("rgrecoveryservicesdatareplication", "4", com.azure.core.util.Context.NONE);
    }
}
