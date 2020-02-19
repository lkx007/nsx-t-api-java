# ManagementPlaneApiVpnIpsecPeerEndpointsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPSecVPNPeerEndPoint**](ManagementPlaneApiVpnIpsecPeerEndpointsApi.md#createIPSecVPNPeerEndPoint) | **POST** /vpn/ipsec/peer-endpoints | Create custom peer endpoint
[**deleteIPSecVPNPeerEndpoint**](ManagementPlaneApiVpnIpsecPeerEndpointsApi.md#deleteIPSecVPNPeerEndpoint) | **DELETE** /vpn/ipsec/peer-endpoints/{ipsec-vpn-peer-endpoint-id} | Delete custom IPSec VPN peer endpoint
[**getIPSecVPNPeerEndpoint**](ManagementPlaneApiVpnIpsecPeerEndpointsApi.md#getIPSecVPNPeerEndpoint) | **GET** /vpn/ipsec/peer-endpoints/{ipsec-vpn-peer-endpoint-id} | Get IPSec VPN peer endpoint
[**getIPSecVPNPeerEndpointWithPSKShowSensitiveData**](ManagementPlaneApiVpnIpsecPeerEndpointsApi.md#getIPSecVPNPeerEndpointWithPSKShowSensitiveData) | **GET** /vpn/ipsec/peer-endpoints/{ipsec-vpn-peer-endpoint-id}?action&#x3D;show-sensitive-data | Get IPSec VPN peer endpoint with PSK
[**listIPSecVPNPeerEndpoints**](ManagementPlaneApiVpnIpsecPeerEndpointsApi.md#listIPSecVPNPeerEndpoints) | **GET** /vpn/ipsec/peer-endpoints | Get IPSecVPNPeerEndpoint List Result
[**updateIPSecVPNPeerEndpoint**](ManagementPlaneApiVpnIpsecPeerEndpointsApi.md#updateIPSecVPNPeerEndpoint) | **PUT** /vpn/ipsec/peer-endpoints/{ipsec-vpn-peer-endpoint-id} | Edit custom IPSecPeerEndpoint

<a name="createIPSecVPNPeerEndPoint"></a>
# **createIPSecVPNPeerEndPoint**
> IPSecVPNPeerEndpoint createIPSecVPNPeerEndPoint(body)

Create custom peer endpoint

Create custom IPSec peer endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecPeerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecPeerEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecPeerEndpointsApi();
IPSecVPNPeerEndpoint body = new IPSecVPNPeerEndpoint(); // IPSecVPNPeerEndpoint | 
try {
    IPSecVPNPeerEndpoint result = apiInstance.createIPSecVPNPeerEndPoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecPeerEndpointsApi#createIPSecVPNPeerEndPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNPeerEndpoint**](IPSecVPNPeerEndpoint.md)|  |

### Return type

[**IPSecVPNPeerEndpoint**](IPSecVPNPeerEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSecVPNPeerEndpoint"></a>
# **deleteIPSecVPNPeerEndpoint**
> deleteIPSecVPNPeerEndpoint(ipsecVpnPeerEndpointId, force)

Delete custom IPSec VPN peer endpoint

Delete custom IPSec VPN peer endpoint. All references are strong references and dependent peer endpoints can not be deleted if being referenced.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecPeerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecPeerEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecPeerEndpointsApi();
String ipsecVpnPeerEndpointId = "ipsecVpnPeerEndpointId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSecVPNPeerEndpoint(ipsecVpnPeerEndpointId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecPeerEndpointsApi#deleteIPSecVPNPeerEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnPeerEndpointId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNPeerEndpoint"></a>
# **getIPSecVPNPeerEndpoint**
> IPSecVPNPeerEndpoint getIPSecVPNPeerEndpoint(ipsecVpnPeerEndpointId)

Get IPSec VPN peer endpoint

Get custom IPSec VPN peer endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecPeerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecPeerEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecPeerEndpointsApi();
String ipsecVpnPeerEndpointId = "ipsecVpnPeerEndpointId_example"; // String | 
try {
    IPSecVPNPeerEndpoint result = apiInstance.getIPSecVPNPeerEndpoint(ipsecVpnPeerEndpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecPeerEndpointsApi#getIPSecVPNPeerEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnPeerEndpointId** | **String**|  |

### Return type

[**IPSecVPNPeerEndpoint**](IPSecVPNPeerEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNPeerEndpointWithPSKShowSensitiveData"></a>
# **getIPSecVPNPeerEndpointWithPSKShowSensitiveData**
> IPSecVPNPeerEndpoint getIPSecVPNPeerEndpointWithPSKShowSensitiveData(ipsecVpnPeerEndpointId)

Get IPSec VPN peer endpoint with PSK

Get custom IPSec VPN peer endpoint with PSK.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecPeerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecPeerEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecPeerEndpointsApi();
String ipsecVpnPeerEndpointId = "ipsecVpnPeerEndpointId_example"; // String | 
try {
    IPSecVPNPeerEndpoint result = apiInstance.getIPSecVPNPeerEndpointWithPSKShowSensitiveData(ipsecVpnPeerEndpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecPeerEndpointsApi#getIPSecVPNPeerEndpointWithPSKShowSensitiveData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnPeerEndpointId** | **String**|  |

### Return type

[**IPSecVPNPeerEndpoint**](IPSecVPNPeerEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPSecVPNPeerEndpoints"></a>
# **listIPSecVPNPeerEndpoints**
> IPSecVPNPeerEndpointListResult listIPSecVPNPeerEndpoints(cursor, includedFields, pageSize, sortAscending, sortBy)

Get IPSecVPNPeerEndpoint List Result

Get paginated list of all peer endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecPeerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecPeerEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecPeerEndpointsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSecVPNPeerEndpointListResult result = apiInstance.listIPSecVPNPeerEndpoints(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecPeerEndpointsApi#listIPSecVPNPeerEndpoints");
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

[**IPSecVPNPeerEndpointListResult**](IPSecVPNPeerEndpointListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSecVPNPeerEndpoint"></a>
# **updateIPSecVPNPeerEndpoint**
> IPSecVPNPeerEndpoint updateIPSecVPNPeerEndpoint(body, ipsecVpnPeerEndpointId)

Edit custom IPSecPeerEndpoint

Edit custom IPSec peer endpoint. System owned endpoints are non editable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecPeerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecPeerEndpointsApi apiInstance = new ManagementPlaneApiVpnIpsecPeerEndpointsApi();
IPSecVPNPeerEndpoint body = new IPSecVPNPeerEndpoint(); // IPSecVPNPeerEndpoint | 
String ipsecVpnPeerEndpointId = "ipsecVpnPeerEndpointId_example"; // String | 
try {
    IPSecVPNPeerEndpoint result = apiInstance.updateIPSecVPNPeerEndpoint(body, ipsecVpnPeerEndpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecPeerEndpointsApi#updateIPSecVPNPeerEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNPeerEndpoint**](IPSecVPNPeerEndpoint.md)|  |
 **ipsecVpnPeerEndpointId** | **String**|  |

### Return type

[**IPSecVPNPeerEndpoint**](IPSecVPNPeerEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

