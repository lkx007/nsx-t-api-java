# ManagementPlaneApiOperationsIpfixApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIpfixCollectorConfig**](ManagementPlaneApiOperationsIpfixApi.md#createIpfixCollectorConfig) | **POST** /ipfix/collectorconfigs | Create a new IPFIX collector configuration
[**createIpfixConfig**](ManagementPlaneApiOperationsIpfixApi.md#createIpfixConfig) | **POST** /ipfix/configs | Create a new IPFIX configuration
[**deleteIpfixCollectorConfig**](ManagementPlaneApiOperationsIpfixApi.md#deleteIpfixCollectorConfig) | **DELETE** /ipfix/collectorconfigs/{collector-config-id} | Delete an existing IPFIX collector configuration
[**deleteIpfixConfig**](ManagementPlaneApiOperationsIpfixApi.md#deleteIpfixConfig) | **DELETE** /ipfix/configs/{config-id} | Delete an existing IPFIX configuration
[**getIpfixCollectorConfig**](ManagementPlaneApiOperationsIpfixApi.md#getIpfixCollectorConfig) | **GET** /ipfix/collectorconfigs/{collector-config-id} | Get an existing IPFIX collector configuration
[**getIpfixConfig**](ManagementPlaneApiOperationsIpfixApi.md#getIpfixConfig) | **GET** /ipfix/configs/{config-id} | Get an existing IPFIX configuration
[**listIpfixCollectorConfig**](ManagementPlaneApiOperationsIpfixApi.md#listIpfixCollectorConfig) | **GET** /ipfix/collectorconfigs | List IPFIX collector configurations
[**listIpfixConfig**](ManagementPlaneApiOperationsIpfixApi.md#listIpfixConfig) | **GET** /ipfix/configs | List IPFIX configuration
[**updateIpfixCollectorConfig**](ManagementPlaneApiOperationsIpfixApi.md#updateIpfixCollectorConfig) | **PUT** /ipfix/collectorconfigs/{collector-config-id} | Update an existing IPFIX collector configuration
[**updateIpfixConfig**](ManagementPlaneApiOperationsIpfixApi.md#updateIpfixConfig) | **PUT** /ipfix/configs/{config-id} | Update an existing IPFIX configuration

<a name="createIpfixCollectorConfig"></a>
# **createIpfixCollectorConfig**
> IpfixCollectorConfig createIpfixCollectorConfig(body)

Create a new IPFIX collector configuration

Create a new IPFIX collector configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
IpfixCollectorConfig body = new IpfixCollectorConfig(); // IpfixCollectorConfig | 
try {
    IpfixCollectorConfig result = apiInstance.createIpfixCollectorConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#createIpfixCollectorConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixCollectorConfig**](IpfixCollectorConfig.md)|  |

### Return type

[**IpfixCollectorConfig**](IpfixCollectorConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIpfixConfig"></a>
# **createIpfixConfig**
> IpfixConfig createIpfixConfig(body)

Create a new IPFIX configuration

Create a new IPFIX configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
IpfixConfig body = new IpfixConfig(); // IpfixConfig | 
try {
    IpfixConfig result = apiInstance.createIpfixConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#createIpfixConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixConfig**](IpfixConfig.md)|  |

### Return type

[**IpfixConfig**](IpfixConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIpfixCollectorConfig"></a>
# **deleteIpfixCollectorConfig**
> deleteIpfixCollectorConfig(collectorConfigId)

Delete an existing IPFIX collector configuration

Delete an existing IPFIX collector configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
String collectorConfigId = "collectorConfigId_example"; // String | 
try {
    apiInstance.deleteIpfixCollectorConfig(collectorConfigId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#deleteIpfixCollectorConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectorConfigId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIpfixConfig"></a>
# **deleteIpfixConfig**
> deleteIpfixConfig(configId)

Delete an existing IPFIX configuration

Delete an existing IPFIX configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
String configId = "configId_example"; // String | 
try {
    apiInstance.deleteIpfixConfig(configId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#deleteIpfixConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIpfixCollectorConfig"></a>
# **getIpfixCollectorConfig**
> IpfixCollectorConfig getIpfixCollectorConfig(collectorConfigId)

Get an existing IPFIX collector configuration

Get an existing IPFIX collector configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
String collectorConfigId = "collectorConfigId_example"; // String | 
try {
    IpfixCollectorConfig result = apiInstance.getIpfixCollectorConfig(collectorConfigId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#getIpfixCollectorConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectorConfigId** | **String**|  |

### Return type

[**IpfixCollectorConfig**](IpfixCollectorConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIpfixConfig"></a>
# **getIpfixConfig**
> IpfixConfig getIpfixConfig(configId)

Get an existing IPFIX configuration

Get an existing IPFIX configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
String configId = "configId_example"; // String | 
try {
    IpfixConfig result = apiInstance.getIpfixConfig(configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#getIpfixConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **String**|  |

### Return type

[**IpfixConfig**](IpfixConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpfixCollectorConfig"></a>
# **listIpfixCollectorConfig**
> IpfixCollectorConfigListResult listIpfixCollectorConfig(cursor, includedFields, pageSize, sortAscending, sortBy)

List IPFIX collector configurations

List IPFIX collector configurations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IpfixCollectorConfigListResult result = apiInstance.listIpfixCollectorConfig(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#listIpfixCollectorConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IpfixCollectorConfigListResult**](IpfixCollectorConfigListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpfixConfig"></a>
# **listIpfixConfig**
> IpfixConfigListResult listIpfixConfig(appliedTo, cursor, includedFields, ipfixConfigType, pageSize, sortAscending, sortBy)

List IPFIX configuration

List IPFIX configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
String appliedTo = "appliedTo_example"; // String | Applied To
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String ipfixConfigType = "ipfixConfigType_example"; // String | Supported IPFIX Config Types.
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IpfixConfigListResult result = apiInstance.listIpfixConfig(appliedTo, cursor, includedFields, ipfixConfigType, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#listIpfixConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliedTo** | **String**| Applied To | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **ipfixConfigType** | **String**| Supported IPFIX Config Types. | [optional] [enum: IpfixSwitchConfig, IpfixDfwConfig]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IpfixConfigListResult**](IpfixConfigListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIpfixCollectorConfig"></a>
# **updateIpfixCollectorConfig**
> IpfixCollectorConfig updateIpfixCollectorConfig(body, collectorConfigId)

Update an existing IPFIX collector configuration

Update an existing IPFIX collector configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
IpfixCollectorConfig body = new IpfixCollectorConfig(); // IpfixCollectorConfig | 
String collectorConfigId = "collectorConfigId_example"; // String | 
try {
    IpfixCollectorConfig result = apiInstance.updateIpfixCollectorConfig(body, collectorConfigId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#updateIpfixCollectorConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixCollectorConfig**](IpfixCollectorConfig.md)|  |
 **collectorConfigId** | **String**|  |

### Return type

[**IpfixCollectorConfig**](IpfixCollectorConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIpfixConfig"></a>
# **updateIpfixConfig**
> IpfixConfig updateIpfixConfig(body, configId)

Update an existing IPFIX configuration

Update an existing IPFIX configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsIpfixApi apiInstance = new ManagementPlaneApiOperationsIpfixApi();
IpfixConfig body = new IpfixConfig(); // IpfixConfig | 
String configId = "configId_example"; // String | 
try {
    IpfixConfig result = apiInstance.updateIpfixConfig(body, configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsIpfixApi#updateIpfixConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixConfig**](IpfixConfig.md)|  |
 **configId** | **String**|  |

### Return type

[**IpfixConfig**](IpfixConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

