# ManagementPlaneApiMigrationUserInputsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDiscoveredSwitches**](ManagementPlaneApiMigrationUserInputsApi.md#getDiscoveredSwitches) | **GET** /migration/discovered-switches | Get the list of discovered switches (DVS, VSS)
[**getMigratedSwitches**](ManagementPlaneApiMigrationUserInputsApi.md#getMigratedSwitches) | **GET** /migration/migrated-switches | Get the list of migrated switches (DVS, VSS)
[**getMigrationSwitch**](ManagementPlaneApiMigrationUserInputsApi.md#getMigrationSwitch) | **GET** /migration/switch | Get the switch set as current scope for migration
[**setMigrationSwitch**](ManagementPlaneApiMigrationUserInputsApi.md#setMigrationSwitch) | **PUT** /migration/switch | Set the switch as current scope for migration

<a name="getDiscoveredSwitches"></a>
# **getDiscoveredSwitches**
> MigrationSwitchListResult getDiscoveredSwitches(cursor, includedFields, pageSize, sortAscending, sortBy)

Get the list of discovered switches (DVS, VSS)

Get the list of discovered switches (DVS, VSS) for the selected VC. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationUserInputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationUserInputsApi apiInstance = new ManagementPlaneApiMigrationUserInputsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MigrationSwitchListResult result = apiInstance.getDiscoveredSwitches(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationUserInputsApi#getDiscoveredSwitches");
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

[**MigrationSwitchListResult**](MigrationSwitchListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigratedSwitches"></a>
# **getMigratedSwitches**
> MigrationSwitchListResult getMigratedSwitches(cursor, includedFields, pageSize, sortAscending, sortBy)

Get the list of migrated switches (DVS, VSS)

Get the list of migrated switches (DVS, VSS) for the selected VC. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationUserInputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationUserInputsApi apiInstance = new ManagementPlaneApiMigrationUserInputsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MigrationSwitchListResult result = apiInstance.getMigratedSwitches(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationUserInputsApi#getMigratedSwitches");
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

[**MigrationSwitchListResult**](MigrationSwitchListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationSwitch"></a>
# **getMigrationSwitch**
> MigrationSwitchInfo getMigrationSwitch()

Get the switch set as current scope for migration

The user is returned the switch (DVS/VSS) set as current scope of migration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationUserInputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationUserInputsApi apiInstance = new ManagementPlaneApiMigrationUserInputsApi();
try {
    MigrationSwitchInfo result = apiInstance.getMigrationSwitch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationUserInputsApi#getMigrationSwitch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MigrationSwitchInfo**](MigrationSwitchInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setMigrationSwitch"></a>
# **setMigrationSwitch**
> MigrationSwitchInfo setMigrationSwitch(body)

Set the switch as current scope for migration

The user specifies a DVS / VSS as the current scope of migration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationUserInputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationUserInputsApi apiInstance = new ManagementPlaneApiMigrationUserInputsApi();
MigrationSwitchInfo body = new MigrationSwitchInfo(); // MigrationSwitchInfo | 
try {
    MigrationSwitchInfo result = apiInstance.setMigrationSwitch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationUserInputsApi#setMigrationSwitch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrationSwitchInfo**](MigrationSwitchInfo.md)|  |

### Return type

[**MigrationSwitchInfo**](MigrationSwitchInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

