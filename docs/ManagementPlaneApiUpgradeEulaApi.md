# ManagementPlaneApiUpgradeEulaApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptUpgradeEULA**](ManagementPlaneApiUpgradeEulaApi.md#acceptUpgradeEULA) | **POST** /upgrade/eula/accept | Accept end user license agreement 
[**getUpgradeEULAAcceptance**](ManagementPlaneApiUpgradeEulaApi.md#getUpgradeEULAAcceptance) | **GET** /upgrade/eula/acceptance | Return the acceptance status of end user license agreement 
[**getUpgradeEULAContent**](ManagementPlaneApiUpgradeEulaApi.md#getUpgradeEULAContent) | **GET** /upgrade/eula/content | Return the content of end user license agreement 

<a name="acceptUpgradeEULA"></a>
# **acceptUpgradeEULA**
> acceptUpgradeEULA()

Accept end user license agreement 

Accept end user license agreement 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeEulaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeEulaApi apiInstance = new ManagementPlaneApiUpgradeEulaApi();
try {
    apiInstance.acceptUpgradeEULA();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeEulaApi#acceptUpgradeEULA");
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

<a name="getUpgradeEULAAcceptance"></a>
# **getUpgradeEULAAcceptance**
> EULAAcceptance getUpgradeEULAAcceptance()

Return the acceptance status of end user license agreement 

Return the acceptance status of end user license agreement 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeEulaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeEulaApi apiInstance = new ManagementPlaneApiUpgradeEulaApi();
try {
    EULAAcceptance result = apiInstance.getUpgradeEULAAcceptance();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeEulaApi#getUpgradeEULAAcceptance");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EULAAcceptance**](EULAAcceptance.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeEULAContent"></a>
# **getUpgradeEULAContent**
> EULAContent getUpgradeEULAContent(cursor, includedFields, pageSize, sortAscending, sortBy, valueFormat)

Return the content of end user license agreement 

Return the content of end user license agreement in the specified format. By default, it&#x27;s pure string without line break 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeEulaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeEulaApi apiInstance = new ManagementPlaneApiUpgradeEulaApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String valueFormat = "valueFormat_example"; // String | End User License Agreement content output format
try {
    EULAContent result = apiInstance.getUpgradeEULAContent(cursor, includedFields, pageSize, sortAscending, sortBy, valueFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeEulaApi#getUpgradeEULAContent");
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
 **valueFormat** | **String**| End User License Agreement content output format | [optional]

### Return type

[**EULAContent**](EULAContent.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

