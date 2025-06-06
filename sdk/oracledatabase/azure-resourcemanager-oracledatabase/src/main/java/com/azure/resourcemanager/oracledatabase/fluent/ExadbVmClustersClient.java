// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.oracledatabase.fluent.models.ExadbVmClusterInner;
import com.azure.resourcemanager.oracledatabase.models.ExadbVmClusterUpdate;
import com.azure.resourcemanager.oracledatabase.models.RemoveVirtualMachineFromExadbVmClusterDetails;

/**
 * An instance of this class provides access to all the operations defined in ExadbVmClustersClient.
 */
public interface ExadbVmClustersClient {
    /**
     * List ExadbVmCluster resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ExadbVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExadbVmClusterInner> list();

    /**
     * List ExadbVmCluster resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ExadbVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExadbVmClusterInner> list(Context context);

    /**
     * Create a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExadbVmClusterInner>, ExadbVmClusterInner> beginCreateOrUpdate(String resourceGroupName,
        String exadbVmClusterName, ExadbVmClusterInner resource);

    /**
     * Create a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExadbVmClusterInner>, ExadbVmClusterInner> beginCreateOrUpdate(String resourceGroupName,
        String exadbVmClusterName, ExadbVmClusterInner resource, Context context);

    /**
     * Create a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExadbVmClusterInner createOrUpdate(String resourceGroupName, String exadbVmClusterName,
        ExadbVmClusterInner resource);

    /**
     * Create a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExadbVmClusterInner createOrUpdate(String resourceGroupName, String exadbVmClusterName,
        ExadbVmClusterInner resource, Context context);

    /**
     * Get a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ExadbVmCluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExadbVmClusterInner> getByResourceGroupWithResponse(String resourceGroupName, String exadbVmClusterName,
        Context context);

    /**
     * Get a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ExadbVmCluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExadbVmClusterInner getByResourceGroup(String resourceGroupName, String exadbVmClusterName);

    /**
     * Update a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExadbVmClusterInner>, ExadbVmClusterInner> beginUpdate(String resourceGroupName,
        String exadbVmClusterName, ExadbVmClusterUpdate properties);

    /**
     * Update a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExadbVmClusterInner>, ExadbVmClusterInner> beginUpdate(String resourceGroupName,
        String exadbVmClusterName, ExadbVmClusterUpdate properties, Context context);

    /**
     * Update a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExadbVmClusterInner update(String resourceGroupName, String exadbVmClusterName, ExadbVmClusterUpdate properties);

    /**
     * Update a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exadbVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExadbVmClusterInner update(String resourceGroupName, String exadbVmClusterName, ExadbVmClusterUpdate properties,
        Context context);

    /**
     * Delete a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String exadbVmClusterName);

    /**
     * Delete a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String exadbVmClusterName,
        Context context);

    /**
     * Delete a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String exadbVmClusterName);

    /**
     * Delete a ExadbVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String exadbVmClusterName, Context context);

    /**
     * List ExadbVmCluster resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ExadbVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExadbVmClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * List ExadbVmCluster resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ExadbVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExadbVmClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExadbVmClusterInner>, ExadbVmClusterInner> beginRemoveVms(String resourceGroupName,
        String exadbVmClusterName, RemoveVirtualMachineFromExadbVmClusterDetails body);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExadbVmClusterInner>, ExadbVmClusterInner> beginRemoveVms(String resourceGroupName,
        String exadbVmClusterName, RemoveVirtualMachineFromExadbVmClusterDetails body, Context context);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExadbVmClusterInner removeVms(String resourceGroupName, String exadbVmClusterName,
        RemoveVirtualMachineFromExadbVmClusterDetails body);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param exadbVmClusterName The name of the ExadbVmCluster.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExadbVmClusterInner removeVms(String resourceGroupName, String exadbVmClusterName,
        RemoveVirtualMachineFromExadbVmClusterDetails body, Context context);
}
