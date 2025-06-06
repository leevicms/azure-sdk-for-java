# Azure Core Vert.x HTTP plugin library for Java

Azure Core Vert.x HTTP client is a plugin for the `azure-core` HTTP client API.

## Getting started

### Prerequisites

- A [Java Development Kit (JDK)][jdk_link], version 8 or later.
  - Here are details about [Java 8 client compatibility with Azure Certificate Authority][java8_client_compatibility].

### Include the package

[//]: # ({x-version-update-start;com.azure:azure-core-http-vertx;current})
```xml
<dependencies>
  <dependency>
    <groupId>com.azure</groupId>
    <artifactId>azure-core-http-vertx</artifactId>
    <version>1.0.3</version>
  </dependency>
</dependencies>
```
[//]: # ({x-version-update-end})

## Key concepts

## Examples

The following sections provide several code snippets covering some of the most common client configuration scenarios.

- [Create a Simple Client](#create-a-simple-client)
- [Create a Client with Proxy](#create-a-client-with-proxy)

### Create a Simple Client

Create a Vert.x HttpClient.

```java readme-sample-createBasicClient
HttpClient client = new VertxHttpClientBuilder().build();
```

Create a Vert.x HttpClient using a connection timeout of 60 seconds.

```java readme-sample-createClientWithConnectionTimeout
HttpClient client = new VertxHttpClientBuilder().connectTimeout(Duration.ofSeconds(60)).build();
```

### Create a Client with Proxy

Create a Vert.x client that is using a proxy.

```java readme-sample-createProxyClient
HttpClient client = new VertxHttpClientBuilder()
    .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("<proxy-host>", 8888)))
    .build();
```

### Create an HttpClient with custom maxHeaderSize

Create a Vert.x HttpClient that uses a custom maxHeaderSize. Use this sample if you're seeing an error such as

```
io.netty.handler.codec.http.TooLongHttpHeaderException: HTTP header is larger than 8192 bytes.
```

(This is a Netty exception as maxHeaderSize is flowed through to Netty.)

```java readme-sample-customMaxHeaderSize
// Constructs an HttpClient with a modified max header size.
// This creates a Vert.x HttpClient with a max headers size of 256 KB.
// NOTE: If httpClientOptions is set, all other options set in the VertxHttpClientBuilder will be ignored.
HttpClient httpClient = new VertxHttpClientBuilder()
    .httpClientOptions(new HttpClientOptions().setMaxHeaderSize(256 * 1024))
    .build();
```

## Next steps

Get started with Azure libraries that are [built using Azure Core](https://azure.github.io/azure-sdk/releases/latest/#java).

## Troubleshooting

If you encounter any bugs, please file issues via [GitHub Issues](https://github.com/Azure/azure-sdk-for-java/issues/new/choose)
or checkout [StackOverflow for Azure Java SDK](https://stackoverflow.com/questions/tagged/azure-java-sdk).

### Enabling Logging

Azure SDKs for Java provide a consistent logging story to help aid in troubleshooting application errors and expedite
their resolution. The logs produced will capture the flow of an application before reaching the terminal state to help
locate the root issue. View the [logging][logging] wiki for guidance about enabling logging.

## Contributing

For details on contributing to this repository, see the [contributing guide](https://github.com/Azure/azure-sdk-for-java/blob/main/CONTRIBUTING.md).

1. Fork it
1. Create your feature branch (`git checkout -b my-new-feature`)
1. Commit your changes (`git commit -am 'Add some feature'`)
1. Push to the branch (`git push origin my-new-feature`)
1. Create new Pull Request

<!-- Links -->
[logging]: https://github.com/Azure/azure-sdk-for-java/wiki/Logging-in-Azure-SDK
[jdk_link]: https://learn.microsoft.com/java/azure/jdk/?view=azure-java-stable
[java8_client_compatibility]: https://learn.microsoft.com/azure/security/fundamentals/azure-ca-details?tabs=root-and-subordinate-cas-list#client-compatibility-for-public-pkis


