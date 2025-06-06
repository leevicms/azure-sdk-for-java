// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.network.fluent.LoadBalancerOutboundRulesClient;
import com.azure.resourcemanager.network.fluent.models.OutboundRuleInner;
import com.azure.resourcemanager.network.models.LoadBalancerOutboundRuleListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in LoadBalancerOutboundRulesClient.
 */
public final class LoadBalancerOutboundRulesClientImpl implements LoadBalancerOutboundRulesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LoadBalancerOutboundRulesService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancerOutboundRulesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    LoadBalancerOutboundRulesClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(LoadBalancerOutboundRulesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientLoadBalancerOutboundRules to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface LoadBalancerOutboundRulesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/outboundRules")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LoadBalancerOutboundRuleListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/outboundRules/{outboundRuleName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OutboundRuleInner>> get(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @PathParam("outboundRuleName") String outboundRuleName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LoadBalancerOutboundRuleListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OutboundRuleInner>> listSinglePageAsync(String resourceGroupName,
        String loadBalancerName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-07-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceGroupName, loadBalancerName,
                apiVersion, this.client.getSubscriptionId(), accept, context))
            .<PagedResponse<OutboundRuleInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OutboundRuleInner>> listSinglePageAsync(String resourceGroupName,
        String loadBalancerName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-07-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), resourceGroupName, loadBalancerName, apiVersion,
                this.client.getSubscriptionId(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OutboundRuleInner> listAsync(String resourceGroupName, String loadBalancerName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, loadBalancerName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OutboundRuleInner> listAsync(String resourceGroupName, String loadBalancerName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, loadBalancerName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OutboundRuleInner> list(String resourceGroupName, String loadBalancerName) {
        return new PagedIterable<>(listAsync(resourceGroupName, loadBalancerName));
    }

    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OutboundRuleInner> list(String resourceGroupName, String loadBalancerName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, loadBalancerName, context));
    }

    /**
     * Gets the specified load balancer outbound rule.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OutboundRuleInner>> getWithResponseAsync(String resourceGroupName, String loadBalancerName,
        String outboundRuleName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (outboundRuleName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter outboundRuleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-07-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), resourceGroupName, loadBalancerName,
                outboundRuleName, apiVersion, this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the specified load balancer outbound rule.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OutboundRuleInner>> getWithResponseAsync(String resourceGroupName, String loadBalancerName,
        String outboundRuleName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (outboundRuleName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter outboundRuleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-07-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceGroupName, loadBalancerName, outboundRuleName, apiVersion,
            this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the specified load balancer outbound rule.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OutboundRuleInner> getAsync(String resourceGroupName, String loadBalancerName,
        String outboundRuleName) {
        return getWithResponseAsync(resourceGroupName, loadBalancerName, outboundRuleName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the specified load balancer outbound rule.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OutboundRuleInner> getWithResponse(String resourceGroupName, String loadBalancerName,
        String outboundRuleName, Context context) {
        return getWithResponseAsync(resourceGroupName, loadBalancerName, outboundRuleName, context).block();
    }

    /**
     * Gets the specified load balancer outbound rule.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OutboundRuleInner get(String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        return getWithResponse(resourceGroupName, loadBalancerName, outboundRuleName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListOutboundRule API service call along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OutboundRuleInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<OutboundRuleInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListOutboundRule API service call along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OutboundRuleInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
