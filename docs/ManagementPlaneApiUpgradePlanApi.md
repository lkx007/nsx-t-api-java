# ManagementPlaneApiUpgradePlanApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abortPreUpgradeChecksAbortPreUpgradeChecks**](ManagementPlaneApiUpgradePlanApi.md#abortPreUpgradeChecksAbortPreUpgradeChecks) | **POST** /upgrade?action&#x3D;abort_pre_upgrade_checks | Abort pre-upgrade checks
[**continueUpgradeContinue**](ManagementPlaneApiUpgradePlanApi.md#continueUpgradeContinue) | **POST** /upgrade/plan?action&#x3D;continue | Continue upgrade
[**executePostUpgradeChecksExecutePostUpgradeChecks**](ManagementPlaneApiUpgradePlanApi.md#executePostUpgradeChecksExecutePostUpgradeChecks) | **POST** /upgrade/{component-type}?action&#x3D;execute_post_upgrade_checks | Execute post-upgrade checks
[**executePreUpgradeChecksExecutePreUpgradeChecks**](ManagementPlaneApiUpgradePlanApi.md#executePreUpgradeChecksExecutePreUpgradeChecks) | **POST** /upgrade?action&#x3D;execute_pre_upgrade_checks | Execute pre-upgrade checks
[**getAllPreUpgradeChecksInCsvFormatCsv**](ManagementPlaneApiUpgradePlanApi.md#getAllPreUpgradeChecksInCsvFormatCsv) | **GET** /upgrade/pre-upgrade-checks?format&#x3D;csv | Returns pre-upgrade checks in csv format
[**getUpgradeChecksInfo**](ManagementPlaneApiUpgradePlanApi.md#getUpgradeChecksInfo) | **GET** /upgrade/upgrade-checks-info | Returns information about upgrade checks
[**getUpgradePlanSettings**](ManagementPlaneApiUpgradePlanApi.md#getUpgradePlanSettings) | **GET** /upgrade/plan/{component_type}/settings | Get upgrade plan settings for the component
[**pauseUpgradePause**](ManagementPlaneApiUpgradePlanApi.md#pauseUpgradePause) | **POST** /upgrade/plan?action&#x3D;pause | Pause upgrade
[**resetUpgradePlanReset**](ManagementPlaneApiUpgradePlanApi.md#resetUpgradePlanReset) | **POST** /upgrade/plan?action&#x3D;reset | Reset upgrade plan to default plan
[**startUpgradeStart**](ManagementPlaneApiUpgradePlanApi.md#startUpgradeStart) | **POST** /upgrade/plan?action&#x3D;start | Start upgrade
[**updateUpgradePlanSettings**](ManagementPlaneApiUpgradePlanApi.md#updateUpgradePlanSettings) | **PUT** /upgrade/plan/{component_type}/settings | Update upgrade plan settings for the component
[**upgradeSelectedUnitsUpgradeSelectedUnits**](ManagementPlaneApiUpgradePlanApi.md#upgradeSelectedUnitsUpgradeSelectedUnits) | **POST** /upgrade/plan?action&#x3D;upgrade_selected_units | Upgrade selected units

<a name="abortPreUpgradeChecksAbortPreUpgradeChecks"></a>
# **abortPreUpgradeChecksAbortPreUpgradeChecks**
> abortPreUpgradeChecksAbortPreUpgradeChecks()

Abort pre-upgrade checks

Aborts execution of pre-upgrade checks if already in progress. Halts the execution of checks awaiting execution at this point and makes best-effort attempts to stop checks already in execution. Returns without action if execution of pre-upgrade checks is not in progress. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
try {
    apiInstance.abortPreUpgradeChecksAbortPreUpgradeChecks();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#abortPreUpgradeChecksAbortPreUpgradeChecks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="continueUpgradeContinue"></a>
# **continueUpgradeContinue**
> continueUpgradeContinue(componentType, skip)

Continue upgrade

Continue the upgrade. Resumes the upgrade from the point where it was paused. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
String componentType = "componentType_example"; // String | Component to upgrade.
Boolean skip = true; // Boolean | Skip to upgrade of next component.
try {
    apiInstance.continueUpgradeContinue(componentType, skip);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#continueUpgradeContinue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component to upgrade. | [optional]
 **skip** | **Boolean**| Skip to upgrade of next component. | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executePostUpgradeChecksExecutePostUpgradeChecks"></a>
# **executePostUpgradeChecksExecutePostUpgradeChecks**
> executePostUpgradeChecksExecutePostUpgradeChecks(componentType)

Execute post-upgrade checks

Run pre-defined checks to identify issues after upgrade of a component. The results of the checks are added to the respective upgrade units aggregate-info. The progress and status of post-upgrade checks is part of aggregate-info of individual upgrade unit groups. Returns HTTP status 500 with error code 30953 if execution of post-upgrade checks is already in progress. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
String componentType = "componentType_example"; // String | 
try {
    apiInstance.executePostUpgradeChecksExecutePostUpgradeChecks(componentType);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#executePostUpgradeChecksExecutePostUpgradeChecks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executePreUpgradeChecksExecutePreUpgradeChecks"></a>
# **executePreUpgradeChecksExecutePreUpgradeChecks**
> executePreUpgradeChecksExecutePreUpgradeChecks(componentType, cursor, includedFields, pageSize, sortAscending, sortBy)

Execute pre-upgrade checks

Run pre-defined checks to identify potential issues which can be encountered during an upgrade or can cause an upgrade to fail. The results of the checks are added to the respective upgrade units aggregate-info. The progress and status of operation is part of upgrade status summary of individual components. Returns HTTP status 500 with error code 30953 if execution of pre-upgrade checks is already in progress. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
String componentType = "componentType_example"; // String | Component type on which the action is performed or on which the results are filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    apiInstance.executePreUpgradeChecksExecutePreUpgradeChecks(componentType, cursor, includedFields, pageSize, sortAscending, sortBy);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#executePreUpgradeChecksExecutePreUpgradeChecks");
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

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllPreUpgradeChecksInCsvFormatCsv"></a>
# **getAllPreUpgradeChecksInCsvFormatCsv**
> UpgradeCheckCsvListResult getAllPreUpgradeChecksInCsvFormatCsv()

Returns pre-upgrade checks in csv format

Returns pre-upgrade checks in csv format 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
try {
    UpgradeCheckCsvListResult result = apiInstance.getAllPreUpgradeChecksInCsvFormatCsv();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#getAllPreUpgradeChecksInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpgradeCheckCsvListResult**](UpgradeCheckCsvListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getUpgradeChecksInfo"></a>
# **getUpgradeChecksInfo**
> ComponentUpgradeChecksInfoListResult getUpgradeChecksInfo(componentType, cursor, includedFields, pageSize, sortAscending, sortBy)

Returns information about upgrade checks

Returns information of pre-upgrade and post-upgrade checks. If request parameter component type is specified, then returns information about all pre-upgrade and post-upgrade for the component. Otherwise returns information of checks across all component types. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
String componentType = "componentType_example"; // String | Component type based on which upgrade checks are to be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ComponentUpgradeChecksInfoListResult result = apiInstance.getUpgradeChecksInfo(componentType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#getUpgradeChecksInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which upgrade checks are to be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ComponentUpgradeChecksInfoListResult**](ComponentUpgradeChecksInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradePlanSettings"></a>
# **getUpgradePlanSettings**
> UpgradePlanSettings getUpgradePlanSettings(componentType)

Get upgrade plan settings for the component

Get the upgrade plan settings for the component. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
String componentType = "componentType_example"; // String | 
try {
    UpgradePlanSettings result = apiInstance.getUpgradePlanSettings(componentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#getUpgradePlanSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**|  |

### Return type

[**UpgradePlanSettings**](UpgradePlanSettings.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pauseUpgradePause"></a>
# **pauseUpgradePause**
> pauseUpgradePause()

Pause upgrade

Pause the upgrade. Upgrade will be paused after upgrade of all the nodes currently in progress is completed either successfully or with failure. User can make changes in the upgrade plan when the upgrade is paused. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
try {
    apiInstance.pauseUpgradePause();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#pauseUpgradePause");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetUpgradePlanReset"></a>
# **resetUpgradePlanReset**
> resetUpgradePlanReset(componentType)

Reset upgrade plan to default plan

Reset the upgrade plan to default plan. User has an option to change the default plan. But if after making changes, user wants to go back to the default plan, this is the way to do so. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
String componentType = "componentType_example"; // String | Component type
try {
    apiInstance.resetUpgradePlanReset(componentType);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#resetUpgradePlanReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startUpgradeStart"></a>
# **startUpgradeStart**
> startUpgradeStart()

Start upgrade

Start the upgrade. Upgrade will start as per the upgrade plan. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
try {
    apiInstance.startUpgradeStart();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#startUpgradeStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUpgradePlanSettings"></a>
# **updateUpgradePlanSettings**
> UpgradePlanSettings updateUpgradePlanSettings(body, componentType)

Update upgrade plan settings for the component

Update the upgrade plan settings for the component. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
UpgradePlanSettings body = new UpgradePlanSettings(); // UpgradePlanSettings | 
String componentType = "componentType_example"; // String | 
try {
    UpgradePlanSettings result = apiInstance.updateUpgradePlanSettings(body, componentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#updateUpgradePlanSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpgradePlanSettings**](UpgradePlanSettings.md)|  |
 **componentType** | **String**|  |

### Return type

[**UpgradePlanSettings**](UpgradePlanSettings.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="upgradeSelectedUnitsUpgradeSelectedUnits"></a>
# **upgradeSelectedUnitsUpgradeSelectedUnits**
> upgradeSelectedUnitsUpgradeSelectedUnits(body)

Upgrade selected units

Upgrades, Resumes the upgrade of a selected set of units. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradePlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradePlanApi apiInstance = new ManagementPlaneApiUpgradePlanApi();
UpgradeUnitList body = new UpgradeUnitList(); // UpgradeUnitList | 
try {
    apiInstance.upgradeSelectedUnitsUpgradeSelectedUnits(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradePlanApi#upgradeSelectedUnitsUpgradeSelectedUnits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpgradeUnitList**](UpgradeUnitList.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

