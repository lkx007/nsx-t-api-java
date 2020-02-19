# ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePrincipalIdentity**](ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi.md#deletePrincipalIdentity) | **DELETE** /trust-management/principal-identities/{principal-identity-id} | Delete a principal identity
[**getPrincipalIdentities**](ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi.md#getPrincipalIdentities) | **GET** /trust-management/principal-identities | Return the list of principal identities
[**getPrincipalIdentity**](ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi.md#getPrincipalIdentity) | **GET** /trust-management/principal-identities/{principal-identity-id} | Get a Principal Identity
[**registerPrincipalIdentity**](ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi.md#registerPrincipalIdentity) | **POST** /trust-management/principal-identities | Register a name-certificate combination.
[**registerPrincipalIdentityWithCertificate**](ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi.md#registerPrincipalIdentityWithCertificate) | **POST** /trust-management/principal-identities/with-certificate | Register a name-certificate combination.
[**updatePrincipalIdentityCertificateUpdateCertificate**](ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi.md#updatePrincipalIdentityCertificateUpdateCertificate) | **POST** /trust-management/principal-identities?action&#x3D;update_certificate | Update a Principal Identity&#x27;s certificate

<a name="deletePrincipalIdentity"></a>
# **deletePrincipalIdentity**
> deletePrincipalIdentity(principalIdentityId)

Delete a principal identity

Delete a principal identity. It does not delete the certificate. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi();
String principalIdentityId = "principalIdentityId_example"; // String | Unique id of the principal identity to delete
try {
    apiInstance.deletePrincipalIdentity(principalIdentityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi#deletePrincipalIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **principalIdentityId** | **String**| Unique id of the principal identity to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPrincipalIdentities"></a>
# **getPrincipalIdentities**
> PrincipalIdentityList getPrincipalIdentities()

Return the list of principal identities

Returns the list of principals registered with a certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi();
try {
    PrincipalIdentityList result = apiInstance.getPrincipalIdentities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi#getPrincipalIdentities");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrincipalIdentityList**](PrincipalIdentityList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPrincipalIdentity"></a>
# **getPrincipalIdentity**
> PrincipalIdentity getPrincipalIdentity(principalIdentityId)

Get a Principal Identity

Get a stored principal identity 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi();
String principalIdentityId = "principalIdentityId_example"; // String | ID of Principal Identity to get
try {
    PrincipalIdentity result = apiInstance.getPrincipalIdentity(principalIdentityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi#getPrincipalIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **principalIdentityId** | **String**| ID of Principal Identity to get |

### Return type

[**PrincipalIdentity**](PrincipalIdentity.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerPrincipalIdentity"></a>
# **registerPrincipalIdentity**
> PrincipalIdentity registerPrincipalIdentity(body)

Register a name-certificate combination.

Associates a principal&#x27;s name with a certificate that is used to authenticate. Deprecated, use POST /trust-management/principal-identities/with-certificate instead. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi();
PrincipalIdentity body = new PrincipalIdentity(); // PrincipalIdentity | 
try {
    PrincipalIdentity result = apiInstance.registerPrincipalIdentity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi#registerPrincipalIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrincipalIdentity**](PrincipalIdentity.md)|  |

### Return type

[**PrincipalIdentity**](PrincipalIdentity.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerPrincipalIdentityWithCertificate"></a>
# **registerPrincipalIdentityWithCertificate**
> PrincipalIdentity registerPrincipalIdentityWithCertificate(body)

Register a name-certificate combination.

Create a Principal Identity with a new, unused, certificate. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi();
PrincipalIdentityWithCertificate body = new PrincipalIdentityWithCertificate(); // PrincipalIdentityWithCertificate | 
try {
    PrincipalIdentity result = apiInstance.registerPrincipalIdentityWithCertificate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi#registerPrincipalIdentityWithCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrincipalIdentityWithCertificate**](PrincipalIdentityWithCertificate.md)|  |

### Return type

[**PrincipalIdentity**](PrincipalIdentity.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrincipalIdentityCertificateUpdateCertificate"></a>
# **updatePrincipalIdentityCertificateUpdateCertificate**
> PrincipalIdentity updatePrincipalIdentityCertificateUpdateCertificate(body)

Update a Principal Identity&#x27;s certificate

Update a principal identity&#x27;s certificate 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi();
UpdatePrincipalIdentityCertificateRequest body = new UpdatePrincipalIdentityCertificateRequest(); // UpdatePrincipalIdentityCertificateRequest | 
try {
    PrincipalIdentity result = apiInstance.updatePrincipalIdentityCertificateUpdateCertificate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationTrustManagementPrincipalIdentityApi#updatePrincipalIdentityCertificateUpdateCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePrincipalIdentityCertificateRequest**](UpdatePrincipalIdentityCertificateRequest.md)|  |

### Return type

[**PrincipalIdentity**](PrincipalIdentity.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

