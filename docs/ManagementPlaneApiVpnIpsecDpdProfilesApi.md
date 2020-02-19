# ManagementPlaneApiVpnIpsecDpdProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPSecVPNDPDProfile**](ManagementPlaneApiVpnIpsecDpdProfilesApi.md#createIPSecVPNDPDProfile) | **POST** /vpn/ipsec/dpd-profiles | Create dead peer detection (DPD) profile
[**deleteIPSecVPNDPDProfile**](ManagementPlaneApiVpnIpsecDpdProfilesApi.md#deleteIPSecVPNDPDProfile) | **DELETE** /vpn/ipsec/dpd-profiles/{ipsec-vpn-dpd-profile-id} | Delete dead peer detection (DPD) profile
[**getIPSecVPNDPDProfile**](ManagementPlaneApiVpnIpsecDpdProfilesApi.md#getIPSecVPNDPDProfile) | **GET** /vpn/ipsec/dpd-profiles/{ipsec-vpn-dpd-profile-id} | Get IPSec dead peer detection (DPD) profile
[**listIPSecVPNDPDProfiles**](ManagementPlaneApiVpnIpsecDpdProfilesApi.md#listIPSecVPNDPDProfiles) | **GET** /vpn/ipsec/dpd-profiles | Get IPSec dead peer detection (DPD)  profile list result
[**updateIPSecVPNDPDProfile**](ManagementPlaneApiVpnIpsecDpdProfilesApi.md#updateIPSecVPNDPDProfile) | **PUT** /vpn/ipsec/dpd-profiles/{ipsec-vpn-dpd-profile-id} | Edit IPSec dead peer detection (DPD) profile

<a name="createIPSecVPNDPDProfile"></a>
# **createIPSecVPNDPDProfile**
> IPSecVPNDPDProfile createIPSecVPNDPDProfile(body)

Create dead peer detection (DPD) profile

Create dead peer detection (DPD) profile. Any change in profile affects all sessions consuming this profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecDpdProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecDpdProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecDpdProfilesApi();
IPSecVPNDPDProfile body = new IPSecVPNDPDProfile(); // IPSecVPNDPDProfile | 
try {
    IPSecVPNDPDProfile result = apiInstance.createIPSecVPNDPDProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecDpdProfilesApi#createIPSecVPNDPDProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNDPDProfile**](IPSecVPNDPDProfile.md)|  |

### Return type

[**IPSecVPNDPDProfile**](IPSecVPNDPDProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIPSecVPNDPDProfile"></a>
# **deleteIPSecVPNDPDProfile**
> deleteIPSecVPNDPDProfile(ipsecVpnDpdProfileId, force)

Delete dead peer detection (DPD) profile

Delete dead peer detection (DPD) profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecDpdProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecDpdProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecDpdProfilesApi();
String ipsecVpnDpdProfileId = "ipsecVpnDpdProfileId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteIPSecVPNDPDProfile(ipsecVpnDpdProfileId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecDpdProfilesApi#deleteIPSecVPNDPDProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnDpdProfileId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIPSecVPNDPDProfile"></a>
# **getIPSecVPNDPDProfile**
> IPSecVPNDPDProfile getIPSecVPNDPDProfile(ipsecVpnDpdProfileId)

Get IPSec dead peer detection (DPD) profile

Get IPSec dead peer detection (DPD) profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecDpdProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecDpdProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecDpdProfilesApi();
String ipsecVpnDpdProfileId = "ipsecVpnDpdProfileId_example"; // String | 
try {
    IPSecVPNDPDProfile result = apiInstance.getIPSecVPNDPDProfile(ipsecVpnDpdProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecDpdProfilesApi#getIPSecVPNDPDProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipsecVpnDpdProfileId** | **String**|  |

### Return type

[**IPSecVPNDPDProfile**](IPSecVPNDPDProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPSecVPNDPDProfiles"></a>
# **listIPSecVPNDPDProfiles**
> IPSecVPNDPDProfileListResult listIPSecVPNDPDProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Get IPSec dead peer detection (DPD)  profile list result

Get paginated list of all dead peer detection (DPD) profiles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecDpdProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecDpdProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecDpdProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPSecVPNDPDProfileListResult result = apiInstance.listIPSecVPNDPDProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecDpdProfilesApi#listIPSecVPNDPDProfiles");
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

[**IPSecVPNDPDProfileListResult**](IPSecVPNDPDProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIPSecVPNDPDProfile"></a>
# **updateIPSecVPNDPDProfile**
> IPSecVPNDPDProfile updateIPSecVPNDPDProfile(body, ipsecVpnDpdProfileId)

Edit IPSec dead peer detection (DPD) profile

Edit IPSec dead peer detection (DPD) profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiVpnIpsecDpdProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiVpnIpsecDpdProfilesApi apiInstance = new ManagementPlaneApiVpnIpsecDpdProfilesApi();
IPSecVPNDPDProfile body = new IPSecVPNDPDProfile(); // IPSecVPNDPDProfile | 
String ipsecVpnDpdProfileId = "ipsecVpnDpdProfileId_example"; // String | 
try {
    IPSecVPNDPDProfile result = apiInstance.updateIPSecVPNDPDProfile(body, ipsecVpnDpdProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiVpnIpsecDpdProfilesApi#updateIPSecVPNDPDProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPSecVPNDPDProfile**](IPSecVPNDPDProfile.md)|  |
 **ipsecVpnDpdProfileId** | **String**|  |

### Return type

[**IPSecVPNDPDProfile**](IPSecVPNDPDProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

