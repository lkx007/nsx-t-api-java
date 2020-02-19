# ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetIPSecVPNSessionStatisticsReset**](ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi.md#resetIPSecVPNSessionStatisticsReset) | **POST** /vpn/ipsec/sessions/{session-id}/statistics?action&#x3D;reset | Reset the statistics of the given VPN session

<a name="resetIPSecVPNSessionStatisticsReset"></a>
# **resetIPSecVPNSessionStatisticsReset**
> resetIPSecVPNSessionStatisticsReset(sessionId)

Reset the statistics of the given VPN session

Reset the statistics of the given VPN session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi apiInstance = new ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi();
String sessionId = "sessionId_example"; // String | 
try {
    apiInstance.resetIPSecVPNSessionStatisticsReset(sessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi#resetIPSecVPNSessionStatisticsReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

