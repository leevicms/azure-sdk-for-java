// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.DeploymentPreflightsClient;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.DeploymentPreflightModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.DeploymentPreflightModel;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.DeploymentPreflights;

public final class DeploymentPreflightsImpl implements DeploymentPreflights {
    private static final ClientLogger LOGGER = new ClientLogger(DeploymentPreflightsImpl.class);

    private final DeploymentPreflightsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager;

    public DeploymentPreflightsImpl(DeploymentPreflightsClient innerClient,
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DeploymentPreflightModel> postWithResponse(String resourceGroupName, String deploymentId,
        DeploymentPreflightModelInner body, Context context) {
        Response<DeploymentPreflightModelInner> inner
            = this.serviceClient().postWithResponse(resourceGroupName, deploymentId, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DeploymentPreflightModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeploymentPreflightModel post(String resourceGroupName, String deploymentId) {
        DeploymentPreflightModelInner inner = this.serviceClient().post(resourceGroupName, deploymentId);
        if (inner != null) {
            return new DeploymentPreflightModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DeploymentPreflightsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager() {
        return this.serviceManager;
    }
}
