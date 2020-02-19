# ManagementPlaneApiServicesDnsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearDnsForwarderCacheClearCache**](ManagementPlaneApiServicesDnsApi.md#clearDnsForwarderCacheClearCache) | **POST** /dns/forwarders/{forwarder-id}?action&#x3D;clear_cache | Clear the current cache of the DNS forwarder.
[**createDnsForwader**](ManagementPlaneApiServicesDnsApi.md#createDnsForwader) | **POST** /dns/forwarders | Create a DNS forwader
[**deleteDnsForwarder**](ManagementPlaneApiServicesDnsApi.md#deleteDnsForwarder) | **DELETE** /dns/forwarders/{forwarder-id} | Delete a specific DNS forwarder
[**disableDnsForwarderDisable**](ManagementPlaneApiServicesDnsApi.md#disableDnsForwarderDisable) | **POST** /dns/forwarders/{forwarder-id}?action&#x3D;disable | Disable the DNS forwarder.
[**enableDnsForwarderEnable**](ManagementPlaneApiServicesDnsApi.md#enableDnsForwarderEnable) | **POST** /dns/forwarders/{forwarder-id}?action&#x3D;enable | Enable the DNS forwarder.
[**getDnsForwarderState**](ManagementPlaneApiServicesDnsApi.md#getDnsForwarderState) | **GET** /dns/forwarders/{forwarder-id}/state | Get the realized state of a DNS forwarder
[**getDnsForwarderStatistics**](ManagementPlaneApiServicesDnsApi.md#getDnsForwarderStatistics) | **GET** /dns/forwarders/{forwarder-id}/statistics | Get statistics of given dns forwarder
[**getDnsForwarderStatus**](ManagementPlaneApiServicesDnsApi.md#getDnsForwarderStatus) | **GET** /dns/forwarders/{forwarder-id}/status | Get current status of the given DNS forwarder
[**getFailedDnsQueries**](ManagementPlaneApiServicesDnsApi.md#getFailedDnsQueries) | **GET** /dns/forwarders/{forwarder-id}/failed-queries | Get the recent failed DNS queries
[**listDnsForwaders**](ManagementPlaneApiServicesDnsApi.md#listDnsForwaders) | **GET** /dns/forwarders | Get a paginated list of DNS forwarders
[**lookupAddress**](ManagementPlaneApiServicesDnsApi.md#lookupAddress) | **GET** /dns/forwarders/{forwarder-id}/nslookup | Resolve a given address via the DNS forwarder
[**readDnsForwader**](ManagementPlaneApiServicesDnsApi.md#readDnsForwader) | **GET** /dns/forwarders/{forwarder-id} | Retrieve a DNS forwarder
[**updateDnsForwarder**](ManagementPlaneApiServicesDnsApi.md#updateDnsForwarder) | **PUT** /dns/forwarders/{forwarder-id} | Update a specific DNS forwarder

<a name="clearDnsForwarderCacheClearCache"></a>
# **clearDnsForwarderCacheClearCache**
> clearDnsForwarderCacheClearCache(forwarderId)

Clear the current cache of the DNS forwarder.

Clear the current cache of the DNS forwarder. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
try {
    apiInstance.clearDnsForwarderCacheClearCache(forwarderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#clearDnsForwarderCacheClearCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDnsForwader"></a>
# **createDnsForwader**
> DnsForwarder createDnsForwader(body)

Create a DNS forwader

Create a DNS forwader upon a logical router. There is only one DNS forwarder can be created upon a given logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
DnsForwarder body = new DnsForwarder(); // DnsForwarder | 
try {
    DnsForwarder result = apiInstance.createDnsForwader(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#createDnsForwader");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DnsForwarder**](DnsForwarder.md)|  |

### Return type

[**DnsForwarder**](DnsForwarder.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDnsForwarder"></a>
# **deleteDnsForwarder**
> deleteDnsForwarder(forwarderId)

Delete a specific DNS forwarder

Delete a specific DNS forwarder. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
try {
    apiInstance.deleteDnsForwarder(forwarderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#deleteDnsForwarder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disableDnsForwarderDisable"></a>
# **disableDnsForwarderDisable**
> disableDnsForwarderDisable(forwarderId)

Disable the DNS forwarder.

Disable the DNS forwarder if the forwarder is currently enbled. If the DNS forwarder is already disabled, the forwarder will not be re-disabled.  Please note, once a DNS forwarder is disabled then enabled, the previous DNS forwarder statistics counters will be reset. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
try {
    apiInstance.disableDnsForwarderDisable(forwarderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#disableDnsForwarderDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableDnsForwarderEnable"></a>
# **enableDnsForwarderEnable**
> enableDnsForwarderEnable(forwarderId)

Enable the DNS forwarder.

Enable the DNS forwarder if the forwarder is currently disabled. If the DNS forwarder is already enabled, the forwarder will not be re-enabled.  Please note, once a DNS forwarder is disabled then enabled, the previous DNS forwarder statistics counters will be reset. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
try {
    apiInstance.enableDnsForwarderEnable(forwarderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#enableDnsForwarderEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDnsForwarderState"></a>
# **getDnsForwarderState**
> ConfigurationState getDnsForwarderState(forwarderId, barrierId, requestId)

Get the realized state of a DNS forwarder

Return the realized state information of a DNS forwarder. After a DNS forwarder was created or updated, you can invoke this API to check the realization state of the forwarder. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    ConfigurationState result = apiInstance.getDnsForwarderState(forwarderId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#getDnsForwarderState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDnsForwarderStatistics"></a>
# **getDnsForwarderStatistics**
> DnsForwarderStatistics getDnsForwarderStatistics(forwarderId)

Get statistics of given dns forwarder

Returns the statistics of the given dns forwarder specified by forwarder id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
try {
    DnsForwarderStatistics result = apiInstance.getDnsForwarderStatistics(forwarderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#getDnsForwarderStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |

### Return type

[**DnsForwarderStatistics**](DnsForwarderStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDnsForwarderStatus"></a>
# **getDnsForwarderStatus**
> DnsForwarderStatus getDnsForwarderStatus(forwarderId)

Get current status of the given DNS forwarder

Returns the current status of the given DNS forwarder. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
try {
    DnsForwarderStatus result = apiInstance.getDnsForwarderStatus(forwarderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#getDnsForwarderStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |

### Return type

[**DnsForwarderStatus**](DnsForwarderStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFailedDnsQueries"></a>
# **getFailedDnsQueries**
> DnsFailedQueries getFailedDnsQueries(forwarderId, count)

Get the recent failed DNS queries

Return the given count of recent failed DNS queries from DNS forwarder. Since the DNS forwarder is running in Acitve/Standby HA mode on transport nodes, the given count of queries will be returned from each nodes. Hence the total queries returned could be doubled. If no count is specified, 100 recent failed queries are returned. If the recent failures is less than the given count, all the failures will be returned. The maximum count is 1,000. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
Long count = 789L; // Long | The count of the failed DNS queries
try {
    DnsFailedQueries result = apiInstance.getFailedDnsQueries(forwarderId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#getFailedDnsQueries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |
 **count** | **Long**| The count of the failed DNS queries | [optional] [enum: ]

### Return type

[**DnsFailedQueries**](DnsFailedQueries.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDnsForwaders"></a>
# **listDnsForwaders**
> DnsForwarderListResult listDnsForwaders(cursor, includedFields, pageSize, sortAscending, sortBy)

Get a paginated list of DNS forwarders

Get a paginated list of DNS forwarders. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DnsForwarderListResult result = apiInstance.listDnsForwaders(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#listDnsForwaders");
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

[**DnsForwarderListResult**](DnsForwarderListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lookupAddress"></a>
# **lookupAddress**
> DnsAnswer lookupAddress(forwarderId, address, serverIp, sourceIp)

Resolve a given address via the DNS forwarder

Query the nameserver for an ip-address or a FQDN of the given an address optionally using an specified DNS server. If the address is a fqdn, nslookup will resolve ip-address with it. If the address is an ip-address, do a reverse lookup and answer fqdn(s). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
String address = "address_example"; // String | IP address or FQDN for nslookup
String serverIp = "serverIp_example"; // String | IPv4 address
String sourceIp = "sourceIp_example"; // String | IPv4 address
try {
    DnsAnswer result = apiInstance.lookupAddress(forwarderId, address, serverIp, sourceIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#lookupAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |
 **address** | **String**| IP address or FQDN for nslookup | [optional]
 **serverIp** | **String**| IPv4 address | [optional]
 **sourceIp** | **String**| IPv4 address | [optional]

### Return type

[**DnsAnswer**](DnsAnswer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDnsForwader"></a>
# **readDnsForwader**
> DnsForwarder readDnsForwader(forwarderId)

Retrieve a DNS forwarder

Retrieve a DNS forwarder. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
String forwarderId = "forwarderId_example"; // String | 
try {
    DnsForwarder result = apiInstance.readDnsForwader(forwarderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#readDnsForwader");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwarderId** | **String**|  |

### Return type

[**DnsForwarder**](DnsForwarder.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDnsForwarder"></a>
# **updateDnsForwarder**
> DnsForwarder updateDnsForwarder(body, forwarderId)

Update a specific DNS forwarder

Update a specific DNS forwarder. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDnsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDnsApi apiInstance = new ManagementPlaneApiServicesDnsApi();
DnsForwarder body = new DnsForwarder(); // DnsForwarder | 
String forwarderId = "forwarderId_example"; // String | 
try {
    DnsForwarder result = apiInstance.updateDnsForwarder(body, forwarderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDnsApi#updateDnsForwarder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DnsForwarder**](DnsForwarder.md)|  |
 **forwarderId** | **String**|  |

### Return type

[**DnsForwarder**](DnsForwarder.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

