# ManagementPlaneApiTroubleshootingAndMonitoringPortConnectionApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getForwardingPath**](ManagementPlaneApiTroubleshootingAndMonitoringPortConnectionApi.md#getForwardingPath) | **GET** /logical-ports/{lport-id}/forwarding-path | Get networking entities between two logical ports with VIF attachment

<a name="getForwardingPath"></a>
# **getForwardingPath**
> PortConnectionEntities getForwardingPath(lportId, peerPortId)

Get networking entities between two logical ports with VIF attachment

Get networking entities between two logical ports with VIF attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPortConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPortConnectionApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPortConnectionApi();
String lportId = "lportId_example"; // String | ID of source port
String peerPortId = "peerPortId_example"; // String | ID of peer port
try {
    PortConnectionEntities result = apiInstance.getForwardingPath(lportId, peerPortId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPortConnectionApi#getForwardingPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**| ID of source port |
 **peerPortId** | **String**| ID of peer port |

### Return type

[**PortConnectionEntities**](PortConnectionEntities.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

