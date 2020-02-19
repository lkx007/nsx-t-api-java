# ManagementPlaneApiFabricContainerClustersApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContainerCluster**](ManagementPlaneApiFabricContainerClustersApi.md#getContainerCluster) | **GET** /fabric/container-clusters/{container-cluster-id} | Return a container cluster
[**getContainerClusterNode**](ManagementPlaneApiFabricContainerClustersApi.md#getContainerClusterNode) | **GET** /fabric/container-cluster-nodes/{container-cluster-node-id} | Return a container cluster node
[**getContainerIngressPolicy**](ManagementPlaneApiFabricContainerClustersApi.md#getContainerIngressPolicy) | **GET** /fabric/container-ingress-policies/{ingress-policy-id} | Returns an ingress policy spec
[**getContainerNetworkPolicy**](ManagementPlaneApiFabricContainerClustersApi.md#getContainerNetworkPolicy) | **GET** /fabric/container-network-policies/{network-policy-id} | Return a network policy spec
[**listContainerClusterNodes**](ManagementPlaneApiFabricContainerClustersApi.md#listContainerClusterNodes) | **GET** /fabric/container-cluster-nodes | Return the list of container cluster nodes
[**listContainerClusters**](ManagementPlaneApiFabricContainerClustersApi.md#listContainerClusters) | **GET** /fabric/container-clusters | Return the List of Container Clusters
[**listContainerIngressPolicies**](ManagementPlaneApiFabricContainerClustersApi.md#listContainerIngressPolicies) | **GET** /fabric/container-ingress-policies | Return the List of Container Ingress Policies
[**listContainerNetworkPolicies**](ManagementPlaneApiFabricContainerClustersApi.md#listContainerNetworkPolicies) | **GET** /fabric/container-network-policies | Return the List of Container Network Policies

<a name="getContainerCluster"></a>
# **getContainerCluster**
> ContainerCluster getContainerCluster(containerClusterId)

Return a container cluster

Returns information about a specific container cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String containerClusterId = "containerClusterId_example"; // String | 
try {
    ContainerCluster result = apiInstance.getContainerCluster(containerClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#getContainerCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerClusterId** | **String**|  |

### Return type

[**ContainerCluster**](ContainerCluster.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContainerClusterNode"></a>
# **getContainerClusterNode**
> ContainerClusterNode getContainerClusterNode(containerClusterNodeId)

Return a container cluster node

Returns information about a specific container cluster node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String containerClusterNodeId = "containerClusterNodeId_example"; // String | 
try {
    ContainerClusterNode result = apiInstance.getContainerClusterNode(containerClusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#getContainerClusterNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerClusterNodeId** | **String**|  |

### Return type

[**ContainerClusterNode**](ContainerClusterNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContainerIngressPolicy"></a>
# **getContainerIngressPolicy**
> ContainerIngressPolicy getContainerIngressPolicy(ingressPolicyId)

Returns an ingress policy spec

Returns information about a specific ingress policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String ingressPolicyId = "ingressPolicyId_example"; // String | 
try {
    ContainerIngressPolicy result = apiInstance.getContainerIngressPolicy(ingressPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#getContainerIngressPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingressPolicyId** | **String**|  |

### Return type

[**ContainerIngressPolicy**](ContainerIngressPolicy.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContainerNetworkPolicy"></a>
# **getContainerNetworkPolicy**
> ContainerNetworkPolicy getContainerNetworkPolicy(networkPolicyId)

Return a network policy spec

Returns information about a specific network policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String networkPolicyId = "networkPolicyId_example"; // String | 
try {
    ContainerNetworkPolicy result = apiInstance.getContainerNetworkPolicy(networkPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#getContainerNetworkPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkPolicyId** | **String**|  |

### Return type

[**ContainerNetworkPolicy**](ContainerNetworkPolicy.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContainerClusterNodes"></a>
# **listContainerClusterNodes**
> ContainerClusterNodeListResult listContainerClusterNodes(containerClusterId, cursor, includedFields, pageSize, sortAscending, sortBy)

Return the list of container cluster nodes

Returns information about all container cluster nodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String containerClusterId = "containerClusterId_example"; // String | Identifier of the container cluster
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ContainerClusterNodeListResult result = apiInstance.listContainerClusterNodes(containerClusterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#listContainerClusterNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerClusterId** | **String**| Identifier of the container cluster | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ContainerClusterNodeListResult**](ContainerClusterNodeListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContainerClusters"></a>
# **listContainerClusters**
> ContainerClusterListResult listContainerClusters(clusterType, cursor, includedFields, infraType, pageSize, sortAscending, sortBy)

Return the List of Container Clusters

Returns information about all Container Clusters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String clusterType = "clusterType_example"; // String | Type of container cluster
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String infraType = "infraType_example"; // String | Type of infrastructure
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ContainerClusterListResult result = apiInstance.listContainerClusters(clusterType, cursor, includedFields, infraType, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#listContainerClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterType** | **String**| Type of container cluster | [optional] [enum: PAS, PKS, Kubernetes, Openshift, WCP, Other]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **infraType** | **String**| Type of infrastructure | [optional] [enum: vSphere, AWS, Azure, VMC, KVM, Baremetal]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ContainerClusterListResult**](ContainerClusterListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContainerIngressPolicies"></a>
# **listContainerIngressPolicies**
> ContainerIngressPolicyListResult listContainerIngressPolicies(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy)

Return the List of Container Ingress Policies

Returns information about all ingress policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String containerClusterId = "containerClusterId_example"; // String | Identifier of the container cluster
String containerProjectId = "containerProjectId_example"; // String | Identifier of the container project
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ContainerIngressPolicyListResult result = apiInstance.listContainerIngressPolicies(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#listContainerIngressPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerClusterId** | **String**| Identifier of the container cluster | [optional]
 **containerProjectId** | **String**| Identifier of the container project | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ContainerIngressPolicyListResult**](ContainerIngressPolicyListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContainerNetworkPolicies"></a>
# **listContainerNetworkPolicies**
> ContainerNetworkPolicyListResult listContainerNetworkPolicies(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy)

Return the List of Container Network Policies

Returns information about all network policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricContainerClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricContainerClustersApi apiInstance = new ManagementPlaneApiFabricContainerClustersApi();
String containerClusterId = "containerClusterId_example"; // String | Identifier of the container cluster
String containerProjectId = "containerProjectId_example"; // String | Identifier of the container project
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ContainerNetworkPolicyListResult result = apiInstance.listContainerNetworkPolicies(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricContainerClustersApi#listContainerNetworkPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerClusterId** | **String**| Identifier of the container cluster | [optional]
 **containerProjectId** | **String**| Identifier of the container project | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ContainerNetworkPolicyListResult**](ContainerNetworkPolicyListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

