# ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDhcpRelayProfile**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi.md#createDhcpRelayProfile) | **POST** /dhcp/relay-profiles | Create a DHCP Relay Profile
[**deleteDhcpRelayProfile**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi.md#deleteDhcpRelayProfile) | **DELETE** /dhcp/relay-profiles/{relay-profile-id} | Delete a DHCP Relay Profile
[**listDhcpRelayProfiles**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi.md#listDhcpRelayProfiles) | **GET** /dhcp/relay-profiles | List All DHCP Relay Profiles
[**readDhcpRelayProfile**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi.md#readDhcpRelayProfile) | **GET** /dhcp/relay-profiles/{relay-profile-id} | Read a DHCP Relay Profile
[**updateDhcpRelayProfile**](ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi.md#updateDhcpRelayProfile) | **PUT** /dhcp/relay-profiles/{relay-profile-id} | Update a DHCP Relay Profile

<a name="createDhcpRelayProfile"></a>
# **createDhcpRelayProfile**
> DhcpRelayProfile createDhcpRelayProfile(body)

Create a DHCP Relay Profile

Creates a dhcp relay profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi();
DhcpRelayProfile body = new DhcpRelayProfile(); // DhcpRelayProfile | 
try {
    DhcpRelayProfile result = apiInstance.createDhcpRelayProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi#createDhcpRelayProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpRelayProfile**](DhcpRelayProfile.md)|  |

### Return type

[**DhcpRelayProfile**](DhcpRelayProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDhcpRelayProfile"></a>
# **deleteDhcpRelayProfile**
> deleteDhcpRelayProfile(relayProfileId)

Delete a DHCP Relay Profile

Deletes the specified dhcp relay profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi();
String relayProfileId = "relayProfileId_example"; // String | 
try {
    apiInstance.deleteDhcpRelayProfile(relayProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi#deleteDhcpRelayProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relayProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDhcpRelayProfiles"></a>
# **listDhcpRelayProfiles**
> DhcpRelayProfileListResult listDhcpRelayProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

List All DHCP Relay Profiles

Returns information about all dhcp relay profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DhcpRelayProfileListResult result = apiInstance.listDhcpRelayProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi#listDhcpRelayProfiles");
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

[**DhcpRelayProfileListResult**](DhcpRelayProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDhcpRelayProfile"></a>
# **readDhcpRelayProfile**
> DhcpRelayProfile readDhcpRelayProfile(relayProfileId)

Read a DHCP Relay Profile

Returns information about the specified dhcp relay profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi();
String relayProfileId = "relayProfileId_example"; // String | 
try {
    DhcpRelayProfile result = apiInstance.readDhcpRelayProfile(relayProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi#readDhcpRelayProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relayProfileId** | **String**|  |

### Return type

[**DhcpRelayProfile**](DhcpRelayProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDhcpRelayProfile"></a>
# **updateDhcpRelayProfile**
> DhcpRelayProfile updateDhcpRelayProfile(body, relayProfileId)

Update a DHCP Relay Profile

Modifies the specified dhcp relay profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi();
DhcpRelayProfile body = new DhcpRelayProfile(); // DhcpRelayProfile | 
String relayProfileId = "relayProfileId_example"; // String | 
try {
    DhcpRelayProfile result = apiInstance.updateDhcpRelayProfile(body, relayProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesDhcpRelayProfilesApi#updateDhcpRelayProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpRelayProfile**](DhcpRelayProfile.md)|  |
 **relayProfileId** | **String**|  |

### Return type

[**DhcpRelayProfile**](DhcpRelayProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

