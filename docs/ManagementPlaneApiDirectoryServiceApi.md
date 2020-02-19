# ManagementPlaneApiDirectoryServiceApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDirectoryDomain**](ManagementPlaneApiDirectoryServiceApi.md#createDirectoryDomain) | **POST** /directory/domains | Create a directory domain
[**createDirectoryLdapServer**](ManagementPlaneApiDirectoryServiceApi.md#createDirectoryLdapServer) | **POST** /directory/domains/{domain-id}/ldap-servers | Create a LDAP server for directory domain
[**deleteDirectoryDomain**](ManagementPlaneApiDirectoryServiceApi.md#deleteDirectoryDomain) | **DELETE** /directory/domains/{domain-id} | Delete a specific domain with given identifier
[**deleteDirectoryLdapServer**](ManagementPlaneApiDirectoryServiceApi.md#deleteDirectoryLdapServer) | **DELETE** /directory/domains/{domain-id}/ldap-servers/{server-id} | Delete a LDAP server for directory domain
[**getDirectoryDomain**](ManagementPlaneApiDirectoryServiceApi.md#getDirectoryDomain) | **GET** /directory/domains/{domain-id} | Get a specific domain with given identifier
[**getDirectoryDomainSyncStats**](ManagementPlaneApiDirectoryServiceApi.md#getDirectoryDomainSyncStats) | **GET** /directory/domains/{domain-id}/sync-stats | Get domain sync statistics for the given identifier
[**getDirectoryLdapServer**](ManagementPlaneApiDirectoryServiceApi.md#getDirectoryLdapServer) | **GET** /directory/domains/{domain-id}/ldap-servers/{server-id} | Get a specific LDAP server for a given directory domain
[**listDirectoryDomains**](ManagementPlaneApiDirectoryServiceApi.md#listDirectoryDomains) | **GET** /directory/domains | List all configured domains
[**listDirectoryGroupMemberGroups**](ManagementPlaneApiDirectoryServiceApi.md#listDirectoryGroupMemberGroups) | **GET** /directory/domains/{domain-id}/groups/{group-id}/member-groups | List members of a directory group
[**listDirectoryLdapServers**](ManagementPlaneApiDirectoryServiceApi.md#listDirectoryLdapServers) | **GET** /directory/domains/{domain-id}/ldap-servers | List all configured domain LDAP servers
[**requestDirectoryDomainSync**](ManagementPlaneApiDirectoryServiceApi.md#requestDirectoryDomainSync) | **POST** /directory/domains/{domain-id} | Invoke full sync or delta sync for a specific domain, with additional delay in seconds if needed.  Stop sync will try to stop any pending sync if any to return to idle state.
[**searchDirectoryGroups**](ManagementPlaneApiDirectoryServiceApi.md#searchDirectoryGroups) | **GET** /directory/domains/{domain-id}/groups | Search for directory groups within a domain based on the substring of a distinguished name. (e.g. CN&#x3D;User,DC&#x3D;acme,DC&#x3D;com) The search filter pattern can optionally support multiple (up to 100 maximum) search pattern separated by &#x27;|&#x27; (url encoded %7C). In this case, the search results will be returned as the union of all matching criteria. (e.g. CN&#x3D;Ann,CN&#x3D;Users,DC&#x3D;acme,DC&#x3D;com|CN&#x3D;Bob,CN&#x3D;Users,DC&#x3D;acme,DC&#x3D;com)
[**testDirectoryLdapServer**](ManagementPlaneApiDirectoryServiceApi.md#testDirectoryLdapServer) | **POST** /directory/domains/{domain-id}/ldap-servers/{server-id} | Test a LDAP server connection for directory domain
[**updateDirectoryDomain**](ManagementPlaneApiDirectoryServiceApi.md#updateDirectoryDomain) | **PUT** /directory/domains/{domain-id} | Update a directory domain
[**updateDirectoryLdapServer**](ManagementPlaneApiDirectoryServiceApi.md#updateDirectoryLdapServer) | **PUT** /directory/domains/{domain-id}/ldap-servers/{server-id} | Update a LDAP server for directory domain
[**verifyDirectoryLdapServer**](ManagementPlaneApiDirectoryServiceApi.md#verifyDirectoryLdapServer) | **POST** /directory/ldap-server | Test a directory domain LDAP server connectivity

<a name="createDirectoryDomain"></a>
# **createDirectoryDomain**
> DirectoryDomain createDirectoryDomain(body)

Create a directory domain

Create a directory domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
DirectoryDomain body = new DirectoryDomain(); // DirectoryDomain | 
try {
    DirectoryDomain result = apiInstance.createDirectoryDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#createDirectoryDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryDomain**](DirectoryDomain.md)|  |

### Return type

[**DirectoryDomain**](DirectoryDomain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDirectoryLdapServer"></a>
# **createDirectoryLdapServer**
> DirectoryLdapServer createDirectoryLdapServer(body, domainId)

Create a LDAP server for directory domain

More than one LDAP server can be created and only one LDAP server is used to synchronize directory objects. If more than one LDAP server is configured, NSX will try all the servers until it is able to successfully connect to one.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
DirectoryLdapServer body = new DirectoryLdapServer(); // DirectoryLdapServer | 
String domainId = "domainId_example"; // String | Directory domain identifier
try {
    DirectoryLdapServer result = apiInstance.createDirectoryLdapServer(body, domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#createDirectoryLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryLdapServer**](DirectoryLdapServer.md)|  |
 **domainId** | **String**| Directory domain identifier |

### Return type

[**DirectoryLdapServer**](DirectoryLdapServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDirectoryDomain"></a>
# **deleteDirectoryDomain**
> deleteDirectoryDomain(domainId, force)

Delete a specific domain with given identifier

Delete a specific domain with given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteDirectoryDomain(domainId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#deleteDirectoryDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDirectoryLdapServer"></a>
# **deleteDirectoryLdapServer**
> deleteDirectoryLdapServer(domainId, serverId)

Delete a LDAP server for directory domain

Delete a LDAP server for directory domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
String serverId = "serverId_example"; // String | LDAP server identifier
try {
    apiInstance.deleteDirectoryLdapServer(domainId, serverId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#deleteDirectoryLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **serverId** | **String**| LDAP server identifier |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDirectoryDomain"></a>
# **getDirectoryDomain**
> DirectoryDomain getDirectoryDomain(domainId)

Get a specific domain with given identifier

Get a specific domain with given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
try {
    DirectoryDomain result = apiInstance.getDirectoryDomain(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#getDirectoryDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |

### Return type

[**DirectoryDomain**](DirectoryDomain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDirectoryDomainSyncStats"></a>
# **getDirectoryDomainSyncStats**
> DirectoryDomainSyncStats getDirectoryDomainSyncStats(domainId)

Get domain sync statistics for the given identifier

Get domain sync statistics for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
try {
    DirectoryDomainSyncStats result = apiInstance.getDirectoryDomainSyncStats(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#getDirectoryDomainSyncStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |

### Return type

[**DirectoryDomainSyncStats**](DirectoryDomainSyncStats.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDirectoryLdapServer"></a>
# **getDirectoryLdapServer**
> DirectoryLdapServer getDirectoryLdapServer(domainId, serverId)

Get a specific LDAP server for a given directory domain

Get a specific LDAP server for a given directory domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
String serverId = "serverId_example"; // String | LDAP server identifier
try {
    DirectoryLdapServer result = apiInstance.getDirectoryLdapServer(domainId, serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#getDirectoryLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **serverId** | **String**| LDAP server identifier |

### Return type

[**DirectoryLdapServer**](DirectoryLdapServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDirectoryDomains"></a>
# **listDirectoryDomains**
> DirectoryDomainListResults listDirectoryDomains(cursor, includedFields, pageSize, sortAscending, sortBy)

List all configured domains

List all configured domains

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DirectoryDomainListResults result = apiInstance.listDirectoryDomains(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#listDirectoryDomains");
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

[**DirectoryDomainListResults**](DirectoryDomainListResults.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDirectoryGroupMemberGroups"></a>
# **listDirectoryGroupMemberGroups**
> DirectoryGroupMemberListResults listDirectoryGroupMemberGroups(domainId, groupId, cursor, includedFields, pageSize, sortAscending, sortBy)

List members of a directory group

A member group could be either direct member of the group specified by group_id or nested member of it. Both direct member groups and nested member groups are returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
String groupId = "groupId_example"; // String | Directory group identifier
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DirectoryGroupMemberListResults result = apiInstance.listDirectoryGroupMemberGroups(domainId, groupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#listDirectoryGroupMemberGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **groupId** | **String**| Directory group identifier |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**DirectoryGroupMemberListResults**](DirectoryGroupMemberListResults.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDirectoryLdapServers"></a>
# **listDirectoryLdapServers**
> DirectoryLdapServerListResults listDirectoryLdapServers(domainId, cursor, includedFields, pageSize, sortAscending, sortBy)

List all configured domain LDAP servers

List all configured domain LDAP servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DirectoryLdapServerListResults result = apiInstance.listDirectoryLdapServers(domainId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#listDirectoryLdapServers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**DirectoryLdapServerListResults**](DirectoryLdapServerListResults.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestDirectoryDomainSync"></a>
# **requestDirectoryDomainSync**
> requestDirectoryDomainSync(domainId, action, delay)

Invoke full sync or delta sync for a specific domain, with additional delay in seconds if needed.  Stop sync will try to stop any pending sync if any to return to idle state.

Invoke full sync or delta sync for a specific domain, with additional delay in seconds if needed.  Stop sync will try to stop any pending sync if any to return to idle state.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
String action = "action_example"; // String | Sync type requested
Long delay = 789L; // Long | Request to execute the sync with some delay in seconds
try {
    apiInstance.requestDirectoryDomainSync(domainId, action, delay);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#requestDirectoryDomainSync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **action** | **String**| Sync type requested | [enum: FULL_SYNC, DELTA_SYNC, STOP_SYNC]
 **delay** | **Long**| Request to execute the sync with some delay in seconds | [optional] [enum: ]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchDirectoryGroups"></a>
# **searchDirectoryGroups**
> DirectoryGroupListResults searchDirectoryGroups(domainId, filterValue, cursor, includedFields, pageSize, sortAscending, sortBy)

Search for directory groups within a domain based on the substring of a distinguished name. (e.g. CN&#x3D;User,DC&#x3D;acme,DC&#x3D;com) The search filter pattern can optionally support multiple (up to 100 maximum) search pattern separated by &#x27;|&#x27; (url encoded %7C). In this case, the search results will be returned as the union of all matching criteria. (e.g. CN&#x3D;Ann,CN&#x3D;Users,DC&#x3D;acme,DC&#x3D;com|CN&#x3D;Bob,CN&#x3D;Users,DC&#x3D;acme,DC&#x3D;com)

Search for directory groups within a domain based on the substring of a distinguished name. (e.g. CN&#x3D;User,DC&#x3D;acme,DC&#x3D;com) The search filter pattern can optionally support multiple (up to 100 maximum) search pattern separated by &#x27;|&#x27; (url encoded %7C). In this case, the search results will be returned as the union of all matching criteria. (e.g. CN&#x3D;Ann,CN&#x3D;Users,DC&#x3D;acme,DC&#x3D;com|CN&#x3D;Bob,CN&#x3D;Users,DC&#x3D;acme,DC&#x3D;com)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
String filterValue = "filterValue_example"; // String | Name search filter value
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DirectoryGroupListResults result = apiInstance.searchDirectoryGroups(domainId, filterValue, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#searchDirectoryGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **filterValue** | **String**| Name search filter value |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**DirectoryGroupListResults**](DirectoryGroupListResults.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="testDirectoryLdapServer"></a>
# **testDirectoryLdapServer**
> testDirectoryLdapServer(domainId, serverId, action)

Test a LDAP server connection for directory domain

The API tests a LDAP server connection for an already configured domain. If the connection is successful, the response will be HTTP status 200. Otherwise the response will be HTTP status 500 and corresponding error message will be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
String domainId = "domainId_example"; // String | Directory domain identifier
String serverId = "serverId_example"; // String | LDAP server identifier
String action = "action_example"; // String | LDAP server test requested
try {
    apiInstance.testDirectoryLdapServer(domainId, serverId, action);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#testDirectoryLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| Directory domain identifier |
 **serverId** | **String**| LDAP server identifier |
 **action** | **String**| LDAP server test requested | [enum: CONNECTIVITY]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDirectoryDomain"></a>
# **updateDirectoryDomain**
> DirectoryDomain updateDirectoryDomain(body, domainId)

Update a directory domain

Update to any field in the directory domain will trigger a full sync

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
DirectoryDomain body = new DirectoryDomain(); // DirectoryDomain | 
String domainId = "domainId_example"; // String | Directory domain identifier
try {
    DirectoryDomain result = apiInstance.updateDirectoryDomain(body, domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#updateDirectoryDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryDomain**](DirectoryDomain.md)|  |
 **domainId** | **String**| Directory domain identifier |

### Return type

[**DirectoryDomain**](DirectoryDomain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDirectoryLdapServer"></a>
# **updateDirectoryLdapServer**
> DirectoryLdapServer updateDirectoryLdapServer(body, domainId, serverId)

Update a LDAP server for directory domain

Update a LDAP server for directory domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
DirectoryLdapServer body = new DirectoryLdapServer(); // DirectoryLdapServer | 
String domainId = "domainId_example"; // String | Directory domain identifier
String serverId = "serverId_example"; // String | LDAP server identifier
try {
    DirectoryLdapServer result = apiInstance.updateDirectoryLdapServer(body, domainId, serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#updateDirectoryLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryLdapServer**](DirectoryLdapServer.md)|  |
 **domainId** | **String**| Directory domain identifier |
 **serverId** | **String**| LDAP server identifier |

### Return type

[**DirectoryLdapServer**](DirectoryLdapServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyDirectoryLdapServer"></a>
# **verifyDirectoryLdapServer**
> DirectoryLdapServerStatus verifyDirectoryLdapServer(body, action)

Test a directory domain LDAP server connectivity

This API tests a LDAP server connectivity before the actual domain or LDAP server is configured. If the connectivity is good, the response will be HTTP status 200. Otherwise the response will be HTTP status 500 and corresponding error message will be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDirectoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDirectoryServiceApi apiInstance = new ManagementPlaneApiDirectoryServiceApi();
DirectoryLdapServer body = new DirectoryLdapServer(); // DirectoryLdapServer | 
String action = "action_example"; // String | LDAP server test requested
try {
    DirectoryLdapServerStatus result = apiInstance.verifyDirectoryLdapServer(body, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDirectoryServiceApi#verifyDirectoryLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryLdapServer**](DirectoryLdapServer.md)|  |
 **action** | **String**| LDAP server test requested | [enum: CONNECTIVITY]

### Return type

[**DirectoryLdapServerStatus**](DirectoryLdapServerStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

