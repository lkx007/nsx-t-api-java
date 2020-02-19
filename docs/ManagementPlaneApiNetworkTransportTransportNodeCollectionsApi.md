# ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransportNodeCollection**](ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi.md#createTransportNodeCollection) | **POST** /transport-node-collections | Create transport node collection by attaching Transport Node Profile to cluster.
[**deleteTransportNodeCollection**](ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi.md#deleteTransportNodeCollection) | **DELETE** /transport-node-collections/{transport-node-collection-id} | Detach transport node profile from compute collection.
[**getTransportNodeCollection**](ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi.md#getTransportNodeCollection) | **GET** /transport-node-collections/{transport-node-collection-id} | Get Transport Node collection by id
[**getTransportNodeCollectionState**](ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi.md#getTransportNodeCollectionState) | **GET** /transport-node-collections/{transport-node-collection-id}/state | Get Transport Node collection application state
[**listTransportNodeCollections**](ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi.md#listTransportNodeCollections) | **GET** /transport-node-collections | List Transport Node collections
[**updateTransportNodeCollection**](ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi.md#updateTransportNodeCollection) | **PUT** /transport-node-collections/{transport-node-collection-id} | Update Transport Node collection

<a name="createTransportNodeCollection"></a>
# **createTransportNodeCollection**
> TransportNodeCollection createTransportNodeCollection(body)

Create transport node collection by attaching Transport Node Profile to cluster.

When transport node collection is created the hosts which are part of compute collection will be prepared automatically i.e. NSX Manager attempts to install the NSX components on hosts. Transport nodes for these hosts are created using the configuration specified in transport node profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi();
TransportNodeCollection body = new TransportNodeCollection(); // TransportNodeCollection | 
try {
    TransportNodeCollection result = apiInstance.createTransportNodeCollection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi#createTransportNodeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportNodeCollection**](TransportNodeCollection.md)|  |

### Return type

[**TransportNodeCollection**](TransportNodeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransportNodeCollection"></a>
# **deleteTransportNodeCollection**
> deleteTransportNodeCollection(transportNodeCollectionId)

Detach transport node profile from compute collection.

By deleting transport node collection, we are detaching the transport node profile(TNP) from the compute collection. It has no effect on existing transport nodes. However, new hosts added to the compute collection will no longer be automatically converted to NSX transport node. Detaching TNP from compute collection does not delete TNP. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi();
String transportNodeCollectionId = "transportNodeCollectionId_example"; // String | 
try {
    apiInstance.deleteTransportNodeCollection(transportNodeCollectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi#deleteTransportNodeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeCollectionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportNodeCollection"></a>
# **getTransportNodeCollection**
> TransportNodeCollection getTransportNodeCollection(transportNodeCollectionId)

Get Transport Node collection by id

Returns transport node collection by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi();
String transportNodeCollectionId = "transportNodeCollectionId_example"; // String | 
try {
    TransportNodeCollection result = apiInstance.getTransportNodeCollection(transportNodeCollectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi#getTransportNodeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeCollectionId** | **String**|  |

### Return type

[**TransportNodeCollection**](TransportNodeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportNodeCollectionState"></a>
# **getTransportNodeCollectionState**
> TransportNodeCollectionState getTransportNodeCollectionState(transportNodeCollectionId)

Get Transport Node collection application state

Returns the state of transport node collection based on the states of transport nodes of the hosts which are part of compute collection. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi();
String transportNodeCollectionId = "transportNodeCollectionId_example"; // String | 
try {
    TransportNodeCollectionState result = apiInstance.getTransportNodeCollectionState(transportNodeCollectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi#getTransportNodeCollectionState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeCollectionId** | **String**|  |

### Return type

[**TransportNodeCollectionState**](TransportNodeCollectionState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodeCollections"></a>
# **listTransportNodeCollections**
> TransportNodeCollectionListResult listTransportNodeCollections()

List Transport Node collections

Returns all Transport Node collections

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi();
try {
    TransportNodeCollectionListResult result = apiInstance.listTransportNodeCollections();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi#listTransportNodeCollections");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TransportNodeCollectionListResult**](TransportNodeCollectionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTransportNodeCollection"></a>
# **updateTransportNodeCollection**
> TransportNodeCollection updateTransportNodeCollection(body, transportNodeCollectionId)

Update Transport Node collection

Attach different transport node profile to compute collection by updating transport node collection. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi();
TransportNodeCollection body = new TransportNodeCollection(); // TransportNodeCollection | 
String transportNodeCollectionId = "transportNodeCollectionId_example"; // String | 
try {
    TransportNodeCollection result = apiInstance.updateTransportNodeCollection(body, transportNodeCollectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeCollectionsApi#updateTransportNodeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportNodeCollection**](TransportNodeCollection.md)|  |
 **transportNodeCollectionId** | **String**|  |

### Return type

[**TransportNodeCollection**](TransportNodeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

