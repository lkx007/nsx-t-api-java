# ManagementPlaneApiFabricNodesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNode**](ManagementPlaneApiFabricNodesApi.md#addNode) | **POST** /fabric/nodes | Register and Install NSX Components on a Node
[**deleteNode**](ManagementPlaneApiFabricNodesApi.md#deleteNode) | **DELETE** /fabric/nodes/{node-id} | Delete a Node
[**getFabricNodeModules**](ManagementPlaneApiFabricNodesApi.md#getFabricNodeModules) | **GET** /fabric/nodes/{node-id}/modules | Get the module details of a Fabric Node This api is deprecated, use Transport Node API GET /transport-nodes/&amp;lt;transportnode-id&amp;gt;/modules to get fabric node modules. 
[**getFabricNodeState**](ManagementPlaneApiFabricNodesApi.md#getFabricNodeState) | **GET** /fabric/nodes/{node-id}/state | Get the Realized State of a Fabric Node.
[**getSupportedHostOSTypes**](ManagementPlaneApiFabricNodesApi.md#getSupportedHostOSTypes) | **GET** /fabric/ostypes | Return list of supported host OS types
[**listFabricNodeInterfaces**](ManagementPlaneApiFabricNodesApi.md#listFabricNodeInterfaces) | **GET** /fabric/nodes/{node-id}/network/interfaces | List the specified node&#x27;s Network Interfaces
[**listNodeCapabilities**](ManagementPlaneApiFabricNodesApi.md#listNodeCapabilities) | **GET** /fabric/nodes/{node-id}/capabilities | Return the List of Capabilities of a Single Node
[**listNodes**](ManagementPlaneApiFabricNodesApi.md#listNodes) | **GET** /fabric/nodes | Return the List of Nodes
[**performHostNodeUpgradeActionUpgradeInfra**](ManagementPlaneApiFabricNodesApi.md#performHostNodeUpgradeActionUpgradeInfra) | **POST** /fabric/nodes/{node-id}?action&#x3D;upgrade_infra | Perform a service deployment upgrade on a host node
[**performNodeAction**](ManagementPlaneApiFabricNodesApi.md#performNodeAction) | **POST** /fabric/nodes/{node-id} | Perform an Action on Fabric Node
[**readFabricNodeInterface**](ManagementPlaneApiFabricNodesApi.md#readFabricNodeInterface) | **GET** /fabric/nodes/{node-id}/network/interfaces/{interface-id} | Read the node&#x27;s Network Interface
[**readFabricNodeInterfaceStatistics**](ManagementPlaneApiFabricNodesApi.md#readFabricNodeInterfaceStatistics) | **GET** /fabric/nodes/{node-id}/network/interfaces/{interface-id}/stats | Read the NSX Manager&#x27;s Network Interface Statistics
[**readNode**](ManagementPlaneApiFabricNodesApi.md#readNode) | **GET** /fabric/nodes/{node-id} | Return Node Information
[**readNodeStatus**](ManagementPlaneApiFabricNodesApi.md#readNodeStatus) | **GET** /fabric/nodes/{node-id}/status | Return Runtime Status Information for a Node
[**readNodesStatus**](ManagementPlaneApiFabricNodesApi.md#readNodesStatus) | **GET** /fabric/nodes/status | Return Runtime Status Information for given Nodes
[**restartInventorySyncRestartInventorySync**](ManagementPlaneApiFabricNodesApi.md#restartInventorySyncRestartInventorySync) | **POST** /fabric/nodes/{node-id}?action&#x3D;restart_inventory_sync | Restart the inventory sync for the node if it is paused currently.
[**updateNode**](ManagementPlaneApiFabricNodesApi.md#updateNode) | **PUT** /fabric/nodes/{node-id} | Update a Node

<a name="addNode"></a>
# **addNode**
> Node addNode(body)

Register and Install NSX Components on a Node

Creates a host node (hypervisor) or edge node (router) in the transport network.  When you run this command for a host, NSX Manager attempts to install the NSX kernel modules, which are packaged as VIB, RPM, or DEB files. For the installation to succeed, you must provide the host login credentials and the host thumbprint.  To get the ESXi host thumbprint, SSH to the host and run the &lt;b&gt;openssl x509 -in /etc/vmware/ssl/rui.crt -fingerprint -sha256 -noout&lt;/b&gt; command.  To generate host key thumbprint using SHA-256 algorithm please follow the steps below.  Log into the host, making sure that the connection is not vulnerable to a man in the middle attack. Check whether a public key already exists. Host public key is generally located at &#x27;/etc/ssh/ssh_host_rsa_key.pub&#x27;. If the key is not present then generate a new key by running the following command and follow the instructions.  &lt;b&gt;ssh-keygen -t rsa&lt;/b&gt;  Now generate a SHA256 hash of the key using the following command. Please make sure to pass the appropriate file name if the public key is stored with a different file name other than the default &#x27;id_rsa.pub&#x27;.  &lt;b&gt;awk &#x27;{print $2}&#x27; id_rsa.pub | base64 -d | sha256sum -b | sed &#x27;s/ .*$//&#x27; | xxd -r -p | base64&lt;/b&gt; This api is deprecated as part of FN+TN unification. Please use Transport Node API POST /transport-nodes to install NSX components on a node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
Node body = new Node(); // Node | 
try {
    Node result = apiInstance.addNode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#addNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Node**](Node.md)|  |

### Return type

[**Node**](Node.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(nodeId, unprepareHost)

Delete a Node

Removes a specified fabric node (host or edge). A fabric node may only be deleted when it is no longer referenced by a Transport Node. If unprepare_host option is set to false, the host will be deleted without uninstalling the NSX components from the host. This api is deprecated, use Transport Node API DELETE /transport-nodes/&amp;lt;transport-node-id&amp;gt; to delete FN. DELETE /transport-nodes/&lt;transport-node-id&gt; to delete FN. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
Boolean unprepareHost = true; // Boolean | Delete a host and uninstall NSX components
try {
    apiInstance.deleteNode(nodeId, unprepareHost);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **unprepareHost** | **Boolean**| Delete a host and uninstall NSX components | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFabricNodeModules"></a>
# **getFabricNodeModules**
> SoftwareModuleResult getFabricNodeModules(nodeId)

Get the module details of a Fabric Node This api is deprecated, use Transport Node API GET /transport-nodes/&amp;lt;transportnode-id&amp;gt;/modules to get fabric node modules. 

Get the module details of a Fabric Node This api is deprecated, use Transport Node API GET /transport-nodes/&amp;lt;transportnode-id&amp;gt;/modules to get fabric node modules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
try {
    SoftwareModuleResult result = apiInstance.getFabricNodeModules(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#getFabricNodeModules");
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

<a name="getFabricNodeState"></a>
# **getFabricNodeState**
> ConfigurationState getFabricNodeState(nodeId)

Get the Realized State of a Fabric Node.

For edge nodes, returns the current install state when deployment is in progress, NODE_READY when deployment is complete and the failure state when deployment has failed. This api is deprecated. Please use /transport-nodes/&amp;lt;transportnode-id&amp;gt;/state to get realized state of a Fabric Node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
try {
    ConfigurationState result = apiInstance.getFabricNodeState(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#getFabricNodeState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupportedHostOSTypes"></a>
# **getSupportedHostOSTypes**
> SupportedHostOSListResult getSupportedHostOSTypes()

Return list of supported host OS types

Returns names of all supported host OS.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
try {
    SupportedHostOSListResult result = apiInstance.getSupportedHostOSTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#getSupportedHostOSTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SupportedHostOSListResult**](SupportedHostOSListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFabricNodeInterfaces"></a>
# **listFabricNodeInterfaces**
> NodeInterfacePropertiesListResult listFabricNodeInterfaces(nodeId, source)

List the specified node&#x27;s Network Interfaces

Returns the number of interfaces on the node and detailed information about each interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network mask, and the IP configuration method (static or DHCP). This api is deprecated. Please use Transport Node API GET /transport-nodes/&lt;transport-node-id&gt;/network/interfaces to list node network interfaces for the corresponding TN. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfacePropertiesListResult result = apiInstance.listFabricNodeInterfaces(nodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#listFabricNodeInterfaces");
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

<a name="listNodeCapabilities"></a>
# **listNodeCapabilities**
> NodeCapabilitiesResult listNodeCapabilities(nodeId)

Return the List of Capabilities of a Single Node

Returns information about capabilities of a single fabric host node. Edge nodes do not have capabilities. This api is deprecated, use GET /transport-nodes/&amp;lt;transportnode-id&amp;gt;/capabilities if FN is converted to TN.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
try {
    NodeCapabilitiesResult result = apiInstance.listNodeCapabilities(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#listNodeCapabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**NodeCapabilitiesResult**](NodeCapabilitiesResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodes"></a>
# **listNodes**
> NodeListResult listNodes(cursor, discoveredNodeId, displayName, externalId, hardwareId, hypervisorOsType, includedFields, ipAddress, pageSize, resourceType, sortAscending, sortBy)

Return the List of Nodes

Returns information about all fabric nodes (hosts and edges). This api is deprecated as part of FN+TN unification. Please use Transport Node API GET /transport-nodes to list all fabric nodes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String discoveredNodeId = "discoveredNodeId_example"; // String | Id of the discovered node which was converted to create this node
String displayName = "displayName_example"; // String | HostNode display name
String externalId = "externalId_example"; // String | HostNode external id
String hardwareId = "hardwareId_example"; // String | Hardware Id of the host
String hypervisorOsType = "hypervisorOsType_example"; // String | HostNode's Hypervisor type, for example ESXi, RHEL KVM or UBUNTU KVM.
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String ipAddress = "ipAddress_example"; // String | Management IP address of the node
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String resourceType = "resourceType_example"; // String | Node type from 'HostNode', 'EdgeNode', 'PublicCloudGatewayNode'
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NodeListResult result = apiInstance.listNodes(cursor, discoveredNodeId, displayName, externalId, hardwareId, hypervisorOsType, includedFields, ipAddress, pageSize, resourceType, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#listNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **discoveredNodeId** | **String**| Id of the discovered node which was converted to create this node | [optional]
 **displayName** | **String**| HostNode display name | [optional]
 **externalId** | **String**| HostNode external id | [optional]
 **hardwareId** | **String**| Hardware Id of the host | [optional]
 **hypervisorOsType** | **String**| HostNode&#x27;s Hypervisor type, for example ESXi, RHEL KVM or UBUNTU KVM. | [optional] [enum: ESXI, RHELKVM, UBUNTUKVM, HYPERV, RHELCONTAINER, CENTOSCONTAINER, RHELSERVER, UBUNTUSERVER, CENTOSSERVER, CENTOSKVM, SLESKVM, SLESSERVER]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **ipAddress** | **String**| Management IP address of the node | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **resourceType** | **String**| Node type from &#x27;HostNode&#x27;, &#x27;EdgeNode&#x27;, &#x27;PublicCloudGatewayNode&#x27; | [optional] [enum: HostNode, EdgeNode, PublicCloudGatewayNode]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NodeListResult**](NodeListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="performHostNodeUpgradeActionUpgradeInfra"></a>
# **performHostNodeUpgradeActionUpgradeInfra**
> Node performHostNodeUpgradeActionUpgradeInfra(nodeId, disableVmMigration)

Perform a service deployment upgrade on a host node

Perform a service deployment upgrade on a host node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
Boolean disableVmMigration = true; // Boolean | Should VM migration be disabled during upgrade
try {
    Node result = apiInstance.performHostNodeUpgradeActionUpgradeInfra(nodeId, disableVmMigration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#performHostNodeUpgradeActionUpgradeInfra");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **disableVmMigration** | **Boolean**| Should VM migration be disabled during upgrade | [optional]

### Return type

[**Node**](Node.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="performNodeAction"></a>
# **performNodeAction**
> Node performNodeAction(nodeId, action, evacuatePoweredOffVms, vsanMode)

Perform an Action on Fabric Node

The supported fabric node actions are enter_maintenance_mode, exit_maintenance_mode for EdgeNode. This API is deprecated, please call TransportNode maintenance mode API to update maintenance mode, refer to \&quot;Update transport node maintenance mode\&quot;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
String action = "action_example"; // String | Supported fabric node actions
Boolean evacuatePoweredOffVms = true; // Boolean | Evacuate powered-off vms
String vsanMode = "vsanMode_example"; // String | Vsan decommission mode
try {
    Node result = apiInstance.performNodeAction(nodeId, action, evacuatePoweredOffVms, vsanMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#performNodeAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **action** | **String**| Supported fabric node actions | [optional] [enum: enter_maintenance_mode, exit_maintenance_mode, get_maintenance_mode_state]
 **evacuatePoweredOffVms** | **Boolean**| Evacuate powered-off vms | [optional]
 **vsanMode** | **String**| Vsan decommission mode | [optional] [enum: evacuate_all_data, ensure_object_accessibility, no_action]

### Return type

[**Node**](Node.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readFabricNodeInterface"></a>
# **readFabricNodeInterface**
> NodeInterfaceProperties readFabricNodeInterface(nodeId, interfaceId, source)

Read the node&#x27;s Network Interface

Returns detailed information about the specified interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network  mask, and the IP configuration method (static or DHCP). This api is deprecated as part of FN+TN unification. Please use Transport Node API GET /transport-nodes/&lt;transport-node-id&gt;/network/interfaces/&lt;interface-id&gt; to get interface details of a node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
String interfaceId = "interfaceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfaceProperties result = apiInstance.readFabricNodeInterface(nodeId, interfaceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#readFabricNodeInterface");
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

<a name="readFabricNodeInterfaceStatistics"></a>
# **readFabricNodeInterfaceStatistics**
> NodeInterfaceStatisticsProperties readFabricNodeInterfaceStatistics(nodeId, interfaceId, source)

Read the NSX Manager&#x27;s Network Interface Statistics

On the specified interface, returns the number of received (rx), transmitted (tx), and dropped packets; the number of bytes and errors received and transmitted on the interface; and the number of detected collisions. This api is deprecated as part of FN+TN unification. Please use /transport-nodes/&lt;transportnode-id&gt;/network/interfaces/&lt;interface-id&gt;/stats to read network interface statistics with contraint FN is converted to TN. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
String interfaceId = "interfaceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeInterfaceStatisticsProperties result = apiInstance.readFabricNodeInterfaceStatistics(nodeId, interfaceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#readFabricNodeInterfaceStatistics");
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

<a name="readNode"></a>
# **readNode**
> Node readNode(nodeId)

Return Node Information

Returns information about a specific fabric node (host or edge). This api is deprecated, use Transport Node API GET /transport-nodes/&amp;lt;transport-node-id&amp;gt; to get fabric node information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
try {
    Node result = apiInstance.readNode(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#readNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**Node**](Node.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeStatus"></a>
# **readNodeStatus**
> NodeStatus readNodeStatus(nodeId, source)

Return Runtime Status Information for a Node

Returns connectivity, heartbeat, and version information about a fabric node (host or edge). Note that the LCP connectivity status remains down until after the fabric node has been added as a transpot node and the NSX host switch has been successfully installed. See POST /api/v1/transport-nodes. This api is deprecated, use GET /api/v1/transport-nodes/&amp;lt;node-id&amp;gt;/status to get status information of a node with constraint FN is converted to TN. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NodeStatus result = apiInstance.readNodeStatus(nodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#readNodeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NodeStatus**](NodeStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodesStatus"></a>
# **readNodesStatus**
> NodeStatusListResult readNodesStatus(nodeIds)

Return Runtime Status Information for given Nodes

Returns connectivity, heartbeat, and version information about all fabric nodes (host or edge). This api is deprecated as part of FN+TN unification. Please use Transport Node Status API /transport-nodes/&amp;lt;node-id&amp;gt;/status to get status information of a node and to get all transport nodes ids use GET /transport-nodes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeIds = "nodeIds_example"; // String | List of requested Nodes.
try {
    NodeStatusListResult result = apiInstance.readNodesStatus(nodeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#readNodesStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeIds** | **String**| List of requested Nodes. |

### Return type

[**NodeStatusListResult**](NodeStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restartInventorySyncRestartInventorySync"></a>
# **restartInventorySyncRestartInventorySync**
> restartInventorySyncRestartInventorySync(nodeId)

Restart the inventory sync for the node if it is paused currently.

Restart the inventory sync for the node if it is currently internally paused. After this action the next inventory sync coming from the node is processed. This api is deprecated as part of FN+TN unification. Please use Transport Node API POST /transport-nodes/&amp;lt;transport-node-id&amp;gt;?action&#x3D;restart_inventory_sync to restart inventory sync of node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
String nodeId = "nodeId_example"; // String | 
try {
    apiInstance.restartInventorySyncRestartInventorySync(nodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#restartInventorySyncRestartInventorySync");
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

<a name="updateNode"></a>
# **updateNode**
> Node updateNode(body, nodeId)

Update a Node

Modifies attributes of a fabric node (host or edge). This api is deprecated as part of FN+TN unification. Please use Transport Node API PUT /transport-nodes/&amp;lt;transport-node-id&amp;gt; to update fabric node details. API PUT /transport-nodes/&lt;transport-node-id&gt; to update fabric node details. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricNodesApi apiInstance = new ManagementPlaneApiFabricNodesApi();
Node body = new Node(); // Node | 
String nodeId = "nodeId_example"; // String | 
try {
    Node result = apiInstance.updateNode(body, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricNodesApi#updateNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Node**](Node.md)|  |
 **nodeId** | **String**|  |

### Return type

[**Node**](Node.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

