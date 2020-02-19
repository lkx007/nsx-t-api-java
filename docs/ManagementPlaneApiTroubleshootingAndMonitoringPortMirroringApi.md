# ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPortMirroringSessions**](ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi.md#createPortMirroringSessions) | **POST** /mirror-sessions | Create a mirror session
[**deletePortMirroringSession**](ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi.md#deletePortMirroringSession) | **DELETE** /mirror-sessions/{mirror-session-id} | Delete the mirror session
[**getPortMirroringSession**](ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi.md#getPortMirroringSession) | **GET** /mirror-sessions/{mirror-session-id} | Get the mirror session
[**listPortMirroringSession**](ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi.md#listPortMirroringSession) | **GET** /mirror-sessions | List all mirror sessions
[**updatePortMirroringSession**](ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi.md#updatePortMirroringSession) | **PUT** /mirror-sessions/{mirror-session-id} | Update the mirror session
[**verifyPortMirroringSessionVerify**](ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi.md#verifyPortMirroringSessionVerify) | **POST** /mirror-sessions/{mirror-session-id}?action&#x3D;verify | Verify whether the mirror session is still valid

<a name="createPortMirroringSessions"></a>
# **createPortMirroringSessions**
> PortMirroringSession createPortMirroringSessions(body)

Create a mirror session

Create a mirror session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi();
PortMirroringSession body = new PortMirroringSession(); // PortMirroringSession | 
try {
    PortMirroringSession result = apiInstance.createPortMirroringSessions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi#createPortMirroringSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortMirroringSession**](PortMirroringSession.md)|  |

### Return type

[**PortMirroringSession**](PortMirroringSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortMirroringSession"></a>
# **deletePortMirroringSession**
> deletePortMirroringSession(mirrorSessionId)

Delete the mirror session

Delete the mirror session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi();
String mirrorSessionId = "mirrorSessionId_example"; // String | 
try {
    apiInstance.deletePortMirroringSession(mirrorSessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi#deletePortMirroringSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mirrorSessionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortMirroringSession"></a>
# **getPortMirroringSession**
> PortMirroringSession getPortMirroringSession(mirrorSessionId)

Get the mirror session

Get the mirror session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi();
String mirrorSessionId = "mirrorSessionId_example"; // String | 
try {
    PortMirroringSession result = apiInstance.getPortMirroringSession(mirrorSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi#getPortMirroringSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mirrorSessionId** | **String**|  |

### Return type

[**PortMirroringSession**](PortMirroringSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPortMirroringSession"></a>
# **listPortMirroringSession**
> PortMirroringSessionListResult listPortMirroringSession(cursor, includedFields, pageSize, sortAscending, sortBy)

List all mirror sessions

List all mirror sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    PortMirroringSessionListResult result = apiInstance.listPortMirroringSession(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi#listPortMirroringSession");
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

[**PortMirroringSessionListResult**](PortMirroringSessionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePortMirroringSession"></a>
# **updatePortMirroringSession**
> PortMirroringSession updatePortMirroringSession(body, mirrorSessionId)

Update the mirror session

Update the mirror session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi();
PortMirroringSession body = new PortMirroringSession(); // PortMirroringSession | 
String mirrorSessionId = "mirrorSessionId_example"; // String | 
try {
    PortMirroringSession result = apiInstance.updatePortMirroringSession(body, mirrorSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi#updatePortMirroringSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortMirroringSession**](PortMirroringSession.md)|  |
 **mirrorSessionId** | **String**|  |

### Return type

[**PortMirroringSession**](PortMirroringSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyPortMirroringSessionVerify"></a>
# **verifyPortMirroringSessionVerify**
> verifyPortMirroringSessionVerify(mirrorSessionId)

Verify whether the mirror session is still valid

Verify whether all participants are on the same transport node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi();
String mirrorSessionId = "mirrorSessionId_example"; // String | 
try {
    apiInstance.verifyPortMirroringSessionVerify(mirrorSessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPortMirroringApi#verifyPortMirroringSessionVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mirrorSessionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

