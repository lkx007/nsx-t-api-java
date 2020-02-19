# ManagementPlaneApiVpnIpsecServicesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPSecVPNService**](ManagementPlaneApiVpnIpsecServicesApi.md#createIPSecVPNService) | **POST** /vpn/ipsec/services | Create VPN service
[**deleteIPSecVPNService**](ManagementPlaneApiVpnIpsecServicesApi.md#deleteIPSecVPNService) | **DELETE** /vpn/ipsec/services/{ipsec-vpn-service-id} | Delete IPSec VPN service
[**getIPSecVPNService**](ManagementPlaneApiVpnIpsecServicesApi.md#getIPSecVPNService) | **GET** /vpn/ipsec/services/{ipsec-vpn-service-id} | Get IPSec VPN service
[**listIPSecVPNServices**](ManagementPlaneApiVpnIpsecServicesApi.md#listIPSecVPNServices) | **GET** /vpn/ipsec/services | Get IPSec VPN service list result
[**updateIPSecVPNService**](ManagementPlaneApiVpnIpsecServicesApi.md#updateIPSecVPNService) | **PUT** /vpn/ipsec/services/{ipsec-vpn-service-id} | Edit IPSec VPN service

<a name="createIPSecVPNService"></a>
# **createIPSecVPNService**
> IPSecVPNService createIPSecVPNService(body)

Create VPN service

Create VPN service for given logical router.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecServicesApi apiInstance = new ManagementPlaneApiVpnIpsecServicesApi();
IPSecVPNService body = new IPSecVPNService(); // IPSecVPNService | 
try {
    IPSecVPNService result = apiInstance.createIPSecVPNService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecServicesApi#createIPSecVPNService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNService**](IPSecVPNService.md)|  |

### Return type

[**IPSecVPNService**](IPSecVPNService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSecVPNService"></a>
# **deleteIPSecVPNService**
> deleteIPSecVPNService(ipsecVpnServiceId, force)

Delete IPSec VPN service

Delete IPSec VPN service for given router.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecServicesApi apiInstance = new ManagementPlaneApiVpnIpsecServicesApi();
String ipsecVpnServiceId = "ipsecVpnServiceId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSecVPNService(ipsecVpnServiceId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecServicesApi#deleteIPSecVPNService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnServiceId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNService"></a>
# **getIPSecVPNService**
> IPSecVPNService getIPSecVPNService(ipsecVpnServiceId)

Get IPSec VPN service

Get IPSec VPN service for given logical router.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecServicesApi apiInstance = new ManagementPlaneApiVpnIpsecServicesApi();
String ipsecVpnServiceId = "ipsecVpnServiceId_example"; // String | 
try {
    IPSecVPNService result = apiInstance.getIPSecVPNService(ipsecVpnServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecServicesApi#getIPSecVPNService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnServiceId** | **String**|  |

### Return type

[**IPSecVPNService**](IPSecVPNService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPSecVPNServices"></a>
# **listIPSecVPNServices**
> IPSecVPNServiceListResult listIPSecVPNServices(cursor, includedFields, pageSize, sortAscending, sortBy)

Get IPSec VPN service list result

Get paginated list of all IPSec VPN services.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecServicesApi apiInstance = new ManagementPlaneApiVpnIpsecServicesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSecVPNServiceListResult result = apiInstance.listIPSecVPNServices(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecServicesApi#listIPSecVPNServices");
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

[**IPSecVPNServiceListResult**](IPSecVPNServiceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSecVPNService"></a>
# **updateIPSecVPNService**
> IPSecVPNService updateIPSecVPNService(body, ipsecVpnServiceId)

Edit IPSec VPN service

Edit IPSec VPN service for given logical router.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecServicesApi apiInstance = new ManagementPlaneApiVpnIpsecServicesApi();
IPSecVPNService body = new IPSecVPNService(); // IPSecVPNService | 
String ipsecVpnServiceId = "ipsecVpnServiceId_example"; // String | 
try {
    IPSecVPNService result = apiInstance.updateIPSecVPNService(body, ipsecVpnServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecServicesApi#updateIPSecVPNService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNService**](IPSecVPNService.md)|  |
 **ipsecVpnServiceId** | **String**|  |

### Return type

[**IPSecVPNService**](IPSecVPNService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

