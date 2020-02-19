# ManagementPlaneApiUpgradeUpgradeUnitsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUpgradeUnit**](ManagementPlaneApiUpgradeUpgradeUnitsApi.md#getUpgradeUnit) | **GET** /upgrade/upgrade-units/{upgrade-unit-id} | Get a specific upgrade unit
[**getUpgradeUnitAggregateInfo**](ManagementPlaneApiUpgradeUpgradeUnitsApi.md#getUpgradeUnitAggregateInfo) | **GET** /upgrade/upgrade-units/aggregate-info | Get upgrade units aggregate-info
[**getUpgradeUnits**](ManagementPlaneApiUpgradeUpgradeUnitsApi.md#getUpgradeUnits) | **GET** /upgrade/upgrade-units | Get upgrade units
[**getUpgradeUnitsStats**](ManagementPlaneApiUpgradeUpgradeUnitsApi.md#getUpgradeUnitsStats) | **GET** /upgrade/upgrade-units-stats | Get upgrade units stats

<a name="getUpgradeUnit"></a>
# **getUpgradeUnit**
> UpgradeUnit getUpgradeUnit(upgradeUnitId)

Get a specific upgrade unit

Get a specific upgrade unit

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeUpgradeUnitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeUpgradeUnitsApi apiInstance = new ManagementPlaneApiUpgradeUpgradeUnitsApi();
String upgradeUnitId = "upgradeUnitId_example"; // String | 
try {
    UpgradeUnit result = apiInstance.getUpgradeUnit(upgradeUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeUpgradeUnitsApi#getUpgradeUnit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upgradeUnitId** | **String**|  |

### Return type

[**UpgradeUnit**](UpgradeUnit.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeUnitAggregateInfo"></a>
# **getUpgradeUnitAggregateInfo**
> UpgradeUnitAggregateInfoListResult getUpgradeUnitAggregateInfo(componentType, cursor, groupId, hasErrors, includedFields, metadata, pageSize, selectionStatus, sortAscending, sortBy, upgradeUnitDisplayName)

Get upgrade units aggregate-info

Get upgrade units aggregate-info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeUpgradeUnitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeUpgradeUnitsApi apiInstance = new ManagementPlaneApiUpgradeUpgradeUnitsApi();
String componentType = "componentType_example"; // String | Component type based on which upgrade units to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String groupId = "groupId_example"; // String | Identifier of group based on which upgrade units to be filtered
Boolean hasErrors = true; // Boolean | Flag to indicate whether to return only upgrade units with errors
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String metadata = "metadata_example"; // String | Metadata about upgrade unit to filter on
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String selectionStatus = "selectionStatus_example"; // String | Flag to indicate whether to return only selected, only deselected or both type of upgrade units
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String upgradeUnitDisplayName = "upgradeUnitDisplayName_example"; // String | Display name of upgrade unit
try {
    UpgradeUnitAggregateInfoListResult result = apiInstance.getUpgradeUnitAggregateInfo(componentType, cursor, groupId, hasErrors, includedFields, metadata, pageSize, selectionStatus, sortAscending, sortBy, upgradeUnitDisplayName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeUpgradeUnitsApi#getUpgradeUnitAggregateInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which upgrade units to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **groupId** | **String**| Identifier of group based on which upgrade units to be filtered | [optional]
 **hasErrors** | **Boolean**| Flag to indicate whether to return only upgrade units with errors | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **metadata** | **String**| Metadata about upgrade unit to filter on | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **selectionStatus** | **String**| Flag to indicate whether to return only selected, only deselected or both type of upgrade units | [optional] [enum: SELECTED, DESELECTED, ALL]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **upgradeUnitDisplayName** | **String**| Display name of upgrade unit | [optional]

### Return type

[**UpgradeUnitAggregateInfoListResult**](UpgradeUnitAggregateInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeUnits"></a>
# **getUpgradeUnits**
> UpgradeUnitListResult getUpgradeUnits(componentType, currentVersion, cursor, groupId, hasWarnings, includedFields, metadata, pageSize, sortAscending, sortBy, upgradeUnitType)

Get upgrade units

Get upgrade units

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeUpgradeUnitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeUpgradeUnitsApi apiInstance = new ManagementPlaneApiUpgradeUpgradeUnitsApi();
String componentType = "componentType_example"; // String | Component type based on which upgrade units to be filtered
String currentVersion = "currentVersion_example"; // String | Current version of upgrade unit based on which upgrade units to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String groupId = "groupId_example"; // String | UUID of group based on which upgrade units to be filtered
Boolean hasWarnings = true; // Boolean | Flag to indicate whether to return only upgrade units with warnings
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String metadata = "metadata_example"; // String | Metadata about upgrade unit to filter on
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String upgradeUnitType = "upgradeUnitType_example"; // String | Upgrade unit type based on which upgrade units to be filtered
try {
    UpgradeUnitListResult result = apiInstance.getUpgradeUnits(componentType, currentVersion, cursor, groupId, hasWarnings, includedFields, metadata, pageSize, sortAscending, sortBy, upgradeUnitType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeUpgradeUnitsApi#getUpgradeUnits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which upgrade units to be filtered | [optional]
 **currentVersion** | **String**| Current version of upgrade unit based on which upgrade units to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **groupId** | **String**| UUID of group based on which upgrade units to be filtered | [optional]
 **hasWarnings** | **Boolean**| Flag to indicate whether to return only upgrade units with warnings | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **metadata** | **String**| Metadata about upgrade unit to filter on | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **upgradeUnitType** | **String**| Upgrade unit type based on which upgrade units to be filtered | [optional]

### Return type

[**UpgradeUnitListResult**](UpgradeUnitListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeUnitsStats"></a>
# **getUpgradeUnitsStats**
> UpgradeUnitTypeStatsList getUpgradeUnitsStats(cursor, includedFields, pageSize, sortAscending, sortBy, sync)

Get upgrade units stats

Get upgrade units stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeUpgradeUnitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeUpgradeUnitsApi apiInstance = new ManagementPlaneApiUpgradeUpgradeUnitsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
Boolean sync = true; // Boolean | Synchronize before returning upgrade unit stats
try {
    UpgradeUnitTypeStatsList result = apiInstance.getUpgradeUnitsStats(cursor, includedFields, pageSize, sortAscending, sortBy, sync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeUpgradeUnitsApi#getUpgradeUnitsStats");
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
 **sync** | **Boolean**| Synchronize before returning upgrade unit stats | [optional]

### Return type

[**UpgradeUnitTypeStatsList**](UpgradeUnitTypeStatsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

