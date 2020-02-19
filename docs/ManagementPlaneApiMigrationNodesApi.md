# ManagementPlaneApiMigrationNodesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMigrationNodes**](ManagementPlaneApiMigrationNodesApi.md#getMigrationNodes) | **GET** /migration/nodes | Get list of nodes across all types
[**getMigrationNodesSummary**](ManagementPlaneApiMigrationNodesApi.md#getMigrationNodesSummary) | **GET** /migration/nodes-summary | Get summary of nodes

<a name="getMigrationNodes"></a>
# **getMigrationNodes**
> NodeInfoListResult getMigrationNodes(componentType, componentVersion, cursor, includedFields, pageSize, sortAscending, sortBy)

Get list of nodes across all types

Get list of nodes. If request parameter component type is specified, then all nodes for that component will be returned. If request parameter component version is specified, then all nodes at that version will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationNodesApi apiInstance = new ManagementPlaneApiMigrationNodesApi();
String componentType = "componentType_example"; // String | Component type based on which nodes will be filtered
String componentVersion = "componentVersion_example"; // String | Component version based on which nodes will be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NodeInfoListResult result = apiInstance.getMigrationNodes(componentType, componentVersion, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationNodesApi#getMigrationNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which nodes will be filtered | [optional]
 **componentVersion** | **String**| Component version based on which nodes will be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NodeInfoListResult**](NodeInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationNodesSummary"></a>
# **getMigrationNodesSummary**
> NodeSummaryList getMigrationNodesSummary()

Get summary of nodes

Get summary of nodes, which includes node count for each type and component version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationNodesApi apiInstance = new ManagementPlaneApiMigrationNodesApi();
try {
    NodeSummaryList result = apiInstance.getMigrationNodesSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationNodesApi#getMigrationNodesSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeSummaryList**](NodeSummaryList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

