# ManagementPlaneApiMigrationSetupApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNsxvSetupDetails**](ManagementPlaneApiMigrationSetupApi.md#getNsxvSetupDetails) | **GET** /migration/setup | NSX-V setup details
[**updateNsxvSetupDetails**](ManagementPlaneApiMigrationSetupApi.md#updateNsxvSetupDetails) | **PUT** /migration/setup | NSX-V setup details

<a name="getNsxvSetupDetails"></a>
# **getNsxvSetupDetails**
> MigrationSetupInfo getNsxvSetupDetails()

NSX-V setup details

Get setup details of NSX-V to be migrated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationSetupApi apiInstance = new ManagementPlaneApiMigrationSetupApi();
try {
    MigrationSetupInfo result = apiInstance.getNsxvSetupDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationSetupApi#getNsxvSetupDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MigrationSetupInfo**](MigrationSetupInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNsxvSetupDetails"></a>
# **updateNsxvSetupDetails**
> MigrationSetupInfo updateNsxvSetupDetails(body)

NSX-V setup details

Provide setup details of NSX-V to be migrated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationSetupApi apiInstance = new ManagementPlaneApiMigrationSetupApi();
MigrationSetupInfo body = new MigrationSetupInfo(); // MigrationSetupInfo | 
try {
    MigrationSetupInfo result = apiInstance.updateNsxvSetupDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationSetupApi#updateNsxvSetupDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrationSetupInfo**](MigrationSetupInfo.md)|  |

### Return type

[**MigrationSetupInfo**](MigrationSetupInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

