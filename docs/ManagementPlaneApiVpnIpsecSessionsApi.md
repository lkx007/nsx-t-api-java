# ManagementPlaneApiVpnIpsecSessionsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPSecVPNSession**](ManagementPlaneApiVpnIpsecSessionsApi.md#createIPSecVPNSession) | **POST** /vpn/ipsec/sessions | Create new VPN session
[**deleteIPSecVPNSession**](ManagementPlaneApiVpnIpsecSessionsApi.md#deleteIPSecVPNSession) | **DELETE** /vpn/ipsec/sessions/{ipsec-vpn-session-id} | Delete IPSec VPN session
[**getIPSecVPNSession**](ManagementPlaneApiVpnIpsecSessionsApi.md#getIPSecVPNSession) | **GET** /vpn/ipsec/sessions/{ipsec-vpn-session-id} | Fetch IPSec VPN session
[**getIPSecVPNSessionState**](ManagementPlaneApiVpnIpsecSessionsApi.md#getIPSecVPNSessionState) | **GET** /vpn/ipsec/sessions/{ipsec-vpn-session-id}/state | Get the Realized State of a IPSec VPN Session
[**getPeerConfig**](ManagementPlaneApiVpnIpsecSessionsApi.md#getPeerConfig) | **GET** /vpn/ipsec/sessions/{ipsec-vpn-session-id}/peer-config | Get VPN configuration for the peer site
[**listIPSecVPNSessions**](ManagementPlaneApiVpnIpsecSessionsApi.md#listIPSecVPNSessions) | **GET** /vpn/ipsec/sessions | Get IPSec VPN session list result
[**updateIPSecVPNSession**](ManagementPlaneApiVpnIpsecSessionsApi.md#updateIPSecVPNSession) | **PUT** /vpn/ipsec/sessions/{ipsec-vpn-session-id} | Edit IPSec VPN session

<a name="createIPSecVPNSession"></a>
# **createIPSecVPNSession**
> IPSecVPNSession createIPSecVPNSession(body)

Create new VPN session

Create new VPN session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecSessionsApi apiInstance = new ManagementPlaneApiVpnIpsecSessionsApi();
IPSecVPNSession body = new IPSecVPNSession(); // IPSecVPNSession | 
try {
    IPSecVPNSession result = apiInstance.createIPSecVPNSession(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecSessionsApi#createIPSecVPNSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNSession**](IPSecVPNSession.md)|  |

### Return type

[**IPSecVPNSession**](IPSecVPNSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSecVPNSession"></a>
# **deleteIPSecVPNSession**
> deleteIPSecVPNSession(ipsecVpnSessionId, force)

Delete IPSec VPN session

Delete IPSec VPN session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecSessionsApi apiInstance = new ManagementPlaneApiVpnIpsecSessionsApi();
String ipsecVpnSessionId = "ipsecVpnSessionId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSecVPNSession(ipsecVpnSessionId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecSessionsApi#deleteIPSecVPNSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnSessionId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNSession"></a>
# **getIPSecVPNSession**
> IPSecVPNSession getIPSecVPNSession(ipsecVpnSessionId)

Fetch IPSec VPN session

Fetch IPSec VPN session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecSessionsApi apiInstance = new ManagementPlaneApiVpnIpsecSessionsApi();
String ipsecVpnSessionId = "ipsecVpnSessionId_example"; // String | 
try {
    IPSecVPNSession result = apiInstance.getIPSecVPNSession(ipsecVpnSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecSessionsApi#getIPSecVPNSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnSessionId** | **String**|  |

### Return type

[**IPSecVPNSession**](IPSecVPNSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNSessionState"></a>
# **getIPSecVPNSessionState**
> IPSecVPNSessionState getIPSecVPNSessionState(ipsecVpnSessionId, barrierId, requestId)

Get the Realized State of a IPSec VPN Session

Return realized state information of a ipsec vpn session. Any configuration update that affects the ipsec vpn session can use this API to get its realized state by passing a request_id returned by the configuration change operation. e.g. Update configuration of ipsec vpn session, service, endpoints, profiles, etc. It will return a service disabled error, if the ipsec vpn service associated with the session is disabled. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecSessionsApi apiInstance = new ManagementPlaneApiVpnIpsecSessionsApi();
String ipsecVpnSessionId = "ipsecVpnSessionId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    IPSecVPNSessionState result = apiInstance.getIPSecVPNSessionState(ipsecVpnSessionId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecSessionsApi#getIPSecVPNSessionState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnSessionId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**IPSecVPNSessionState**](IPSecVPNSessionState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeerConfig"></a>
# **getPeerConfig**
> String getPeerConfig(ipsecVpnSessionId)

Get VPN configuration for the peer site

API to download VPN configuration for the peer site. The configuration contains pre-shared key and secret; be careful when sharing or storing it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecSessionsApi apiInstance = new ManagementPlaneApiVpnIpsecSessionsApi();
String ipsecVpnSessionId = "ipsecVpnSessionId_example"; // String | 
try {
    String result = apiInstance.getPeerConfig(ipsecVpnSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecSessionsApi#getPeerConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnSessionId** | **String**|  |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain; charset=utf-8

<a name="listIPSecVPNSessions"></a>
# **listIPSecVPNSessions**
> IPSecVPNSessionListResult listIPSecVPNSessions(cursor, includedFields, ipsecVpnServiceId, logicalRouterId, pageSize, sessionType, sortAscending, sortBy)

Get IPSec VPN session list result

Get paginated list of all IPSec VPN sessions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecSessionsApi apiInstance = new ManagementPlaneApiVpnIpsecSessionsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String ipsecVpnServiceId = "ipsecVpnServiceId_example"; // String | Id of the IPSec VPN service
String logicalRouterId = "logicalRouterId_example"; // String | Id of logical router
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String sessionType = "sessionType_example"; // String | Resource types of IPsec VPN session
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSecVPNSessionListResult result = apiInstance.listIPSecVPNSessions(cursor, includedFields, ipsecVpnServiceId, logicalRouterId, pageSize, sessionType, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecSessionsApi#listIPSecVPNSessions");
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
 **sessionType** | **String**| Resource types of IPsec VPN session | [optional] [enum: PolicyBasedIPSecVPNSession, RouteBasedIPSecVPNSession]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IPSecVPNSessionListResult**](IPSecVPNSessionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSecVPNSession"></a>
# **updateIPSecVPNSession**
> IPSecVPNSession updateIPSecVPNSession(body, ipsecVpnSessionId)

Edit IPSec VPN session

Edit IPSec VPN session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecSessionsApi apiInstance = new ManagementPlaneApiVpnIpsecSessionsApi();
IPSecVPNSession body = new IPSecVPNSession(); // IPSecVPNSession | 
String ipsecVpnSessionId = "ipsecVpnSessionId_example"; // String | 
try {
    IPSecVPNSession result = apiInstance.updateIPSecVPNSession(body, ipsecVpnSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecSessionsApi#updateIPSecVPNSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNSession**](IPSecVPNSession.md)|  |
 **ipsecVpnSessionId** | **String**|  |

### Return type

[**IPSecVPNSession**](IPSecVPNSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

