# ManagementPlaneApiAggregationServiceConfigurationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAggregationServiceGlobalConfig**](ManagementPlaneApiAggregationServiceConfigurationApi.md#getAggregationServiceGlobalConfig) | **GET** /hpm/global-config | Read global health performance monitoring configuration
[**getFeatureStackConfiguration**](ManagementPlaneApiAggregationServiceConfigurationApi.md#getFeatureStackConfiguration) | **GET** /hpm/features/{feature-stack-name} | Read health performance monitoring configuration for feature stack
[**listFeatureStackConfigurations**](ManagementPlaneApiAggregationServiceConfigurationApi.md#listFeatureStackConfigurations) | **GET** /hpm/features | List all health performance monitoring feature stacks
[**resetAggregationServiceFeatureStackConfigurationResetCollectionFrequency**](ManagementPlaneApiAggregationServiceConfigurationApi.md#resetAggregationServiceFeatureStackConfigurationResetCollectionFrequency) | **POST** /hpm/features/{feature-stack-name}?action&#x3D;reset_collection_frequency | Reset the data collection frequency configuration setting to the default values
[**updateAggregationServiceGlobalConfig**](ManagementPlaneApiAggregationServiceConfigurationApi.md#updateAggregationServiceGlobalConfig) | **PUT** /hpm/global-config | Set the global configuration for aggregation service related data collection
[**updateFeatureStackConfiguration**](ManagementPlaneApiAggregationServiceConfigurationApi.md#updateFeatureStackConfiguration) | **PUT** /hpm/features/{feature-stack-name} | Update health performance monitoring configuration for feature stack

<a name="getAggregationServiceGlobalConfig"></a>
# **getAggregationServiceGlobalConfig**
> GlobalCollectionConfiguration getAggregationServiceGlobalConfig()

Read global health performance monitoring configuration

Read global health performance monitoring configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAggregationServiceConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAggregationServiceConfigurationApi apiInstance = new ManagementPlaneApiAggregationServiceConfigurationApi();
try {
    GlobalCollectionConfiguration result = apiInstance.getAggregationServiceGlobalConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAggregationServiceConfigurationApi#getAggregationServiceGlobalConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GlobalCollectionConfiguration**](GlobalCollectionConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFeatureStackConfiguration"></a>
# **getFeatureStackConfiguration**
> FeatureStackCollectionConfiguration getFeatureStackConfiguration(featureStackName)

Read health performance monitoring configuration for feature stack

Returns the complete set of client type data collection configuration records for the specified feature stack. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAggregationServiceConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAggregationServiceConfigurationApi apiInstance = new ManagementPlaneApiAggregationServiceConfigurationApi();
String featureStackName = "featureStackName_example"; // String | 
try {
    FeatureStackCollectionConfiguration result = apiInstance.getFeatureStackConfiguration(featureStackName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAggregationServiceConfigurationApi#getFeatureStackConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureStackName** | **String**|  |

### Return type

[**FeatureStackCollectionConfiguration**](FeatureStackCollectionConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFeatureStackConfigurations"></a>
# **listFeatureStackConfigurations**
> FeatureStackCollectionConfigurationList listFeatureStackConfigurations()

List all health performance monitoring feature stacks

List all health performance monitoring feature stacks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAggregationServiceConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAggregationServiceConfigurationApi apiInstance = new ManagementPlaneApiAggregationServiceConfigurationApi();
try {
    FeatureStackCollectionConfigurationList result = apiInstance.listFeatureStackConfigurations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAggregationServiceConfigurationApi#listFeatureStackConfigurations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FeatureStackCollectionConfigurationList**](FeatureStackCollectionConfigurationList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetAggregationServiceFeatureStackConfigurationResetCollectionFrequency"></a>
# **resetAggregationServiceFeatureStackConfigurationResetCollectionFrequency**
> FeatureStackCollectionConfiguration resetAggregationServiceFeatureStackConfigurationResetCollectionFrequency(featureStackName)

Reset the data collection frequency configuration setting to the default values

Reset the data collection frequency configuration setting to the default values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAggregationServiceConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAggregationServiceConfigurationApi apiInstance = new ManagementPlaneApiAggregationServiceConfigurationApi();
String featureStackName = "featureStackName_example"; // String | 
try {
    FeatureStackCollectionConfiguration result = apiInstance.resetAggregationServiceFeatureStackConfigurationResetCollectionFrequency(featureStackName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAggregationServiceConfigurationApi#resetAggregationServiceFeatureStackConfigurationResetCollectionFrequency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureStackName** | **String**|  |

### Return type

[**FeatureStackCollectionConfiguration**](FeatureStackCollectionConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAggregationServiceGlobalConfig"></a>
# **updateAggregationServiceGlobalConfig**
> GlobalCollectionConfiguration updateAggregationServiceGlobalConfig(body)

Set the global configuration for aggregation service related data collection

Set the global configuration for aggregation service related data collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAggregationServiceConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAggregationServiceConfigurationApi apiInstance = new ManagementPlaneApiAggregationServiceConfigurationApi();
GlobalCollectionConfiguration body = new GlobalCollectionConfiguration(); // GlobalCollectionConfiguration | 
try {
    GlobalCollectionConfiguration result = apiInstance.updateAggregationServiceGlobalConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAggregationServiceConfigurationApi#updateAggregationServiceGlobalConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GlobalCollectionConfiguration**](GlobalCollectionConfiguration.md)|  |

### Return type

[**GlobalCollectionConfiguration**](GlobalCollectionConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFeatureStackConfiguration"></a>
# **updateFeatureStackConfiguration**
> FeatureStackCollectionConfiguration updateFeatureStackConfiguration(body, featureStackName)

Update health performance monitoring configuration for feature stack

Apply the data collection configuration for the specified feature stack. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAggregationServiceConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAggregationServiceConfigurationApi apiInstance = new ManagementPlaneApiAggregationServiceConfigurationApi();
FeatureStackCollectionConfiguration body = new FeatureStackCollectionConfiguration(); // FeatureStackCollectionConfiguration | 
String featureStackName = "featureStackName_example"; // String | 
try {
    FeatureStackCollectionConfiguration result = apiInstance.updateFeatureStackConfiguration(body, featureStackName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAggregationServiceConfigurationApi#updateFeatureStackConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FeatureStackCollectionConfiguration**](FeatureStackCollectionConfiguration.md)|  |
 **featureStackName** | **String**|  |

### Return type

[**FeatureStackCollectionConfiguration**](FeatureStackCollectionConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

