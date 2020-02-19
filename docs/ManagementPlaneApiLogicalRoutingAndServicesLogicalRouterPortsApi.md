# ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLogicalRouterPort**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#createLogicalRouterPort) | **POST** /logical-router-ports | Create a Logical Router Port
[**deleteLogicalRouterPort**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#deleteLogicalRouterPort) | **DELETE** /logical-router-ports/{logical-router-port-id} | Delete a Logical Router Port
[**getLogicalRouterPortArpTable**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#getLogicalRouterPortArpTable) | **GET** /logical-router-ports/{logical-router-port-id}/arp-table | Get the ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id 
[**getLogicalRouterPortArpTableInCsvFormatCsv**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#getLogicalRouterPortArpTableInCsvFormatCsv) | **GET** /logical-router-ports/{logical-router-port-id}/arp-table?format&#x3D;csv | Get the ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id 
[**getLogicalRouterPortState**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#getLogicalRouterPortState) | **GET** /logical-router-ports/{logical-router-port-id}/state | Get the Realized State of a Logical Router Port
[**getLogicalRouterPortStatistics**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#getLogicalRouterPortStatistics) | **GET** /logical-router-ports/{logical-router-port-id}/statistics | Get the statistics of a specified logical router port on all or a specified node
[**getLogicalRouterPortStatisticsSummary**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#getLogicalRouterPortStatisticsSummary) | **GET** /logical-router-ports/{logical-router-port-id}/statistics/summary | Get the statistics summary of a specified logical router port
[**listLogicalRouterPorts**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#listLogicalRouterPorts) | **GET** /logical-router-ports | List Logical Router Ports
[**readLogicalRouterPort**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#readLogicalRouterPort) | **GET** /logical-router-ports/{logical-router-port-id} | Read Logical Router Port
[**updateLogicalRouterPort**](ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi.md#updateLogicalRouterPort) | **PUT** /logical-router-ports/{logical-router-port-id} | Update a Logical Router Port

<a name="createLogicalRouterPort"></a>
# **createLogicalRouterPort**
> LogicalRouterPort createLogicalRouterPort(body)

Create a Logical Router Port

Creates a logical router port. The required parameters include resource_type (LogicalRouterUpLinkPort, LogicalRouterDownLinkPort, LogicalRouterLinkPort, LogicalRouterLoopbackPort, LogicalRouterCentralizedServicePort); and logical_router_id (the router to which each logical router port is assigned). The service_bindings parameter is optional. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
LogicalRouterPort body = new LogicalRouterPort(); // LogicalRouterPort | 
try {
    LogicalRouterPort result = apiInstance.createLogicalRouterPort(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#createLogicalRouterPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalRouterPort**](LogicalRouterPort.md)|  |

### Return type

[**LogicalRouterPort**](LogicalRouterPort.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLogicalRouterPort"></a>
# **deleteLogicalRouterPort**
> deleteLogicalRouterPort(logicalRouterPortId, cascadeDeleteLinkedPorts, force)

Delete a Logical Router Port

Deletes the specified logical router port. You must delete logical router ports before you can delete the associated logical router. To Delete Tier0 router link port you must have to delete attached tier1 router link port, otherwise pass \&quot;force&#x3D;true\&quot; as query param to force delete the Tier0 router link port. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
Boolean cascadeDeleteLinkedPorts = true; // Boolean | Flag to specify whether to delete related logical switch ports
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteLogicalRouterPort(logicalRouterPortId, cascadeDeleteLinkedPorts, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#deleteLogicalRouterPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterPortId** | **String**|  |
 **cascadeDeleteLinkedPorts** | **Boolean**| Flag to specify whether to delete related logical switch ports | [optional]
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterPortArpTable"></a>
# **getLogicalRouterPortArpTable**
> LogicalRouterPortArpTable getLogicalRouterPortArpTable(logicalRouterPortId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId)

Get the ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id 

Returns ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id, on a node if a query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is given. The transport_node_id parameter is mandatory if the router port is not uplink type. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    LogicalRouterPortArpTable result = apiInstance.getLogicalRouterPortArpTable(logicalRouterPortId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#getLogicalRouterPortArpTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterPortId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**LogicalRouterPortArpTable**](LogicalRouterPortArpTable.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterPortArpTableInCsvFormatCsv"></a>
# **getLogicalRouterPortArpTableInCsvFormatCsv**
> LogicalRouterPortArpTableInCsvFormat getLogicalRouterPortArpTableInCsvFormatCsv(logicalRouterPortId, source, transportNodeId)

Get the ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id 

Returns ARP table (IPv4) or Neighbor Discovery table (IPv6) in CSV format for the Logical Router Port of the given id, on a node if a query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is given. The transport_node_id parameter is mandatory if the router port is not uplink type. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    LogicalRouterPortArpTableInCsvFormat result = apiInstance.getLogicalRouterPortArpTableInCsvFormatCsv(logicalRouterPortId, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#getLogicalRouterPortArpTableInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterPortId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**LogicalRouterPortArpTableInCsvFormat**](LogicalRouterPortArpTableInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLogicalRouterPortState"></a>
# **getLogicalRouterPortState**
> LogicalRouterPortState getLogicalRouterPortState(logicalRouterPortId, barrierId, requestId)

Get the Realized State of a Logical Router Port

Return realized state information of a logical router port. Any configuration update that affects the logical router port can use this API to get its realized state by passing a request_id returned by the configuration change operation. e.g. Update configuration of logical router ports, dhcp relays, etc. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    LogicalRouterPortState result = apiInstance.getLogicalRouterPortState(logicalRouterPortId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#getLogicalRouterPortState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterPortId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**LogicalRouterPortState**](LogicalRouterPortState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterPortStatistics"></a>
# **getLogicalRouterPortStatistics**
> LogicalRouterPortStatistics getLogicalRouterPortStatistics(logicalRouterPortId, source, transportNodeId)

Get the statistics of a specified logical router port on all or a specified node

Returns the statistics for the Logical Router Port. If query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is given,  only the statistics from the given node for the logical router port will be returned. Otherwise the statistics from each node for the same logical router port will be returned. The transport_node_id is mandatory if the router port is not uplink type. The query parameter \&quot;source&#x3D;cached\&quot; will be ignored and it will always return realtime statistics of the logical router port. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    LogicalRouterPortStatistics result = apiInstance.getLogicalRouterPortStatistics(logicalRouterPortId, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#getLogicalRouterPortStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterPortId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**LogicalRouterPortStatistics**](LogicalRouterPortStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalRouterPortStatisticsSummary"></a>
# **getLogicalRouterPortStatisticsSummary**
> LogicalRouterPortStatisticsSummary getLogicalRouterPortStatisticsSummary(logicalRouterPortId, source)

Get the statistics summary of a specified logical router port

Returns the summation of statistics from all nodes for the Specified Logical Router Port. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LogicalRouterPortStatisticsSummary result = apiInstance.getLogicalRouterPortStatisticsSummary(logicalRouterPortId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#getLogicalRouterPortStatisticsSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterPortId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalRouterPortStatisticsSummary**](LogicalRouterPortStatisticsSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLogicalRouterPorts"></a>
# **listLogicalRouterPorts**
> LogicalRouterPortListResult listLogicalRouterPorts(cursor, includedFields, logicalRouterId, logicalSwitchId, pageSize, resourceType, sortAscending, sortBy)

List Logical Router Ports

Returns information about all logical router ports. Information includes the resource_type (LogicalRouterUpLinkPort, LogicalRouterDownLinkPort, LogicalRouterLinkPort, LogicalRouterLoopbackPort, LogicalRouterCentralizedServicePort); logical_router_id (the router to which each logical router port is assigned); and any service_bindings (such as DHCP relay service). The GET request can include a query parameter (logical_router_id or logical_switch_id). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String logicalRouterId = "logicalRouterId_example"; // String | Logical Router identifier
String logicalSwitchId = "logicalSwitchId_example"; // String | Logical Switch identifier
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String resourceType = "resourceType_example"; // String | Resource types of logical router port
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LogicalRouterPortListResult result = apiInstance.listLogicalRouterPorts(cursor, includedFields, logicalRouterId, logicalSwitchId, pageSize, resourceType, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#listLogicalRouterPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **logicalRouterId** | **String**| Logical Router identifier | [optional]
 **logicalSwitchId** | **String**| Logical Switch identifier | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **resourceType** | **String**| Resource types of logical router port | [optional] [enum: LogicalRouterUpLinkPort, LogicalRouterDownLinkPort, LogicalRouterLinkPortOnTIER0, LogicalRouterLinkPortOnTIER1, LogicalRouterLoopbackPort, LogicalRouterIPTunnelPort, LogicalRouterCentralizedServicePort]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**LogicalRouterPortListResult**](LogicalRouterPortListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLogicalRouterPort"></a>
# **readLogicalRouterPort**
> LogicalRouterPort readLogicalRouterPort(logicalRouterPortId)

Read Logical Router Port

Returns information about the specified logical router port.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
try {
    LogicalRouterPort result = apiInstance.readLogicalRouterPort(logicalRouterPortId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#readLogicalRouterPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterPortId** | **String**|  |

### Return type

[**LogicalRouterPort**](LogicalRouterPort.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLogicalRouterPort"></a>
# **updateLogicalRouterPort**
> LogicalRouterPort updateLogicalRouterPort(body, logicalRouterPortId)

Update a Logical Router Port

Modifies the specified logical router port. Required parameters include the resource_type and logical_router_id. Modifiable parameters include the resource_type (LogicalRouterUpLinkPort, LogicalRouterDownLinkPort, LogicalRouterLinkPort, LogicalRouterLoopbackPort, LogicalRouterCentralizedServicePort), logical_router_id (to reassign the port to a different router), and service_bindings. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();
LogicalRouterPort body = new LogicalRouterPort(); // LogicalRouterPort | 
String logicalRouterPortId = "logicalRouterPortId_example"; // String | 
try {
    LogicalRouterPort result = apiInstance.updateLogicalRouterPort(body, logicalRouterPortId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi#updateLogicalRouterPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalRouterPort**](LogicalRouterPort.md)|  |
 **logicalRouterPortId** | **String**|  |

### Return type

[**LogicalRouterPort**](LogicalRouterPort.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

