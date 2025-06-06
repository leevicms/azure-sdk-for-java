// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.models.DebugInfo;
import com.azure.search.documents.models.FacetResult;
import com.azure.search.documents.models.QueryAnswerResult;
import com.azure.search.documents.models.SemanticErrorReason;
import com.azure.search.documents.models.SemanticQueryRewritesResultType;
import com.azure.search.documents.models.SemanticSearchResultsType;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Response containing search results from an index.
 */
@Immutable
public final class SearchDocumentsResult implements JsonSerializable<SearchDocumentsResult> {
    /*
     * The total count of results found by the search operation, or null if the count was not requested. If present, the
     * count may be greater than the number of results in this response. This can happen if you use the $top or $skip
     * parameters, or if the query can't return all the requested documents in a single response.
     */
    @Generated
    private Long count;

    /*
     * A value indicating the percentage of the index that was included in the query, or null if minimumCoverage was not
     * specified in the request.
     */
    @Generated
    private Double coverage;

    /*
     * The facet query results for the search operation, organized as a collection of buckets for each faceted field;
     * null if the query did not include any facet expressions.
     */
    @Generated
    private Map<String, List<FacetResult>> facets;

    /*
     * The answers query results for the search operation; null if the answers query parameter was not specified or set
     * to 'none'.
     */
    @Generated
    private List<QueryAnswerResult> answers;

    /*
     * Debug information that applies to the search results as a whole.
     */
    @Generated
    private DebugInfo debugInfo;

    /*
     * Continuation JSON payload returned when the query can't return all the requested results in a single response.
     * You can use this JSON along with @odata.nextLink to formulate another POST Search request to get the next part of
     * the search response.
     */
    @Generated
    private SearchRequest nextPageParameters;

    /*
     * The sequence of results returned by the query.
     */
    @Generated
    private final List<SearchResult> results;

    /*
     * Continuation URL returned when the query can't return all the requested results in a single response. You can use
     * this URL to formulate another GET or POST Search request to get the next part of the search response. Make sure
     * to use the same verb (GET or POST) as the request that produced this response.
     */
    @Generated
    private String nextLink;

    /*
     * Reason that a partial response was returned for a semantic ranking request.
     */
    @Generated
    private SemanticErrorReason semanticPartialResponseReason;

    /*
     * Type of partial response that was returned for a semantic ranking request.
     */
    @Generated
    private SemanticSearchResultsType semanticPartialResponseType;

    /*
     * Type of query rewrite that was used to retrieve documents.
     */
    @Generated
    private SemanticQueryRewritesResultType semanticQueryRewritesResultType;

    /**
     * Creates an instance of SearchDocumentsResult class.
     * 
     * @param results the results value to set.
     */
    @Generated
    public SearchDocumentsResult(List<SearchResult> results) {
        this.results = results;
    }

    /**
     * Get the count property: The total count of results found by the search operation, or null if the count was not
     * requested. If present, the count may be greater than the number of results in this response. This can happen if
     * you use the $top or $skip parameters, or if the query can't return all the requested documents in a single
     * response.
     * 
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the coverage property: A value indicating the percentage of the index that was included in the query, or null
     * if minimumCoverage was not specified in the request.
     * 
     * @return the coverage value.
     */
    @Generated
    public Double getCoverage() {
        return this.coverage;
    }

    /**
     * Get the facets property: The facet query results for the search operation, organized as a collection of buckets
     * for each faceted field; null if the query did not include any facet expressions.
     * 
     * @return the facets value.
     */
    @Generated
    public Map<String, List<FacetResult>> getFacets() {
        return this.facets;
    }

    /**
     * Get the answers property: The answers query results for the search operation; null if the answers query parameter
     * was not specified or set to 'none'.
     * 
     * @return the answers value.
     */
    @Generated
    public List<QueryAnswerResult> getAnswers() {
        return this.answers;
    }

    /**
     * Get the debugInfo property: Debug information that applies to the search results as a whole.
     * 
     * @return the debugInfo value.
     */
    @Generated
    public DebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    /**
     * Get the nextPageParameters property: Continuation JSON payload returned when the query can't return all the
     * requested results in a single response. You can use this JSON along with &#064;odata.nextLink to formulate
     * another POST Search request to get the next part of the search response.
     * 
     * @return the nextPageParameters value.
     */
    @Generated
    public SearchRequest getNextPageParameters() {
        return this.nextPageParameters;
    }

    /**
     * Get the results property: The sequence of results returned by the query.
     * 
     * @return the results value.
     */
    @Generated
    public List<SearchResult> getResults() {
        return this.results;
    }

    /**
     * Get the nextLink property: Continuation URL returned when the query can't return all the requested results in a
     * single response. You can use this URL to formulate another GET or POST Search request to get the next part of the
     * search response. Make sure to use the same verb (GET or POST) as the request that produced this response.
     * 
     * @return the nextLink value.
     */
    @Generated
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Get the semanticPartialResponseReason property: Reason that a partial response was returned for a semantic
     * ranking request.
     * 
     * @return the semanticPartialResponseReason value.
     */
    @Generated
    public SemanticErrorReason getSemanticPartialResponseReason() {
        return this.semanticPartialResponseReason;
    }

    /**
     * Get the semanticPartialResponseType property: Type of partial response that was returned for a semantic ranking
     * request.
     * 
     * @return the semanticPartialResponseType value.
     */
    @Generated
    public SemanticSearchResultsType getSemanticPartialResponseType() {
        return this.semanticPartialResponseType;
    }

    /**
     * Get the semanticQueryRewritesResultType property: Type of query rewrite that was used to retrieve documents.
     * 
     * @return the semanticQueryRewritesResultType value.
     */
    @Generated
    public SemanticQueryRewritesResultType getSemanticQueryRewritesResultType() {
        return this.semanticQueryRewritesResultType;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchDocumentsResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchDocumentsResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchDocumentsResult.
     */
    @Generated
    public static SearchDocumentsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean resultsFound = false;
            List<SearchResult> results = null;
            Long count = null;
            Double coverage = null;
            Map<String, List<FacetResult>> facets = null;
            List<QueryAnswerResult> answers = null;
            DebugInfo debugInfo = null;
            SearchRequest nextPageParameters = null;
            String nextLink = null;
            SemanticErrorReason semanticPartialResponseReason = null;
            SemanticSearchResultsType semanticPartialResponseType = null;
            SemanticQueryRewritesResultType semanticQueryRewritesResultType = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    results = reader.readArray(reader1 -> SearchResult.fromJson(reader1));
                    resultsFound = true;
                } else if ("@odata.count".equals(fieldName)) {
                    count = reader.getNullable(JsonReader::getLong);
                } else if ("@search.coverage".equals(fieldName)) {
                    coverage = reader.getNullable(JsonReader::getDouble);
                } else if ("@search.facets".equals(fieldName)) {
                    facets = reader.readMap(reader1 -> reader1.readArray(reader2 -> FacetResult.fromJson(reader2)));
                } else if ("@search.answers".equals(fieldName)) {
                    answers = reader.readArray(reader1 -> QueryAnswerResult.fromJson(reader1));
                } else if ("@search.debug".equals(fieldName)) {
                    debugInfo = DebugInfo.fromJson(reader);
                } else if ("@search.nextPageParameters".equals(fieldName)) {
                    nextPageParameters = SearchRequest.fromJson(reader);
                } else if ("@odata.nextLink".equals(fieldName)) {
                    nextLink = reader.getString();
                } else if ("@search.semanticPartialResponseReason".equals(fieldName)) {
                    semanticPartialResponseReason = SemanticErrorReason.fromString(reader.getString());
                } else if ("@search.semanticPartialResponseType".equals(fieldName)) {
                    semanticPartialResponseType = SemanticSearchResultsType.fromString(reader.getString());
                } else if ("@search.semanticQueryRewritesResultType".equals(fieldName)) {
                    semanticQueryRewritesResultType = SemanticQueryRewritesResultType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            if (resultsFound) {
                SearchDocumentsResult deserializedSearchDocumentsResult = new SearchDocumentsResult(results);
                deserializedSearchDocumentsResult.count = count;
                deserializedSearchDocumentsResult.coverage = coverage;
                deserializedSearchDocumentsResult.facets = facets;
                deserializedSearchDocumentsResult.answers = answers;
                deserializedSearchDocumentsResult.debugInfo = debugInfo;
                deserializedSearchDocumentsResult.nextPageParameters = nextPageParameters;
                deserializedSearchDocumentsResult.nextLink = nextLink;
                deserializedSearchDocumentsResult.semanticPartialResponseReason = semanticPartialResponseReason;
                deserializedSearchDocumentsResult.semanticPartialResponseType = semanticPartialResponseType;
                deserializedSearchDocumentsResult.semanticQueryRewritesResultType = semanticQueryRewritesResultType;

                return deserializedSearchDocumentsResult;
            }
            throw new IllegalStateException("Missing required property: value");
        });
    }
}
