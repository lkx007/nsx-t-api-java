# ManagementPlaneApiNetworkTransportTransportNodesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComputeCollectionTransportNodeTemplateAndTNCollection**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#createComputeCollectionTransportNodeTemplateAndTNCollection) | **POST** /compute-collection-transport-node-templates | Create transport node template for compute collection.
[**createNetworkMigrationSpec**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#createNetworkMigrationSpec) | **POST** /network-migration-specs | Create a template of network migration specification.
[**createTransportNodeWithDeploymentInfo**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#createTransportNodeWithDeploymentInfo) | **POST** /transport-nodes | Create a Transport Node
[**deleteComputeCollectionTransportNodeTemplateAndTNCollection**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#deleteComputeCollectionTransportNodeTemplateAndTNCollection) | **DELETE** /compute-collection-transport-node-templates/{template-id} | Delete a compute collection transport node template
[**deleteNetworkMigrationSpec**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#deleteNetworkMigrationSpec) | **DELETE** /network-migration-specs/{template-id} | Delete a network migration specification template
[**deleteTransportNodeWithDeploymentInfo**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#deleteTransportNodeWithDeploymentInfo) | **DELETE** /transport-nodes/{transport-node-id} | Delete a Transport Node
[**disableFlowCacheDisableFlowCache**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#disableFlowCacheDisableFlowCache) | **POST** /transport-nodes/{transport-node-id}?action&#x3D;disable_flow_cache | Disable flow cache for an edge transport node
[**enableFlowCacheEnableFlowCache**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#enableFlowCacheEnableFlowCache) | **POST** /transport-nodes/{transport-node-id}?action&#x3D;enable_flow_cache | Enable flow cache for an edge transport node
[**getAllTransportNodesStatus**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getAllTransportNodesStatus) | **GET** /transport-nodes/status | Get high-level summary of all transport nodes. The service layer does not support source &#x3D; realtime or cached.
[**getAllTransportZoneStatus**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getAllTransportZoneStatus) | **GET** /transport-zones/status | Get high-level summary of a transport zone. The service layer does not support source &#x3D; realtime or cached.
[**getComputeCollectionTransportNodeTemplate**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getComputeCollectionTransportNodeTemplate) | **GET** /compute-collection-transport-node-templates/{template-id} | Get compute collection transportnode template by id
[**getComputeCollectionTransportNodeTemplateState**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getComputeCollectionTransportNodeTemplateState) | **GET** /compute-collection-transport-node-templates/{template-id}/state | Get compute collection transportnode template application states
[**getFabricNodeModulesOfTransportNode**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getFabricNodeModulesOfTransportNode) | **GET** /transport-nodes/{node-id}/modules | Get the module details of a transport node 
[**getHeatmapTransportZoneStatus**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getHeatmapTransportZoneStatus) | **GET** /transport-zones/{zone-id}/status | Get high-level summary of a transport zone
[**getNetworkMigrationSpec**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getNetworkMigrationSpec) | **GET** /network-migration-specs/{template-id} | Get network migration specification template by id.
[**getPnicStatusesForTransportNode**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getPnicStatusesForTransportNode) | **GET** /transport-nodes/{node-id}/pnic-bond-status | Get high-level summary of a transport node
[**getTransportNodeReport**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getTransportNodeReport) | **GET** /transport-zones/transport-node-status-report | Creates a status report of transport nodes of all the transport zones
[**getTransportNodeReportForATransportZone**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getTransportNodeReportForATransportZone) | **GET** /transport-zones/{zone-id}/transport-node-status-report | Creates a status report of transport nodes in a transport zone
[**getTransportNodeStateWithDeploymentInfo**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getTransportNodeStateWithDeploymentInfo) | **GET** /transport-nodes/{transport-node-id}/state | Get a Transport Node&#x27;s State
[**getTransportNodeStatus**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getTransportNodeStatus) | **GET** /transport-nodes/{node-id}/status | Read status of a transport node
[**getTransportNodeWithDeploymentInfo**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getTransportNodeWithDeploymentInfo) | **GET** /transport-nodes/{transport-node-id} | Get a Transport Node
[**getTunnel**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#getTunnel) | **GET** /transport-nodes/{node-id}/tunnels/{tunnel-name} | Tunnel properties
[**listComputeCollectionTransportNodeTemplates**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listComputeCollectionTransportNodeTemplates) | **GET** /compute-collection-transport-node-templates | List compute collection transportnode templates
[**listNeighborProperties**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listNeighborProperties) | **GET** /lldp/transport-nodes/{node-id}/interfaces | List LLDP Neighbor Properties of Transport Node
[**listNetworkMigrationSpecs**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listNetworkMigrationSpecs) | **GET** /network-migration-specs | List all network migration specification templates.
[**listRemoteTransportNodeStatus**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listRemoteTransportNodeStatus) | **GET** /transport-nodes/{node-id}/remote-transport-node-status | Read status of all transport nodes with tunnel connections to transport node 
[**listTransportNodeCapabilities**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listTransportNodeCapabilities) | **GET** /transport-nodes/{transport-node-id}/capabilities | Return the list of capabilities of transport node
[**listTransportNodeInterfaces**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listTransportNodeInterfaces) | **GET** /transport-nodes/{transport-node-id}/network/interfaces | List the specified transport node&#x27;s network interfaces
[**listTransportNodeStatus**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listTransportNodeStatus) | **GET** /transport-zones/transport-node-status | Read status of all the transport nodes
[**listTransportNodeStatusForTransportZone**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listTransportNodeStatusForTransportZone) | **GET** /transport-zones/{zone-id}/transport-node-status | Read status of transport nodes in a transport zone
[**listTransportNodesByStateWithDeploymentInfo**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listTransportNodesByStateWithDeploymentInfo) | **GET** /transport-nodes/state | List transport nodes by realized state
[**listTransportNodesWithDeploymentInfo**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#listTransportNodesWithDeploymentInfo) | **GET** /transport-nodes | List Transport Nodes
[**queryTunnels**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#queryTunnels) | **GET** /transport-nodes/{node-id}/tunnels | List of tunnels
[**readNeighborProperties**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#readNeighborProperties) | **GET** /lldp/transport-nodes/{node-id}/interfaces/{interface-name} | Read LLDP Neighbor Properties of Transport Node by Interface Name 
[**readTransportNodeInterface**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#readTransportNodeInterface) | **GET** /transport-nodes/{transport-node-id}/network/interfaces/{interface-id} | Read the transport node&#x27;s network interface
[**readTransportNodeInterfaceStatistics**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#readTransportNodeInterfaceStatistics) | **GET** /transport-nodes/{transport-node-id}/network/interfaces/{interface-id}/stats | Read the NSX Manager&#x27;s Network Interface Statistics
[**refreshTransportNode**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#refreshTransportNode) | **POST** /transport-nodes/{transport-node-id}?action&#x3D;refresh_node_configuration&amp;resource_type&#x3D;EdgeNode | Refresh the node configuration for the Edge node.
[**restartTransportNodeInventorySyncRestartInventorySync**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#restartTransportNodeInventorySyncRestartInventorySync) | **POST** /transport-nodes/{transport-node-id}?action&#x3D;restart_inventory_sync | Restart the inventory sync for the node if it is paused currently.
[**restoreParentClusterConfigurationRestoreClusterConfig**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#restoreParentClusterConfigurationRestoreClusterConfig) | **POST** /transport-nodes/{transport-node-id}?action&#x3D;restore_cluster_config | Apply cluster level Transport Node Profile on overridden host
[**resyncTransportNodeResyncHostConfig**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#resyncTransportNodeResyncHostConfig) | **POST** /transport-nodes/{transportnode-id}?action&#x3D;resync_host_config | Resync a Transport Node
[**updateComputeCollectionTransportNodeTemplateAndTNCollection**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#updateComputeCollectionTransportNodeTemplateAndTNCollection) | **PUT** /compute-collection-transport-node-templates/{template-id} | Update compute collection transportnode template
[**updateNetworkMigrationSpec**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#updateNetworkMigrationSpec) | **PUT** /network-migration-specs/{template-id} | Update a template of network migration specification.
[**updateTransportNodeMaintenanceMode**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#updateTransportNodeMaintenanceMode) | **POST** /transport-nodes/{transportnode-id} | Update transport node maintenance mode
[**updateTransportNodeWithDeploymentInfo**](ManagementPlaneApiNetworkTransportTransportNodesApi.md#updateTransportNodeWithDeploymentInfo) | **PUT** /transport-nodes/{transport-node-id} | Update a Transport Node

<a name="createComputeCollectionTransportNodeTemplateAndTNCollection"></a>
# **createComputeCollectionTransportNodeTemplateAndTNCollection**
> ComputeCollectionTransportNodeTemplate createComputeCollectionTransportNodeTemplateAndTNCollection(body)

Create transport node template for compute collection.

If automated transport node creation is configured on compute collection, this template will serve as the default setting for transport node creation. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
ComputeCollectionTransportNodeTemplate body = new ComputeCollectionTransportNodeTemplate(); // ComputeCollectionTransportNodeTemplate | 
try {
    ComputeCollectionTransportNodeTemplate result = apiInstance.createComputeCollectionTransportNodeTemplateAndTNCollection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#createComputeCollectionTransportNodeTemplateAndTNCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComputeCollectionTransportNodeTemplate**](ComputeCollectionTransportNodeTemplate.md)|  |

### Return type

[**ComputeCollectionTransportNodeTemplate**](ComputeCollectionTransportNodeTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNetworkMigrationSpec"></a>
# **createNetworkMigrationSpec**
> NetworkMigrationSpec createNetworkMigrationSpec(body)

Create a template of network migration specification.

Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
NetworkMigrationSpec body = new NetworkMigrationSpec(); // NetworkMigrationSpec | 
try {
    NetworkMigrationSpec result = apiInstance.createNetworkMigrationSpec(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#createNetworkMigrationSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetworkMigrationSpec**](NetworkMigrationSpec.md)|  |

### Return type

[**NetworkMigrationSpec**](NetworkMigrationSpec.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTransportNodeWithDeploymentInfo"></a>
# **createTransportNodeWithDeploymentInfo**
> TransportNode createTransportNodeWithDeploymentInfo(body)

Create a Transport Node

Transport nodes are hypervisor hosts and NSX Edges that will participate in an NSX-T overlay. For a hypervisor host, this means that it hosts VMs that will communicate over NSX-T logical switches. For NSX Edges, this means that it will have logical router uplinks and downlinks.  This API creates transport node for a host node (hypervisor) or edge node (router) in the transport network.  When you run this command for a host, NSX Manager attempts to install the NSX kernel modules, which are packaged as VIB, RPM, or DEB files. For the installation to succeed, you must provide the host login credentials and the host thumbprint.  To get the ESXi host thumbprint, SSH to the host and run the &lt;b&gt;openssl x509 -in /etc/vmware/ssl/rui.crt -fingerprint -sha256 -noout&lt;/b&gt; command.  To generate host key thumbprint using SHA-256 algorithm please follow the steps below.  Log into the host, making sure that the connection is not vulnerable to a man in the middle attack. Check whether a public key already exists. Host public key is generally located at &#x27;/etc/ssh/ssh_host_rsa_key.pub&#x27;. If the key is not present then generate a new key by running the following command and follow the instructions.  &lt;b&gt;ssh-keygen -t rsa&lt;/b&gt;  Now generate a SHA256 hash of the key using the following command. Please make sure to pass the appropriate file name if the public key is stored with a different file name other than the default &#x27;id_rsa.pub&#x27;.  &lt;b&gt;awk &#x27;{print $2}&#x27; id_rsa.pub | base64 -d | sha256sum -b | sed &#x27;s/ .*$//&#x27; | xxd -r -p | base64&lt;/b&gt; This api is deprecated as part of FN+TN unification. Please use Transport Node API to install NSX components on a node.  Additional documentation on creating a transport node can be found in the NSX-T Installation Guide.  In order for the transport node to forward packets, the host_switch_spec property must be specified.  Host switches (called bridges in OVS on KVM hypervisors) are the individual switches within the host virtual switch. Virtual machines are connected to the host switches.  When creating a transport node, you need to specify if the host switches are already manually preconfigured on the node, or if NSX should create and manage the host switches. You specify this choice by the type of host switches you pass in the host_switch_spec property of the TransportNode request payload.  For a KVM host, you can preconfigure the host switch, or you can have NSX Manager perform the configuration. For an ESXi host or NSX Edge node, NSX Manager always configures the host switch.  To preconfigure the host switches on a KVM host, pass an array of PreconfiguredHostSwitchSpec objects that describes those host switches. In the current NSX-T release, only one prefonfigured host switch can be specified.  See the PreconfiguredHostSwitchSpec schema definition for documentation on the properties that must be provided. Preconfigured host switches are only supported on KVM hosts, not on ESXi hosts or NSX Edge nodes.  To allow NSX to manage the host switch configuration on KVM hosts, ESXi hosts, or NSX Edge nodes, pass an array of StandardHostSwitchSpec objects in the host_switch_spec property, and NSX will automatically create host switches with the properties you provide. In the current NSX-T release, up to 5 host switches can be automatically managed. See the StandardHostSwitchSpec schema definition for documentation on the properties that must be provided.  Note: previous versions of NSX-T used a property named host_switches to specify the host switch configuration on the transport node. That property is deprecated, but still functions. You should configure new host switches using the host_switch_spec property.  The request should either provide node_deployement_info or node_id.  If the host node (hypervisor) or edge node (router) is already added in system then it can be converted to transport node by providing node_id in request.  If host node (hypervisor) or edge node (router) is not already present in system then information should be provided under node_deployment_info. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
TransportNode body = new TransportNode(); // TransportNode | 
try {
    TransportNode result = apiInstance.createTransportNodeWithDeploymentInfo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#createTransportNodeWithDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportNode**](TransportNode.md)|  |

### Return type

[**TransportNode**](TransportNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteComputeCollectionTransportNodeTemplateAndTNCollection"></a>
# **deleteComputeCollectionTransportNodeTemplateAndTNCollection**
> deleteComputeCollectionTransportNodeTemplateAndTNCollection(templateId)

Delete a compute collection transport node template

Delete the specified compute collection transport node template. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String templateId = "templateId_example"; // String | 
try {
    apiInstance.deleteComputeCollectionTransportNodeTemplateAndTNCollection(templateId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#deleteComputeCollectionTransportNodeTemplateAndTNCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNetworkMigrationSpec"></a>
# **deleteNetworkMigrationSpec**
> deleteNetworkMigrationSpec(templateId)

Delete a network migration specification template

Delete the specified network migration specification template. Delete will fail if this is a HostProfileNetworkMigrationSpec and is associated with certain compute collection. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String templateId = "templateId_example"; // String | 
try {
    apiInstance.deleteNetworkMigrationSpec(templateId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#deleteNetworkMigrationSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTransportNodeWithDeploymentInfo"></a>
# **deleteTransportNodeWithDeploymentInfo**
> deleteTransportNodeWithDeploymentInfo(transportNodeId, force, unprepareHost)

Delete a Transport Node

Deletes the specified transport node. Query param force can be used to force delete the host nodes. Force deletion of edge and public cloud gateway nodes is not supported.  It also removes the specified node (host or edge) from system. If unprepare_host option is set to false, then host will be deleted without uninstalling the NSX components from the host. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
Boolean unprepareHost = true; // Boolean | Uninstall NSX components from host while deleting
try {
    apiInstance.deleteTransportNodeWithDeploymentInfo(transportNodeId, force, unprepareHost);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#deleteTransportNodeWithDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]
 **unprepareHost** | **Boolean**| Uninstall NSX components from host while deleting | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disableFlowCacheDisableFlowCache"></a>
# **disableFlowCacheDisableFlowCache**
> disableFlowCacheDisableFlowCache(transportNodeId)

Disable flow cache for an edge transport node

Disable flow cache for edge transport node. Caution: This involves restart of the edge dataplane and hence may lead to network disruption. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    apiInstance.disableFlowCacheDisableFlowCache(transportNodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#disableFlowCacheDisableFlowCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableFlowCacheEnableFlowCache"></a>
# **enableFlowCacheEnableFlowCache**
> enableFlowCacheEnableFlowCache(transportNodeId)

Enable flow cache for an edge transport node

Enable flow cache for edge transport node. Caution: This involves restart of the edge dataplane and hence may lead to network disruption. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    apiInstance.enableFlowCacheEnableFlowCache(transportNodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#enableFlowCacheEnableFlowCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTransportNodesStatus"></a>
# **getAllTransportNodesStatus**
> HeatMapTransportZoneStatus getAllTransportNodesStatus(nodeType)

Get high-level summary of all transport nodes. The service layer does not support source &#x3D; realtime or cached.

Get high-level summary of all transport nodes. The service layer does not support source &#x3D; realtime or cached.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeType = "nodeType_example"; // String | Transport node type
try {
    HeatMapTransportZoneStatus result = apiInstance.getAllTransportNodesStatus(nodeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getAllTransportNodesStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeType** | **String**| Transport node type | [optional] [enum: HOST, EDGE]

### Return type

[**HeatMapTransportZoneStatus**](HeatMapTransportZoneStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTransportZoneStatus"></a>
# **getAllTransportZoneStatus**
> HeatMapTransportNodesAggregateStatus getAllTransportZoneStatus()

Get high-level summary of a transport zone. The service layer does not support source &#x3D; realtime or cached.

Get high-level summary of a transport zone. The service layer does not support source &#x3D; realtime or cached.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
try {
    HeatMapTransportNodesAggregateStatus result = apiInstance.getAllTransportZoneStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getAllTransportZoneStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HeatMapTransportNodesAggregateStatus**](HeatMapTransportNodesAggregateStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComputeCollectionTransportNodeTemplate"></a>
# **getComputeCollectionTransportNodeTemplate**
> ComputeCollectionTransportNodeTemplate getComputeCollectionTransportNodeTemplate(templateId)

Get compute collection transportnode template by id

Returns compute collection transportnode template by id Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String templateId = "templateId_example"; // String | 
try {
    ComputeCollectionTransportNodeTemplate result = apiInstance.getComputeCollectionTransportNodeTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getComputeCollectionTransportNodeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**|  |

### Return type

[**ComputeCollectionTransportNodeTemplate**](ComputeCollectionTransportNodeTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComputeCollectionTransportNodeTemplateState"></a>
# **getComputeCollectionTransportNodeTemplateState**
> ComputeCollectionTransportNodeTemplateStateList getComputeCollectionTransportNodeTemplateState(templateId, computeCollectionId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get compute collection transportnode template application states

Returns detailed transport node states for this compute collection Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String templateId = "templateId_example"; // String | 
String computeCollectionId = "computeCollectionId_example"; // String | Compute collection id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ComputeCollectionTransportNodeTemplateStateList result = apiInstance.getComputeCollectionTransportNodeTemplateState(templateId, computeCollectionId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getComputeCollectionTransportNodeTemplateState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**|  |
 **computeCollectionId** | **String**| Compute collection id | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ComputeCollectionTransportNodeTemplateStateList**](ComputeCollectionTransportNodeTemplateStateList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFabricNodeModulesOfTransportNode"></a>
# **getFabricNodeModulesOfTransportNode**
> SoftwareModuleResult getFabricNodeModulesOfTransportNode(nodeId)

Get the module details of a transport node 

Get the module details of a transport node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | 
try {
    SoftwareModuleResult result = apiInstance.getFabricNodeModulesOfTransportNode(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getFabricNodeModulesOfTransportNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**SoftwareModuleResult**](SoftwareModuleResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHeatmapTransportZoneStatus"></a>
# **getHeatmapTransportZoneStatus**
> HeatMapTransportZoneStatus getHeatmapTransportZoneStatus(zoneId, source)

Get high-level summary of a transport zone

Get high-level summary of a transport zone

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String zoneId = "zoneId_example"; // String | ID of transport zone
String source = "source_example"; // String | Data source type.
try {
    HeatMapTransportZoneStatus result = apiInstance.getHeatmapTransportZoneStatus(zoneId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getHeatmapTransportZoneStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**| ID of transport zone |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**HeatMapTransportZoneStatus**](HeatMapTransportZoneStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkMigrationSpec"></a>
# **getNetworkMigrationSpec**
> NetworkMigrationSpec getNetworkMigrationSpec(templateId)

Get network migration specification template by id.

Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String templateId = "templateId_example"; // String | 
try {
    NetworkMigrationSpec result = apiInstance.getNetworkMigrationSpec(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getNetworkMigrationSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**|  |

### Return type

[**NetworkMigrationSpec**](NetworkMigrationSpec.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPnicStatusesForTransportNode"></a>
# **getPnicStatusesForTransportNode**
> PnicBondStatusListResult getPnicStatusesForTransportNode(nodeId, status)

Get high-level summary of a transport node

Get high-level summary of a transport node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | ID of transport node
String status = "status_example"; // String | pNic/bond status
try {
    PnicBondStatusListResult result = apiInstance.getPnicStatusesForTransportNode(nodeId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getPnicStatusesForTransportNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of transport node |
 **status** | **String**| pNic/bond status | [optional] [enum: UNKNOWN, UP, DOWN, DEGRADED]

### Return type

[**PnicBondStatusListResult**](PnicBondStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportNodeReport"></a>
# **getTransportNodeReport**
> getTransportNodeReport(source, status)

Creates a status report of transport nodes of all the transport zones

You must provide the request header \&quot;Accept:application/octet-stream\&quot; when calling this API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String source = "source_example"; // String | Data source type.
String status = "status_example"; // String | Transport node
try {
    apiInstance.getTransportNodeReport(source, status);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getTransportNodeReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **status** | **String**| Transport node | [optional] [enum: UP, DOWN, DEGRADED]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getTransportNodeReportForATransportZone"></a>
# **getTransportNodeReportForATransportZone**
> getTransportNodeReportForATransportZone(zoneId, source, status)

Creates a status report of transport nodes in a transport zone

You must provide the request header \&quot;Accept:application/octet-stream\&quot; when calling this API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String zoneId = "zoneId_example"; // String | ID of transport zone
String source = "source_example"; // String | Data source type.
String status = "status_example"; // String | Transport node
try {
    apiInstance.getTransportNodeReportForATransportZone(zoneId, source, status);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getTransportNodeReportForATransportZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**| ID of transport zone |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **status** | **String**| Transport node | [optional] [enum: UP, DOWN, DEGRADED]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getTransportNodeStateWithDeploymentInfo"></a>
# **getTransportNodeStateWithDeploymentInfo**
> TransportNodeState getTransportNodeStateWithDeploymentInfo(transportNodeId)

Get a Transport Node&#x27;s State

Returns information about the current state of the transport node configuration and information about the associated hostswitch. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    TransportNodeState result = apiInstance.getTransportNodeStateWithDeploymentInfo(transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getTransportNodeStateWithDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

[**TransportNodeState**](TransportNodeState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportNodeStatus"></a>
# **getTransportNodeStatus**
> TransportNodeStatus getTransportNodeStatus(nodeId, source)

Read status of a transport node

Read status of a transport node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | ID of transport node
String source = "source_example"; // String | Data source type.
try {
    TransportNodeStatus result = apiInstance.getTransportNodeStatus(nodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getTransportNodeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of transport node |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**TransportNodeStatus**](TransportNodeStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportNodeWithDeploymentInfo"></a>
# **getTransportNodeWithDeploymentInfo**
> TransportNode getTransportNodeWithDeploymentInfo(transportNodeId)

Get a Transport Node

Returns information about a specified transport node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    TransportNode result = apiInstance.getTransportNodeWithDeploymentInfo(transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getTransportNodeWithDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

[**TransportNode**](TransportNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTunnel"></a>
# **getTunnel**
> TunnelProperties getTunnel(nodeId, tunnelName, source)

Tunnel properties

Tunnel properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | ID of transport node
String tunnelName = "tunnelName_example"; // String | Tunnel name
String source = "source_example"; // String | Data source type.
try {
    TunnelProperties result = apiInstance.getTunnel(nodeId, tunnelName, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#getTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of transport node |
 **tunnelName** | **String**| Tunnel name |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**TunnelProperties**](TunnelProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listComputeCollectionTransportNodeTemplates"></a>
# **listComputeCollectionTransportNodeTemplates**
> TransportNodeTemplateListResult listComputeCollectionTransportNodeTemplates(computeCollectionId)

List compute collection transportnode templates

Returns all eligible compute collection transportnode templates Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String computeCollectionId = "computeCollectionId_example"; // String | Compute collection id
try {
    TransportNodeTemplateListResult result = apiInstance.listComputeCollectionTransportNodeTemplates(computeCollectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listComputeCollectionTransportNodeTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeCollectionId** | **String**| Compute collection id | [optional]

### Return type

[**TransportNodeTemplateListResult**](TransportNodeTemplateListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNeighborProperties"></a>
# **listNeighborProperties**
> InterfaceNeighborPropertyListResult listNeighborProperties(nodeId)

List LLDP Neighbor Properties of Transport Node

List LLDP Neighbor Properties for all interfaces of Transport Node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | ID of transport node
try {
    InterfaceNeighborPropertyListResult result = apiInstance.listNeighborProperties(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listNeighborProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of transport node |

### Return type

[**InterfaceNeighborPropertyListResult**](InterfaceNeighborPropertyListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNetworkMigrationSpecs"></a>
# **listNetworkMigrationSpecs**
> NetworkMigrationSpecListResult listNetworkMigrationSpecs(cursor, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, type)

List all network migration specification templates.

Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean includeSystemOwned = true; // Boolean | Whether the list result contains system resources
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String type = "type_example"; // String | Supported network migration specification types.
try {
    NetworkMigrationSpecListResult result = apiInstance.listNetworkMigrationSpecs(cursor, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listNetworkMigrationSpecs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includeSystemOwned** | **Boolean**| Whether the list result contains system resources | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **type** | **String**| Supported network migration specification types. | [optional] [enum: HostProfileNetworkMigrationSpec]

### Return type

[**NetworkMigrationSpecListResult**](NetworkMigrationSpecListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRemoteTransportNodeStatus"></a>
# **listRemoteTransportNodeStatus**
> TransportNodeStatusListResult listRemoteTransportNodeStatus(nodeId, bfdDiagnosticCode, cursor, includedFields, pageSize, sortAscending, sortBy, source, tunnelStatus)

Read status of all transport nodes with tunnel connections to transport node 

Read status of all transport nodes with tunnel connections to transport node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | ID of transport node
String bfdDiagnosticCode = "bfdDiagnosticCode_example"; // String | BFD diagnostic code of Tunnel
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String tunnelStatus = "tunnelStatus_example"; // String | Tunnel Status
try {
    TransportNodeStatusListResult result = apiInstance.listRemoteTransportNodeStatus(nodeId, bfdDiagnosticCode, cursor, includedFields, pageSize, sortAscending, sortBy, source, tunnelStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listRemoteTransportNodeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of transport node |
 **bfdDiagnosticCode** | **String**| BFD diagnostic code of Tunnel | [optional] [enum: 0, NO_DIAGNOSTIC, 1, CONTROL_DETECTION_TIME_EXPIRED, 2, ECHO_FUNCTION_FAILED, 3, NEIGHBOR_SIGNALED_SESSION_DOWN, 4, FORWARDING_PLANE_RESET, 5, PATH_DOWN, 6, CONCATENATED_PATH_DOWN, 7, ADMINISTRATIVELY_DOWN, 8, REVERSE_CONCATENATED_PATH_DOWN]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **tunnelStatus** | **String**| Tunnel Status | [optional] [enum: UP, DOWN]

### Return type

[**TransportNodeStatusListResult**](TransportNodeStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodeCapabilities"></a>
# **listTransportNodeCapabilities**
> NodeCapabilitiesResult listTransportNodeCapabilities(transportNodeId)

Return the list of capabilities of transport node

Returns information about capabilities of transport host node. Edge nodes do not have capabilities.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    NodeCapabilitiesResult result = apiInstance.listTransportNodeCapabilities(transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listTransportNodeCapabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

[**NodeCapabilitiesResult**](NodeCapabilitiesResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodeInterfaces"></a>
# **listTransportNodeInterfaces**
> NodeInterfacePropertiesListResult listTransportNodeInterfaces(transportNodeId, source)

List the specified transport node&#x27;s network interfaces

Returns the number of interfaces on the node and detailed information about each interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network mask, and the IP configuration method (static or DHCP). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfacePropertiesListResult result = apiInstance.listTransportNodeInterfaces(transportNodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listTransportNodeInterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NodeInterfacePropertiesListResult**](NodeInterfacePropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodeStatus"></a>
# **listTransportNodeStatus**
> TransportNodeStatusListResult listTransportNodeStatus(cursor, includedFields, pageSize, sortAscending, sortBy, source, status)

Read status of all the transport nodes

Read status of all the transport nodes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String status = "status_example"; // String | Transport node
try {
    TransportNodeStatusListResult result = apiInstance.listTransportNodeStatus(cursor, includedFields, pageSize, sortAscending, sortBy, source, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listTransportNodeStatus");
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
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **status** | **String**| Transport node | [optional] [enum: UP, DOWN, DEGRADED, UNKNOWN]

### Return type

[**TransportNodeStatusListResult**](TransportNodeStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodeStatusForTransportZone"></a>
# **listTransportNodeStatusForTransportZone**
> TransportNodeStatusListResult listTransportNodeStatusForTransportZone(zoneId, cursor, includedFields, pageSize, sortAscending, sortBy, source, status)

Read status of transport nodes in a transport zone

Read status of transport nodes in a transport zone

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String zoneId = "zoneId_example"; // String | ID of transport zone
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String status = "status_example"; // String | Transport node
try {
    TransportNodeStatusListResult result = apiInstance.listTransportNodeStatusForTransportZone(zoneId, cursor, includedFields, pageSize, sortAscending, sortBy, source, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listTransportNodeStatusForTransportZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**| ID of transport zone |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **status** | **String**| Transport node | [optional] [enum: UP, DOWN, DEGRADED, UNKNOWN]

### Return type

[**TransportNodeStatusListResult**](TransportNodeStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodesByStateWithDeploymentInfo"></a>
# **listTransportNodesByStateWithDeploymentInfo**
> TransportNodeStateListResult listTransportNodesByStateWithDeploymentInfo(mmState, status, vtepIp)

List transport nodes by realized state

Returns a list of transport node states that have realized state as provided as query parameter 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String mmState = "mmState_example"; // String | maintenance mode state
String status = "status_example"; // String | Realized state of transport nodes
String vtepIp = "vtepIp_example"; // String | Virtual tunnel endpoint ip address of transport node
try {
    TransportNodeStateListResult result = apiInstance.listTransportNodesByStateWithDeploymentInfo(mmState, status, vtepIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listTransportNodesByStateWithDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmState** | **String**| maintenance mode state | [optional] [enum: ENTERING, ENABLED, EXITING, DISABLED]
 **status** | **String**| Realized state of transport nodes | [optional] [enum: PENDING, IN_PROGRESS, SUCCESS, PARTIAL_SUCCESS, FAILED, ORPHANED]
 **vtepIp** | **String**| Virtual tunnel endpoint ip address of transport node | [optional]

### Return type

[**TransportNodeStateListResult**](TransportNodeStateListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodesWithDeploymentInfo"></a>
# **listTransportNodesWithDeploymentInfo**
> TransportNodeListResult listTransportNodesWithDeploymentInfo(cursor, inMaintenanceMode, includedFields, nodeId, nodeIp, nodeTypes, pageSize, sortAscending, sortBy, transportZoneId)

List Transport Nodes

Returns information about all transport nodes along with underlying host or edge details. A transport node is a host or edge that contains hostswitches. A hostswitch can have virtual machines connected to them.  Because each transport node has hostswitches, transport nodes can also have virtual tunnel endpoints, which means that they can be part of the overlay. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean inMaintenanceMode = true; // Boolean | maintenance mode flag
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String nodeId = "nodeId_example"; // String | node identifier
String nodeIp = "nodeIp_example"; // String | Fabric node IP address
String nodeTypes = "nodeTypes_example"; // String | a list of fabric node types separated by comma or a single type
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String transportZoneId = "transportZoneId_example"; // String | Transport zone identifier
try {
    TransportNodeListResult result = apiInstance.listTransportNodesWithDeploymentInfo(cursor, inMaintenanceMode, includedFields, nodeId, nodeIp, nodeTypes, pageSize, sortAscending, sortBy, transportZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#listTransportNodesWithDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **inMaintenanceMode** | **Boolean**| maintenance mode flag | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **nodeId** | **String**| node identifier | [optional]
 **nodeIp** | **String**| Fabric node IP address | [optional]
 **nodeTypes** | **String**| a list of fabric node types separated by comma or a single type | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **transportZoneId** | **String**| Transport zone identifier | [optional]

### Return type

[**TransportNodeListResult**](TransportNodeListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryTunnels"></a>
# **queryTunnels**
> TunnelList queryTunnels(nodeId, bfdDiagnosticCode, cursor, includedFields, pageSize, remoteNodeId, sortAscending, sortBy, source, status)

List of tunnels

List of tunnels

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | ID of transport node
String bfdDiagnosticCode = "bfdDiagnosticCode_example"; // String | BFD diagnostic code of Tunnel as defined in RFC 5880
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String remoteNodeId = "remoteNodeId_example"; // String | 
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String status = "status_example"; // String | Tunnel status
try {
    TunnelList result = apiInstance.queryTunnels(nodeId, bfdDiagnosticCode, cursor, includedFields, pageSize, remoteNodeId, sortAscending, sortBy, source, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#queryTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of transport node |
 **bfdDiagnosticCode** | **String**| BFD diagnostic code of Tunnel as defined in RFC 5880 | [optional] [enum: 0, NO_DIAGNOSTIC, 1, CONTROL_DETECTION_TIME_EXPIRED, 2, ECHO_FUNCTION_FAILED, 3, NEIGHBOR_SIGNALED_SESSION_DOWN, 4, FORWARDING_PLANE_RESET, 5, PATH_DOWN, 6, CONCATENATED_PATH_DOWN, 7, ADMINISTRATIVELY_DOWN, 8, REVERSE_CONCATENATED_PATH_DOWN]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **remoteNodeId** | **String**|  | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **status** | **String**| Tunnel status | [optional] [enum: UP, DOWN]

### Return type

[**TunnelList**](TunnelList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNeighborProperties"></a>
# **readNeighborProperties**
> InterfaceNeighborProperties readNeighborProperties(nodeId, interfaceName)

Read LLDP Neighbor Properties of Transport Node by Interface Name 

Read LLDP Neighbor Properties for a specific interface of Transport Node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String nodeId = "nodeId_example"; // String | ID of transport node
String interfaceName = "interfaceName_example"; // String | Interface name to read
try {
    InterfaceNeighborProperties result = apiInstance.readNeighborProperties(nodeId, interfaceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#readNeighborProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of transport node |
 **interfaceName** | **String**| Interface name to read |

### Return type

[**InterfaceNeighborProperties**](InterfaceNeighborProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readTransportNodeInterface"></a>
# **readTransportNodeInterface**
> NodeInterfaceProperties readTransportNodeInterface(transportNodeId, interfaceId, source)

Read the transport node&#x27;s network interface

Returns detailed information about the specified interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network  mask, and the IP configuration method (static or DHCP). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
String interfaceId = "interfaceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfaceProperties result = apiInstance.readTransportNodeInterface(transportNodeId, interfaceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#readTransportNodeInterface");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |
 **interfaceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NodeInterfaceProperties**](NodeInterfaceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readTransportNodeInterfaceStatistics"></a>
# **readTransportNodeInterfaceStatistics**
> NodeInterfaceStatisticsProperties readTransportNodeInterfaceStatistics(transportNodeId, interfaceId, source)

Read the NSX Manager&#x27;s Network Interface Statistics

On the specified interface, returns the number of received (rx), transmitted (tx), and dropped packets; the number of bytes and errors received and transmitted on the interface; and the number of detected collisions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
String interfaceId = "interfaceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfaceStatisticsProperties result = apiInstance.readTransportNodeInterfaceStatistics(transportNodeId, interfaceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#readTransportNodeInterfaceStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |
 **interfaceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NodeInterfaceStatisticsProperties**](NodeInterfaceStatisticsProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refreshTransportNode"></a>
# **refreshTransportNode**
> refreshTransportNode(transportNodeId)

Refresh the node configuration for the Edge node.

The API is applicable for Edge transport nodes. If you update the VM configuration and find a discrepancy in VM configuration at NSX Manager, then use this API to refresh configuration at NSX Manager. It refreshes the VM configuration from sources external to MP. Sources include vSphere Server and the edge node. After this action, the API GET api/v1/transport-nodes will show refreshed data. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    apiInstance.refreshTransportNode(transportNodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#refreshTransportNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restartTransportNodeInventorySyncRestartInventorySync"></a>
# **restartTransportNodeInventorySyncRestartInventorySync**
> restartTransportNodeInventorySyncRestartInventorySync(transportNodeId)

Restart the inventory sync for the node if it is paused currently.

Restart the inventory sync for the node if it is currently internally paused. After this action the next inventory sync coming from the node is processed. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    apiInstance.restartTransportNodeInventorySyncRestartInventorySync(transportNodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#restartTransportNodeInventorySyncRestartInventorySync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restoreParentClusterConfigurationRestoreClusterConfig"></a>
# **restoreParentClusterConfigurationRestoreClusterConfig**
> restoreParentClusterConfigurationRestoreClusterConfig(transportNodeId)

Apply cluster level Transport Node Profile on overridden host

A host can be overridden to have different configuration than Transport Node Profile(TNP) on cluster. This action will restore such overridden host back to cluster level TNP.  This API can be used in other case. When TNP is applied to a cluster, if any validation fails (e.g. VMs running on host) then existing transport node (TN) is not updated. In that case after the issue is resolved manually (e.g. VMs powered off), you can call this API to update TN as per cluster level TNP. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    apiInstance.restoreParentClusterConfigurationRestoreClusterConfig(transportNodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#restoreParentClusterConfigurationRestoreClusterConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resyncTransportNodeResyncHostConfig"></a>
# **resyncTransportNodeResyncHostConfig**
> resyncTransportNodeResyncHostConfig(transportnodeId)

Resync a Transport Node

Resync the TransportNode configuration on a host. It is similar to updating the TransportNode with existing configuration, but force synce these configurations to the host (no backend optimizations). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportnodeId = "transportnodeId_example"; // String | 
try {
    apiInstance.resyncTransportNodeResyncHostConfig(transportnodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#resyncTransportNodeResyncHostConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportnodeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateComputeCollectionTransportNodeTemplateAndTNCollection"></a>
# **updateComputeCollectionTransportNodeTemplateAndTNCollection**
> ComputeCollectionTransportNodeTemplate updateComputeCollectionTransportNodeTemplateAndTNCollection(body, templateId)

Update compute collection transportnode template

Update configuration of compute collection transportnode template. Compute_collection_id isn&#x27;t allowed to be changed since it represents the association between ComputeCollection and this template. This is determined when ComputeCollectionTransportNodeTemplate got created. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
ComputeCollectionTransportNodeTemplate body = new ComputeCollectionTransportNodeTemplate(); // ComputeCollectionTransportNodeTemplate | 
String templateId = "templateId_example"; // String | 
try {
    ComputeCollectionTransportNodeTemplate result = apiInstance.updateComputeCollectionTransportNodeTemplateAndTNCollection(body, templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#updateComputeCollectionTransportNodeTemplateAndTNCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComputeCollectionTransportNodeTemplate**](ComputeCollectionTransportNodeTemplate.md)|  |
 **templateId** | **String**|  |

### Return type

[**ComputeCollectionTransportNodeTemplate**](ComputeCollectionTransportNodeTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNetworkMigrationSpec"></a>
# **updateNetworkMigrationSpec**
> NetworkMigrationSpec updateNetworkMigrationSpec(body, templateId)

Update a template of network migration specification.

Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. For a HostProfileNetworkMigrationSpec which is already associated with a compute collection, updating it would mean next time the system needs to trigger migration for hosts managed by compute collection, it will use the updated migration specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
NetworkMigrationSpec body = new NetworkMigrationSpec(); // NetworkMigrationSpec | 
String templateId = "templateId_example"; // String | 
try {
    NetworkMigrationSpec result = apiInstance.updateNetworkMigrationSpec(body, templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#updateNetworkMigrationSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetworkMigrationSpec**](NetworkMigrationSpec.md)|  |
 **templateId** | **String**|  |

### Return type

[**NetworkMigrationSpec**](NetworkMigrationSpec.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTransportNodeMaintenanceMode"></a>
# **updateTransportNodeMaintenanceMode**
> updateTransportNodeMaintenanceMode(transportnodeId, action)

Update transport node maintenance mode

Put transport node into maintenance mode or exit from maintenance mode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
String transportnodeId = "transportnodeId_example"; // String | 
String action = "action_example"; // String | 
try {
    apiInstance.updateTransportNodeMaintenanceMode(transportnodeId, action);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#updateTransportNodeMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportnodeId** | **String**|  |
 **action** | **String**|  | [optional] [enum: enter_maintenance_mode, forced_enter_maintenance_mode, exit_maintenance_mode]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTransportNodeWithDeploymentInfo"></a>
# **updateTransportNodeWithDeploymentInfo**
> TransportNode updateTransportNodeWithDeploymentInfo(body, transportNodeId, esxMgmtIfMigrationDest, ifId, pingIp, vnic, vnicMigrationDest)

Update a Transport Node

Modifies the transport node information. The host_switch_name field must match the host_switch_name value specified in the transport zone (API: transport-zones). You must create the associated uplink profile (API: host-switch-profiles) before you can specify an uplink_name here. If the host is an ESX and has only one physical NIC being used by a vSphere standard switch, TransportNodeUpdateParameters should be used to migrate the management interface and the physical NIC into a logical switch that is in a transport zone this transport node will join or has already joined. If the migration is already done, TransportNodeUpdateParameters can also be used to migrate the management interface and the physical NIC back to a vSphere standard switch. In other cases, the TransportNodeUpdateParameters should NOT be used. When updating transport node you should follow pattern where you should fetch the existing transport node and then only modify the required properties keeping other properties as is. For API backward compatibility, property host_switches will be still returned in response and will contain the configuration matching the one in host_switch_spec. In update call you should only modify configuration in either host_switch_spec or host_switches, but not both. Property host_switch_spec should be preferred over deprecated host_switches property when creating or updating transport nodes.  It also modifies attributes of node (host or edge). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodesApi();
TransportNode body = new TransportNode(); // TransportNode | 
String transportNodeId = "transportNodeId_example"; // String | 
String esxMgmtIfMigrationDest = "esxMgmtIfMigrationDest_example"; // String | The network ids to which the ESX vmk interfaces will be migrated
String ifId = "ifId_example"; // String | The ESX vmk interfaces to migrate
String pingIp = "pingIp_example"; // String | IP Addresses to ping right after ESX vmk interfaces were migrated.
String vnic = "vnic_example"; // String | The ESX vmk interfaces and/or VM NIC to migrate
String vnicMigrationDest = "vnicMigrationDest_example"; // String | The migration destinations of ESX vmk interfaces and/or VM NIC
try {
    TransportNode result = apiInstance.updateTransportNodeWithDeploymentInfo(body, transportNodeId, esxMgmtIfMigrationDest, ifId, pingIp, vnic, vnicMigrationDest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodesApi#updateTransportNodeWithDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportNode**](TransportNode.md)|  |
 **transportNodeId** | **String**|  |
 **esxMgmtIfMigrationDest** | **String**| The network ids to which the ESX vmk interfaces will be migrated | [optional]
 **ifId** | **String**| The ESX vmk interfaces to migrate | [optional]
 **pingIp** | **String**| IP Addresses to ping right after ESX vmk interfaces were migrated. | [optional]
 **vnic** | **String**| The ESX vmk interfaces and/or VM NIC to migrate | [optional]
 **vnicMigrationDest** | **String**| The migration destinations of ESX vmk interfaces and/or VM NIC | [optional]

### Return type

[**TransportNode**](TransportNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

