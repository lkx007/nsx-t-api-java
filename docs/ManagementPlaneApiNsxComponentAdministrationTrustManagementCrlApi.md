# ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCrlImport**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#addCrlImport) | **POST** /trust-management/crls?action&#x3D;import | Add a New Certificate Revocation List
[**createCrlDistributionPoint**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#createCrlDistributionPoint) | **POST** /trust-management/crl-distribution-points | Create a Crl Distribution Point
[**deleteCrl**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#deleteCrl) | **DELETE** /trust-management/crls/{crl-id} | Delete a CRL
[**deleteCrlDistributionPoint**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#deleteCrlDistributionPoint) | **DELETE** /trust-management/crl-distribution-points/{crl-distribution-point-id} | Delete a CrlDistributionPoint
[**getCrl**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#getCrl) | **GET** /trust-management/crls/{crl-id} | Show CRL Data for the Given CRL ID
[**getCrlDistributionPoint**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#getCrlDistributionPoint) | **GET** /trust-management/crl-distribution-points/{crl-distribution-point-id} | Return the CrlDistributionPoint with &lt;crl-distribution-point-id&gt;
[**getCrlDistributionPointPem**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#getCrlDistributionPointPem) | **POST** /trust-management/crl-distribution-points/pem-file | Return stored CRL in PEM format
[**getCrlDistributionPointStatus**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#getCrlDistributionPointStatus) | **GET** /trust-management/crl-distribution-points/{crl-distribution-point-id}/status | Return the status of the CrlDistributionPoint
[**getCrls**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#getCrls) | **GET** /trust-management/crls | Return All Added CRLs
[**getTrustObjects**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#getTrustObjects) | **GET** /trust-management | Return the Properties of a Trust Manager
[**listCrlDistributionPoints**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#listCrlDistributionPoints) | **GET** /trust-management/crl-distribution-points | Return the list of CrlDistributionPoints
[**updateCrl**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#updateCrl) | **PUT** /trust-management/crls/{crl-id} | Update CRL for the Given CRL ID
[**updateCrlDistributionPoint**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi.md#updateCrlDistributionPoint) | **PUT** /trust-management/crl-distribution-points/{crl-distribution-point-id} | Update CrlDistributionPoint with &lt;crl-distribution-point-id&gt; This allows updating the ManagedResource fields. 

<a name="addCrlImport"></a>
# **addCrlImport**
> CrlList addCrlImport(body)

Add a New Certificate Revocation List

Adds a new certificate revocation list (CRL). The CRL is used to verify the client certificate status against the revocation lists published by the CA. For this reason, the administrator needs to add the CRL in certificate repository as well. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
CrlObjectData body = new CrlObjectData(); // CrlObjectData | 
try {
    CrlList result = apiInstance.addCrlImport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#addCrlImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrlObjectData**](CrlObjectData.md)|  |

### Return type

[**CrlList**](CrlList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCrlDistributionPoint"></a>
# **createCrlDistributionPoint**
> CrlDistributionPoint createCrlDistributionPoint(body)

Create a Crl Distribution Point

Create an entity that will represent a Crl Distribution Point 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
CrlDistributionPoint body = new CrlDistributionPoint(); // CrlDistributionPoint | 
try {
    CrlDistributionPoint result = apiInstance.createCrlDistributionPoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#createCrlDistributionPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrlDistributionPoint**](CrlDistributionPoint.md)|  |

### Return type

[**CrlDistributionPoint**](CrlDistributionPoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCrl"></a>
# **deleteCrl**
> deleteCrl(crlId)

Delete a CRL

Deletes an existing CRL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
String crlId = "crlId_example"; // String | ID of CRL to delete
try {
    apiInstance.deleteCrl(crlId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#deleteCrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crlId** | **String**| ID of CRL to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCrlDistributionPoint"></a>
# **deleteCrlDistributionPoint**
> deleteCrlDistributionPoint(crlDistributionPointId)

Delete a CrlDistributionPoint

Delete a CrlDistributionPoint. It does not delete the actual CRL. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
String crlDistributionPointId = "crlDistributionPointId_example"; // String | Unique id of the CrlDistributionPoint to delete
try {
    apiInstance.deleteCrlDistributionPoint(crlDistributionPointId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#deleteCrlDistributionPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crlDistributionPointId** | **String**| Unique id of the CrlDistributionPoint to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCrl"></a>
# **getCrl**
> Crl getCrl(crlId, details)

Show CRL Data for the Given CRL ID

Returns information about the specified CRL. For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
String crlId = "crlId_example"; // String | ID of CRL to read
Boolean details = true; // Boolean | whether to expand the pem data and show all its details
try {
    Crl result = apiInstance.getCrl(crlId, details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#getCrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crlId** | **String**| ID of CRL to read |
 **details** | **Boolean**| whether to expand the pem data and show all its details | [optional]

### Return type

[**Crl**](Crl.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCrlDistributionPoint"></a>
# **getCrlDistributionPoint**
> CrlDistributionPoint getCrlDistributionPoint(crlDistributionPointId)

Return the CrlDistributionPoint with &lt;crl-distribution-point-id&gt;

Return the CrlDistributionPoint with &lt;crl-distribution-point-id&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
String crlDistributionPointId = "crlDistributionPointId_example"; // String | 
try {
    CrlDistributionPoint result = apiInstance.getCrlDistributionPoint(crlDistributionPointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#getCrlDistributionPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crlDistributionPointId** | **String**|  |

### Return type

[**CrlDistributionPoint**](CrlDistributionPoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCrlDistributionPointPem"></a>
# **getCrlDistributionPointPem**
> String getCrlDistributionPointPem(body)

Return stored CRL in PEM format

Return stored CRL in PEM format

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
CrlPemRequestType body = new CrlPemRequestType(); // CrlPemRequestType | 
try {
    String result = apiInstance.getCrlDistributionPointPem(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#getCrlDistributionPointPem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrlPemRequestType**](CrlPemRequestType.md)|  |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain;charset=UTF-8

<a name="getCrlDistributionPointStatus"></a>
# **getCrlDistributionPointStatus**
> CrlDistributionPointStatus getCrlDistributionPointStatus(crlDistributionPointId)

Return the status of the CrlDistributionPoint

Return the status of the CrlDistributionPoint

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
String crlDistributionPointId = "crlDistributionPointId_example"; // String | 
try {
    CrlDistributionPointStatus result = apiInstance.getCrlDistributionPointStatus(crlDistributionPointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#getCrlDistributionPointStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crlDistributionPointId** | **String**|  |

### Return type

[**CrlDistributionPointStatus**](CrlDistributionPointStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCrls"></a>
# **getCrls**
> CrlList getCrls(cursor, details, includedFields, pageSize, sortAscending, sortBy, type)

Return All Added CRLs

Returns information about all CRLs. For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean details = true; // Boolean | whether to expand the pem data and show all its details
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String type = "type_example"; // String | Type of certificate to return
try {
    CrlList result = apiInstance.getCrls(cursor, details, includedFields, pageSize, sortAscending, sortBy, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#getCrls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **details** | **Boolean**| whether to expand the pem data and show all its details | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **type** | **String**| Type of certificate to return | [optional] [enum: cluster_api_certificate]

### Return type

[**CrlList**](CrlList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrustObjects"></a>
# **getTrustObjects**
> TrustManagementData getTrustObjects()

Return the Properties of a Trust Manager

Returns information about the supported algorithms and key sizes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
try {
    TrustManagementData result = apiInstance.getTrustObjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#getTrustObjects");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TrustManagementData**](TrustManagementData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCrlDistributionPoints"></a>
# **listCrlDistributionPoints**
> CrlDistributionPointList listCrlDistributionPoints(cursor, includedFields, pageSize, sortAscending, sortBy)

Return the list of CrlDistributionPoints

Return the list of CrlDistributionPoints

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    CrlDistributionPointList result = apiInstance.listCrlDistributionPoints(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#listCrlDistributionPoints");
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

[**CrlDistributionPointList**](CrlDistributionPointList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCrl"></a>
# **updateCrl**
> Crl updateCrl(body, crlId)

Update CRL for the Given CRL ID

Updates an existing CRL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
Crl body = new Crl(); // Crl | 
String crlId = "crlId_example"; // String | ID of CRL to update
try {
    Crl result = apiInstance.updateCrl(body, crlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#updateCrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Crl**](Crl.md)|  |
 **crlId** | **String**| ID of CRL to update |

### Return type

[**Crl**](Crl.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCrlDistributionPoint"></a>
# **updateCrlDistributionPoint**
> CrlDistributionPoint updateCrlDistributionPoint(body, crlDistributionPointId)

Update CrlDistributionPoint with &lt;crl-distribution-point-id&gt; This allows updating the ManagedResource fields. 

Update CrlDistributionPoint with &lt;crl-distribution-point-id&gt; This allows updating the ManagedResource fields. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi();
CrlDistributionPoint body = new CrlDistributionPoint(); // CrlDistributionPoint | 
String crlDistributionPointId = "crlDistributionPointId_example"; // String | 
try {
    CrlDistributionPoint result = apiInstance.updateCrlDistributionPoint(body, crlDistributionPointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCrlApi#updateCrlDistributionPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrlDistributionPoint**](CrlDistributionPoint.md)|  |
 **crlDistributionPointId** | **String**|  |

### Return type

[**CrlDistributionPoint**](CrlDistributionPoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

