# ManagementPlaneApiVpnStatisticsL2VpnRemoteMacsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getL2VPNSessionRemoteMacsForLS**](ManagementPlaneApiVpnStatisticsL2VpnRemoteMacsApi.md#getL2VPNSessionRemoteMacsForLS) | **GET** /vpn/l2vpn/sessions/{session-id}/remote-mac | Get L2VPN session remote mac for logical switch

<a name="getL2VPNSessionRemoteMacsForLS"></a>
# **getL2VPNSessionRemoteMacsForLS**
> L2VPNSessionRemoteMacs getL2VPNSessionRemoteMacsForLS(sessionId, logicalSwitchId)

Get L2VPN session remote mac for logical switch

Get L2VPN session remote mac for logical switch.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsL2VpnRemoteMacsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsL2VpnRemoteMacsApi apiInstance = new ManagementPlaneApiVpnStatisticsL2VpnRemoteMacsApi();
String sessionId = "sessionId_example"; // String | 
String logicalSwitchId = "logicalSwitchId_example"; // String | logical switch identifier
try {
    L2VPNSessionRemoteMacs result = apiInstance.getL2VPNSessionRemoteMacsForLS(sessionId, logicalSwitchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsL2VpnRemoteMacsApi#getL2VPNSessionRemoteMacsForLS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **logicalSwitchId** | **String**| logical switch identifier | [optional]

### Return type

[**L2VPNSessionRemoteMacs**](L2VPNSessionRemoteMacs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

