// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.NamespaceTopicInner;

/**
 * An immutable client-side representation of NamespaceTopic.
 */
public interface NamespaceTopic {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: The system metadata relating to the Event Grid resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the namespace topic.
     * 
     * @return the provisioningState value.
     */
    NamespaceTopicProvisioningState provisioningState();

    /**
     * Gets the publisherType property: Publisher type of the namespace topic.
     * 
     * @return the publisherType value.
     */
    PublisherType publisherType();

    /**
     * Gets the inputSchema property: This determines the format that is expected for incoming events published to the
     * topic.
     * 
     * @return the inputSchema value.
     */
    EventInputSchema inputSchema();

    /**
     * Gets the eventRetentionInDays property: Event retention for the namespace topic expressed in days. The property
     * default value is 1 day.
     * Min event retention duration value is 1 day and max event retention duration value is 1 day.
     * 
     * @return the eventRetentionInDays value.
     */
    Integer eventRetentionInDays();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.NamespaceTopicInner object.
     * 
     * @return the inner object.
     */
    NamespaceTopicInner innerModel();

    /**
     * The entirety of the NamespaceTopic definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The NamespaceTopic definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NamespaceTopic definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the NamespaceTopic definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             * 
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @param namespaceName Name of the namespace.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the NamespaceTopic definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPublisherType, DefinitionStages.WithInputSchema,
            DefinitionStages.WithEventRetentionInDays {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NamespaceTopic create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NamespaceTopic create(Context context);
        }

        /**
         * The stage of the NamespaceTopic definition allowing to specify publisherType.
         */
        interface WithPublisherType {
            /**
             * Specifies the publisherType property: Publisher type of the namespace topic..
             * 
             * @param publisherType Publisher type of the namespace topic.
             * @return the next definition stage.
             */
            WithCreate withPublisherType(PublisherType publisherType);
        }

        /**
         * The stage of the NamespaceTopic definition allowing to specify inputSchema.
         */
        interface WithInputSchema {
            /**
             * Specifies the inputSchema property: This determines the format that is expected for incoming events
             * published to the topic..
             * 
             * @param inputSchema This determines the format that is expected for incoming events published to the
             * topic.
             * @return the next definition stage.
             */
            WithCreate withInputSchema(EventInputSchema inputSchema);
        }

        /**
         * The stage of the NamespaceTopic definition allowing to specify eventRetentionInDays.
         */
        interface WithEventRetentionInDays {
            /**
             * Specifies the eventRetentionInDays property: Event retention for the namespace topic expressed in days.
             * The property default value is 1 day.
             * Min event retention duration value is 1 day and max event retention duration value is 1 day..
             * 
             * @param eventRetentionInDays Event retention for the namespace topic expressed in days. The property
             * default value is 1 day.
             * Min event retention duration value is 1 day and max event retention duration value is 1 day.
             * @return the next definition stage.
             */
            WithCreate withEventRetentionInDays(Integer eventRetentionInDays);
        }
    }

    /**
     * Begins update for the NamespaceTopic resource.
     * 
     * @return the stage of resource update.
     */
    NamespaceTopic.Update update();

    /**
     * The template for NamespaceTopic update.
     */
    interface Update extends UpdateStages.WithEventRetentionInDays {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NamespaceTopic apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NamespaceTopic apply(Context context);
    }

    /**
     * The NamespaceTopic update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NamespaceTopic update allowing to specify eventRetentionInDays.
         */
        interface WithEventRetentionInDays {
            /**
             * Specifies the eventRetentionInDays property: Event retention for the namespace topic expressed in days.
             * The property default value is 1 day.
             * Min event retention duration value is 1 day and max event retention duration value is 1 day..
             * 
             * @param eventRetentionInDays Event retention for the namespace topic expressed in days. The property
             * default value is 1 day.
             * Min event retention duration value is 1 day and max event retention duration value is 1 day.
             * @return the next definition stage.
             */
            Update withEventRetentionInDays(Integer eventRetentionInDays);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    NamespaceTopic refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NamespaceTopic refresh(Context context);

    /**
     * List keys for a namespace topic.
     * 
     * List the two keys used to publish to a namespace topic.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic along with {@link Response}.
     */
    Response<TopicSharedAccessKeys> listSharedAccessKeysWithResponse(Context context);

    /**
     * List keys for a namespace topic.
     * 
     * List the two keys used to publish to a namespace topic.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys listSharedAccessKeys();

    /**
     * Regenerate key for a namespace topic.
     * 
     * Regenerate a shared access key for a namespace topic.
     * 
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate key for a namespace topic.
     * 
     * Regenerate a shared access key for a namespace topic.
     * 
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest, Context context);
}
