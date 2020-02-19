# ManagementPlaneApiPoolManagementIpPoolsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocateOrReleaseFromIpPool**](ManagementPlaneApiPoolManagementIpPoolsApi.md#allocateOrReleaseFromIpPool) | **POST** /pools/ip-pools/{pool-id} | Allocate or Release an IP Address from a Pool
[**createIpPool**](ManagementPlaneApiPoolManagementIpPoolsApi.md#createIpPool) | **POST** /pools/ip-pools | Create an IP Pool
[**deleteIpPool**](ManagementPlaneApiPoolManagementIpPoolsApi.md#deleteIpPool) | **DELETE** /pools/ip-pools/{pool-id} | Delete an IP Pool
[**listIpPoolAllocations**](ManagementPlaneApiPoolManagementIpPoolsApi.md#listIpPoolAllocations) | **GET** /pools/ip-pools/{pool-id}/allocations | List IP Pool Allocations
[**listIpPools**](ManagementPlaneApiPoolManagementIpPoolsApi.md#listIpPools) | **GET** /pools/ip-pools | List IP Pools
[**readIpPool**](ManagementPlaneApiPoolManagementIpPoolsApi.md#readIpPool) | **GET** /pools/ip-pools/{pool-id} | Read IP Pool
[**updateIpPool**](ManagementPlaneApiPoolManagementIpPoolsApi.md#updateIpPool) | **PUT** /pools/ip-pools/{pool-id} | Update an IP Pool

<a name="allocateOrReleaseFromIpPool"></a>
# **allocateOrReleaseFromIpPool**
> AllocationIpAddress allocateOrReleaseFromIpPool(body, action, poolId)

Allocate or Release an IP Address from a Pool

Allocates or releases an IP address from the specified IP pool. To allocate an address, include ?action&#x3D;ALLOCATE in the request and \&quot;allocation_id\&quot;:null in the request body. When the request is successful, the response is \&quot;allocation_id\&quot;: \&quot;&lt;ip-address&gt;\&quot;, where &lt;ip-address&gt; is an IP address from the specified pool. To release an IP address (return it back to the pool), include ?action&#x3D;RELEASE in the request and \&quot;allocation_id\&quot;:&lt;ip-address&gt; in the request body, where &lt;ip-address&gt; is the address to be released. When the request is successful, the response is NULL. Tags, display_name and description attributes are not supported for AllocationIpAddress in this release. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpPoolsApi apiInstance = new ManagementPlaneApiPoolManagementIpPoolsApi();
AllocationIpAddress body = new AllocationIpAddress(); // AllocationIpAddress | 
String action = "action_example"; // String | Specifies allocate or release action
String poolId = "poolId_example"; // String | IP pool ID
try {
    AllocationIpAddress result = apiInstance.allocateOrReleaseFromIpPool(body, action, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpPoolsApi#allocateOrReleaseFromIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AllocationIpAddress**](AllocationIpAddress.md)|  |
 **action** | **String**| Specifies allocate or release action | [enum: ALLOCATE, RELEASE]
 **poolId** | **String**| IP pool ID |

### Return type

[**AllocationIpAddress**](AllocationIpAddress.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIpPool"></a>
# **createIpPool**
> IpPool createIpPool(body)

Create an IP Pool

Creates a new IPv4 or IPv6 address pool. Required parameters are allocation_ranges and cidr. Optional parameters are display_name, description, dns_nameservers, dns_suffix, and gateway_ip. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpPoolsApi apiInstance = new ManagementPlaneApiPoolManagementIpPoolsApi();
IpPool body = new IpPool(); // IpPool | 
try {
    IpPool result = apiInstance.createIpPool(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpPoolsApi#createIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpPool**](IpPool.md)|  |

### Return type

[**IpPool**](IpPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIpPool"></a>
# **deleteIpPool**
> deleteIpPool(poolId, force)

Delete an IP Pool

Deletes the specified IP address pool. By default, if the IpPool is used in other configurations (such as transport node template), it won&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the IpPool

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpPoolsApi apiInstance = new ManagementPlaneApiPoolManagementIpPoolsApi();
String poolId = "poolId_example"; // String | IP pool ID
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIpPool(poolId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpPoolsApi#deleteIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| IP pool ID |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpPoolAllocations"></a>
# **listIpPoolAllocations**
> AllocationIpAddressListResult listIpPoolAllocations(poolId)

List IP Pool Allocations

Returns information about which addresses have been allocated from a specified IP address pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpPoolsApi apiInstance = new ManagementPlaneApiPoolManagementIpPoolsApi();
String poolId = "poolId_example"; // String | IP pool ID
try {
    AllocationIpAddressListResult result = apiInstance.listIpPoolAllocations(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpPoolsApi#listIpPoolAllocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| IP pool ID |

### Return type

[**AllocationIpAddressListResult**](AllocationIpAddressListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpPools"></a>
# **listIpPools**
> IpPoolListResult listIpPools(cursor, includedFields, pageSize, sortAscending, sortBy)

List IP Pools

Returns information about the configured IP address pools. Information includes the display name and description of the pool and the details of each of the subnets in the pool, including the DNS servers, allocation ranges, gateway, and CIDR subnet address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpPoolsApi apiInstance = new ManagementPlaneApiPoolManagementIpPoolsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IpPoolListResult result = apiInstance.listIpPools(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpPoolsApi#listIpPools");
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

[**IpPoolListResult**](IpPoolListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readIpPool"></a>
# **readIpPool**
> IpPool readIpPool(poolId)

Read IP Pool

Returns information about the specified IP address pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpPoolsApi apiInstance = new ManagementPlaneApiPoolManagementIpPoolsApi();
String poolId = "poolId_example"; // String | IP pool ID
try {
    IpPool result = apiInstance.readIpPool(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpPoolsApi#readIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| IP pool ID |

### Return type

[**IpPool**](IpPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIpPool"></a>
# **updateIpPool**
> IpPool updateIpPool(body, poolId)

Update an IP Pool

Modifies the specified IP address pool. Modifiable parameters include the description, display_name, and all subnet information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpPoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpPoolsApi apiInstance = new ManagementPlaneApiPoolManagementIpPoolsApi();
IpPool body = new IpPool(); // IpPool | 
String poolId = "poolId_example"; // String | IP pool ID
try {
    IpPool result = apiInstance.updateIpPool(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpPoolsApi#updateIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpPool**](IpPool.md)|  |
 **poolId** | **String**| IP pool ID |

### Return type

[**IpPool**](IpPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

