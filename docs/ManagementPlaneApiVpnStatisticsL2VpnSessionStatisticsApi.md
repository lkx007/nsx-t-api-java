# ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getL2VPNSessionStatistics**](ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi.md#getL2VPNSessionStatistics) | **GET** /vpn/l2vpn/sessions/{session-id}/statistics | Get L2VPN session statistics

<a name="getL2VPNSessionStatistics"></a>
# **getL2VPNSessionStatistics**
> L2VPNSessionStatistics getL2VPNSessionStatistics(sessionId, source)

Get L2VPN session statistics

Get statistics of a L2VPN session. Query parameter source&#x3D;realtime is the only supported source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi apiInstance = new ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi();
String sessionId = "sessionId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    L2VPNSessionStatistics result = apiInstance.getL2VPNSessionStatistics(sessionId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi#getL2VPNSessionStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**L2VPNSessionStatistics**](L2VPNSessionStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

