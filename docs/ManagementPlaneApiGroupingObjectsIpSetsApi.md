# ManagementPlaneApiGroupingObjectsIpSetsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRemoveIPAddress**](ManagementPlaneApiGroupingObjectsIpSetsApi.md#addRemoveIPAddress) | **POST** /ip-sets/{ip-set-id} | Add a IP address to a IPSet
[**createIPSet**](ManagementPlaneApiGroupingObjectsIpSetsApi.md#createIPSet) | **POST** /ip-sets | Create IPSet
[**deleteIPSet**](ManagementPlaneApiGroupingObjectsIpSetsApi.md#deleteIPSet) | **DELETE** /ip-sets/{ip-set-id} | Delete IPSet
[**getIPAddresses**](ManagementPlaneApiGroupingObjectsIpSetsApi.md#getIPAddresses) | **GET** /ip-sets/{ip-set-id}/members | Get all IPAddresses in a IPSet
[**listIPSets**](ManagementPlaneApiGroupingObjectsIpSetsApi.md#listIPSets) | **GET** /ip-sets | List IPSets
[**readIPSet**](ManagementPlaneApiGroupingObjectsIpSetsApi.md#readIPSet) | **GET** /ip-sets/{ip-set-id} | Read IPSet
[**updateIPSet**](ManagementPlaneApiGroupingObjectsIpSetsApi.md#updateIPSet) | **PUT** /ip-sets/{ip-set-id} | Update IPSet

<a name="addRemoveIPAddress"></a>
# **addRemoveIPAddress**
> IPAddressElement addRemoveIPAddress(body, action, ipSetId)

Add a IP address to a IPSet

Add/Remove an individual IP address to an IPSet 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsIpSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsIpSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsIpSetsApi();
IPAddressElement body = new IPAddressElement(); // IPAddressElement | 
String action = "action_example"; // String | Specifies addition or removal action
String ipSetId = "ipSetId_example"; // String | IP Set Id
try {
    IPAddressElement result = apiInstance.addRemoveIPAddress(body, action, ipSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsIpSetsApi#addRemoveIPAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPAddressElement**](IPAddressElement.md)|  |
 **action** | **String**| Specifies addition or removal action | [enum: add_ip, remove_ip]
 **ipSetId** | **String**| IP Set Id |

### Return type

[**IPAddressElement**](IPAddressElement.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIPSet"></a>
# **createIPSet**
> IPSet createIPSet(body)

Create IPSet

Creates a new IPSet that can group either IPv4 or IPv6 individual ip addresses, ranges or subnets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsIpSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsIpSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsIpSetsApi();
IPSet body = new IPSet(); // IPSet | 
try {
    IPSet result = apiInstance.createIPSet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsIpSetsApi#createIPSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSet**](IPSet.md)|  |

### Return type

[**IPSet**](IPSet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSet"></a>
# **deleteIPSet**
> deleteIPSet(ipSetId, force)

Delete IPSet

Deletes the specified IPSet.  By default, if the IPSet is added to an NSGroup, it won&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the IPSet. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsIpSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsIpSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsIpSetsApi();
String ipSetId = "ipSetId_example"; // String | IPSet Id
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSet(ipSetId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsIpSetsApi#deleteIPSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipSetId** | **String**| IPSet Id |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPAddresses"></a>
# **getIPAddresses**
> IPAddressElementListResult getIPAddresses(ipSetId)

Get all IPAddresses in a IPSet

List all IP addresses in a IPSet 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsIpSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsIpSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsIpSetsApi();
String ipSetId = "ipSetId_example"; // String | IP Set Id
try {
    IPAddressElementListResult result = apiInstance.getIPAddresses(ipSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsIpSetsApi#getIPAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipSetId** | **String**| IP Set Id |

### Return type

[**IPAddressElementListResult**](IPAddressElementListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPSets"></a>
# **listIPSets**
> IPSetListResult listIPSets(cursor, includedFields, pageSize, sortAscending, sortBy)

List IPSets

Returns paginated list of IPSets 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsIpSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsIpSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsIpSetsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSetListResult result = apiInstance.listIPSets(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsIpSetsApi#listIPSets");
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

[**IPSetListResult**](IPSetListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readIPSet"></a>
# **readIPSet**
> IPSet readIPSet(ipSetId)

Read IPSet

Returns information about the specified IPSet 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsIpSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsIpSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsIpSetsApi();
String ipSetId = "ipSetId_example"; // String | IPSet Id
try {
    IPSet result = apiInstance.readIPSet(ipSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsIpSetsApi#readIPSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipSetId** | **String**| IPSet Id |

### Return type

[**IPSet**](IPSet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSet"></a>
# **updateIPSet**
> IPSet updateIPSet(body, ipSetId)

Update IPSet

Updates the specified IPSet. Modifiable parameters include description, display_name and ip_addresses. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsIpSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsIpSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsIpSetsApi();
IPSet body = new IPSet(); // IPSet | 
String ipSetId = "ipSetId_example"; // String | IPSet Id
try {
    IPSet result = apiInstance.updateIPSet(body, ipSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsIpSetsApi#updateIPSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSet**](IPSet.md)|  |
 **ipSetId** | **String**| IPSet Id |

### Return type

[**IPSet**](IPSet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

