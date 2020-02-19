# ManagementPlaneApiNetworkTransportTransportNodeProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransportNodeProfile**](ManagementPlaneApiNetworkTransportTransportNodeProfilesApi.md#createTransportNodeProfile) | **POST** /transport-node-profiles | Create a Transport Node Profile
[**deleteTransportNodeProfile**](ManagementPlaneApiNetworkTransportTransportNodeProfilesApi.md#deleteTransportNodeProfile) | **DELETE** /transport-node-profiles/{transport-node-profile-id} | Delete a Transport Node Profile
[**getTransportNodeProfile**](ManagementPlaneApiNetworkTransportTransportNodeProfilesApi.md#getTransportNodeProfile) | **GET** /transport-node-profiles/{transport-node-profile-id} | Get a Transport Node
[**listTransportNodeProfiles**](ManagementPlaneApiNetworkTransportTransportNodeProfilesApi.md#listTransportNodeProfiles) | **GET** /transport-node-profiles | List Transport Nodes
[**updateTransportNodeProfile**](ManagementPlaneApiNetworkTransportTransportNodeProfilesApi.md#updateTransportNodeProfile) | **PUT** /transport-node-profiles/{transport-node-profile-id} | Update a Transport Node Profile

<a name="createTransportNodeProfile"></a>
# **createTransportNodeProfile**
> TransportNodeProfile createTransportNodeProfile(body)

Create a Transport Node Profile

Transport node profile captures the configuration needed to create a transport node. A transport node profile can be attached to compute collections for automatic TN creation of member hosts. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeProfilesApi();
TransportNodeProfile body = new TransportNodeProfile(); // TransportNodeProfile | 
try {
    TransportNodeProfile result = apiInstance.createTransportNodeProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeProfilesApi#createTransportNodeProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportNodeProfile**](TransportNodeProfile.md)|  |

### Return type

[**TransportNodeProfile**](TransportNodeProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransportNodeProfile"></a>
# **deleteTransportNodeProfile**
> deleteTransportNodeProfile(transportNodeProfileId)

Delete a Transport Node Profile

Deletes the specified transport node profile. A transport node profile can be deleted only when it is not attached to any compute collection. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeProfilesApi();
String transportNodeProfileId = "transportNodeProfileId_example"; // String | 
try {
    apiInstance.deleteTransportNodeProfile(transportNodeProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeProfilesApi#deleteTransportNodeProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportNodeProfile"></a>
# **getTransportNodeProfile**
> TransportNodeProfile getTransportNodeProfile(transportNodeProfileId)

Get a Transport Node

Returns information about a specified transport node profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeProfilesApi();
String transportNodeProfileId = "transportNodeProfileId_example"; // String | 
try {
    TransportNodeProfile result = apiInstance.getTransportNodeProfile(transportNodeProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeProfilesApi#getTransportNodeProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeProfileId** | **String**|  |

### Return type

[**TransportNodeProfile**](TransportNodeProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodeProfiles"></a>
# **listTransportNodeProfiles**
> TransportNodeProfileListResult listTransportNodeProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

List Transport Nodes

Returns information about all transport node profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    TransportNodeProfileListResult result = apiInstance.listTransportNodeProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeProfilesApi#listTransportNodeProfiles");
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

[**TransportNodeProfileListResult**](TransportNodeProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTransportNodeProfile"></a>
# **updateTransportNodeProfile**
> TransportNodeProfile updateTransportNodeProfile(body, transportNodeProfileId, esxMgmtIfMigrationDest, ifId, pingIp, vnic, vnicMigrationDest)

Update a Transport Node Profile

When configurations of a transport node profile(TNP) is updated, all the transport nodes in all the compute collections to which this TNP is attached are updated to reflect the updated configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportNodeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportNodeProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportNodeProfilesApi();
TransportNodeProfile body = new TransportNodeProfile(); // TransportNodeProfile | 
String transportNodeProfileId = "transportNodeProfileId_example"; // String | 
String esxMgmtIfMigrationDest = "esxMgmtIfMigrationDest_example"; // String | The network ids to which the ESX vmk interfaces will be migrated
String ifId = "ifId_example"; // String | The ESX vmk interfaces to migrate
String pingIp = "pingIp_example"; // String | IP Addresses to ping right after ESX vmk interfaces were migrated.
String vnic = "vnic_example"; // String | The ESX vmk interfaces and/or VM NIC to migrate
String vnicMigrationDest = "vnicMigrationDest_example"; // String | The migration destinations of ESX vmk interfaces and/or VM NIC
try {
    TransportNodeProfile result = apiInstance.updateTransportNodeProfile(body, transportNodeProfileId, esxMgmtIfMigrationDest, ifId, pingIp, vnic, vnicMigrationDest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportNodeProfilesApi#updateTransportNodeProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportNodeProfile**](TransportNodeProfile.md)|  |
 **transportNodeProfileId** | **String**|  |
 **esxMgmtIfMigrationDest** | **String**| The network ids to which the ESX vmk interfaces will be migrated | [optional]
 **ifId** | **String**| The ESX vmk interfaces to migrate | [optional]
 **pingIp** | **String**| IP Addresses to ping right after ESX vmk interfaces were migrated. | [optional]
 **vnic** | **String**| The ESX vmk interfaces and/or VM NIC to migrate | [optional]
 **vnicMigrationDest** | **String**| The migration destinations of ESX vmk interfaces and/or VM NIC | [optional]

### Return type

[**TransportNodeProfile**](TransportNodeProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

