// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyRestrictionContractInner;

/**
 * An immutable client-side representation of PolicyRestrictionContract.
 */
public interface PolicyRestrictionContract {
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
     * Gets the scope property: Path to the policy document.
     * 
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the requireBase property: Indicates if base policy should be enforced for the policy document.
     * 
     * @return the requireBase value.
     */
    PolicyRestrictionRequireBase requireBase();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.PolicyRestrictionContractInner object.
     * 
     * @return the inner object.
     */
    PolicyRestrictionContractInner innerModel();

    /**
     * The entirety of the PolicyRestrictionContract definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The PolicyRestrictionContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the PolicyRestrictionContract definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the PolicyRestrictionContract definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }

        /**
         * The stage of the PolicyRestrictionContract definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithScope, DefinitionStages.WithRequireBase, DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            PolicyRestrictionContract create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PolicyRestrictionContract create(Context context);
        }

        /**
         * The stage of the PolicyRestrictionContract definition allowing to specify scope.
         */
        interface WithScope {
            /**
             * Specifies the scope property: Path to the policy document..
             * 
             * @param scope Path to the policy document.
             * @return the next definition stage.
             */
            WithCreate withScope(String scope);
        }

        /**
         * The stage of the PolicyRestrictionContract definition allowing to specify requireBase.
         */
        interface WithRequireBase {
            /**
             * Specifies the requireBase property: Indicates if base policy should be enforced for the policy document..
             * 
             * @param requireBase Indicates if base policy should be enforced for the policy document.
             * @return the next definition stage.
             */
            WithCreate withRequireBase(PolicyRestrictionRequireBase requireBase);
        }

        /**
         * The stage of the PolicyRestrictionContract definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             * 
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             * entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }

    /**
     * Begins update for the PolicyRestrictionContract resource.
     * 
     * @return the stage of resource update.
     */
    PolicyRestrictionContract.Update update();

    /**
     * The template for PolicyRestrictionContract update.
     */
    interface Update extends UpdateStages.WithScope, UpdateStages.WithRequireBase, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        PolicyRestrictionContract apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PolicyRestrictionContract apply(Context context);
    }

    /**
     * The PolicyRestrictionContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the PolicyRestrictionContract update allowing to specify scope.
         */
        interface WithScope {
            /**
             * Specifies the scope property: Path to the policy document..
             * 
             * @param scope Path to the policy document.
             * @return the next definition stage.
             */
            Update withScope(String scope);
        }

        /**
         * The stage of the PolicyRestrictionContract update allowing to specify requireBase.
         */
        interface WithRequireBase {
            /**
             * Specifies the requireBase property: Indicates if base policy should be enforced for the policy document..
             * 
             * @param requireBase Indicates if base policy should be enforced for the policy document.
             * @return the next definition stage.
             */
            Update withRequireBase(PolicyRestrictionRequireBase requireBase);
        }

        /**
         * The stage of the PolicyRestrictionContract update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             * 
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             * the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    PolicyRestrictionContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PolicyRestrictionContract refresh(Context context);
}
