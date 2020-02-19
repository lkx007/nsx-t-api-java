# ManagementPlaneApiVpnIpsecLocalEndpointsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPSecVPNLocalEndpoint**](ManagementPlaneApiVpnIpsecLocalEndpointsApi.md#createIPSecVPNLocalEndpoint) | **POST** /vpn/ipsec/local-endpoints | Create custom local endpoint
[**deleteIPSecVPNLocalEndpoint**](ManagementPlaneApiVpnIpsecLocalEndpointsApi.md#deleteIPSecVPNLocalEndpoint) | **DELETE** /vpn/ipsec/local-endpoints/{ipsec-vpn-local-endpoint-id} | Delete custom IPSec local endpoint
[**getIPSecVPNLocalEndpoint**](ManagementPlaneApiVpnIpsecLocalEndpointsApi.md#getIPSecVPNLocalEndpoint) | **GET** /vpn/ipsec/local-endpoints/{ipsec-vpn-local-endpoint-id} | Get custom IPSec local endpoint
[**listIPSecVPNLocalEndpoints**](ManagementPlaneApiVpnIpsecLocalEndpointsApi.md#listIPSecVPNLocalEndpoints) | **GET** /vpn/ipsec/local-endpoints | Get IPSec local endpoint list result
[**updateIPSecVPNLocalEndpoint**](ManagementPlaneApiVpnIpsecLocalEndpointsApi.md#updateIPSecVPNLocalEndpoint) | **PUT** /vpn/ipsec/local-endpoints/{ipsec-vpn-local-endpoint-id} | Edit custom IPSec local endpoint

<a name="createIPSecVPNLocalEndpoint"></a>
# **createIPSecVPNLocalEndpoint**
> IPSecVPNLocalEndpoint createIPSecVPNLocalEndpoint(body)

Create custom local endpoint

Create custom IPSec local endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecLocalEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecLocalEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecLocalEndpointsApi();
IPSecVPNLocalEndpoint body = new IPSecVPNLocalEndpoint(); // IPSecVPNLocalEndpoint | 
try {
    IPSecVPNLocalEndpoint result = apiInstance.createIPSecVPNLocalEndpoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecLocalEndpointsApi#createIPSecVPNLocalEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNLocalEndpoint**](IPSecVPNLocalEndpoint.md)|  |

### Return type

[**IPSecVPNLocalEndpoint**](IPSecVPNLocalEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSecVPNLocalEndpoint"></a>
# **deleteIPSecVPNLocalEndpoint**
> deleteIPSecVPNLocalEndpoint(ipsecVpnLocalEndpointId, force)

Delete custom IPSec local endpoint

Delete custom IPSec local endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecLocalEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecLocalEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecLocalEndpointsApi();
String ipsecVpnLocalEndpointId = "ipsecVpnLocalEndpointId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSecVPNLocalEndpoint(ipsecVpnLocalEndpointId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecLocalEndpointsApi#deleteIPSecVPNLocalEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnLocalEndpointId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNLocalEndpoint"></a>
# **getIPSecVPNLocalEndpoint**
> IPSecVPNLocalEndpoint getIPSecVPNLocalEndpoint(ipsecVpnLocalEndpointId)

Get custom IPSec local endpoint

Get custom IPSec local endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecLocalEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecLocalEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecLocalEndpointsApi();
String ipsecVpnLocalEndpointId = "ipsecVpnLocalEndpointId_example"; // String | 
try {
    IPSecVPNLocalEndpoint result = apiInstance.getIPSecVPNLocalEndpoint(ipsecVpnLocalEndpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecLocalEndpointsApi#getIPSecVPNLocalEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnLocalEndpointId** | **String**|  |

### Return type

[**IPSecVPNLocalEndpoint**](IPSecVPNLocalEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPSecVPNLocalEndpoints"></a>
# **listIPSecVPNLocalEndpoints**
> IPSecVPNLocalEndpointListResult listIPSecVPNLocalEndpoints(cursor, includedFields, ipsecVpnServiceId, logicalRouterId, pageSize, sortAscending, sortBy)

Get IPSec local endpoint list result

Get paginated list of all local endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecLocalEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecLocalEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecLocalEndpointsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String ipsecVpnServiceId = "ipsecVpnServiceId_example"; // String | Id of the IPSec VPN service
String logicalRouterId = "logicalRouterId_example"; // String | Id of logical router
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSecVPNLocalEndpointListResult result = apiInstance.listIPSecVPNLocalEndpoints(cursor, includedFields, ipsecVpnServiceId, logicalRouterId, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecLocalEndpointsApi#listIPSecVPNLocalEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **ipsecVpnServiceId** | **String**| Id of the IPSec VPN service | [optional]
 **logicalRouterId** | **String**| Id of logical router | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IPSecVPNLocalEndpointListResult**](IPSecVPNLocalEndpointListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSecVPNLocalEndpoint"></a>
# **updateIPSecVPNLocalEndpoint**
> IPSecVPNLocalEndpoint updateIPSecVPNLocalEndpoint(body, ipsecVpnLocalEndpointId)

Edit custom IPSec local endpoint

Edit custom IPSec local endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecLocalEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecLocalEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecLocalEndpointsApi();
IPSecVPNLocalEndpoint body = new IPSecVPNLocalEndpoint(); // IPSecVPNLocalEndpoint | 
String ipsecVpnLocalEndpointId = "ipsecVpnLocalEndpointId_example"; // String | 
try {
    IPSecVPNLocalEndpoint result = apiInstance.updateIPSecVPNLocalEndpoint(body, ipsecVpnLocalEndpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecLocalEndpointsApi#updateIPSecVPNLocalEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNLocalEndpoint**](IPSecVPNLocalEndpoint.md)|  |
 **ipsecVpnLocalEndpointId** | **String**|  |

### Return type

[**IPSecVPNLocalEndpoint**](IPSecVPNLocalEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

