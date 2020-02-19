# ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCertificateImport**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi.md#addCertificateImport) | **POST** /trust-management/certificates?action&#x3D;import | Add a New Certificate
[**deleteCertificate**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi.md#deleteCertificate) | **DELETE** /trust-management/certificates/{cert-id} | Delete Certificate for the Given Certificate ID
[**getCertificate**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi.md#getCertificate) | **GET** /trust-management/certificates/{cert-id} | Show Certificate Data for the Given Certificate ID
[**getCertificates**](ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi.md#getCertificates) | **GET** /trust-management/certificates | Return All the User-Facing Components&#x27; Certificates

<a name="addCertificateImport"></a>
# **addCertificateImport**
> CertificateList addCertificateImport(body)

Add a New Certificate

Adds a new private-public certificate or a chain of certificates (CAs) and, optionally, a private key that can be applied to one of the user-facing components (appliance management or edge). The certificate and the key should be stored in PEM format. If no private key is provided, the certificate is used as a client certificate in the trust store. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi();
TrustObjectData body = new TrustObjectData(); // TrustObjectData | 
try {
    CertificateList result = apiInstance.addCertificateImport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi#addCertificateImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TrustObjectData**](TrustObjectData.md)|  |

### Return type

[**CertificateList**](CertificateList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCertificate"></a>
# **deleteCertificate**
> deleteCertificate(certId)

Delete Certificate for the Given Certificate ID

Removes the specified certificate. The private key associated with the certificate is also deleted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi();
String certId = "certId_example"; // String | ID of certificate to delete
try {
    apiInstance.deleteCertificate(certId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi#deleteCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certId** | **String**| ID of certificate to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCertificate"></a>
# **getCertificate**
> Certificate getCertificate(certId, details)

Show Certificate Data for the Given Certificate ID

Returns information for the specified certificate ID, including the certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi();
String certId = "certId_example"; // String | ID of certificate to read
Boolean details = true; // Boolean | whether to expand the pem data and show all its details
try {
    Certificate result = apiInstance.getCertificate(certId, details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi#getCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certId** | **String**| ID of certificate to read |
 **details** | **Boolean**| whether to expand the pem data and show all its details | [optional]

### Return type

[**Certificate**](Certificate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCertificates"></a>
# **getCertificates**
> CertificateList getCertificates(cursor, details, includedFields, pageSize, sortAscending, sortBy, type)

Return All the User-Facing Components&#x27; Certificates

Returns all certificate information viewable by the user, including each certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean details = true; // Boolean | whether to expand the pem data and show all its details
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String type = "type_example"; // String | Type of certificate to return
try {
    CertificateList result = apiInstance.getCertificates(cursor, details, includedFields, pageSize, sortAscending, sortBy, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi#getCertificates");
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

[**CertificateList**](CertificateList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

