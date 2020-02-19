# ManagementPlaneApiGroupingObjectsMacSetsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMACAddress**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#addMACAddress) | **POST** /mac-sets/{mac-set-id}/members | Add a MAC address to a MACSet
[**createMACSet**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#createMACSet) | **POST** /mac-sets | Create MACSet
[**deleteMACSet**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#deleteMACSet) | **DELETE** /mac-sets/{mac-set-id} | Delete MACSet
[**getMACAddresses**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#getMACAddresses) | **GET** /mac-sets/{mac-set-id}/members | Get all MACAddresses in a MACSet
[**listMACSets**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#listMACSets) | **GET** /mac-sets | List MACSets
[**readMACSet**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#readMACSet) | **GET** /mac-sets/{mac-set-id} | Read MACSet
[**removeMACAddress**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#removeMACAddress) | **DELETE** /mac-sets/{mac-set-id}/members/{mac-address} | Remove a MAC address from given MACSet
[**updateMACSet**](ManagementPlaneApiGroupingObjectsMacSetsApi.md#updateMACSet) | **PUT** /mac-sets/{mac-set-id} | Update MACSet

<a name="addMACAddress"></a>
# **addMACAddress**
> MACAddressElement addMACAddress(body, macSetId)

Add a MAC address to a MACSet

Add an individual MAC address to a MACSet 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
MACAddressElement body = new MACAddressElement(); // MACAddressElement | 
String macSetId = "macSetId_example"; // String | MAC Set Id
try {
    MACAddressElement result = apiInstance.addMACAddress(body, macSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#addMACAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MACAddressElement**](MACAddressElement.md)|  |
 **macSetId** | **String**| MAC Set Id |

### Return type

[**MACAddressElement**](MACAddressElement.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMACSet"></a>
# **createMACSet**
> MACSet createMACSet(body)

Create MACSet

Creates a new MACSet that can group individual MAC addresses. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
MACSet body = new MACSet(); // MACSet | 
try {
    MACSet result = apiInstance.createMACSet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#createMACSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MACSet**](MACSet.md)|  |

### Return type

[**MACSet**](MACSet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMACSet"></a>
# **deleteMACSet**
> deleteMACSet(macSetId, force)

Delete MACSet

Deletes the specified MACSet. By default, if the MACSet is added to an NSGroup, it won&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the MACSet. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
String macSetId = "macSetId_example"; // String | MACSet Id
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteMACSet(macSetId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#deleteMACSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **macSetId** | **String**| MACSet Id |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMACAddresses"></a>
# **getMACAddresses**
> MACAddressElementListResult getMACAddresses(macSetId)

Get all MACAddresses in a MACSet

List all MAC addresses in a MACSet 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
String macSetId = "macSetId_example"; // String | MAC Set Id
try {
    MACAddressElementListResult result = apiInstance.getMACAddresses(macSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#getMACAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **macSetId** | **String**| MAC Set Id |

### Return type

[**MACAddressElementListResult**](MACAddressElementListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMACSets"></a>
# **listMACSets**
> MACSetListResult listMACSets(cursor, includedFields, pageSize, sortAscending, sortBy)

List MACSets

Returns paginated list of MACSets 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MACSetListResult result = apiInstance.listMACSets(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#listMACSets");
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

[**MACSetListResult**](MACSetListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readMACSet"></a>
# **readMACSet**
> MACSet readMACSet(macSetId)

Read MACSet

Returns information about the specified MACSet 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
String macSetId = "macSetId_example"; // String | MACSet Id
try {
    MACSet result = apiInstance.readMACSet(macSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#readMACSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **macSetId** | **String**| MACSet Id |

### Return type

[**MACSet**](MACSet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeMACAddress"></a>
# **removeMACAddress**
> removeMACAddress(macSetId, macAddress)

Remove a MAC address from given MACSet

Remove an individual MAC address from a MACSet 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
String macSetId = "macSetId_example"; // String | MACSet Id
String macAddress = "macAddress_example"; // String | MAC address to be removed
try {
    apiInstance.removeMACAddress(macSetId, macAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#removeMACAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **macSetId** | **String**| MACSet Id |
 **macAddress** | **String**| MAC address to be removed |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMACSet"></a>
# **updateMACSet**
> MACSet updateMACSet(body, macSetId)

Update MACSet

Updates the specified MACSet. Modifiable parameters include the description, display_name and mac_addresses. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsMacSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsMacSetsApi apiInstance = new ManagementPlaneApiGroupingObjectsMacSetsApi();
MACSet body = new MACSet(); // MACSet | 
String macSetId = "macSetId_example"; // String | MACSet Id
try {
    MACSet result = apiInstance.updateMACSet(body, macSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsMacSetsApi#updateMACSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MACSet**](MACSet.md)|  |
 **macSetId** | **String**| MACSet Id |

### Return type

[**MACSet**](MACSet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

