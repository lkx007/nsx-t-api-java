# ManagementPlaneApiIdentityFirewallRealizationDataApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNsgroupVmDetails**](ManagementPlaneApiIdentityFirewallRealizationDataApi.md#getNsgroupVmDetails) | **GET** /idfw/nsgroup-vm-details/{group-id} | Get all IDFW NSGroup VM details for a given NSGroup
[**getSystemStats**](ManagementPlaneApiIdentityFirewallRealizationDataApi.md#getSystemStats) | **GET** /idfw/system-stats | Get IDFW system statistics data
[**getUserStats**](ManagementPlaneApiIdentityFirewallRealizationDataApi.md#getUserStats) | **GET** /idfw/user-stats/{user-id} | Get IDFW user login events for a given user
[**getVmStats**](ManagementPlaneApiIdentityFirewallRealizationDataApi.md#getVmStats) | **GET** /idfw/vm-stats/{vm-ext-id} | Get IDFW user login events for a given VM
[**listUserSessions**](ManagementPlaneApiIdentityFirewallRealizationDataApi.md#listUserSessions) | **GET** /idfw/user-session-data | Get user session data

<a name="getNsgroupVmDetails"></a>
# **getNsgroupVmDetails**
> IdfwNsgroupVmDetailListResult getNsgroupVmDetails(groupId)

Get all IDFW NSGroup VM details for a given NSGroup

Get all Identity Firewall NSGroup VM details for a given NSGroup.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallRealizationDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallRealizationDataApi apiInstance = new ManagementPlaneApiIdentityFirewallRealizationDataApi();
String groupId = "groupId_example"; // String | 
try {
    IdfwNsgroupVmDetailListResult result = apiInstance.getNsgroupVmDetails(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallRealizationDataApi#getNsgroupVmDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |

### Return type

[**IdfwNsgroupVmDetailListResult**](IdfwNsgroupVmDetailListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSystemStats"></a>
# **getSystemStats**
> IdfwSystemStats getSystemStats()

Get IDFW system statistics data

Get IDFW system statistics data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallRealizationDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallRealizationDataApi apiInstance = new ManagementPlaneApiIdentityFirewallRealizationDataApi();
try {
    IdfwSystemStats result = apiInstance.getSystemStats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallRealizationDataApi#getSystemStats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IdfwSystemStats**](IdfwSystemStats.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserStats"></a>
# **getUserStats**
> IdfwUserStats getUserStats(userId)

Get IDFW user login events for a given user

Get IDFW user login events for a given user (all active plus up to 5 most recent archived entries). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallRealizationDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallRealizationDataApi apiInstance = new ManagementPlaneApiIdentityFirewallRealizationDataApi();
String userId = "userId_example"; // String | 
try {
    IdfwUserStats result = apiInstance.getUserStats(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallRealizationDataApi#getUserStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**IdfwUserStats**](IdfwUserStats.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVmStats"></a>
# **getVmStats**
> IdfwVmStats getVmStats(vmExtId)

Get IDFW user login events for a given VM

Get IDFW user login events for a given VM (all active plus up to 5 most recent archived entries). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallRealizationDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallRealizationDataApi apiInstance = new ManagementPlaneApiIdentityFirewallRealizationDataApi();
String vmExtId = "vmExtId_example"; // String | 
try {
    IdfwVmStats result = apiInstance.getVmStats(vmExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallRealizationDataApi#getVmStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vmExtId** | **String**|  |

### Return type

[**IdfwVmStats**](IdfwVmStats.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUserSessions"></a>
# **listUserSessions**
> IdfwUserSessionDataAndMappings listUserSessions()

Get user session data

Get user session data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallRealizationDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallRealizationDataApi apiInstance = new ManagementPlaneApiIdentityFirewallRealizationDataApi();
try {
    IdfwUserSessionDataAndMappings result = apiInstance.listUserSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallRealizationDataApi#listUserSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IdfwUserSessionDataAndMappings**](IdfwUserSessionDataAndMappings.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

