// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.ServiceEndpointPolicyInner;
import com.azure.resourcemanager.network.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.Delegation;
import com.azure.resourcemanager.network.models.IpamPoolPrefixAllocation;
import com.azure.resourcemanager.network.models.ServiceEndpointPropertiesFormat;
import com.azure.resourcemanager.network.models.VirtualNetworkBgpCommunities;
import com.azure.resourcemanager.network.models.VirtualNetworkEncryption;
import com.azure.resourcemanager.network.models.VirtualNetworkEncryptionEnforcement;
import java.util.Arrays;

/**
 * Samples for VirtualNetworks CreateOrUpdate.
 */
public final class VirtualNetworksCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/VirtualNetworkCreateSubnet.
     * json
     */
    /**
     * Sample code: Create virtual network with subnet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetworkWithSubnet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("rg1", "test-vnet",
                new VirtualNetworkInner().withLocation("eastus")
                    .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                    .withSubnets(Arrays.asList(new SubnetInner().withName("test-1").withAddressPrefix("10.0.0.0/24"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkCreateWithIpamPool.json
     */
    /**
     * Sample code: Create virtual network with ipamPool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetworkWithIpamPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("rg1", "test-vnet", new VirtualNetworkInner().withLocation("eastus")
                .withAddressSpace(new AddressSpace().withIpamPoolPrefixAllocations(
                    Arrays.asList(new IpamPoolPrefixAllocation().withNumberOfIpAddresses("65536")
                        .withId(
                            "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkManagers/nm1/ipamPools/testIpamPool"))))
                .withSubnets(Arrays.asList(new SubnetInner().withName("test-1")
                    .withIpamPoolPrefixAllocations(Arrays.asList(new IpamPoolPrefixAllocation()
                        .withNumberOfIpAddresses("80")
                        .withId(
                            "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkManagers/nm1/ipamPools/testIpamPool"))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkCreateWithBgpCommunities.json
     */
    /**
     * Sample code: Create virtual network with Bgp Communities.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetworkWithBgpCommunities(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("rg1", "test-vnet",
                new VirtualNetworkInner().withLocation("eastus")
                    .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                    .withSubnets(Arrays.asList(new SubnetInner().withName("test-1").withAddressPrefix("10.0.0.0/24")))
                    .withBgpCommunities(new VirtualNetworkBgpCommunities().withVirtualNetworkCommunity("12076:20000")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkCreateSubnetWithAddressPrefixes.json
     */
    /**
     * Sample code: Create virtual network with subnet containing address prefixes.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createVirtualNetworkWithSubnetContainingAddressPrefixes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("rg1", "test-vnet",
                new VirtualNetworkInner().withLocation("eastus")
                    .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                    .withSubnets(Arrays.asList(new SubnetInner().withName("test-2")
                        .withAddressPrefixes(Arrays.asList("10.0.0.0/28", "10.0.1.0/28")))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkCreateSubnetWithDelegation.json
     */
    /**
     * Sample code: Create virtual network with delegated subnets.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetworkWithDelegatedSubnets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("rg1", "test-vnet", new VirtualNetworkInner().withLocation("westcentralus")
                .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                .withSubnets(Arrays.asList(new SubnetInner().withName("test-1")
                    .withAddressPrefix("10.0.0.0/24")
                    .withDelegations(Arrays.asList(
                        new Delegation().withName("myDelegation").withServiceName("Microsoft.Sql/managedInstances"))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkCreateWithEncryption.json
     */
    /**
     * Sample code: Create virtual network with encryption.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetworkWithEncryption(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("rg1", "test-vnet",
                new VirtualNetworkInner().withLocation("eastus")
                    .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                    .withSubnets(Arrays.asList(new SubnetInner().withName("test-1").withAddressPrefix("10.0.0.0/24")))
                    .withEncryption(new VirtualNetworkEncryption().withEnabled(true)
                        .withEnforcement(VirtualNetworkEncryptionEnforcement.ALLOW_UNENCRYPTED)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/VirtualNetworkCreate.json
     */
    /**
     * Sample code: Create virtual network.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetwork(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("rg1", "test-vnet",
                new VirtualNetworkInner().withLocation("eastus")
                    .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                    .withFlowTimeoutInMinutes(10),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkCreateServiceEndpointPolicy.json
     */
    /**
     * Sample code: Create virtual network with service endpoints and service endpoint policy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetworkWithServiceEndpointsAndServiceEndpointPolicy(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("vnetTest", "vnet1", new VirtualNetworkInner().withLocation("eastus2euap")
                .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                .withSubnets(Arrays.asList(new SubnetInner().withName("test-1")
                    .withAddressPrefix("10.0.0.0/16")
                    .withServiceEndpoints(
                        Arrays.asList(new ServiceEndpointPropertiesFormat().withService("Microsoft.Storage")))
                    .withServiceEndpointPolicies(Arrays.asList(new ServiceEndpointPolicyInner().withId(
                        "/subscriptions/subid/resourceGroups/vnetTest/providers/Microsoft.Network/serviceEndpointPolicies/ServiceEndpointPolicy1"))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkCreateServiceEndpoints.json
     */
    /**
     * Sample code: Create virtual network with service endpoints.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createVirtualNetworkWithServiceEndpoints(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworks()
            .createOrUpdate("vnetTest", "vnet1",
                new VirtualNetworkInner().withLocation("eastus")
                    .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                    .withSubnets(
                        Arrays.asList(new SubnetInner().withName("test-1")
                            .withAddressPrefix("10.0.0.0/16")
                            .withServiceEndpoints(Arrays
                                .asList(new ServiceEndpointPropertiesFormat().withService("Microsoft.Storage"))))),
                com.azure.core.util.Context.NONE);
    }
}
