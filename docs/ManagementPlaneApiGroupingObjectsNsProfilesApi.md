# ManagementPlaneApiGroupingObjectsNsProfilesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNSProfile**](ManagementPlaneApiGroupingObjectsNsProfilesApi.md#createNSProfile) | **POST** /ns-profiles | Create NSProfile
[**deleteNSProfile**](ManagementPlaneApiGroupingObjectsNsProfilesApi.md#deleteNSProfile) | **DELETE** /ns-profiles/{ns-profile-id} | Delete NSProfile
[**listNSProfiles**](ManagementPlaneApiGroupingObjectsNsProfilesApi.md#listNSProfiles) | **GET** /ns-profiles | List NSProfiles
[**listNSSupportedAttributes**](ManagementPlaneApiGroupingObjectsNsProfilesApi.md#listNSSupportedAttributes) | **GET** /ns-profiles/attributes | List NSProfile supported attribute and sub-attributes
[**listNSSupportedAttributesTypes**](ManagementPlaneApiGroupingObjectsNsProfilesApi.md#listNSSupportedAttributesTypes) | **GET** /ns-profiles/attribute-types | List NSProfile supported attribute types
[**readNSProfile**](ManagementPlaneApiGroupingObjectsNsProfilesApi.md#readNSProfile) | **GET** /ns-profiles/{ns-profile-id} | Read NSProfile
[**updateNSProfile**](ManagementPlaneApiGroupingObjectsNsProfilesApi.md#updateNSProfile) | **PUT** /ns-profiles/{ns-profile-id} | Update NSProfile

<a name="createNSProfile"></a>
# **createNSProfile**
> NSProfile createNSProfile(body)

Create NSProfile

Creates a new NSProfile which allows users to encapsulate attribute and sub-attributes of network services. Rules for using attributes and sub-attributes in single NSProfile 1. One type of attribute can&#x27;t have multiple occurrences. ( Example -  Attribute type APP_ID can be used only once per NSProfile.) 2. Values for an attribute are mentioned as array of strings.  ( Example - For type APP_ID , values can be mentioned as [\&quot;SSL\&quot;,\&quot;FTP\&quot;].) 3. If sub-attribtes are mentioned for an attribute, then only single  value is allowed for that attribute. 4. To get a list of supported  attributes and sub-attributes fire the following REST API  GET https://&amp;lt;nsx-mgr&amp;gt;/api/v1/ns-profiles/attributes 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsProfilesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsProfilesApi();
NSProfile body = new NSProfile(); // NSProfile | 
try {
    NSProfile result = apiInstance.createNSProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsProfilesApi#createNSProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSProfile**](NSProfile.md)|  |

### Return type

[**NSProfile**](NSProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNSProfile"></a>
# **deleteNSProfile**
> deleteNSProfile(nsProfileId, force)

Delete NSProfile

Deletes the specified NSProfile. By default, if the NSProfile is consumed in a Firewall rule, it won&#x27;t get deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the NSProfile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsProfilesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsProfilesApi();
String nsProfileId = "nsProfileId_example"; // String | NSProfile Id
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteNSProfile(nsProfileId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsProfilesApi#deleteNSProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsProfileId** | **String**| NSProfile Id |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNSProfiles"></a>
# **listNSProfiles**
> NSProfileListResult listNSProfiles(attributeType, cursor, includedFields, pageSize, sortAscending, sortBy)

List NSProfiles

List the NSProfiles created in a paginated format.The page size is restricted to 50 NSProfiles, so that the size of the response remains small even when there are high number of NSProfiles with multiple attributes and multiple attribute values for each attribute. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsProfilesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsProfilesApi();
String attributeType = "attributeType_example"; // String | Fetch NSProfiles for the given attribute type
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NSProfileListResult result = apiInstance.listNSProfiles(attributeType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsProfilesApi#listNSProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeType** | **String**| Fetch NSProfiles for the given attribute type | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NSProfileListResult**](NSProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNSSupportedAttributes"></a>
# **listNSSupportedAttributes**
> NSSupportedAttributesListResult listNSSupportedAttributes(attributeType, cursor, includedFields, pageSize, sortAscending, sortBy)

List NSProfile supported attribute and sub-attributes

Returns supported attribute and sub-attributes for specified attribute type with their supported values, if provided in query/request parameter, else will fetch all supported attribute and sub-attributes for all supported attribute types. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsProfilesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsProfilesApi();
String attributeType = "attributeType_example"; // String | Fetch attributes and sub-attributes for the given attribute type
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NSSupportedAttributesListResult result = apiInstance.listNSSupportedAttributes(attributeType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsProfilesApi#listNSSupportedAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeType** | **String**| Fetch attributes and sub-attributes for the given attribute type | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NSSupportedAttributesListResult**](NSSupportedAttributesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNSSupportedAttributesTypes"></a>
# **listNSSupportedAttributesTypes**
> NSSupportedAttributeTypesResult listNSSupportedAttributesTypes()

List NSProfile supported attribute types

Returns supported attribute type strings for NSProfile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsProfilesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsProfilesApi();
try {
    NSSupportedAttributeTypesResult result = apiInstance.listNSSupportedAttributesTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsProfilesApi#listNSSupportedAttributesTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSSupportedAttributeTypesResult**](NSSupportedAttributeTypesResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNSProfile"></a>
# **readNSProfile**
> NSProfile readNSProfile(nsProfileId)

Read NSProfile

Returns information about the specified NSProfile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsProfilesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsProfilesApi();
String nsProfileId = "nsProfileId_example"; // String | NSProfile Id
try {
    NSProfile result = apiInstance.readNSProfile(nsProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsProfilesApi#readNSProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsProfileId** | **String**| NSProfile Id |

### Return type

[**NSProfile**](NSProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNSProfile"></a>
# **updateNSProfile**
> NSProfile updateNSProfile(body, nsProfileId)

Update NSProfile

Updates the specified NSProfile. Rules for using attributes and sub-attributes in single NSProfile 1. One type of attribute can&#x27;t have multiple occurrences. ( Example -  Attribute type APP_ID can be used only once per NSProfile.) 2. Values for an attribute are mentioned as array of strings.  ( Example - For type APP_ID , values can be mentioned as [\&quot;SSL\&quot;,\&quot;FTP\&quot;].) 3. If sub-attribtes are mentioned for an attribute, then only single  value is allowed for that attribute. 4. To get a list of supported  attributes and sub-attributes fire the following REST API  GET https://&amp;lt;nsx-mgr&amp;gt;/api/v1/ns-profiles/attributes 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsProfilesApi apiInstance = new ManagementPlaneApiGroupingObjectsNsProfilesApi();
NSProfile body = new NSProfile(); // NSProfile | 
String nsProfileId = "nsProfileId_example"; // String | NSProfile Id
try {
    NSProfile result = apiInstance.updateNSProfile(body, nsProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsProfilesApi#updateNSProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSProfile**](NSProfile.md)|  |
 **nsProfileId** | **String**| NSProfile Id |

### Return type

[**NSProfile**](NSProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

