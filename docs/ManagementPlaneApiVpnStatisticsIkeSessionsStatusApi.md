# ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIPSecVPNIKESessionStatus**](ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi.md#getIPSecVPNIKESessionStatus) | **GET** /vpn/ipsec/sessions/{session-id}/status | Get IPSec VPN IKE session status

<a name="getIPSecVPNIKESessionStatus"></a>
# **getIPSecVPNIKESessionStatus**
> IPSecVPNSessionStatus getIPSecVPNIKESessionStatus(sessionId, source)

Get IPSec VPN IKE session status

List status of IPSec session. Query parameter source supports both realtime and cached mode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi apiInstance = new ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi();
String sessionId = "sessionId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    IPSecVPNSessionStatus result = apiInstance.getIPSecVPNIKESessionStatus(sessionId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi#getIPSecVPNIKESessionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**IPSecVPNSessionStatus**](IPSecVPNSessionStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

