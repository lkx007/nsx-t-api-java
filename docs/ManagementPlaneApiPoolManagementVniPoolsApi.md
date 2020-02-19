# ManagementPlaneApiPoolManagementVniPoolsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listVNIPools**](ManagementPlaneApiPoolManagementVniPoolsApi.md#listVNIPools) | **GET** /pools/vni-pools | List VNI Pools
[**readVNIPool**](ManagementPlaneApiPoolManagementVniPoolsApi.md#readVNIPool) | **GET** /pools/vni-pools/{pool-id} | Read VNI Pool
[**updateVNIPool**](ManagementPlaneApiPoolManagementVniPoolsApi.md#updateVNIPool) | **PUT** /pools/vni-pools/{pool-id} | Update a VNI Pool

<a name="listVNIPools"></a>
# **listVNIPools**
> VniPoolListResult listVNIPools(cursor, includedFields, pageSize, sortAscending, sortBy)

List VNI Pools

Returns information about the default and configured virtual network identifier (VNI) pools for use when building logical network segments. Each virtual network has a unique ID called a VNI. Instead of creating a new VNI each time you need a new logical switch, you can instead allocate a VNI from a VNI pool. VNI pools are sometimes called segment ID pools. Each VNI pool has a range of usable VNIs. By default, there is one pool with two ranges [5000, 65535] and [65536, 75000]. To create multiple smaller pools, specify a smaller range for each pool such as 75001-75100 and 75101-75200. The VNI range determines the maximum number of logical switches that can be created in each network segment. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementVniPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementVniPoolsApi apiInstance = new ManagementPlaneApiPoolManagementVniPoolsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VniPoolListResult result = apiInstance.listVNIPools(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementVniPoolsApi#listVNIPools");
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

[**VniPoolListResult**](VniPoolListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readVNIPool"></a>
# **readVNIPool**
> VniPool readVNIPool(poolId)

Read VNI Pool

Returns information about the specified virtual network identifier (VNI) pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementVniPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementVniPoolsApi apiInstance = new ManagementPlaneApiPoolManagementVniPoolsApi();
String poolId = "poolId_example"; // String | VNI pool ID
try {
    VniPool result = apiInstance.readVNIPool(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementVniPoolsApi#readVNIPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| VNI pool ID |

### Return type

[**VniPool**](VniPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVNIPool"></a>
# **updateVNIPool**
> VniPool updateVNIPool(body, poolId)

Update a VNI Pool

Updates the specified VNI pool. Modifiable parameters include description, display_name and ranges. Ranges can be added, modified or deleted. Overlapping ranges are not allowed. Only range end can be modified for any existing range. Range shrinking or deletion is not allowed if there are any allocated VNIs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementVniPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementVniPoolsApi apiInstance = new ManagementPlaneApiPoolManagementVniPoolsApi();
VniPool body = new VniPool(); // VniPool | 
String poolId = "poolId_example"; // String | VNI pool ID
try {
    VniPool result = apiInstance.updateVNIPool(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementVniPoolsApi#updateVNIPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VniPool**](VniPool.md)|  |
 **poolId** | **String**| VNI pool ID |

### Return type

[**VniPool**](VniPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

