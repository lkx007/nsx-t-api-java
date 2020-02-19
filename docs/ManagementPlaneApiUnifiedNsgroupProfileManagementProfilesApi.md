# ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIpfixCollectorUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#createIpfixCollectorUpmProfile) | **POST** /ipfix-collector-profiles | Create a new IPFIX collector profile
[**createIpfixUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#createIpfixUpmProfile) | **POST** /ipfix-profiles | Create a new IPFIX profile
[**deleteIpfixCollectorUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#deleteIpfixCollectorUpmProfile) | **DELETE** /ipfix-collector-profiles/{ipfix-collector-profile-id} | Delete an existing IPFIX collector profile
[**deleteIpfixUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#deleteIpfixUpmProfile) | **DELETE** /ipfix-profiles/{ipfix-profile-id} | Delete an existing IPFIX profile
[**getIpfixCollectorUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#getIpfixCollectorUpmProfile) | **GET** /ipfix-collector-profiles/{ipfix-collector-profile-id} | Get an existing IPFIX collector profile
[**getIpfixUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#getIpfixUpmProfile) | **GET** /ipfix-profiles/{ipfix-profile-id} | Get an existing IPFIX profile
[**listIpfixCollectorUpmProfiles**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#listIpfixCollectorUpmProfiles) | **GET** /ipfix-collector-profiles | List IPFIX Collector Profies
[**listIpfixUpmProfiles**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#listIpfixUpmProfiles) | **GET** /ipfix-profiles | List IPFIX Profies
[**updateIpfixCollectorUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#updateIpfixCollectorUpmProfile) | **PUT** /ipfix-collector-profiles/{ipfix-collector-profile-id} | Update an existing IPFIX collector profile
[**updateIpfixUpmProfile**](ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi.md#updateIpfixUpmProfile) | **PUT** /ipfix-profiles/{ipfix-profile-id} | Update an existing IPFIX profile

<a name="createIpfixCollectorUpmProfile"></a>
# **createIpfixCollectorUpmProfile**
> IpfixCollectorUpmProfile createIpfixCollectorUpmProfile(body)

Create a new IPFIX collector profile

Create a new IPFIX collector profile with essential properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
IpfixCollectorUpmProfile body = new IpfixCollectorUpmProfile(); // IpfixCollectorUpmProfile | 
try {
    IpfixCollectorUpmProfile result = apiInstance.createIpfixCollectorUpmProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#createIpfixCollectorUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixCollectorUpmProfile**](IpfixCollectorUpmProfile.md)|  |

### Return type

[**IpfixCollectorUpmProfile**](IpfixCollectorUpmProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIpfixUpmProfile"></a>
# **createIpfixUpmProfile**
> IpfixUpmProfile createIpfixUpmProfile(body)

Create a new IPFIX profile

Create a new IPFIX profile with essential properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
IpfixUpmProfile body = new IpfixUpmProfile(); // IpfixUpmProfile | 
try {
    IpfixUpmProfile result = apiInstance.createIpfixUpmProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#createIpfixUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixUpmProfile**](IpfixUpmProfile.md)|  |

### Return type

[**IpfixUpmProfile**](IpfixUpmProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIpfixCollectorUpmProfile"></a>
# **deleteIpfixCollectorUpmProfile**
> deleteIpfixCollectorUpmProfile(ipfixCollectorProfileId)

Delete an existing IPFIX collector profile

Delete an existing IPFIX collector profile by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
String ipfixCollectorProfileId = "ipfixCollectorProfileId_example"; // String | 
try {
    apiInstance.deleteIpfixCollectorUpmProfile(ipfixCollectorProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#deleteIpfixCollectorUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipfixCollectorProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIpfixUpmProfile"></a>
# **deleteIpfixUpmProfile**
> deleteIpfixUpmProfile(ipfixProfileId)

Delete an existing IPFIX profile

Delete an existing IPFIX profile by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
String ipfixProfileId = "ipfixProfileId_example"; // String | 
try {
    apiInstance.deleteIpfixUpmProfile(ipfixProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#deleteIpfixUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipfixProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIpfixCollectorUpmProfile"></a>
# **getIpfixCollectorUpmProfile**
> IpfixCollectorUpmProfile getIpfixCollectorUpmProfile(ipfixCollectorProfileId)

Get an existing IPFIX collector profile

Get an existing IPFIX collector profile by profile ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
String ipfixCollectorProfileId = "ipfixCollectorProfileId_example"; // String | 
try {
    IpfixCollectorUpmProfile result = apiInstance.getIpfixCollectorUpmProfile(ipfixCollectorProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#getIpfixCollectorUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipfixCollectorProfileId** | **String**|  |

### Return type

[**IpfixCollectorUpmProfile**](IpfixCollectorUpmProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIpfixUpmProfile"></a>
# **getIpfixUpmProfile**
> IpfixUpmProfile getIpfixUpmProfile(ipfixProfileId)

Get an existing IPFIX profile

Get an existing IPFIX profile by profile ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
String ipfixProfileId = "ipfixProfileId_example"; // String | 
try {
    IpfixUpmProfile result = apiInstance.getIpfixUpmProfile(ipfixProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#getIpfixUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipfixProfileId** | **String**|  |

### Return type

[**IpfixUpmProfile**](IpfixUpmProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpfixCollectorUpmProfiles"></a>
# **listIpfixCollectorUpmProfiles**
> IpfixCollectorUpmProfileListResult listIpfixCollectorUpmProfiles(cursor, includedFields, pageSize, profileTypes, sortAscending, sortBy)

List IPFIX Collector Profies

Query IPFIX collector profiles with list parameters. List result can be filtered by profile type defined by IpfixCollectorUpmProfileType. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String profileTypes = "profileTypes_example"; // String | IPFIX Collector Profile Type List
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IpfixCollectorUpmProfileListResult result = apiInstance.listIpfixCollectorUpmProfiles(cursor, includedFields, pageSize, profileTypes, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#listIpfixCollectorUpmProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **profileTypes** | **String**| IPFIX Collector Profile Type List | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IpfixCollectorUpmProfileListResult**](IpfixCollectorUpmProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpfixUpmProfiles"></a>
# **listIpfixUpmProfiles**
> IpfixUpmProfileListResult listIpfixUpmProfiles(appliedToEntityId, appliedToEntityType, cursor, includedFields, pageSize, profileTypes, sortAscending, sortBy)

List IPFIX Profies

Query IPFIX profiles with list parameters. List result can be filtered by profile type defined by IpfixUpmProfileType. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
String appliedToEntityId = "appliedToEntityId_example"; // String | ID of Entity Applied with Profile
String appliedToEntityType = "appliedToEntityType_example"; // String | Supported Entity Types
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String profileTypes = "profileTypes_example"; // String | IPFIX Profile Type List
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IpfixUpmProfileListResult result = apiInstance.listIpfixUpmProfiles(appliedToEntityId, appliedToEntityType, cursor, includedFields, pageSize, profileTypes, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#listIpfixUpmProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliedToEntityId** | **String**| ID of Entity Applied with Profile | [optional]
 **appliedToEntityType** | **String**| Supported Entity Types | [optional] [enum: LogicalPort, LogicalSwitch, NSGroup]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **profileTypes** | **String**| IPFIX Profile Type List | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IpfixUpmProfileListResult**](IpfixUpmProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIpfixCollectorUpmProfile"></a>
# **updateIpfixCollectorUpmProfile**
> IpfixCollectorUpmProfile updateIpfixCollectorUpmProfile(body, ipfixCollectorProfileId)

Update an existing IPFIX collector profile

Update an existing IPFIX collector profile with profile ID and modified properties. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
IpfixCollectorUpmProfile body = new IpfixCollectorUpmProfile(); // IpfixCollectorUpmProfile | 
String ipfixCollectorProfileId = "ipfixCollectorProfileId_example"; // String | 
try {
    IpfixCollectorUpmProfile result = apiInstance.updateIpfixCollectorUpmProfile(body, ipfixCollectorProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#updateIpfixCollectorUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixCollectorUpmProfile**](IpfixCollectorUpmProfile.md)|  |
 **ipfixCollectorProfileId** | **String**|  |

### Return type

[**IpfixCollectorUpmProfile**](IpfixCollectorUpmProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIpfixUpmProfile"></a>
# **updateIpfixUpmProfile**
> IpfixUpmProfile updateIpfixUpmProfile(body, ipfixProfileId)

Update an existing IPFIX profile

Update an existing IPFIX profile with profile ID and modified properties. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi apiInstance = new ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi();
IpfixUpmProfile body = new IpfixUpmProfile(); // IpfixUpmProfile | 
String ipfixProfileId = "ipfixProfileId_example"; // String | 
try {
    IpfixUpmProfile result = apiInstance.updateIpfixUpmProfile(body, ipfixProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiUnifiedNsgroupProfileManagementProfilesApi#updateIpfixUpmProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixUpmProfile**](IpfixUpmProfile.md)|  |
 **ipfixProfileId** | **String**|  |

### Return type

[**IpfixUpmProfile**](IpfixUpmProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

