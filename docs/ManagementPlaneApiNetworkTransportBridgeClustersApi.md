# ManagementPlaneApiNetworkTransportBridgeClustersApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBridgeCluster**](ManagementPlaneApiNetworkTransportBridgeClustersApi.md#createBridgeCluster) | **POST** /bridge-clusters | Create a Bridge Cluster
[**deleteBridgeCluster**](ManagementPlaneApiNetworkTransportBridgeClustersApi.md#deleteBridgeCluster) | **DELETE** /bridge-clusters/{bridgecluster-id} | Delete a Bridge Cluster
[**getBridgeCluster**](ManagementPlaneApiNetworkTransportBridgeClustersApi.md#getBridgeCluster) | **GET** /bridge-clusters/{bridgecluster-id} | Get Information about a bridge cluster
[**getBridgeClusterStatus**](ManagementPlaneApiNetworkTransportBridgeClustersApi.md#getBridgeClusterStatus) | **GET** /bridge-clusters/{cluster-id}/status | Returns status of a specified Bridge Cluster
[**listBridgeClusters**](ManagementPlaneApiNetworkTransportBridgeClustersApi.md#listBridgeClusters) | **GET** /bridge-clusters | List All Bridge Clusters
[**updateBridgeCluster**](ManagementPlaneApiNetworkTransportBridgeClustersApi.md#updateBridgeCluster) | **PUT** /bridge-clusters/{bridgecluster-id} | Update a Bridge Cluster

<a name="createBridgeCluster"></a>
# **createBridgeCluster**
> BridgeCluster createBridgeCluster(body)

Create a Bridge Cluster

Creates a bridge cluster. It is collection of transport nodes that will do the bridging for overlay network to vlan networks. Bridge cluster may have one or more transport nodes 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeClustersApi();
BridgeCluster body = new BridgeCluster(); // BridgeCluster | 
try {
    BridgeCluster result = apiInstance.createBridgeCluster(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeClustersApi#createBridgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BridgeCluster**](BridgeCluster.md)|  |

### Return type

[**BridgeCluster**](BridgeCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBridgeCluster"></a>
# **deleteBridgeCluster**
> deleteBridgeCluster(bridgeclusterId)

Delete a Bridge Cluster

Removes the specified Bridge Cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeClustersApi();
String bridgeclusterId = "bridgeclusterId_example"; // String | 
try {
    apiInstance.deleteBridgeCluster(bridgeclusterId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeClustersApi#deleteBridgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeclusterId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBridgeCluster"></a>
# **getBridgeCluster**
> BridgeCluster getBridgeCluster(bridgeclusterId)

Get Information about a bridge cluster

Returns information about a specified bridge cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeClustersApi();
String bridgeclusterId = "bridgeclusterId_example"; // String | 
try {
    BridgeCluster result = apiInstance.getBridgeCluster(bridgeclusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeClustersApi#getBridgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeclusterId** | **String**|  |

### Return type

[**BridgeCluster**](BridgeCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBridgeClusterStatus"></a>
# **getBridgeClusterStatus**
> BridgeClusterStatus getBridgeClusterStatus(clusterId, source)

Returns status of a specified Bridge Cluster

Get the status for the Bridge Cluster of the given cluster id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeClustersApi();
String clusterId = "clusterId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    BridgeClusterStatus result = apiInstance.getBridgeClusterStatus(clusterId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeClustersApi#getBridgeClusterStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**BridgeClusterStatus**](BridgeClusterStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBridgeClusters"></a>
# **listBridgeClusters**
> BridgeClusterListResult listBridgeClusters(cursor, includedFields, pageSize, sortAscending, sortBy)

List All Bridge Clusters

Returns information about all configured bridge clusters 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeClustersApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    BridgeClusterListResult result = apiInstance.listBridgeClusters(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeClustersApi#listBridgeClusters");
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

[**BridgeClusterListResult**](BridgeClusterListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBridgeCluster"></a>
# **updateBridgeCluster**
> BridgeCluster updateBridgeCluster(body, bridgeclusterId)

Update a Bridge Cluster

Modifies a existing bridge cluster. One of more transport nodes can be added or removed from the bridge cluster using this API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeClustersApi();
BridgeCluster body = new BridgeCluster(); // BridgeCluster | 
String bridgeclusterId = "bridgeclusterId_example"; // String | 
try {
    BridgeCluster result = apiInstance.updateBridgeCluster(body, bridgeclusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeClustersApi#updateBridgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BridgeCluster**](BridgeCluster.md)|  |
 **bridgeclusterId** | **String**|  |

### Return type

[**BridgeCluster**](BridgeCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

