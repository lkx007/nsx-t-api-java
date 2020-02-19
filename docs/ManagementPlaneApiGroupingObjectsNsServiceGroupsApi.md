# ManagementPlaneApiGroupingObjectsNsServiceGroupsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNSServiceGroup**](ManagementPlaneApiGroupingObjectsNsServiceGroupsApi.md#createNSServiceGroup) | **POST** /ns-service-groups | Create NSServiceGroup
[**deleteNSServiceGroup**](ManagementPlaneApiGroupingObjectsNsServiceGroupsApi.md#deleteNSServiceGroup) | **DELETE** /ns-service-groups/{ns-service-group-id} | Delete NSServiceGroup
[**listNSServiceGroups**](ManagementPlaneApiGroupingObjectsNsServiceGroupsApi.md#listNSServiceGroups) | **GET** /ns-service-groups | List all NSServiceGroups
[**readNSServiceGroup**](ManagementPlaneApiGroupingObjectsNsServiceGroupsApi.md#readNSServiceGroup) | **GET** /ns-service-groups/{ns-service-group-id} | Read NSServiceGroup
[**updateNSServiceGroup**](ManagementPlaneApiGroupingObjectsNsServiceGroupsApi.md#updateNSServiceGroup) | **PUT** /ns-service-groups/{ns-service-group-id} | Update NSServiceGroup

<a name="createNSServiceGroup"></a>
# **createNSServiceGroup**
> NSServiceGroup createNSServiceGroup(body)

Create NSServiceGroup

Creates a new NSServiceGroup which can contain NSServices. A given NSServiceGroup can contain either only ether type of NSServices or only non-ether type of NSServices, i.e. an NSServiceGroup cannot contain a mix of both ether and non-ether types of NSServices. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServiceGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServiceGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServiceGroupsApi();
NSServiceGroup body = new NSServiceGroup(); // NSServiceGroup | 
try {
    NSServiceGroup result = apiInstance.createNSServiceGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServiceGroupsApi#createNSServiceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSServiceGroup**](NSServiceGroup.md)|  |

### Return type

[**NSServiceGroup**](NSServiceGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNSServiceGroup"></a>
# **deleteNSServiceGroup**
> deleteNSServiceGroup(nsServiceGroupId, force)

Delete NSServiceGroup

Deletes the specified NSServiceGroup. By default, if the NSServiceGroup is consumed in a Firewall rule, it won&#x27;t get deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the NSServiceGroup. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServiceGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServiceGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServiceGroupsApi();
String nsServiceGroupId = "nsServiceGroupId_example"; // String | NSServiceGroup Id
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteNSServiceGroup(nsServiceGroupId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServiceGroupsApi#deleteNSServiceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsServiceGroupId** | **String**| NSServiceGroup Id |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNSServiceGroups"></a>
# **listNSServiceGroups**
> NSServiceGroupListResult listNSServiceGroups(cursor, defaultService, includedFields, pageSize, sortAscending, sortBy)

List all NSServiceGroups

Returns paginated list of NSServiceGroups 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServiceGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServiceGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServiceGroupsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean defaultService = true; // Boolean | Fetch all default NSServiceGroups
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NSServiceGroupListResult result = apiInstance.listNSServiceGroups(cursor, defaultService, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServiceGroupsApi#listNSServiceGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **defaultService** | **Boolean**| Fetch all default NSServiceGroups | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NSServiceGroupListResult**](NSServiceGroupListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNSServiceGroup"></a>
# **readNSServiceGroup**
> NSServiceGroup readNSServiceGroup(nsServiceGroupId)

Read NSServiceGroup

Returns information about the specified NSServiceGroup 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServiceGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServiceGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServiceGroupsApi();
String nsServiceGroupId = "nsServiceGroupId_example"; // String | NSServiceGroup Id
try {
    NSServiceGroup result = apiInstance.readNSServiceGroup(nsServiceGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServiceGroupsApi#readNSServiceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsServiceGroupId** | **String**| NSServiceGroup Id |

### Return type

[**NSServiceGroup**](NSServiceGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNSServiceGroup"></a>
# **updateNSServiceGroup**
> NSServiceGroup updateNSServiceGroup(body, nsServiceGroupId)

Update NSServiceGroup

Updates the specified NSService. Modifiable parameters include the description, display_name and members. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServiceGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServiceGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServiceGroupsApi();
NSServiceGroup body = new NSServiceGroup(); // NSServiceGroup | 
String nsServiceGroupId = "nsServiceGroupId_example"; // String | NSServiceGroup Id
try {
    NSServiceGroup result = apiInstance.updateNSServiceGroup(body, nsServiceGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServiceGroupsApi#updateNSServiceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSServiceGroup**](NSServiceGroup.md)|  |
 **nsServiceGroupId** | **String**| NSServiceGroup Id |

### Return type

[**NSServiceGroup**](NSServiceGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

