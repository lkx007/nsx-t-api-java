# ManagementPlaneApiFabricDiscoveredNodesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransportNodeForDiscoveredNodeCreateTransportNode**](ManagementPlaneApiFabricDiscoveredNodesApi.md#createTransportNodeForDiscoveredNodeCreateTransportNode) | **POST** /fabric/discovered-nodes/{node-ext-id}?action&#x3D;create_transport_node | Created Transport Node for Discovered Node
[**hostPrepDiscoveredNodeHostprep**](ManagementPlaneApiFabricDiscoveredNodesApi.md#hostPrepDiscoveredNodeHostprep) | **POST** /fabric/discovered-nodes/{node-ext-id}?action&#x3D;hostprep | (Deprecated) Prepares discovered Node for NSX
[**listDiscoveredNodes**](ManagementPlaneApiFabricDiscoveredNodesApi.md#listDiscoveredNodes) | **GET** /fabric/discovered-nodes | Return the List of Discovered Nodes
[**readDiscoveredNode**](ManagementPlaneApiFabricDiscoveredNodesApi.md#readDiscoveredNode) | **GET** /fabric/discovered-nodes/{node-ext-id} | Return Discovered Node Information
[**reapplyTNProfileOnDiscoveredNodeReapplyClusterConfig**](ManagementPlaneApiFabricDiscoveredNodesApi.md#reapplyTNProfileOnDiscoveredNodeReapplyClusterConfig) | **POST** /fabric/discovered-nodes/{node-ext-id}?action&#x3D;reapply_cluster_config | Apply cluster level config on Discovered Node

<a name="createTransportNodeForDiscoveredNodeCreateTransportNode"></a>
# **createTransportNodeForDiscoveredNodeCreateTransportNode**
> TransportNode createTransportNodeForDiscoveredNodeCreateTransportNode(body, nodeExtId)

Created Transport Node for Discovered Node

NSX components are installaed on host and transport node is created with given configurations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricDiscoveredNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricDiscoveredNodesApi apiInstance = new ManagementPlaneApiFabricDiscoveredNodesApi();
TransportNode body = new TransportNode(); // TransportNode | 
String nodeExtId = "nodeExtId_example"; // String | 
try {
    TransportNode result = apiInstance.createTransportNodeForDiscoveredNodeCreateTransportNode(body, nodeExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricDiscoveredNodesApi#createTransportNodeForDiscoveredNodeCreateTransportNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportNode**](TransportNode.md)|  |
 **nodeExtId** | **String**|  |

### Return type

[**TransportNode**](TransportNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hostPrepDiscoveredNodeHostprep"></a>
# **hostPrepDiscoveredNodeHostprep**
> Node hostPrepDiscoveredNodeHostprep(nodeExtId)

(Deprecated) Prepares discovered Node for NSX

Prepares(hostprep) discovered node for NSX. NSX LCP bundles are installed on this discovered node. This API is deprecated. Use /fabric/discovered-nodes/&lt;node-ext-id&gt;?action&#x3D;create_transport_node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricDiscoveredNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricDiscoveredNodesApi apiInstance = new ManagementPlaneApiFabricDiscoveredNodesApi();
String nodeExtId = "nodeExtId_example"; // String | 
try {
    Node result = apiInstance.hostPrepDiscoveredNodeHostprep(nodeExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricDiscoveredNodesApi#hostPrepDiscoveredNodeHostprep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeExtId** | **String**|  |

### Return type

[**Node**](Node.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDiscoveredNodes"></a>
# **listDiscoveredNodes**
> DiscoveredNodeListResult listDiscoveredNodes(cmLocalId, cursor, displayName, externalId, hasParent, includedFields, ipAddress, nodeId, nodeType, originId, pageSize, parentComputeCollection, sortAscending, sortBy)

Return the List of Discovered Nodes

Returns information about all discovered nodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricDiscoveredNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricDiscoveredNodesApi apiInstance = new ManagementPlaneApiFabricDiscoveredNodesApi();
String cmLocalId = "cmLocalId_example"; // String | Local Id of the discovered node in the Compute Manager
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String displayName = "displayName_example"; // String | Display name of discovered node
String externalId = "externalId_example"; // String | External id of the discovered node, ex. a mo-ref from VC
String hasParent = "hasParent_example"; // String | Discovered node has a parent compute collection or is a standalone host
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String ipAddress = "ipAddress_example"; // String | IP address of the discovered node
String nodeId = "nodeId_example"; // String | Id of the fabric node created from the discovered node
String nodeType = "nodeType_example"; // String | Discovered Node type like HostNode
String originId = "originId_example"; // String | Id of the compute manager from where this node was discovered
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String parentComputeCollection = "parentComputeCollection_example"; // String | External id of the compute collection to which this node belongs
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DiscoveredNodeListResult result = apiInstance.listDiscoveredNodes(cmLocalId, cursor, displayName, externalId, hasParent, includedFields, ipAddress, nodeId, nodeType, originId, pageSize, parentComputeCollection, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricDiscoveredNodesApi#listDiscoveredNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmLocalId** | **String**| Local Id of the discovered node in the Compute Manager | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **displayName** | **String**| Display name of discovered node | [optional]
 **externalId** | **String**| External id of the discovered node, ex. a mo-ref from VC | [optional]
 **hasParent** | **String**| Discovered node has a parent compute collection or is a standalone host | [optional] [enum: true, false]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **ipAddress** | **String**| IP address of the discovered node | [optional]
 **nodeId** | **String**| Id of the fabric node created from the discovered node | [optional]
 **nodeType** | **String**| Discovered Node type like HostNode | [optional]
 **originId** | **String**| Id of the compute manager from where this node was discovered | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **parentComputeCollection** | **String**| External id of the compute collection to which this node belongs | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**DiscoveredNodeListResult**](DiscoveredNodeListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDiscoveredNode"></a>
# **readDiscoveredNode**
> DiscoveredNode readDiscoveredNode(nodeExtId)

Return Discovered Node Information

Returns information about a specific discovered node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricDiscoveredNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricDiscoveredNodesApi apiInstance = new ManagementPlaneApiFabricDiscoveredNodesApi();
String nodeExtId = "nodeExtId_example"; // String | 
try {
    DiscoveredNode result = apiInstance.readDiscoveredNode(nodeExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricDiscoveredNodesApi#readDiscoveredNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeExtId** | **String**|  |

### Return type

[**DiscoveredNode**](DiscoveredNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reapplyTNProfileOnDiscoveredNodeReapplyClusterConfig"></a>
# **reapplyTNProfileOnDiscoveredNodeReapplyClusterConfig**
> TransportNode reapplyTNProfileOnDiscoveredNodeReapplyClusterConfig(nodeExtId)

Apply cluster level config on Discovered Node

When transport node profile (TNP) is applied to a cluster, if any validation fails (e.g. VMs running on host) then transport node (TN) is not created. In that case after the required action is taken (e.g. VMs powered off), you can call this API to try to create TN for that discovered node. Do not call this API if Transport Node already exists for the discovered node. In that case use API on transport node. /transport-nodes/&lt;transport-node-id&gt;?action&#x3D;restore_cluster_config

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricDiscoveredNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricDiscoveredNodesApi apiInstance = new ManagementPlaneApiFabricDiscoveredNodesApi();
String nodeExtId = "nodeExtId_example"; // String | 
try {
    TransportNode result = apiInstance.reapplyTNProfileOnDiscoveredNodeReapplyClusterConfig(nodeExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricDiscoveredNodesApi#reapplyTNProfileOnDiscoveredNodeReapplyClusterConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeExtId** | **String**|  |

### Return type

[**TransportNode**](TransportNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

