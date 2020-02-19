# ManagementPlaneApiFabricContainerProjectsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContainerProject**](ManagementPlaneApiFabricContainerProjectsApi.md#getContainerProject) | **GET** /fabric/container-projects/{container-project-id} | Return a container project
[**listContainerProjects**](ManagementPlaneApiFabricContainerProjectsApi.md#listContainerProjects) | **GET** /fabric/container-projects | Return the list of container projects

<a name="getContainerProject"></a>
# **getContainerProject**
> ContainerProject getContainerProject(containerProjectId)

Return a container project

Returns information about a specific project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerProjectsApi apiInstance = new ManagementPlaneApiFabricContainerProjectsApi();
String containerProjectId = "containerProjectId_example"; // String | 
try {
    ContainerProject result = apiInstance.getContainerProject(containerProjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerProjectsApi#getContainerProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerProjectId** | **String**|  |

### Return type

[**ContainerProject**](ContainerProject.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContainerProjects"></a>
# **listContainerProjects**
> ContainerProjectListResult listContainerProjects(containerClusterId, cursor, includedFields, pageSize, sortAscending, sortBy)

Return the list of container projects

Returns information about all container projects

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerProjectsApi apiInstance = new ManagementPlaneApiFabricContainerProjectsApi();
String containerClusterId = "containerClusterId_example"; // String | Identifier of the container cluster
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ContainerProjectListResult result = apiInstance.listContainerProjects(containerClusterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerProjectsApi#listContainerProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerClusterId** | **String**| Identifier of the container cluster | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ContainerProjectListResult**](ContainerProjectListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

