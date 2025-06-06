// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SystemVersions.
 */
public interface SystemVersions {
    /**
     * Get a SystemVersion.
     * 
     * @param location The name of the Azure region.
     * @param systemversionname SystemVersion name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SystemVersion along with {@link Response}.
     */
    Response<SystemVersion> getWithResponse(String location, String systemversionname, Context context);

    /**
     * Get a SystemVersion.
     * 
     * @param location The name of the Azure region.
     * @param systemversionname SystemVersion name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SystemVersion.
     */
    SystemVersion get(String location, String systemversionname);

    /**
     * List SystemVersion resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SystemVersion list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SystemVersion> listByLocation(String location);

    /**
     * List SystemVersion resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SystemVersion list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SystemVersion> listByLocation(String location, Context context);
}
