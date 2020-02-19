# ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advanceClusterRestoreAdvance**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#advanceClusterRestoreAdvance) | **POST** /cluster/restore?action&#x3D;advance | Advance any suspended restore operation
[**cancelClusterRestoreCancel**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#cancelClusterRestoreCancel) | **POST** /cluster/restore?action&#x3D;cancel | Cancel any running restore operation
[**configureRestoreConfig**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#configureRestoreConfig) | **PUT** /cluster/restore/config | Configure Restore SFTP server credentials
[**getRestoreConfig**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#getRestoreConfig) | **GET** /cluster/restore/config | Get Restore configuration
[**initiateClusterRestoreStart**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#initiateClusterRestoreStart) | **POST** /cluster/restore?action&#x3D;start | Initiate a restore operation
[**listClusterBackupTimestamps**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#listClusterBackupTimestamps) | **GET** /cluster/restore/backuptimestamps | List timestamps of all available Cluster Backups.
[**listRestoreInstructionResources**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#listRestoreInstructionResources) | **GET** /cluster/restore/instruction-resources | List resources for a given instruction, to be shown to/executed by users. 
[**queryClusterRestoreStatus**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#queryClusterRestoreStatus) | **GET** /cluster/restore/status | Query Restore Request Status
[**retryClusterRestoreRetry**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#retryClusterRestoreRetry) | **POST** /cluster/restore?action&#x3D;retry | Retry any failed restore operation
[**suspendClusterRestoreSuspend**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi.md#suspendClusterRestoreSuspend) | **POST** /cluster/restore?action&#x3D;suspend | Suspend any running restore operation

<a name="advanceClusterRestoreAdvance"></a>
# **advanceClusterRestoreAdvance**
> ClusterRestoreStatus advanceClusterRestoreAdvance(body)

Advance any suspended restore operation

Advance any currently suspended restore operation. The operation might have been suspended because (1) the user had suspended it previously, or (2) the operation is waiting for user input, to be provided as a part of the POST request body. This operation is only valid when a GET cluster/restore/status returns a status with value SUSPENDED. Otherwise, a 409 response is returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
AdvanceClusterRestoreRequest body = new AdvanceClusterRestoreRequest(); // AdvanceClusterRestoreRequest | 
try {
    ClusterRestoreStatus result = apiInstance.advanceClusterRestoreAdvance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#advanceClusterRestoreAdvance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvanceClusterRestoreRequest**](AdvanceClusterRestoreRequest.md)|  |

### Return type

[**ClusterRestoreStatus**](ClusterRestoreStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelClusterRestoreCancel"></a>
# **cancelClusterRestoreCancel**
> ClusterRestoreStatus cancelClusterRestoreCancel()

Cancel any running restore operation

This operation is only valid when a restore is in suspended state. The UI user can cancel any restore operation when the restore is suspended either due to an error, or for a user input. The API user would need to monitor the progression of a restore by calling periodically \&quot;/api/v1/cluster/restore/status\&quot; API. The response object (ClusterRestoreStatus), contains a field \&quot;endpoints\&quot;. The API user can cancel the restore process if &#x27;cancel&#x27; action is shown in the endpoint field. This operation is only valid when a GET cluster/restore/status returns a status with value SUSPENDED. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
try {
    ClusterRestoreStatus result = apiInstance.cancelClusterRestoreCancel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#cancelClusterRestoreCancel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterRestoreStatus**](ClusterRestoreStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="configureRestoreConfig"></a>
# **configureRestoreConfig**
> RestoreConfiguration configureRestoreConfig(body)

Configure Restore SFTP server credentials

Configure file server where the backed-up files used for the Restore operation are available. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
RestoreConfiguration body = new RestoreConfiguration(); // RestoreConfiguration | 
try {
    RestoreConfiguration result = apiInstance.configureRestoreConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#configureRestoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RestoreConfiguration**](RestoreConfiguration.md)|  |

### Return type

[**RestoreConfiguration**](RestoreConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRestoreConfig"></a>
# **getRestoreConfig**
> RestoreConfiguration getRestoreConfig()

Get Restore configuration

Get configuration information for the file server used to store backed-up files. Fields that contain secrets (password, passphrase) are not returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
try {
    RestoreConfiguration result = apiInstance.getRestoreConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#getRestoreConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestoreConfiguration**](RestoreConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="initiateClusterRestoreStart"></a>
# **initiateClusterRestoreStart**
> ClusterRestoreStatus initiateClusterRestoreStart(body)

Initiate a restore operation

Start the restore of an NSX cluster, from some previously backed-up configuration. This operation is only valid when a GET cluster/restore/status returns a status with value NOT_STARTED. Otherwise, a 409 response is returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
InitiateClusterRestoreRequest body = new InitiateClusterRestoreRequest(); // InitiateClusterRestoreRequest | 
try {
    ClusterRestoreStatus result = apiInstance.initiateClusterRestoreStart(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#initiateClusterRestoreStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InitiateClusterRestoreRequest**](InitiateClusterRestoreRequest.md)|  |

### Return type

[**ClusterRestoreStatus**](ClusterRestoreStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClusterBackupTimestamps"></a>
# **listClusterBackupTimestamps**
> ClusterBackupInfoListResult listClusterBackupTimestamps(cursor, includedFields, pageSize, sortAscending, sortBy)

List timestamps of all available Cluster Backups.

Returns timestamps for all backup files that are available on the SFTP server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ClusterBackupInfoListResult result = apiInstance.listClusterBackupTimestamps(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#listClusterBackupTimestamps");
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

[**ClusterBackupInfoListResult**](ClusterBackupInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRestoreInstructionResources"></a>
# **listRestoreInstructionResources**
> ActionableResourceListResult listRestoreInstructionResources(instructionId, cursor, includedFields, pageSize, sortAscending, sortBy)

List resources for a given instruction, to be shown to/executed by users. 

For restore operations requiring user input e.g. performing an action, accepting/rejecting an action, etc. the information to be conveyed to users is provided in this call. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
String instructionId = "instructionId_example"; // String | Id of the instruction set whose instructions are to be returned
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ActionableResourceListResult result = apiInstance.listRestoreInstructionResources(instructionId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#listRestoreInstructionResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructionId** | **String**| Id of the instruction set whose instructions are to be returned |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ActionableResourceListResult**](ActionableResourceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryClusterRestoreStatus"></a>
# **queryClusterRestoreStatus**
> ClusterRestoreStatus queryClusterRestoreStatus()

Query Restore Request Status

Returns status information for the specified NSX cluster restore request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
try {
    ClusterRestoreStatus result = apiInstance.queryClusterRestoreStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#queryClusterRestoreStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterRestoreStatus**](ClusterRestoreStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retryClusterRestoreRetry"></a>
# **retryClusterRestoreRetry**
> ClusterRestoreStatus retryClusterRestoreRetry()

Retry any failed restore operation

Retry any currently in-progress, failed restore operation. Only the last step of the multi-step restore operation would have failed,and only that step is retried. This operation is only valid when a GET cluster/restore/status returns a status with value FAILED. Otherwise, a 409 response is returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
try {
    ClusterRestoreStatus result = apiInstance.retryClusterRestoreRetry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#retryClusterRestoreRetry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterRestoreStatus**](ClusterRestoreStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="suspendClusterRestoreSuspend"></a>
# **suspendClusterRestoreSuspend**
> ClusterRestoreStatus suspendClusterRestoreSuspend()

Suspend any running restore operation

Suspend any currently running restore operation. The restore operation is made up of a number of steps. When this call is issued, any currently running step is allowed to finish (successfully or with errors), and the next step (and therefore the entire restore operation) is suspended until a subsequent resume or cancel call is issued. This operation is only valid when a GET cluster/restore/status returns a status with value RUNNING. Otherwise, a 409 response is returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi();
try {
    ClusterRestoreStatus result = apiInstance.suspendClusterRestoreSuspend();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementRestoreApi#suspendClusterRestoreSuspend");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterRestoreStatus**](ClusterRestoreStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

