# ManagementPlaneApiCapacityDashboardApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCapacityThresholds**](ManagementPlaneApiCapacityDashboardApi.md#getCapacityThresholds) | **GET** /capacity/threshold | Returns warning threshold(s) set for NSX Objects.
[**getCapacityUsage**](ManagementPlaneApiCapacityDashboardApi.md#getCapacityUsage) | **GET** /capacity/usage | Returns capacity usage data for NSX objects
[**updateCapacityThresholds**](ManagementPlaneApiCapacityDashboardApi.md#updateCapacityThresholds) | **PUT** /capacity/threshold | Updates the warning threshold(s) for NSX Objects.

<a name="getCapacityThresholds"></a>
# **getCapacityThresholds**
> CapacityThresholdList getCapacityThresholds()

Returns warning threshold(s) set for NSX Objects.

Returns warning threshold(s) set for NSX Objects.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiCapacityDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiCapacityDashboardApi apiInstance = new ManagementPlaneApiCapacityDashboardApi();
try {
    CapacityThresholdList result = apiInstance.getCapacityThresholds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiCapacityDashboardApi#getCapacityThresholds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CapacityThresholdList**](CapacityThresholdList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCapacityUsage"></a>
# **getCapacityUsage**
> CapacityUsageResponse getCapacityUsage(category, cursor, force, includedFields, pageSize, sortAscending, sortBy)

Returns capacity usage data for NSX objects

Returns capacity usage data for NSX objects

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiCapacityDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiCapacityDashboardApi apiInstance = new ManagementPlaneApiCapacityDashboardApi();
String category = "category_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean force = true; // Boolean | 
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    CapacityUsageResponse result = apiInstance.getCapacityUsage(category, cursor, force, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiCapacityDashboardApi#getCapacityUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**|  | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **force** | **Boolean**|  | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**CapacityUsageResponse**](CapacityUsageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCapacityThresholds"></a>
# **updateCapacityThresholds**
> CapacityThresholdList updateCapacityThresholds(body)

Updates the warning threshold(s) for NSX Objects.

Updates the warning threshold(s) for NSX Objects specified, and returns new threshold(s). Threshold list in the request must contain value for GLOBAL_DEFAULT threshold_type which represents global thresholds. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiCapacityDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiCapacityDashboardApi apiInstance = new ManagementPlaneApiCapacityDashboardApi();
CapacityThresholdList body = new CapacityThresholdList(); // CapacityThresholdList | 
try {
    CapacityThresholdList result = apiInstance.updateCapacityThresholds(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiCapacityDashboardApi#updateCapacityThresholds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CapacityThresholdList**](CapacityThresholdList.md)|  |

### Return type

[**CapacityThresholdList**](CapacityThresholdList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

