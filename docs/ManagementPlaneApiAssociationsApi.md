# ManagementPlaneApiAssociationsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssociations**](ManagementPlaneApiAssociationsApi.md#getAssociations) | **GET** /associations | Get ResourceReference objects to which the given resource belongs to 

<a name="getAssociations"></a>
# **getAssociations**
> AssociationListResult getAssociations(associatedResourceType, resourceId, resourceType, cursor, fetchAncestors, includedFields, pageSize, sortAscending, sortBy)

Get ResourceReference objects to which the given resource belongs to 

Returns information about resources that are associated with the given resource. Id and type of the resource for which associated resources are to be fetched are to be specified as query parameter in the URI. Resource type of the associated resources must be specified as query parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAssociationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAssociationsApi apiInstance = new ManagementPlaneApiAssociationsApi();
String associatedResourceType = "associatedResourceType_example"; // String | Resource type valid for use as target in association API
String resourceId = "resourceId_example"; // String | The resource for which associated resources are to be fetched
String resourceType = "resourceType_example"; // String | Resource type valid for use as source in association API
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean fetchAncestors = true; // Boolean | Fetch complete list of associated resources considering containment and nesting 
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    AssociationListResult result = apiInstance.getAssociations(associatedResourceType, resourceId, resourceType, cursor, fetchAncestors, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAssociationsApi#getAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associatedResourceType** | **String**| Resource type valid for use as target in association API | [enum: NSGroup]
 **resourceId** | **String**| The resource for which associated resources are to be fetched |
 **resourceType** | **String**| Resource type valid for use as source in association API | [enum: NSGroup, IPSet, MACSet, LogicalSwitch, LogicalPort, VirtualMachine, DirectoryGroup, VirtualNetworkInterface, TransportNode]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **fetchAncestors** | **Boolean**| Fetch complete list of associated resources considering containment and nesting  | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**AssociationListResult**](AssociationListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

