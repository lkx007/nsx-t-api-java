# ManagementPlaneApiVpnL2VpnServicesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createL2VpnService**](ManagementPlaneApiVpnL2VpnServicesApi.md#createL2VpnService) | **POST** /vpn/l2vpn/services | Create L2VPN service
[**deleteL2VpnService**](ManagementPlaneApiVpnL2VpnServicesApi.md#deleteL2VpnService) | **DELETE** /vpn/l2vpn/services/{l2vpn-service-id} | Delete a L2VPN service
[**getL2VpnService**](ManagementPlaneApiVpnL2VpnServicesApi.md#getL2VpnService) | **GET** /vpn/l2vpn/services/{l2vpn-service-id} | Get L2VPN service
[**listL2VpnServices**](ManagementPlaneApiVpnL2VpnServicesApi.md#listL2VpnServices) | **GET** /vpn/l2vpn/services | Get all L2VPN services
[**updateL2VpnService**](ManagementPlaneApiVpnL2VpnServicesApi.md#updateL2VpnService) | **PUT** /vpn/l2vpn/services/{l2vpn-service-id} | Edit a L2VPN service

<a name="createL2VpnService"></a>
# **createL2VpnService**
> L2VpnService createL2VpnService(body)

Create L2VPN service

Create L2VPN service for a given logical router

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnServicesApi apiInstance = new ManagementPlaneApiVpnL2VpnServicesApi();
L2VpnService body = new L2VpnService(); // L2VpnService | 
try {
    L2VpnService result = apiInstance.createL2VpnService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnServicesApi#createL2VpnService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**L2VpnService**](L2VpnService.md)|  |

### Return type

[**L2VpnService**](L2VpnService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteL2VpnService"></a>
# **deleteL2VpnService**
> deleteL2VpnService(l2vpnServiceId, force)

Delete a L2VPN service

Delete a specific L2VPN service. If there are any L2VpnSessions on this L2VpnService, those needs to be deleted first.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnServicesApi apiInstance = new ManagementPlaneApiVpnL2VpnServicesApi();
String l2vpnServiceId = "l2vpnServiceId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteL2VpnService(l2vpnServiceId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnServicesApi#deleteL2VpnService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **l2vpnServiceId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getL2VpnService"></a>
# **getL2VpnService**
> L2VpnService getL2VpnService(l2vpnServiceId)

Get L2VPN service

Get a specific L2VPN service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnServicesApi apiInstance = new ManagementPlaneApiVpnL2VpnServicesApi();
String l2vpnServiceId = "l2vpnServiceId_example"; // String | 
try {
    L2VpnService result = apiInstance.getL2VpnService(l2vpnServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnServicesApi#getL2VpnService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **l2vpnServiceId** | **String**|  |

### Return type

[**L2VpnService**](L2VpnService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listL2VpnServices"></a>
# **listL2VpnServices**
> L2VpnServiceListResult listL2VpnServices(cursor, includedFields, pageSize, sortAscending, sortBy)

Get all L2VPN services

Get paginated list of all L2VPN services

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnServicesApi apiInstance = new ManagementPlaneApiVpnL2VpnServicesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    L2VpnServiceListResult result = apiInstance.listL2VpnServices(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnServicesApi#listL2VpnServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**L2VpnServiceListResult**](L2VpnServiceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateL2VpnService"></a>
# **updateL2VpnService**
> L2VpnService updateL2VpnService(body, l2vpnServiceId)

Edit a L2VPN service

Edit a specific L2VPN service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnServicesApi apiInstance = new ManagementPlaneApiVpnL2VpnServicesApi();
L2VpnService body = new L2VpnService(); // L2VpnService | 
String l2vpnServiceId = "l2vpnServiceId_example"; // String | 
try {
    L2VpnService result = apiInstance.updateL2VpnService(body, l2vpnServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnServicesApi#updateL2VpnService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**L2VpnService**](L2VpnService.md)|  |
 **l2vpnServiceId** | **String**|  |

### Return type

[**L2VpnService**](L2VpnService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

