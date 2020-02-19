# ManagementPlaneApiApplianceManagementApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNodeLogs**](ManagementPlaneApiApplianceManagementApi.md#listNodeLogs) | **GET** /node/logs | List available node logs
[**readNodeLog**](ManagementPlaneApiApplianceManagementApi.md#readNodeLog) | **GET** /node/logs/{log-name} | Read node log properties
[**readNodeLogData**](ManagementPlaneApiApplianceManagementApi.md#readNodeLogData) | **GET** /node/logs/{log-name}/data | Read node log contents

<a name="listNodeLogs"></a>
# **listNodeLogs**
> NodeLogPropertiesListResult listNodeLogs()

List available node logs

Returns the number of log files and lists the log files that reside on the NSX virtual appliance. The list includes the filename, file size, and last-modified time in milliseconds since epoch (1 January 1970) for each log file. Knowing the last-modified time with millisecond accuracy since epoch is helpful when you are comparing two times, such as the time of a POST request and the end time on a server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApplianceManagementApi apiInstance = new ManagementPlaneApiApplianceManagementApi();
try {
    NodeLogPropertiesListResult result = apiInstance.listNodeLogs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApplianceManagementApi#listNodeLogs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeLogPropertiesListResult**](NodeLogPropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeLog"></a>
# **readNodeLog**
> NodeLogProperties readNodeLog(logName)

Read node log properties

For a single specified log file, lists the filename, file size, and last-modified time. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApplianceManagementApi apiInstance = new ManagementPlaneApiApplianceManagementApi();
String logName = "logName_example"; // String | Name of log file to read properties
try {
    NodeLogProperties result = apiInstance.readNodeLog(logName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApplianceManagementApi#readNodeLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logName** | **String**| Name of log file to read properties |

### Return type

[**NodeLogProperties**](NodeLogProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a name="readNodeLogData"></a>
# **readNodeLogData**
> readNodeLogData(logName)

Read node log contents

For a single specified log file, returns the content of the log file. This method supports byte-range requests. To request just a portion of a log file, supply an HTTP Range header, e.g. \&quot;Range: bytes&#x3D;&lt;start&gt;-&lt;end&gt;\&quot;. &lt;end&gt; is optional, and, if omitted, the file contents from start to the end of the file are returned.&#x27; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApplianceManagementApi apiInstance = new ManagementPlaneApiApplianceManagementApi();
String logName = "logName_example"; // String | Name of log to read
try {
    apiInstance.readNodeLogData(logName);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApplianceManagementApi#readNodeLogData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logName** | **String**| Name of log to read |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

