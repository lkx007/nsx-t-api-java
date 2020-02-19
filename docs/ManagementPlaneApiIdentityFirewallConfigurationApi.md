# ManagementPlaneApiIdentityFirewallConfigurationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnabledComputeCollection**](ManagementPlaneApiIdentityFirewallConfigurationApi.md#getEnabledComputeCollection) | **GET** /idfw/idfw-compute-collections/{cc-ext-id} | Get IDFW compute collection.
[**getMasterSwitchSetting**](ManagementPlaneApiIdentityFirewallConfigurationApi.md#getMasterSwitchSetting) | **GET** /idfw/master-switch-setting | Get Identity Firewall master switch enabled/disabled
[**getStandaloneHostsSwitchSetting**](ManagementPlaneApiIdentityFirewallConfigurationApi.md#getStandaloneHostsSwitchSetting) | **GET** /idfw/standalone-host-switch-setting | Get Standalone hosts switch enabled/disabled
[**listEnabledComputeCollections**](ManagementPlaneApiIdentityFirewallConfigurationApi.md#listEnabledComputeCollections) | **GET** /idfw/idfw-compute-collections | List all Identity firewall compute collections
[**updateEnabledComputeCollection**](ManagementPlaneApiIdentityFirewallConfigurationApi.md#updateEnabledComputeCollection) | **PUT** /idfw/idfw-compute-collections/{cc-ext-id} | Update IDFW compute collection
[**updateMasterSwitchSetting**](ManagementPlaneApiIdentityFirewallConfigurationApi.md#updateMasterSwitchSetting) | **PUT** /idfw/master-switch-setting | Update IDFW master switch setting enabled/disabled
[**updateStandaloneHostsSwitchSetting**](ManagementPlaneApiIdentityFirewallConfigurationApi.md#updateStandaloneHostsSwitchSetting) | **PUT** /idfw/standalone-host-switch-setting | Update IDFW master switch setting enabled/disabled

<a name="getEnabledComputeCollection"></a>
# **getEnabledComputeCollection**
> IdfwEnabledComputeCollection getEnabledComputeCollection(ccExtId)

Get IDFW compute collection.

Get enable/disable status of individual compute collections for IDFW. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallConfigurationApi apiInstance = new ManagementPlaneApiIdentityFirewallConfigurationApi();
String ccExtId = "ccExtId_example"; // String | 
try {
    IdfwEnabledComputeCollection result = apiInstance.getEnabledComputeCollection(ccExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallConfigurationApi#getEnabledComputeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccExtId** | **String**|  |

### Return type

[**IdfwEnabledComputeCollection**](IdfwEnabledComputeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMasterSwitchSetting"></a>
# **getMasterSwitchSetting**
> IdfwMasterSwitchSetting getMasterSwitchSetting()

Get Identity Firewall master switch enabled/disabled

Fetches IDFW master switch setting to check whether master switch is enabled or disabled 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallConfigurationApi apiInstance = new ManagementPlaneApiIdentityFirewallConfigurationApi();
try {
    IdfwMasterSwitchSetting result = apiInstance.getMasterSwitchSetting();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallConfigurationApi#getMasterSwitchSetting");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IdfwMasterSwitchSetting**](IdfwMasterSwitchSetting.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStandaloneHostsSwitchSetting"></a>
# **getStandaloneHostsSwitchSetting**
> IdfwStandaloneHostsSwitchSetting getStandaloneHostsSwitchSetting()

Get Standalone hosts switch enabled/disabled

Fetches IDFW standalone hosts switch setting to check whether standalone hosts is enabled or disabled 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallConfigurationApi apiInstance = new ManagementPlaneApiIdentityFirewallConfigurationApi();
try {
    IdfwStandaloneHostsSwitchSetting result = apiInstance.getStandaloneHostsSwitchSetting();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallConfigurationApi#getStandaloneHostsSwitchSetting");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IdfwStandaloneHostsSwitchSetting**](IdfwStandaloneHostsSwitchSetting.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEnabledComputeCollections"></a>
# **listEnabledComputeCollections**
> IdfwEnabledComputeCollectionListResult listEnabledComputeCollections(cursor, includedFields, pageSize, sortAscending, sortBy)

List all Identity firewall compute collections

List all Identity firewall compute collections. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallConfigurationApi apiInstance = new ManagementPlaneApiIdentityFirewallConfigurationApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IdfwEnabledComputeCollectionListResult result = apiInstance.listEnabledComputeCollections(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallConfigurationApi#listEnabledComputeCollections");
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

[**IdfwEnabledComputeCollectionListResult**](IdfwEnabledComputeCollectionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEnabledComputeCollection"></a>
# **updateEnabledComputeCollection**
> IdfwEnabledComputeCollection updateEnabledComputeCollection(body, ccExtId)

Update IDFW compute collection

Enable/disable individual compute collections for IDFW. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallConfigurationApi apiInstance = new ManagementPlaneApiIdentityFirewallConfigurationApi();
IdfwEnabledComputeCollection body = new IdfwEnabledComputeCollection(); // IdfwEnabledComputeCollection | 
String ccExtId = "ccExtId_example"; // String | 
try {
    IdfwEnabledComputeCollection result = apiInstance.updateEnabledComputeCollection(body, ccExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallConfigurationApi#updateEnabledComputeCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdfwEnabledComputeCollection**](IdfwEnabledComputeCollection.md)|  |
 **ccExtId** | **String**|  |

### Return type

[**IdfwEnabledComputeCollection**](IdfwEnabledComputeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMasterSwitchSetting"></a>
# **updateMasterSwitchSetting**
> IdfwMasterSwitchSetting updateMasterSwitchSetting(body)

Update IDFW master switch setting enabled/disabled

Update Identity Firewall master switch setting (true&#x3D;enabled / false&#x3D;disabled). Identity Firewall master switch setting enables or disables Identity Firewall feature across the system.  It affects compute collections, hypervisor and virtual machines.  This operation is expensive and also has big impact and implication on system perforamce. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallConfigurationApi apiInstance = new ManagementPlaneApiIdentityFirewallConfigurationApi();
IdfwMasterSwitchSetting body = new IdfwMasterSwitchSetting(); // IdfwMasterSwitchSetting | 
try {
    IdfwMasterSwitchSetting result = apiInstance.updateMasterSwitchSetting(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallConfigurationApi#updateMasterSwitchSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdfwMasterSwitchSetting**](IdfwMasterSwitchSetting.md)|  |

### Return type

[**IdfwMasterSwitchSetting**](IdfwMasterSwitchSetting.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStandaloneHostsSwitchSetting"></a>
# **updateStandaloneHostsSwitchSetting**
> IdfwStandaloneHostsSwitchSetting updateStandaloneHostsSwitchSetting(body)

Update IDFW master switch setting enabled/disabled

Update Identity Firewall standalone hosts switch setting (true&#x3D;enabled / false&#x3D;disabled). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallConfigurationApi apiInstance = new ManagementPlaneApiIdentityFirewallConfigurationApi();
IdfwStandaloneHostsSwitchSetting body = new IdfwStandaloneHostsSwitchSetting(); // IdfwStandaloneHostsSwitchSetting | 
try {
    IdfwStandaloneHostsSwitchSetting result = apiInstance.updateStandaloneHostsSwitchSetting(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallConfigurationApi#updateStandaloneHostsSwitchSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdfwStandaloneHostsSwitchSetting**](IdfwStandaloneHostsSwitchSetting.md)|  |

### Return type

[**IdfwStandaloneHostsSwitchSetting**](IdfwStandaloneHostsSwitchSetting.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

