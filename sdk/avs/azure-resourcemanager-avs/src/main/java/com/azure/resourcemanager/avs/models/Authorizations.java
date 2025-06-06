// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Authorizations.
 */
public interface Authorizations {
    /**
     * List ExpressRouteAuthorization resources by PrivateCloud.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ExpressRouteAuthorization list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ExpressRouteAuthorization> list(String resourceGroupName, String privateCloudName);

    /**
     * List ExpressRouteAuthorization resources by PrivateCloud.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ExpressRouteAuthorization list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ExpressRouteAuthorization> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get a ExpressRouteAuthorization.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ExpressRouteAuthorization along with {@link Response}.
     */
    Response<ExpressRouteAuthorization> getWithResponse(String resourceGroupName, String privateCloudName,
        String authorizationName, Context context);

    /**
     * Get a ExpressRouteAuthorization.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ExpressRouteAuthorization.
     */
    ExpressRouteAuthorization get(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete a ExpressRouteAuthorization.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete a ExpressRouteAuthorization.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String privateCloudName, String authorizationName, Context context);

    /**
     * Get a ExpressRouteAuthorization.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ExpressRouteAuthorization along with {@link Response}.
     */
    ExpressRouteAuthorization getById(String id);

    /**
     * Get a ExpressRouteAuthorization.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ExpressRouteAuthorization along with {@link Response}.
     */
    Response<ExpressRouteAuthorization> getByIdWithResponse(String id, Context context);

    /**
     * Delete a ExpressRouteAuthorization.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a ExpressRouteAuthorization.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ExpressRouteAuthorization resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ExpressRouteAuthorization definition.
     */
    ExpressRouteAuthorization.DefinitionStages.Blank define(String name);
}
