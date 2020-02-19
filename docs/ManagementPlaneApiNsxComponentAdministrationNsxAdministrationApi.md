# ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**readManagementConfig**](ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi.md#readManagementConfig) | **GET** /configs/management | Read NSX Management nodes global configuration.
[**updateManagementConfig**](ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi.md#updateManagementConfig) | **PUT** /configs/management | Update NSX Management nodes global configuration

<a name="readManagementConfig"></a>
# **readManagementConfig**
> ManagementConfig readManagementConfig()

Read NSX Management nodes global configuration.

Returns the NSX Management nodes global configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi();
try {
    ManagementConfig result = apiInstance.readManagementConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi#readManagementConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManagementConfig**](ManagementConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateManagementConfig"></a>
# **updateManagementConfig**
> ManagementConfig updateManagementConfig(body)

Update NSX Management nodes global configuration

Modifies the NSX Management nodes global configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi();
ManagementConfig body = new ManagementConfig(); // ManagementConfig | 
try {
    ManagementConfig result = apiInstance.updateManagementConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationNsxAdministrationApi#updateManagementConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagementConfig**](ManagementConfig.md)|  |

### Return type

[**ManagementConfig**](ManagementConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

