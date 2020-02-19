# ManagementPlaneApiUpgradeBundleApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**triggerUcUpgradeUpgradeUc**](ManagementPlaneApiUpgradeBundleApi.md#triggerUcUpgradeUpgradeUc) | **POST** /upgrade?action&#x3D;upgrade_uc | Upgrade the upgrade coordinator.

<a name="triggerUcUpgradeUpgradeUc"></a>
# **triggerUcUpgradeUpgradeUc**
> triggerUcUpgradeUpgradeUc()

Upgrade the upgrade coordinator.

Upgrade the upgrade coordinator module itself. This call is invoked after user uploads an upgrade bundle. Once this call is invoked, upgrade coordinator stops and gets restarted and target version upgrade coordinator module comes up after restart. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeBundleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeBundleApi apiInstance = new ManagementPlaneApiUpgradeBundleApi();
try {
    apiInstance.triggerUcUpgradeUpgradeUc();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeBundleApi#triggerUcUpgradeUpgradeUc");
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

