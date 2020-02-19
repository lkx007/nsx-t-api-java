# ManagementPlaneApiNetworkTransportTransportZonesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransportZone**](ManagementPlaneApiNetworkTransportTransportZonesApi.md#createTransportZone) | **POST** /transport-zones | Create a Transport Zone
[**deleteTransportZone**](ManagementPlaneApiNetworkTransportTransportZonesApi.md#deleteTransportZone) | **DELETE** /transport-zones/{zone-id} | Delete a Transport Zone
[**getTransportZone**](ManagementPlaneApiNetworkTransportTransportZonesApi.md#getTransportZone) | **GET** /transport-zones/{zone-id} | Get a Transport Zone
[**getTransportZoneStatus**](ManagementPlaneApiNetworkTransportTransportZonesApi.md#getTransportZoneStatus) | **GET** /transport-zones/{zone-id}/summary | Get a Transport Zone&#x27;s Current Runtime Status Information
[**listTransportZones**](ManagementPlaneApiNetworkTransportTransportZonesApi.md#listTransportZones) | **GET** /transport-zones | List Transport Zones
[**updateTransportZone**](ManagementPlaneApiNetworkTransportTransportZonesApi.md#updateTransportZone) | **PUT** /transport-zones/{zone-id} | Update a Transport Zone

<a name="createTransportZone"></a>
# **createTransportZone**
> TransportZone createTransportZone(body)

Create a Transport Zone

Creates a new transport zone. The required parameters are host_switch_name and transport_type (OVERLAY or VLAN). The optional parameters are description and display_name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportZonesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportZonesApi();
TransportZone body = new TransportZone(); // TransportZone | 
try {
    TransportZone result = apiInstance.createTransportZone(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportZonesApi#createTransportZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportZone**](TransportZone.md)|  |

### Return type

[**TransportZone**](TransportZone.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransportZone"></a>
# **deleteTransportZone**
> deleteTransportZone(zoneId)

Delete a Transport Zone

Deletes an existing transport zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportZonesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportZonesApi();
String zoneId = "zoneId_example"; // String | 
try {
    apiInstance.deleteTransportZone(zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportZonesApi#deleteTransportZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportZone"></a>
# **getTransportZone**
> TransportZone getTransportZone(zoneId)

Get a Transport Zone

Returns information about a single transport zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportZonesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportZonesApi();
String zoneId = "zoneId_example"; // String | 
try {
    TransportZone result = apiInstance.getTransportZone(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportZonesApi#getTransportZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**|  |

### Return type

[**TransportZone**](TransportZone.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportZoneStatus"></a>
# **getTransportZoneStatus**
> TransportZoneStatus getTransportZoneStatus(zoneId)

Get a Transport Zone&#x27;s Current Runtime Status Information

Returns information about a specified transport zone, including the number of logical switches in the transport zone, number of logical spitch ports assigned to the transport zone, and number of transport nodes in the transport zone. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportZonesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportZonesApi();
String zoneId = "zoneId_example"; // String | 
try {
    TransportZoneStatus result = apiInstance.getTransportZoneStatus(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportZonesApi#getTransportZoneStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**|  |

### Return type

[**TransportZoneStatus**](TransportZoneStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportZones"></a>
# **listTransportZones**
> TransportZoneListResult listTransportZones(cursor, includedFields, isDefault, pageSize, sortAscending, sortBy, transportType, uplinkTeamingPolicyName)

List Transport Zones

Returns information about configured transport zones. NSX requires at least one transport zone. NSX uses transport zones to provide connectivity based on the topology of the underlying network, trust zones, or organizational separations. For example, you might have hypervisors that use one network for management traffic and a different network for VM traffic. This architecture would require two transport zones. The combination of transport zones plus transport connectors enables NSX to form tunnels between hypervisors. Transport zones define which interfaces on the hypervisors can communicate with which other interfaces on other hypervisors to establish overlay tunnels or provide connectivity to a VLAN. A logical switch can be in one (and only one) transport zone. This means that all of a switch&#x27;s interfaces must be in the same transport zone. However, each hypervisor virtual switch (OVS or VDS) has multiple interfaces (connectors), and each connector can be attached to a different logical switch. For example, on a single hypervisor with two connectors, connector A can be attached to logical switch 1 in transport zone A, while connector B is attached to logical switch 2 in transport zone B. In this way, a single hypervisor can participate in multiple transport zones. The API for creating a transport zone requires that a single host switch be specified for each transport zone, and multiple transport zones can share the same host switch. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportZonesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportZonesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Boolean isDefault = true; // Boolean | Filter to choose if default transport zones will be returned
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String transportType = "transportType_example"; // String | Filter to choose the type of transport zones to return
String uplinkTeamingPolicyName = "uplinkTeamingPolicyName_example"; // String | The transport zone's uplink teaming policy name
try {
    TransportZoneListResult result = apiInstance.listTransportZones(cursor, includedFields, isDefault, pageSize, sortAscending, sortBy, transportType, uplinkTeamingPolicyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportZonesApi#listTransportZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **isDefault** | **Boolean**| Filter to choose if default transport zones will be returned | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **transportType** | **String**| Filter to choose the type of transport zones to return | [optional] [enum: OVERLAY, VLAN]
 **uplinkTeamingPolicyName** | **String**| The transport zone&#x27;s uplink teaming policy name | [optional]

### Return type

[**TransportZoneListResult**](TransportZoneListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTransportZone"></a>
# **updateTransportZone**
> TransportZone updateTransportZone(body, zoneId)

Update a Transport Zone

Updates an existing transport zone. Modifiable parameters are transport_type (VLAN or OVERLAY), description, and display_name. The request must include the existing host_switch_name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportZonesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportZonesApi();
TransportZone body = new TransportZone(); // TransportZone | 
String zoneId = "zoneId_example"; // String | 
try {
    TransportZone result = apiInstance.updateTransportZone(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportZonesApi#updateTransportZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportZone**](TransportZone.md)|  |
 **zoneId** | **String**|  |

### Return type

[**TransportZone**](TransportZone.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

