// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.IndexRecommendationResourceInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ImpactRecord;
import com.azure.resourcemanager.postgresqlflexibleserver.models.IndexRecommendationDetails;
import com.azure.resourcemanager.postgresqlflexibleserver.models.IndexRecommendationResource;
import com.azure.resourcemanager.postgresqlflexibleserver.models.IndexRecommendationResourcePropertiesAnalyzedWorkload;
import com.azure.resourcemanager.postgresqlflexibleserver.models.IndexRecommendationResourcePropertiesImplementationDetails;
import com.azure.resourcemanager.postgresqlflexibleserver.models.RecommendationTypeEnum;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class IndexRecommendationResourceImpl implements IndexRecommendationResource {
    private IndexRecommendationResourceInner innerObject;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    IndexRecommendationResourceImpl(IndexRecommendationResourceInner innerObject,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime initialRecommendedTime() {
        return this.innerModel().initialRecommendedTime();
    }

    public OffsetDateTime lastRecommendedTime() {
        return this.innerModel().lastRecommendedTime();
    }

    public Integer timesRecommended() {
        return this.innerModel().timesRecommended();
    }

    public List<Long> improvedQueryIds() {
        List<Long> inner = this.innerModel().improvedQueryIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String recommendationReason() {
        return this.innerModel().recommendationReason();
    }

    public RecommendationTypeEnum recommendationType() {
        return this.innerModel().recommendationType();
    }

    public IndexRecommendationResourcePropertiesImplementationDetails implementationDetails() {
        return this.innerModel().implementationDetails();
    }

    public IndexRecommendationResourcePropertiesAnalyzedWorkload analyzedWorkload() {
        return this.innerModel().analyzedWorkload();
    }

    public List<ImpactRecord> estimatedImpact() {
        List<ImpactRecord> inner = this.innerModel().estimatedImpact();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IndexRecommendationDetails details() {
        return this.innerModel().details();
    }

    public IndexRecommendationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
