// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.avs.fluent.models.PureStoragePolicyInner;

/**
 * An instance of this class provides access to all the operations defined in PureStoragePoliciesClient.
 */
public interface PureStoragePoliciesClient {
    /**
     * List PureStoragePolicy resources by PrivateCloud.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a PureStoragePolicy list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PureStoragePolicyInner> list(String resourceGroupName, String privateCloudName);

    /**
     * List PureStoragePolicy resources by PrivateCloud.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a PureStoragePolicy list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PureStoragePolicyInner> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a PureStoragePolicy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PureStoragePolicyInner> getWithResponse(String resourceGroupName, String privateCloudName,
        String storagePolicyName, Context context);

    /**
     * Get a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a PureStoragePolicy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PureStoragePolicyInner get(String resourceGroupName, String privateCloudName, String storagePolicyName);

    /**
     * Create a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an instance describing a Pure Storage Policy Based Management
     * policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PureStoragePolicyInner>, PureStoragePolicyInner> beginCreateOrUpdate(String resourceGroupName,
        String privateCloudName, String storagePolicyName, PureStoragePolicyInner resource);

    /**
     * Create a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an instance describing a Pure Storage Policy Based Management
     * policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PureStoragePolicyInner>, PureStoragePolicyInner> beginCreateOrUpdate(String resourceGroupName,
        String privateCloudName, String storagePolicyName, PureStoragePolicyInner resource, Context context);

    /**
     * Create a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance describing a Pure Storage Policy Based Management policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PureStoragePolicyInner createOrUpdate(String resourceGroupName, String privateCloudName, String storagePolicyName,
        PureStoragePolicyInner resource);

    /**
     * Create a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance describing a Pure Storage Policy Based Management policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PureStoragePolicyInner createOrUpdate(String resourceGroupName, String privateCloudName, String storagePolicyName,
        PureStoragePolicyInner resource, Context context);

    /**
     * Delete a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String privateCloudName,
        String storagePolicyName);

    /**
     * Delete a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String privateCloudName,
        String storagePolicyName, Context context);

    /**
     * Delete a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String storagePolicyName);

    /**
     * Delete a PureStoragePolicy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param storagePolicyName Name of the storage policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String storagePolicyName, Context context);
}
