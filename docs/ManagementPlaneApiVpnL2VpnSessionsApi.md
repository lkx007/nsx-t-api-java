# ManagementPlaneApiVpnL2VpnSessionsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createL2VpnSession**](ManagementPlaneApiVpnL2VpnSessionsApi.md#createL2VpnSession) | **POST** /vpn/l2vpn/sessions | Create L2VPN session
[**deleteL2VpnSession**](ManagementPlaneApiVpnL2VpnSessionsApi.md#deleteL2VpnSession) | **DELETE** /vpn/l2vpn/sessions/{l2vpn-session-id} | Delete a L2VPN session
[**getL2VpnSession**](ManagementPlaneApiVpnL2VpnSessionsApi.md#getL2VpnSession) | **GET** /vpn/l2vpn/sessions/{l2vpn-session-id} | Get a L2VPN session
[**getL2VpnSessionPeerCodes**](ManagementPlaneApiVpnL2VpnSessionsApi.md#getL2VpnSessionPeerCodes) | **GET** /vpn/l2vpn/sessions/{l2vpn-session-id}/peer-codes | Get peer codes for the L2VpnSession
[**listL2VpnSessions**](ManagementPlaneApiVpnL2VpnSessionsApi.md#listL2VpnSessions) | **GET** /vpn/l2vpn/sessions | Get all L2VPN sessions
[**updateL2VpnSession**](ManagementPlaneApiVpnL2VpnSessionsApi.md#updateL2VpnSession) | **PUT** /vpn/l2vpn/sessions/{l2vpn-session-id} | Edit a L2VPN session

<a name="createL2VpnSession"></a>
# **createL2VpnSession**
> L2VpnSession createL2VpnSession(body)

Create L2VPN session

Create L2VPN session and bind to a L2VPNService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnSessionsApi apiInstance = new ManagementPlaneApiVpnL2VpnSessionsApi();
L2VpnSession body = new L2VpnSession(); // L2VpnSession | 
try {
    L2VpnSession result = apiInstance.createL2VpnSession(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnSessionsApi#createL2VpnSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**L2VpnSession**](L2VpnSession.md)|  |

### Return type

[**L2VpnSession**](L2VpnSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteL2VpnSession"></a>
# **deleteL2VpnSession**
> deleteL2VpnSession(l2vpnSessionId)

Delete a L2VPN session

Delete a specific L2VPN session. If there are any logical switch ports attached to it, those needs to be deleted first.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnSessionsApi apiInstance = new ManagementPlaneApiVpnL2VpnSessionsApi();
String l2vpnSessionId = "l2vpnSessionId_example"; // String | 
try {
    apiInstance.deleteL2VpnSession(l2vpnSessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnSessionsApi#deleteL2VpnSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **l2vpnSessionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getL2VpnSession"></a>
# **getL2VpnSession**
> L2VpnSession getL2VpnSession(l2vpnSessionId)

Get a L2VPN session

Get a specific L2VPN session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnSessionsApi apiInstance = new ManagementPlaneApiVpnL2VpnSessionsApi();
String l2vpnSessionId = "l2vpnSessionId_example"; // String | 
try {
    L2VpnSession result = apiInstance.getL2VpnSession(l2vpnSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnSessionsApi#getL2VpnSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **l2vpnSessionId** | **String**|  |

### Return type

[**L2VpnSession**](L2VpnSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getL2VpnSessionPeerCodes"></a>
# **getL2VpnSessionPeerCodes**
> L2VpnSessionPeerCodes getL2VpnSessionPeerCodes(l2vpnSessionId)

Get peer codes for the L2VpnSession

Get peer codes for the L2VPN session to program the remote side of the tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnSessionsApi apiInstance = new ManagementPlaneApiVpnL2VpnSessionsApi();
String l2vpnSessionId = "l2vpnSessionId_example"; // String | 
try {
    L2VpnSessionPeerCodes result = apiInstance.getL2VpnSessionPeerCodes(l2vpnSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnSessionsApi#getL2VpnSessionPeerCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **l2vpnSessionId** | **String**|  |

### Return type

[**L2VpnSessionPeerCodes**](L2VpnSessionPeerCodes.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listL2VpnSessions"></a>
# **listL2VpnSessions**
> L2VpnSessionListResult listL2VpnSessions(cursor, includedFields, l2vpnServiceId, pageSize, sortAscending, sortBy)

Get all L2VPN sessions

Get paginated list of all L2VPN sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnSessionsApi apiInstance = new ManagementPlaneApiVpnL2VpnSessionsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String l2vpnServiceId = "l2vpnServiceId_example"; // String | Id of the L2Vpn Service
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    L2VpnSessionListResult result = apiInstance.listL2VpnSessions(cursor, includedFields, l2vpnServiceId, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnSessionsApi#listL2VpnSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **l2vpnServiceId** | **String**| Id of the L2Vpn Service | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**L2VpnSessionListResult**](L2VpnSessionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateL2VpnSession"></a>
# **updateL2VpnSession**
> L2VpnSession updateL2VpnSession(body, l2vpnSessionId)

Edit a L2VPN session

Edit a specific L2VPN session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnL2VpnSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnL2VpnSessionsApi apiInstance = new ManagementPlaneApiVpnL2VpnSessionsApi();
L2VpnSession body = new L2VpnSession(); // L2VpnSession | 
String l2vpnSessionId = "l2vpnSessionId_example"; // String | 
try {
    L2VpnSession result = apiInstance.updateL2VpnSession(body, l2vpnSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnL2VpnSessionsApi#updateL2VpnSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**L2VpnSession**](L2VpnSession.md)|  |
 **l2vpnSessionId** | **String**|  |

### Return type

[**L2VpnSession**](L2VpnSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

