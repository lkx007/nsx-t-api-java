# ManagementPlaneApiNetworkTransportClusterProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterProfile**](ManagementPlaneApiNetworkTransportClusterProfilesApi.md#createClusterProfile) | **POST** /cluster-profiles | Create a Cluster Profile
[**deleteClusterProfile**](ManagementPlaneApiNetworkTransportClusterProfilesApi.md#deleteClusterProfile) | **DELETE** /cluster-profiles/{cluster-profile-id} | Delete a cluster profile
[**getClusterProfile**](ManagementPlaneApiNetworkTransportClusterProfilesApi.md#getClusterProfile) | **GET** /cluster-profiles/{cluster-profile-id} | Get cluster profile by Id
[**listClusterProfiles**](ManagementPlaneApiNetworkTransportClusterProfilesApi.md#listClusterProfiles) | **GET** /cluster-profiles | List Cluster Profiles
[**updateClusterProfile**](ManagementPlaneApiNetworkTransportClusterProfilesApi.md#updateClusterProfile) | **PUT** /cluster-profiles/{cluster-profile-id} | Update a cluster profile

<a name="createClusterProfile"></a>
# **createClusterProfile**
> ClusterProfile createClusterProfile(body)

Create a Cluster Profile

Create a cluster profile. The resource_type is required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportClusterProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportClusterProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportClusterProfilesApi();
ClusterProfile body = new ClusterProfile(); // ClusterProfile | 
try {
    ClusterProfile result = apiInstance.createClusterProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportClusterProfilesApi#createClusterProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterProfile**](ClusterProfile.md)|  |

### Return type

[**ClusterProfile**](ClusterProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClusterProfile"></a>
# **deleteClusterProfile**
> deleteClusterProfile(clusterProfileId)

Delete a cluster profile

Delete a specified cluster profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportClusterProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportClusterProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportClusterProfilesApi();
String clusterProfileId = "clusterProfileId_example"; // String | 
try {
    apiInstance.deleteClusterProfile(clusterProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportClusterProfilesApi#deleteClusterProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterProfile"></a>
# **getClusterProfile**
> ClusterProfile getClusterProfile(clusterProfileId)

Get cluster profile by Id

Returns information about a specified cluster profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportClusterProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportClusterProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportClusterProfilesApi();
String clusterProfileId = "clusterProfileId_example"; // String | 
try {
    ClusterProfile result = apiInstance.getClusterProfile(clusterProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportClusterProfilesApi#getClusterProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterProfileId** | **String**|  |

### Return type

[**ClusterProfile**](ClusterProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClusterProfiles"></a>
# **listClusterProfiles**
> ClusterProfileListResult listClusterProfiles(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy)

List Cluster Profiles

Returns paginated list of cluster profiles Cluster profiles define policies for edge cluster and bridge cluster. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportClusterProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportClusterProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportClusterProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean includeSystemOwned = true; // Boolean | Whether the list result contains system resources
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String resourceType = "resourceType_example"; // String | Supported cluster profiles.
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ClusterProfileListResult result = apiInstance.listClusterProfiles(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportClusterProfilesApi#listClusterProfiles");
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
 **resourceType** | **String**| Supported cluster profiles. | [optional] [enum: EdgeHighAvailabilityProfile, BridgeHighAvailabilityClusterProfile]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ClusterProfileListResult**](ClusterProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateClusterProfile"></a>
# **updateClusterProfile**
> ClusterProfile updateClusterProfile(body, clusterProfileId)

Update a cluster profile

Modifie a specified cluster profile. The body of the PUT request must include the resource_type. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportClusterProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportClusterProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportClusterProfilesApi();
ClusterProfile body = new ClusterProfile(); // ClusterProfile | 
String clusterProfileId = "clusterProfileId_example"; // String | 
try {
    ClusterProfile result = apiInstance.updateClusterProfile(body, clusterProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportClusterProfilesApi#updateClusterProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterProfile**](ClusterProfile.md)|  |
 **clusterProfileId** | **String**|  |

### Return type

[**ClusterProfile**](ClusterProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

