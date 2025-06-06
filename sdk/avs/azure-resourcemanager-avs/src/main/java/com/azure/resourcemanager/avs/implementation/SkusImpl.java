// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.SkusClient;
import com.azure.resourcemanager.avs.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.avs.models.ResourceSku;
import com.azure.resourcemanager.avs.models.Skus;

public final class SkusImpl implements Skus {
    private static final ClientLogger LOGGER = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public SkusImpl(SkusClient innerClient, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceSku> list() {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceSku> list(Context context) {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }
}
