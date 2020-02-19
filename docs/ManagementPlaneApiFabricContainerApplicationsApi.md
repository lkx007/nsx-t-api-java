# ManagementPlaneApiFabricContainerApplicationsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContainerApplication**](ManagementPlaneApiFabricContainerApplicationsApi.md#getContainerApplication) | **GET** /fabric/container-applications/{container-application-id} | Return a Container Application within a container project
[**getContainerApplicationInstance**](ManagementPlaneApiFabricContainerApplicationsApi.md#getContainerApplicationInstance) | **GET** /fabric/container-application-instances/{container-application-instance-id} | Return a container application instance
[**listContainerApplicationInstances**](ManagementPlaneApiFabricContainerApplicationsApi.md#listContainerApplicationInstances) | **GET** /fabric/container-application-instances | Return the list of container application instance
[**listContainerApplications**](ManagementPlaneApiFabricContainerApplicationsApi.md#listContainerApplications) | **GET** /fabric/container-applications | Return the List of Container Applications

<a name="getContainerApplication"></a>
# **getContainerApplication**
> ContainerApplication getContainerApplication(containerApplicationId)

Return a Container Application within a container project

Returns information about a specific Container Application within a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerApplicationsApi apiInstance = new ManagementPlaneApiFabricContainerApplicationsApi();
String containerApplicationId = "containerApplicationId_example"; // String | 
try {
    ContainerApplication result = apiInstance.getContainerApplication(containerApplicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerApplicationsApi#getContainerApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerApplicationId** | **String**|  |

### Return type

[**ContainerApplication**](ContainerApplication.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContainerApplicationInstance"></a>
# **getContainerApplicationInstance**
> ContainerApplicationInstance getContainerApplicationInstance(containerApplicationInstanceId)

Return a container application instance

Returns information about a specific container application instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerApplicationsApi apiInstance = new ManagementPlaneApiFabricContainerApplicationsApi();
String containerApplicationInstanceId = "containerApplicationInstanceId_example"; // String | 
try {
    ContainerApplicationInstance result = apiInstance.getContainerApplicationInstance(containerApplicationInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerApplicationsApi#getContainerApplicationInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerApplicationInstanceId** | **String**|  |

### Return type

[**ContainerApplicationInstance**](ContainerApplicationInstance.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContainerApplicationInstances"></a>
# **listContainerApplicationInstances**
> ContainerApplicationInstanceListResult listContainerApplicationInstances(containerApplicationId, containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy)

Return the list of container application instance

Returns information about all container application instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerApplicationsApi apiInstance = new ManagementPlaneApiFabricContainerApplicationsApi();
String containerApplicationId = "containerApplicationId_example"; // String | Identifier of the container application
String containerClusterId = "containerClusterId_example"; // String | Identifier of the container cluster
String containerProjectId = "containerProjectId_example"; // String | Identifier of the container project
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ContainerApplicationInstanceListResult result = apiInstance.listContainerApplicationInstances(containerApplicationId, containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerApplicationsApi#listContainerApplicationInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerApplicationId** | **String**| Identifier of the container application | [optional]
 **containerClusterId** | **String**| Identifier of the container cluster | [optional]
 **containerProjectId** | **String**| Identifier of the container project | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ContainerApplicationInstanceListResult**](ContainerApplicationInstanceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContainerApplications"></a>
# **listContainerApplications**
> ContainerApplicationListResult listContainerApplications(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy)

Return the List of Container Applications

Returns information about all Container Applications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerApplicationsApi apiInstance = new ManagementPlaneApiFabricContainerApplicationsApi();
String containerClusterId = "containerClusterId_example"; // String | Identifier of the container cluster
String containerProjectId = "containerProjectId_example"; // String | Identifier of the container project
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ContainerApplicationListResult result = apiInstance.listContainerApplications(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerApplicationsApi#listContainerApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerClusterId** | **String**| Identifier of the container cluster | [optional]
 **containerProjectId** | **String**| Identifier of the container project | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ContainerApplicationListResult**](ContainerApplicationListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

