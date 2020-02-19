# ManagementPlaneApiNetworkTransportEdgeClustersApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEdgeCluster**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#createEdgeCluster) | **POST** /edge-clusters | Create Edge Cluster
[**deleteEdgeCluster**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#deleteEdgeCluster) | **DELETE** /edge-clusters/{edge-cluster-id} | Delete Edge Cluster
[**getEdgeClusterAllocationStatus**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#getEdgeClusterAllocationStatus) | **GET** /edge-clusters/{edge-cluster-id}/allocation-status | Get the Allocation details of an edge cluster
[**getEdgeClusterState**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#getEdgeClusterState) | **GET** /edge-clusters/{edge-cluster-id}/state | Get the Realized State of a Edge Cluster
[**getEdgeClusterStatus**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#getEdgeClusterStatus) | **GET** /edge-clusters/{edge-cluster-id}/status | Get the status for the Edge cluster of the given id
[**listEdgeClusters**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#listEdgeClusters) | **GET** /edge-clusters | List Edge Clusters
[**readEdgeCluster**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#readEdgeCluster) | **GET** /edge-clusters/{edge-cluster-id} | Read Edge Cluster
[**replaceEdgeClusterMemberTransportNodeReplaceTransportNode**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#replaceEdgeClusterMemberTransportNodeReplaceTransportNode) | **POST** /edge-clusters/{edge-cluster-id}?action&#x3D;replace_transport_node | Replace the transport node in the specified member of the edge-cluster
[**updateEdgeCluster**](ManagementPlaneApiNetworkTransportEdgeClustersApi.md#updateEdgeCluster) | **PUT** /edge-clusters/{edge-cluster-id} | Update Edge Cluster

<a name="createEdgeCluster"></a>
# **createEdgeCluster**
> EdgeCluster createEdgeCluster(body)

Create Edge Cluster

Creates a new edge cluster. It only supports homogeneous members. The TransportNodes backed by EdgeNode are only allowed in cluster members. DeploymentType (VIRTUAL_MACHINE|PHYSICAL_MACHINE) of these EdgeNodes is recommended to be the same. EdgeCluster supports members of different deployment types. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
EdgeCluster body = new EdgeCluster(); // EdgeCluster | 
try {
    EdgeCluster result = apiInstance.createEdgeCluster(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#createEdgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EdgeCluster**](EdgeCluster.md)|  |

### Return type

[**EdgeCluster**](EdgeCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEdgeCluster"></a>
# **deleteEdgeCluster**
> deleteEdgeCluster(edgeClusterId)

Delete Edge Cluster

Deletes the specified edge cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
String edgeClusterId = "edgeClusterId_example"; // String | 
try {
    apiInstance.deleteEdgeCluster(edgeClusterId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#deleteEdgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeClusterId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEdgeClusterAllocationStatus"></a>
# **getEdgeClusterAllocationStatus**
> EdgeClusterAllocationStatus getEdgeClusterAllocationStatus(edgeClusterId)

Get the Allocation details of an edge cluster

Returns the allocation details of cluster and its members. Lists the edge node members, active and standby services of each node, utilization details of configured sub-pools. These allocation details can be monitored by customers to trigger migration of certain service contexts to different edge nodes, to balance the utilization of edge node resources. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
String edgeClusterId = "edgeClusterId_example"; // String | 
try {
    EdgeClusterAllocationStatus result = apiInstance.getEdgeClusterAllocationStatus(edgeClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#getEdgeClusterAllocationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeClusterId** | **String**|  |

### Return type

[**EdgeClusterAllocationStatus**](EdgeClusterAllocationStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEdgeClusterState"></a>
# **getEdgeClusterState**
> EdgeClusterState getEdgeClusterState(edgeClusterId, barrierId, requestId)

Get the Realized State of a Edge Cluster

Return realized state information of a edge cluster. Any configuration update that affects the edge cluster can use this API to get its realized state by passing a request_id returned by the configuration change operation. e.g. Update configuration of edge cluster. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
String edgeClusterId = "edgeClusterId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    EdgeClusterState result = apiInstance.getEdgeClusterState(edgeClusterId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#getEdgeClusterState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeClusterId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**EdgeClusterState**](EdgeClusterState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEdgeClusterStatus"></a>
# **getEdgeClusterStatus**
> EdgeClusterStatus getEdgeClusterStatus(edgeClusterId, source)

Get the status for the Edge cluster of the given id

Returns the aggregated status for the Edge cluster along with status of all edge nodes in the cluster. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
String edgeClusterId = "edgeClusterId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    EdgeClusterStatus result = apiInstance.getEdgeClusterStatus(edgeClusterId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#getEdgeClusterStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeClusterId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**EdgeClusterStatus**](EdgeClusterStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEdgeClusters"></a>
# **listEdgeClusters**
> EdgeClusterListResult listEdgeClusters(cursor, includedFields, pageSize, sortAscending, sortBy)

List Edge Clusters

Returns information about the configured edge clusters, which enable you to group together transport nodes of the type EdgeNode and apply fabric profiles to all members of the edge cluster. Each edge node can participate in only one edge cluster. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EdgeClusterListResult result = apiInstance.listEdgeClusters(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#listEdgeClusters");
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

[**EdgeClusterListResult**](EdgeClusterListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readEdgeCluster"></a>
# **readEdgeCluster**
> EdgeCluster readEdgeCluster(edgeClusterId)

Read Edge Cluster

Returns information about the specified edge cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
String edgeClusterId = "edgeClusterId_example"; // String | 
try {
    EdgeCluster result = apiInstance.readEdgeCluster(edgeClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#readEdgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeClusterId** | **String**|  |

### Return type

[**EdgeCluster**](EdgeCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceEdgeClusterMemberTransportNodeReplaceTransportNode"></a>
# **replaceEdgeClusterMemberTransportNodeReplaceTransportNode**
> EdgeCluster replaceEdgeClusterMemberTransportNodeReplaceTransportNode(body, edgeClusterId)

Replace the transport node in the specified member of the edge-cluster

Replace the transport node in the specified member of the edge-cluster. This is a disruptive action. This will move all the LogicalRouterPorts(uplink and routerLink) host on the old transport_node to the new transport_node. The transportNode cannot be present in another member of any edgeClusters. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
EdgeClusterMemberTransportNode body = new EdgeClusterMemberTransportNode(); // EdgeClusterMemberTransportNode | 
String edgeClusterId = "edgeClusterId_example"; // String | 
try {
    EdgeCluster result = apiInstance.replaceEdgeClusterMemberTransportNodeReplaceTransportNode(body, edgeClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#replaceEdgeClusterMemberTransportNodeReplaceTransportNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EdgeClusterMemberTransportNode**](EdgeClusterMemberTransportNode.md)|  |
 **edgeClusterId** | **String**|  |

### Return type

[**EdgeCluster**](EdgeCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEdgeCluster"></a>
# **updateEdgeCluster**
> EdgeCluster updateEdgeCluster(body, edgeClusterId)

Update Edge Cluster

Modifies the specified edge cluster. Modifiable parameters include the description, display_name, transport-node-id. If the optional fabric_profile_binding is included, resource_type and profile_id are required. User should do a GET on the edge-cluster and obtain the payload and retain the member_index of the existing members as returning in the GET output. For new member additions, the member_index cannot be defined by the user, user can read the system allocated index to the new member in the output of this API call or by doing a GET call. User cannot use this PUT api to replace the transport_node of an existing member because this is a disruption action, we have exposed a explicit API for doing so, refer to \&quot;ReplaceEdgeClusterMemberTransportNode\&quot; EdgeCluster only supports homogeneous members. The TransportNodes backed by EdgeNode are only allowed in cluster members. DeploymentType (VIRTUAL_MACHINE|PHYSICAL_MACHINE) of these EdgeNodes is recommended to be the same. EdgeCluster supports members of different deployment types. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportEdgeClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportEdgeClustersApi apiInstance = new ManagementPlaneApiNetworkTransportEdgeClustersApi();
EdgeCluster body = new EdgeCluster(); // EdgeCluster | 
String edgeClusterId = "edgeClusterId_example"; // String | 
try {
    EdgeCluster result = apiInstance.updateEdgeCluster(body, edgeClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportEdgeClustersApi#updateEdgeCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EdgeCluster**](EdgeCluster.md)|  |
 **edgeClusterId** | **String**|  |

### Return type

[**EdgeCluster**](EdgeCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

