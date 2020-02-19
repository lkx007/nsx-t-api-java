# ManagementPlaneApiVpnIpsecIkeProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPSecVPNIKEProfile**](ManagementPlaneApiVpnIpsecIkeProfilesApi.md#createIPSecVPNIKEProfile) | **POST** /vpn/ipsec/ike-profiles | Create custom internet key exchange (IKE) Profile
[**deleteIPSecVPNIKEProfile**](ManagementPlaneApiVpnIpsecIkeProfilesApi.md#deleteIPSecVPNIKEProfile) | **DELETE** /vpn/ipsec/ike-profiles/{ipsec-vpn-ike-profile-id} | Delete custom IKE Profile
[**getIPSecVPNIKEProfile**](ManagementPlaneApiVpnIpsecIkeProfilesApi.md#getIPSecVPNIKEProfile) | **GET** /vpn/ipsec/ike-profiles/{ipsec-vpn-ike-profile-id} | Get IKE Profile
[**listIPSecVPNIKEProfiles**](ManagementPlaneApiVpnIpsecIkeProfilesApi.md#listIPSecVPNIKEProfiles) | **GET** /vpn/ipsec/ike-profiles | List IKE profiles
[**updateIPSecVPNIKEProfile**](ManagementPlaneApiVpnIpsecIkeProfilesApi.md#updateIPSecVPNIKEProfile) | **PUT** /vpn/ipsec/ike-profiles/{ipsec-vpn-ike-profile-id} | Edit custom IKE Profile

<a name="createIPSecVPNIKEProfile"></a>
# **createIPSecVPNIKEProfile**
> IPSecVPNIKEProfile createIPSecVPNIKEProfile(body)

Create custom internet key exchange (IKE) Profile

Create custom internet key exchange (IKE) Profile. IKE Profile is a reusable profile that captures IKE and phase one negotiation parameters. System will be pre provisioned with system owned non editable default IKE profile and suggested set of profiles that can be used for peering with popular remote peers like AWS VPN. User can create custom profiles as needed. Any change in profile affects all sessions consuming this profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecIkeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecIkeProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecIkeProfilesApi();
IPSecVPNIKEProfile body = new IPSecVPNIKEProfile(); // IPSecVPNIKEProfile | 
try {
    IPSecVPNIKEProfile result = apiInstance.createIPSecVPNIKEProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecIkeProfilesApi#createIPSecVPNIKEProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNIKEProfile**](IPSecVPNIKEProfile.md)|  |

### Return type

[**IPSecVPNIKEProfile**](IPSecVPNIKEProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSecVPNIKEProfile"></a>
# **deleteIPSecVPNIKEProfile**
> deleteIPSecVPNIKEProfile(ipsecVpnIkeProfileId, force)

Delete custom IKE Profile

Delete custom IKE Profile. Profile can not be deleted if profile has references to it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecIkeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecIkeProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecIkeProfilesApi();
String ipsecVpnIkeProfileId = "ipsecVpnIkeProfileId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSecVPNIKEProfile(ipsecVpnIkeProfileId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecIkeProfilesApi#deleteIPSecVPNIKEProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnIkeProfileId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNIKEProfile"></a>
# **getIPSecVPNIKEProfile**
> IPSecVPNIKEProfile getIPSecVPNIKEProfile(ipsecVpnIkeProfileId)

Get IKE Profile

Get custom IKE Profile, given the particular id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecIkeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecIkeProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecIkeProfilesApi();
String ipsecVpnIkeProfileId = "ipsecVpnIkeProfileId_example"; // String | 
try {
    IPSecVPNIKEProfile result = apiInstance.getIPSecVPNIKEProfile(ipsecVpnIkeProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecIkeProfilesApi#getIPSecVPNIKEProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnIkeProfileId** | **String**|  |

### Return type

[**IPSecVPNIKEProfile**](IPSecVPNIKEProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPSecVPNIKEProfiles"></a>
# **listIPSecVPNIKEProfiles**
> IPSecVPNIKEProfileListResult listIPSecVPNIKEProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

List IKE profiles

Get paginated list of all IKE Profiles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecIkeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecIkeProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecIkeProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSecVPNIKEProfileListResult result = apiInstance.listIPSecVPNIKEProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecIkeProfilesApi#listIPSecVPNIKEProfiles");
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

[**IPSecVPNIKEProfileListResult**](IPSecVPNIKEProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSecVPNIKEProfile"></a>
# **updateIPSecVPNIKEProfile**
> IPSecVPNIKEProfile updateIPSecVPNIKEProfile(body, ipsecVpnIkeProfileId)

Edit custom IKE Profile

Edit custom IKE Profile. System owned profiles are non editable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecIkeProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecIkeProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecIkeProfilesApi();
IPSecVPNIKEProfile body = new IPSecVPNIKEProfile(); // IPSecVPNIKEProfile | 
String ipsecVpnIkeProfileId = "ipsecVpnIkeProfileId_example"; // String | 
try {
    IPSecVPNIKEProfile result = apiInstance.updateIPSecVPNIKEProfile(body, ipsecVpnIkeProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecIkeProfilesApi#updateIPSecVPNIKEProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNIKEProfile**](IPSecVPNIKEProfile.md)|  |
 **ipsecVpnIkeProfileId** | **String**|  |

### Return type

[**IPSecVPNIKEProfile**](IPSecVPNIKEProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

