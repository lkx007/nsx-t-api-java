# ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLogicalRouter**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#createLogicalRouter) | **POST** /logical-routers | Create a Logical Router
[**deleteLogicalRouter**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#deleteLogicalRouter) | **DELETE** /logical-routers/{logical-router-id} | Delete a Logical Router
[**getBgpNeighborAdvertisedRoutes**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getBgpNeighborAdvertisedRoutes) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{neighbor-id}/advertised-routes | Get BGP neighbor advertised routes
[**getBgpNeighborAdvertisedRoutesInCsvFormatCsv**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getBgpNeighborAdvertisedRoutesInCsvFormatCsv) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{neighbor-id}/advertised-routes?format&#x3D;csv | Get BGP neighbor advertised routes in CSV format 
[**getBgpNeighborRoutes**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getBgpNeighborRoutes) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{neighbor-id}/routes | Get BGP neighbor learned routes
[**getBgpNeighborRoutesInCsvFormatCsv**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getBgpNeighborRoutesInCsvFormatCsv) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{neighbor-id}/routes?format&#x3D;csv | Get BGP neighbor learned routes in CSV format 
[**getBgpNeighborsStatus**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getBgpNeighborsStatus) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors/status | Get the status of all the BGP neighbors for the Logical Router of the given id
[**getLogicalRouterForwardingTable**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterForwardingTable) | **GET** /logical-routers/{logical-router-id}/routing/forwarding-table | Get FIB table on a specified node for a logical router
[**getLogicalRouterForwardingTableInCsvFormatCsv**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterForwardingTableInCsvFormatCsv) | **GET** /logical-routers/{logical-router-id}/routing/forwarding-table?format&#x3D;csv | Get FIB table on a specified node for a logical router
[**getLogicalRouterRouteTable**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterRouteTable) | **GET** /logical-routers/{logical-router-id}/routing/route-table | Get route table on a given node for a logical router
[**getLogicalRouterRouteTableInCsvFormatCsv**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterRouteTableInCsvFormatCsv) | **GET** /logical-routers/{logical-router-id}/routing/route-table?format&#x3D;csv | Get route table on a node for a logical router
[**getLogicalRouterRoutingTable**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterRoutingTable) | **GET** /logical-routers/{logical-router-id}/routing/routing-table | Get RIB table on a specified node for a logical router
[**getLogicalRouterRoutingTableInCsvFormatCsv**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterRoutingTableInCsvFormatCsv) | **GET** /logical-routers/{logical-router-id}/routing/routing-table?format&#x3D;csv | Get RIB table on a specified node for a logical router
[**getLogicalRouterState**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterState) | **GET** /logical-routers/{logical-router-id}/state | Get the Realized State of a Logical Router
[**getLogicalRouterStatus**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalRouterStatus) | **GET** /logical-routers/{logical-router-id}/status | Get the status for the Logical Router of the given id
[**getLogicalServiceRouterClusterState**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#getLogicalServiceRouterClusterState) | **GET** /logical-routers/{logical-router-id}/service-cluster/state | Get the Realized State of a Logical Service Router Cluster
[**listLogicalRouters**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#listLogicalRouters) | **GET** /logical-routers | List Logical Routers
[**reAllocateServiceRoutersReallocate**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#reAllocateServiceRoutersReallocate) | **POST** /logical-routers/{logical-router-id}?action&#x3D;reallocate | Re allocate edge node placement of TIER1 service routers
[**reProcessLogicalRouterReprocess**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#reProcessLogicalRouterReprocess) | **POST** /logical-routers/{logical-router-id}?action&#x3D;reprocess | Reprocesses a logical router configuration and publish updates to controller
[**readLogicalRouter**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#readLogicalRouter) | **GET** /logical-routers/{logical-router-id} | Read Logical Router
[**updateLogicalRouter**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi.md#updateLogicalRouter) | **PUT** /logical-routers/{logical-router-id} | Update a Logical Router

<a name="createLogicalRouter"></a>
# **createLogicalRouter**
> LogicalRouter createLogicalRouter(body)

Create a Logical Router

Creates a logical router. The required parameters are router_type (TIER0 or TIER1) and edge_cluster_id (TIER0 only). Optional parameters include internal and external transit network addresses. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
LogicalRouter body = new LogicalRouter(); // LogicalRouter | 
try {
    LogicalRouter result = apiInstance.createLogicalRouter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#createLogicalRouter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalRouter**](LogicalRouter.md)|  |

### Return type

[**LogicalRouter**](LogicalRouter.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLogicalRouter"></a>
# **deleteLogicalRouter**
> deleteLogicalRouter(logicalRouterId, cascadeDeleteLinkedPorts, force)

Delete a Logical Router

Deletes the specified logical router. You must delete associated logical router ports before you can delete a logical router. Otherwise use force delete which will delete all related ports and other entities associated with that LR. To force delete logical router pass force&#x3D;true in query param. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
Boolean cascadeDeleteLinkedPorts = true; // Boolean | Flag to specify whether to delete related logical switch ports
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteLogicalRouter(logicalRouterId, cascadeDeleteLinkedPorts, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#deleteLogicalRouter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **cascadeDeleteLinkedPorts** | **Boolean**| Flag to specify whether to delete related logical switch ports | [optional]
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBgpNeighborAdvertisedRoutes"></a>
# **getBgpNeighborAdvertisedRoutes**
> BgpNeighborRouteDetails getBgpNeighborAdvertisedRoutes(logicalRouterId, neighborId)

Get BGP neighbor advertised routes

Returns routes advertised by BGP neighbor from all edge transport nodes on which this neighbor is currently enabled. It always returns realtime response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String neighborId = "neighborId_example"; // String | 
try {
    BgpNeighborRouteDetails result = apiInstance.getBgpNeighborAdvertisedRoutes(logicalRouterId, neighborId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getBgpNeighborAdvertisedRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **neighborId** | **String**|  |

### Return type

[**BgpNeighborRouteDetails**](BgpNeighborRouteDetails.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBgpNeighborAdvertisedRoutesInCsvFormatCsv"></a>
# **getBgpNeighborAdvertisedRoutesInCsvFormatCsv**
> BgpNeighborRouteDetailsInCsvFormat getBgpNeighborAdvertisedRoutesInCsvFormatCsv(logicalRouterId, neighborId)

Get BGP neighbor advertised routes in CSV format 

Returns routes advertised by BGP neighbor from all edge transport nodes on which this neighbor is currently enabled in CSV format. It always returns realtime response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String neighborId = "neighborId_example"; // String | 
try {
    BgpNeighborRouteDetailsInCsvFormat result = apiInstance.getBgpNeighborAdvertisedRoutesInCsvFormatCsv(logicalRouterId, neighborId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getBgpNeighborAdvertisedRoutesInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **neighborId** | **String**|  |

### Return type

[**BgpNeighborRouteDetailsInCsvFormat**](BgpNeighborRouteDetailsInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getBgpNeighborRoutes"></a>
# **getBgpNeighborRoutes**
> BgpNeighborRouteDetails getBgpNeighborRoutes(logicalRouterId, neighborId)

Get BGP neighbor learned routes

Returns routes learned by BGP neighbor from all edge transport nodes on which this neighbor is currently enabled. It always returns realtime response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String neighborId = "neighborId_example"; // String | 
try {
    BgpNeighborRouteDetails result = apiInstance.getBgpNeighborRoutes(logicalRouterId, neighborId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getBgpNeighborRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **neighborId** | **String**|  |

### Return type

[**BgpNeighborRouteDetails**](BgpNeighborRouteDetails.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBgpNeighborRoutesInCsvFormatCsv"></a>
# **getBgpNeighborRoutesInCsvFormatCsv**
> BgpNeighborRouteDetailsInCsvFormat getBgpNeighborRoutesInCsvFormatCsv(logicalRouterId, neighborId)

Get BGP neighbor learned routes in CSV format 

Returns routes learned by BGP neighbor from all edge transport nodes on which this neighbor is currently enabled in CSV format. It always returns realtime response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String neighborId = "neighborId_example"; // String | 
try {
    BgpNeighborRouteDetailsInCsvFormat result = apiInstance.getBgpNeighborRoutesInCsvFormatCsv(logicalRouterId, neighborId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getBgpNeighborRoutesInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **neighborId** | **String**|  |

### Return type

[**BgpNeighborRouteDetailsInCsvFormat**](BgpNeighborRouteDetailsInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getBgpNeighborsStatus"></a>
# **getBgpNeighborsStatus**
> BgpNeighborsStatusListResult getBgpNeighborsStatus(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId)

Get the status of all the BGP neighbors for the Logical Router of the given id

Returns the status of all the BGP neighbors for the Logical Router of the given id. To get BGP neighbors status for the logical router from particular node, parameter \&quot;transport_node_id&#x3D;&lt;transportnode_id&gt;\&quot; needs to be specified. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | Transport node id
try {
    BgpNeighborsStatusListResult result = apiInstance.getBgpNeighborsStatus(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getBgpNeighborsStatus");
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
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| Transport node id | [optional]

### Return type

[**BgpNeighborsStatusListResult**](BgpNeighborsStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterForwardingTable"></a>
# **getLogicalRouterForwardingTable**
> LogicalRouterRouteTable getLogicalRouterForwardingTable(logicalRouterId, transportNodeId, cursor, includedFields, networkPrefix, pageSize, sortAscending, sortBy, source)

Get FIB table on a specified node for a logical router

Returns the FIB for the logical router on a node of the given transport-node-id. Query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is required. To filter the result by network address, paramter \&quot;network_prefix&#x3D;&lt;a.b.c.d/mask&gt;\&quot; needs to be specified. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String networkPrefix = "networkPrefix_example"; // String | IPv4 or IPv6 CIDR Block
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterRouteTable result = apiInstance.getLogicalRouterForwardingTable(logicalRouterId, transportNodeId, cursor, includedFields, networkPrefix, pageSize, sortAscending, sortBy, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterForwardingTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **transportNodeId** | **String**| TransportNode Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **networkPrefix** | **String**| IPv4 or IPv6 CIDR Block | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterRouteTable**](LogicalRouterRouteTable.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterForwardingTableInCsvFormatCsv"></a>
# **getLogicalRouterForwardingTableInCsvFormatCsv**
> LogicalRouterRouteTableInCsvFormat getLogicalRouterForwardingTableInCsvFormatCsv(logicalRouterId, transportNodeId, networkPrefix, source)

Get FIB table on a specified node for a logical router

Returns the FIB table in CSV format for the logical router on a node of the given transport-node-id. Query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is required. To filter the result by network address, paramter \&quot;network_prefix&#x3D;&lt;a.b.c.d/mask&gt;\&quot; needs to be specified. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
String networkPrefix = "networkPrefix_example"; // String | IPv4 or IPv6 CIDR Block
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterRouteTableInCsvFormat result = apiInstance.getLogicalRouterForwardingTableInCsvFormatCsv(logicalRouterId, transportNodeId, networkPrefix, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterForwardingTableInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **transportNodeId** | **String**| TransportNode Id |
 **networkPrefix** | **String**| IPv4 or IPv6 CIDR Block | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterRouteTableInCsvFormat**](LogicalRouterRouteTableInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLogicalRouterRouteTable"></a>
# **getLogicalRouterRouteTable**
> LogicalRouterRouteTable getLogicalRouterRouteTable(logicalRouterId, transportNodeId, cursor, includedFields, pageSize, sortAscending, sortBy, source)

Get route table on a given node for a logical router

Deprecated - Please use /logical-routers/&lt;logical-router-id&gt;/routing/routing-table for RIB and /logical-routers/&lt;logical-router-id&gt;/routing/forwarding-table for FIB. Returns the route table for the logical router on a node of the given transport-node-id. Query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is required. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterRouteTable result = apiInstance.getLogicalRouterRouteTable(logicalRouterId, transportNodeId, cursor, includedFields, pageSize, sortAscending, sortBy, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterRouteTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **transportNodeId** | **String**| TransportNode Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterRouteTable**](LogicalRouterRouteTable.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterRouteTableInCsvFormatCsv"></a>
# **getLogicalRouterRouteTableInCsvFormatCsv**
> LogicalRouterRouteTableInCsvFormat getLogicalRouterRouteTableInCsvFormatCsv(logicalRouterId, transportNodeId, source)

Get route table on a node for a logical router

Deprecated - Please use /logical-routers/&lt;logical-router-id&gt;/routing/routing-table for RIB and /logical-routers/&lt;logical-router-id&gt;/routing/forwarding-table for FIB. Returns the route table in CSV format for the logical router on a node of the given transport-node-id. Query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is required. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterRouteTableInCsvFormat result = apiInstance.getLogicalRouterRouteTableInCsvFormatCsv(logicalRouterId, transportNodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterRouteTableInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **transportNodeId** | **String**| TransportNode Id |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterRouteTableInCsvFormat**](LogicalRouterRouteTableInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLogicalRouterRoutingTable"></a>
# **getLogicalRouterRoutingTable**
> LogicalRouterRouteTable getLogicalRouterRoutingTable(logicalRouterId, transportNodeId, cursor, includedFields, networkPrefix, pageSize, routeSource, sortAscending, sortBy, source)

Get RIB table on a specified node for a logical router

Returns the route table(RIB) for the logical router on a node of the given transport-node-id. Query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is required. To filter the result by network address, parameter \&quot;network_prefix&#x3D;&lt;a.b.c.d/mask&gt;\&quot; needs to be specified. To filter the result by route source, parameter \&quot;route_source&#x3D;&lt;source_type&gt;\&quot; needs to be specified where source_type can be BGP, STATIC, CONNECTED, NSX_STATIC, TIER1_NAT or TIER0_NAT. It is also possible to filter the RIB table using both network address and route source filter together. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String networkPrefix = "networkPrefix_example"; // String | IPv4 or IPv6 CIDR Block
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String routeSource = "routeSource_example"; // String | Route source filter parameter
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterRouteTable result = apiInstance.getLogicalRouterRoutingTable(logicalRouterId, transportNodeId, cursor, includedFields, networkPrefix, pageSize, routeSource, sortAscending, sortBy, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterRoutingTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **transportNodeId** | **String**| TransportNode Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **networkPrefix** | **String**| IPv4 or IPv6 CIDR Block | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **routeSource** | **String**| Route source filter parameter | [optional] [enum: BGP, STATIC, CONNECTED]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterRouteTable**](LogicalRouterRouteTable.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterRoutingTableInCsvFormatCsv"></a>
# **getLogicalRouterRoutingTableInCsvFormatCsv**
> LogicalRouterRouteTableInCsvFormat getLogicalRouterRoutingTableInCsvFormatCsv(logicalRouterId, transportNodeId, networkPrefix, routeSource, source)

Get RIB table on a specified node for a logical router

Returns the route table in CSV format for the logical router on a node of the given transport-node-id. Query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is required. To filter the result by network address, paramter \&quot;network_prefix&#x3D;&lt;a.b.c.d/mask&gt;\&quot; needs to be specified. To filter the result by route source, parameter \&quot;route_source&#x3D;&lt;source_type&gt;\&quot; needs to be specified where source_type can be BGP, STATIC, CONNECTED, NSX_STATIC, TIER1_NAT or TIER0_NAT. It is also possible to filter the RIB table using both network address and route source filter together. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
String networkPrefix = "networkPrefix_example"; // String | IPv4 or IPv6 CIDR Block
String routeSource = "routeSource_example"; // String | Route source filter parameter
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterRouteTableInCsvFormat result = apiInstance.getLogicalRouterRoutingTableInCsvFormatCsv(logicalRouterId, transportNodeId, networkPrefix, routeSource, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterRoutingTableInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **transportNodeId** | **String**| TransportNode Id |
 **networkPrefix** | **String**| IPv4 or IPv6 CIDR Block | [optional]
 **routeSource** | **String**| Route source filter parameter | [optional] [enum: BGP, STATIC, CONNECTED]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterRouteTableInCsvFormat**](LogicalRouterRouteTableInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLogicalRouterState"></a>
# **getLogicalRouterState**
> LogicalRouterState getLogicalRouterState(logicalRouterId, barrierId, requestId)

Get the Realized State of a Logical Router

Return realized state information of a logical router. Any configuration update that affects the logical router can use this API to get its realized state by passing a request_id returned by the configuration change operation. e.g. Update configuration of logical router, static routes, etc. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    LogicalRouterState result = apiInstance.getLogicalRouterState(logicalRouterId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**LogicalRouterState**](LogicalRouterState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterStatus"></a>
# **getLogicalRouterStatus**
> LogicalRouterStatus getLogicalRouterStatus(logicalRouterId, source)

Get the status for the Logical Router of the given id

Returns status for the Logical Router of the given id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterStatus result = apiInstance.getLogicalRouterStatus(logicalRouterId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalRouterStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterStatus**](LogicalRouterStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalServiceRouterClusterState"></a>
# **getLogicalServiceRouterClusterState**
> LogicalServiceRouterClusterState getLogicalServiceRouterClusterState(logicalRouterId, barrierId, requestId)

Get the Realized State of a Logical Service Router Cluster

Return realized state information of a logical service router cluster. Any configuration update that affects the logical service router cluster can use this API to get its realized state by passing a request_id returned by the configuration change operation. e.g. Update configuration of nat, bgp, bfd, etc. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    LogicalServiceRouterClusterState result = apiInstance.getLogicalServiceRouterClusterState(logicalRouterId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#getLogicalServiceRouterClusterState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**LogicalServiceRouterClusterState**](LogicalServiceRouterClusterState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLogicalRouters"></a>
# **listLogicalRouters**
> LogicalRouterListResult listLogicalRouters(cursor, includedFields, pageSize, routerType, sortAscending, sortBy)

List Logical Routers

Returns information about all logical routers, including the UUID, internal and external transit network addresses, and the router type (TIER0 or TIER1). You can get information for only TIER0 routers or only the TIER1 routers by including the router_type query parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String routerType = "routerType_example"; // String | Type of Logical Router
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LogicalRouterListResult result = apiInstance.listLogicalRouters(cursor, includedFields, pageSize, routerType, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#listLogicalRouters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **routerType** | **String**| Type of Logical Router | [optional] [enum: TIER0, TIER1]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**LogicalRouterListResult**](LogicalRouterListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reAllocateServiceRoutersReallocate"></a>
# **reAllocateServiceRoutersReallocate**
> LogicalRouter reAllocateServiceRoutersReallocate(body, logicalRouterId)

Re allocate edge node placement of TIER1 service routers

API to re allocate edge node placement for TIER1 logical router. You can re-allocate service routers of TIER1 in same edge cluster or different edge cluster. You can also place edge nodes manually and provide maximum two indices for HA mode ACTIVE_STANDBY. To re-allocate on new edge cluster you must have existing edge cluster for TIER1 logical router. This will be disruptive operation and all existing statistics of logical router will be remove. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
ServiceRouterAllocationConfig body = new ServiceRouterAllocationConfig(); // ServiceRouterAllocationConfig | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    LogicalRouter result = apiInstance.reAllocateServiceRoutersReallocate(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#reAllocateServiceRoutersReallocate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceRouterAllocationConfig**](ServiceRouterAllocationConfig.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**LogicalRouter**](LogicalRouter.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reProcessLogicalRouterReprocess"></a>
# **reProcessLogicalRouterReprocess**
> reProcessLogicalRouterReprocess(logicalRouterId)

Reprocesses a logical router configuration and publish updates to controller

Reprocess logical router configuration and configuration of related entities like logical router ports, static routing, etc. Any missing Updates are published to controller. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    apiInstance.reProcessLogicalRouterReprocess(logicalRouterId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#reProcessLogicalRouterReprocess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLogicalRouter"></a>
# **readLogicalRouter**
> LogicalRouter readLogicalRouter(logicalRouterId)

Read Logical Router

Returns information about the specified logical router.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    LogicalRouter result = apiInstance.readLogicalRouter(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#readLogicalRouter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**LogicalRouter**](LogicalRouter.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLogicalRouter"></a>
# **updateLogicalRouter**
> LogicalRouter updateLogicalRouter(body, logicalRouterId)

Update a Logical Router

Modifies the specified logical router. Modifiable attributes include the internal_transit_network, external_transit_networks, and edge_cluster_id (for TIER0 routers). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi();
LogicalRouter body = new LogicalRouter(); // LogicalRouter | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    LogicalRouter result = apiInstance.updateLogicalRouter(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRoutersApi#updateLogicalRouter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalRouter**](LogicalRouter.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**LogicalRouter**](LogicalRouter.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

