# ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBridgeEndpointProfile**](ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi.md#createBridgeEndpointProfile) | **POST** /bridge-endpoint-profiles | Create a Bridge Endpoint Profile
[**deleteBridgeEndpointProfile**](ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi.md#deleteBridgeEndpointProfile) | **DELETE** /bridge-endpoint-profiles/{bridgeendpointprofile-id} | Delete a Bridge Endpoint Profile
[**getBridgeEndpointProfile**](ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi.md#getBridgeEndpointProfile) | **GET** /bridge-endpoint-profiles/{bridgeendpointprofile-id} | Get Information about a bridge endpoint Profile
[**listBridgeEndpointProfiles**](ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi.md#listBridgeEndpointProfiles) | **GET** /bridge-endpoint-profiles | List All Bridge Endpoint Profiles
[**updateBridgeEndpointProfile**](ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi.md#updateBridgeEndpointProfile) | **PUT** /bridge-endpoint-profiles/{bridgeendpointprofile-id} | Update a Bridge Endpoint Profile

<a name="createBridgeEndpointProfile"></a>
# **createBridgeEndpointProfile**
> BridgeEndpointProfile createBridgeEndpointProfile(body)

Create a Bridge Endpoint Profile

Creates a Bridge Endpoint Profile. Profile contains edge cluster id, indexes of the member nodes, fialover mode and high availability mode for a Bridge EndPoint 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi();
BridgeEndpointProfile body = new BridgeEndpointProfile(); // BridgeEndpointProfile | 
try {
    BridgeEndpointProfile result = apiInstance.createBridgeEndpointProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi#createBridgeEndpointProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BridgeEndpointProfile**](BridgeEndpointProfile.md)|  |

### Return type

[**BridgeEndpointProfile**](BridgeEndpointProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBridgeEndpointProfile"></a>
# **deleteBridgeEndpointProfile**
> deleteBridgeEndpointProfile(bridgeendpointprofileId)

Delete a Bridge Endpoint Profile

Deletes the specified Bridge Endpoint Profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi();
String bridgeendpointprofileId = "bridgeendpointprofileId_example"; // String | 
try {
    apiInstance.deleteBridgeEndpointProfile(bridgeendpointprofileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi#deleteBridgeEndpointProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeendpointprofileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBridgeEndpointProfile"></a>
# **getBridgeEndpointProfile**
> BridgeEndpointProfile getBridgeEndpointProfile(bridgeendpointprofileId)

Get Information about a bridge endpoint Profile

Returns information about a specified bridge endpoint profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi();
String bridgeendpointprofileId = "bridgeendpointprofileId_example"; // String | 
try {
    BridgeEndpointProfile result = apiInstance.getBridgeEndpointProfile(bridgeendpointprofileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi#getBridgeEndpointProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeendpointprofileId** | **String**|  |

### Return type

[**BridgeEndpointProfile**](BridgeEndpointProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBridgeEndpointProfiles"></a>
# **listBridgeEndpointProfiles**
> BridgeEndpointProfileListResult listBridgeEndpointProfiles(cursor, edgeClusterId, failoverMode, includedFields, pageSize, sortAscending, sortBy)

List All Bridge Endpoint Profiles

Returns information about all configured bridge endoint profiles 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String edgeClusterId = "edgeClusterId_example"; // String | Edge Cluster Identifier
String failoverMode = "failoverMode_example"; // String | 
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    BridgeEndpointProfileListResult result = apiInstance.listBridgeEndpointProfiles(cursor, edgeClusterId, failoverMode, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi#listBridgeEndpointProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **edgeClusterId** | **String**| Edge Cluster Identifier | [optional]
 **failoverMode** | **String**|  | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**BridgeEndpointProfileListResult**](BridgeEndpointProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBridgeEndpointProfile"></a>
# **updateBridgeEndpointProfile**
> BridgeEndpointProfile updateBridgeEndpointProfile(body, bridgeendpointprofileId)

Update a Bridge Endpoint Profile

Modifies a existing bridge endpoint profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi();
BridgeEndpointProfile body = new BridgeEndpointProfile(); // BridgeEndpointProfile | 
String bridgeendpointprofileId = "bridgeendpointprofileId_example"; // String | 
try {
    BridgeEndpointProfile result = apiInstance.updateBridgeEndpointProfile(body, bridgeendpointprofileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi#updateBridgeEndpointProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BridgeEndpointProfile**](BridgeEndpointProfile.md)|  |
 **bridgeendpointprofileId** | **String**|  |

### Return type

[**BridgeEndpointProfile**](BridgeEndpointProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

