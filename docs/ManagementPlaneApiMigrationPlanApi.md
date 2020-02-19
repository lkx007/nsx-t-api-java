# ManagementPlaneApiMigrationPlanApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abortMigrationAbort**](ManagementPlaneApiMigrationPlanApi.md#abortMigrationAbort) | **POST** /migration/plan?action&#x3D;abort | Abort migration
[**continueMigrationContinue**](ManagementPlaneApiMigrationPlanApi.md#continueMigrationContinue) | **POST** /migration/plan?action&#x3D;continue | Continue migration
[**finishMigrationFinish**](ManagementPlaneApiMigrationPlanApi.md#finishMigrationFinish) | **POST** /migration/plan?action&#x3D;finish | Mark completion of a migration cycle
[**getMigrationPlanSettings**](ManagementPlaneApiMigrationPlanApi.md#getMigrationPlanSettings) | **GET** /migration/plan/{component_type}/settings | Get migration plan settings for the component
[**pauseMigrationPause**](ManagementPlaneApiMigrationPlanApi.md#pauseMigrationPause) | **POST** /migration/plan?action&#x3D;pause | Pause migration
[**resetMigrationPlanReset**](ManagementPlaneApiMigrationPlanApi.md#resetMigrationPlanReset) | **POST** /migration/plan?action&#x3D;reset | Reset migration plan to default plan
[**startMigrationStart**](ManagementPlaneApiMigrationPlanApi.md#startMigrationStart) | **POST** /migration/plan?action&#x3D;start | Start migration
[**startRollbackMigrationRollback**](ManagementPlaneApiMigrationPlanApi.md#startRollbackMigrationRollback) | **POST** /migration/plan?action&#x3D;rollback | Rollbabck migration
[**updateMigrationPlanSettings**](ManagementPlaneApiMigrationPlanApi.md#updateMigrationPlanSettings) | **PUT** /migration/plan/{component_type}/settings | Update migration plan settings for the component

<a name="abortMigrationAbort"></a>
# **abortMigrationAbort**
> abortMigrationAbort()

Abort migration

Resets all migration steps done so far, so that migration can be restarted with new setup details. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
try {
    apiInstance.abortMigrationAbort();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#abortMigrationAbort");
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

<a name="continueMigrationContinue"></a>
# **continueMigrationContinue**
> continueMigrationContinue(skip)

Continue migration

Continue the migration. Resumes the migration from the point where it was paused. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
Boolean skip = true; // Boolean | Skip to migration of next component.
try {
    apiInstance.continueMigrationContinue(skip);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#continueMigrationContinue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Boolean**| Skip to migration of next component. | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="finishMigrationFinish"></a>
# **finishMigrationFinish**
> finishMigrationFinish()

Mark completion of a migration cycle

This API marks the completion of one execution of migration workflow. This API resets internal  execution state and hence needs to be invoked before starting subsequent workflow run. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
try {
    apiInstance.finishMigrationFinish();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#finishMigrationFinish");
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

<a name="getMigrationPlanSettings"></a>
# **getMigrationPlanSettings**
> MigrationPlanSettings getMigrationPlanSettings(componentType)

Get migration plan settings for the component

Get the migration plan settings for the component. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
String componentType = "componentType_example"; // String | 
try {
    MigrationPlanSettings result = apiInstance.getMigrationPlanSettings(componentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#getMigrationPlanSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**|  |

### Return type

[**MigrationPlanSettings**](MigrationPlanSettings.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pauseMigrationPause"></a>
# **pauseMigrationPause**
> pauseMigrationPause()

Pause migration

Pause the migration. Migration will be paused after migration of all the nodes currently in progress is completed either successfully or with failure. User can make changes in the migration plan when the migration is paused. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
try {
    apiInstance.pauseMigrationPause();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#pauseMigrationPause");
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

<a name="resetMigrationPlanReset"></a>
# **resetMigrationPlanReset**
> resetMigrationPlanReset(componentType)

Reset migration plan to default plan

Reset the migration plan to default plan. User has an option to change the default plan. But if after making changes, user wants to go back to the default plan, this is the way to do so. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
String componentType = "componentType_example"; // String | Component type
try {
    apiInstance.resetMigrationPlanReset(componentType);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#resetMigrationPlanReset");
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

<a name="startMigrationStart"></a>
# **startMigrationStart**
> startMigrationStart()

Start migration

Start the migration. Migration will start as per the migration plan. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
try {
    apiInstance.startMigrationStart();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#startMigrationStart");
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

<a name="startRollbackMigrationRollback"></a>
# **startRollbackMigrationRollback**
> startRollbackMigrationRollback()

Rollbabck migration

Roll back the migration. Changes applied to target NSX will be reverted. Use the migration status API to monitor progress of roll back. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
try {
    apiInstance.startRollbackMigrationRollback();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#startRollbackMigrationRollback");
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

<a name="updateMigrationPlanSettings"></a>
# **updateMigrationPlanSettings**
> MigrationPlanSettings updateMigrationPlanSettings(body, componentType)

Update migration plan settings for the component

Update the migration plan settings for the component. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationPlanApi apiInstance = new ManagementPlaneApiMigrationPlanApi();
MigrationPlanSettings body = new MigrationPlanSettings(); // MigrationPlanSettings | 
String componentType = "componentType_example"; // String | 
try {
    MigrationPlanSettings result = apiInstance.updateMigrationPlanSettings(body, componentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationPlanApi#updateMigrationPlanSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrationPlanSettings**](MigrationPlanSettings.md)|  |
 **componentType** | **String**|  |

### Return type

[**MigrationPlanSettings**](MigrationPlanSettings.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

