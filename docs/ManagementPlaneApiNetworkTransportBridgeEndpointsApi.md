# ManagementPlaneApiNetworkTransportBridgeEndpointsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBridgeEndpoint**](ManagementPlaneApiNetworkTransportBridgeEndpointsApi.md#createBridgeEndpoint) | **POST** /bridge-endpoints | Create a Bridge Endpoint
[**deleteBridgeEndpoint**](ManagementPlaneApiNetworkTransportBridgeEndpointsApi.md#deleteBridgeEndpoint) | **DELETE** /bridge-endpoints/{bridgeendpoint-id} | Delete a Bridge Endpoint
[**getBridgeEndpoint**](ManagementPlaneApiNetworkTransportBridgeEndpointsApi.md#getBridgeEndpoint) | **GET** /bridge-endpoints/{bridgeendpoint-id} | Get Information about a bridge endpoint
[**getBridgeEndpointStatistics**](ManagementPlaneApiNetworkTransportBridgeEndpointsApi.md#getBridgeEndpointStatistics) | **GET** /bridge-endpoints/{endpoint-id}/statistics | Returns statistics of a specified Bridge Endpoint
[**getBridgeEndpointStatus**](ManagementPlaneApiNetworkTransportBridgeEndpointsApi.md#getBridgeEndpointStatus) | **GET** /bridge-endpoints/{endpoint-id}/status | Returns status of a specified Bridge Endpoint
[**listBridgeEndpoints**](ManagementPlaneApiNetworkTransportBridgeEndpointsApi.md#listBridgeEndpoints) | **GET** /bridge-endpoints | List All Bridge Endpoints
[**updateBridgeEndpoint**](ManagementPlaneApiNetworkTransportBridgeEndpointsApi.md#updateBridgeEndpoint) | **PUT** /bridge-endpoints/{bridgeendpoint-id} | Update a Bridge Endpoint

<a name="createBridgeEndpoint"></a>
# **createBridgeEndpoint**
> BridgeEndpoint createBridgeEndpoint(body)

Create a Bridge Endpoint

Creates a Bridge Endpoint. It describes the physical attributes of the bridge like vlan. A logical port can be attached to a vif providing bridging functionality from the logical overlay network to the physical vlan network 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointsApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointsApi();
BridgeEndpoint body = new BridgeEndpoint(); // BridgeEndpoint | 
try {
    BridgeEndpoint result = apiInstance.createBridgeEndpoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointsApi#createBridgeEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BridgeEndpoint**](BridgeEndpoint.md)|  |

### Return type

[**BridgeEndpoint**](BridgeEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBridgeEndpoint"></a>
# **deleteBridgeEndpoint**
> deleteBridgeEndpoint(bridgeendpointId)

Delete a Bridge Endpoint

Deletes the specified Bridge Endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointsApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointsApi();
String bridgeendpointId = "bridgeendpointId_example"; // String | 
try {
    apiInstance.deleteBridgeEndpoint(bridgeendpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointsApi#deleteBridgeEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeendpointId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBridgeEndpoint"></a>
# **getBridgeEndpoint**
> BridgeEndpoint getBridgeEndpoint(bridgeendpointId)

Get Information about a bridge endpoint

Returns information about a specified bridge endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointsApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointsApi();
String bridgeendpointId = "bridgeendpointId_example"; // String | 
try {
    BridgeEndpoint result = apiInstance.getBridgeEndpoint(bridgeendpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointsApi#getBridgeEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeendpointId** | **String**|  |

### Return type

[**BridgeEndpoint**](BridgeEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBridgeEndpointStatistics"></a>
# **getBridgeEndpointStatistics**
> BridgeEndpointStatistics getBridgeEndpointStatistics(endpointId, source)

Returns statistics of a specified Bridge Endpoint

Get the statistics for the Bridge Endpoint of the given Endpoint id (endpoint-id)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointsApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointsApi();
String endpointId = "endpointId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    BridgeEndpointStatistics result = apiInstance.getBridgeEndpointStatistics(endpointId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointsApi#getBridgeEndpointStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**BridgeEndpointStatistics**](BridgeEndpointStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBridgeEndpointStatus"></a>
# **getBridgeEndpointStatus**
> BridgeEndpointStatus getBridgeEndpointStatus(endpointId, source)

Returns status of a specified Bridge Endpoint

Get the status for the Bridge Endpoint of the given Endpoint id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointsApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointsApi();
String endpointId = "endpointId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    BridgeEndpointStatus result = apiInstance.getBridgeEndpointStatus(endpointId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointsApi#getBridgeEndpointStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**BridgeEndpointStatus**](BridgeEndpointStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBridgeEndpoints"></a>
# **listBridgeEndpoints**
> BridgeEndpointListResult listBridgeEndpoints(bridgeClusterId, bridgeEndpointProfileId, cursor, includedFields, logicalSwitchId, pageSize, sortAscending, sortBy, vlanTransportZoneId)

List All Bridge Endpoints

Returns information about all configured bridge endoints 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointsApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointsApi();
String bridgeClusterId = "bridgeClusterId_example"; // String | Bridge Cluster Identifier
String bridgeEndpointProfileId = "bridgeEndpointProfileId_example"; // String | Bridge endpoint profile used by the edge cluster
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String logicalSwitchId = "logicalSwitchId_example"; // String | Logical Switch Identifier
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String vlanTransportZoneId = "vlanTransportZoneId_example"; // String | VLAN transport zone id used by the edge cluster
try {
    BridgeEndpointListResult result = apiInstance.listBridgeEndpoints(bridgeClusterId, bridgeEndpointProfileId, cursor, includedFields, logicalSwitchId, pageSize, sortAscending, sortBy, vlanTransportZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointsApi#listBridgeEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeClusterId** | **String**| Bridge Cluster Identifier | [optional]
 **bridgeEndpointProfileId** | **String**| Bridge endpoint profile used by the edge cluster | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **logicalSwitchId** | **String**| Logical Switch Identifier | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **vlanTransportZoneId** | **String**| VLAN transport zone id used by the edge cluster | [optional]

### Return type

[**BridgeEndpointListResult**](BridgeEndpointListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBridgeEndpoint"></a>
# **updateBridgeEndpoint**
> BridgeEndpoint updateBridgeEndpoint(body, bridgeendpointId)

Update a Bridge Endpoint

Modifies a existing bridge endpoint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointsApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointsApi();
BridgeEndpoint body = new BridgeEndpoint(); // BridgeEndpoint | 
String bridgeendpointId = "bridgeendpointId_example"; // String | 
try {
    BridgeEndpoint result = apiInstance.updateBridgeEndpoint(body, bridgeendpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointsApi#updateBridgeEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BridgeEndpoint**](BridgeEndpoint.md)|  |
 **bridgeendpointId** | **String**|  |

### Return type

[**BridgeEndpoint**](BridgeEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

