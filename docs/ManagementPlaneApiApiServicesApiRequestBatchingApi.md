# ManagementPlaneApiApiServicesApiRequestBatchingApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerBatchRequest**](ManagementPlaneApiApiServicesApiRequestBatchingApi.md#registerBatchRequest) | **POST** /batch | Register a Collection of API Calls at a Single End Point

<a name="registerBatchRequest"></a>
# **registerBatchRequest**
> BatchResponse registerBatchRequest(body, atomic)

Register a Collection of API Calls at a Single End Point

Enables you to make multiple API requests using a single request. The batch API takes in an array of logical HTTP requests represented as JSON arrays. Each request has a method (GET, PUT, POST, or DELETE), a relative_url (the portion of the URL after https://&amp;lt;nsx-mgr&amp;gt;/api/), optional headers array (corresponding to HTTP headers) and an optional body (for POST and PUT requests). The batch API returns an array of logical HTTP responses represented as JSON arrays. Each response has a status code, an optional headers array and an optional body (which is a JSON-encoded string). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiApiServicesApiRequestBatchingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiApiServicesApiRequestBatchingApi apiInstance = new ManagementPlaneApiApiServicesApiRequestBatchingApi();
BatchRequest body = new BatchRequest(); // BatchRequest | 
Boolean atomic = true; // Boolean | transactional atomicity for the batch of requests embedded in the batch list
try {
    BatchResponse result = apiInstance.registerBatchRequest(body, atomic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiApiServicesApiRequestBatchingApi#registerBatchRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BatchRequest**](BatchRequest.md)|  |
 **atomic** | **Boolean**| transactional atomicity for the batch of requests embedded in the batch list | [optional]

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

