# ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCsr**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi.md#deleteCsr) | **DELETE** /trust-management/csrs/{csr-id} | Delete a CSR
[**generateCsr**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi.md#generateCsr) | **POST** /trust-management/csrs | Generate a New Certificate Signing Request
[**getCsr**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi.md#getCsr) | **GET** /trust-management/csrs/{csr-id} | Show CSR Data for the Given CSR ID
[**getCsrPem**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi.md#getCsrPem) | **GET** /trust-management/csrs/{csr-id}/pem-file | Get CSR PEM File for the Given CSR ID
[**getCsrs**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi.md#getCsrs) | **GET** /trust-management/csrs | Return All the Generated CSRs
[**importCertificateImport**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi.md#importCertificateImport) | **POST** /trust-management/csrs/{csr-id}?action&#x3D;import | Import a Certificate Associated with an Approved CSR
[**selfSignCertificateSelfSign**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi.md#selfSignCertificateSelfSign) | **POST** /trust-management/csrs/{csr-id}?action&#x3D;self_sign | Self-Sign the CSR

<a name="deleteCsr"></a>
# **deleteCsr**
> deleteCsr(csrId)

Delete a CSR

Removes a specified CSR. If a CSR is not used for verification, you can delete it. Note that the CSR import and upload POST actions automatically delete the associated CSR. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi();
String csrId = "csrId_example"; // String | ID of CSR to delete
try {
    apiInstance.deleteCsr(csrId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi#deleteCsr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csrId** | **String**| ID of CSR to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="generateCsr"></a>
# **generateCsr**
> Csr generateCsr(body)

Generate a New Certificate Signing Request

Creates a new certificate signing request (CSR). A CSR is encrypted text that contains information about your organization (organization name, country, and so on) and your Web server&#x27;s public key, which is a public certificate the is generated on the server that can be used to forward this request to a certificate authority (CA). A private key is also usually created at the same time as the CSR. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi();
Csr body = new Csr(); // Csr | 
try {
    Csr result = apiInstance.generateCsr(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi#generateCsr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Csr**](Csr.md)|  |

### Return type

[**Csr**](Csr.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCsr"></a>
# **getCsr**
> Csr getCsr(csrId)

Show CSR Data for the Given CSR ID

Returns information about the specified CSR.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi();
String csrId = "csrId_example"; // String | ID of CSR to read
try {
    Csr result = apiInstance.getCsr(csrId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi#getCsr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csrId** | **String**| ID of CSR to read |

### Return type

[**Csr**](Csr.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCsrPem"></a>
# **getCsrPem**
> String getCsrPem(csrId)

Get CSR PEM File for the Given CSR ID

Downloads the CSR PEM file for a specified CSR. Clients must include an Accept: text/plain request header.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi();
String csrId = "csrId_example"; // String | ID of CSR to read
try {
    String result = apiInstance.getCsrPem(csrId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi#getCsrPem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csrId** | **String**| ID of CSR to read |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain;charset=UTF-8

<a name="getCsrs"></a>
# **getCsrs**
> CsrList getCsrs(cursor, includedFields, pageSize, sortAscending, sortBy)

Return All the Generated CSRs

Returns information about all of the CSRs that have been created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    CsrList result = apiInstance.getCsrs(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi#getCsrs");
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

[**CsrList**](CsrList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importCertificateImport"></a>
# **importCertificateImport**
> CertificateList importCertificateImport(body, csrId)

Import a Certificate Associated with an Approved CSR

Imports a certificate authority (CA)-signed certificate for a CSR. This action links the certificate to the private key created by the CSR. The pem_encoded string in the request body is the signed certificate provided by your CA in response to the CSR that you provide to them. The import POST action automatically deletes the associated CSR. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi();
TrustObjectData body = new TrustObjectData(); // TrustObjectData | 
String csrId = "csrId_example"; // String | CSR this certificate is associated with
try {
    CertificateList result = apiInstance.importCertificateImport(body, csrId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi#importCertificateImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TrustObjectData**](TrustObjectData.md)|  |
 **csrId** | **String**| CSR this certificate is associated with |

### Return type

[**CertificateList**](CertificateList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfSignCertificateSelfSign"></a>
# **selfSignCertificateSelfSign**
> Certificate selfSignCertificateSelfSign(csrId, daysValid)

Self-Sign the CSR

Self-signs the previously generated CSR. This action is similar to the import certificate action, but instead of using a public certificate signed by a CA, the self_sign POST action uses a certificate that is signed with NSX&#x27;s own private key. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi();
String csrId = "csrId_example"; // String | CSR this certificate is associated with
Long daysValid = 789L; // Long | Number of days the certificate will be valid, default 10 years
try {
    Certificate result = apiInstance.selfSignCertificateSelfSign(csrId, daysValid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCsrApi#selfSignCertificateSelfSign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csrId** | **String**| CSR this certificate is associated with |
 **daysValid** | **Long**| Number of days the certificate will be valid, default 10 years | [enum: ]

### Return type

[**Certificate**](Certificate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

