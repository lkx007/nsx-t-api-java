# ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMPAConfiguration**](ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi.md#deleteMPAConfiguration) | **DELETE** /node/mpa-config | Delete the MPA config file
[**deleteManagementPlaneConfiguration**](ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi.md#deleteManagementPlaneConfiguration) | **DELETE** /node/management-plane | Delete the management_plane config
[**readMPAConfiguration**](ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi.md#readMPAConfiguration) | **GET** /node/mpa-config | MPA config for the management plane this node is communicating with
[**readManagementPlaneConfiguration**](ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi.md#readManagementPlaneConfiguration) | **GET** /node/management-plane | Management plane this controller is communicating with
[**updateMPAConfiguration**](ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi.md#updateMPAConfiguration) | **PUT** /node/mpa-config | Update management plane agent configuration
[**updateManagementPlaneConfiguration**](ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi.md#updateManagementPlaneConfiguration) | **PUT** /node/management-plane | Update management plane configuration

<a name="deleteMPAConfiguration"></a>
# **deleteMPAConfiguration**
> deleteMPAConfiguration()

Delete the MPA config file

Delete the MPA config file

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi();
try {
    apiInstance.deleteMPAConfiguration();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi#deleteMPAConfiguration");
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

<a name="deleteManagementPlaneConfiguration"></a>
# **deleteManagementPlaneConfiguration**
> deleteManagementPlaneConfiguration()

Delete the management_plane config

Delete the management_plane config

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi();
try {
    apiInstance.deleteManagementPlaneConfiguration();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi#deleteManagementPlaneConfiguration");
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

<a name="readMPAConfiguration"></a>
# **readMPAConfiguration**
> MPAConfigProperties readMPAConfiguration()

MPA config for the management plane this node is communicating with

MPA config for the management plane this node is communicating with

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi();
try {
    MPAConfigProperties result = apiInstance.readMPAConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi#readMPAConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MPAConfigProperties**](MPAConfigProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readManagementPlaneConfiguration"></a>
# **readManagementPlaneConfiguration**
> ManagementPlaneProperties readManagementPlaneConfiguration()

Management plane this controller is communicating with

Management plane this controller is communicating with

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi();
try {
    ManagementPlaneProperties result = apiInstance.readManagementPlaneConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi#readManagementPlaneConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManagementPlaneProperties**](ManagementPlaneProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMPAConfiguration"></a>
# **updateMPAConfiguration**
> MPAConfigProperties updateMPAConfiguration(body)

Update management plane agent configuration

Update management plane agent configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi();
MPAConfigProperties body = new MPAConfigProperties(); // MPAConfigProperties | 
try {
    MPAConfigProperties result = apiInstance.updateMPAConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi#updateMPAConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MPAConfigProperties**](MPAConfigProperties.md)|  |

### Return type

[**MPAConfigProperties**](MPAConfigProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateManagementPlaneConfiguration"></a>
# **updateManagementPlaneConfiguration**
> ManagementPlaneProperties updateManagementPlaneConfiguration(body)

Update management plane configuration

Update management plane configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi();
ManagementPlaneProperties body = new ManagementPlaneProperties(); // ManagementPlaneProperties | 
try {
    ManagementPlaneProperties result = apiInstance.updateManagementPlaneConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationSystemPropertiesApi#updateManagementPlaneConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagementPlaneProperties**](ManagementPlaneProperties.md)|  |

### Return type

[**ManagementPlaneProperties**](ManagementPlaneProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

