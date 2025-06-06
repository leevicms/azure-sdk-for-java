// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.PolicyModelInner;

/**
 * An instance of this class provides access to all the operations defined in PoliciesClient.
 */
public interface PoliciesClient {
    /**
     * Gets the details of the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyModelInner> getWithResponse(String resourceGroupName, String vaultName, String policyName,
        Context context);

    /**
     * Gets the details of the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyModelInner get(String resourceGroupName, String vaultName, String policyName);

    /**
     * Creates the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @param resource Policy model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of policy model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PolicyModelInner>, PolicyModelInner> beginCreate(String resourceGroupName, String vaultName,
        String policyName, PolicyModelInner resource);

    /**
     * Creates the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @param resource Policy model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of policy model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PolicyModelInner>, PolicyModelInner> beginCreate(String resourceGroupName, String vaultName,
        String policyName, PolicyModelInner resource, Context context);

    /**
     * Creates the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @param resource Policy model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyModelInner create(String resourceGroupName, String vaultName, String policyName, PolicyModelInner resource);

    /**
     * Creates the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @param resource Policy model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyModelInner create(String resourceGroupName, String vaultName, String policyName, PolicyModelInner resource,
        Context context);

    /**
     * Removes the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vaultName, String policyName);

    /**
     * Removes the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vaultName, String policyName,
        Context context);

    /**
     * Removes the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vaultName, String policyName);

    /**
     * Removes the policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param policyName The policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vaultName, String policyName, Context context);

    /**
     * Gets the list of policies in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of policies in the given vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyModelInner> list(String resourceGroupName, String vaultName);

    /**
     * Gets the list of policies in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of policies in the given vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyModelInner> list(String resourceGroupName, String vaultName, Context context);
}
