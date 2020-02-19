# ManagementPlaneApiPoolManagementVtepLabelPoolsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listVtepLabelPools**](ManagementPlaneApiPoolManagementVtepLabelPoolsApi.md#listVtepLabelPools) | **GET** /pools/vtep-label-pools | List virtual tunnel endpoint Label Pools
[**readVtepLabelPool**](ManagementPlaneApiPoolManagementVtepLabelPoolsApi.md#readVtepLabelPool) | **GET** /pools/vtep-label-pools/{pool-id} | Read a virtual tunnel endpoint label pool

<a name="listVtepLabelPools"></a>
# **listVtepLabelPools**
> VtepLabelPoolListResult listVtepLabelPools(cursor, includedFields, pageSize, sortAscending, sortBy)

List virtual tunnel endpoint Label Pools

Returns a list of all virtual tunnel endpoint label pools 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementVtepLabelPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementVtepLabelPoolsApi apiInstance = new ManagementPlaneApiPoolManagementVtepLabelPoolsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VtepLabelPoolListResult result = apiInstance.listVtepLabelPools(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementVtepLabelPoolsApi#listVtepLabelPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**VtepLabelPoolListResult**](VtepLabelPoolListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readVtepLabelPool"></a>
# **readVtepLabelPool**
> VtepLabelPool readVtepLabelPool(poolId)

Read a virtual tunnel endpoint label pool

Returns information about the specified virtual tunnel endpoint label pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementVtepLabelPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementVtepLabelPoolsApi apiInstance = new ManagementPlaneApiPoolManagementVtepLabelPoolsApi();
String poolId = "poolId_example"; // String | Virtual tunnel endpoint label pool ID
try {
    VtepLabelPool result = apiInstance.readVtepLabelPool(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementVtepLabelPoolsApi#readVtepLabelPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Virtual tunnel endpoint label pool ID |

### Return type

[**VtepLabelPool**](VtepLabelPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

