# ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configureBackupConfig**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi.md#configureBackupConfig) | **PUT** /cluster/backups/config | Configure backup
[**getBackupConfig**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi.md#getBackupConfig) | **GET** /cluster/backups/config | Get backup configuration
[**getBackupHistory**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi.md#getBackupHistory) | **GET** /cluster/backups/history | Get backup history
[**getBackupStatus**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi.md#getBackupStatus) | **GET** /cluster/backups/status | Get backup status
[**getSshFingerprintOfServerRetrieveSshFingerprint**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi.md#getSshFingerprintOfServerRetrieveSshFingerprint) | **POST** /cluster/backups?action&#x3D;retrieve_ssh_fingerprint | Get ssh fingerprint of remote(backup) server
[**requestOnetimeBackupBackupToRemote**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi.md#requestOnetimeBackupBackupToRemote) | **POST** /cluster?action&#x3D;backup_to_remote | Request one-time backup
[**requestOnetimeInventorySummarySummarizeInventoryToRemote**](ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi.md#requestOnetimeInventorySummarySummarizeInventoryToRemote) | **POST** /cluster?action&#x3D;summarize_inventory_to_remote | Request one-time inventory summary.

<a name="configureBackupConfig"></a>
# **configureBackupConfig**
> BackupConfiguration configureBackupConfig(body)

Configure backup

Configure file server and timers for automated backup. If secret fields are omitted (password, passphrase) then use the previously set value. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi();
BackupConfiguration body = new BackupConfiguration(); // BackupConfiguration | 
try {
    BackupConfiguration result = apiInstance.configureBackupConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi#configureBackupConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BackupConfiguration**](BackupConfiguration.md)|  |

### Return type

[**BackupConfiguration**](BackupConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBackupConfig"></a>
# **getBackupConfig**
> BackupConfiguration getBackupConfig()

Get backup configuration

Get a configuration of a file server and timers for automated backup. Fields that contain secrets (password, passphrase) are not returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi();
try {
    BackupConfiguration result = apiInstance.getBackupConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi#getBackupConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BackupConfiguration**](BackupConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBackupHistory"></a>
# **getBackupHistory**
> BackupOperationHistory getBackupHistory()

Get backup history

Get history of previous backup operations 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi();
try {
    BackupOperationHistory result = apiInstance.getBackupHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi#getBackupHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BackupOperationHistory**](BackupOperationHistory.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBackupStatus"></a>
# **getBackupStatus**
> CurrentBackupOperationStatus getBackupStatus()

Get backup status

Get status of active backup operations 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi();
try {
    CurrentBackupOperationStatus result = apiInstance.getBackupStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi#getBackupStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentBackupOperationStatus**](CurrentBackupOperationStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSshFingerprintOfServerRetrieveSshFingerprint"></a>
# **getSshFingerprintOfServerRetrieveSshFingerprint**
> RemoteServerFingerprint getSshFingerprintOfServerRetrieveSshFingerprint(body)

Get ssh fingerprint of remote(backup) server

Get SHA256 fingerprint of ECDSA key of remote server. The caller should independently verify that the key is trusted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi();
RemoteServerFingerprintRequest body = new RemoteServerFingerprintRequest(); // RemoteServerFingerprintRequest | 
try {
    RemoteServerFingerprint result = apiInstance.getSshFingerprintOfServerRetrieveSshFingerprint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi#getSshFingerprintOfServerRetrieveSshFingerprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteServerFingerprintRequest**](RemoteServerFingerprintRequest.md)|  |

### Return type

[**RemoteServerFingerprint**](RemoteServerFingerprint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestOnetimeBackupBackupToRemote"></a>
# **requestOnetimeBackupBackupToRemote**
> requestOnetimeBackupBackupToRemote()

Request one-time backup

Request one-time backup. The backup will be uploaded using the same server configuration as for automatic backup. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi();
try {
    apiInstance.requestOnetimeBackupBackupToRemote();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi#requestOnetimeBackupBackupToRemote");
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

<a name="requestOnetimeInventorySummarySummarizeInventoryToRemote"></a>
# **requestOnetimeInventorySummarySummarizeInventoryToRemote**
> requestOnetimeInventorySummarySummarizeInventoryToRemote()

Request one-time inventory summary.

Request one-time inventory summary. The backup will be uploaded using the same server configuration as for an automatic backup. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi();
try {
    apiInstance.requestOnetimeInventorySummarySummarizeInventoryToRemote();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationBackupRestoreManagementBackupApi#requestOnetimeInventorySummarySummarizeInventoryToRemote");
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

