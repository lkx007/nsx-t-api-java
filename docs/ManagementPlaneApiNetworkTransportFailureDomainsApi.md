# ManagementPlaneApiNetworkTransportFailureDomainsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFailureDomain**](ManagementPlaneApiNetworkTransportFailureDomainsApi.md#createFailureDomain) | **POST** /failure-domains | Create Failure Domain
[**deleteFailureDomain**](ManagementPlaneApiNetworkTransportFailureDomainsApi.md#deleteFailureDomain) | **DELETE** /failure-domains/{failure-domain-id} | Delete Failure Domain
[**getFailureDomain**](ManagementPlaneApiNetworkTransportFailureDomainsApi.md#getFailureDomain) | **GET** /failure-domains/{failure-domain-id} | Get a Failure Domain
[**listFailureDomains**](ManagementPlaneApiNetworkTransportFailureDomainsApi.md#listFailureDomains) | **GET** /failure-domains | List Failure Domains
[**updateFailureDomain**](ManagementPlaneApiNetworkTransportFailureDomainsApi.md#updateFailureDomain) | **PUT** /failure-domains/{failure-domain-id} | Update Failure Domain

<a name="createFailureDomain"></a>
# **createFailureDomain**
> FailureDomain createFailureDomain(body)

Create Failure Domain

Creates a new failure domain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportFailureDomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportFailureDomainsApi apiInstance = new ManagementPlaneApiNetworkTransportFailureDomainsApi();
FailureDomain body = new FailureDomain(); // FailureDomain | 
try {
    FailureDomain result = apiInstance.createFailureDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportFailureDomainsApi#createFailureDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FailureDomain**](FailureDomain.md)|  |

### Return type

[**FailureDomain**](FailureDomain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFailureDomain"></a>
# **deleteFailureDomain**
> deleteFailureDomain(failureDomainId)

Delete Failure Domain

Deletes an existing failure domain. You can not delete system generated default failure domain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportFailureDomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportFailureDomainsApi apiInstance = new ManagementPlaneApiNetworkTransportFailureDomainsApi();
String failureDomainId = "failureDomainId_example"; // String | 
try {
    apiInstance.deleteFailureDomain(failureDomainId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportFailureDomainsApi#deleteFailureDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **failureDomainId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFailureDomain"></a>
# **getFailureDomain**
> FailureDomain getFailureDomain(failureDomainId)

Get a Failure Domain

Returns information about a single failure domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportFailureDomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportFailureDomainsApi apiInstance = new ManagementPlaneApiNetworkTransportFailureDomainsApi();
String failureDomainId = "failureDomainId_example"; // String | 
try {
    FailureDomain result = apiInstance.getFailureDomain(failureDomainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportFailureDomainsApi#getFailureDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **failureDomainId** | **String**|  |

### Return type

[**FailureDomain**](FailureDomain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFailureDomains"></a>
# **listFailureDomains**
> FailureDomainListResult listFailureDomains()

List Failure Domains

Returns information about configured failure domains.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportFailureDomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportFailureDomainsApi apiInstance = new ManagementPlaneApiNetworkTransportFailureDomainsApi();
try {
    FailureDomainListResult result = apiInstance.listFailureDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportFailureDomainsApi#listFailureDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FailureDomainListResult**](FailureDomainListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFailureDomain"></a>
# **updateFailureDomain**
> FailureDomain updateFailureDomain(body, failureDomainId)

Update Failure Domain

Updates an existing failure domain. Modifiable parameters are display_name, preferred_active_edge_services flag. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNetworkTransportFailureDomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNetworkTransportFailureDomainsApi apiInstance = new ManagementPlaneApiNetworkTransportFailureDomainsApi();
FailureDomain body = new FailureDomain(); // FailureDomain | 
String failureDomainId = "failureDomainId_example"; // String | 
try {
    FailureDomain result = apiInstance.updateFailureDomain(body, failureDomainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNetworkTransportFailureDomainsApi#updateFailureDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FailureDomain**](FailureDomain.md)|  |
 **failureDomainId** | **String**|  |

### Return type

[**FailureDomain**](FailureDomain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

