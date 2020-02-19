# ManagementPlaneApiTelemetryConfigurationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTelemetryAgreement**](ManagementPlaneApiTelemetryConfigurationApi.md#getTelemetryAgreement) | **GET** /telemetry/agreement | Returns telemetry agreement information
[**getTelemetryConfig**](ManagementPlaneApiTelemetryConfigurationApi.md#getTelemetryConfig) | **GET** /telemetry/config | Returns the telemetry configuration
[**updateTelemetryAgreement**](ManagementPlaneApiTelemetryConfigurationApi.md#updateTelemetryAgreement) | **PUT** /telemetry/agreement | Set telemetry agreement information
[**updateTelemetryConfig**](ManagementPlaneApiTelemetryConfigurationApi.md#updateTelemetryConfig) | **PUT** /telemetry/config | Creates or updates the telemetry configuration

<a name="getTelemetryAgreement"></a>
# **getTelemetryAgreement**
> TelemetryAgreement getTelemetryAgreement()

Returns telemetry agreement information

Returns telemetry agreement information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTelemetryConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTelemetryConfigurationApi apiInstance = new ManagementPlaneApiTelemetryConfigurationApi();
try {
    TelemetryAgreement result = apiInstance.getTelemetryAgreement();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTelemetryConfigurationApi#getTelemetryAgreement");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TelemetryAgreement**](TelemetryAgreement.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTelemetryConfig"></a>
# **getTelemetryConfig**
> TelemetryConfig getTelemetryConfig()

Returns the telemetry configuration

Returns the telemetry configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTelemetryConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTelemetryConfigurationApi apiInstance = new ManagementPlaneApiTelemetryConfigurationApi();
try {
    TelemetryConfig result = apiInstance.getTelemetryConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTelemetryConfigurationApi#getTelemetryConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TelemetryConfig**](TelemetryConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTelemetryAgreement"></a>
# **updateTelemetryAgreement**
> TelemetryAgreement updateTelemetryAgreement(body)

Set telemetry agreement information

Set telemetry agreement information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTelemetryConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTelemetryConfigurationApi apiInstance = new ManagementPlaneApiTelemetryConfigurationApi();
TelemetryAgreement body = new TelemetryAgreement(); // TelemetryAgreement | 
try {
    TelemetryAgreement result = apiInstance.updateTelemetryAgreement(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTelemetryConfigurationApi#updateTelemetryAgreement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TelemetryAgreement**](TelemetryAgreement.md)|  |

### Return type

[**TelemetryAgreement**](TelemetryAgreement.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTelemetryConfig"></a>
# **updateTelemetryConfig**
> TelemetryConfig updateTelemetryConfig(body)

Creates or updates the telemetry configuration

Updates or creates the telemetry configuration, and returns the new configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTelemetryConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTelemetryConfigurationApi apiInstance = new ManagementPlaneApiTelemetryConfigurationApi();
TelemetryConfig body = new TelemetryConfig(); // TelemetryConfig | 
try {
    TelemetryConfig result = apiInstance.updateTelemetryConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTelemetryConfigurationApi#updateTelemetryConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TelemetryConfig**](TelemetryConfig.md)|  |

### Return type

[**TelemetryConfig**](TelemetryConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

