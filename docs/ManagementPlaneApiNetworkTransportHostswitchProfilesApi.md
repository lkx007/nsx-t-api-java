# ManagementPlaneApiNetworkTransportHostswitchProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHostSwitchProfile**](ManagementPlaneApiNetworkTransportHostswitchProfilesApi.md#createHostSwitchProfile) | **POST** /host-switch-profiles | Create a Hostswitch Profile
[**deleteHostSwitchProfile**](ManagementPlaneApiNetworkTransportHostswitchProfilesApi.md#deleteHostSwitchProfile) | **DELETE** /host-switch-profiles/{host-switch-profile-id} | Delete a Hostswitch Profile
[**getHostSwitchProfile**](ManagementPlaneApiNetworkTransportHostswitchProfilesApi.md#getHostSwitchProfile) | **GET** /host-switch-profiles/{host-switch-profile-id} | Get a Hostswitch Profile by ID
[**listHostSwitchProfiles**](ManagementPlaneApiNetworkTransportHostswitchProfilesApi.md#listHostSwitchProfiles) | **GET** /host-switch-profiles | List Hostswitch Profiles
[**updateHostSwitchProfile**](ManagementPlaneApiNetworkTransportHostswitchProfilesApi.md#updateHostSwitchProfile) | **PUT** /host-switch-profiles/{host-switch-profile-id} | Update a Hostswitch Profile

<a name="createHostSwitchProfile"></a>
# **createHostSwitchProfile**
> BaseHostSwitchProfile createHostSwitchProfile(body)

Create a Hostswitch Profile

Creates a hostswitch profile. The resource_type is required. For uplink profiles, the teaming and policy parameters are required. By default, the mtu is 1600 and the transport_vlan is 0. The supported MTU range is 1280 through (uplink_mtu_threshold). (uplink_mtu_threshold) is 9000 by default. Range can be extended by modifying (uplink_mtu_threshold) in SwitchingGlobalConfig to the required upper threshold. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportHostswitchProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportHostswitchProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportHostswitchProfilesApi();
BaseHostSwitchProfile body = new BaseHostSwitchProfile(); // BaseHostSwitchProfile | 
try {
    BaseHostSwitchProfile result = apiInstance.createHostSwitchProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportHostswitchProfilesApi#createHostSwitchProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseHostSwitchProfile**](BaseHostSwitchProfile.md)|  |

### Return type

[**BaseHostSwitchProfile**](BaseHostSwitchProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHostSwitchProfile"></a>
# **deleteHostSwitchProfile**
> deleteHostSwitchProfile(hostSwitchProfileId)

Delete a Hostswitch Profile

Deletes a specified hostswitch profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportHostswitchProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportHostswitchProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportHostswitchProfilesApi();
String hostSwitchProfileId = "hostSwitchProfileId_example"; // String | 
try {
    apiInstance.deleteHostSwitchProfile(hostSwitchProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportHostswitchProfilesApi#deleteHostSwitchProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostSwitchProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHostSwitchProfile"></a>
# **getHostSwitchProfile**
> BaseHostSwitchProfile getHostSwitchProfile(hostSwitchProfileId)

Get a Hostswitch Profile by ID

Returns information about a specified hostswitch profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportHostswitchProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportHostswitchProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportHostswitchProfilesApi();
String hostSwitchProfileId = "hostSwitchProfileId_example"; // String | 
try {
    BaseHostSwitchProfile result = apiInstance.getHostSwitchProfile(hostSwitchProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportHostswitchProfilesApi#getHostSwitchProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostSwitchProfileId** | **String**|  |

### Return type

[**BaseHostSwitchProfile**](BaseHostSwitchProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listHostSwitchProfiles"></a>
# **listHostSwitchProfiles**
> HostSwitchProfilesListResult listHostSwitchProfiles(cursor, hostswitchProfileType, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, uplinkTeamingPolicyName)

List Hostswitch Profiles

Returns information about the configured hostswitch profiles. Hostswitch profiles define networking policies for hostswitches (sometimes referred to as bridges in OVS). Currently, only uplink teaming is supported. Uplink teaming allows NSX to load balance traffic across different physical NICs (PNICs) on the hypervisor hosts. Multiple teaming policies are supported, including LACP active, LACP passive, load balancing based on source ID, and failover order. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportHostswitchProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportHostswitchProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportHostswitchProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String hostswitchProfileType = "hostswitchProfileType_example"; // String | Supported HostSwitch profiles.
Boolean includeSystemOwned = true; // Boolean | Whether the list result contains system resources
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String uplinkTeamingPolicyName = "uplinkTeamingPolicyName_example"; // String | The host switch profile's uplink teaming policy name
try {
    HostSwitchProfilesListResult result = apiInstance.listHostSwitchProfiles(cursor, hostswitchProfileType, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, uplinkTeamingPolicyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportHostswitchProfilesApi#listHostSwitchProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **hostswitchProfileType** | **String**| Supported HostSwitch profiles. | [optional] [enum: UplinkHostSwitchProfile, LldpHostSwitchProfile, NiocProfile, ExtraConfigHostSwitchProfile]
 **includeSystemOwned** | **Boolean**| Whether the list result contains system resources | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **uplinkTeamingPolicyName** | **String**| The host switch profile&#x27;s uplink teaming policy name | [optional]

### Return type

[**HostSwitchProfilesListResult**](HostSwitchProfilesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateHostSwitchProfile"></a>
# **updateHostSwitchProfile**
> BaseHostSwitchProfile updateHostSwitchProfile(body, hostSwitchProfileId)

Update a Hostswitch Profile

Modifies a specified hostswitch profile. The body of the PUT request must include the resource_type. For uplink profiles, the put request must also include teaming parameters. Modifiable attributes include display_name, mtu, and transport_vlan. For uplink teaming policies, uplink_name and policy are also modifiable. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportHostswitchProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportHostswitchProfilesApi apiInstance = new ManagementPlaneApiNetworkTransportHostswitchProfilesApi();
BaseHostSwitchProfile body = new BaseHostSwitchProfile(); // BaseHostSwitchProfile | 
String hostSwitchProfileId = "hostSwitchProfileId_example"; // String | 
try {
    BaseHostSwitchProfile result = apiInstance.updateHostSwitchProfile(body, hostSwitchProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportHostswitchProfilesApi#updateHostSwitchProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseHostSwitchProfile**](BaseHostSwitchProfile.md)|  |
 **hostSwitchProfileId** | **String**|  |

### Return type

[**BaseHostSwitchProfile**](BaseHostSwitchProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

