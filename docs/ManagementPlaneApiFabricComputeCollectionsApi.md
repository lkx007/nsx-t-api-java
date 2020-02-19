# ManagementPlaneApiFabricComputeCollectionsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComputeCollectionFabricTemplate**](ManagementPlaneApiFabricComputeCollectionsApi.md#createComputeCollectionFabricTemplate) | **POST** /fabric/compute-collection-fabric-templates | Create a compute collection fabric template
[**deleteComputeCollectionFabricTemplate**](ManagementPlaneApiFabricComputeCollectionsApi.md#deleteComputeCollectionFabricTemplate) | **DELETE** /fabric/compute-collection-fabric-templates/{fabric-template-id} | Deletes compute collection fabric template
[**getComputeCollectionFabricTemplate**](ManagementPlaneApiFabricComputeCollectionsApi.md#getComputeCollectionFabricTemplate) | **GET** /fabric/compute-collection-fabric-templates/{fabric-template-id} | Get compute collection fabric template by id
[**getHostNodeStatusOnComputeCollection**](ManagementPlaneApiFabricComputeCollectionsApi.md#getHostNodeStatusOnComputeCollection) | **GET** /fabric/compute-collections/{cc-ext-id}/member-status | Get status of member host nodes of the compute-collection. Only nsx prepared host nodes in the specified compute-collection are included in the response. cc-ext-id should be of type VC_Cluster.
[**listComputeCollectionFabricTemplates**](ManagementPlaneApiFabricComputeCollectionsApi.md#listComputeCollectionFabricTemplates) | **GET** /fabric/compute-collection-fabric-templates | Get compute collection fabric templates
[**listComputeCollectionPhysicalNetworkInterfaces**](ManagementPlaneApiFabricComputeCollectionsApi.md#listComputeCollectionPhysicalNetworkInterfaces) | **GET** /fabric/compute-collections/{cc-ext-id}/network/physical-interfaces | List the Physical Network Interface for all discovered nodes
[**listComputeCollections**](ManagementPlaneApiFabricComputeCollectionsApi.md#listComputeCollections) | **GET** /fabric/compute-collections | Return the List of Compute Collections
[**performActionOnComputeCollection**](ManagementPlaneApiFabricComputeCollectionsApi.md#performActionOnComputeCollection) | **POST** /fabric/compute-collections/{cc-ext-id} | Perform action specific to NSX on the compute-collection. cc-ext-id should be of type VC_Cluster.
[**readComputeCollection**](ManagementPlaneApiFabricComputeCollectionsApi.md#readComputeCollection) | **GET** /fabric/compute-collections/{cc-ext-id} | Return Compute Collection Information
[**updateComputeCollectionFabricTemplate**](ManagementPlaneApiFabricComputeCollectionsApi.md#updateComputeCollectionFabricTemplate) | **PUT** /fabric/compute-collection-fabric-templates/{fabric-template-id} | Updates compute collection fabric template

<a name="createComputeCollectionFabricTemplate"></a>
# **createComputeCollectionFabricTemplate**
> ComputeCollectionFabricTemplate createComputeCollectionFabricTemplate(body)

Create a compute collection fabric template

Fabric templates are fabric configurations applied at the compute collection level. This configurations is used to decide what automated operations should be a run when a host membership changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
ComputeCollectionFabricTemplate body = new ComputeCollectionFabricTemplate(); // ComputeCollectionFabricTemplate | 
try {
    ComputeCollectionFabricTemplate result = apiInstance.createComputeCollectionFabricTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#createComputeCollectionFabricTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComputeCollectionFabricTemplate**](ComputeCollectionFabricTemplate.md)|  |

### Return type

[**ComputeCollectionFabricTemplate**](ComputeCollectionFabricTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteComputeCollectionFabricTemplate"></a>
# **deleteComputeCollectionFabricTemplate**
> deleteComputeCollectionFabricTemplate(fabricTemplateId)

Deletes compute collection fabric template

Deletes compute collection fabric template for the given id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String fabricTemplateId = "fabricTemplateId_example"; // String | 
try {
    apiInstance.deleteComputeCollectionFabricTemplate(fabricTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#deleteComputeCollectionFabricTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fabricTemplateId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComputeCollectionFabricTemplate"></a>
# **getComputeCollectionFabricTemplate**
> ComputeCollectionFabricTemplate getComputeCollectionFabricTemplate(fabricTemplateId)

Get compute collection fabric template by id

Get compute collection fabric template for the given id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String fabricTemplateId = "fabricTemplateId_example"; // String | 
try {
    ComputeCollectionFabricTemplate result = apiInstance.getComputeCollectionFabricTemplate(fabricTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#getComputeCollectionFabricTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fabricTemplateId** | **String**|  |

### Return type

[**ComputeCollectionFabricTemplate**](ComputeCollectionFabricTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHostNodeStatusOnComputeCollection"></a>
# **getHostNodeStatusOnComputeCollection**
> HostNodeStatusListResult getHostNodeStatusOnComputeCollection(ccExtId)

Get status of member host nodes of the compute-collection. Only nsx prepared host nodes in the specified compute-collection are included in the response. cc-ext-id should be of type VC_Cluster.

Get status of member host nodes of the compute-collection. Only nsx prepared host nodes in the specified compute-collection are included in the response. cc-ext-id should be of type VC_Cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String ccExtId = "ccExtId_example"; // String | 
try {
    HostNodeStatusListResult result = apiInstance.getHostNodeStatusOnComputeCollection(ccExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#getHostNodeStatusOnComputeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccExtId** | **String**|  |

### Return type

[**HostNodeStatusListResult**](HostNodeStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listComputeCollectionFabricTemplates"></a>
# **listComputeCollectionFabricTemplates**
> ComputeCollectionFabricTemplateListResult listComputeCollectionFabricTemplates(computeCollectionId)

Get compute collection fabric templates

Returns compute collection fabric templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String computeCollectionId = "computeCollectionId_example"; // String | Compute collection id
try {
    ComputeCollectionFabricTemplateListResult result = apiInstance.listComputeCollectionFabricTemplates(computeCollectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#listComputeCollectionFabricTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeCollectionId** | **String**| Compute collection id | [optional]

### Return type

[**ComputeCollectionFabricTemplateListResult**](ComputeCollectionFabricTemplateListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listComputeCollectionPhysicalNetworkInterfaces"></a>
# **listComputeCollectionPhysicalNetworkInterfaces**
> ComputeCollectionNetworkInterfacesListResult listComputeCollectionPhysicalNetworkInterfaces(ccExtId)

List the Physical Network Interface for all discovered nodes

Returns list of physical network interfaces for all discovered nodes in compute collection. Interface information includes PNIC name, hostswitch name it&#x27;s attached to(if any) and MAC address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String ccExtId = "ccExtId_example"; // String | 
try {
    ComputeCollectionNetworkInterfacesListResult result = apiInstance.listComputeCollectionPhysicalNetworkInterfaces(ccExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#listComputeCollectionPhysicalNetworkInterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccExtId** | **String**|  |

### Return type

[**ComputeCollectionNetworkInterfacesListResult**](ComputeCollectionNetworkInterfacesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listComputeCollections"></a>
# **listComputeCollections**
> ComputeCollectionListResult listComputeCollections(cmLocalId, cursor, discoveredNodeId, displayName, externalId, includedFields, nodeId, originId, originType, ownerId, pageSize, sortAscending, sortBy)

Return the List of Compute Collections

Returns information about all compute collections.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String cmLocalId = "cmLocalId_example"; // String | Local Id of the compute collection in the Compute Manager
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String discoveredNodeId = "discoveredNodeId_example"; // String | Id of the discovered node which belongs to this Compute Collection 
String displayName = "displayName_example"; // String | Name of the ComputeCollection in source compute manager
String externalId = "externalId_example"; // String | External ID of the ComputeCollection in the source Compute manager, e.g. mo-ref in VC 
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String nodeId = "nodeId_example"; // String | Id of the fabric node created from a discovered node belonging to this Compute Collection 
String originId = "originId_example"; // String | Id of the compute manager from where this Compute Collection was discovered
String originType = "originType_example"; // String | ComputeCollection type like VC_Cluster. Here the Compute Manager type prefix would help in differentiating similar named Compute Collection types from different Compute Managers 
String ownerId = "ownerId_example"; // String | Id of the owner of compute collection in the Compute Manager
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ComputeCollectionListResult result = apiInstance.listComputeCollections(cmLocalId, cursor, discoveredNodeId, displayName, externalId, includedFields, nodeId, originId, originType, ownerId, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#listComputeCollections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmLocalId** | **String**| Local Id of the compute collection in the Compute Manager | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **discoveredNodeId** | **String**| Id of the discovered node which belongs to this Compute Collection  | [optional]
 **displayName** | **String**| Name of the ComputeCollection in source compute manager | [optional]
 **externalId** | **String**| External ID of the ComputeCollection in the source Compute manager, e.g. mo-ref in VC  | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **nodeId** | **String**| Id of the fabric node created from a discovered node belonging to this Compute Collection  | [optional]
 **originId** | **String**| Id of the compute manager from where this Compute Collection was discovered | [optional]
 **originType** | **String**| ComputeCollection type like VC_Cluster. Here the Compute Manager type prefix would help in differentiating similar named Compute Collection types from different Compute Managers  | [optional]
 **ownerId** | **String**| Id of the owner of compute collection in the Compute Manager | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ComputeCollectionListResult**](ComputeCollectionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="performActionOnComputeCollection"></a>
# **performActionOnComputeCollection**
> performActionOnComputeCollection(ccExtId, action)

Perform action specific to NSX on the compute-collection. cc-ext-id should be of type VC_Cluster.

Perform action specific to NSX on the compute-collection. cc-ext-id should be of type VC_Cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String ccExtId = "ccExtId_example"; // String | 
String action = "action_example"; // String | Supported actions on compute-collection
try {
    apiInstance.performActionOnComputeCollection(ccExtId, action);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#performActionOnComputeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccExtId** | **String**|  |
 **action** | **String**| Supported actions on compute-collection | [optional] [enum: remove_nsx]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readComputeCollection"></a>
# **readComputeCollection**
> ComputeCollection readComputeCollection(ccExtId)

Return Compute Collection Information

Returns information about a specific compute collection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
String ccExtId = "ccExtId_example"; // String | 
try {
    ComputeCollection result = apiInstance.readComputeCollection(ccExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#readComputeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccExtId** | **String**|  |

### Return type

[**ComputeCollection**](ComputeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateComputeCollectionFabricTemplate"></a>
# **updateComputeCollectionFabricTemplate**
> ComputeCollectionFabricTemplate updateComputeCollectionFabricTemplate(body, fabricTemplateId)

Updates compute collection fabric template

Updates compute collection fabric template for the given id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricComputeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricComputeCollectionsApi apiInstance = new ManagementPlaneApiFabricComputeCollectionsApi();
ComputeCollectionFabricTemplate body = new ComputeCollectionFabricTemplate(); // ComputeCollectionFabricTemplate | 
String fabricTemplateId = "fabricTemplateId_example"; // String | 
try {
    ComputeCollectionFabricTemplate result = apiInstance.updateComputeCollectionFabricTemplate(body, fabricTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricComputeCollectionsApi#updateComputeCollectionFabricTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComputeCollectionFabricTemplate**](ComputeCollectionFabricTemplate.md)|  |
 **fabricTemplateId** | **String**|  |

### Return type

[**ComputeCollectionFabricTemplate**](ComputeCollectionFabricTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

