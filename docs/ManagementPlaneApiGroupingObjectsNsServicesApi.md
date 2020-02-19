# ManagementPlaneApiGroupingObjectsNsServicesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNSService**](ManagementPlaneApiGroupingObjectsNsServicesApi.md#createNSService) | **POST** /ns-services | Create NSService
[**deleteNSService**](ManagementPlaneApiGroupingObjectsNsServicesApi.md#deleteNSService) | **DELETE** /ns-services/{ns-service-id} | Delete NSService
[**listNSServices**](ManagementPlaneApiGroupingObjectsNsServicesApi.md#listNSServices) | **GET** /ns-services | List all NSServices
[**readNSService**](ManagementPlaneApiGroupingObjectsNsServicesApi.md#readNSService) | **GET** /ns-services/{ns-service-id} | Read NSService
[**updateNSService**](ManagementPlaneApiGroupingObjectsNsServicesApi.md#updateNSService) | **PUT** /ns-services/{ns-service-id} | Update NSService

<a name="createNSService"></a>
# **createNSService**
> NSService createNSService(body)

Create NSService

Creates a new NSService which allows users to specify characteristics to use for matching network traffic. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServicesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServicesApi();
NSService body = new NSService(); // NSService | 
try {
    NSService result = apiInstance.createNSService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServicesApi#createNSService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSService**](NSService.md)|  |

### Return type

[**NSService**](NSService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNSService"></a>
# **deleteNSService**
> deleteNSService(nsServiceId, force)

Delete NSService

Deletes the specified NSService. By default, if the NSService is being referred in an NSServiceGroup, it can&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as a parameter to force delete the NSService. System defined NSServices can&#x27;t be deleted using \&quot;force\&quot; flag. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServicesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServicesApi();
String nsServiceId = "nsServiceId_example"; // String | NSService Id
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteNSService(nsServiceId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServicesApi#deleteNSService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsServiceId** | **String**| NSService Id |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNSServices"></a>
# **listNSServices**
> NSServiceListResult listNSServices(cursor, defaultService, includedFields, pageSize, sortAscending, sortBy)

List all NSServices

Returns paginated list of NSServices 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServicesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServicesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean defaultService = true; // Boolean | Fetch all default NSServices
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NSServiceListResult result = apiInstance.listNSServices(cursor, defaultService, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServicesApi#listNSServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **defaultService** | **Boolean**| Fetch all default NSServices | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NSServiceListResult**](NSServiceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNSService"></a>
# **readNSService**
> NSService readNSService(nsServiceId)

Read NSService

Returns information about the specified NSService 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServicesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServicesApi();
String nsServiceId = "nsServiceId_example"; // String | NSService Id
try {
    NSService result = apiInstance.readNSService(nsServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServicesApi#readNSService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsServiceId** | **String**| NSService Id |

### Return type

[**NSService**](NSService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNSService"></a>
# **updateNSService**
> NSService updateNSService(body, nsServiceId)

Update NSService

Updates the specified NSService. Modifiable parameters include the description, display_name and the NSService element. The system defined NSServices can&#x27;t be modified 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsServicesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsServicesApi();
NSService body = new NSService(); // NSService | 
String nsServiceId = "nsServiceId_example"; // String | NSService Id
try {
    NSService result = apiInstance.updateNSService(body, nsServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsServicesApi#updateNSService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSService**](NSService.md)|  |
 **nsServiceId** | **String**| NSService Id |

### Return type

[**NSService**](NSService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

