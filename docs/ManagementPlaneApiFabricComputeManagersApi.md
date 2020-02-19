# ManagementPlaneApiFabricComputeManagersApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addComputeManager**](ManagementPlaneApiFabricComputeManagersApi.md#addComputeManager) | **POST** /fabric/compute-managers | Register compute manager with NSX
[**deleteComputeManager**](ManagementPlaneApiFabricComputeManagersApi.md#deleteComputeManager) | **DELETE** /fabric/compute-managers/{compute-manager-id} | Unregister a compute manager
[**getComputeManagerState**](ManagementPlaneApiFabricComputeManagersApi.md#getComputeManagerState) | **GET** /fabric/compute-managers/{compute-manager-id}/state | Get the realized state of a compute manager
[**listComputeManagers**](ManagementPlaneApiFabricComputeManagersApi.md#listComputeManagers) | **GET** /fabric/compute-managers | Return the List of Compute managers
[**readComputeManager**](ManagementPlaneApiFabricComputeManagersApi.md#readComputeManager) | **GET** /fabric/compute-managers/{compute-manager-id} | Return compute manager Information
[**readComputeManagerStatus**](ManagementPlaneApiFabricComputeManagersApi.md#readComputeManagerStatus) | **GET** /fabric/compute-managers/{compute-manager-id}/status | Return runtime status information for a compute manager
[**updateComputeManager**](ManagementPlaneApiFabricComputeManagersApi.md#updateComputeManager) | **PUT** /fabric/compute-managers/{compute-manager-id} | Update compute manager

<a name="addComputeManager"></a>
# **addComputeManager**
> ComputeManager addComputeManager(body)

Register compute manager with NSX

Registers compute manager with NSX. Inventory service will collect data from the registered compute manager 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeManagersApi apiInstance = new ManagementPlaneApiFabricComputeManagersApi();
ComputeManager body = new ComputeManager(); // ComputeManager | 
try {
    ComputeManager result = apiInstance.addComputeManager(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeManagersApi#addComputeManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComputeManager**](ComputeManager.md)|  |

### Return type

[**ComputeManager**](ComputeManager.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteComputeManager"></a>
# **deleteComputeManager**
> deleteComputeManager(computeManagerId)

Unregister a compute manager

Unregisters a specified compute manager 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeManagersApi apiInstance = new ManagementPlaneApiFabricComputeManagersApi();
String computeManagerId = "computeManagerId_example"; // String | 
try {
    apiInstance.deleteComputeManager(computeManagerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeManagersApi#deleteComputeManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeManagerId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComputeManagerState"></a>
# **getComputeManagerState**
> ConfigurationState getComputeManagerState(computeManagerId)

Get the realized state of a compute manager

Get the realized state of a compute manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeManagersApi apiInstance = new ManagementPlaneApiFabricComputeManagersApi();
String computeManagerId = "computeManagerId_example"; // String | 
try {
    ConfigurationState result = apiInstance.getComputeManagerState(computeManagerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeManagersApi#getComputeManagerState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeManagerId** | **String**|  |

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listComputeManagers"></a>
# **listComputeManagers**
> ComputeManagerListResult listComputeManagers(cursor, includedFields, originType, pageSize, server, sortAscending, sortBy)

Return the List of Compute managers

Returns information about all compute managers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeManagersApi apiInstance = new ManagementPlaneApiFabricComputeManagersApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String originType = "originType_example"; // String | Compute manager type like vCenter
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String server = "server_example"; // String | IP address or hostname of compute manager
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ComputeManagerListResult result = apiInstance.listComputeManagers(cursor, includedFields, originType, pageSize, server, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeManagersApi#listComputeManagers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **originType** | **String**| Compute manager type like vCenter | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **server** | **String**| IP address or hostname of compute manager | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ComputeManagerListResult**](ComputeManagerListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readComputeManager"></a>
# **readComputeManager**
> ComputeManager readComputeManager(computeManagerId)

Return compute manager Information

Returns information about a specific compute manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeManagersApi apiInstance = new ManagementPlaneApiFabricComputeManagersApi();
String computeManagerId = "computeManagerId_example"; // String | 
try {
    ComputeManager result = apiInstance.readComputeManager(computeManagerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeManagersApi#readComputeManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeManagerId** | **String**|  |

### Return type

[**ComputeManager**](ComputeManager.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readComputeManagerStatus"></a>
# **readComputeManagerStatus**
> ComputeManagerStatus readComputeManagerStatus(computeManagerId)

Return runtime status information for a compute manager

Returns connection and version information about a compute manager 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeManagersApi apiInstance = new ManagementPlaneApiFabricComputeManagersApi();
String computeManagerId = "computeManagerId_example"; // String | 
try {
    ComputeManagerStatus result = apiInstance.readComputeManagerStatus(computeManagerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeManagersApi#readComputeManagerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeManagerId** | **String**|  |

### Return type

[**ComputeManagerStatus**](ComputeManagerStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateComputeManager"></a>
# **updateComputeManager**
> ComputeManager updateComputeManager(body, computeManagerId)

Update compute manager

Updates a specified compute manager 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeManagersApi apiInstance = new ManagementPlaneApiFabricComputeManagersApi();
ComputeManager body = new ComputeManager(); // ComputeManager | 
String computeManagerId = "computeManagerId_example"; // String | 
try {
    ComputeManager result = apiInstance.updateComputeManager(body, computeManagerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeManagersApi#updateComputeManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComputeManager**](ComputeManager.md)|  |
 **computeManagerId** | **String**|  |

### Return type

[**ComputeManager**](ComputeManager.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

