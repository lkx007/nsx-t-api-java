# ManagementPlaneApiServicesMetadataProxyApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMetadataProxy**](ManagementPlaneApiServicesMetadataProxyApi.md#createMetadataProxy) | **POST** /md-proxies | Create a metadata proxy
[**deleteMetadataProxy**](ManagementPlaneApiServicesMetadataProxyApi.md#deleteMetadataProxy) | **DELETE** /md-proxies/{proxy-id} | Delete a metadata proxy
[**getMetadataProxyStatistics**](ManagementPlaneApiServicesMetadataProxyApi.md#getMetadataProxyStatistics) | **GET** /md-proxies/{proxy-id}/statistics | Get Metadata Proxy statistics with given proxy id
[**getMetadataProxyStatus**](ManagementPlaneApiServicesMetadataProxyApi.md#getMetadataProxyStatus) | **GET** /md-proxies/{proxy-id}/{logical-switch-id}/status | Get Metadata Proxy status with given proxy id and attached logical switch.
[**listMetadataProxy**](ManagementPlaneApiServicesMetadataProxyApi.md#listMetadataProxy) | **GET** /md-proxies | Get a paginated list of metadata proxies
[**readMetadataProxy**](ManagementPlaneApiServicesMetadataProxyApi.md#readMetadataProxy) | **GET** /md-proxies/{proxy-id} | Get a metadata proxy
[**updateMetadataProxy**](ManagementPlaneApiServicesMetadataProxyApi.md#updateMetadataProxy) | **PUT** /md-proxies/{proxy-id} | Update a metadata proxy

<a name="createMetadataProxy"></a>
# **createMetadataProxy**
> MetadataProxy createMetadataProxy(body)

Create a metadata proxy

Create a metadata proxy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesMetadataProxyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesMetadataProxyApi apiInstance = new ManagementPlaneApiServicesMetadataProxyApi();
MetadataProxy body = new MetadataProxy(); // MetadataProxy | 
try {
    MetadataProxy result = apiInstance.createMetadataProxy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesMetadataProxyApi#createMetadataProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataProxy**](MetadataProxy.md)|  |

### Return type

[**MetadataProxy**](MetadataProxy.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMetadataProxy"></a>
# **deleteMetadataProxy**
> deleteMetadataProxy(proxyId)

Delete a metadata proxy

Delete a metadata proxy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesMetadataProxyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesMetadataProxyApi apiInstance = new ManagementPlaneApiServicesMetadataProxyApi();
String proxyId = "proxyId_example"; // String | 
try {
    apiInstance.deleteMetadataProxy(proxyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesMetadataProxyApi#deleteMetadataProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetadataProxyStatistics"></a>
# **getMetadataProxyStatistics**
> MetadataProxyStatistics getMetadataProxyStatistics(proxyId, logicalSwitchId, source)

Get Metadata Proxy statistics with given proxy id

Returns the statistics of the given metatada proxy. If no logical switch is provided, all staticstics of all the logical switches the proxy was attached will be returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesMetadataProxyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesMetadataProxyApi apiInstance = new ManagementPlaneApiServicesMetadataProxyApi();
String proxyId = "proxyId_example"; // String | 
String logicalSwitchId = "logicalSwitchId_example"; // String | The uuid of logical switch
String source = "source_example"; // String | Data source type.
try {
    MetadataProxyStatistics result = apiInstance.getMetadataProxyStatistics(proxyId, logicalSwitchId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesMetadataProxyApi#getMetadataProxyStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyId** | **String**|  |
 **logicalSwitchId** | **String**| The uuid of logical switch | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**MetadataProxyStatistics**](MetadataProxyStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetadataProxyStatus"></a>
# **getMetadataProxyStatus**
> MetadataProxyStatus getMetadataProxyStatus(proxyId, logicalSwitchId)

Get Metadata Proxy status with given proxy id and attached logical switch.

Returns the status of the given metadata proxy and attached logical switch. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesMetadataProxyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesMetadataProxyApi apiInstance = new ManagementPlaneApiServicesMetadataProxyApi();
String proxyId = "proxyId_example"; // String | 
String logicalSwitchId = "logicalSwitchId_example"; // String | 
try {
    MetadataProxyStatus result = apiInstance.getMetadataProxyStatus(proxyId, logicalSwitchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesMetadataProxyApi#getMetadataProxyStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyId** | **String**|  |
 **logicalSwitchId** | **String**|  |

### Return type

[**MetadataProxyStatus**](MetadataProxyStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMetadataProxy"></a>
# **listMetadataProxy**
> MetadataProxyListResult listMetadataProxy(cursor, includedFields, pageSize, sortAscending, sortBy)

Get a paginated list of metadata proxies

Get a paginated list of metadata proxies

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesMetadataProxyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesMetadataProxyApi apiInstance = new ManagementPlaneApiServicesMetadataProxyApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MetadataProxyListResult result = apiInstance.listMetadataProxy(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesMetadataProxyApi#listMetadataProxy");
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

[**MetadataProxyListResult**](MetadataProxyListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readMetadataProxy"></a>
# **readMetadataProxy**
> MetadataProxy readMetadataProxy(proxyId)

Get a metadata proxy

Get a metadata proxy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesMetadataProxyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesMetadataProxyApi apiInstance = new ManagementPlaneApiServicesMetadataProxyApi();
String proxyId = "proxyId_example"; // String | 
try {
    MetadataProxy result = apiInstance.readMetadataProxy(proxyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesMetadataProxyApi#readMetadataProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyId** | **String**|  |

### Return type

[**MetadataProxy**](MetadataProxy.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMetadataProxy"></a>
# **updateMetadataProxy**
> MetadataProxy updateMetadataProxy(body, proxyId)

Update a metadata proxy

Update a metadata proxy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesMetadataProxyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesMetadataProxyApi apiInstance = new ManagementPlaneApiServicesMetadataProxyApi();
MetadataProxy body = new MetadataProxy(); // MetadataProxy | 
String proxyId = "proxyId_example"; // String | 
try {
    MetadataProxy result = apiInstance.updateMetadataProxy(body, proxyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesMetadataProxyApi#updateMetadataProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataProxy**](MetadataProxy.md)|  |
 **proxyId** | **String**|  |

### Return type

[**MetadataProxy**](MetadataProxy.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

