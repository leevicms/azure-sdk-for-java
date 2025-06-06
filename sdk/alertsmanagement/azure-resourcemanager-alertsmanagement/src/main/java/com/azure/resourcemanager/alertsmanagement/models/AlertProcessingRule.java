// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertProcessingRuleInner;
import java.util.Map;

/**
 * An immutable client-side representation of AlertProcessingRule.
 */
public interface AlertProcessingRule {
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
     * Gets the location property: Resource location.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: Alert processing rule properties.
     * 
     * @return the properties value.
     */
    AlertProcessingRuleProperties properties();

    /**
     * Gets the systemData property: Alert processing rule system data.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.alertsmanagement.fluent.models.AlertProcessingRuleInner object.
     * 
     * @return the inner object.
     */
    AlertProcessingRuleInner innerModel();

    /**
     * The entirety of the AlertProcessingRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The AlertProcessingRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the AlertProcessingRule definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the AlertProcessingRule definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the AlertProcessingRule definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName Resource group name where the resource is created.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the AlertProcessingRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            AlertProcessingRule create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AlertProcessingRule create(Context context);
        }

        /**
         * The stage of the AlertProcessingRule definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the AlertProcessingRule definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Alert processing rule properties..
             * 
             * @param properties Alert processing rule properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(AlertProcessingRuleProperties properties);
        }
    }

    /**
     * Begins update for the AlertProcessingRule resource.
     * 
     * @return the stage of resource update.
     */
    AlertProcessingRule.Update update();

    /**
     * The template for AlertProcessingRule update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithEnabled {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        AlertProcessingRule apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AlertProcessingRule apply(Context context);
    }

    /**
     * The AlertProcessingRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the AlertProcessingRule update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Tags to be updated..
             * 
             * @param tags Tags to be updated.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the AlertProcessingRule update allowing to specify enabled.
         */
        interface WithEnabled {
            /**
             * Specifies the enabled property: Indicates if the given alert processing rule is enabled or disabled..
             * 
             * @param enabled Indicates if the given alert processing rule is enabled or disabled.
             * @return the next definition stage.
             */
            Update withEnabled(Boolean enabled);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    AlertProcessingRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AlertProcessingRule refresh(Context context);
}
