# ManagementPlaneApiNormalizationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNormalizations**](ManagementPlaneApiNormalizationApi.md#getNormalizations) | **GET** /normalizations | Get normalizations based on the query parameters

<a name="getNormalizations"></a>
# **getNormalizations**
> NormalizedResourceListResult getNormalizations(preferredNormalizationType, resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy)

Get normalizations based on the query parameters

Returns the list of normalized resources based on the query parameters. Id and Type of the resource on which the normalizations is to be performed, are to be specified as query parameters in the URI. The target resource types to which normalization is to be done should also be specified as query parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNormalizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNormalizationApi apiInstance = new ManagementPlaneApiNormalizationApi();
String preferredNormalizationType = "preferredNormalizationType_example"; // String | Resource type valid for use as target in normalization API.
String resourceId = "resourceId_example"; // String | Identifier of the resource on which normalization is to be performed
String resourceType = "resourceType_example"; // String | Resource type valid for use as source in normalization API.
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NormalizedResourceListResult result = apiInstance.getNormalizations(preferredNormalizationType, resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNormalizationApi#getNormalizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preferredNormalizationType** | **String**| Resource type valid for use as target in normalization API. | [enum: NSGroup, IPSet, MACSet, LogicalSwitch, LogicalPort, DirectoryGroup]
 **resourceId** | **String**| Identifier of the resource on which normalization is to be performed |
 **resourceType** | **String**| Resource type valid for use as source in normalization API. | [enum: NSGroup]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NormalizedResourceListResult**](NormalizedResourceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

