# ManagementPlaneApiLicensingApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptEULA**](ManagementPlaneApiLicensingApi.md#acceptEULA) | **POST** /eula/accept | Accept end user license agreement 
[**createLicense**](ManagementPlaneApiLicensingApi.md#createLicense) | **POST** /licenses | Add a new license key
[**deleteLicense**](ManagementPlaneApiLicensingApi.md#deleteLicense) | **DELETE** /licenses/{license-key} | Deprecated. Remove a license identified by the license-key
[**deleteLicenseKeyDelete**](ManagementPlaneApiLicensingApi.md#deleteLicenseKeyDelete) | **POST** /licenses?action&#x3D;delete | Remove a license
[**getEULAAcceptance**](ManagementPlaneApiLicensingApi.md#getEULAAcceptance) | **GET** /eula/acceptance | Return the acceptance status of end user license agreement 
[**getEULAContent**](ManagementPlaneApiLicensingApi.md#getEULAContent) | **GET** /eula/content | Return the content of end user license agreement 
[**getLicense**](ManagementPlaneApiLicensingApi.md#getLicense) | **GET** /license | Deprecated. Return the Enterprise License 
[**getLicenseByKey**](ManagementPlaneApiLicensingApi.md#getLicenseByKey) | **GET** /licenses/{license-key} | Deprecated. Get license properties for license identified by the license-key
[**getLicenseUsageReport**](ManagementPlaneApiLicensingApi.md#getLicenseUsageReport) | **GET** /licenses/licenses-usage | Get usage report of all registered modules
[**getLicenseUsageReportInCsvFormatCsv**](ManagementPlaneApiLicensingApi.md#getLicenseUsageReportInCsvFormatCsv) | **GET** /licenses/licenses-usage?format&#x3D;csv | Get usage report of all registred modules in CSV format
[**getLicenses**](ManagementPlaneApiLicensingApi.md#getLicenses) | **GET** /licenses | Get all licenses
[**updateLicense**](ManagementPlaneApiLicensingApi.md#updateLicense) | **PUT** /license | Deprecated. Assign an Updated Enterprise License Key 

<a name="acceptEULA"></a>
# **acceptEULA**
> acceptEULA()

Accept end user license agreement 

Accept end user license agreement 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
try {
    apiInstance.acceptEULA();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#acceptEULA");
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

<a name="createLicense"></a>
# **createLicense**
> License createLicense(body)

Add a new license key

This will add a license key to the system. The API supports adding only one license key for each license edition type - Standard, Advanced or Enterprise. If a new license key is tried to add for an edition for which the license key already exists, then this API will return an error. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
License body = new License(); // License | 
try {
    License result = apiInstance.createLicense(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#createLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**License**](License.md)|  |

### Return type

[**License**](License.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLicense"></a>
# **deleteLicense**
> deleteLicense(licenseKey)

Deprecated. Remove a license identified by the license-key

Deprecated. Use POST /licenses?action&#x3D;delete API instead. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
String licenseKey = "licenseKey_example"; // String | 
try {
    apiInstance.deleteLicense(licenseKey);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#deleteLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseKey** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLicenseKeyDelete"></a>
# **deleteLicenseKeyDelete**
> deleteLicenseKeyDelete(body)

Remove a license

This will delete the license key identified in the request body by \&quot;license_key\&quot; and its properties from the system. Attempting to delete the last license key will result in an error. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
License body = new License(); // License | 
try {
    apiInstance.deleteLicenseKeyDelete(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#deleteLicenseKeyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**License**](License.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEULAAcceptance"></a>
# **getEULAAcceptance**
> EULAAcceptance getEULAAcceptance()

Return the acceptance status of end user license agreement 

Return the acceptance status of end user license agreement 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
try {
    EULAAcceptance result = apiInstance.getEULAAcceptance();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#getEULAAcceptance");
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

<a name="getEULAContent"></a>
# **getEULAContent**
> EULAContent getEULAContent(cursor, includedFields, pageSize, sortAscending, sortBy, valueFormat)

Return the content of end user license agreement 

Return the content of end user license agreement in the specified format. By default, it&#x27;s pure string without line break 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String valueFormat = "valueFormat_example"; // String | End User License Agreement content output format
try {
    EULAContent result = apiInstance.getEULAContent(cursor, includedFields, pageSize, sortAscending, sortBy, valueFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#getEULAContent");
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

<a name="getLicense"></a>
# **getLicense**
> License getLicense()

Deprecated. Return the Enterprise License 

Deprecated. Use the GET /licenses API instead. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
try {
    License result = apiInstance.getLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#getLicense");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**License**](License.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLicenseByKey"></a>
# **getLicenseByKey**
> License getLicenseByKey(licenseKey)

Deprecated. Get license properties for license identified by the license-key

Deprecated. Use GET /licenses API instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
String licenseKey = "licenseKey_example"; // String | 
try {
    License result = apiInstance.getLicenseByKey(licenseKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#getLicenseByKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseKey** | **String**|  |

### Return type

[**License**](License.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLicenseUsageReport"></a>
# **getLicenseUsageReport**
> FeatureUsageList getLicenseUsageReport()

Get usage report of all registered modules

Returns usage report of all registered modules 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
try {
    FeatureUsageList result = apiInstance.getLicenseUsageReport();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#getLicenseUsageReport");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FeatureUsageList**](FeatureUsageList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLicenseUsageReportInCsvFormatCsv"></a>
# **getLicenseUsageReportInCsvFormatCsv**
> FeatureUsageListInCsvFormat getLicenseUsageReportInCsvFormatCsv()

Get usage report of all registred modules in CSV format

Returns usage report of all registered modules in CSV format 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
try {
    FeatureUsageListInCsvFormat result = apiInstance.getLicenseUsageReportInCsvFormatCsv();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#getLicenseUsageReportInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FeatureUsageListInCsvFormat**](FeatureUsageListInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLicenses"></a>
# **getLicenses**
> LicensesListResult getLicenses()

Get all licenses

Returns all licenses. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
try {
    LicensesListResult result = apiInstance.getLicenses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#getLicenses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicensesListResult**](LicensesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLicense"></a>
# **updateLicense**
> License updateLicense(body)

Deprecated. Assign an Updated Enterprise License Key 

Deprecated. Use the POST /licenses API instead 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLicensingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLicensingApi apiInstance = new ManagementPlaneApiLicensingApi();
License body = new License(); // License | 
try {
    License result = apiInstance.updateLicense(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLicensingApi#updateLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**License**](License.md)|  |

### Return type

[**License**](License.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

