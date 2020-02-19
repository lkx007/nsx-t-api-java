# ManagementPlaneApiUpgradeNodesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNodes**](ManagementPlaneApiUpgradeNodesApi.md#getNodes) | **GET** /upgrade/nodes | Get list of nodes across all types
[**getNodesSummary**](ManagementPlaneApiUpgradeNodesApi.md#getNodesSummary) | **GET** /upgrade/nodes-summary | Get summary of nodes
[**getVersionWhitelist**](ManagementPlaneApiUpgradeNodesApi.md#getVersionWhitelist) | **GET** /upgrade/version-whitelist | Get the version whitelist
[**getVersionWhitelistByComponent**](ManagementPlaneApiUpgradeNodesApi.md#getVersionWhitelistByComponent) | **GET** /upgrade/version-whitelist/{component_type} | Get the version whitelist for the specified component
[**updateVersionWhitelist**](ManagementPlaneApiUpgradeNodesApi.md#updateVersionWhitelist) | **PUT** /upgrade/version-whitelist/{component_type} | Update the version whitelist for the specified component type

<a name="getNodes"></a>
# **getNodes**
> NodeInfoListResult getNodes(componentType, componentVersion, cursor, includedFields, pageSize, sortAscending, sortBy)

Get list of nodes across all types

Get list of nodes. If request parameter component type is specified, then all nodes for that component will be returned. If request parameter component version is specified, then all nodes at that version will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeNodesApi apiInstance = new ManagementPlaneApiUpgradeNodesApi();
String componentType = "componentType_example"; // String | Component type based on which nodes will be filtered
String componentVersion = "componentVersion_example"; // String | Component version based on which nodes will be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NodeInfoListResult result = apiInstance.getNodes(componentType, componentVersion, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeNodesApi#getNodes");
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

<a name="getNodesSummary"></a>
# **getNodesSummary**
> NodeSummaryList getNodesSummary()

Get summary of nodes

Get summary of nodes, which includes node count for each type and component version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeNodesApi apiInstance = new ManagementPlaneApiUpgradeNodesApi();
try {
    NodeSummaryList result = apiInstance.getNodesSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeNodesApi#getNodesSummary");
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

<a name="getVersionWhitelist"></a>
# **getVersionWhitelist**
> AcceptableComponentVersionList getVersionWhitelist()

Get the version whitelist

Get whitelist of versions for different components

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeNodesApi apiInstance = new ManagementPlaneApiUpgradeNodesApi();
try {
    AcceptableComponentVersionList result = apiInstance.getVersionWhitelist();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeNodesApi#getVersionWhitelist");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AcceptableComponentVersionList**](AcceptableComponentVersionList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVersionWhitelistByComponent"></a>
# **getVersionWhitelistByComponent**
> AcceptableComponentVersion getVersionWhitelistByComponent(componentType)

Get the version whitelist for the specified component

Get whitelist of versions for a component. Component can include HOST, EDGE, CCP, MP

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeNodesApi apiInstance = new ManagementPlaneApiUpgradeNodesApi();
String componentType = "componentType_example"; // String | 
try {
    AcceptableComponentVersion result = apiInstance.getVersionWhitelistByComponent(componentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeNodesApi#getVersionWhitelistByComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**|  |

### Return type

[**AcceptableComponentVersion**](AcceptableComponentVersion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVersionWhitelist"></a>
# **updateVersionWhitelist**
> updateVersionWhitelist(body, componentType)

Update the version whitelist for the specified component type

Update the version whitelist for the specified component type (HOST, EDGE, CCP, MP).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeNodesApi apiInstance = new ManagementPlaneApiUpgradeNodesApi();
VersionList body = new VersionList(); // VersionList | 
String componentType = "componentType_example"; // String | 
try {
    apiInstance.updateVersionWhitelist(body, componentType);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeNodesApi#updateVersionWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionList**](VersionList.md)|  |
 **componentType** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

