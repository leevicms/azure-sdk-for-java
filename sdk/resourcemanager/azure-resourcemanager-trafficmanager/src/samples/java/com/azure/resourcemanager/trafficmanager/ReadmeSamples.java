// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.trafficmanager;

import com.azure.core.credential.TokenCredential;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.identity.DefaultAzureCredentialBuilder;

/**
 * Code samples for the README.md
 */
public class ReadmeSamples {

    public void authenticate() {
        // BEGIN: readme-sample-authenticate
        AzureProfile profile = new AzureProfile(AzureCloud.AZURE_PUBLIC_CLOUD);
        TokenCredential credential = new DefaultAzureCredentialBuilder()
            .authorityHost(profile.getEnvironment().getActiveDirectoryEndpoint())
            .build();
        TrafficManager manager = TrafficManager
            .authenticate(credential, profile);
        // END: readme-sample-authenticate
    }
}
