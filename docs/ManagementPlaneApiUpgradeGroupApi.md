# ManagementPlaneApiUpgradeGroupApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUpgradeUnitsToGroupAddUpgradeUnits**](ManagementPlaneApiUpgradeGroupApi.md#addUpgradeUnitsToGroupAddUpgradeUnits) | **POST** /upgrade/upgrade-unit-groups/{group-id}?action&#x3D;add_upgrade_units | Add upgrade units to specified upgrade unit group
[**createUpgradeUnitGroup**](ManagementPlaneApiUpgradeGroupApi.md#createUpgradeUnitGroup) | **POST** /upgrade/upgrade-unit-groups | Create a group
[**deleteUpgradeUnitGroup**](ManagementPlaneApiUpgradeGroupApi.md#deleteUpgradeUnitGroup) | **DELETE** /upgrade/upgrade-unit-groups/{group-id} | Delete the upgrade unit group
[**getUpgradeUnitGroup**](ManagementPlaneApiUpgradeGroupApi.md#getUpgradeUnitGroup) | **GET** /upgrade/upgrade-unit-groups/{group-id} | Return upgrade unit group information
[**getUpgradeUnitGroupAggregateInfo**](ManagementPlaneApiUpgradeGroupApi.md#getUpgradeUnitGroupAggregateInfo) | **GET** /upgrade/upgrade-unit-groups/aggregate-info | Return aggregate information of all upgrade unit groups
[**getUpgradeUnitGroupStatus**](ManagementPlaneApiUpgradeGroupApi.md#getUpgradeUnitGroupStatus) | **GET** /upgrade/upgrade-unit-groups/{group-id}/status | Get upgrade status for group
[**getUpgradeUnitGroups**](ManagementPlaneApiUpgradeGroupApi.md#getUpgradeUnitGroups) | **GET** /upgrade/upgrade-unit-groups | Return information of all upgrade unit groups
[**getUpgradeUnitGroupsStatus**](ManagementPlaneApiUpgradeGroupApi.md#getUpgradeUnitGroupsStatus) | **GET** /upgrade/upgrade-unit-groups-status | Get upgrade status for upgrade unit groups
[**reorderUpgradeUnitGroupReorder**](ManagementPlaneApiUpgradeGroupApi.md#reorderUpgradeUnitGroupReorder) | **POST** /upgrade/upgrade-unit-groups/{group-id}?action&#x3D;reorder | Reorder upgrade unit group
[**reorderUpgradeUnitReorder**](ManagementPlaneApiUpgradeGroupApi.md#reorderUpgradeUnitReorder) | **POST** /upgrade/upgrade-unit-groups/{group-id}/upgrade-unit/{upgrade-unit-id}?action&#x3D;reorder | Reorder an upgrade unit within the upgrade unit group
[**updateUpgradeUnitGroup**](ManagementPlaneApiUpgradeGroupApi.md#updateUpgradeUnitGroup) | **PUT** /upgrade/upgrade-unit-groups/{group-id} | Update the upgrade unit group

<a name="addUpgradeUnitsToGroupAddUpgradeUnits"></a>
# **addUpgradeUnitsToGroupAddUpgradeUnits**
> UpgradeUnitList addUpgradeUnitsToGroupAddUpgradeUnits(body, groupId)

Add upgrade units to specified upgrade unit group

Add upgrade units to specified upgrade unit group. The upgrade units will be added at the end of the upgrade unit list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
UpgradeUnitList body = new UpgradeUnitList(); // UpgradeUnitList | 
String groupId = "groupId_example"; // String | 
try {
    UpgradeUnitList result = apiInstance.addUpgradeUnitsToGroupAddUpgradeUnits(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#addUpgradeUnitsToGroupAddUpgradeUnits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpgradeUnitList**](UpgradeUnitList.md)|  |
 **groupId** | **String**|  |

### Return type

[**UpgradeUnitList**](UpgradeUnitList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUpgradeUnitGroup"></a>
# **createUpgradeUnitGroup**
> UpgradeUnitGroup createUpgradeUnitGroup(body)

Create a group

Create a group of upgrade units. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
UpgradeUnitGroup body = new UpgradeUnitGroup(); // UpgradeUnitGroup | 
try {
    UpgradeUnitGroup result = apiInstance.createUpgradeUnitGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#createUpgradeUnitGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpgradeUnitGroup**](UpgradeUnitGroup.md)|  |

### Return type

[**UpgradeUnitGroup**](UpgradeUnitGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUpgradeUnitGroup"></a>
# **deleteUpgradeUnitGroup**
> deleteUpgradeUnitGroup(groupId)

Delete the upgrade unit group

Delete the specified group. NOTE - A group can be deleted only if it is empty. If user tries to delete a group containing one or more upgrade units, the operation will fail and an error will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
String groupId = "groupId_example"; // String | 
try {
    apiInstance.deleteUpgradeUnitGroup(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#deleteUpgradeUnitGroup");
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

<a name="getUpgradeUnitGroup"></a>
# **getUpgradeUnitGroup**
> UpgradeUnitGroup getUpgradeUnitGroup(groupId, summary)

Return upgrade unit group information

Returns information about a specific upgrade unit group in the upgrade plan.  If request parameter summary is set to true, then only count of upgrade units will be returned, upgrade units list will be empty. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
String groupId = "groupId_example"; // String | 
Boolean summary = true; // Boolean | Flag indicating whether to return the summary
try {
    UpgradeUnitGroup result = apiInstance.getUpgradeUnitGroup(groupId, summary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#getUpgradeUnitGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **summary** | **Boolean**| Flag indicating whether to return the summary | [optional]

### Return type

[**UpgradeUnitGroup**](UpgradeUnitGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeUnitGroupAggregateInfo"></a>
# **getUpgradeUnitGroupAggregateInfo**
> UpgradeUnitGroupAggregateInfoListResult getUpgradeUnitGroupAggregateInfo(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync)

Return aggregate information of all upgrade unit groups

Return information of all upgrade unit groups in the upgrade plan.  If request parameter summary is set to true, then only count of upgrade units will be returned, upgrade units list will be empty. If request parameter component type is specified, then all upgrade unit groups for that component will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
String componentType = "componentType_example"; // String | Component type based on which upgrade unit groups to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
Boolean summary = true; // Boolean | Flag indicating whether to return summary
Boolean sync = true; // Boolean | Synchronize before returning upgrade unit groups
try {
    UpgradeUnitGroupAggregateInfoListResult result = apiInstance.getUpgradeUnitGroupAggregateInfo(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#getUpgradeUnitGroupAggregateInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which upgrade unit groups to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **summary** | **Boolean**| Flag indicating whether to return summary | [optional]
 **sync** | **Boolean**| Synchronize before returning upgrade unit groups | [optional]

### Return type

[**UpgradeUnitGroupAggregateInfoListResult**](UpgradeUnitGroupAggregateInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeUnitGroupStatus"></a>
# **getUpgradeUnitGroupStatus**
> UpgradeUnitStatusListResult getUpgradeUnitGroupStatus(groupId, cursor, hasErrors, includedFields, pageSize, sortAscending, sortBy)

Get upgrade status for group

Get upgrade status for upgrade units in the specified group. User can specify whether to show only the upgrade units with errors. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
String groupId = "groupId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean hasErrors = true; // Boolean | Flag to indicate whether to return only upgrade units with errors
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    UpgradeUnitStatusListResult result = apiInstance.getUpgradeUnitGroupStatus(groupId, cursor, hasErrors, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#getUpgradeUnitGroupStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **hasErrors** | **Boolean**| Flag to indicate whether to return only upgrade units with errors | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**UpgradeUnitStatusListResult**](UpgradeUnitStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeUnitGroups"></a>
# **getUpgradeUnitGroups**
> UpgradeUnitGroupListResult getUpgradeUnitGroups(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync)

Return information of all upgrade unit groups

Return information of all upgrade unit groups in the upgrade plan.  If request parameter summary is set to true, then only count of upgrade units will be returned, upgrade units list will be empty. If request parameter component type is specified, then all upgrade unit groups for that component will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
String componentType = "componentType_example"; // String | Component type based on which upgrade unit groups to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
Boolean summary = true; // Boolean | Flag indicating whether to return summary
Boolean sync = true; // Boolean | Synchronize before returning upgrade unit groups
try {
    UpgradeUnitGroupListResult result = apiInstance.getUpgradeUnitGroups(componentType, cursor, includedFields, pageSize, sortAscending, sortBy, summary, sync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#getUpgradeUnitGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which upgrade unit groups to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **summary** | **Boolean**| Flag indicating whether to return summary | [optional]
 **sync** | **Boolean**| Synchronize before returning upgrade unit groups | [optional]

### Return type

[**UpgradeUnitGroupListResult**](UpgradeUnitGroupListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeUnitGroupsStatus"></a>
# **getUpgradeUnitGroupsStatus**
> UpgradeUnitGroupStatusListResult getUpgradeUnitGroupsStatus(componentType, cursor, includedFields, pageSize, sortAscending, sortBy)

Get upgrade status for upgrade unit groups

Get upgrade status for upgrade unit groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
String componentType = "componentType_example"; // String | Component type on which the action is performed or on which the results are filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    UpgradeUnitGroupStatusListResult result = apiInstance.getUpgradeUnitGroupsStatus(componentType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#getUpgradeUnitGroupsStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type on which the action is performed or on which the results are filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**UpgradeUnitGroupStatusListResult**](UpgradeUnitGroupStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reorderUpgradeUnitGroupReorder"></a>
# **reorderUpgradeUnitGroupReorder**
> reorderUpgradeUnitGroupReorder(body, groupId)

Reorder upgrade unit group

Reorder an upgrade unit group by placing it before/after the specified upgrade unit group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
ReorderRequest body = new ReorderRequest(); // ReorderRequest | 
String groupId = "groupId_example"; // String | 
try {
    apiInstance.reorderUpgradeUnitGroupReorder(body, groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#reorderUpgradeUnitGroupReorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReorderRequest**](ReorderRequest.md)|  |
 **groupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reorderUpgradeUnitReorder"></a>
# **reorderUpgradeUnitReorder**
> reorderUpgradeUnitReorder(body, groupId, upgradeUnitId)

Reorder an upgrade unit within the upgrade unit group

Reorder an upgrade unit within the upgrade unit group by placing it before/after the specified upgrade unit 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
ReorderRequest body = new ReorderRequest(); // ReorderRequest | 
String groupId = "groupId_example"; // String | 
String upgradeUnitId = "upgradeUnitId_example"; // String | 
try {
    apiInstance.reorderUpgradeUnitReorder(body, groupId, upgradeUnitId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#reorderUpgradeUnitReorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReorderRequest**](ReorderRequest.md)|  |
 **groupId** | **String**|  |
 **upgradeUnitId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUpgradeUnitGroup"></a>
# **updateUpgradeUnitGroup**
> UpgradeUnitGroup updateUpgradeUnitGroup(body, groupId)

Update the upgrade unit group

Update the specified upgrade unit group. Removal of upgrade units from the group using this is not allowed. An error will be returned in that case. Following extended_configuration is supported:  Key: upgrade_mode Supported values: maintenance_mode,in_place Default: maintenance_mode  Key: maintenance_mode_config_vsan_mode Supported values: evacuate_all_data, ensure_object_accessibility, no_action Default: ensure_object_accessibility  Key: maintenance_mode_config_evacuate_powered_off_vms Supported values: true, false Default: false  Key: rebootless_upgrade Supported values: true, false Default: true 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeGroupApi apiInstance = new ManagementPlaneApiUpgradeGroupApi();
UpgradeUnitGroup body = new UpgradeUnitGroup(); // UpgradeUnitGroup | 
String groupId = "groupId_example"; // String | 
try {
    UpgradeUnitGroup result = apiInstance.updateUpgradeUnitGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeGroupApi#updateUpgradeUnitGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpgradeUnitGroup**](UpgradeUnitGroup.md)|  |
 **groupId** | **String**|  |

### Return type

[**UpgradeUnitGroup**](UpgradeUnitGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

