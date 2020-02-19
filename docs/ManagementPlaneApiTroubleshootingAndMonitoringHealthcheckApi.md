# ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManualHealthCheck**](ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi.md#createManualHealthCheck) | **POST** /manual-health-checks | Create a new manual health check request
[**deleteManualHealthCheck**](ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi.md#deleteManualHealthCheck) | **DELETE** /manual-health-checks/{manual-health-check-id} | Delete an existing manual health check
[**getManualHealthCheck**](ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi.md#getManualHealthCheck) | **GET** /manual-health-checks/{manual-health-check-id} | Get an existing manual health check
[**listManualHealthChecks**](ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi.md#listManualHealthChecks) | **GET** /manual-health-checks | List manual health checks

<a name="createManualHealthCheck"></a>
# **createManualHealthCheck**
> ManualHealthCheck createManualHealthCheck(body)

Create a new manual health check request

Create a new manual health check request with essential properties. It&#x27;s disallowed to create new one until the count of in-progress manual health check is less than 50. A manual health check will be deleted automatically after finished for 24 hours. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi();
ManualHealthCheck body = new ManualHealthCheck(); // ManualHealthCheck | 
try {
    ManualHealthCheck result = apiInstance.createManualHealthCheck(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi#createManualHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManualHealthCheck**](ManualHealthCheck.md)|  |

### Return type

[**ManualHealthCheck**](ManualHealthCheck.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteManualHealthCheck"></a>
# **deleteManualHealthCheck**
> deleteManualHealthCheck(manualHealthCheckId)

Delete an existing manual health check

Delete an existing manual health check by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi();
String manualHealthCheckId = "manualHealthCheckId_example"; // String | 
try {
    apiInstance.deleteManualHealthCheck(manualHealthCheckId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi#deleteManualHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manualHealthCheckId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManualHealthCheck"></a>
# **getManualHealthCheck**
> ManualHealthCheck getManualHealthCheck(manualHealthCheckId)

Get an existing manual health check

Get an existing manual health check by health check ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi();
String manualHealthCheckId = "manualHealthCheckId_example"; // String | 
try {
    ManualHealthCheck result = apiInstance.getManualHealthCheck(manualHealthCheckId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi#getManualHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manualHealthCheckId** | **String**|  |

### Return type

[**ManualHealthCheck**](ManualHealthCheck.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listManualHealthChecks"></a>
# **listManualHealthChecks**
> ManualHealthCheckListResult listManualHealthChecks(cursor, includedFields, pageSize, sortAscending, sortBy)

List manual health checks

Query manual health checks with list parameters. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ManualHealthCheckListResult result = apiInstance.listManualHealthChecks(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringHealthcheckApi#listManualHealthChecks");
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

[**ManualHealthCheckListResult**](ManualHealthCheckListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

