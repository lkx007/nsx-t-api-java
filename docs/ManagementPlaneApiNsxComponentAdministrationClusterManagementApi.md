# ManagementPlaneApiNsxComponentAdministrationClusterManagementApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClusterNode**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#addClusterNode) | **POST** /cluster/nodes | Add a controller to the cluster
[**clearClusterCertificateClearClusterCertificate**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#clearClusterCertificateClearClusterCertificate) | **POST** /cluster/api-certificate?action&#x3D;clear_cluster_certificate | Clear the cluster certificate
[**clearClusterVirtualIpClearVirtualIp**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#clearClusterVirtualIpClearVirtualIp) | **POST** /cluster/api-virtual-ip?action&#x3D;clear_virtual_ip | Clear cluster virtual IP address
[**deleteClusterNodeConfig**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#deleteClusterNodeConfig) | **DELETE** /cluster/nodes/{node-id} | Remove a controller from the cluster
[**detachClusterNodeRemoveNode**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#detachClusterNodeRemoveNode) | **POST** /cluster/{node-id}?action&#x3D;remove_node | Detach a node from the Cluster
[**getApiServiceConfig**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#getApiServiceConfig) | **GET** /cluster/api-service | Read API service properties
[**getClusterCertificateId**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#getClusterCertificateId) | **GET** /cluster/api-certificate | Read cluster certificate ID
[**getClusterNodeConfig**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#getClusterNodeConfig) | **GET** /cluster/{node-id} | Read cluster node configuration
[**getClusterVirtualIp**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#getClusterVirtualIp) | **GET** /cluster/api-virtual-ip | Read cluster virtual IP address
[**joinClusterJoinCluster**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#joinClusterJoinCluster) | **POST** /cluster?action&#x3D;join_cluster | Join this node to a NSX Cluster
[**listClusterNodeConfigs**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#listClusterNodeConfigs) | **GET** /cluster/nodes | List Cluster Node Configurations
[**listClusterNodeInterfaces**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#listClusterNodeInterfaces) | **GET** /cluster/nodes/{node-id}/network/interfaces | List the specified node&#x27;s Network Interfaces
[**readClusterConfig**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#readClusterConfig) | **GET** /cluster | Read Cluster Configuration
[**readClusterNodeConfig**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#readClusterNodeConfig) | **GET** /cluster/nodes/{node-id} | Read Cluster Node Configuration
[**readClusterNodeInterface**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#readClusterNodeInterface) | **GET** /cluster/nodes/{node-id}/network/interfaces/{interface-id} | Read the node&#x27;s Network Interface
[**readClusterNodeInterfaceStatistics**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#readClusterNodeInterfaceStatistics) | **GET** /cluster/nodes/{node-id}/network/interfaces/{interface-id}/stats | Read the NSX Manager/Controller&#x27;s Network Interface Statistics
[**readClusterNodeStatus**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#readClusterNodeStatus) | **GET** /cluster/nodes/{node-id}/status | Read cluster node runtime status
[**readClusterNodesAggregateStatus**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#readClusterNodesAggregateStatus) | **GET** /cluster/nodes/status | Read cluster runtime status
[**readClusterStatus**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#readClusterStatus) | **GET** /cluster/status | Read Cluster Status
[**setClusterCertificateSetClusterCertificate**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#setClusterCertificateSetClusterCertificate) | **POST** /cluster/api-certificate?action&#x3D;set_cluster_certificate | Set the cluster certificate
[**setClusterVirtualIpSetVirtualIp**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#setClusterVirtualIpSetVirtualIp) | **POST** /cluster/api-virtual-ip?action&#x3D;set_virtual_ip | Set cluster virtual IP address
[**updateApiServiceConfig**](ManagementPlaneApiNsxComponentAdministrationClusterManagementApi.md#updateApiServiceConfig) | **PUT** /cluster/api-service | Update API service properties

<a name="addClusterNode"></a>
# **addClusterNode**
> ClusterNodeConfig addClusterNode(body, action)

Add a controller to the cluster

Add a new controller to the NSX cluster. Deprecated. Use POST /cluster?action&#x3D;join_cluster to join a node to cluster. The controller comes with the new node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
AddClusterNodeSpec body = new AddClusterNodeSpec(); // AddClusterNodeSpec | 
String action = "action_example"; // String | 
try {
    ClusterNodeConfig result = apiInstance.addClusterNode(body, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#addClusterNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddClusterNodeSpec**](AddClusterNodeSpec.md)|  |
 **action** | **String**|  | [enum: add_cluster_node]

### Return type

[**ClusterNodeConfig**](ClusterNodeConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearClusterCertificateClearClusterCertificate"></a>
# **clearClusterCertificateClearClusterCertificate**
> ClusterCertificateId clearClusterCertificateClearClusterCertificate(certificateId)

Clear the cluster certificate

Clears the certificate used for the MP cluster. This does not affect the certificate itself. This API is deprecated. Instead use the  /api/v1/cluster/api-certificate?action&#x3D;set_cluster_certificate API to set the cluster certificate to a different one. It just means that from now on, individual certificates will be used on each MP node. This affects all nodes in the cluster. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String certificateId = "certificateId_example"; // String | Certificate ID
try {
    ClusterCertificateId result = apiInstance.clearClusterCertificateClearClusterCertificate(certificateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#clearClusterCertificateClearClusterCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **String**| Certificate ID |

### Return type

[**ClusterCertificateId**](ClusterCertificateId.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clearClusterVirtualIpClearVirtualIp"></a>
# **clearClusterVirtualIpClearVirtualIp**
> ClusterVirtualIpProperties clearClusterVirtualIpClearVirtualIp()

Clear cluster virtual IP address

Clears the cluster virtual IP address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
try {
    ClusterVirtualIpProperties result = apiInstance.clearClusterVirtualIpClearVirtualIp();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#clearClusterVirtualIpClearVirtualIp");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterVirtualIpProperties**](ClusterVirtualIpProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteClusterNodeConfig"></a>
# **deleteClusterNodeConfig**
> deleteClusterNodeConfig(nodeId)

Remove a controller from the cluster

Removes the specified controller from the NSX cluster. Before you can remove a controller from the cluster, you must shut down the controller service with the \&quot;stop service controller\&quot; command. Deprecated. Use POST /cluster/&lt;node-id&gt;?action&#x3D;remove_node to detach a node from cluster. The controller is removed with the node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | 
try {
    apiInstance.deleteClusterNodeConfig(nodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#deleteClusterNodeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="detachClusterNodeRemoveNode"></a>
# **detachClusterNodeRemoveNode**
> ClusterConfiguration detachClusterNodeRemoveNode(nodeId, force, gracefulShutdown, ignoreRepositoryIpCheck)

Detach a node from the Cluster

Detach a node from the Cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | UUID of the node
String force = "force_example"; // String | 
String gracefulShutdown = "gracefulShutdown_example"; // String | 
String ignoreRepositoryIpCheck = "ignoreRepositoryIpCheck_example"; // String | 
try {
    ClusterConfiguration result = apiInstance.detachClusterNodeRemoveNode(nodeId, force, gracefulShutdown, ignoreRepositoryIpCheck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#detachClusterNodeRemoveNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| UUID of the node |
 **force** | **String**|  | [optional] [enum: true, false]
 **gracefulShutdown** | **String**|  | [optional] [enum: true, false]
 **ignoreRepositoryIpCheck** | **String**|  | [optional] [enum: true, false]

### Return type

[**ClusterConfiguration**](ClusterConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApiServiceConfig"></a>
# **getApiServiceConfig**
> ApiServiceConfig getApiServiceConfig()

Read API service properties

Read the configuration of the NSX API service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
try {
    ApiServiceConfig result = apiInstance.getApiServiceConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#getApiServiceConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiServiceConfig**](ApiServiceConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterCertificateId"></a>
# **getClusterCertificateId**
> ClusterCertificateId getClusterCertificateId()

Read cluster certificate ID

Returns the ID of the certificate that is used as the cluster certificate for MP 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
try {
    ClusterCertificateId result = apiInstance.getClusterCertificateId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#getClusterCertificateId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterCertificateId**](ClusterCertificateId.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterNodeConfig"></a>
# **getClusterNodeConfig**
> ClusterNodeInfo getClusterNodeConfig(nodeId)

Read cluster node configuration

Returns information about the specified NSX cluster node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | 
try {
    ClusterNodeInfo result = apiInstance.getClusterNodeConfig(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#getClusterNodeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**ClusterNodeInfo**](ClusterNodeInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterVirtualIp"></a>
# **getClusterVirtualIp**
> ClusterVirtualIpProperties getClusterVirtualIp()

Read cluster virtual IP address

Returns the configured cluster virtual IP address or null if not configured. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
try {
    ClusterVirtualIpProperties result = apiInstance.getClusterVirtualIp();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#getClusterVirtualIp");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterVirtualIpProperties**](ClusterVirtualIpProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="joinClusterJoinCluster"></a>
# **joinClusterJoinCluster**
> ClusterConfiguration joinClusterJoinCluster(body)

Join this node to a NSX Cluster

Join this node to a NSX Cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
JoinClusterParameters body = new JoinClusterParameters(); // JoinClusterParameters | 
try {
    ClusterConfiguration result = apiInstance.joinClusterJoinCluster(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#joinClusterJoinCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JoinClusterParameters**](JoinClusterParameters.md)|  |

### Return type

[**ClusterConfiguration**](ClusterConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClusterNodeConfigs"></a>
# **listClusterNodeConfigs**
> ClusterNodeConfigListResult listClusterNodeConfigs(cursor, includedFields, pageSize, sortAscending, sortBy)

List Cluster Node Configurations

Returns information about all NSX cluster nodes. Deprecated. Use GET /cluster to get cluster configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ClusterNodeConfigListResult result = apiInstance.listClusterNodeConfigs(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#listClusterNodeConfigs");
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

[**ClusterNodeConfigListResult**](ClusterNodeConfigListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClusterNodeInterfaces"></a>
# **listClusterNodeInterfaces**
> NodeInterfacePropertiesListResult listClusterNodeInterfaces(nodeId, source)

List the specified node&#x27;s Network Interfaces

Returns the number of interfaces on the node and detailed information about each interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network mask, and the IP configuration method (static or DHCP). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfacePropertiesListResult result = apiInstance.listClusterNodeInterfaces(nodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#listClusterNodeInterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NodeInterfacePropertiesListResult**](NodeInterfacePropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterConfig"></a>
# **readClusterConfig**
> ClusterConfig readClusterConfig()

Read Cluster Configuration

Returns information about the NSX cluster configuration. An NSX cluster has two functions or purposes, commonly referred to as \&quot;roles.\&quot; These two roles are control and management. Each NSX installation has a single cluster. Separate NSX clusters do not share data. In other words, a given data-plane node is attached to only one cluster, not to multiple clusters. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
try {
    ClusterConfig result = apiInstance.readClusterConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#readClusterConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterConfig**](ClusterConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterNodeConfig"></a>
# **readClusterNodeConfig**
> ClusterNodeConfig readClusterNodeConfig(nodeId)

Read Cluster Node Configuration

Returns information about the specified NSX cluster node. Deprecated. Use GET /cluster/&lt;node-id&gt; to get cluster node configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | 
try {
    ClusterNodeConfig result = apiInstance.readClusterNodeConfig(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#readClusterNodeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**ClusterNodeConfig**](ClusterNodeConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterNodeInterface"></a>
# **readClusterNodeInterface**
> NodeInterfaceProperties readClusterNodeInterface(nodeId, interfaceId, source)

Read the node&#x27;s Network Interface

Returns detailed information about the specified interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network  mask, and the IP configuration method (static or DHCP). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | 
String interfaceId = "interfaceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfaceProperties result = apiInstance.readClusterNodeInterface(nodeId, interfaceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#readClusterNodeInterface");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **interfaceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NodeInterfaceProperties**](NodeInterfaceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterNodeInterfaceStatistics"></a>
# **readClusterNodeInterfaceStatistics**
> NodeInterfaceStatisticsProperties readClusterNodeInterfaceStatistics(nodeId, interfaceId, source)

Read the NSX Manager/Controller&#x27;s Network Interface Statistics

On the specified interface, returns the number of received (rx), transmitted (tx), and dropped packets; the number of bytes and errors received and transmitted on the interface; and the number of detected collisions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | 
String interfaceId = "interfaceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfaceStatisticsProperties result = apiInstance.readClusterNodeInterfaceStatistics(nodeId, interfaceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#readClusterNodeInterfaceStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **interfaceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NodeInterfaceStatisticsProperties**](NodeInterfaceStatisticsProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterNodeStatus"></a>
# **readClusterNodeStatus**
> ClusterNodeStatus readClusterNodeStatus(nodeId, source)

Read cluster node runtime status

Read aggregated runtime status of cluster node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String nodeId = "nodeId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    ClusterNodeStatus result = apiInstance.readClusterNodeStatus(nodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#readClusterNodeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**ClusterNodeStatus**](ClusterNodeStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterNodesAggregateStatus"></a>
# **readClusterNodesAggregateStatus**
> ClustersAggregateInfo readClusterNodesAggregateStatus()

Read cluster runtime status

Read aggregated runtime status of all cluster nodes. Deprecated. Use GET /cluster/status instead. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
try {
    ClustersAggregateInfo result = apiInstance.readClusterNodesAggregateStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#readClusterNodesAggregateStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClustersAggregateInfo**](ClustersAggregateInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterStatus"></a>
# **readClusterStatus**
> ClusterStatus readClusterStatus()

Read Cluster Status

Returns status information for the NSX cluster control role and management role. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
try {
    ClusterStatus result = apiInstance.readClusterStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#readClusterStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterStatus**](ClusterStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setClusterCertificateSetClusterCertificate"></a>
# **setClusterCertificateSetClusterCertificate**
> ClusterCertificateId setClusterCertificateSetClusterCertificate(certificateId)

Set the cluster certificate

Sets the certificate used for the MP cluster. Issuing this request causes the http service to restart so that the service can begin using the new certificate. When the POST request succeeds, it doesn&#x27;t return a valid response. The request times out because of the restart. This affects all nodes in the cluster. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String certificateId = "certificateId_example"; // String | Certificate ID
try {
    ClusterCertificateId result = apiInstance.setClusterCertificateSetClusterCertificate(certificateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#setClusterCertificateSetClusterCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **String**| Certificate ID |

### Return type

[**ClusterCertificateId**](ClusterCertificateId.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setClusterVirtualIpSetVirtualIp"></a>
# **setClusterVirtualIpSetVirtualIp**
> ClusterVirtualIpProperties setClusterVirtualIpSetVirtualIp(ipAddress)

Set cluster virtual IP address

Sets the cluster virtual IP address. Note, all nodes in the management cluster must be in the same subnet. If not, a 409 CONFLICT status is returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
String ipAddress = "ipAddress_example"; // String | Virtual IP address, 0.0.0.0 if not configured
try {
    ClusterVirtualIpProperties result = apiInstance.setClusterVirtualIpSetVirtualIp(ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#setClusterVirtualIpSetVirtualIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | **String**| Virtual IP address, 0.0.0.0 if not configured |

### Return type

[**ClusterVirtualIpProperties**](ClusterVirtualIpProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApiServiceConfig"></a>
# **updateApiServiceConfig**
> ApiServiceConfig updateApiServiceConfig(body)

Update API service properties

Read the configuration of the NSX API service. Changes are applied to all nodes in the cluster. The API service on each node will restart after it is updated using this API. There may be a delay of up to a minute or so between the time this API call completes and when the new configuration goes into effect.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationClusterManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationClusterManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();
ApiServiceConfig body = new ApiServiceConfig(); // ApiServiceConfig | 
try {
    ApiServiceConfig result = apiInstance.updateApiServiceConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationClusterManagementApi#updateApiServiceConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiServiceConfig**](ApiServiceConfig.md)|  |

### Return type

[**ApiServiceConfig**](ApiServiceConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

