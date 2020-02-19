# ManagementPlaneApiMigrationStatusApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMigrationStatusSummary**](ManagementPlaneApiMigrationStatusApi.md#getMigrationStatusSummary) | **GET** /migration/status-summary | Get migration status summary
[**getMigrationSummary**](ManagementPlaneApiMigrationStatusApi.md#getMigrationSummary) | **GET** /migration/summary | Get migration summary

<a name="getMigrationStatusSummary"></a>
# **getMigrationStatusSummary**
> MigrationStatus getMigrationStatusSummary(componentType)

Get migration status summary

Get migration status summary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationStatusApi apiInstance = new ManagementPlaneApiMigrationStatusApi();
String componentType = "componentType_example"; // String | Component type based on which migration units to be filtered
try {
    MigrationStatus result = apiInstance.getMigrationStatusSummary(componentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationStatusApi#getMigrationStatusSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| Component type based on which migration units to be filtered | [optional]

### Return type

[**MigrationStatus**](MigrationStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationSummary"></a>
# **getMigrationSummary**
> MigrationSummary getMigrationSummary()

Get migration summary

Get migration summary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationStatusApi apiInstance = new ManagementPlaneApiMigrationStatusApi();
try {
    MigrationSummary result = apiInstance.getMigrationSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationStatusApi#getMigrationSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MigrationSummary**](MigrationSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

