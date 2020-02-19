# ManagementPlaneApiMigrationGroupApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMigrationUnitsToGroupAddMigrationUnits**](ManagementPlaneApiMigrationGroupApi.md#addMigrationUnitsToGroupAddMigrationUnits) | **POST** /migration/migration-unit-groups/{group-id}?action&#x3D;add_migration_units | Add migration units to specified migration unit group
[**createMigrationUnitGroup**](ManagementPlaneApiMigrationGroupApi.md#createMigrationUnitGroup) | **POST** /migration/migration-unit-groups | Create a group
[**deleteMigrationUnitGroup**](ManagementPlaneApiMigrationGroupApi.md#deleteMigrationUnitGroup) | **DELETE** /migration/migration-unit-groups/{group-id} | Delete the migration unit group
[**getMigrationUnitGroup**](ManagementPlaneApiMigrationGroupApi.md#getMigrationUnitGroup) | **GET** /migration/migration-unit-groups/{group-id} | Return migration unit group information
[**getMigrationUnitGroupAggregateInfo**](ManagementPlaneApiMigrationGroupApi.md#getMigrationUnitGroupAggregateInfo) | **GET** /migration/migration-unit-groups/aggregate-info | Return aggregate information of all migration unit groups
[**getMigrationUnitGroupStatus**](ManagementPlaneApiMigrationGroupApi.md#getMigrationUnitGroupStatus) | **GET** /migration/migration-unit-groups/{group-id}/status | Get migration status for group
[**getMigrationUnitGroups**](ManagementPlaneApiMigrationGroupApi.md#getMigrationUnitGroups) | **GET** /migration/migration-unit-groups | Return information of all migration unit groups
[**getMigrationUnitGroupsStatus**](ManagementPlaneApiMigrationGroupApi.md#getMigrationUnitGroupsStatus) | **GET** /migration/migration-unit-groups-status | Get migration status for migration unit groups
[**reorderMigrationUnitGroupReorder**](ManagementPlaneApiMigrationGroupApi.md#reorderMigrationUnitGroupReorder) | **POST** /migration/migration-unit-groups/{group-id}?action&#x3D;reorder | Reorder migration unit group
[**reorderMigrationUnitReorder**](ManagementPlaneApiMigrationGroupApi.md#reorderMigrationUnitReorder) | **POST** /migration/migration-unit-groups/{group-id}/migration-unit/{migration-unit-id}?action&#x3D;reorder | Reorder an migration unit within the migration unit group
[**updateMigrationUnitGroup**](ManagementPlaneApiMigrationGroupApi.md#updateMigrationUnitGroup) | **PUT** /migration/migration-unit-groups/{group-id} | Update the migration unit group

<a name="addMigrationUnitsToGroupAddMigrationUnits"></a>
# **addMigrationUnitsToGroupAddMigrationUnits**
> MigrationUnitList addMigrationUnitsToGroupAddMigrationUnits(body, groupId)

Add migration units to specified migration unit group

Add migration units to specified migration unit group. The migration units will be added at the end of the migration unit list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
MigrationUnitList body = new MigrationUnitList(); // MigrationUnitList | 
String groupId = "groupId_example"; // String | 
try {
    MigrationUnitList result = apiInstance.addMigrationUnitsToGroupAddMigrationUnits(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#addMigrationUnitsToGroupAddMigrationUnits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrationUnitList**](MigrationUnitList.md)|  |
 **groupId** | **String**|  |

### Return type

[**MigrationUnitList**](MigrationUnitList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMigrationUnitGroup"></a>
# **createMigrationUnitGroup**
> MigrationUnitGroup createMigrationUnitGroup(body)

Create a group

Create a group of migration units. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
MigrationUnitGroup body = new MigrationUnitGroup(); // MigrationUnitGroup | 
try {
    MigrationUnitGroup result = apiInstance.createMigrationUnitGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#createMigrationUnitGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrationUnitGroup**](MigrationUnitGroup.md)|  |

### Return type

[**MigrationUnitGroup**](MigrationUnitGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMigrationUnitGroup"></a>
# **deleteMigrationUnitGroup**
> deleteMigrationUnitGroup(groupId)

Delete the migration unit group

Delete the specified group. NOTE - A group can be deleted only if it is empty. If user tries to delete a group containing one or more migration units, the operation will fail and an error will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
String groupId = "groupId_example"; // String | 
try {
    apiInstance.deleteMigrationUnitGroup(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#deleteMigrationUnitGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnitGroup"></a>
# **getMigrationUnitGroup**
> MigrationUnitGroup getMigrationUnitGroup(groupId, summary)

Return migration unit group information

Returns information about a specific migration unit group in the migration plan.  If request parameter summary is set to true, then only count of migration units will be returned, migration units list will be empty. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
String groupId = "groupId_example"; // String | 
Boolean summary = true; // Boolean | Flag indicating whether to return the summary
try {
    MigrationUnitGroup result = apiInstance.getMigrationUnitGroup(groupId, summary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#getMigrationUnitGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **summary** | **Boolean**| Flag indicating whether to return the summary | [optional]

### Return type

[**MigrationUnitGroup**](MigrationUnitGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnitGroupAggregateInfo"></a>
# **getMigrationUnitGroupAggregateInfo**
> MigrationUnitGroupAggregateInfoListResult getMigrationUnitGroupAggregateInfo(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync)

Return aggregate information of all migration unit groups

Return information of all migration unit groups in the migration plan.  If request parameter summary is set to true, then only count of migration units will be returned, migration units list will be empty. If request parameter component type is specified, then all migration unit groups for that component will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
String componentType = "componentType_example"; // String | Component type based on which migration unit groups to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
Boolean summary = true; // Boolean | Flag indicating whether to return summary
Boolean sync = true; // Boolean | Synchronize before returning migration unit groups
try {
    MigrationUnitGroupAggregateInfoListResult result = apiInstance.getMigrationUnitGroupAggregateInfo(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#getMigrationUnitGroupAggregateInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which migration unit groups to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **summary** | **Boolean**| Flag indicating whether to return summary | [optional]
 **sync** | **Boolean**| Synchronize before returning migration unit groups | [optional]

### Return type

[**MigrationUnitGroupAggregateInfoListResult**](MigrationUnitGroupAggregateInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnitGroupStatus"></a>
# **getMigrationUnitGroupStatus**
> MigrationUnitStatusListResult getMigrationUnitGroupStatus(groupId, cursor, hasErrors, includedFields, pageSize, sortAscending, sortBy)

Get migration status for group

Get migration status for migration units in the specified group. User can specify whether to show only the migration units with errors. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
String groupId = "groupId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean hasErrors = true; // Boolean | Flag to indicate whether to return only migration units with errors
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MigrationUnitStatusListResult result = apiInstance.getMigrationUnitGroupStatus(groupId, cursor, hasErrors, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#getMigrationUnitGroupStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **hasErrors** | **Boolean**| Flag to indicate whether to return only migration units with errors | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**MigrationUnitStatusListResult**](MigrationUnitStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnitGroups"></a>
# **getMigrationUnitGroups**
> MigrationUnitGroupListResult getMigrationUnitGroups(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync)

Return information of all migration unit groups

Return information of all migration unit groups in the migration plan.  If request parameter summary is set to true, then only count of migration units will be returned, migration units list will be empty. If request parameter component type is specified, then all migration unit groups for that component will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
String componentType = "componentType_example"; // String | Component type based on which migration unit groups to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
Boolean summary = true; // Boolean | Flag indicating whether to return summary
Boolean sync = true; // Boolean | Synchronize before returning migration unit groups
try {
    MigrationUnitGroupListResult result = apiInstance.getMigrationUnitGroups(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#getMigrationUnitGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which migration unit groups to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **summary** | **Boolean**| Flag indicating whether to return summary | [optional]
 **sync** | **Boolean**| Synchronize before returning migration unit groups | [optional]

### Return type

[**MigrationUnitGroupListResult**](MigrationUnitGroupListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationUnitGroupsStatus"></a>
# **getMigrationUnitGroupsStatus**
> MigrationUnitGroupStatusListResult getMigrationUnitGroupsStatus(componentType, cursor, includedFields, pageSize, sortAscending, sortBy)

Get migration status for migration unit groups

Get migration status for migration unit groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
String componentType = "componentType_example"; // String | Component type based on which migration unit groups to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MigrationUnitGroupStatusListResult result = apiInstance.getMigrationUnitGroupsStatus(componentType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#getMigrationUnitGroupsStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which migration unit groups to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**MigrationUnitGroupStatusListResult**](MigrationUnitGroupStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reorderMigrationUnitGroupReorder"></a>
# **reorderMigrationUnitGroupReorder**
> reorderMigrationUnitGroupReorder(body, groupId)

Reorder migration unit group

Reorder an migration unit group by placing it before/after the specified migration unit group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
ReorderMigrationRequest body = new ReorderMigrationRequest(); // ReorderMigrationRequest | 
String groupId = "groupId_example"; // String | 
try {
    apiInstance.reorderMigrationUnitGroupReorder(body, groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#reorderMigrationUnitGroupReorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReorderMigrationRequest**](ReorderMigrationRequest.md)|  |
 **groupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reorderMigrationUnitReorder"></a>
# **reorderMigrationUnitReorder**
> reorderMigrationUnitReorder(body, groupId, migrationUnitId)

Reorder an migration unit within the migration unit group

Reorder an migration unit within the migration unit group by placing it before/after the specified migration unit 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
ReorderMigrationRequest body = new ReorderMigrationRequest(); // ReorderMigrationRequest | 
String groupId = "groupId_example"; // String | 
String migrationUnitId = "migrationUnitId_example"; // String | 
try {
    apiInstance.reorderMigrationUnitReorder(body, groupId, migrationUnitId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#reorderMigrationUnitReorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReorderMigrationRequest**](ReorderMigrationRequest.md)|  |
 **groupId** | **String**|  |
 **migrationUnitId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMigrationUnitGroup"></a>
# **updateMigrationUnitGroup**
> MigrationUnitGroup updateMigrationUnitGroup(body, groupId)

Update the migration unit group

Update the specified migration unit group. Removal of migration units from the group using this is not allowed. An error will be returned in that case. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationGroupApi apiInstance = new ManagementPlaneApiMigrationGroupApi();
MigrationUnitGroup body = new MigrationUnitGroup(); // MigrationUnitGroup | 
String groupId = "groupId_example"; // String | 
try {
    MigrationUnitGroup result = apiInstance.updateMigrationUnitGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationGroupApi#updateMigrationUnitGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrationUnitGroup**](MigrationUnitGroup.md)|  |
 **groupId** | **String**|  |

### Return type

[**MigrationUnitGroup**](MigrationUnitGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

