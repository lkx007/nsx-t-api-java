# ManagementPlaneApiApiServicesTaskManagementApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listTasks**](ManagementPlaneApiApiServicesTaskManagementApi.md#listTasks) | **GET** /tasks | Get information about all tasks
[**readTaskProperties**](ManagementPlaneApiApiServicesTaskManagementApi.md#readTaskProperties) | **GET** /tasks/{task-id} | Get information about the specified task
[**readTaskResult**](ManagementPlaneApiApiServicesTaskManagementApi.md#readTaskResult) | **GET** /tasks/{task-id}/response | Get the response of a task

<a name="listTasks"></a>
# **listTasks**
> TaskListResult listTasks(cursor, includedFields, pageSize, requestUri, sortAscending, sortBy, status, user)

Get information about all tasks

Get information about all tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApiServicesTaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApiServicesTaskManagementApi apiInstance = new ManagementPlaneApiApiServicesTaskManagementApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String requestUri = "requestUri_example"; // String | Request URI(s) to include in query result
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String status = "status_example"; // String | Status(es) to include in query result
String user = "user_example"; // String | Names of users to include in query result
try {
    TaskListResult result = apiInstance.listTasks(cursor, includedFields, pageSize, requestUri, sortAscending, sortBy, status, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApiServicesTaskManagementApi#listTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **requestUri** | **String**| Request URI(s) to include in query result | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **status** | **String**| Status(es) to include in query result | [optional]
 **user** | **String**| Names of users to include in query result | [optional]

### Return type

[**TaskListResult**](TaskListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readTaskProperties"></a>
# **readTaskProperties**
> TaskProperties readTaskProperties(taskId)

Get information about the specified task

Get information about the specified task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApiServicesTaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApiServicesTaskManagementApi apiInstance = new ManagementPlaneApiApiServicesTaskManagementApi();
String taskId = "taskId_example"; // String | ID of task to read
try {
    TaskProperties result = apiInstance.readTaskProperties(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApiServicesTaskManagementApi#readTaskProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ID of task to read |

### Return type

[**TaskProperties**](TaskProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readTaskResult"></a>
# **readTaskResult**
> Object readTaskResult(taskId)

Get the response of a task

Get the response of a task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApiServicesTaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApiServicesTaskManagementApi apiInstance = new ManagementPlaneApiApiServicesTaskManagementApi();
String taskId = "taskId_example"; // String | ID of task to read
try {
    Object result = apiInstance.readTaskResult(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApiServicesTaskManagementApi#readTaskResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ID of task to read |

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

