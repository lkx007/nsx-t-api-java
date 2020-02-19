# ManagementPlaneApiRealizationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentBarrier**](ManagementPlaneApiRealizationApi.md#getCurrentBarrier) | **GET** /realization-state-barrier/current | Gets the current barrier number
[**getRealizationStateBarrierConfig**](ManagementPlaneApiRealizationApi.md#getRealizationStateBarrierConfig) | **GET** /realization-state-barrier/config | Gets the realization state barrier configuration
[**incrementRealizationStateBarrierIncrement**](ManagementPlaneApiRealizationApi.md#incrementRealizationStateBarrierIncrement) | **POST** /realization-state-barrier/current?action&#x3D;increment | Increments the barrier count by 1
[**updateRealizationStateBarrierConfig**](ManagementPlaneApiRealizationApi.md#updateRealizationStateBarrierConfig) | **PUT** /realization-state-barrier/config | Updates the barrier configuration

<a name="getCurrentBarrier"></a>
# **getCurrentBarrier**
> CurrentRealizationStateBarrier getCurrentBarrier()

Gets the current barrier number

Returns the current global realization barrier number for NSX. This method has been deprecated. To track realization state, use X-NSX-REQUESTID request header instead. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiRealizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiRealizationApi apiInstance = new ManagementPlaneApiRealizationApi();
try {
    CurrentRealizationStateBarrier result = apiInstance.getCurrentBarrier();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiRealizationApi#getCurrentBarrier");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentRealizationStateBarrier**](CurrentRealizationStateBarrier.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRealizationStateBarrierConfig"></a>
# **getRealizationStateBarrierConfig**
> RealizationStateBarrierConfig getRealizationStateBarrierConfig()

Gets the realization state barrier configuration

Returns the current barrier configuration 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiRealizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiRealizationApi apiInstance = new ManagementPlaneApiRealizationApi();
try {
    RealizationStateBarrierConfig result = apiInstance.getRealizationStateBarrierConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiRealizationApi#getRealizationStateBarrierConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RealizationStateBarrierConfig**](RealizationStateBarrierConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="incrementRealizationStateBarrierIncrement"></a>
# **incrementRealizationStateBarrierIncrement**
> CurrentRealizationStateBarrier incrementRealizationStateBarrierIncrement()

Increments the barrier count by 1

Increment the current barrier number by 1 for NSX. This method has been deprecated. To track realization state, use X-NSX-REQUESTID request header instead. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiRealizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiRealizationApi apiInstance = new ManagementPlaneApiRealizationApi();
try {
    CurrentRealizationStateBarrier result = apiInstance.incrementRealizationStateBarrierIncrement();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiRealizationApi#incrementRealizationStateBarrierIncrement");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentRealizationStateBarrier**](CurrentRealizationStateBarrier.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRealizationStateBarrierConfig"></a>
# **updateRealizationStateBarrierConfig**
> RealizationStateBarrierConfig updateRealizationStateBarrierConfig(body)

Updates the barrier configuration

Updates the barrier configuration having interval set in milliseconds The new interval that automatically increments the global realization number 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiRealizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiRealizationApi apiInstance = new ManagementPlaneApiRealizationApi();
RealizationStateBarrierConfig body = new RealizationStateBarrierConfig(); // RealizationStateBarrierConfig | 
try {
    RealizationStateBarrierConfig result = apiInstance.updateRealizationStateBarrierConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiRealizationApi#updateRealizationStateBarrierConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RealizationStateBarrierConfig**](RealizationStateBarrierConfig.md)|  |

### Return type

[**RealizationStateBarrierConfig**](RealizationStateBarrierConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

