# ManagementPlaneApiUpgradeStatusApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUcFunctionalState**](ManagementPlaneApiUpgradeStatusApi.md#getUcFunctionalState) | **GET** /upgrade/functional-state | Get functional state of the upgrade coordinator
[**getUcUpgradeStatus**](ManagementPlaneApiUpgradeStatusApi.md#getUcUpgradeStatus) | **GET** /upgrade/uc-upgrade-status | Get upgrade-coordinator upgrade status
[**getUpgradeStatusSummary**](ManagementPlaneApiUpgradeStatusApi.md#getUpgradeStatusSummary) | **GET** /upgrade/status-summary | Get upgrade status summary
[**getUpgradeSummary**](ManagementPlaneApiUpgradeStatusApi.md#getUpgradeSummary) | **GET** /upgrade/summary | Get upgrade summary

<a name="getUcFunctionalState"></a>
# **getUcFunctionalState**
> UcFunctionalState getUcFunctionalState()

Get functional state of the upgrade coordinator

Get the functional state of the upgrade coordinator. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeStatusApi apiInstance = new ManagementPlaneApiUpgradeStatusApi();
try {
    UcFunctionalState result = apiInstance.getUcFunctionalState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeStatusApi#getUcFunctionalState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UcFunctionalState**](UcFunctionalState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUcUpgradeStatus"></a>
# **getUcUpgradeStatus**
> UcUpgradeStatus getUcUpgradeStatus()

Get upgrade-coordinator upgrade status

Get upgrade-coordinator upgrade status 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeStatusApi apiInstance = new ManagementPlaneApiUpgradeStatusApi();
try {
    UcUpgradeStatus result = apiInstance.getUcUpgradeStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeStatusApi#getUcUpgradeStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UcUpgradeStatus**](UcUpgradeStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeStatusSummary"></a>
# **getUpgradeStatusSummary**
> UpgradeStatus getUpgradeStatusSummary(componentType, selectionStatus, showHistory)

Get upgrade status summary

Get upgrade status summary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeStatusApi apiInstance = new ManagementPlaneApiUpgradeStatusApi();
String componentType = "componentType_example"; // String | Component type based on which upgrade units to be filtered
String selectionStatus = "selectionStatus_example"; // String | Flag to indicate whether to return status for only selected, only deselected or both type of upgrade units
Boolean showHistory = true; // Boolean | Get upgrade activity for a given component
try {
    UpgradeStatus result = apiInstance.getUpgradeStatusSummary(componentType, selectionStatus, showHistory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeStatusApi#getUpgradeStatusSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which upgrade units to be filtered | [optional]
 **selectionStatus** | **String**| Flag to indicate whether to return status for only selected, only deselected or both type of upgrade units | [optional] [enum: SELECTED, DESELECTED, ALL]
 **showHistory** | **Boolean**| Get upgrade activity for a given component | [optional]

### Return type

[**UpgradeStatus**](UpgradeStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeSummary"></a>
# **getUpgradeSummary**
> UpgradeSummary getUpgradeSummary()

Get upgrade summary

Get upgrade summary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeStatusApi apiInstance = new ManagementPlaneApiUpgradeStatusApi();
try {
    UpgradeSummary result = apiInstance.getUpgradeSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeStatusApi#getUpgradeSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpgradeSummary**](UpgradeSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

