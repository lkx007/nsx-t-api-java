# ManagementPlaneApiVpnStatisticsSessionsStatisticsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIPSecVPNSessionStatistics**](ManagementPlaneApiVpnStatisticsSessionsStatisticsApi.md#getIPSecVPNSessionStatistics) | **GET** /vpn/ipsec/sessions/{session-id}/statistics | Get IPSec VPN session statistics

<a name="getIPSecVPNSessionStatistics"></a>
# **getIPSecVPNSessionStatistics**
> IPSecVPNSessionStatistics getIPSecVPNSessionStatistics(sessionId, source)

Get IPSec VPN session statistics

Get statistics of a vpn session across all tunnels and IKE session. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsSessionsStatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsSessionsStatisticsApi apiInstance = new ManagementPlaneApiVpnStatisticsSessionsStatisticsApi();
String sessionId = "sessionId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    IPSecVPNSessionStatistics result = apiInstance.getIPSecVPNSessionStatistics(sessionId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsSessionsStatisticsApi#getIPSecVPNSessionStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**IPSecVPNSessionStatistics**](IPSecVPNSessionStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

