# ManagementPlaneApiServiceConfigApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceConfig**](ManagementPlaneApiServiceConfigApi.md#createServiceConfig) | **POST** /service-configs | Create service config
[**deleteServiceConfig**](ManagementPlaneApiServiceConfigApi.md#deleteServiceConfig) | **DELETE** /service-configs/{config-set-id} | Delete Service Config
[**effectiveProfiles**](ManagementPlaneApiServiceConfigApi.md#effectiveProfiles) | **GET** /service-configs/effective-profiles | Get Effective Profiles for an Entity
[**listServiceConfigs**](ManagementPlaneApiServiceConfigApi.md#listServiceConfigs) | **GET** /service-configs | List service configs
[**readServiceConfig**](ManagementPlaneApiServiceConfigApi.md#readServiceConfig) | **GET** /service-configs/{config-set-id} | Read Service Config
[**serviceConfigBatchOperation**](ManagementPlaneApiServiceConfigApi.md#serviceConfigBatchOperation) | **POST** /service-configs/batch | Creates/Updates service configs sent in batch request
[**updateServiceConfig**](ManagementPlaneApiServiceConfigApi.md#updateServiceConfig) | **PUT** /service-configs/{config-set-id} | Update service config

<a name="createServiceConfig"></a>
# **createServiceConfig**
> ServiceConfig createServiceConfig(body)

Create service config

Creates a new service config that can group profiles and configs 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServiceConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServiceConfigApi apiInstance = new ManagementPlaneApiServiceConfigApi();
ServiceConfig body = new ServiceConfig(); // ServiceConfig | 
try {
    ServiceConfig result = apiInstance.createServiceConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServiceConfigApi#createServiceConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceConfig**](ServiceConfig.md)|  |

### Return type

[**ServiceConfig**](ServiceConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteServiceConfig"></a>
# **deleteServiceConfig**
> deleteServiceConfig(configSetId)

Delete Service Config

Deletes the specified service config 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServiceConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServiceConfigApi apiInstance = new ManagementPlaneApiServiceConfigApi();
String configSetId = "configSetId_example"; // String | service Ccnfig Id
try {
    apiInstance.deleteServiceConfig(configSetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServiceConfigApi#deleteServiceConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configSetId** | **String**| service Ccnfig Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="effectiveProfiles"></a>
# **effectiveProfiles**
> EffectiveProfileListResult effectiveProfiles(resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy)

Get Effective Profiles for an Entity

Returns the effective profiles applied to the specified Resource. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServiceConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServiceConfigApi apiInstance = new ManagementPlaneApiServiceConfigApi();
String resourceId = "resourceId_example"; // String | The resource for which the effective profiles are to be fetched
String resourceType = "resourceType_example"; // String | Valid Resource type in effective profiles API
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveProfileListResult result = apiInstance.effectiveProfiles(resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServiceConfigApi#effectiveProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **String**| The resource for which the effective profiles are to be fetched |
 **resourceType** | **String**| Valid Resource type in effective profiles API | [enum: NSGroup, LogicalPort, VirtualMachine, TransportNode, LogicalRouter]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveProfileListResult**](EffectiveProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceConfigs"></a>
# **listServiceConfigs**
> ServiceConfigListResult listServiceConfigs(cursor, includedFields, pageSize, profileType, sortAscending, sortBy)

List service configs

List of all service configs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServiceConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServiceConfigApi apiInstance = new ManagementPlaneApiServiceConfigApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String profileType = "profileType_example"; // String | Fetch ServiceConfig for the given attribute profile_type
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ServiceConfigListResult result = apiInstance.listServiceConfigs(cursor, includedFields, pageSize, profileType, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServiceConfigApi#listServiceConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **profileType** | **String**| Fetch ServiceConfig for the given attribute profile_type | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ServiceConfigListResult**](ServiceConfigListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readServiceConfig"></a>
# **readServiceConfig**
> ServiceConfig readServiceConfig(configSetId)

Read Service Config

Returns information about the specified Service Config. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServiceConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServiceConfigApi apiInstance = new ManagementPlaneApiServiceConfigApi();
String configSetId = "configSetId_example"; // String | Service Config Id
try {
    ServiceConfig result = apiInstance.readServiceConfig(configSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServiceConfigApi#readServiceConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configSetId** | **String**| Service Config Id |

### Return type

[**ServiceConfig**](ServiceConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serviceConfigBatchOperation"></a>
# **serviceConfigBatchOperation**
> ServiceConfigListResult serviceConfigBatchOperation(body)

Creates/Updates service configs sent in batch request

Creates/Updates new service configs sent in batch request. This API returns ALL the service configs that are created/updated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServiceConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServiceConfigApi apiInstance = new ManagementPlaneApiServiceConfigApi();
ServiceConfigList body = new ServiceConfigList(); // ServiceConfigList | 
try {
    ServiceConfigListResult result = apiInstance.serviceConfigBatchOperation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServiceConfigApi#serviceConfigBatchOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceConfigList**](ServiceConfigList.md)|  |

### Return type

[**ServiceConfigListResult**](ServiceConfigListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceConfig"></a>
# **updateServiceConfig**
> ServiceConfig updateServiceConfig(body, configSetId)

Update service config

Updates the specified ServiceConfig. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServiceConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServiceConfigApi apiInstance = new ManagementPlaneApiServiceConfigApi();
ServiceConfig body = new ServiceConfig(); // ServiceConfig | 
String configSetId = "configSetId_example"; // String | service config Id
try {
    ServiceConfig result = apiInstance.updateServiceConfig(body, configSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServiceConfigApi#updateServiceConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceConfig**](ServiceConfig.md)|  |
 **configSetId** | **String**| service config Id |

### Return type

[**ServiceConfig**](ServiceConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

