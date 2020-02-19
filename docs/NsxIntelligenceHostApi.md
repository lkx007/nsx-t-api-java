# NsxIntelligenceHostApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaceHostConfiguration**](NsxIntelligenceHostApi.md#getPaceHostConfiguration) | **GET** /intelligence/host-config | Get NSX-Intelligence host configuration
[**patchPaceHostConfiguration**](NsxIntelligenceHostApi.md#patchPaceHostConfiguration) | **PATCH** /intelligence/host-config | Patch NSX-Intelligence host configuration
[**resetPaceHostConfigurationReset**](NsxIntelligenceHostApi.md#resetPaceHostConfigurationReset) | **POST** /intelligence/host-config?action&#x3D;reset | Reset NSX-Intelligence host configuration

<a name="getPaceHostConfiguration"></a>
# **getPaceHostConfiguration**
> IntelligenceHostConfigurationInfo getPaceHostConfiguration()

Get NSX-Intelligence host configuration

Get the current NSX-Intelligence host configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceHostApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceHostApi apiInstance = new NsxIntelligenceHostApi();
try {
    IntelligenceHostConfigurationInfo result = apiInstance.getPaceHostConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceHostApi#getPaceHostConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IntelligenceHostConfigurationInfo**](IntelligenceHostConfigurationInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchPaceHostConfiguration"></a>
# **patchPaceHostConfiguration**
> IntelligenceHostConfigurationInfo patchPaceHostConfiguration(body)

Patch NSX-Intelligence host configuration

Patch the current NSX-Intelligence host configuration. Return error if NSX-Intelligence is not registered with NSX. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceHostApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceHostApi apiInstance = new NsxIntelligenceHostApi();
IntelligenceHostConfigurationInfo body = new IntelligenceHostConfigurationInfo(); // IntelligenceHostConfigurationInfo | 
try {
    IntelligenceHostConfigurationInfo result = apiInstance.patchPaceHostConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceHostApi#patchPaceHostConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntelligenceHostConfigurationInfo**](IntelligenceHostConfigurationInfo.md)|  |

### Return type

[**IntelligenceHostConfigurationInfo**](IntelligenceHostConfigurationInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetPaceHostConfigurationReset"></a>
# **resetPaceHostConfigurationReset**
> IntelligenceHostConfigurationInfo resetPaceHostConfigurationReset()

Reset NSX-Intelligence host configuration

Reset NSX-Intelligence host configuration to the default setting. Clear NSX-Intelligence host configuration if NSX-Intelligence is not registered with NSX. Return the NSX-Intelligence host configuration after reset operation. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceHostApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceHostApi apiInstance = new NsxIntelligenceHostApi();
try {
    IntelligenceHostConfigurationInfo result = apiInstance.resetPaceHostConfigurationReset();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceHostApi#resetPaceHostConfigurationReset");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IntelligenceHostConfigurationInfo**](IntelligenceHostConfigurationInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

