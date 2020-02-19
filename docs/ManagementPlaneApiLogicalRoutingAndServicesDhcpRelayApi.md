# ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDhcpRelay**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi.md#createDhcpRelay) | **POST** /dhcp/relays | Create a DHCP Relay Service
[**deleteDhcpRelay**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi.md#deleteDhcpRelay) | **DELETE** /dhcp/relays/{relay-id} | Delete a DHCP Relay Service
[**listDhcpRelays**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi.md#listDhcpRelays) | **GET** /dhcp/relays | List all DHCP Relay Services
[**readDhcpRelay**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi.md#readDhcpRelay) | **GET** /dhcp/relays/{relay-id} | Read a DHCP Relay Service
[**updateDhcpRelay**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi.md#updateDhcpRelay) | **PUT** /dhcp/relays/{relay-id} | Update a DHCP Relay Service

<a name="createDhcpRelay"></a>
# **createDhcpRelay**
> DhcpRelayService createDhcpRelay(body)

Create a DHCP Relay Service

Creates a dhcp relay service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi();
DhcpRelayService body = new DhcpRelayService(); // DhcpRelayService | 
try {
    DhcpRelayService result = apiInstance.createDhcpRelay(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi#createDhcpRelay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpRelayService**](DhcpRelayService.md)|  |

### Return type

[**DhcpRelayService**](DhcpRelayService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDhcpRelay"></a>
# **deleteDhcpRelay**
> deleteDhcpRelay(relayId)

Delete a DHCP Relay Service

Deletes the specified dhcp relay service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi();
String relayId = "relayId_example"; // String | 
try {
    apiInstance.deleteDhcpRelay(relayId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi#deleteDhcpRelay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relayId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDhcpRelays"></a>
# **listDhcpRelays**
> DhcpRelayServiceListResult listDhcpRelays(cursor, includedFields, pageSize, sortAscending, sortBy)

List all DHCP Relay Services

Returns information about all configured dhcp relay services. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DhcpRelayServiceListResult result = apiInstance.listDhcpRelays(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi#listDhcpRelays");
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

[**DhcpRelayServiceListResult**](DhcpRelayServiceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDhcpRelay"></a>
# **readDhcpRelay**
> DhcpRelayService readDhcpRelay(relayId)

Read a DHCP Relay Service

Returns the dhcp relay service information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi();
String relayId = "relayId_example"; // String | 
try {
    DhcpRelayService result = apiInstance.readDhcpRelay(relayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi#readDhcpRelay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relayId** | **String**|  |

### Return type

[**DhcpRelayService**](DhcpRelayService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDhcpRelay"></a>
# **updateDhcpRelay**
> DhcpRelayService updateDhcpRelay(body, relayId)

Update a DHCP Relay Service

Modifies the specified dhcp relay service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi();
DhcpRelayService body = new DhcpRelayService(); // DhcpRelayService | 
String relayId = "relayId_example"; // String | 
try {
    DhcpRelayService result = apiInstance.updateDhcpRelay(body, relayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayApi#updateDhcpRelay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpRelayService**](DhcpRelayService.md)|  |
 **relayId** | **String**|  |

### Return type

[**DhcpRelayService**](DhcpRelayService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

