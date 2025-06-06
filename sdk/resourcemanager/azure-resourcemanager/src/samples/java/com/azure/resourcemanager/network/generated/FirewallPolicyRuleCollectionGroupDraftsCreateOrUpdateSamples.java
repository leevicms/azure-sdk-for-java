// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.FirewallPolicyRuleCollectionGroupDraftInner;
import com.azure.resourcemanager.network.models.FirewallPolicyFilterRuleCollection;
import com.azure.resourcemanager.network.models.FirewallPolicyFilterRuleCollectionAction;
import com.azure.resourcemanager.network.models.FirewallPolicyFilterRuleCollectionActionType;
import com.azure.resourcemanager.network.models.FirewallPolicyRuleNetworkProtocol;
import com.azure.resourcemanager.network.models.NetworkRule;
import java.util.Arrays;

/**
 * Samples for FirewallPolicyRuleCollectionGroupDrafts CreateOrUpdate.
 */
public final class FirewallPolicyRuleCollectionGroupDraftsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * FirewallPolicyRuleCollectionGroupDraftPut.json
     */
    /**
     * Sample code: create or update rule collection group draft.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateRuleCollectionGroupDraft(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroupDrafts()
            .createOrUpdateWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1",
                new FirewallPolicyRuleCollectionGroupDraftInner().withPriority(100)
                    .withRuleCollections(Arrays
                        .asList(new FirewallPolicyFilterRuleCollection().withName("Example-Filter-Rule-Collection")
                            .withPriority(100)
                            .withAction(new FirewallPolicyFilterRuleCollectionAction()
                                .withType(FirewallPolicyFilterRuleCollectionActionType.DENY))
                            .withRules(Arrays.asList(new NetworkRule().withName("network-rule1")
                                .withIpProtocols(Arrays.asList(FirewallPolicyRuleNetworkProtocol.TCP))
                                .withSourceAddresses(Arrays.asList("10.1.25.0/24"))
                                .withDestinationAddresses(Arrays.asList("*"))
                                .withDestinationPorts(Arrays.asList("*")))))),
                com.azure.core.util.Context.NONE);
    }
}
