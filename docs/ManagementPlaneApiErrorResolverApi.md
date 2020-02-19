# ManagementPlaneApiErrorResolverApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getErrorResolverInfo**](ManagementPlaneApiErrorResolverApi.md#getErrorResolverInfo) | **GET** /error-resolver/{error_id} | Fetches metadata about the given error_id
[**listErrorResolverInfo**](ManagementPlaneApiErrorResolverApi.md#listErrorResolverInfo) | **GET** /error-resolver | Fetches a list of metadata for all the registered error resolvers
[**resolveErrorResolveError**](ManagementPlaneApiErrorResolverApi.md#resolveErrorResolveError) | **POST** /error-resolver?action&#x3D;resolve_error | Resolves the error

<a name="getErrorResolverInfo"></a>
# **getErrorResolverInfo**
> ErrorResolverInfo getErrorResolverInfo(errorId)

Fetches metadata about the given error_id

Returns some metadata about the given error_id. This includes information of whether there is a resolver present for the given error_id and its associated user input data 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiErrorResolverApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiErrorResolverApi apiInstance = new ManagementPlaneApiErrorResolverApi();
String errorId = "errorId_example"; // String | 
try {
    ErrorResolverInfo result = apiInstance.getErrorResolverInfo(errorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiErrorResolverApi#getErrorResolverInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **errorId** | **String**|  |

### Return type

[**ErrorResolverInfo**](ErrorResolverInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listErrorResolverInfo"></a>
# **listErrorResolverInfo**
> ErrorResolverInfoList listErrorResolverInfo()

Fetches a list of metadata for all the registered error resolvers

Returns a list of metadata for all the error resolvers registered. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiErrorResolverApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiErrorResolverApi apiInstance = new ManagementPlaneApiErrorResolverApi();
try {
    ErrorResolverInfoList result = apiInstance.listErrorResolverInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiErrorResolverApi#listErrorResolverInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ErrorResolverInfoList**](ErrorResolverInfoList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resolveErrorResolveError"></a>
# **resolveErrorResolveError**
> resolveErrorResolveError(body)

Resolves the error

Invokes the corresponding error resolver for the given error(s) present in the payload 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiErrorResolverApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiErrorResolverApi apiInstance = new ManagementPlaneApiErrorResolverApi();
ErrorResolverMetadataList body = new ErrorResolverMetadataList(); // ErrorResolverMetadataList | 
try {
    apiInstance.resolveErrorResolveError(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiErrorResolverApi#resolveErrorResolveError");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ErrorResolverMetadataList**](ErrorResolverMetadataList.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

