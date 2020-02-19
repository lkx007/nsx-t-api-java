# ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPacketCaptureSession**](ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi.md#createPacketCaptureSession) | **POST** /pktcap/session | Create an new packet capture session
[**deleteAllCaptureSessionsDelete**](ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi.md#deleteAllCaptureSessionsDelete) | **POST** /pktcap/sessions?action&#x3D;delete | Delete all the packet capture sessions
[**deletePacketCaptureSessionDelete**](ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi.md#deletePacketCaptureSessionDelete) | **POST** /pktcap/session/{session-id}?action&#x3D;delete | Delete the packet capture session by session id.
[**listPacketCaptureSessions**](ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi.md#listPacketCaptureSessions) | **GET** /pktcap/sessions | Get the information of all packet capture sessions
[**readPacketCaptureSession**](ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi.md#readPacketCaptureSession) | **GET** /pktcap/session/{session-id} | Get the status of packet capture session
[**restartPacketCaptureSessionRestart**](ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi.md#restartPacketCaptureSessionRestart) | **POST** /pktcap/session/{session-id}?action&#x3D;restart | Restart the packet capture session
[**terminatePacketCaptureSessionTerminate**](ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi.md#terminatePacketCaptureSessionTerminate) | **POST** /pktcap/session/{session-id}?action&#x3D;terminate | Terminate the packet capture session by session id

<a name="createPacketCaptureSession"></a>
# **createPacketCaptureSession**
> PacketCaptureSession createPacketCaptureSession(body)

Create an new packet capture session

Create an new packet capture session on given node with specified options 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi();
PacketCaptureRequest body = new PacketCaptureRequest(); // PacketCaptureRequest | 
try {
    PacketCaptureSession result = apiInstance.createPacketCaptureSession(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi#createPacketCaptureSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PacketCaptureRequest**](PacketCaptureRequest.md)|  |

### Return type

[**PacketCaptureSession**](PacketCaptureSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllCaptureSessionsDelete"></a>
# **deleteAllCaptureSessionsDelete**
> PacketCaptureSessionList deleteAllCaptureSessionsDelete()

Delete all the packet capture sessions

Delete all the packet capture sessions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi();
try {
    PacketCaptureSessionList result = apiInstance.deleteAllCaptureSessionsDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi#deleteAllCaptureSessionsDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PacketCaptureSessionList**](PacketCaptureSessionList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePacketCaptureSessionDelete"></a>
# **deletePacketCaptureSessionDelete**
> PacketCaptureSession deletePacketCaptureSessionDelete(sessionId)

Delete the packet capture session by session id.

Before calling this method, terminate any running capture session. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi();
String sessionId = "sessionId_example"; // String | Packet capture session id
try {
    PacketCaptureSession result = apiInstance.deletePacketCaptureSessionDelete(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi#deletePacketCaptureSessionDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Packet capture session id |

### Return type

[**PacketCaptureSession**](PacketCaptureSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPacketCaptureSessions"></a>
# **listPacketCaptureSessions**
> PacketCaptureSessionList listPacketCaptureSessions()

Get the information of all packet capture sessions

Get the information of all packet capture sessions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi();
try {
    PacketCaptureSessionList result = apiInstance.listPacketCaptureSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi#listPacketCaptureSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PacketCaptureSessionList**](PacketCaptureSessionList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPacketCaptureSession"></a>
# **readPacketCaptureSession**
> PacketCaptureSession readPacketCaptureSession(sessionId)

Get the status of packet capture session

Get the packet capture status information by session id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi();
String sessionId = "sessionId_example"; // String | Packet capture session id
try {
    PacketCaptureSession result = apiInstance.readPacketCaptureSession(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi#readPacketCaptureSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Packet capture session id |

### Return type

[**PacketCaptureSession**](PacketCaptureSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restartPacketCaptureSessionRestart"></a>
# **restartPacketCaptureSessionRestart**
> PacketCaptureSession restartPacketCaptureSessionRestart(sessionId)

Restart the packet capture session

Restart the packet capture session 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi();
String sessionId = "sessionId_example"; // String | Packet capture session id
try {
    PacketCaptureSession result = apiInstance.restartPacketCaptureSessionRestart(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi#restartPacketCaptureSessionRestart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Packet capture session id |

### Return type

[**PacketCaptureSession**](PacketCaptureSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="terminatePacketCaptureSessionTerminate"></a>
# **terminatePacketCaptureSessionTerminate**
> PacketCaptureSession terminatePacketCaptureSessionTerminate(sessionId)

Terminate the packet capture session by session id

Terminate the packet capture session by session id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi();
String sessionId = "sessionId_example"; // String | Packet capture session id
try {
    PacketCaptureSession result = apiInstance.terminatePacketCaptureSessionTerminate(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringPacketCaptureApi#terminatePacketCaptureSessionTerminate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Packet capture session id |

### Return type

[**PacketCaptureSession**](PacketCaptureSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

