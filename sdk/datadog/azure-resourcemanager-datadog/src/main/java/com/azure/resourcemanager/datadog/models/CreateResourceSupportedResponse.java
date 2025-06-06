// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.resourcemanager.datadog.fluent.models.CreateResourceSupportedResponseInner;

/**
 * An immutable client-side representation of CreateResourceSupportedResponse.
 */
public interface CreateResourceSupportedResponse {
    /**
     * Gets the properties property: Represents the properties of the resource.
     * 
     * @return the properties value.
     */
    CreateResourceSupportedProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.datadog.fluent.models.CreateResourceSupportedResponseInner object.
     * 
     * @return the inner object.
     */
    CreateResourceSupportedResponseInner innerModel();
}
