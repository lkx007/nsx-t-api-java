# ManagementPlaneApiUpgradeBundlesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelUpgradeBundleUploadCancelUpload**](ManagementPlaneApiUpgradeBundlesApi.md#cancelUpgradeBundleUploadCancelUpload) | **POST** /upgrade/bundles/{bundle-id}?action&#x3D;cancel_upload | Cancel upgrade bundle upload
[**fetchUpgradeBundleFromUrl**](ManagementPlaneApiUpgradeBundlesApi.md#fetchUpgradeBundleFromUrl) | **POST** /upgrade/bundles | Fetch upgrade bundle from given url
[**getUpgradeBundleInfo**](ManagementPlaneApiUpgradeBundlesApi.md#getUpgradeBundleInfo) | **GET** /upgrade/bundles/{bundle-id} | Get uploaded upgrade bundle information
[**getUpgradeBundleUploadStatus**](ManagementPlaneApiUpgradeBundlesApi.md#getUpgradeBundleUploadStatus) | **GET** /upgrade/bundles/{bundle-id}/upload-status | Get uploaded upgrade bundle upload status
[**uploadUpgradeBundleAsyncUpload**](ManagementPlaneApiUpgradeBundlesApi.md#uploadUpgradeBundleAsyncUpload) | **POST** /upgrade/bundles?action&#x3D;upload | Upload upgrade bundle

<a name="cancelUpgradeBundleUploadCancelUpload"></a>
# **cancelUpgradeBundleUploadCancelUpload**
> cancelUpgradeBundleUploadCancelUpload(bundleId)

Cancel upgrade bundle upload

Cancel upload of upgrade bundle. This API works only when bundle upload is in-progress and will not work during post-processing of upgrade bundle. If bundle upload is in-progress, then the API call returns http OK response after cancelling the upload and deleting partially uploaded bundle. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeBundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeBundlesApi apiInstance = new ManagementPlaneApiUpgradeBundlesApi();
String bundleId = "bundleId_example"; // String | 
try {
    apiInstance.cancelUpgradeBundleUploadCancelUpload(bundleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeBundlesApi#cancelUpgradeBundleUploadCancelUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchUpgradeBundleFromUrl"></a>
# **fetchUpgradeBundleFromUrl**
> UpgradeBundleId fetchUpgradeBundleFromUrl(body)

Fetch upgrade bundle from given url

Fetches the upgrade bundle from url. The call returns after fetch is initiated. Check status by periodically retrieving upgrade bundle upload status using GET /upgrade/bundles/&lt;bundle-id&gt;/upload-status. The upload is complete when the status is SUCCESS. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeBundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeBundlesApi apiInstance = new ManagementPlaneApiUpgradeBundlesApi();
UpgradeBundleFetchRequest body = new UpgradeBundleFetchRequest(); // UpgradeBundleFetchRequest | 
try {
    UpgradeBundleId result = apiInstance.fetchUpgradeBundleFromUrl(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeBundlesApi#fetchUpgradeBundleFromUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpgradeBundleFetchRequest**](UpgradeBundleFetchRequest.md)|  |

### Return type

[**UpgradeBundleId**](UpgradeBundleId.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpgradeBundleInfo"></a>
# **getUpgradeBundleInfo**
> UpgradeBundleInfo getUpgradeBundleInfo(bundleId)

Get uploaded upgrade bundle information

Get uploaded upgrade bundle information 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeBundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeBundlesApi apiInstance = new ManagementPlaneApiUpgradeBundlesApi();
String bundleId = "bundleId_example"; // String | 
try {
    UpgradeBundleInfo result = apiInstance.getUpgradeBundleInfo(bundleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeBundlesApi#getUpgradeBundleInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**|  |

### Return type

[**UpgradeBundleInfo**](UpgradeBundleInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradeBundleUploadStatus"></a>
# **getUpgradeBundleUploadStatus**
> UpgradeBundleUploadStatus getUpgradeBundleUploadStatus(bundleId)

Get uploaded upgrade bundle upload status

Get uploaded upgrade bundle upload status 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeBundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeBundlesApi apiInstance = new ManagementPlaneApiUpgradeBundlesApi();
String bundleId = "bundleId_example"; // String | 
try {
    UpgradeBundleUploadStatus result = apiInstance.getUpgradeBundleUploadStatus(bundleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeBundlesApi#getUpgradeBundleUploadStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**|  |

### Return type

[**UpgradeBundleUploadStatus**](UpgradeBundleUploadStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadUpgradeBundleAsyncUpload"></a>
# **uploadUpgradeBundleAsyncUpload**
> UpgradeBundleId uploadUpgradeBundleAsyncUpload(file)

Upload upgrade bundle

Upload the upgrade bundle. This call returns after upload is completed. You can check bundle processing status periodically by retrieving upgrade bundle upload status to find out if the upload and processing is completed. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUpgradeBundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUpgradeBundlesApi apiInstance = new ManagementPlaneApiUpgradeBundlesApi();
File file = new File("file_example"); // File | 
try {
    UpgradeBundleId result = apiInstance.uploadUpgradeBundleAsyncUpload(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUpgradeBundlesApi#uploadUpgradeBundleAsyncUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |

### Return type

[**UpgradeBundleId**](UpgradeBundleId.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

