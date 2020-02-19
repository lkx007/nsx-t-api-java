# ManagementPlaneApiConfigsInventoryApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInventoryConfig**](ManagementPlaneApiConfigsInventoryApi.md#getInventoryConfig) | **GET** /configs/inventory | Return inventory configuration

<a name="getInventoryConfig"></a>
# **getInventoryConfig**
> InventoryConfig getInventoryConfig()

Return inventory configuration

Supports retrieving following configuration of inventory module 1. Soft limit on number of compute managers that can be registered. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiConfigsInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiConfigsInventoryApi apiInstance = new ManagementPlaneApiConfigsInventoryApi();
try {
    InventoryConfig result = apiInstance.getInventoryConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiConfigsInventoryApi#getInventoryConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InventoryConfig**](InventoryConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

