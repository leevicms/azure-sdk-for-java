// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;

/**
 * Parameter group.
 */
@Fluent
public final class EncryptionScope {
    /*
     * Optional. Version 2019-07-07 and later. Specifies the name of the encryption scope to use to encrypt the data
     * provided in the request. If not specified, encryption is performed with the default account encryption scope. For
     * more information, see Encryption at Rest for Azure Storage Services.
     */
    @Generated
    private String encryptionScope;

    /**
     * Creates an instance of EncryptionScope class.
     */
    @Generated
    public EncryptionScope() {
    }

    /**
     * Get the encryptionScope property: Optional. Version 2019-07-07 and later. Specifies the name of the encryption
     * scope to use to encrypt the data provided in the request. If not specified, encryption is performed with the
     * default account encryption scope. For more information, see Encryption at Rest for Azure Storage Services.
     * 
     * @return the encryptionScope value.
     */
    @Generated
    public String getEncryptionScope() {
        return this.encryptionScope;
    }

    /**
     * Set the encryptionScope property: Optional. Version 2019-07-07 and later. Specifies the name of the encryption
     * scope to use to encrypt the data provided in the request. If not specified, encryption is performed with the
     * default account encryption scope. For more information, see Encryption at Rest for Azure Storage Services.
     * 
     * @param encryptionScope the encryptionScope value to set.
     * @return the EncryptionScope object itself.
     */
    @Generated
    public EncryptionScope setEncryptionScope(String encryptionScope) {
        this.encryptionScope = encryptionScope;
        return this;
    }
}
