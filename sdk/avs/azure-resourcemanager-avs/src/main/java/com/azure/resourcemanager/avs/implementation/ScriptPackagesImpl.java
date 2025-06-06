// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.ScriptPackagesClient;
import com.azure.resourcemanager.avs.fluent.models.ScriptPackageInner;
import com.azure.resourcemanager.avs.models.ScriptPackage;
import com.azure.resourcemanager.avs.models.ScriptPackages;

public final class ScriptPackagesImpl implements ScriptPackages {
    private static final ClientLogger LOGGER = new ClientLogger(ScriptPackagesImpl.class);

    private final ScriptPackagesClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public ScriptPackagesImpl(ScriptPackagesClient innerClient,
        com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ScriptPackage> list(String resourceGroupName, String privateCloudName) {
        PagedIterable<ScriptPackageInner> inner = this.serviceClient().list(resourceGroupName, privateCloudName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ScriptPackageImpl(inner1, this.manager()));
    }

    public PagedIterable<ScriptPackage> list(String resourceGroupName, String privateCloudName, Context context) {
        PagedIterable<ScriptPackageInner> inner
            = this.serviceClient().list(resourceGroupName, privateCloudName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ScriptPackageImpl(inner1, this.manager()));
    }

    public Response<ScriptPackage> getWithResponse(String resourceGroupName, String privateCloudName,
        String scriptPackageName, Context context) {
        Response<ScriptPackageInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, privateCloudName, scriptPackageName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ScriptPackageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ScriptPackage get(String resourceGroupName, String privateCloudName, String scriptPackageName) {
        ScriptPackageInner inner = this.serviceClient().get(resourceGroupName, privateCloudName, scriptPackageName);
        if (inner != null) {
            return new ScriptPackageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ScriptPackagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }
}
