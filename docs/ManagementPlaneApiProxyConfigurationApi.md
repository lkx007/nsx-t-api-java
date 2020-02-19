# ManagementPlaneApiProxyConfigurationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProxyConfig**](ManagementPlaneApiProxyConfigurationApi.md#getProxyConfig) | **GET** /proxy/config | Returns the proxy configuration
[**updateProxyConfig**](ManagementPlaneApiProxyConfigurationApi.md#updateProxyConfig) | **PUT** /proxy/config | Creates or updates the proxy configuration

<a name="getProxyConfig"></a>
# **getProxyConfig**
> Proxy getProxyConfig()

Returns the proxy configuration

Returns the proxy configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiProxyConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiProxyConfigurationApi apiInstance = new ManagementPlaneApiProxyConfigurationApi();
try {
    Proxy result = apiInstance.getProxyConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiProxyConfigurationApi#getProxyConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Proxy**](Proxy.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProxyConfig"></a>
# **updateProxyConfig**
> Proxy updateProxyConfig(body)

Creates or updates the proxy configuration

Updates or creates the proxy configuration, and returns the new configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiProxyConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiProxyConfigurationApi apiInstance = new ManagementPlaneApiProxyConfigurationApi();
Proxy body = new Proxy(); // Proxy | 
try {
    Proxy result = apiInstance.updateProxyConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiProxyConfigurationApi#updateProxyConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Proxy**](Proxy.md)|  |

### Return type

[**Proxy**](Proxy.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

