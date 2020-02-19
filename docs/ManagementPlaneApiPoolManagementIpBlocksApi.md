# ManagementPlaneApiPoolManagementIpBlocksApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocateOrReleaseFromIpBlockSubnet**](ManagementPlaneApiPoolManagementIpBlocksApi.md#allocateOrReleaseFromIpBlockSubnet) | **POST** /pools/ip-subnets/{subnet-id} | Allocate or Release an IP Address from a Ip Subnet
[**createIpBlock**](ManagementPlaneApiPoolManagementIpBlocksApi.md#createIpBlock) | **POST** /pools/ip-blocks | Create a new IP address block.
[**createIpBlockSubnet**](ManagementPlaneApiPoolManagementIpBlocksApi.md#createIpBlockSubnet) | **POST** /pools/ip-subnets | Create subnet of specified size within an IP block
[**deleteIpBlock**](ManagementPlaneApiPoolManagementIpBlocksApi.md#deleteIpBlock) | **DELETE** /pools/ip-blocks/{block-id} | Delete an IP Address Block
[**deleteIpBlockSubnet**](ManagementPlaneApiPoolManagementIpBlocksApi.md#deleteIpBlockSubnet) | **DELETE** /pools/ip-subnets/{subnet-id} | Delete subnet within an IP block
[**listIpBlockSubnets**](ManagementPlaneApiPoolManagementIpBlocksApi.md#listIpBlockSubnets) | **GET** /pools/ip-subnets | List subnets within an IP block
[**listIpBlocks**](ManagementPlaneApiPoolManagementIpBlocksApi.md#listIpBlocks) | **GET** /pools/ip-blocks | Returns list of configured IP address blocks.
[**readIpBlock**](ManagementPlaneApiPoolManagementIpBlocksApi.md#readIpBlock) | **GET** /pools/ip-blocks/{block-id} | Get IP address block information.
[**readIpBlockSubnet**](ManagementPlaneApiPoolManagementIpBlocksApi.md#readIpBlockSubnet) | **GET** /pools/ip-subnets/{subnet-id} | Get the subnet within an IP block
[**updateIpBlock**](ManagementPlaneApiPoolManagementIpBlocksApi.md#updateIpBlock) | **PUT** /pools/ip-blocks/{block-id} | Update an IP Address Block

<a name="allocateOrReleaseFromIpBlockSubnet"></a>
# **allocateOrReleaseFromIpBlockSubnet**
> AllocationIpAddress allocateOrReleaseFromIpBlockSubnet(body, action, subnetId)

Allocate or Release an IP Address from a Ip Subnet

Allocates or releases an IP address from the specified IP subnet. To allocate an address, include ?action&#x3D;ALLOCATE in the request and a \&quot;{}\&quot; in the request body. When the request is successful, the response is \&quot;allocation_id\&quot;: \&quot;&lt;ip-address&gt;\&quot;, where &lt;ip-address&gt; is an IP address from the specified pool. To release an IP address (return it back to the pool), include ?action&#x3D;RELEASE in the request and \&quot;allocation_id\&quot;:&lt;ip-address&gt; in the request body, where &lt;ip-address&gt; is the address to be released. When the request is successful, the response is NULL. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
AllocationIpAddress body = new AllocationIpAddress(); // AllocationIpAddress | 
String action = "action_example"; // String | Specifies allocate or release action
String subnetId = "subnetId_example"; // String | IP subnet id
try {
    AllocationIpAddress result = apiInstance.allocateOrReleaseFromIpBlockSubnet(body, action, subnetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#allocateOrReleaseFromIpBlockSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AllocationIpAddress**](AllocationIpAddress.md)|  |
 **action** | **String**| Specifies allocate or release action | [enum: ALLOCATE, RELEASE]
 **subnetId** | **String**| IP subnet id |

### Return type

[**AllocationIpAddress**](AllocationIpAddress.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIpBlock"></a>
# **createIpBlock**
> IpBlock createIpBlock(body)

Create a new IP address block.

Creates a new IPv4 address block using the specified cidr. cidr is a required parameter. display_name &amp; description are optional parameters 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
IpBlock body = new IpBlock(); // IpBlock | 
try {
    IpBlock result = apiInstance.createIpBlock(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#createIpBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpBlock**](IpBlock.md)|  |

### Return type

[**IpBlock**](IpBlock.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIpBlockSubnet"></a>
# **createIpBlockSubnet**
> IpBlockSubnet createIpBlockSubnet(body)

Create subnet of specified size within an IP block

Carves out a subnet of requested size from the specified IP block. The \&quot;size\&quot; parameter  and the \&quot;block_id \&quot; are the requireds field while invoking this API. If the IP block has sufficient resources/space to allocate a subnet of specified size, the response will contain all the details of the newly created subnet including the display_name, description, cidr &amp; allocation_ranges. Returns a conflict error if the IP block does not have enough resources/space to allocate a subnet of the requested size. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
IpBlockSubnet body = new IpBlockSubnet(); // IpBlockSubnet | 
try {
    IpBlockSubnet result = apiInstance.createIpBlockSubnet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#createIpBlockSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpBlockSubnet**](IpBlockSubnet.md)|  |

### Return type

[**IpBlockSubnet**](IpBlockSubnet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIpBlock"></a>
# **deleteIpBlock**
> deleteIpBlock(blockId)

Delete an IP Address Block

Deletes the IP address block with specified id if it exists. IP block cannot be deleted if there are allocated subnets from the block. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
String blockId = "blockId_example"; // String | IP address block id
try {
    apiInstance.deleteIpBlock(blockId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#deleteIpBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockId** | **String**| IP address block id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIpBlockSubnet"></a>
# **deleteIpBlockSubnet**
> deleteIpBlockSubnet(subnetId)

Delete subnet within an IP block

Deletes a subnet with specified id within a given IP address block. Deletion is allowed only when there are no allocated IP addresses from that subnet. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
String subnetId = "subnetId_example"; // String | Subnet id
try {
    apiInstance.deleteIpBlockSubnet(subnetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#deleteIpBlockSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetId** | **String**| Subnet id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpBlockSubnets"></a>
# **listIpBlockSubnets**
> IpBlockSubnetListResult listIpBlockSubnets(blockId, cursor, includedFields, pageSize, sortAscending, sortBy)

List subnets within an IP block

Returns information about all subnets present within an IP address block. Information includes subnet&#x27;s id, display_name, description, cidr and allocation ranges. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
String blockId = "blockId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IpBlockSubnetListResult result = apiInstance.listIpBlockSubnets(blockId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#listIpBlockSubnets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockId** | **String**|  | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IpBlockSubnetListResult**](IpBlockSubnetListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpBlocks"></a>
# **listIpBlocks**
> IpBlockListResult listIpBlocks(cursor, includedFields, pageSize, sortAscending, sortBy)

Returns list of configured IP address blocks.

Returns information about configured IP address blocks. Information includes the id, display name, description &amp; CIDR of IP address blocks 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IpBlockListResult result = apiInstance.listIpBlocks(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#listIpBlocks");
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

[**IpBlockListResult**](IpBlockListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readIpBlock"></a>
# **readIpBlock**
> IpBlock readIpBlock(blockId)

Get IP address block information.

Returns information about the IP address block with specified id. Information includes id, display_name, description &amp; cidr. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
String blockId = "blockId_example"; // String | IP address block id
try {
    IpBlock result = apiInstance.readIpBlock(blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#readIpBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockId** | **String**| IP address block id |

### Return type

[**IpBlock**](IpBlock.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readIpBlockSubnet"></a>
# **readIpBlockSubnet**
> IpBlockSubnet readIpBlockSubnet(subnetId)

Get the subnet within an IP block

Returns information about the subnet with specified id within a given IP address block. Information includes display_name, description, cidr and allocation_ranges. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
String subnetId = "subnetId_example"; // String | Subnet id
try {
    IpBlockSubnet result = apiInstance.readIpBlockSubnet(subnetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#readIpBlockSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetId** | **String**| Subnet id |

### Return type

[**IpBlockSubnet**](IpBlockSubnet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIpBlock"></a>
# **updateIpBlock**
> IpBlock updateIpBlock(body, blockId)

Update an IP Address Block

Modifies the IP address block with specifed id. display_name, description and cidr are parameters that can be modified. If a new cidr is specified, it should contain all existing subnets in the IP block. Returns a conflict error if the IP address block cidr can not be modified due to the presence of subnets that it contains. Eg: If the IP block contains a subnet 192.168.0.1/24 and we try to change the IP block cidr to 10.1.0.1/16, it results in a conflict. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiPoolManagementIpBlocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiPoolManagementIpBlocksApi apiInstance = new ManagementPlaneApiPoolManagementIpBlocksApi();
IpBlock body = new IpBlock(); // IpBlock | 
String blockId = "blockId_example"; // String | IP address block id
try {
    IpBlock result = apiInstance.updateIpBlock(body, blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiPoolManagementIpBlocksApi#updateIpBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpBlock**](IpBlock.md)|  |
 **blockId** | **String**| IP address block id |

### Return type

[**IpBlock**](IpBlock.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

