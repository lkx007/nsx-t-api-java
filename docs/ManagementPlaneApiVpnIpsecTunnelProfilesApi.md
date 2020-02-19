# ManagementPlaneApiVpnIpsecTunnelProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPSecVPNTunnelProfile**](ManagementPlaneApiVpnIpsecTunnelProfilesApi.md#createIPSecVPNTunnelProfile) | **POST** /vpn/ipsec/tunnel-profiles | Create custom IPSec tunnel profile
[**deleteIPSecVPNTunnelProfile**](ManagementPlaneApiVpnIpsecTunnelProfilesApi.md#deleteIPSecVPNTunnelProfile) | **DELETE** /vpn/ipsec/tunnel-profiles/{ipsec-vpn-tunnel-profile-id} | Delete custom IPSecTunnelProfile
[**getIPSecVPNTunnelProfile**](ManagementPlaneApiVpnIpsecTunnelProfilesApi.md#getIPSecVPNTunnelProfile) | **GET** /vpn/ipsec/tunnel-profiles/{ipsec-vpn-tunnel-profile-id} | Get IPSec tunnel profile
[**listIPSecVPNTunnelProfiles**](ManagementPlaneApiVpnIpsecTunnelProfilesApi.md#listIPSecVPNTunnelProfiles) | **GET** /vpn/ipsec/tunnel-profiles | Get IPSecTunnelProfile List Result
[**updateIPSecVPNTunnelProfile**](ManagementPlaneApiVpnIpsecTunnelProfilesApi.md#updateIPSecVPNTunnelProfile) | **PUT** /vpn/ipsec/tunnel-profiles/{ipsec-vpn-tunnel-profile-id} | Edit custom IPSecTunnelProfile

<a name="createIPSecVPNTunnelProfile"></a>
# **createIPSecVPNTunnelProfile**
> IPSecVPNTunnelProfile createIPSecVPNTunnelProfile(body)

Create custom IPSec tunnel profile

Create custom IPSec tunnel profile. IPSec tunnel profile is a reusable profile that captures phase two negotiation parameters and tunnel properties. System will be provisioned with system owned non editable default IPSec tunnel profile. Any change in profile affects all sessions consuming this profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecTunnelProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecTunnelProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecTunnelProfilesApi();
IPSecVPNTunnelProfile body = new IPSecVPNTunnelProfile(); // IPSecVPNTunnelProfile | 
try {
    IPSecVPNTunnelProfile result = apiInstance.createIPSecVPNTunnelProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecTunnelProfilesApi#createIPSecVPNTunnelProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNTunnelProfile**](IPSecVPNTunnelProfile.md)|  |

### Return type

[**IPSecVPNTunnelProfile**](IPSecVPNTunnelProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSecVPNTunnelProfile"></a>
# **deleteIPSecVPNTunnelProfile**
> deleteIPSecVPNTunnelProfile(ipsecVpnTunnelProfileId, force)

Delete custom IPSecTunnelProfile

Delete custom IPSec Tunnel Profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecTunnelProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecTunnelProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecTunnelProfilesApi();
String ipsecVpnTunnelProfileId = "ipsecVpnTunnelProfileId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSecVPNTunnelProfile(ipsecVpnTunnelProfileId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecTunnelProfilesApi#deleteIPSecVPNTunnelProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnTunnelProfileId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNTunnelProfile"></a>
# **getIPSecVPNTunnelProfile**
> IPSecVPNTunnelProfile getIPSecVPNTunnelProfile(ipsecVpnTunnelProfileId)

Get IPSec tunnel profile

Get custom IPSec Tunnel Profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecTunnelProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecTunnelProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecTunnelProfilesApi();
String ipsecVpnTunnelProfileId = "ipsecVpnTunnelProfileId_example"; // String | 
try {
    IPSecVPNTunnelProfile result = apiInstance.getIPSecVPNTunnelProfile(ipsecVpnTunnelProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecTunnelProfilesApi#getIPSecVPNTunnelProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnTunnelProfileId** | **String**|  |

### Return type

[**IPSecVPNTunnelProfile**](IPSecVPNTunnelProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPSecVPNTunnelProfiles"></a>
# **listIPSecVPNTunnelProfiles**
> IPSecVPNTunnelProfileListResult listIPSecVPNTunnelProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Get IPSecTunnelProfile List Result

Get paginated list of all IPSecTunnelProfiles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecTunnelProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecTunnelProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecTunnelProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSecVPNTunnelProfileListResult result = apiInstance.listIPSecVPNTunnelProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecTunnelProfilesApi#listIPSecVPNTunnelProfiles");
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

[**IPSecVPNTunnelProfileListResult**](IPSecVPNTunnelProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSecVPNTunnelProfile"></a>
# **updateIPSecVPNTunnelProfile**
> IPSecVPNTunnelProfile updateIPSecVPNTunnelProfile(body, ipsecVpnTunnelProfileId)

Edit custom IPSecTunnelProfile

Edit custom IPSec Tunnel Profile. System owned profiles are non editable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecTunnelProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecTunnelProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecTunnelProfilesApi();
IPSecVPNTunnelProfile body = new IPSecVPNTunnelProfile(); // IPSecVPNTunnelProfile | 
String ipsecVpnTunnelProfileId = "ipsecVpnTunnelProfileId_example"; // String | 
try {
    IPSecVPNTunnelProfile result = apiInstance.updateIPSecVPNTunnelProfile(body, ipsecVpnTunnelProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecTunnelProfilesApi#updateIPSecVPNTunnelProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNTunnelProfile**](IPSecVPNTunnelProfile.md)|  |
 **ipsecVpnTunnelProfileId** | **String**|  |

### Return type

[**IPSecVPNTunnelProfile**](IPSecVPNTunnelProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

