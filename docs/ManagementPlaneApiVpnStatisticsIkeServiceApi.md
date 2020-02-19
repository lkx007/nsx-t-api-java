# ManagementPlaneApiVpnStatisticsIkeServiceApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIPSecVPNIKEService**](ManagementPlaneApiVpnStatisticsIkeServiceApi.md#getIPSecVPNIKEService) | **GET** /vpn/services/{service-id}/summary | Cumulative statistics for one IKE service instance

<a name="getIPSecVPNIKEService"></a>
# **getIPSecVPNIKEService**
> IPSecVPNIKEServiceSummary getIPSecVPNIKEService(serviceId, source)

Cumulative statistics for one IKE service instance

Cumulative statistics for one IKE service instance. Query parameter source supports only cached mode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnStatisticsIkeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnStatisticsIkeServiceApi apiInstance = new ManagementPlaneApiVpnStatisticsIkeServiceApi();
String serviceId = "serviceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    IPSecVPNIKEServiceSummary result = apiInstance.getIPSecVPNIKEService(serviceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnStatisticsIkeServiceApi#getIPSecVPNIKEService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**IPSecVPNIKEServiceSummary**](IPSecVPNIKEServiceSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

