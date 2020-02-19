# ManagementPlaneApiMigrationMigrationunitsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMigrationUnit**](ManagementPlaneApiMigrationMigrationunitsApi.md#getMigrationUnit) | **GET** /migration/migration-units/{migration-unit-id} | Get a specific migration unit
[**getMigrationUnitAggregateInfo**](ManagementPlaneApiMigrationMigrationunitsApi.md#getMigrationUnitAggregateInfo) | **GET** /migration/migration-units/aggregate-info | Get migration units aggregate-info
[**getMigrationUnits**](ManagementPlaneApiMigrationMigrationunitsApi.md#getMigrationUnits) | **GET** /migration/migration-units | Get migration units
[**getMigrationUnitsStats**](ManagementPlaneApiMigrationMigrationunitsApi.md#getMigrationUnitsStats) | **GET** /migration/migration-units-stats | Get migration units stats

<a name="getMigrationUnit"></a>
# **getMigrationUnit**
> MigrationUnit getMigrationUnit(migrationUnitId)

Get a specific migration unit

Get a specific migration unit

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationMigrationunitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationMigrationunitsApi apiInstance = new ManagementPlaneApiMigrationMigrationunitsApi();
String migrationUnitId = "migrationUnitId_example"; // String | 
try {
    MigrationUnit result = apiInstance.getMigrationUnit(migrationUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationMigrationunitsApi#getMigrationUnit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationUnitId** | **String**|  |

### Return type

[**MigrationUnit**](MigrationUnit.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnitAggregateInfo"></a>
# **getMigrationUnitAggregateInfo**
> MigrationUnitAggregateInfoListResult getMigrationUnitAggregateInfo(componentType, cursor, groupId, hasErrors, includedFields, metadata, pageSize, selectionStatus, sortAscending, sortBy)

Get migration units aggregate-info

Get migration units aggregate-info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationMigrationunitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationMigrationunitsApi apiInstance = new ManagementPlaneApiMigrationMigrationunitsApi();
String componentType = "componentType_example"; // String | Component type based on which migration units to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String groupId = "groupId_example"; // String | Identifier of group based on which migration units to be filtered
Boolean hasErrors = true; // Boolean | Flag to indicate whether to return only migration units with errors
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String metadata = "metadata_example"; // String | Metadata about migration unit to filter on
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String selectionStatus = "selectionStatus_example"; // String | Flag to indicate whether to return only selected, only deselected or both type of migration units
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MigrationUnitAggregateInfoListResult result = apiInstance.getMigrationUnitAggregateInfo(componentType, cursor, groupId, hasErrors, includedFields, metadata, pageSize, selectionStatus, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationMigrationunitsApi#getMigrationUnitAggregateInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which migration units to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **groupId** | **String**| Identifier of group based on which migration units to be filtered | [optional]
 **hasErrors** | **Boolean**| Flag to indicate whether to return only migration units with errors | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **metadata** | **String**| Metadata about migration unit to filter on | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **selectionStatus** | **String**| Flag to indicate whether to return only selected, only deselected or both type of migration units | [optional] [enum: SELECTED, DESELECTED, ALL]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**MigrationUnitAggregateInfoListResult**](MigrationUnitAggregateInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnits"></a>
# **getMigrationUnits**
> MigrationUnitListResult getMigrationUnits(componentType, currentVersion, cursor, groupId, hasWarnings, includedFields, metadata, migrationUnitType, pageSize, sortAscending, sortBy)

Get migration units

Get migration units

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationMigrationunitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationMigrationunitsApi apiInstance = new ManagementPlaneApiMigrationMigrationunitsApi();
String componentType = "componentType_example"; // String | Component type based on which migration units to be filtered
String currentVersion = "currentVersion_example"; // String | Current version of migration unit based on which migration units to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String groupId = "groupId_example"; // String | UUID of group based on which migration units to be filtered
Boolean hasWarnings = true; // Boolean | Flag to indicate whether to return only migration units with warnings
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String metadata = "metadata_example"; // String | Metadata about migration unit to filter on
String migrationUnitType = "migrationUnitType_example"; // String | Migration unit type based on which migration units to be filtered
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MigrationUnitListResult result = apiInstance.getMigrationUnits(componentType, currentVersion, cursor, groupId, hasWarnings, includedFields, metadata, migrationUnitType, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationMigrationunitsApi#getMigrationUnits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which migration units to be filtered | [optional]
 **currentVersion** | **String**| Current version of migration unit based on which migration units to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **groupId** | **String**| UUID of group based on which migration units to be filtered | [optional]
 **hasWarnings** | **Boolean**| Flag to indicate whether to return only migration units with warnings | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **metadata** | **String**| Metadata about migration unit to filter on | [optional]
 **migrationUnitType** | **String**| Migration unit type based on which migration units to be filtered | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**MigrationUnitListResult**](MigrationUnitListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnitsStats"></a>
# **getMigrationUnitsStats**
> MigrationUnitTypeStatsList getMigrationUnitsStats(cursor, includedFields, pageSize, sortAscending, sortBy, sync)

Get migration units stats

Get migration units stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationMigrationunitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationMigrationunitsApi apiInstance = new ManagementPlaneApiMigrationMigrationunitsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
Boolean sync = true; // Boolean | Synchronize before returning migration unit stats
try {
    MigrationUnitTypeStatsList result = apiInstance.getMigrationUnitsStats(cursor, includedFields, pageSize, sortAscending, sortBy, sync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationMigrationunitsApi#getMigrationUnitsStats");
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
 **sync** | **Boolean**| Synchronize before returning migration unit stats | [optional]

### Return type

[**MigrationUnitTypeStatsList**](MigrationUnitTypeStatsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

