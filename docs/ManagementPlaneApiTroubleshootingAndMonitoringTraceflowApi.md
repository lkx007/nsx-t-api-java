# ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTraceflow**](ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi.md#createTraceflow) | **POST** /traceflows | Initiate a Traceflow Operation on the Specified Port
[**deleteTraceflow**](ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi.md#deleteTraceflow) | **DELETE** /traceflows/{traceflow-id} | Delete the Traceflow round
[**getTraceflow**](ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi.md#getTraceflow) | **GET** /traceflows/{traceflow-id} | Get the Traceflow round status and result summary
[**getTraceflowObservations**](ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi.md#getTraceflowObservations) | **GET** /traceflows/{traceflow-id}/observations | Get observations for the Traceflow round
[**listTraceflows**](ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi.md#listTraceflows) | **GET** /traceflows | List all Traceflow rounds

<a name="createTraceflow"></a>
# **createTraceflow**
> Traceflow createTraceflow(body)

Initiate a Traceflow Operation on the Specified Port

Initiate a Traceflow Operation on the Specified Port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi();
TraceflowRequest body = new TraceflowRequest(); // TraceflowRequest | 
try {
    Traceflow result = apiInstance.createTraceflow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi#createTraceflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TraceflowRequest**](TraceflowRequest.md)|  |

### Return type

[**Traceflow**](Traceflow.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTraceflow"></a>
# **deleteTraceflow**
> deleteTraceflow(traceflowId)

Delete the Traceflow round

Delete the Traceflow round

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi();
String traceflowId = "traceflowId_example"; // String | 
try {
    apiInstance.deleteTraceflow(traceflowId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi#deleteTraceflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **traceflowId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTraceflow"></a>
# **getTraceflow**
> Traceflow getTraceflow(traceflowId)

Get the Traceflow round status and result summary

Get the Traceflow round status and result summary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi();
String traceflowId = "traceflowId_example"; // String | 
try {
    Traceflow result = apiInstance.getTraceflow(traceflowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi#getTraceflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **traceflowId** | **String**|  |

### Return type

[**Traceflow**](Traceflow.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTraceflowObservations"></a>
# **getTraceflowObservations**
> TraceflowObservationListResult getTraceflowObservations(traceflowId, componentName, componentType, cursor, includedFields, pageSize, resourceType, sortAscending, sortBy, transportNodeName)

Get observations for the Traceflow round

Get observations for the Traceflow round

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi();
String traceflowId = "traceflowId_example"; // String | 
String componentName = "componentName_example"; // String | Observations having the given component name will be listed.
String componentType = "componentType_example"; // String | Observations having the given component type will be listed.
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String resourceType = "resourceType_example"; // String | The type of observations that will be listed.
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String transportNodeName = "transportNodeName_example"; // String | Observations having the given transport node name will be listed.
try {
    TraceflowObservationListResult result = apiInstance.getTraceflowObservations(traceflowId, componentName, componentType, cursor, includedFields, pageSize, resourceType, sortAscending, sortBy, transportNodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi#getTraceflowObservations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **traceflowId** | **String**|  |
 **componentName** | **String**| Observations having the given component name will be listed. | [optional]
 **componentType** | **String**| Observations having the given component type will be listed. | [optional] [enum: PHYSICAL, LR, LS, DFW, BRIDGE, EDGE_TUNNEL, EDGE_HOSTSWITCH, FW_BRIDGE, LOAD_BALANCER, NAT, IPSEC, SERVICE_INSERTION, VMC, EDGE_FW, UNKNOWN]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **resourceType** | **String**| The type of observations that will be listed. | [optional] [enum: TraceflowObservationForwarded, TraceflowObservationDropped, TraceflowObservationDelivered, TraceflowObservationReceived, TraceflowObservationForwardedLogical, TraceflowObservationDroppedLogical, TraceflowObservationReceivedLogical, TraceflowObservationReplicationLogical, TraceflowObservationRelayedLogical]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **transportNodeName** | **String**| Observations having the given transport node name will be listed. | [optional]

### Return type

[**TraceflowObservationListResult**](TraceflowObservationListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTraceflows"></a>
# **listTraceflows**
> TraceflowListResult listTraceflows(cursor, includedFields, lportId, pageSize, sortAscending, sortBy)

List all Traceflow rounds

List all Traceflow rounds; if a logical port id is given as a query parameter, only those originated from the logical port are returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String lportId = "lportId_example"; // String | id of the source logical port where the trace flows originated
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    TraceflowListResult result = apiInstance.listTraceflows(cursor, includedFields, lportId, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringTraceflowApi#listTraceflows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **lportId** | **String**| id of the source logical port where the trace flows originated | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**TraceflowListResult**](TraceflowListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

