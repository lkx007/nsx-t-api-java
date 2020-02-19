# ManagementPlaneApiVpnStatisticsSessionsSummaryApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIPSecVPNSessionSummary**](ManagementPlaneApiVpnStatisticsSessionsSummaryApi.md#getIPSecVPNSessionSummary) | **GET** /vpn/ipsec/sessions/summary | VPN session summary

<a name="getIPSecVPNSessionSummary"></a>
# **getIPSecVPNSessionSummary**
> IPSecVPNSessionSummary getIPSecVPNSessionSummary(siteId, source)

VPN session summary

VPN session summary gets summary per vpn sessions and IKE session. Query parameter source supports only cached mode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsSessionsSummaryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsSessionsSummaryApi apiInstance = new ManagementPlaneApiVpnStatisticsSessionsSummaryApi();
String siteId = "siteId_example"; // String | Peer site id
String source = "source_example"; // String | Data source type.
try {
    IPSecVPNSessionSummary result = apiInstance.getIPSecVPNSessionSummary(siteId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsSessionsSummaryApi#getIPSecVPNSessionSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Peer site id | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**IPSecVPNSessionSummary**](IPSecVPNSessionSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

