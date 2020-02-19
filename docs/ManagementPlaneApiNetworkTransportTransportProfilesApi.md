# ManagementPlaneApiNetworkTransportTransportProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransportZoneProfile**](ManagementPlaneApiNetworkTransportTransportProfilesApi.md#createTransportZoneProfile) | **POST** /transportzone-profiles | Create a transport zone Profile
[**deleteTransportZoneProfile**](ManagementPlaneApiNetworkTransportTransportProfilesApi.md#deleteTransportZoneProfile) | **DELETE** /transportzone-profiles/{transportzone-profile-id} | Delete a transport zone Profile
[**getTransportZoneProfile**](ManagementPlaneApiNetworkTransportTransportProfilesApi.md#getTransportZoneProfile) | **GET** /transportzone-profiles/{transportzone-profile-id} | Get transport zone profile by identifier
[**listTransportZoneProfiles**](ManagementPlaneApiNetworkTransportTransportProfilesApi.md#listTransportZoneProfiles) | **GET** /transportzone-profiles | List transport zone profiles
[**updateTransportZoneProfile**](ManagementPlaneApiNetworkTransportTransportProfilesApi.md#updateTransportZoneProfile) | **PUT** /transportzone-profiles/{transportzone-profile-id} | Update a transport zone profile

<a name="createTransportZoneProfile"></a>
# **createTransportZoneProfile**
> TransportZoneProfile createTransportZoneProfile(body)

Create a transport zone Profile

Creates a transport zone profile. The resource_type is required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportProfilesApi();
TransportZoneProfile body = new TransportZoneProfile(); // TransportZoneProfile | 
try {
    TransportZoneProfile result = apiInstance.createTransportZoneProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportProfilesApi#createTransportZoneProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportZoneProfile**](TransportZoneProfile.md)|  |

### Return type

[**TransportZoneProfile**](TransportZoneProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransportZoneProfile"></a>
# **deleteTransportZoneProfile**
> deleteTransportZoneProfile(transportzoneProfileId)

Delete a transport zone Profile

Deletes a specified transport zone profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportProfilesApi();
String transportzoneProfileId = "transportzoneProfileId_example"; // String | 
try {
    apiInstance.deleteTransportZoneProfile(transportzoneProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportProfilesApi#deleteTransportZoneProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportzoneProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransportZoneProfile"></a>
# **getTransportZoneProfile**
> TransportZoneProfile getTransportZoneProfile(transportzoneProfileId)

Get transport zone profile by identifier

Returns information about a specified transport zone profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportProfilesApi();
String transportzoneProfileId = "transportzoneProfileId_example"; // String | 
try {
    TransportZoneProfile result = apiInstance.getTransportZoneProfile(transportzoneProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportProfilesApi#getTransportZoneProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportzoneProfileId** | **String**|  |

### Return type

[**TransportZoneProfile**](TransportZoneProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportZoneProfiles"></a>
# **listTransportZoneProfiles**
> TransportZoneProfileListResult listTransportZoneProfiles(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy)

List transport zone profiles

Returns information about the configured transport zone profiles. Transport zone profiles define networking policies for transport zones and transport zone endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean includeSystemOwned = true; // Boolean | Whether the list result contains system resources
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String resourceType = "resourceType_example"; // String | comma-separated list of transport zone profile types, e.g. ?resource_type=BfdHealthMonitoringProfile
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    TransportZoneProfileListResult result = apiInstance.listTransportZoneProfiles(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportProfilesApi#listTransportZoneProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includeSystemOwned** | **Boolean**| Whether the list result contains system resources | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **resourceType** | **String**| comma-separated list of transport zone profile types, e.g. ?resource_type&#x3D;BfdHealthMonitoringProfile | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**TransportZoneProfileListResult**](TransportZoneProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTransportZoneProfile"></a>
# **updateTransportZoneProfile**
> TransportZoneProfile updateTransportZoneProfile(body, transportzoneProfileId)

Update a transport zone profile

Modifies a specified transport zone profile. The body of the PUT request must include the resource_type. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportTransportProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportTransportProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportTransportProfilesApi();
TransportZoneProfile body = new TransportZoneProfile(); // TransportZoneProfile | 
String transportzoneProfileId = "transportzoneProfileId_example"; // String | 
try {
    TransportZoneProfile result = apiInstance.updateTransportZoneProfile(body, transportzoneProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportTransportProfilesApi#updateTransportZoneProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportZoneProfile**](TransportZoneProfile.md)|  |
 **transportzoneProfileId** | **String**|  |

### Return type

[**TransportZoneProfile**](TransportZoneProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

