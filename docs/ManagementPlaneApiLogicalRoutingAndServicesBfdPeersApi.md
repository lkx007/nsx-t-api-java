# ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStaticHopBfdPeer**](ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi.md#createStaticHopBfdPeer) | **POST** /logical-routers/{logical-router-id}/routing/static-routes/bfd-peers | Create a static hop BFD peer
[**deleteStaticHopBfdPeer**](ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi.md#deleteStaticHopBfdPeer) | **DELETE** /logical-routers/{logical-router-id}/routing/static-routes/bfd-peers/{bfd-peer-id} | Delete a specified static route BFD peer cofigured on a specified logical router
[**listStaticHopBfdPeers**](ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi.md#listStaticHopBfdPeers) | **GET** /logical-routers/{logical-router-id}/routing/static-routes/bfd-peers | List static routes BFD Peers
[**readStaticHopBfdPeer**](ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi.md#readStaticHopBfdPeer) | **GET** /logical-routers/{logical-router-id}/routing/static-routes/bfd-peers/{bfd-peer-id} | Read a static route BFD peer
[**updateStaticHopBfdPeer**](ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi.md#updateStaticHopBfdPeer) | **PUT** /logical-routers/{logical-router-id}/routing/static-routes/bfd-peers/{bfd-peer-id} | Update a static route BFD peer

<a name="createStaticHopBfdPeer"></a>
# **createStaticHopBfdPeer**
> StaticHopBfdPeer createStaticHopBfdPeer(body, logicalRouterId)

Create a static hop BFD peer

Creates a BFD peer for static route. The required parameters includes peer IP address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi();
StaticHopBfdPeer body = new StaticHopBfdPeer(); // StaticHopBfdPeer | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    StaticHopBfdPeer result = apiInstance.createStaticHopBfdPeer(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi#createStaticHopBfdPeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StaticHopBfdPeer**](StaticHopBfdPeer.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**StaticHopBfdPeer**](StaticHopBfdPeer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStaticHopBfdPeer"></a>
# **deleteStaticHopBfdPeer**
> deleteStaticHopBfdPeer(logicalRouterId, bfdPeerId, force)

Delete a specified static route BFD peer cofigured on a specified logical router

Deletes the specified BFD peer present on specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String bfdPeerId = "bfdPeerId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteStaticHopBfdPeer(logicalRouterId, bfdPeerId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi#deleteStaticHopBfdPeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **bfdPeerId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStaticHopBfdPeers"></a>
# **listStaticHopBfdPeers**
> StaticHopBfdPeerListResult listStaticHopBfdPeers(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy)

List static routes BFD Peers

Returns information about all BFD peers created on specified logical router for static routes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    StaticHopBfdPeerListResult result = apiInstance.listStaticHopBfdPeers(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi#listStaticHopBfdPeers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**StaticHopBfdPeerListResult**](StaticHopBfdPeerListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readStaticHopBfdPeer"></a>
# **readStaticHopBfdPeer**
> StaticHopBfdPeer readStaticHopBfdPeer(logicalRouterId, bfdPeerId)

Read a static route BFD peer

Read the BFD peer having specified ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String bfdPeerId = "bfdPeerId_example"; // String | 
try {
    StaticHopBfdPeer result = apiInstance.readStaticHopBfdPeer(logicalRouterId, bfdPeerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi#readStaticHopBfdPeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **bfdPeerId** | **String**|  |

### Return type

[**StaticHopBfdPeer**](StaticHopBfdPeer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStaticHopBfdPeer"></a>
# **updateStaticHopBfdPeer**
> StaticHopBfdPeer updateStaticHopBfdPeer(body, logicalRouterId, bfdPeerId)

Update a static route BFD peer

Modifies the static route BFD peer. Modifiable parameters includes peer IP, enable flag and configuration of the BFD peer. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi();
StaticHopBfdPeer body = new StaticHopBfdPeer(); // StaticHopBfdPeer | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String bfdPeerId = "bfdPeerId_example"; // String | 
try {
    StaticHopBfdPeer result = apiInstance.updateStaticHopBfdPeer(body, logicalRouterId, bfdPeerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesBfdPeersApi#updateStaticHopBfdPeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StaticHopBfdPeer**](StaticHopBfdPeer.md)|  |
 **logicalRouterId** | **String**|  |
 **bfdPeerId** | **String**|  |

### Return type

[**StaticHopBfdPeer**](StaticHopBfdPeer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

