# ManagementPlaneApiMigrationFeedbackApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptRecommendedValueInFeedbackAcceptRecommended**](ManagementPlaneApiMigrationFeedbackApi.md#acceptRecommendedValueInFeedbackAcceptRecommended) | **POST** /migration/feedback-response?action&#x3D;accept-recommended | Accept default action for feedbacks
[**getFeedbackRequests**](ManagementPlaneApiMigrationFeedbackApi.md#getFeedbackRequests) | **GET** /migration/feedback-requests | NSX-V feedback details
[**getFeedbackSummary**](ManagementPlaneApiMigrationFeedbackApi.md#getFeedbackSummary) | **GET** /migration/feedback-summary | Feedback request summary
[**getGroupedFeedbackRequests**](ManagementPlaneApiMigrationFeedbackApi.md#getGroupedFeedbackRequests) | **GET** /migration/grouped-feedback-requests | NSX-V feedback details
[**updateFeedbackResponse**](ManagementPlaneApiMigrationFeedbackApi.md#updateFeedbackResponse) | **PUT** /migration/feedback-response | Migration feedback response

<a name="acceptRecommendedValueInFeedbackAcceptRecommended"></a>
# **acceptRecommendedValueInFeedbackAcceptRecommended**
> acceptRecommendedValueInFeedbackAcceptRecommended()

Accept default action for feedbacks

Pick default resolution for all feedback items. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationFeedbackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationFeedbackApi apiInstance = new ManagementPlaneApiMigrationFeedbackApi();
try {
    apiInstance.acceptRecommendedValueInFeedbackAcceptRecommended();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationFeedbackApi#acceptRecommendedValueInFeedbackAcceptRecommended");
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

<a name="getFeedbackRequests"></a>
# **getFeedbackRequests**
> MigrationFeedbackRequestListResult getFeedbackRequests(category, cursor, hash, includedFields, pageSize, sortAscending, sortBy, state, subCategory)

NSX-V feedback details

Get feedback details of NSX-V to be migrated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationFeedbackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationFeedbackApi apiInstance = new ManagementPlaneApiMigrationFeedbackApi();
String category = "category_example"; // String | Category on which feedback request should be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String hash = "hash_example"; // String | Hash based on which feedback request should be filtered
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String state = "state_example"; // String | Filter based on current state of the feedback request
String subCategory = "subCategory_example"; // String | Sub category based on which feedback request should be filtered
try {
    MigrationFeedbackRequestListResult result = apiInstance.getFeedbackRequests(category, cursor, hash, includedFields, pageSize, sortAscending, sortBy, state, subCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationFeedbackApi#getFeedbackRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| Category on which feedback request should be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **hash** | **String**| Hash based on which feedback request should be filtered | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **state** | **String**| Filter based on current state of the feedback request | [optional] [enum: ALL, RESOLVED, UNRESOLVED]
 **subCategory** | **String**| Sub category based on which feedback request should be filtered | [optional]

### Return type

[**MigrationFeedbackRequestListResult**](MigrationFeedbackRequestListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFeedbackSummary"></a>
# **getFeedbackSummary**
> MigrationFeedbackSummaryListResult getFeedbackSummary(cursor, includedFields, pageSize, sortAscending, sortBy)

Feedback request summary

Get feedback summary of NSX-V to be migrated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationFeedbackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationFeedbackApi apiInstance = new ManagementPlaneApiMigrationFeedbackApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    MigrationFeedbackSummaryListResult result = apiInstance.getFeedbackSummary(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationFeedbackApi#getFeedbackSummary");
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

[**MigrationFeedbackSummaryListResult**](MigrationFeedbackSummaryListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupedFeedbackRequests"></a>
# **getGroupedFeedbackRequests**
> GroupedMigrationFeedbackRequestListResult getGroupedFeedbackRequests(category, cursor, hash, includedFields, pageSize, sortAscending, sortBy, state, subCategory)

NSX-V feedback details

Get feedback details of NSX-V to be migrated, grouped by feedback type. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationFeedbackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationFeedbackApi apiInstance = new ManagementPlaneApiMigrationFeedbackApi();
String category = "category_example"; // String | Category on which feedback request should be filtered
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String hash = "hash_example"; // String | Hash based on which feedback request should be filtered
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String state = "state_example"; // String | Filter based on current state of the feedback request
String subCategory = "subCategory_example"; // String | Sub category based on which feedback request should be filtered
try {
    GroupedMigrationFeedbackRequestListResult result = apiInstance.getGroupedFeedbackRequests(category, cursor, hash, includedFields, pageSize, sortAscending, sortBy, state, subCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationFeedbackApi#getGroupedFeedbackRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| Category on which feedback request should be filtered | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **hash** | **String**| Hash based on which feedback request should be filtered | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **state** | **String**| Filter based on current state of the feedback request | [optional] [enum: ALL, RESOLVED, UNRESOLVED]
 **subCategory** | **String**| Sub category based on which feedback request should be filtered | [optional]

### Return type

[**GroupedMigrationFeedbackRequestListResult**](GroupedMigrationFeedbackRequestListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFeedbackResponse"></a>
# **updateFeedbackResponse**
> updateFeedbackResponse(body)

Migration feedback response

Provide response for feedback queries needed for migration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiMigrationFeedbackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiMigrationFeedbackApi apiInstance = new ManagementPlaneApiMigrationFeedbackApi();
MigrationFeedbackResponseList body = new MigrationFeedbackResponseList(); // MigrationFeedbackResponseList | 
try {
    apiInstance.updateFeedbackResponse(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiMigrationFeedbackApi#updateFeedbackResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrationFeedbackResponseList**](MigrationFeedbackResponseList.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

