# ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getL2VPNSessionSummary**](ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi.md#getL2VPNSessionSummary) | **GET** /vpn/l2vpn/sessions/summary | Get status summary of all existing L2VPN sessions.

<a name="getL2VPNSessionSummary"></a>
# **getL2VPNSessionSummary**
> L2VPNSessionSummary getL2VPNSessionSummary(source)

Get status summary of all existing L2VPN sessions.

Load all the existing L2VPN sessions and return the status summary of all L2VPN sessions. Query parameter source supports only cached mode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi apiInstance = new ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi();
String source = "source_example"; // String | Data source type.
try {
    L2VPNSessionSummary result = apiInstance.getL2VPNSessionSummary(source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi#getL2VPNSessionSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**L2VPNSessionSummary**](L2VPNSessionSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

