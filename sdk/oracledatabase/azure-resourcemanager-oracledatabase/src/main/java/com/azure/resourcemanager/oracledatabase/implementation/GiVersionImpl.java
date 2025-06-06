// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.oracledatabase.fluent.models.GiVersionInner;
import com.azure.resourcemanager.oracledatabase.models.GiVersion;
import com.azure.resourcemanager.oracledatabase.models.GiVersionProperties;

public final class GiVersionImpl implements GiVersion {
    private GiVersionInner innerObject;

    private final com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager;

    GiVersionImpl(GiVersionInner innerObject,
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public GiVersionProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public GiVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager() {
        return this.serviceManager;
    }
}
