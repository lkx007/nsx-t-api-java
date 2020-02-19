# ManagementPlaneApiAppDiscoveryApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAppProfile**](ManagementPlaneApiAppDiscoveryApi.md#addAppProfile) | **POST** /app-discovery/app-profiles | Adds a new app profile
[**deleteAppDiscoverySession**](ManagementPlaneApiAppDiscoveryApi.md#deleteAppDiscoverySession) | **DELETE** /app-discovery/sessions/{session-id} | Cancel and delete the application discovery session
[**deleteAppProfile**](ManagementPlaneApiAppDiscoveryApi.md#deleteAppProfile) | **DELETE** /app-discovery/app-profiles/{app-profile-id} | Delete App Profile
[**getAppDiscoverySession**](ManagementPlaneApiAppDiscoveryApi.md#getAppDiscoverySession) | **GET** /app-discovery/sessions/{session-id} | Returns the status of the application discovery session and other details
[**getAppDiscoverySessionAppProfiles**](ManagementPlaneApiAppDiscoveryApi.md#getAppDiscoverySessionAppProfiles) | **GET** /app-discovery/sessions/{session-id}/app-profiles | application profiles in this application discovery session
[**getAppDiscoverySessionInstalledApps**](ManagementPlaneApiAppDiscoveryApi.md#getAppDiscoverySessionInstalledApps) | **GET** /app-discovery/sessions/{session-id}/installed-apps | Returns the details of the installed apps for the app profile ID in that session
[**getAppDiscoverySessionNsGroupMembers**](ManagementPlaneApiAppDiscoveryApi.md#getAppDiscoverySessionNsGroupMembers) | **GET** /app-discovery/sessions/{session-id}/ns-groups/{ns-group-id}/members | vms in the ns-group of the application discovery session
[**getAppDiscoverySessionNsGroups**](ManagementPlaneApiAppDiscoveryApi.md#getAppDiscoverySessionNsGroups) | **GET** /app-discovery/sessions/{session-id}/ns-groups | ns-groups in this application discovery session
[**getAppDiscoverySessionSummary**](ManagementPlaneApiAppDiscoveryApi.md#getAppDiscoverySessionSummary) | **GET** /app-discovery/sessions/{session-id}/summary | Returns the summary of the application discovery session
[**getAppDiscoverySessions**](ManagementPlaneApiAppDiscoveryApi.md#getAppDiscoverySessions) | **GET** /app-discovery/sessions | Returns the list of the application discovery sessions available
[**getAppProfileDetails**](ManagementPlaneApiAppDiscoveryApi.md#getAppProfileDetails) | **GET** /app-discovery/app-profiles/{app-profile-id} | Returns detail of the app profile
[**getAppProfiles**](ManagementPlaneApiAppDiscoveryApi.md#getAppProfiles) | **GET** /app-discovery/app-profiles | Returns list of app profile IDs created
[**getAppdiscoveryResultAppInfoAndHostVmInCsvFormatCsv**](ManagementPlaneApiAppDiscoveryApi.md#getAppdiscoveryResultAppInfoAndHostVmInCsvFormatCsv) | **POST** /app-discovery/sessions/{session-id}/report/app-info-and-vm?format&#x3D;csv | Export app discovery results in CSV format
[**getAppdiscoverySessionAppProfileMemberAppsInCsvFormatCsv**](ManagementPlaneApiAppDiscoveryApi.md#getAppdiscoverySessionAppProfileMemberAppsInCsvFormatCsv) | **GET** /app-discovery/sessions/{session-id}/report/app-profile-and-app-info?format&#x3D;csv | Export app profiles in CSV format for a given sessiom
[**reclassifyAppDiscoverySession**](ManagementPlaneApiAppDiscoveryApi.md#reclassifyAppDiscoverySession) | **POST** /app-discovery/sessions/{session-id}/re-classify | Re-classify a completed application discovery session.
[**startAppDiscoverySession**](ManagementPlaneApiAppDiscoveryApi.md#startAppDiscoverySession) | **POST** /app-discovery/sessions | Starts the discovery of application discovery session
[**updateAppProfile**](ManagementPlaneApiAppDiscoveryApi.md#updateAppProfile) | **PUT** /app-discovery/app-profiles/{app-profile-id} | Update AppProfile

<a name="addAppProfile"></a>
# **addAppProfile**
> AppProfile addAppProfile(body)

Adds a new app profile

Adds a new app profile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
AppProfile body = new AppProfile(); // AppProfile | 
try {
    AppProfile result = apiInstance.addAppProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#addAppProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppProfile**](AppProfile.md)|  |

### Return type

[**AppProfile**](AppProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppDiscoverySession"></a>
# **deleteAppDiscoverySession**
> deleteAppDiscoverySession(sessionId)

Cancel and delete the application discovery session

Cancel and delete the application discovery session 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
try {
    apiInstance.deleteAppDiscoverySession(sessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#deleteAppDiscoverySession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAppProfile"></a>
# **deleteAppProfile**
> deleteAppProfile(appProfileId, force)

Delete App Profile

Deletes the specified AppProfile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String appProfileId = "appProfileId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteAppProfile(appProfileId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#deleteAppProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appProfileId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppDiscoverySession"></a>
# **getAppDiscoverySession**
> AppDiscoverySession getAppDiscoverySession(sessionId)

Returns the status of the application discovery session and other details

Returns the status of the application discovery session and other details 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
try {
    AppDiscoverySession result = apiInstance.getAppDiscoverySession(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppDiscoverySession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |

### Return type

[**AppDiscoverySession**](AppDiscoverySession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppDiscoverySessionAppProfiles"></a>
# **getAppDiscoverySessionAppProfiles**
> AppProfileListResult getAppDiscoverySessionAppProfiles(sessionId, cursor, includedFields, pageSize, sortAscending, sortBy)

application profiles in this application discovery session

Returns the application profiles that was part of the application discovery session | while it was started. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    AppProfileListResult result = apiInstance.getAppDiscoverySessionAppProfiles(sessionId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppDiscoverySessionAppProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**AppProfileListResult**](AppProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppDiscoverySessionInstalledApps"></a>
# **getAppDiscoverySessionInstalledApps**
> AppInfoListResult getAppDiscoverySessionInstalledApps(sessionId, appProfileId, cursor, includedFields, pageSize, sortAscending, sortBy, vmId)

Returns the details of the installed apps for the app profile ID in that session

Returns the details of the installed apps for the app profile ID in that session 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
String appProfileId = "appProfileId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String vmId = "vmId_example"; // String | 
try {
    AppInfoListResult result = apiInstance.getAppDiscoverySessionInstalledApps(sessionId, appProfileId, cursor, includedFields, pageSize, sortAscending, sortBy, vmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppDiscoverySessionInstalledApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **appProfileId** | **String**|  | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **vmId** | **String**|  | [optional]

### Return type

[**AppInfoListResult**](AppInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppDiscoverySessionNsGroupMembers"></a>
# **getAppDiscoverySessionNsGroupMembers**
> AppDiscoveryVmInfoListResult getAppDiscoverySessionNsGroupMembers(sessionId, nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

vms in the ns-group of the application discovery session

Returns the vms in the ns-group of the application discovery session 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
String nsGroupId = "nsGroupId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    AppDiscoveryVmInfoListResult result = apiInstance.getAppDiscoverySessionNsGroupMembers(sessionId, nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppDiscoverySessionNsGroupMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **nsGroupId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**AppDiscoveryVmInfoListResult**](AppDiscoveryVmInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppDiscoverySessionNsGroups"></a>
# **getAppDiscoverySessionNsGroups**
> NSGroupMetaInfoListResult getAppDiscoverySessionNsGroups(sessionId, cursor, includedFields, pageSize, sortAscending, sortBy)

ns-groups in this application discovery session

Returns the ns groups that was part of the application discovery session | while it was started 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NSGroupMetaInfoListResult result = apiInstance.getAppDiscoverySessionNsGroups(sessionId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppDiscoverySessionNsGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NSGroupMetaInfoListResult**](NSGroupMetaInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppDiscoverySessionSummary"></a>
# **getAppDiscoverySessionSummary**
> AppDiscoverySessionResultSummary getAppDiscoverySessionSummary(sessionId)

Returns the summary of the application discovery session

Returns the summary of the application discovery session 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
try {
    AppDiscoverySessionResultSummary result = apiInstance.getAppDiscoverySessionSummary(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppDiscoverySessionSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |

### Return type

[**AppDiscoverySessionResultSummary**](AppDiscoverySessionResultSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppDiscoverySessions"></a>
# **getAppDiscoverySessions**
> AppDiscoverySessionsListResult getAppDiscoverySessions(cursor, groupId, includedFields, pageSize, sortAscending, sortBy, status)

Returns the list of the application discovery sessions available

Returns the list of the application discovery sessions available 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String groupId = "groupId_example"; // String | NSGroup id, helps user query sessions related to one nsgroup
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String status = "status_example"; // String | Session Status, e.g. get all running sessions
try {
    AppDiscoverySessionsListResult result = apiInstance.getAppDiscoverySessions(cursor, groupId, includedFields, pageSize, sortAscending, sortBy, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppDiscoverySessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **groupId** | **String**| NSGroup id, helps user query sessions related to one nsgroup | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **status** | **String**| Session Status, e.g. get all running sessions | [optional] [enum: STARTING, FAILED, RUNNING, FINISHED]

### Return type

[**AppDiscoverySessionsListResult**](AppDiscoverySessionsListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppProfileDetails"></a>
# **getAppProfileDetails**
> AppProfile getAppProfileDetails(appProfileId)

Returns detail of the app profile

Returns detail of the app profile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String appProfileId = "appProfileId_example"; // String | 
try {
    AppProfile result = apiInstance.getAppProfileDetails(appProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppProfileDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appProfileId** | **String**|  |

### Return type

[**AppProfile**](AppProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppProfiles"></a>
# **getAppProfiles**
> AppProfileListResult getAppProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Returns list of app profile IDs created

Returns list of app profile IDs created 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    AppProfileListResult result = apiInstance.getAppProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppProfiles");
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

[**AppProfileListResult**](AppProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppdiscoveryResultAppInfoAndHostVmInCsvFormatCsv"></a>
# **getAppdiscoveryResultAppInfoAndHostVmInCsvFormatCsv**
> AppInfoHostVmListInCsvFormat getAppdiscoveryResultAppInfoAndHostVmInCsvFormatCsv(body, sessionId)

Export app discovery results in CSV format

Returns app discovery results in CSV format, each row contains discovered app information and the id of the vms this app is discovered from for a given set of vms (or for all vms belong to this session when no vm id is passed in) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
ReportAppResultsForVmsRequestParameters body = new ReportAppResultsForVmsRequestParameters(); // ReportAppResultsForVmsRequestParameters | 
String sessionId = "sessionId_example"; // String | 
try {
    AppInfoHostVmListInCsvFormat result = apiInstance.getAppdiscoveryResultAppInfoAndHostVmInCsvFormatCsv(body, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppdiscoveryResultAppInfoAndHostVmInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportAppResultsForVmsRequestParameters**](ReportAppResultsForVmsRequestParameters.md)|  |
 **sessionId** | **String**|  |

### Return type

[**AppInfoHostVmListInCsvFormat**](AppInfoHostVmListInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/csv

<a name="getAppdiscoverySessionAppProfileMemberAppsInCsvFormatCsv"></a>
# **getAppdiscoverySessionAppProfileMemberAppsInCsvFormatCsv**
> AppProfileMemberAppsListInCsvFormat getAppdiscoverySessionAppProfileMemberAppsInCsvFormatCsv(sessionId)

Export app profiles in CSV format for a given sessiom

Returns app profiles information for a given session in CSV format Each row will contain detailed info of an app profile, and the id of apps which is member of this app profile in this session 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
String sessionId = "sessionId_example"; // String | 
try {
    AppProfileMemberAppsListInCsvFormat result = apiInstance.getAppdiscoverySessionAppProfileMemberAppsInCsvFormatCsv(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#getAppdiscoverySessionAppProfileMemberAppsInCsvFormatCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |

### Return type

[**AppProfileMemberAppsListInCsvFormat**](AppProfileMemberAppsListInCsvFormat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="reclassifyAppDiscoverySession"></a>
# **reclassifyAppDiscoverySession**
> AppDiscoverySessionResultSummary reclassifyAppDiscoverySession(body, sessionId)

Re-classify a completed application discovery session.

Re-classify completed application discovery session against input  AppProfiles. If no AppProfiles are specified then we use the previous  AppProfiles of that session. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
SessionReclassificationParameter body = new SessionReclassificationParameter(); // SessionReclassificationParameter | 
String sessionId = "sessionId_example"; // String | 
try {
    AppDiscoverySessionResultSummary result = apiInstance.reclassifyAppDiscoverySession(body, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#reclassifyAppDiscoverySession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SessionReclassificationParameter**](SessionReclassificationParameter.md)|  |
 **sessionId** | **String**|  |

### Return type

[**AppDiscoverySessionResultSummary**](AppDiscoverySessionResultSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startAppDiscoverySession"></a>
# **startAppDiscoverySession**
> AppDiscoverySession startAppDiscoverySession(body)

Starts the discovery of application discovery session

Starts the discovery of application discovery session 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
StartAppDiscoverySessionParameters body = new StartAppDiscoverySessionParameters(); // StartAppDiscoverySessionParameters | 
try {
    AppDiscoverySession result = apiInstance.startAppDiscoverySession(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#startAppDiscoverySession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartAppDiscoverySessionParameters**](StartAppDiscoverySessionParameters.md)|  |

### Return type

[**AppDiscoverySession**](AppDiscoverySession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAppProfile"></a>
# **updateAppProfile**
> AppProfile updateAppProfile(body, appProfileId)

Update AppProfile

Update AppProfile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiAppDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiAppDiscoveryApi apiInstance = new ManagementPlaneApiAppDiscoveryApi();
AppProfile body = new AppProfile(); // AppProfile | 
String appProfileId = "appProfileId_example"; // String | 
try {
    AppProfile result = apiInstance.updateAppProfile(body, appProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiAppDiscoveryApi#updateAppProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppProfile**](AppProfile.md)|  |
 **appProfileId** | **String**|  |

### Return type

[**AppProfile**](AppProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

