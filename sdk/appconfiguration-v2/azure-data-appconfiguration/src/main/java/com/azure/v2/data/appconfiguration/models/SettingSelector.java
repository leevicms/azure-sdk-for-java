// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.data.appconfiguration.models;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import io.clientcore.core.http.models.HttpMatchConditions;
import io.clientcore.core.utils.CoreUtils;

/**
 * A set of options for selecting configuration settings from App Configuration service.
 *
 * <ul>
 * <li>
 * Providing {@link #getLabelFilter() labelFilter} will filter {@link ConfigurationSetting ConfigurationSettings} that
 * match any label name in conjunction with the keys that are passed in to the service request.
 * </li>
 * <li>
 * Providing {@link #getAcceptDateTime() acceptDateTime} will return the representation of matching {@link
 * ConfigurationSetting} at that given {@link OffsetDateTime}.
 * </li>
 * <li>
 * Providing {@link #getFields() fields} will populate only those {@link ConfigurationSetting} fields in the response.
 * By default, all of the fields are returned.
 * </li>
 * </ul>
 *
 */
public class SettingSelector {
    private String keyFilter;
    private String labelFilter;
    private List<String> tagsFilter;
    private SettingFields[] fields;
    private String acceptDatetime;

    private List<HttpMatchConditions> matchConditions;

    /**
     * Creates a setting selector that will populate responses with all of the {@link ConfigurationSetting
     * ConfigurationSetting's} properties and select all {@link ConfigurationSetting#getKey() keys}.
     */
    public SettingSelector() {
    }

    /**
     * Gets the expressions to filter {@link ConfigurationSetting#getKey() keys} on for the request.
     *
     * <p>See <a href="https://docs.microsoft.com/azure/azure-app-configuration/rest-api-key-value#supported-filters">Filtering</a>
     * for more information about these supported filters.</p>
     *
     * @return The expressions to filter ConfigurationSetting keys on.
     */
    public String getKeyFilter() {
        return keyFilter;
    }

    /**
     * Sets the expressions to filter {@link ConfigurationSetting#getKey() keys} on for the request.
     *
     * <p>See <a href="https://docs.microsoft.com/azure/azure-app-configuration/rest-api-key-value#supported-filters">Filtering</a>
     * for more information about these supported filters.</p>
     *
     * @param keyFilter The expressions to filter ConfigurationSetting keys on.
     * @return The updated SettingSelector object
     */
    public SettingSelector setKeyFilter(String keyFilter) {
        this.keyFilter = keyFilter;
        return this;
    }

    /**
     * Gets the labels used to filter settings based on their {@link ConfigurationSetting#getLabel() label} in the
     * service.
     *
     * <p>See <a href="https://docs.microsoft.com/azure/azure-app-configuration/rest-api-key-value#supported-filters">Filtering</a>
     * for more information about these supported filters.</p>
     *
     * @return labels The labels used to filter GET requests from the service.
     */
    public String getLabelFilter() {
        return labelFilter;
    }

    /**
     * Sets the expression to filter {@link ConfigurationSetting#getLabel() labels} on for the request.
     *
     * <p>See <a href="https://docs.microsoft.com/azure/azure-app-configuration/rest-api-key-value#supported-filters">Filtering</a>
     * for more information about these supported filters.</p>
     *
     * @param labelFilter The expressions to filter ConfigurationSetting labels on.
     *
     * @return SettingSelector The updated SettingSelector object.
     */
    public SettingSelector setLabelFilter(String labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }

    /**
     * Gets the date time for the request query. When the query is performed, if {@code acceptDateTime} is set, the
     * {@link ConfigurationSetting#getValue() configuration setting value} at that point in time is returned. Otherwise,
     * the current value is returned.
     *
     * @return Gets the currently set datetime in {@link DateTimeFormatter#RFC_1123_DATE_TIME} format.
     */
    public String getAcceptDateTime() {
        return this.acceptDatetime;
    }

    /**
     * If set, then configuration setting values will be retrieved as they existed at the provided datetime. Otherwise,
     * the current values are returned.
     *
     * @param datetime The value of the configuration setting at that given {@link OffsetDateTime}.
     * @return The updated SettingSelector object.
     */
    public SettingSelector setAcceptDatetime(OffsetDateTime datetime) {
        this.acceptDatetime
            = datetime == null ? null : DateTimeFormatter.RFC_1123_DATE_TIME.toFormat().format(datetime);
        return this;
    }

    /**
     * Gets the fields on {@link ConfigurationSetting} to return from the GET request. If none are set, the service
     * returns the ConfigurationSettings with all of their fields populated.
     *
     * @return The set of {@link ConfigurationSetting} fields to return for a GET request.
     */
    public SettingFields[] getFields() {
        return fields == null ? new SettingFields[0] : CoreUtils.arrayCopy(fields);
    }

    /**
     * Sets fields that will be returned in the response corresponding to properties in {@link ConfigurationSetting}. If
     * none are set, the service returns ConfigurationSettings with all of their fields populated.
     *
     * @param fields The fields to select for the query response. If none are set, the service will return the
     * ConfigurationSettings with a default set of properties.
     *
     * @return The updated SettingSelector object.
     */
    public SettingSelector setFields(SettingFields... fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Gets the tags used to filter settings based on their {@link ConfigurationSetting#getTags() tags} in the
     * service.
     *
     * <p>See <a href="https://docs.microsoft.com/azure/azure-app-configuration/rest-api-key-value#supported-filters">Filtering</a>
     * for more information about these supported filters.</p>
     *
     * @return tagsFilter The tags used to filter GET requests from the service.
     */
    public List<String> getTagsFilter() {
        return tagsFilter;
    }

    /**
     * Sets the expression to filter {@link ConfigurationSetting#getTags() tags} on for the request.
     *
     * <p>See <a href="https://docs.microsoft.com/azure/azure-app-configuration/rest-api-key-value#supported-filters">Filtering</a>
     * for more information about these supported filters.</p>
     *
     * @param tagsFilter The expressions to filter ConfigurationSetting tags on.
     *
     * @return SettingSelector The updated SettingSelector object.
     */
    public SettingSelector setTagsFilter(List<String> tagsFilter) {
        this.tagsFilter = tagsFilter;
        return this;
    }

    /**
     * Get the match conditions
     *
     * @return The match conditions
     */
    public List<HttpMatchConditions> getMatchConditions() {
        return matchConditions;
    }

    /**
     * Set the match conditions
     *
     * @param matchConditions The match conditions
     * @return The updated SettingSelector object.
     */
    public SettingSelector setMatchConditions(List<HttpMatchConditions> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    @Override
    public String toString() {
        String fields;
        if (CoreUtils.isNullOrEmpty(this.fields)) {
            fields = "ALL_FIELDS";
        } else {
            // Convert the fields to a string representation
            StringBuilder fieldsBuilder = new StringBuilder();
            for (SettingFields field : this.fields) {
                fieldsBuilder.append(field.toString()).append(", ");
            }
            // Remove the last comma and space
            if (fieldsBuilder.length() > 0) {
                fieldsBuilder.setLength(fieldsBuilder.length() - 2);
            }
            fields = fieldsBuilder.toString();
        }

        return String.format("SettingSelector(keyFilter=%s, labelFilter=%s, acceptDateTime=%s, fields=%s)",
            this.keyFilter, this.labelFilter, this.acceptDatetime, fields);
    }
}
