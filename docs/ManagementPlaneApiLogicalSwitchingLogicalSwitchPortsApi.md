# ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLogicalPort**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#createLogicalPort) | **POST** /logical-ports | Create a Logical Port
[**deleteLogicalPort**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#deleteLogicalPort) | **DELETE** /logical-ports/{lport-id} | Delete a Logical Port
[**getLogicalPort**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#getLogicalPort) | **GET** /logical-ports/{lport-id} | Get Information About a Logical Port
[**getLogicalPortMacTable**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#getLogicalPortMacTable) | **GET** /logical-ports/{lport-id}/mac-table | Get MAC table of a logical port with a given port id (lport-id)
[**getLogicalPortMacTableInCsvFormatCsv**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#getLogicalPortMacTableInCsvFormatCsv) | **GET** /logical-ports/{lport-id}/mac-table?format&#x3D;csv | Get MAC table of a logical port with a given port id (lport-id)
[**getLogicalPortOperationalStatus**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#getLogicalPortOperationalStatus) | **GET** /logical-ports/{lport-id}/status | Get Operational Status for Logical Port of a Given Port ID (lport-id)
[**getLogicalPortState**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#getLogicalPortState) | **GET** /logical-ports/{lport-id}/state | Get realized state &amp; location of a logical port
[**getLogicalPortStatistics**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#getLogicalPortStatistics) | **GET** /logical-ports/{lport-id}/statistics | Get Statistics for Logical Port of a Given Port ID (lport-id)
[**getLogicalPortStatusSummary**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#getLogicalPortStatusSummary) | **GET** /logical-ports/status | Get Operational Status Summary of All Logical Ports in the System
[**listLogicalPorts**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#listLogicalPorts) | **GET** /logical-ports | List All Logical Ports
[**updateLogicalPort**](ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi.md#updateLogicalPort) | **PUT** /logical-ports/{lport-id} | Update a Logical Port

<a name="createLogicalPort"></a>
# **createLogicalPort**
> LogicalPort createLogicalPort(body)

Create a Logical Port

Creates a new logical switch port. The required parameters are the associated logical_switch_id and admin_state (UP or DOWN). Optional parameters are the attachment and switching_profile_ids. If you don&#x27;t specify switching_profile_ids, default switching profiles are assigned to the port. If you don&#x27;t specify an attachment, the switch port remains empty. To configure an attachment, you must specify an id, and optionally you can specify an attachment_type (VIF or LOGICALROUTER). The attachment_type is VIF by default. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
LogicalPort body = new LogicalPort(); // LogicalPort | 
try {
    LogicalPort result = apiInstance.createLogicalPort(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#createLogicalPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalPort**](LogicalPort.md)|  |

### Return type

[**LogicalPort**](LogicalPort.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLogicalPort"></a>
# **deleteLogicalPort**
> deleteLogicalPort(lportId, detach)

Delete a Logical Port

Deletes the specified logical switch port. By default, if logical port has attachments, or it is added to any NSGroup, the deletion will be failed. Option detach could be used for deleting logical port forcibly. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String lportId = "lportId_example"; // String | 
Boolean detach = true; // Boolean | force delete even if attached or referenced by a group
try {
    apiInstance.deleteLogicalPort(lportId, detach);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#deleteLogicalPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**|  |
 **detach** | **Boolean**| force delete even if attached or referenced by a group | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalPort"></a>
# **getLogicalPort**
> LogicalPort getLogicalPort(lportId)

Get Information About a Logical Port

Returns information about a specified logical port.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String lportId = "lportId_example"; // String | 
try {
    LogicalPort result = apiInstance.getLogicalPort(lportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#getLogicalPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**|  |

### Return type

[**LogicalPort**](LogicalPort.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalPortMacTable"></a>
# **getLogicalPortMacTable**
> LogicalPortMacAddressListResult getLogicalPortMacTable(lportId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId)

Get MAC table of a logical port with a given port id (lport-id)

Returns MAC table of a specified logical port. If the target transport node id is not provided, the NSX manager will ask the controller for the transport node where the logical port is located. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. MAC table retrieval is not supported on logical ports that are attached to a logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String lportId = "lportId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    LogicalPortMacAddressListResult result = apiInstance.getLogicalPortMacTable(lportId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#getLogicalPortMacTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**LogicalPortMacAddressListResult**](LogicalPortMacAddressListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalPortMacTableInCsvFormatCsv"></a>
# **getLogicalPortMacTableInCsvFormatCsv**
> LogicalPortMacAddressCsvListResult getLogicalPortMacTableInCsvFormatCsv(lportId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId)

Get MAC table of a logical port with a given port id (lport-id)

Returns MAC table in CSV format of a specified logical port. If the target transport node id is not provided, the NSX manager will ask the controller for the transport node where the logical port is located. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. MAC table retrieval is not supported on logical ports that are attached to a logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String lportId = "lportId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    LogicalPortMacAddressCsvListResult result = apiInstance.getLogicalPortMacTableInCsvFormatCsv(lportId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#getLogicalPortMacTableInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**LogicalPortMacAddressCsvListResult**](LogicalPortMacAddressCsvListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLogicalPortOperationalStatus"></a>
# **getLogicalPortOperationalStatus**
> LogicalPortOperationalStatus getLogicalPortOperationalStatus(lportId, source)

Get Operational Status for Logical Port of a Given Port ID (lport-id)

Returns operational status of a specified logical port.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String lportId = "lportId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LogicalPortOperationalStatus result = apiInstance.getLogicalPortOperationalStatus(lportId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#getLogicalPortOperationalStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalPortOperationalStatus**](LogicalPortOperationalStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalPortState"></a>
# **getLogicalPortState**
> LogicalPortState getLogicalPortState(lportId)

Get realized state &amp; location of a logical port

Returns transport node id for a specified logical port. Also returns information about all address bindings of the specified logical port. This includes address bindings discovered via various snooping methods like ARP snooping, DHCP snooping etc. and addressing bindings that are realized based on user configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String lportId = "lportId_example"; // String | 
try {
    LogicalPortState result = apiInstance.getLogicalPortState(lportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#getLogicalPortState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**|  |

### Return type

[**LogicalPortState**](LogicalPortState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalPortStatistics"></a>
# **getLogicalPortStatistics**
> LogicalPortStatistics getLogicalPortStatistics(lportId, source)

Get Statistics for Logical Port of a Given Port ID (lport-id)

Returns statistics of a specified logical port. If the logical port is attached to a logical router port, query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String lportId = "lportId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LogicalPortStatistics result = apiInstance.getLogicalPortStatistics(lportId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#getLogicalPortStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lportId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalPortStatistics**](LogicalPortStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalPortStatusSummary"></a>
# **getLogicalPortStatusSummary**
> LogicalPortStatusSummary getLogicalPortStatusSummary(attachmentId, attachmentType, bridgeClusterId, containerPortsOnly, cursor, diagnostic, includedFields, logicalSwitchId, pageSize, parentVifId, sortAscending, sortBy, source, switchingProfileId, transportNodeId, transportZoneId)

Get Operational Status Summary of All Logical Ports in the System

Returns operational status of all logical ports. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String attachmentId = "attachmentId_example"; // String | Logical Port attachment Id
String attachmentType = "attachmentType_example"; // String | Type of attachment for logical port; for query only.
String bridgeClusterId = "bridgeClusterId_example"; // String | Bridge Cluster identifier
Boolean containerPortsOnly = true; // Boolean | Only container VIF logical ports will be returned if true
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean diagnostic = true; // Boolean | Flag to enable showing of transit logical port.
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String logicalSwitchId = "logicalSwitchId_example"; // String | Logical Switch identifier
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String parentVifId = "parentVifId_example"; // String | ID of the VIF of type PARENT
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String switchingProfileId = "switchingProfileId_example"; // String | Network Profile identifier
String transportNodeId = "transportNodeId_example"; // String | Transport node identifier
String transportZoneId = "transportZoneId_example"; // String | Transport zone identifier
try {
    LogicalPortStatusSummary result = apiInstance.getLogicalPortStatusSummary(attachmentId, attachmentType, bridgeClusterId, containerPortsOnly, cursor, diagnostic, includedFields, logicalSwitchId, pageSize, parentVifId, sortAscending, sortBy, source, switchingProfileId, transportNodeId, transportZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#getLogicalPortStatusSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| Logical Port attachment Id | [optional]
 **attachmentType** | **String**| Type of attachment for logical port; for query only. | [optional] [enum: VIF, LOGICALROUTER, BRIDGEENDPOINT, DHCP_SERVICE, METADATA_PROXY, L2VPN_SESSION, NONE]
 **bridgeClusterId** | **String**| Bridge Cluster identifier | [optional]
 **containerPortsOnly** | **Boolean**| Only container VIF logical ports will be returned if true | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **diagnostic** | **Boolean**| Flag to enable showing of transit logical port. | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **logicalSwitchId** | **String**| Logical Switch identifier | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **parentVifId** | **String**| ID of the VIF of type PARENT | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **switchingProfileId** | **String**| Network Profile identifier | [optional]
 **transportNodeId** | **String**| Transport node identifier | [optional]
 **transportZoneId** | **String**| Transport zone identifier | [optional]

### Return type

[**LogicalPortStatusSummary**](LogicalPortStatusSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLogicalPorts"></a>
# **listLogicalPorts**
> LogicalPortListResult listLogicalPorts(attachmentId, attachmentType, bridgeClusterId, containerPortsOnly, cursor, diagnostic, includedFields, logicalSwitchId, pageSize, parentVifId, sortAscending, sortBy, switchingProfileId, transportNodeId, transportZoneId)

List All Logical Ports

Returns information about all configured logical switch ports. Logical switch ports connect to VM virtual network interface cards (NICs). Each logical port is associated with one logical switch. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
String attachmentId = "attachmentId_example"; // String | Logical Port attachment Id
String attachmentType = "attachmentType_example"; // String | Type of attachment for logical port; for query only.
String bridgeClusterId = "bridgeClusterId_example"; // String | Bridge Cluster identifier
Boolean containerPortsOnly = true; // Boolean | Only container VIF logical ports will be returned if true
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean diagnostic = true; // Boolean | Flag to enable showing of transit logical port.
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String logicalSwitchId = "logicalSwitchId_example"; // String | Logical Switch identifier
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String parentVifId = "parentVifId_example"; // String | ID of the VIF of type PARENT
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String switchingProfileId = "switchingProfileId_example"; // String | Network Profile identifier
String transportNodeId = "transportNodeId_example"; // String | Transport node identifier
String transportZoneId = "transportZoneId_example"; // String | Transport zone identifier
try {
    LogicalPortListResult result = apiInstance.listLogicalPorts(attachmentId, attachmentType, bridgeClusterId, containerPortsOnly, cursor, diagnostic, includedFields, logicalSwitchId, pageSize, parentVifId, sortAscending, sortBy, switchingProfileId, transportNodeId, transportZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#listLogicalPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| Logical Port attachment Id | [optional]
 **attachmentType** | **String**| Type of attachment for logical port; for query only. | [optional] [enum: VIF, LOGICALROUTER, BRIDGEENDPOINT, DHCP_SERVICE, METADATA_PROXY, L2VPN_SESSION, NONE]
 **bridgeClusterId** | **String**| Bridge Cluster identifier | [optional]
 **containerPortsOnly** | **Boolean**| Only container VIF logical ports will be returned if true | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **diagnostic** | **Boolean**| Flag to enable showing of transit logical port. | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **logicalSwitchId** | **String**| Logical Switch identifier | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **parentVifId** | **String**| ID of the VIF of type PARENT | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **switchingProfileId** | **String**| Network Profile identifier | [optional]
 **transportNodeId** | **String**| Transport node identifier | [optional]
 **transportZoneId** | **String**| Transport zone identifier | [optional]

### Return type

[**LogicalPortListResult**](LogicalPortListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLogicalPort"></a>
# **updateLogicalPort**
> LogicalPort updateLogicalPort(body, lportId)

Update a Logical Port

Modifies an existing logical switch port. Parameters that can be modified include attachment_type (LOGICALROUTER, VIF), admin_state (UP or DOWN), attachment id and switching_profile_ids. You cannot modify the logical_switch_id. In other words, you cannot move an existing port from one switch to another switch. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();
LogicalPort body = new LogicalPort(); // LogicalPort | 
String lportId = "lportId_example"; // String | 
try {
    LogicalPort result = apiInstance.updateLogicalPort(body, lportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi#updateLogicalPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalPort**](LogicalPort.md)|  |
 **lportId** | **String**|  |

### Return type

[**LogicalPort**](LogicalPort.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

