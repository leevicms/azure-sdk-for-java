// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.ExpressRouteAuthorizationInner;
import com.azure.resourcemanager.avs.models.ExpressRouteAuthorization;
import com.azure.resourcemanager.avs.models.ExpressRouteAuthorizationProvisioningState;

public final class ExpressRouteAuthorizationImpl
    implements ExpressRouteAuthorization, ExpressRouteAuthorization.Definition, ExpressRouteAuthorization.Update {
    private ExpressRouteAuthorizationInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ExpressRouteAuthorizationProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String expressRouteAuthorizationId() {
        return this.innerModel().expressRouteAuthorizationId();
    }

    public String expressRouteAuthorizationKey() {
        return this.innerModel().expressRouteAuthorizationKey();
    }

    public String expressRouteId() {
        return this.innerModel().expressRouteId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ExpressRouteAuthorizationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateCloudName;

    private String authorizationName;

    public ExpressRouteAuthorizationImpl withExistingPrivateCloud(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    public ExpressRouteAuthorization create() {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizations()
            .createOrUpdate(resourceGroupName, privateCloudName, authorizationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ExpressRouteAuthorization create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizations()
            .createOrUpdate(resourceGroupName, privateCloudName, authorizationName, this.innerModel(), context);
        return this;
    }

    ExpressRouteAuthorizationImpl(String name, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = new ExpressRouteAuthorizationInner();
        this.serviceManager = serviceManager;
        this.authorizationName = name;
    }

    public ExpressRouteAuthorizationImpl update() {
        return this;
    }

    public ExpressRouteAuthorization apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizations()
            .createOrUpdate(resourceGroupName, privateCloudName, authorizationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ExpressRouteAuthorization apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizations()
            .createOrUpdate(resourceGroupName, privateCloudName, authorizationName, this.innerModel(), context);
        return this;
    }

    ExpressRouteAuthorizationImpl(ExpressRouteAuthorizationInner innerObject,
        com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateCloudName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateClouds");
        this.authorizationName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "authorizations");
    }

    public ExpressRouteAuthorization refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizations()
            .getWithResponse(resourceGroupName, privateCloudName, authorizationName, Context.NONE)
            .getValue();
        return this;
    }

    public ExpressRouteAuthorization refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizations()
            .getWithResponse(resourceGroupName, privateCloudName, authorizationName, context)
            .getValue();
        return this;
    }

    public ExpressRouteAuthorizationImpl withExpressRouteId(String expressRouteId) {
        this.innerModel().withExpressRouteId(expressRouteId);
        return this;
    }
}
