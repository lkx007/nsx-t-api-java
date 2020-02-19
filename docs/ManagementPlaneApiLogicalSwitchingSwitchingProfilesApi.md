# ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSwitchingProfile**](ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi.md#createSwitchingProfile) | **POST** /switching-profiles | Create a Switching Profile
[**deleteSwitchingProfile**](ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi.md#deleteSwitchingProfile) | **DELETE** /switching-profiles/{switching-profile-id} | Delete a Switching Profile
[**getSwitchingProfile**](ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi.md#getSwitchingProfile) | **GET** /switching-profiles/{switching-profile-id} | Get Switching Profile by ID
[**getSwitchingProfileStatus**](ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi.md#getSwitchingProfileStatus) | **GET** /switching-profiles/{switching-profile-id}/summary | Get Counts of Ports and Switches Using This Switching Profile
[**listSwitchingProfiles**](ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi.md#listSwitchingProfiles) | **GET** /switching-profiles | List Switching Profiles
[**updateSwitchingProfile**](ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi.md#updateSwitchingProfile) | **PUT** /switching-profiles/{switching-profile-id} | Update a Switching Profile

<a name="createSwitchingProfile"></a>
# **createSwitchingProfile**
> BaseSwitchingProfile createSwitchingProfile(body)

Create a Switching Profile

Creates a new, custom qos, port-mirroring, spoof-guard or port-security switching profile. You can override their default switching profile assignments by creating a new switching profile and assigning it to one or more logical switches. You cannot override the default ipfix or ip_discovery switching profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi apiInstance = new ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi();
BaseSwitchingProfile body = new BaseSwitchingProfile(); // BaseSwitchingProfile | 
try {
    BaseSwitchingProfile result = apiInstance.createSwitchingProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi#createSwitchingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseSwitchingProfile**](BaseSwitchingProfile.md)|  |

### Return type

[**BaseSwitchingProfile**](BaseSwitchingProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSwitchingProfile"></a>
# **deleteSwitchingProfile**
> deleteSwitchingProfile(switchingProfileId, unbind)

Delete a Switching Profile

Deletes the specified switching profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi apiInstance = new ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi();
String switchingProfileId = "switchingProfileId_example"; // String | 
Boolean unbind = true; // Boolean | force unbinding of logical switches and ports from a switching profile
try {
    apiInstance.deleteSwitchingProfile(switchingProfileId, unbind);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi#deleteSwitchingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **switchingProfileId** | **String**|  |
 **unbind** | **Boolean**| force unbinding of logical switches and ports from a switching profile | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSwitchingProfile"></a>
# **getSwitchingProfile**
> BaseSwitchingProfile getSwitchingProfile(switchingProfileId)

Get Switching Profile by ID

Returns information about a specified switching profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi apiInstance = new ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi();
String switchingProfileId = "switchingProfileId_example"; // String | 
try {
    BaseSwitchingProfile result = apiInstance.getSwitchingProfile(switchingProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi#getSwitchingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **switchingProfileId** | **String**|  |

### Return type

[**BaseSwitchingProfile**](BaseSwitchingProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSwitchingProfileStatus"></a>
# **getSwitchingProfileStatus**
> SwitchingProfileStatus getSwitchingProfileStatus(switchingProfileId)

Get Counts of Ports and Switches Using This Switching Profile

Get Counts of Ports and Switches Using This Switching Profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi apiInstance = new ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi();
String switchingProfileId = "switchingProfileId_example"; // String | 
try {
    SwitchingProfileStatus result = apiInstance.getSwitchingProfileStatus(switchingProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi#getSwitchingProfileStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **switchingProfileId** | **String**|  |

### Return type

[**SwitchingProfileStatus**](SwitchingProfileStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSwitchingProfiles"></a>
# **listSwitchingProfiles**
> SwitchingProfilesListResult listSwitchingProfiles(cursor, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, switchingProfileType)

List Switching Profiles

Returns information about the system-default and user-configured switching profiles. Each switching profile has a unique ID, a display name, and various other read-only and configurable properties. The default switching profiles are assigned automatically to each switch. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi apiInstance = new ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean includeSystemOwned = true; // Boolean | Whether the list result contains system resources
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String switchingProfileType = "switchingProfileType_example"; // String | comma-separated list of switching profile types, e.g. ?switching_profile_type=QosSwitchingProfile,IpDiscoverySwitchingProfile
try {
    SwitchingProfilesListResult result = apiInstance.listSwitchingProfiles(cursor, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, switchingProfileType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi#listSwitchingProfiles");
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
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **switchingProfileType** | **String**| comma-separated list of switching profile types, e.g. ?switching_profile_type&#x3D;QosSwitchingProfile,IpDiscoverySwitchingProfile | [optional]

### Return type

[**SwitchingProfilesListResult**](SwitchingProfilesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSwitchingProfile"></a>
# **updateSwitchingProfile**
> BaseSwitchingProfile updateSwitchingProfile(body, switchingProfileId)

Update a Switching Profile

Updates the user-configurable parameters of a switching profile. Only the qos, port-mirroring, spoof-guard and port-security switching profiles can be modified. You cannot modify the ipfix or ip-discovery switching profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi apiInstance = new ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi();
BaseSwitchingProfile body = new BaseSwitchingProfile(); // BaseSwitchingProfile | 
String switchingProfileId = "switchingProfileId_example"; // String | 
try {
    BaseSwitchingProfile result = apiInstance.updateSwitchingProfile(body, switchingProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi#updateSwitchingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseSwitchingProfile**](BaseSwitchingProfile.md)|  |
 **switchingProfileId** | **String**|  |

### Return type

[**BaseSwitchingProfile**](BaseSwitchingProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

