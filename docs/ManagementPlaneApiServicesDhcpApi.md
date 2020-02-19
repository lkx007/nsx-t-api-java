# ManagementPlaneApiServicesDhcpApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDhcpIpPool**](ManagementPlaneApiServicesDhcpApi.md#createDhcpIpPool) | **POST** /dhcp/servers/{server-id}/ip-pools | Create an ip pool for a DHCP server
[**createDhcpProfile**](ManagementPlaneApiServicesDhcpApi.md#createDhcpProfile) | **POST** /dhcp/server-profiles | Create a DHCP server profile
[**createDhcpServer**](ManagementPlaneApiServicesDhcpApi.md#createDhcpServer) | **POST** /dhcp/servers | Create a DHCP server
[**createDhcpStaticBinding**](ManagementPlaneApiServicesDhcpApi.md#createDhcpStaticBinding) | **POST** /dhcp/servers/{server-id}/static-bindings | Create a static binding for a DHCP server
[**deleteADhcpLease**](ManagementPlaneApiServicesDhcpApi.md#deleteADhcpLease) | **DELETE** /dhcp/servers/{server-id}/leases | Delete a single DHCP lease entry specified by ip and mac.
[**deleteDhcpIpPool**](ManagementPlaneApiServicesDhcpApi.md#deleteDhcpIpPool) | **DELETE** /dhcp/servers/{server-id}/ip-pools/{pool-id} | Delete a DHCP server&#x27;s IP pool
[**deleteDhcpProfile**](ManagementPlaneApiServicesDhcpApi.md#deleteDhcpProfile) | **DELETE** /dhcp/server-profiles/{profile-id} | Delete a DHCP server profile
[**deleteDhcpServer**](ManagementPlaneApiServicesDhcpApi.md#deleteDhcpServer) | **DELETE** /dhcp/servers/{server-id} | Delete a DHCP server
[**deleteDhcpStaticBinding**](ManagementPlaneApiServicesDhcpApi.md#deleteDhcpStaticBinding) | **DELETE** /dhcp/servers/{server-id}/static-bindings/{binding-id} | Delete a static binding
[**getDhcpIpPoolState**](ManagementPlaneApiServicesDhcpApi.md#getDhcpIpPoolState) | **GET** /dhcp/servers/{server-id}/ip-pools/{pool-id}/state | Get the realized state of a dhcp ip pool
[**getDhcpLeaseInfo**](ManagementPlaneApiServicesDhcpApi.md#getDhcpLeaseInfo) | **GET** /dhcp/servers/{server-id}/leases | Get specific leases of a given dhcp server
[**getDhcpServerState**](ManagementPlaneApiServicesDhcpApi.md#getDhcpServerState) | **GET** /dhcp/servers/{server-id}/state | Get the realized state of a dhcp server
[**getDhcpStaticBindingState**](ManagementPlaneApiServicesDhcpApi.md#getDhcpStaticBindingState) | **GET** /dhcp/servers/{server-id}/static-bindings/{binding-id}/state | Get the realized state of a dhcp static binding
[**getDhcpStatistics**](ManagementPlaneApiServicesDhcpApi.md#getDhcpStatistics) | **GET** /dhcp/servers/{server-id}/statistics | Get DHCP statistics with given dhcp server id
[**getDhcpStatus**](ManagementPlaneApiServicesDhcpApi.md#getDhcpStatus) | **GET** /dhcp/servers/{server-id}/status | Get DHCP service status with given dhcp server id
[**listDhcpIpPools**](ManagementPlaneApiServicesDhcpApi.md#listDhcpIpPools) | **GET** /dhcp/servers/{server-id}/ip-pools | Get a paginated list of a DHCP server&#x27;s IP pools
[**listDhcpProfiles**](ManagementPlaneApiServicesDhcpApi.md#listDhcpProfiles) | **GET** /dhcp/server-profiles | Get a paginated list of DHCP server profiles
[**listDhcpServers**](ManagementPlaneApiServicesDhcpApi.md#listDhcpServers) | **GET** /dhcp/servers | Get a paginated list of DHCP servers
[**listDhcpStaticBindings**](ManagementPlaneApiServicesDhcpApi.md#listDhcpStaticBindings) | **GET** /dhcp/servers/{server-id}/static-bindings | Get a paginated list of a DHCP server&#x27;s static bindings
[**readDhcpIpPool**](ManagementPlaneApiServicesDhcpApi.md#readDhcpIpPool) | **GET** /dhcp/servers/{server-id}/ip-pools/{pool-id} | Get a DHCP server&#x27;s IP pool with the specified pool ID
[**readDhcpProfile**](ManagementPlaneApiServicesDhcpApi.md#readDhcpProfile) | **GET** /dhcp/server-profiles/{profile-id} | Get a DHCP server profile
[**readDhcpServer**](ManagementPlaneApiServicesDhcpApi.md#readDhcpServer) | **GET** /dhcp/servers/{server-id} | Get a DHCP server
[**readDhcpStaticBinding**](ManagementPlaneApiServicesDhcpApi.md#readDhcpStaticBinding) | **GET** /dhcp/servers/{server-id}/static-bindings/{binding-id} | Get a DHCP server&#x27;s static binding with the specified binding ID
[**reallocateDhcpProfileEdgeClusterReallocate**](ManagementPlaneApiServicesDhcpApi.md#reallocateDhcpProfileEdgeClusterReallocate) | **POST** /dhcp/server-profiles/{server-profile-id}?action&#x3D;reallocate | Reallocate edge cluster and members of given DHCP profile.
[**updateDhcpIpPool**](ManagementPlaneApiServicesDhcpApi.md#updateDhcpIpPool) | **PUT** /dhcp/servers/{server-id}/ip-pools/{pool-id} | Update a DHCP server&#x27;s IP pool
[**updateDhcpProfile**](ManagementPlaneApiServicesDhcpApi.md#updateDhcpProfile) | **PUT** /dhcp/server-profiles/{profile-id} | Update a DHCP server profile
[**updateDhcpServer**](ManagementPlaneApiServicesDhcpApi.md#updateDhcpServer) | **PUT** /dhcp/servers/{server-id} | Update a DHCP server
[**updateDhcpStaticBinding**](ManagementPlaneApiServicesDhcpApi.md#updateDhcpStaticBinding) | **PUT** /dhcp/servers/{server-id}/static-bindings/{binding-id} | Update a DHCP server&#x27;s static binding

<a name="createDhcpIpPool"></a>
# **createDhcpIpPool**
> DhcpIpPool createDhcpIpPool(body, serverId)

Create an ip pool for a DHCP server

Create an ip pool for a local DHCP server

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
DhcpIpPool body = new DhcpIpPool(); // DhcpIpPool | 
String serverId = "serverId_example"; // String | 
try {
    DhcpIpPool result = apiInstance.createDhcpIpPool(body, serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#createDhcpIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpIpPool**](DhcpIpPool.md)|  |
 **serverId** | **String**|  |

### Return type

[**DhcpIpPool**](DhcpIpPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDhcpProfile"></a>
# **createDhcpProfile**
> DhcpProfile createDhcpProfile(body)

Create a DHCP server profile

Create a DHCP server profile. If no edge member is specified, edge members to run the dhcp servers will be auto-allocated from the edge cluster. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
DhcpProfile body = new DhcpProfile(); // DhcpProfile | 
try {
    DhcpProfile result = apiInstance.createDhcpProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#createDhcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpProfile**](DhcpProfile.md)|  |

### Return type

[**DhcpProfile**](DhcpProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDhcpServer"></a>
# **createDhcpServer**
> LogicalDhcpServer createDhcpServer(body)

Create a DHCP server

Create a logical DHCP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
LogicalDhcpServer body = new LogicalDhcpServer(); // LogicalDhcpServer | 
try {
    LogicalDhcpServer result = apiInstance.createDhcpServer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#createDhcpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalDhcpServer**](LogicalDhcpServer.md)|  |

### Return type

[**LogicalDhcpServer**](LogicalDhcpServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDhcpStaticBinding"></a>
# **createDhcpStaticBinding**
> DhcpStaticBinding createDhcpStaticBinding(body, serverId)

Create a static binding for a DHCP server

Create a static binding for a logical DHCP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
DhcpStaticBinding body = new DhcpStaticBinding(); // DhcpStaticBinding | 
String serverId = "serverId_example"; // String | 
try {
    DhcpStaticBinding result = apiInstance.createDhcpStaticBinding(body, serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#createDhcpStaticBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpStaticBinding**](DhcpStaticBinding.md)|  |
 **serverId** | **String**|  |

### Return type

[**DhcpStaticBinding**](DhcpStaticBinding.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteADhcpLease"></a>
# **deleteADhcpLease**
> deleteADhcpLease(serverId, ip, mac)

Delete a single DHCP lease entry specified by ip and mac.

Delete a single DHCP lease entry specified by ip and mac.  The DHCP server matches the DHCP lease with the given ip address and the mac address. The matched lease entry will be deleted. If no lease matches, the request is ignored.  The DHCP lease to be deleted will be removed by the system from both active and standby node. The system will report error if the DHCP lease could not be removed from both nodes. If the DHCP lease could not be removed on either node, please check the DHCP server status. Once the DHCP server status is UP, please invoke the deletion API again to ensure the lease gets deleted from both nodes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String ip = "ip_example"; // String | IPv4 or IPv6 address
String mac = "mac_example"; // String | MAC Address
try {
    apiInstance.deleteADhcpLease(serverId, ip, mac);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#deleteADhcpLease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **ip** | **String**| IPv4 or IPv6 address |
 **mac** | **String**| MAC Address |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDhcpIpPool"></a>
# **deleteDhcpIpPool**
> deleteDhcpIpPool(serverId, poolId)

Delete a DHCP server&#x27;s IP pool

Delete a specific ip pool of a given logical DHCP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String poolId = "poolId_example"; // String | 
try {
    apiInstance.deleteDhcpIpPool(serverId, poolId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#deleteDhcpIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **poolId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDhcpProfile"></a>
# **deleteDhcpProfile**
> deleteDhcpProfile(profileId)

Delete a DHCP server profile

Delete a DHCP server profile specified by the profile id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String profileId = "profileId_example"; // String | 
try {
    apiInstance.deleteDhcpProfile(profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#deleteDhcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDhcpServer"></a>
# **deleteDhcpServer**
> deleteDhcpServer(serverId)

Delete a DHCP server

Delete a logical DHCP server specified by server id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
try {
    apiInstance.deleteDhcpServer(serverId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#deleteDhcpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDhcpStaticBinding"></a>
# **deleteDhcpStaticBinding**
> deleteDhcpStaticBinding(serverId, bindingId)

Delete a static binding

Delete a specific static binding of a given logical DHCP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String bindingId = "bindingId_example"; // String | 
try {
    apiInstance.deleteDhcpStaticBinding(serverId, bindingId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#deleteDhcpStaticBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **bindingId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDhcpIpPoolState"></a>
# **getDhcpIpPoolState**
> ConfigurationState getDhcpIpPoolState(serverId, poolId, barrierId, requestId)

Get the realized state of a dhcp ip pool

Return realized state information of a dhcp ip pool. After a dhcp ip pool is created or updated, you can invoke this API to get the realization information of the ip pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String poolId = "poolId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    ConfigurationState result = apiInstance.getDhcpIpPoolState(serverId, poolId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#getDhcpIpPoolState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **poolId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDhcpLeaseInfo"></a>
# **getDhcpLeaseInfo**
> DhcpLeases getDhcpLeaseInfo(serverId, address, poolId, source)

Get specific leases of a given dhcp server

Get specific leases of a given dhcp server. As a dhcp server could manage millions of leases, the API has to limit the number of the returned leases via two mutually-excluded request parameters, i.e. \&quot;pool_id\&quot; and \&quot;address\&quot;. Either a \&quot;pool_id\&quot; or an \&quot;address\&quot; can be provided, but not both in a same call.  If a \&quot;pool_id\&quot; is specified, the leases of the specific pool are returned. If an \&quot;address\&quot; is specified, only the lease(s) represented y this address is(are) returned. The \&quot;address\&quot; can be a single IP, an ip-range, or a mac address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String address = "address_example"; // String | can be an ip address, or an ip range, or a mac address
String poolId = "poolId_example"; // String | The uuid of dhcp ip pool
String source = "source_example"; // String | Data source type.
try {
    DhcpLeases result = apiInstance.getDhcpLeaseInfo(serverId, address, poolId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#getDhcpLeaseInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **address** | **String**| can be an ip address, or an ip range, or a mac address | [optional]
 **poolId** | **String**| The uuid of dhcp ip pool | [optional]
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**DhcpLeases**](DhcpLeases.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDhcpServerState"></a>
# **getDhcpServerState**
> ConfigurationState getDhcpServerState(serverId, barrierId, requestId)

Get the realized state of a dhcp server

Return realized state information of a dhcp server. After a dhcp server is created or updated, you can invoke this API to get the realization information of the server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    ConfigurationState result = apiInstance.getDhcpServerState(serverId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#getDhcpServerState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDhcpStaticBindingState"></a>
# **getDhcpStaticBindingState**
> ConfigurationState getDhcpStaticBindingState(serverId, bindingId, barrierId, requestId)

Get the realized state of a dhcp static binding

Return realized state information of a dhcp static binding. After a dhcp static binding is created or updated, you can invoke this API to get the realization information of the static binding. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String bindingId = "bindingId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    ConfigurationState result = apiInstance.getDhcpStaticBindingState(serverId, bindingId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#getDhcpStaticBindingState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **bindingId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDhcpStatistics"></a>
# **getDhcpStatistics**
> DhcpStatistics getDhcpStatistics(serverId)

Get DHCP statistics with given dhcp server id

Returns the statistics of the given dhcp server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
try {
    DhcpStatistics result = apiInstance.getDhcpStatistics(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#getDhcpStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |

### Return type

[**DhcpStatistics**](DhcpStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDhcpStatus"></a>
# **getDhcpStatus**
> DhcpServerStatus getDhcpStatus(serverId)

Get DHCP service status with given dhcp server id

Returns the service status of the given dhcp server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
try {
    DhcpServerStatus result = apiInstance.getDhcpStatus(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#getDhcpStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |

### Return type

[**DhcpServerStatus**](DhcpServerStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDhcpIpPools"></a>
# **listDhcpIpPools**
> DhcpIpPoolListResult listDhcpIpPools(serverId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get a paginated list of a DHCP server&#x27;s IP pools

List the ip pools of a logical DHCP server with pagination support. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DhcpIpPoolListResult result = apiInstance.listDhcpIpPools(serverId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#listDhcpIpPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**DhcpIpPoolListResult**](DhcpIpPoolListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDhcpProfiles"></a>
# **listDhcpProfiles**
> DhcpProfileListResult listDhcpProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Get a paginated list of DHCP server profiles

Get a paginated list of DHCP server profiles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DhcpProfileListResult result = apiInstance.listDhcpProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#listDhcpProfiles");
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

[**DhcpProfileListResult**](DhcpProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDhcpServers"></a>
# **listDhcpServers**
> LogicalDhcpServerListResult listDhcpServers(cursor, includedFields, pageSize, sortAscending, sortBy)

Get a paginated list of DHCP servers

List logical DHCP servers with pagination support.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LogicalDhcpServerListResult result = apiInstance.listDhcpServers(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#listDhcpServers");
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

[**LogicalDhcpServerListResult**](LogicalDhcpServerListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDhcpStaticBindings"></a>
# **listDhcpStaticBindings**
> DhcpStaticBindingListResult listDhcpStaticBindings(serverId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get a paginated list of a DHCP server&#x27;s static bindings

Return a paginated list of a static bindings of a given logical DHCP server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DhcpStaticBindingListResult result = apiInstance.listDhcpStaticBindings(serverId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#listDhcpStaticBindings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**DhcpStaticBindingListResult**](DhcpStaticBindingListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDhcpIpPool"></a>
# **readDhcpIpPool**
> DhcpIpPool readDhcpIpPool(serverId, poolId)

Get a DHCP server&#x27;s IP pool with the specified pool ID

Return a specific ip pool of a given logical DHCP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String poolId = "poolId_example"; // String | 
try {
    DhcpIpPool result = apiInstance.readDhcpIpPool(serverId, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#readDhcpIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **poolId** | **String**|  |

### Return type

[**DhcpIpPool**](DhcpIpPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDhcpProfile"></a>
# **readDhcpProfile**
> DhcpProfile readDhcpProfile(profileId)

Get a DHCP server profile

Return the DHCP profile specified by the profile id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String profileId = "profileId_example"; // String | 
try {
    DhcpProfile result = apiInstance.readDhcpProfile(profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#readDhcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**|  |

### Return type

[**DhcpProfile**](DhcpProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDhcpServer"></a>
# **readDhcpServer**
> LogicalDhcpServer readDhcpServer(serverId)

Get a DHCP server

Retrieve a logical DHCP server specified by server id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
try {
    LogicalDhcpServer result = apiInstance.readDhcpServer(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#readDhcpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |

### Return type

[**LogicalDhcpServer**](LogicalDhcpServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDhcpStaticBinding"></a>
# **readDhcpStaticBinding**
> DhcpStaticBinding readDhcpStaticBinding(serverId, bindingId)

Get a DHCP server&#x27;s static binding with the specified binding ID

Return a specific static binding of a given logical DHCP server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
String serverId = "serverId_example"; // String | 
String bindingId = "bindingId_example"; // String | 
try {
    DhcpStaticBinding result = apiInstance.readDhcpStaticBinding(serverId, bindingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#readDhcpStaticBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**|  |
 **bindingId** | **String**|  |

### Return type

[**DhcpStaticBinding**](DhcpStaticBinding.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reallocateDhcpProfileEdgeClusterReallocate"></a>
# **reallocateDhcpProfileEdgeClusterReallocate**
> DhcpProfile reallocateDhcpProfileEdgeClusterReallocate(body, serverProfileId)

Reallocate edge cluster and members of given DHCP profile.

As changing edge-cluster-id of a DhcpProfile by a PUT is disallowed, this re-allocate API is used to modify the edge-cluster-id and members of a given DhcpProfile.  Only the edge-cluster-id and the edge-cluster-member-indexes fields will be picked up by this re-allication API. The othere fields in the payload will be ignored.  If the edge-cluster-id in the payload DhcpProfile is different from the current edge-cluster-id of the profile, the referencing DHCP server(s) will be re-allocated to the new edge cluster. If the edge-cluster-id is not changed, the referencing DHCP server(s) will be re-allocated to the given edge members in the edge cluster. In this case, this REST API will act same as that of updating a DhcpProfile.  If the edge cluster member indexes are provided, they should exist in the given edge cluster. If the indexes are not specified in the DhcpProfile, edge members will be auto-allocated from the given edge cluster.  Please note that re-allocating edge-cluster will cause lose of all exisitng DHCP lease information. This API is used only when loosing DHCP leases is not a real problem, e.g. cross-site migration or failover and all client hosts will be reboot and get new IP addresses. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
DhcpProfile body = new DhcpProfile(); // DhcpProfile | 
String serverProfileId = "serverProfileId_example"; // String | 
try {
    DhcpProfile result = apiInstance.reallocateDhcpProfileEdgeClusterReallocate(body, serverProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#reallocateDhcpProfileEdgeClusterReallocate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpProfile**](DhcpProfile.md)|  |
 **serverProfileId** | **String**|  |

### Return type

[**DhcpProfile**](DhcpProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDhcpIpPool"></a>
# **updateDhcpIpPool**
> DhcpIpPool updateDhcpIpPool(body, serverId, poolId)

Update a DHCP server&#x27;s IP pool

Update a specific ip pool of a given logical DHCP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
DhcpIpPool body = new DhcpIpPool(); // DhcpIpPool | 
String serverId = "serverId_example"; // String | 
String poolId = "poolId_example"; // String | 
try {
    DhcpIpPool result = apiInstance.updateDhcpIpPool(body, serverId, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#updateDhcpIpPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpIpPool**](DhcpIpPool.md)|  |
 **serverId** | **String**|  |
 **poolId** | **String**|  |

### Return type

[**DhcpIpPool**](DhcpIpPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDhcpProfile"></a>
# **updateDhcpProfile**
> DhcpProfile updateDhcpProfile(body, profileId)

Update a DHCP server profile

Please note, the edge_cluster_id in DhcpProfile can NOT be changed by this PUT operation because all existing DHCP leases will lost. If loosing leases is not a problem, a dedicated re-allocation API is suggested to modify the edge-cluster-id.  If both the edge_cluster_member_indexes in the DhcpProfile are changed in a same PUT API, e.g. change from [a,b] to [x,y], the current DHCP server leases will be lost, which could cause the network crash due to ip conflicts. Hence the suggestion is to change only one member index in one single update, e.g. from [a, b] to [a,y]. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
DhcpProfile body = new DhcpProfile(); // DhcpProfile | 
String profileId = "profileId_example"; // String | 
try {
    DhcpProfile result = apiInstance.updateDhcpProfile(body, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#updateDhcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpProfile**](DhcpProfile.md)|  |
 **profileId** | **String**|  |

### Return type

[**DhcpProfile**](DhcpProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDhcpServer"></a>
# **updateDhcpServer**
> LogicalDhcpServer updateDhcpServer(body, serverId)

Update a DHCP server

Update a logical DHCP server with new configurations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
LogicalDhcpServer body = new LogicalDhcpServer(); // LogicalDhcpServer | 
String serverId = "serverId_example"; // String | 
try {
    LogicalDhcpServer result = apiInstance.updateDhcpServer(body, serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#updateDhcpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogicalDhcpServer**](LogicalDhcpServer.md)|  |
 **serverId** | **String**|  |

### Return type

[**LogicalDhcpServer**](LogicalDhcpServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDhcpStaticBinding"></a>
# **updateDhcpStaticBinding**
> DhcpStaticBinding updateDhcpStaticBinding(body, serverId, bindingId)

Update a DHCP server&#x27;s static binding

Update a specific static binding of a given local DHCP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesDhcpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesDhcpApi apiInstance = new ManagementPlaneApiServicesDhcpApi();
DhcpStaticBinding body = new DhcpStaticBinding(); // DhcpStaticBinding | 
String serverId = "serverId_example"; // String | 
String bindingId = "bindingId_example"; // String | 
try {
    DhcpStaticBinding result = apiInstance.updateDhcpStaticBinding(body, serverId, bindingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesDhcpApi#updateDhcpStaticBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DhcpStaticBinding**](DhcpStaticBinding.md)|  |
 **serverId** | **String**|  |
 **bindingId** | **String**|  |

### Return type

[**DhcpStaticBinding**](DhcpStaticBinding.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

