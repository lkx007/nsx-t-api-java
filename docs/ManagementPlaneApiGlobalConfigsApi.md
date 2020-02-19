# ManagementPlaneApiGlobalConfigsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGlobalConfigs**](ManagementPlaneApiGlobalConfigsApi.md#getGlobalConfigs) | **GET** /global-configs/{config-type} | Get global configs for a config type
[**listGlobalConfigs**](ManagementPlaneApiGlobalConfigsApi.md#listGlobalConfigs) | **GET** /global-configs | List global configurations of a NSX domain
[**resyncGlobalConfigsResyncConfig**](ManagementPlaneApiGlobalConfigsApi.md#resyncGlobalConfigsResyncConfig) | **PUT** /global-configs/{config-type}?action&#x3D;resync_config | Resyncs global configurations of a config-type
[**updateGlobalConfigs**](ManagementPlaneApiGlobalConfigsApi.md#updateGlobalConfigs) | **PUT** /global-configs/{config-type} | Update global configurations of a config type

<a name="getGlobalConfigs"></a>
# **getGlobalConfigs**
> GlobalConfigs getGlobalConfigs(configType)

Get global configs for a config type

Returns global configurations that belong to the config type 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGlobalConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGlobalConfigsApi apiInstance = new ManagementPlaneApiGlobalConfigsApi();
String configType = "configType_example"; // String | 
try {
    GlobalConfigs result = apiInstance.getGlobalConfigs(configType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGlobalConfigsApi#getGlobalConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configType** | **String**|  |

### Return type

[**GlobalConfigs**](GlobalConfigs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGlobalConfigs"></a>
# **listGlobalConfigs**
> GlobalConfigsListResult listGlobalConfigs()

List global configurations of a NSX domain

Returns global configurations of a NSX domain grouped by the config types. These global configurations are valid across NSX domain for their respective types unless they are overridden by a more granular configurations. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGlobalConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGlobalConfigsApi apiInstance = new ManagementPlaneApiGlobalConfigsApi();
try {
    GlobalConfigsListResult result = apiInstance.listGlobalConfigs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGlobalConfigsApi#listGlobalConfigs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GlobalConfigsListResult**](GlobalConfigsListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resyncGlobalConfigsResyncConfig"></a>
# **resyncGlobalConfigsResyncConfig**
> GlobalConfigs resyncGlobalConfigsResyncConfig(body, configType)

Resyncs global configurations of a config-type

It is similar to update global configurations but this request would trigger update even if the configs are unmodified. However, the realization of the new configurations is config-type specific. Refer to config-type specific documentation for details about the configuration push state. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGlobalConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGlobalConfigsApi apiInstance = new ManagementPlaneApiGlobalConfigsApi();
GlobalConfigs body = new GlobalConfigs(); // GlobalConfigs | 
String configType = "configType_example"; // String | 
try {
    GlobalConfigs result = apiInstance.resyncGlobalConfigsResyncConfig(body, configType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGlobalConfigsApi#resyncGlobalConfigsResyncConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GlobalConfigs**](GlobalConfigs.md)|  |
 **configType** | **String**|  |

### Return type

[**GlobalConfigs**](GlobalConfigs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGlobalConfigs"></a>
# **updateGlobalConfigs**
> GlobalConfigs updateGlobalConfigs(body, configType)

Update global configurations of a config type

Updates global configurations that belong to a config type. The request must include the updated values along with the unmodified values. The values that are updated(different) would trigger update to config-type specific state. However, the realization of the new configurations is config-type specific. Refer to config-type specific documentation for details about the config- uration push state. Policy api will overwrite the fipsGlobalConfig set using MP api. Always use https://&lt;policyIp&gt;/policy/api/v1/infra/global-config to update fips config- uration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGlobalConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGlobalConfigsApi apiInstance = new ManagementPlaneApiGlobalConfigsApi();
GlobalConfigs body = new GlobalConfigs(); // GlobalConfigs | 
String configType = "configType_example"; // String | 
try {
    GlobalConfigs result = apiInstance.updateGlobalConfigs(body, configType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGlobalConfigsApi#updateGlobalConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GlobalConfigs**](GlobalConfigs.md)|  |
 **configType** | **String**|  |

### Return type

[**GlobalConfigs**](GlobalConfigs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

