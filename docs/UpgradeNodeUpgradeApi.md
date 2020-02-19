# UpgradeNodeUpgradeApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeUpgradeTask_**](UpgradeNodeUpgradeApi.md#executeUpgradeTask_) | **POST** /node/upgrade/performtask?action&#x3D;[^/]+ | Execute upgrade task
[**getUpgradeProgressStatus**](UpgradeNodeUpgradeApi.md#getUpgradeProgressStatus) | **GET** /node/upgrade/progress-status | Get upgrade progress status
[**getUpgradeTaskStatus**](UpgradeNodeUpgradeApi.md#getUpgradeTaskStatus) | **GET** /node/upgrade | Get upgrade task status

<a name="executeUpgradeTask_"></a>
# **executeUpgradeTask_**
> UpgradeTaskProperties executeUpgradeTask_(body)

Execute upgrade task

Execute upgrade task. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeNodeUpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UpgradeNodeUpgradeApi apiInstance = new UpgradeNodeUpgradeApi();
UpgradeTaskProperties body = new UpgradeTaskProperties(); // UpgradeTaskProperties | 
try {
    UpgradeTaskProperties result = apiInstance.executeUpgradeTask_(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeNodeUpgradeApi#executeUpgradeTask_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpgradeTaskProperties**](UpgradeTaskProperties.md)|  |

### Return type

[**UpgradeTaskProperties**](UpgradeTaskProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpgradeProgressStatus"></a>
# **getUpgradeProgressStatus**
> UpgradeProgressStatus getUpgradeProgressStatus()

Get upgrade progress status

Get progress status of last upgrade step, if upgrade bundle is present. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeNodeUpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UpgradeNodeUpgradeApi apiInstance = new UpgradeNodeUpgradeApi();
try {
    UpgradeProgressStatus result = apiInstance.getUpgradeProgressStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeNodeUpgradeApi#getUpgradeProgressStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpgradeProgressStatus**](UpgradeProgressStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeTaskStatus"></a>
# **getUpgradeTaskStatus**
> UpgradeTaskProperties getUpgradeTaskStatus(bundleName, upgradeTaskId)

Get upgrade task status

Get upgrade task status for the given task of the given bundle. Both bundle_name and task_id must be provided, otherwise you will receive a 404 NOT FOUND response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeNodeUpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UpgradeNodeUpgradeApi apiInstance = new UpgradeNodeUpgradeApi();
String bundleName = "bundleName_example"; // String | Bundle Name
String upgradeTaskId = "upgradeTaskId_example"; // String | Upgrade Task ID
try {
    UpgradeTaskProperties result = apiInstance.getUpgradeTaskStatus(bundleName, upgradeTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeNodeUpgradeApi#getUpgradeTaskStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleName** | **String**| Bundle Name | [optional]
 **upgradeTaskId** | **String**| Upgrade Task ID | [optional]

### Return type

[**UpgradeTaskProperties**](UpgradeTaskProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

