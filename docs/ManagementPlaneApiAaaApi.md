# ManagementPlaneApiAaaApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRegistrationToken**](ManagementPlaneApiAaaApi.md#createRegistrationToken) | **POST** /aaa/registration-token | Create registration access token
[**createRoleBinding**](ManagementPlaneApiAaaApi.md#createRoleBinding) | **POST** /aaa/role-bindings | Assign roles to User or Group
[**deleteAllStaleRoleBindingsDeleteStaleBindings**](ManagementPlaneApiAaaApi.md#deleteAllStaleRoleBindingsDeleteStaleBindings) | **POST** /aaa/role-bindings?action&#x3D;delete_stale_bindings | Delete all stale role assignments
[**deleteRegistrationToken**](ManagementPlaneApiAaaApi.md#deleteRegistrationToken) | **DELETE** /aaa/registration-token/{token} | Delete registration access token
[**deleteRoleBinding**](ManagementPlaneApiAaaApi.md#deleteRoleBinding) | **DELETE** /aaa/role-bindings/{binding-id} | Delete user/group&#x27;s roles assignment
[**getAllRoleBindings**](ManagementPlaneApiAaaApi.md#getAllRoleBindings) | **GET** /aaa/role-bindings | Get all users and groups with their roles
[**getAllRolesInfo**](ManagementPlaneApiAaaApi.md#getAllRolesInfo) | **GET** /aaa/roles | Get information about all roles
[**getCurrentUserInfo**](ManagementPlaneApiAaaApi.md#getCurrentUserInfo) | **GET** /aaa/user-info | Get information about logged-in user. The permissions parameter of the NsxRole has been deprecated.
[**getGroupVidmSearchResult**](ManagementPlaneApiAaaApi.md#getGroupVidmSearchResult) | **GET** /aaa/vidm/groups | Get all the User Groups where vIDM display name matches the search key case insensitively. The search key is checked to be a substring of display name. This is a non paginated API.
[**getRegistrationToken**](ManagementPlaneApiAaaApi.md#getRegistrationToken) | **GET** /aaa/registration-token/{token} | Get registration access token
[**getRoleBinding**](ManagementPlaneApiAaaApi.md#getRoleBinding) | **GET** /aaa/role-bindings/{binding-id} | Get user/group&#x27;s role information
[**getRoleInfo**](ManagementPlaneApiAaaApi.md#getRoleInfo) | **GET** /aaa/roles/{role} | Get role information
[**getUserVidmSearchResult**](ManagementPlaneApiAaaApi.md#getUserVidmSearchResult) | **GET** /aaa/vidm/users | Get all the users from vIDM whose userName, givenName or familyName matches the search key case insensitively. The search key is checked to be a substring of name or given name or family name. This is a non paginated API.
[**getVidmSearchResult**](ManagementPlaneApiAaaApi.md#getVidmSearchResult) | **POST** /aaa/vidm/search | Get all the users and groups from vIDM matching the search key case insensitively. The search key is checked to be a substring of name or given name or family name of user and display name of group. This is a non paginated API.
[**updateRoleBinding**](ManagementPlaneApiAaaApi.md#updateRoleBinding) | **PUT** /aaa/role-bindings/{binding-id} | Update User or Group&#x27;s roles

<a name="createRegistrationToken"></a>
# **createRegistrationToken**
> RegistrationToken createRegistrationToken()

Create registration access token

The privileges of the registration token will be the same as the caller.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
try {
    RegistrationToken result = apiInstance.createRegistrationToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#createRegistrationToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RegistrationToken**](RegistrationToken.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRoleBinding"></a>
# **createRoleBinding**
> RoleBinding createRoleBinding(body)

Assign roles to User or Group

When assigning a user role, specify the user name with the same case as it appears in vIDM to access the NSX-T user interface. For example, if vIDM has the user name User1@example.com then the name attribute in the API call must be be User1@example.com and cannot be user1@example.com. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
RoleBinding body = new RoleBinding(); // RoleBinding | 
try {
    RoleBinding result = apiInstance.createRoleBinding(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#createRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleBinding**](RoleBinding.md)|  |

### Return type

[**RoleBinding**](RoleBinding.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllStaleRoleBindingsDeleteStaleBindings"></a>
# **deleteAllStaleRoleBindingsDeleteStaleBindings**
> deleteAllStaleRoleBindingsDeleteStaleBindings()

Delete all stale role assignments

Delete all stale role assignments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
try {
    apiInstance.deleteAllStaleRoleBindingsDeleteStaleBindings();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#deleteAllStaleRoleBindingsDeleteStaleBindings");
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

<a name="deleteRegistrationToken"></a>
# **deleteRegistrationToken**
> deleteRegistrationToken(token)

Delete registration access token

Delete registration access token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String token = "token_example"; // String | Registration token
try {
    apiInstance.deleteRegistrationToken(token);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#deleteRegistrationToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Registration token |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRoleBinding"></a>
# **deleteRoleBinding**
> deleteRoleBinding(bindingId)

Delete user/group&#x27;s roles assignment

Delete user/group&#x27;s roles assignment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String bindingId = "bindingId_example"; // String | User/Group's id
try {
    apiInstance.deleteRoleBinding(bindingId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#deleteRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bindingId** | **String**| User/Group&#x27;s id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllRoleBindings"></a>
# **getAllRoleBindings**
> RoleBindingListResult getAllRoleBindings(cursor, includedFields, name, pageSize, sortAscending, sortBy, type)

Get all users and groups with their roles

Get all users and groups with their roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String name = "name_example"; // String | User/Group name
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String type = "type_example"; // String | Type
try {
    RoleBindingListResult result = apiInstance.getAllRoleBindings(cursor, includedFields, name, pageSize, sortAscending, sortBy, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getAllRoleBindings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **name** | **String**| User/Group name | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **type** | **String**| Type | [optional] [enum: remote_user, remote_group, local_user, principal_identity]

### Return type

[**RoleBindingListResult**](RoleBindingListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllRolesInfo"></a>
# **getAllRolesInfo**
> RoleListResult getAllRolesInfo()

Get information about all roles

Get information about all roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
try {
    RoleListResult result = apiInstance.getAllRolesInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getAllRolesInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoleListResult**](RoleListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentUserInfo"></a>
# **getCurrentUserInfo**
> UserInfo getCurrentUserInfo()

Get information about logged-in user. The permissions parameter of the NsxRole has been deprecated.

Get information about logged-in user. The permissions parameter of the NsxRole has been deprecated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
try {
    UserInfo result = apiInstance.getCurrentUserInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getCurrentUserInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserInfo**](UserInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupVidmSearchResult"></a>
# **getGroupVidmSearchResult**
> VidmInfoListResult getGroupVidmSearchResult(searchString, cursor, includedFields, pageSize, sortAscending, sortBy)

Get all the User Groups where vIDM display name matches the search key case insensitively. The search key is checked to be a substring of display name. This is a non paginated API.

Get all the User Groups where vIDM display name matches the search key case insensitively. The search key is checked to be a substring of display name. This is a non paginated API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String searchString = "searchString_example"; // String | Search string to search for. 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VidmInfoListResult result = apiInstance.getGroupVidmSearchResult(searchString, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getGroupVidmSearchResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| Search string to search for.  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**VidmInfoListResult**](VidmInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRegistrationToken"></a>
# **getRegistrationToken**
> RegistrationToken getRegistrationToken(token)

Get registration access token

Get registration access token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String token = "token_example"; // String | Registration token
try {
    RegistrationToken result = apiInstance.getRegistrationToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getRegistrationToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Registration token |

### Return type

[**RegistrationToken**](RegistrationToken.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoleBinding"></a>
# **getRoleBinding**
> RoleBinding getRoleBinding(bindingId)

Get user/group&#x27;s role information

Get user/group&#x27;s role information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String bindingId = "bindingId_example"; // String | User/Group's id
try {
    RoleBinding result = apiInstance.getRoleBinding(bindingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bindingId** | **String**| User/Group&#x27;s id |

### Return type

[**RoleBinding**](RoleBinding.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoleInfo"></a>
# **getRoleInfo**
> RoleWithFeatures getRoleInfo(role)

Get role information

Get role information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String role = "role_example"; // String | Role Name
try {
    RoleWithFeatures result = apiInstance.getRoleInfo(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getRoleInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| Role Name |

### Return type

[**RoleWithFeatures**](RoleWithFeatures.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserVidmSearchResult"></a>
# **getUserVidmSearchResult**
> VidmInfoListResult getUserVidmSearchResult(searchString, cursor, includedFields, pageSize, sortAscending, sortBy)

Get all the users from vIDM whose userName, givenName or familyName matches the search key case insensitively. The search key is checked to be a substring of name or given name or family name. This is a non paginated API.

Get all the users from vIDM whose userName, givenName or familyName matches the search key case insensitively. The search key is checked to be a substring of name or given name or family name. This is a non paginated API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String searchString = "searchString_example"; // String | Search string to search for. 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VidmInfoListResult result = apiInstance.getUserVidmSearchResult(searchString, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getUserVidmSearchResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| Search string to search for.  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**VidmInfoListResult**](VidmInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVidmSearchResult"></a>
# **getVidmSearchResult**
> VidmInfoListResult getVidmSearchResult(searchString, cursor, includedFields, pageSize, sortAscending, sortBy)

Get all the users and groups from vIDM matching the search key case insensitively. The search key is checked to be a substring of name or given name or family name of user and display name of group. This is a non paginated API.

Get all the users and groups from vIDM matching the search key case insensitively. The search key is checked to be a substring of name or given name or family name of user and display name of group. This is a non paginated API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
String searchString = "searchString_example"; // String | Search string to search for. 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VidmInfoListResult result = apiInstance.getVidmSearchResult(searchString, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#getVidmSearchResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| Search string to search for.  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**VidmInfoListResult**](VidmInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRoleBinding"></a>
# **updateRoleBinding**
> RoleBinding updateRoleBinding(body, bindingId)

Update User or Group&#x27;s roles

Update User or Group&#x27;s roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAaaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAaaApi apiInstance = new ManagementPlaneApiAaaApi();
RoleBinding body = new RoleBinding(); // RoleBinding | 
String bindingId = "bindingId_example"; // String | User/Group's id
try {
    RoleBinding result = apiInstance.updateRoleBinding(body, bindingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAaaApi#updateRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleBinding**](RoleBinding.md)|  |
 **bindingId** | **String**| User/Group&#x27;s id |

### Return type

[**RoleBinding**](RoleBinding.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

