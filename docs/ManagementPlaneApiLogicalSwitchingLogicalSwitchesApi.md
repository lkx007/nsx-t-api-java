# ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLogicalSwitch**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#createLogicalSwitch) | **POST** /logical-switches | Create a Logical Switch
[**deleteLogicalSwitch**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#deleteLogicalSwitch) | **DELETE** /logical-switches/{lswitch-id} | Delete a Logical Switch
[**getLogicalSwitch**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitch) | **GET** /logical-switches/{lswitch-id} | Get Logical Switch associated with the provided id (lswitch-id)
[**getLogicalSwitchMacTable**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchMacTable) | **GET** /logical-switches/{lswitch-id}/mac-table | Get MAC Table for Logical Switch of the Given ID (lswitch-id)
[**getLogicalSwitchMacTableInCsvFormatCsv**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchMacTableInCsvFormatCsv) | **GET** /logical-switches/{lswitch-id}/mac-table?format&#x3D;csv | Get MAC Table for Logical Switch of the Given ID (lswitch-id)
[**getLogicalSwitchState**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchState) | **GET** /logical-switches/{lswitch-id}/state | Get the realized state associated with provided logical switch id
[**getLogicalSwitchStatistics**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchStatistics) | **GET** /logical-switches/{lswitch-id}/statistics | Get Statistics for Logical Switch of the Given ID (lswitch-id)
[**getLogicalSwitchStatus**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchStatus) | **GET** /logical-switches/{lswitch-id}/summary | Get Logical Switch runtime status info for a given logical switch
[**getLogicalSwitchStatusSummary**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchStatusSummary) | **GET** /logical-switches/status | Get Status Summary of All Logical Switches in the System
[**getLogicalSwitchVtepTable**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchVtepTable) | **GET** /logical-switches/{lswitch-id}/vtep-table | Get virtual tunnel endpoint table for logical switch of the given ID (lswitch-id) 
[**getLogicalSwitchVtepTableInCsvFormatCsv**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#getLogicalSwitchVtepTableInCsvFormatCsv) | **GET** /logical-switches/{lswitch-id}/vtep-table?format&#x3D;csv | Get virtual tunnel endpoint table for logical switch of the given ID (lswitch-id) 
[**listLogicalSwitches**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#listLogicalSwitches) | **GET** /logical-switches | List all Logical Switches
[**listLogicalSwitchesByState**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#listLogicalSwitchesByState) | **GET** /logical-switches/state | List logical switches by realized state
[**updateLogicalSwitch**](ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi.md#updateLogicalSwitch) | **PUT** /logical-switches/{lswitch-id} | Update a Logical Switch

<a name="createLogicalSwitch"></a>
# **createLogicalSwitch**
> LogicalSwitch createLogicalSwitch(body)

Create a Logical Switch

Creates a new logical switch. The request must include the transport_zone_id, display_name, and admin_state (UP or DOWN). The replication_mode (MTEP or SOURCE) is required for overlay logical switches, but not for VLAN-based logical switches. A vlan needs to be provided for VLAN-based logical switches 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
LogicalSwitch body = new LogicalSwitch(); // LogicalSwitch | 
try {
    LogicalSwitch result = apiInstance.createLogicalSwitch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#createLogicalSwitch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalSwitch**](LogicalSwitch.md)|  |

### Return type

[**LogicalSwitch**](LogicalSwitch.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLogicalSwitch"></a>
# **deleteLogicalSwitch**
> deleteLogicalSwitch(lswitchId, cascade, detach)

Delete a Logical Switch

Removes a logical switch from the associated overlay or VLAN transport zone. By default, a logical switch cannot be deleted if there are logical ports on the switch, or it is added to a NSGroup. Cascade option can be used to delete all ports and the logical switch. Detach option can be used to delete the logical switch forcibly. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
Boolean cascade = true; // Boolean | Delete a Logical Switch and all the logical ports in it, if none of the logical ports have any attachment. 
Boolean detach = true; // Boolean | Force delete a logical switch
try {
    apiInstance.deleteLogicalSwitch(lswitchId, cascade, detach);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#deleteLogicalSwitch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |
 **cascade** | **Boolean**| Delete a Logical Switch and all the logical ports in it, if none of the logical ports have any attachment.  | [optional]
 **detach** | **Boolean**| Force delete a logical switch | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitch"></a>
# **getLogicalSwitch**
> LogicalSwitch getLogicalSwitch(lswitchId)

Get Logical Switch associated with the provided id (lswitch-id)

Returns information about the specified logical switch Id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
try {
    LogicalSwitch result = apiInstance.getLogicalSwitch(lswitchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |

### Return type

[**LogicalSwitch**](LogicalSwitch.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitchMacTable"></a>
# **getLogicalSwitchMacTable**
> MacAddressListResult getLogicalSwitchMacTable(lswitchId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId)

Get MAC Table for Logical Switch of the Given ID (lswitch-id)

Returns MAC table of a specified logical switch from the given transport node if a transport node id is given in the query parameter from the Central Controller Plane. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    MacAddressListResult result = apiInstance.getLogicalSwitchMacTable(lswitchId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchMacTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**MacAddressListResult**](MacAddressListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitchMacTableInCsvFormatCsv"></a>
# **getLogicalSwitchMacTableInCsvFormatCsv**
> MacAddressCsvListResult getLogicalSwitchMacTableInCsvFormatCsv(lswitchId, source, transportNodeId)

Get MAC Table for Logical Switch of the Given ID (lswitch-id)

Returns MAC table of a specified logical switch in CSV format from the given transport node if a transport node id is given in the query parameter from the Central Controller Plane. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    MacAddressCsvListResult result = apiInstance.getLogicalSwitchMacTableInCsvFormatCsv(lswitchId, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchMacTableInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**MacAddressCsvListResult**](MacAddressCsvListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLogicalSwitchState"></a>
# **getLogicalSwitchState**
> LogicalSwitchState getLogicalSwitchState(lswitchId)

Get the realized state associated with provided logical switch id

Returns current state of the logical switch configuration and details of only out-of-sync transport nodes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
try {
    LogicalSwitchState result = apiInstance.getLogicalSwitchState(lswitchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |

### Return type

[**LogicalSwitchState**](LogicalSwitchState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitchStatistics"></a>
# **getLogicalSwitchStatistics**
> LogicalSwitchStatistics getLogicalSwitchStatistics(lswitchId, source)

Get Statistics for Logical Switch of the Given ID (lswitch-id)

Returns statistics  of a specified logical switch. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LogicalSwitchStatistics result = apiInstance.getLogicalSwitchStatistics(lswitchId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LogicalSwitchStatistics**](LogicalSwitchStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitchStatus"></a>
# **getLogicalSwitchStatus**
> LogicalSwitchStatus getLogicalSwitchStatus(lswitchId)

Get Logical Switch runtime status info for a given logical switch

Returns the number of ports assigned to a logical switch.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
try {
    LogicalSwitchStatus result = apiInstance.getLogicalSwitchStatus(lswitchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |

### Return type

[**LogicalSwitchStatus**](LogicalSwitchStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitchStatusSummary"></a>
# **getLogicalSwitchStatusSummary**
> LogicalSwitchStatusSummary getLogicalSwitchStatusSummary(cursor, diagnostic, includedFields, pageSize, sortAscending, sortBy, source, switchingProfileId, transportType, transportZoneId, uplinkTeamingPolicyName, vlan, vni)

Get Status Summary of All Logical Switches in the System

Returns Operational status of all logical switches. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean diagnostic = true; // Boolean | Flag to enable showing of transit logical switch.
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String switchingProfileId = "switchingProfileId_example"; // String | Switching Profile identifier
String transportType = "transportType_example"; // String | Mode of transport supported in the transport zone for this logical switch
String transportZoneId = "transportZoneId_example"; // String | Transport zone identifier
String uplinkTeamingPolicyName = "uplinkTeamingPolicyName_example"; // String | The logical switch's uplink teaming policy name
Long vlan = 789L; // Long | Virtual Local Area Network Identifier
Integer vni = 56; // Integer | VNI of the OVERLAY LogicalSwitch(es) to return.
try {
    LogicalSwitchStatusSummary result = apiInstance.getLogicalSwitchStatusSummary(cursor, diagnostic, includedFields, pageSize, sortAscending, sortBy, source, switchingProfileId, transportType, transportZoneId, uplinkTeamingPolicyName, vlan, vni);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchStatusSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **diagnostic** | **Boolean**| Flag to enable showing of transit logical switch. | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **switchingProfileId** | **String**| Switching Profile identifier | [optional]
 **transportType** | **String**| Mode of transport supported in the transport zone for this logical switch | [optional] [enum: OVERLAY, VLAN]
 **transportZoneId** | **String**| Transport zone identifier | [optional]
 **uplinkTeamingPolicyName** | **String**| The logical switch&#x27;s uplink teaming policy name | [optional]
 **vlan** | **Long**| Virtual Local Area Network Identifier | [optional] [enum: ]
 **vni** | **Integer**| VNI of the OVERLAY LogicalSwitch(es) to return. | [optional]

### Return type

[**LogicalSwitchStatusSummary**](LogicalSwitchStatusSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitchVtepTable"></a>
# **getLogicalSwitchVtepTable**
> VtepListResult getLogicalSwitchVtepTable(lswitchId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId)

Get virtual tunnel endpoint table for logical switch of the given ID (lswitch-id) 

Returns the virtual tunnel endpoint table of a specified logical switch from the given transport node if a transport node id is given in the query parameter, from the Central Controller Plane. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    VtepListResult result = apiInstance.getLogicalSwitchVtepTable(lswitchId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchVtepTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**VtepListResult**](VtepListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogicalSwitchVtepTableInCsvFormatCsv"></a>
# **getLogicalSwitchVtepTableInCsvFormatCsv**
> VtepCsvListResult getLogicalSwitchVtepTableInCsvFormatCsv(lswitchId, source, transportNodeId)

Get virtual tunnel endpoint table for logical switch of the given ID (lswitch-id) 

Returns virtual tunnel endpoint table of a specified logical switch in CSV format from the given transport node if a transport node id is given in the query parameter from the Central Controller Plane. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String lswitchId = "lswitchId_example"; // String | 
String source = "source_example"; // String | Data source type.
String transportNodeId = "transportNodeId_example"; // String | TransportNode Id
try {
    VtepCsvListResult result = apiInstance.getLogicalSwitchVtepTableInCsvFormatCsv(lswitchId, source, transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#getLogicalSwitchVtepTableInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswitchId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]
 **transportNodeId** | **String**| TransportNode Id | [optional]

### Return type

[**VtepCsvListResult**](VtepCsvListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="listLogicalSwitches"></a>
# **listLogicalSwitches**
> LogicalSwitchListResult listLogicalSwitches(cursor, diagnostic, includedFields, pageSize, sortAscending, sortBy, switchingProfileId, transportType, transportZoneId, uplinkTeamingPolicyName, vlan, vni)

List all Logical Switches

Returns information about all configured logical switches.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean diagnostic = true; // Boolean | Flag to enable showing of transit logical switch.
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String switchingProfileId = "switchingProfileId_example"; // String | Switching Profile identifier
String transportType = "transportType_example"; // String | Mode of transport supported in the transport zone for this logical switch
String transportZoneId = "transportZoneId_example"; // String | Transport zone identifier
String uplinkTeamingPolicyName = "uplinkTeamingPolicyName_example"; // String | The logical switch's uplink teaming policy name
Long vlan = 789L; // Long | Virtual Local Area Network Identifier
Integer vni = 56; // Integer | VNI of the OVERLAY LogicalSwitch(es) to return.
try {
    LogicalSwitchListResult result = apiInstance.listLogicalSwitches(cursor, diagnostic, includedFields, pageSize, sortAscending, sortBy, switchingProfileId, transportType, transportZoneId, uplinkTeamingPolicyName, vlan, vni);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#listLogicalSwitches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **diagnostic** | **Boolean**| Flag to enable showing of transit logical switch. | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **switchingProfileId** | **String**| Switching Profile identifier | [optional]
 **transportType** | **String**| Mode of transport supported in the transport zone for this logical switch | [optional] [enum: OVERLAY, VLAN]
 **transportZoneId** | **String**| Transport zone identifier | [optional]
 **uplinkTeamingPolicyName** | **String**| The logical switch&#x27;s uplink teaming policy name | [optional]
 **vlan** | **Long**| Virtual Local Area Network Identifier | [optional] [enum: ]
 **vni** | **Integer**| VNI of the OVERLAY LogicalSwitch(es) to return. | [optional]

### Return type

[**LogicalSwitchListResult**](LogicalSwitchListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLogicalSwitchesByState"></a>
# **listLogicalSwitchesByState**
> LogicalSwitchStateListResult listLogicalSwitchesByState(status)

List logical switches by realized state

Returns a list of logical switches states that have realized state as provided as query parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
String status = "status_example"; // String | Realized state of logical switches
try {
    LogicalSwitchStateListResult result = apiInstance.listLogicalSwitchesByState(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#listLogicalSwitchesByState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Realized state of logical switches | [optional] [enum: PENDING, IN_PROGRESS, PARTIAL_SUCCESS, SUCCESS]

### Return type

[**LogicalSwitchStateListResult**](LogicalSwitchStateListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLogicalSwitch"></a>
# **updateLogicalSwitch**
> LogicalSwitch updateLogicalSwitch(body, lswitchId)

Update a Logical Switch

Modifies attributes of an existing logical switch. Modifiable attributes include admin_state, replication_mode, switching_profile_ids and VLAN spec. You cannot modify the original transport_zone_id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi apiInstance = new ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi();
LogicalSwitch body = new LogicalSwitch(); // LogicalSwitch | 
String lswitchId = "lswitchId_example"; // String | 
try {
    LogicalSwitch result = apiInstance.updateLogicalSwitch(body, lswitchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingLogicalSwitchesApi#updateLogicalSwitch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalSwitch**](LogicalSwitch.md)|  |
 **lswitchId** | **String**|  |

### Return type

[**LogicalSwitch**](LogicalSwitch.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

