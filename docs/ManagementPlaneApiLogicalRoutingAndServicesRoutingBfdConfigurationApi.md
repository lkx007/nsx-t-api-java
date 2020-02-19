# ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**readRoutingBfdConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi.md#readRoutingBfdConfig) | **GET** /logical-routers/{logical-router-id}/routing/bfd-config | Read the Routing BFD Configuration
[**updateRoutingBfdConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi.md#updateRoutingBfdConfig) | **PUT** /logical-routers/{logical-router-id}/routing/bfd-config | Update the BFD Configuration for BFD peers for routing

<a name="readRoutingBfdConfig"></a>
# **readRoutingBfdConfig**
> BfdConfig readRoutingBfdConfig(logicalRouterId)

Read the Routing BFD Configuration

Returns the BFD configuration for all routing BFD peers. This will be inherited |   by all BFD peers for LogicalRouter unless overriden while configuring the Peer. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    BfdConfig result = apiInstance.readRoutingBfdConfig(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi#readRoutingBfdConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**BfdConfig**](BfdConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRoutingBfdConfig"></a>
# **updateRoutingBfdConfig**
> BfdConfig updateRoutingBfdConfig(body, logicalRouterId)

Update the BFD Configuration for BFD peers for routing

Modifies the BFD configuration for routing BFD peers. Note - the configuration |   changes apply only to those routing BFD peers for which the BFD configuration has |   not been overridden at Peer level. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi();
BfdConfig body = new BfdConfig(); // BfdConfig | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    BfdConfig result = apiInstance.updateRoutingBfdConfig(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingBfdConfigurationApi#updateRoutingBfdConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BfdConfig**](BfdConfig.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**BfdConfig**](BfdConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

