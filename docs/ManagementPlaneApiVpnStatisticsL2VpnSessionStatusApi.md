# ManagementPlaneApiVpnStatisticsL2VpnSessionStatusApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getL2VPNSessionStatus**](ManagementPlaneApiVpnStatisticsL2VpnSessionStatusApi.md#getL2VPNSessionStatus) | **GET** /vpn/l2vpn/sessions/{session-id}/status | Get L2VPN session status

<a name="getL2VPNSessionStatus"></a>
# **getL2VPNSessionStatus**
> L2VPNSessionStatus getL2VPNSessionStatus(sessionId, source)

Get L2VPN session status

Aggregated status of L2VPN session. Query parameter source&#x3D;realtime|cached is supported.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsL2VpnSessionStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsL2VpnSessionStatusApi apiInstance = new ManagementPlaneApiVpnStatisticsL2VpnSessionStatusApi();
String sessionId = "sessionId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    L2VPNSessionStatus result = apiInstance.getL2VPNSessionStatus(sessionId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsL2VpnSessionStatusApi#getL2VPNSessionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**L2VPNSessionStatus**](L2VPNSessionStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

