# ManagementPlaneApiApiServicesAuthenticationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**readAuthenticationPolicyProperties**](ManagementPlaneApiApiServicesAuthenticationApi.md#readAuthenticationPolicyProperties) | **GET** /node/aaa/auth-policy | Read node authentication policy configuration
[**updateAuthenticationPolicyProperties**](ManagementPlaneApiApiServicesAuthenticationApi.md#updateAuthenticationPolicyProperties) | **PUT** /node/aaa/auth-policy | Update node authentication policy configuration

<a name="readAuthenticationPolicyProperties"></a>
# **readAuthenticationPolicyProperties**
> AuthenticationPolicyProperties readAuthenticationPolicyProperties()

Read node authentication policy configuration

Returns information about the currently configured authentication policies on the node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApiServicesAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApiServicesAuthenticationApi apiInstance = new ManagementPlaneApiApiServicesAuthenticationApi();
try {
    AuthenticationPolicyProperties result = apiInstance.readAuthenticationPolicyProperties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApiServicesAuthenticationApi#readAuthenticationPolicyProperties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthenticationPolicyProperties**](AuthenticationPolicyProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAuthenticationPolicyProperties"></a>
# **updateAuthenticationPolicyProperties**
> AuthenticationPolicyProperties updateAuthenticationPolicyProperties(body)

Update node authentication policy configuration

Update the currently configured authentication policy on the node. If any of api_max_auth_failures, api_failed_auth_reset_period, or api_failed_auth_lockout_period are modified, the http service is automatically restarted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApiServicesAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApiServicesAuthenticationApi apiInstance = new ManagementPlaneApiApiServicesAuthenticationApi();
AuthenticationPolicyProperties body = new AuthenticationPolicyProperties(); // AuthenticationPolicyProperties | 
try {
    AuthenticationPolicyProperties result = apiInstance.updateAuthenticationPolicyProperties(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApiServicesAuthenticationApi#updateAuthenticationPolicyProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthenticationPolicyProperties**](AuthenticationPolicyProperties.md)|  |

### Return type

[**AuthenticationPolicyProperties**](AuthenticationPolicyProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

