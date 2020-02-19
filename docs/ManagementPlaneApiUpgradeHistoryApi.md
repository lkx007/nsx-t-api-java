# ManagementPlaneApiUpgradeHistoryApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUpgradeHistory**](ManagementPlaneApiUpgradeHistoryApi.md#getUpgradeHistory) | **GET** /upgrade/history | Get upgrade history

<a name="getUpgradeHistory"></a>
# **getUpgradeHistory**
> UpgradeHistoryList getUpgradeHistory()

Get upgrade history

Get upgrade history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeHistoryApi apiInstance = new ManagementPlaneApiUpgradeHistoryApi();
try {
    UpgradeHistoryList result = apiInstance.getUpgradeHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeHistoryApi#getUpgradeHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpgradeHistoryList**](UpgradeHistoryList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

