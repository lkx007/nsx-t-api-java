# ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBgpNeighbor**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#addBgpNeighbor) | **POST** /logical-routers/{logical-router-id}/routing/bgp/neighbors | Add a new BGP Neighbor on a Logical Router
[**addIPPrefixList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#addIPPrefixList) | **POST** /logical-routers/{logical-router-id}/routing/ip-prefix-lists | Add IPPrefixList on a Logical Router
[**addRouteMap**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#addRouteMap) | **POST** /logical-routers/{logical-router-id}/routing/route-maps | Add RouteMap on a Logical Router
[**addStaticRoute**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#addStaticRoute) | **POST** /logical-routers/{logical-router-id}/routing/static-routes | Add Static Routes on a Logical Router
[**createBGPCommunityList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#createBGPCommunityList) | **POST** /logical-routers/{logical-router-id}/routing/bgp/community-lists | Create a new BGP community list on a Logical Router
[**createDADProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#createDADProfile) | **POST** /ipv6/dad-profiles | Create a new DADProfile
[**createNDRAProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#createNDRAProfile) | **POST** /ipv6/nd-ra-profiles | Create a new NDRA Profile
[**deleteBGPCommunityList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#deleteBGPCommunityList) | **DELETE** /logical-routers/{logical-router-id}/routing/bgp/community-lists/{community-list-id} | Delete a specific BGP community list from a Logical Router
[**deleteBgpNeighbor**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#deleteBgpNeighbor) | **DELETE** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{id} | Delete a specific BGP Neighbor on a Logical Router
[**deleteDADProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#deleteDADProfile) | **DELETE** /ipv6/dad-profiles/{dad-profile-id} | Delete DAD Profile
[**deleteIPPrefixList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#deleteIPPrefixList) | **DELETE** /logical-routers/{logical-router-id}/routing/ip-prefix-lists/{id} | Delete a specific IPPrefixList on a Logical Router
[**deleteNDRAProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#deleteNDRAProfile) | **DELETE** /ipv6/nd-ra-profiles/{nd-ra-profile-id} | Delete NDRA Profile
[**deleteRouteMap**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#deleteRouteMap) | **DELETE** /logical-routers/{logical-router-id}/routing/route-maps/{id} | Delete a specific RouteMap on a Logical Router
[**deleteStaticRoute**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#deleteStaticRoute) | **DELETE** /logical-routers/{logical-router-id}/routing/static-routes/{id} | Delete a specific Static Route on a Logical Router
[**listBGPCommunityLists**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#listBGPCommunityLists) | **GET** /logical-routers/{logical-router-id}/routing/bgp/community-lists | Paginated list of BGP community lists on a Logical Router
[**listBgpNeighbors**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#listBgpNeighbors) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors | Paginated list of BGP Neighbors on a Logical Router
[**listDADProfiles**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#listDADProfiles) | **GET** /ipv6/dad-profiles | Read All IPV6 DADProfiles
[**listIPPrefixLists**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#listIPPrefixLists) | **GET** /logical-routers/{logical-router-id}/routing/ip-prefix-lists | Paginated List of IPPrefixLists
[**listNDRAProfiles**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#listNDRAProfiles) | **GET** /ipv6/nd-ra-profiles | Read All IPV6 NDRA Profiles
[**listRouteMaps**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#listRouteMaps) | **GET** /logical-routers/{logical-router-id}/routing/route-maps | Paginated List of RouteMaps
[**listStaticRoutes**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#listStaticRoutes) | **GET** /logical-routers/{logical-router-id}/routing/static-routes | Paginated List of Static Routes
[**readAdvertiseRuleList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readAdvertiseRuleList) | **GET** /logical-routers/{logical-router-id}/routing/advertisement/rules | Read the Advertisement Rules on a Logical Router
[**readAdvertisementConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readAdvertisementConfig) | **GET** /logical-routers/{logical-router-id}/routing/advertisement | Read the Advertisement Configuration on a Logical Router
[**readBGPCommunityList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readBGPCommunityList) | **GET** /logical-routers/{logical-router-id}/routing/bgp/community-lists/{community-list-id} | Read a specific BGP community list from a Logical Router
[**readBgpConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readBgpConfig) | **GET** /logical-routers/{logical-router-id}/routing/bgp | Read the BGP Configuration on a Logical Router
[**readBgpNeighbor**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readBgpNeighbor) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{id} | Read a specific BGP Neighbor on a Logical Router
[**readBgpNeighborWithPasswordShowSensitiveData**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readBgpNeighborWithPasswordShowSensitiveData) | **GET** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{id}?action&#x3D;show-sensitive-data | Read a specific BGP Neighbor with password on a Logical Router
[**readDADProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readDADProfile) | **GET** /ipv6/dad-profiles/{dad-profile-id} | Read specified IPV6 DADProfile
[**readDebugInfoText**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readDebugInfoText) | **GET** /logical-routers/{logical-router-id}/debug-info?format&#x3D;text | Read the debug information for the logical router
[**readIPPrefixList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readIPPrefixList) | **GET** /logical-routers/{logical-router-id}/routing/ip-prefix-lists/{id} | Get a specific IPPrefixList on a Logical Router
[**readNDRAProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readNDRAProfile) | **GET** /ipv6/nd-ra-profiles/{nd-ra-profile-id} | Read specified IPV6 NDRA Profile
[**readRedistributionConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readRedistributionConfig) | **GET** /logical-routers/{logical-router-id}/routing/redistribution | Read the Redistribution Configuration on a Logical Router
[**readRedistributionRuleList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readRedistributionRuleList) | **GET** /logical-routers/{logical-router-id}/routing/redistribution/rules | Read All the Redistribution Rules on a Logical Router
[**readRouteMap**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readRouteMap) | **GET** /logical-routers/{logical-router-id}/routing/route-maps/{id} | Get a specific RouteMap on a Logical Router
[**readRoutingConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readRoutingConfig) | **GET** /logical-routers/{logical-router-id}/routing | Read the Routing Configuration
[**readStaticRoute**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#readStaticRoute) | **GET** /logical-routers/{logical-router-id}/routing/static-routes/{id} | Get a specific Static Route on a Logical Router
[**unSetPasswordOnBgpNeighbor**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#unSetPasswordOnBgpNeighbor) | **POST** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{id} | Unset/Delete password property on specific BGP Neighbor on Logical Router
[**updateAdvertiseRuleList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateAdvertiseRuleList) | **PUT** /logical-routers/{logical-router-id}/routing/advertisement/rules | Update the Advertisement Rules on a Logical Router
[**updateAdvertisementConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateAdvertisementConfig) | **PUT** /logical-routers/{logical-router-id}/routing/advertisement | Update the Advertisement Configuration on a Logical Router
[**updateBGPCommunityList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateBGPCommunityList) | **PUT** /logical-routers/{logical-router-id}/routing/bgp/community-lists/{community-list-id} | Update a specific BGP community list from a Logical Router
[**updateBGPCommunityListOld**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateBGPCommunityListOld) | **PUT** /logical-routers/{logical-router-id}/routing/bgp/communty-lists/{community-list-id} | Update a specific BGP community list from a Logical Router
[**updateBgpConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateBgpConfig) | **PUT** /logical-routers/{logical-router-id}/routing/bgp | Update the BGP Configuration on a Logical Router
[**updateBgpNeighbor**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateBgpNeighbor) | **PUT** /logical-routers/{logical-router-id}/routing/bgp/neighbors/{id} | Update a specific BGP Neighbor on a Logical Router
[**updateDADProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateDADProfile) | **PUT** /ipv6/dad-profiles/{dad-profile-id} | Update DADProfile
[**updateIPPrefixList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateIPPrefixList) | **PUT** /logical-routers/{logical-router-id}/routing/ip-prefix-lists/{id} | Update a specific IPPrefixList on a Logical Router
[**updateNDRAProfile**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateNDRAProfile) | **PUT** /ipv6/nd-ra-profiles/{nd-ra-profile-id} | Update NDRA Profile
[**updateRedistributionConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateRedistributionConfig) | **PUT** /logical-routers/{logical-router-id}/routing/redistribution | Update the Redistribution Configuration on a Logical Router
[**updateRedistributionRuleList**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateRedistributionRuleList) | **PUT** /logical-routers/{logical-router-id}/routing/redistribution/rules | Update All the Redistribution Rules on a Logical Router
[**updateRouteMap**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateRouteMap) | **PUT** /logical-routers/{logical-router-id}/routing/route-maps/{id} | Update a specific RouteMap on a Logical Router
[**updateRoutingConfig**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateRoutingConfig) | **PUT** /logical-routers/{logical-router-id}/routing | Update the Routing Configuration
[**updateStaticRoute**](ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi.md#updateStaticRoute) | **PUT** /logical-routers/{logical-router-id}/routing/static-routes/{id} | Update a specific Static Route Rule on a Logical Router

<a name="addBgpNeighbor"></a>
# **addBgpNeighbor**
> BgpNeighbor addBgpNeighbor(body, logicalRouterId)

Add a new BGP Neighbor on a Logical Router

Add a new BGP Neighbor on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
BgpNeighbor body = new BgpNeighbor(); // BgpNeighbor | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    BgpNeighbor result = apiInstance.addBgpNeighbor(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#addBgpNeighbor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BgpNeighbor**](BgpNeighbor.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**BgpNeighbor**](BgpNeighbor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addIPPrefixList"></a>
# **addIPPrefixList**
> IPPrefixList addIPPrefixList(body, logicalRouterId)

Add IPPrefixList on a Logical Router

Adds a new IPPrefixList on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
IPPrefixList body = new IPPrefixList(); // IPPrefixList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    IPPrefixList result = apiInstance.addIPPrefixList(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#addIPPrefixList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPPrefixList**](IPPrefixList.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**IPPrefixList**](IPPrefixList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRouteMap"></a>
# **addRouteMap**
> RouteMap addRouteMap(body, logicalRouterId)

Add RouteMap on a Logical Router

Adds a new RouteMap on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
RouteMap body = new RouteMap(); // RouteMap | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    RouteMap result = apiInstance.addRouteMap(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#addRouteMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteMap**](RouteMap.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**RouteMap**](RouteMap.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addStaticRoute"></a>
# **addStaticRoute**
> StaticRoute addStaticRoute(body, logicalRouterId)

Add Static Routes on a Logical Router

Adds a new static route on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
StaticRoute body = new StaticRoute(); // StaticRoute | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    StaticRoute result = apiInstance.addStaticRoute(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#addStaticRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StaticRoute**](StaticRoute.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**StaticRoute**](StaticRoute.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBGPCommunityList"></a>
# **createBGPCommunityList**
> BGPCommunityList createBGPCommunityList(body, logicalRouterId)

Create a new BGP community list on a Logical Router

Add a new BGP Community List on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
BGPCommunityList body = new BGPCommunityList(); // BGPCommunityList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    BGPCommunityList result = apiInstance.createBGPCommunityList(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#createBGPCommunityList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BGPCommunityList**](BGPCommunityList.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**BGPCommunityList**](BGPCommunityList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDADProfile"></a>
# **createDADProfile**
> DADProfile createDADProfile(body)

Create a new DADProfile

Adds a new DADProfile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
DADProfile body = new DADProfile(); // DADProfile | 
try {
    DADProfile result = apiInstance.createDADProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#createDADProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DADProfile**](DADProfile.md)|  |

### Return type

[**DADProfile**](DADProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNDRAProfile"></a>
# **createNDRAProfile**
> NDRAProfile createNDRAProfile(body)

Create a new NDRA Profile

Adds a new NDRAProfile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
NDRAProfile body = new NDRAProfile(); // NDRAProfile | 
try {
    NDRAProfile result = apiInstance.createNDRAProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#createNDRAProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NDRAProfile**](NDRAProfile.md)|  |

### Return type

[**NDRAProfile**](NDRAProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBGPCommunityList"></a>
# **deleteBGPCommunityList**
> deleteBGPCommunityList(logicalRouterId, communityListId)

Delete a specific BGP community list from a Logical Router

Delete a specific BGP community list from a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String communityListId = "communityListId_example"; // String | 
try {
    apiInstance.deleteBGPCommunityList(logicalRouterId, communityListId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#deleteBGPCommunityList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **communityListId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBgpNeighbor"></a>
# **deleteBgpNeighbor**
> deleteBgpNeighbor(logicalRouterId, id)

Delete a specific BGP Neighbor on a Logical Router

Delete a specific BGP Neighbor on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    apiInstance.deleteBgpNeighbor(logicalRouterId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#deleteBgpNeighbor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDADProfile"></a>
# **deleteDADProfile**
> deleteDADProfile(dadProfileId)

Delete DAD Profile

Delete DADProfile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String dadProfileId = "dadProfileId_example"; // String | 
try {
    apiInstance.deleteDADProfile(dadProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#deleteDADProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dadProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIPPrefixList"></a>
# **deleteIPPrefixList**
> deleteIPPrefixList(logicalRouterId, id)

Delete a specific IPPrefixList on a Logical Router

Deletes a specific IPPrefixList on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    apiInstance.deleteIPPrefixList(logicalRouterId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#deleteIPPrefixList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNDRAProfile"></a>
# **deleteNDRAProfile**
> deleteNDRAProfile(ndRaProfileId)

Delete NDRA Profile

Delete NDRAProfile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String ndRaProfileId = "ndRaProfileId_example"; // String | 
try {
    apiInstance.deleteNDRAProfile(ndRaProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#deleteNDRAProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndRaProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRouteMap"></a>
# **deleteRouteMap**
> deleteRouteMap(logicalRouterId, id)

Delete a specific RouteMap on a Logical Router

Deletes a specific RouteMap on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    apiInstance.deleteRouteMap(logicalRouterId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#deleteRouteMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStaticRoute"></a>
# **deleteStaticRoute**
> deleteStaticRoute(logicalRouterId, id)

Delete a specific Static Route on a Logical Router

Deletes a specific static route on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    apiInstance.deleteStaticRoute(logicalRouterId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#deleteStaticRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBGPCommunityLists"></a>
# **listBGPCommunityLists**
> BGPCommunityListListResult listBGPCommunityLists(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy)

Paginated list of BGP community lists on a Logical Router

Paginated list of BGP Community Lists on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    BGPCommunityListListResult result = apiInstance.listBGPCommunityLists(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#listBGPCommunityLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**BGPCommunityListListResult**](BGPCommunityListListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBgpNeighbors"></a>
# **listBgpNeighbors**
> BgpNeighborListResult listBgpNeighbors(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy)

Paginated list of BGP Neighbors on a Logical Router

Paginated list of BGP Neighbors on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    BgpNeighborListResult result = apiInstance.listBgpNeighbors(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#listBgpNeighbors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**BgpNeighborListResult**](BgpNeighborListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDADProfiles"></a>
# **listDADProfiles**
> DADProfileListResult listDADProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Read All IPV6 DADProfiles

Returns all IPv6 DADProfiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    DADProfileListResult result = apiInstance.listDADProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#listDADProfiles");
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

[**DADProfileListResult**](DADProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIPPrefixLists"></a>
# **listIPPrefixLists**
> IPPrefixListListResult listIPPrefixLists(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy)

Paginated List of IPPrefixLists

Paginated List of IPPrefixLists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    IPPrefixListListResult result = apiInstance.listIPPrefixLists(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#listIPPrefixLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**IPPrefixListListResult**](IPPrefixListListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNDRAProfiles"></a>
# **listNDRAProfiles**
> NDRAProfileListResult listNDRAProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Read All IPV6 NDRA Profiles

Returns all IPv6 NDRA Profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NDRAProfileListResult result = apiInstance.listNDRAProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#listNDRAProfiles");
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

[**NDRAProfileListResult**](NDRAProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRouteMaps"></a>
# **listRouteMaps**
> RouteMapListResult listRouteMaps(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy)

Paginated List of RouteMaps

Paginated List of RouteMaps

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    RouteMapListResult result = apiInstance.listRouteMaps(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#listRouteMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**RouteMapListResult**](RouteMapListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStaticRoutes"></a>
# **listStaticRoutes**
> StaticRouteListResult listStaticRoutes(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy)

Paginated List of Static Routes

Returns information about configured static routes, including the network address and next hops for each static route. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    StaticRouteListResult result = apiInstance.listStaticRoutes(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#listStaticRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**StaticRouteListResult**](StaticRouteListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAdvertiseRuleList"></a>
# **readAdvertiseRuleList**
> AdvertiseRuleList readAdvertiseRuleList(logicalRouterId)

Read the Advertisement Rules on a Logical Router

Returns the advertisement rule list for the specified TIER1 logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    AdvertiseRuleList result = apiInstance.readAdvertiseRuleList(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readAdvertiseRuleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**AdvertiseRuleList**](AdvertiseRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAdvertisementConfig"></a>
# **readAdvertisementConfig**
> AdvertisementConfig readAdvertisementConfig(logicalRouterId)

Read the Advertisement Configuration on a Logical Router

Returns information about the routes to be advertised by the specified TIER1 logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    AdvertisementConfig result = apiInstance.readAdvertisementConfig(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readAdvertisementConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**AdvertisementConfig**](AdvertisementConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBGPCommunityList"></a>
# **readBGPCommunityList**
> BGPCommunityList readBGPCommunityList(logicalRouterId, communityListId)

Read a specific BGP community list from a Logical Router

Read a specific BGP community list from a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String communityListId = "communityListId_example"; // String | 
try {
    BGPCommunityList result = apiInstance.readBGPCommunityList(logicalRouterId, communityListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readBGPCommunityList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **communityListId** | **String**|  |

### Return type

[**BGPCommunityList**](BGPCommunityList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBgpConfig"></a>
# **readBgpConfig**
> BgpConfig readBgpConfig(logicalRouterId)

Read the BGP Configuration on a Logical Router

Returns information about the BGP configuration on a specified logical router. Information includes whether or not the BGP configuration is enabled, the AS number, and whether or not graceful restart is enabled. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    BgpConfig result = apiInstance.readBgpConfig(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readBgpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**BgpConfig**](BgpConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBgpNeighbor"></a>
# **readBgpNeighbor**
> BgpNeighbor readBgpNeighbor(logicalRouterId, id)

Read a specific BGP Neighbor on a Logical Router

Read a specific BGP Neighbor on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    BgpNeighbor result = apiInstance.readBgpNeighbor(logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readBgpNeighbor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**BgpNeighbor**](BgpNeighbor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBgpNeighborWithPasswordShowSensitiveData"></a>
# **readBgpNeighborWithPasswordShowSensitiveData**
> BgpNeighbor readBgpNeighborWithPasswordShowSensitiveData(logicalRouterId, id)

Read a specific BGP Neighbor with password on a Logical Router

Read a specific BGP Neighbor details with password on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    BgpNeighbor result = apiInstance.readBgpNeighborWithPasswordShowSensitiveData(logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readBgpNeighborWithPasswordShowSensitiveData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**BgpNeighbor**](BgpNeighbor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDADProfile"></a>
# **readDADProfile**
> DADProfile readDADProfile(dadProfileId)

Read specified IPV6 DADProfile

Returns information about specified IPv6 DADProfile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String dadProfileId = "dadProfileId_example"; // String | 
try {
    DADProfile result = apiInstance.readDADProfile(dadProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readDADProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dadProfileId** | **String**|  |

### Return type

[**DADProfile**](DADProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDebugInfoText"></a>
# **readDebugInfoText**
> String readDebugInfoText(logicalRouterId)

Read the debug information for the logical router

API to download below information as text which will be used for debugging and troubleshooting. 1) Logical router sub-components and ports. 2) Routing configuration as sent to central control plane. 3) TIER1 advertised network information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    String result = apiInstance.readDebugInfoText(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readDebugInfoText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain; charset=utf-8

<a name="readIPPrefixList"></a>
# **readIPPrefixList**
> IPPrefixList readIPPrefixList(logicalRouterId, id)

Get a specific IPPrefixList on a Logical Router

Read a specific IPPrefixList on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    IPPrefixList result = apiInstance.readIPPrefixList(logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readIPPrefixList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**IPPrefixList**](IPPrefixList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNDRAProfile"></a>
# **readNDRAProfile**
> NDRAProfile readNDRAProfile(ndRaProfileId)

Read specified IPV6 NDRA Profile

Returns information about specified IPv6 NDRA Profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String ndRaProfileId = "ndRaProfileId_example"; // String | 
try {
    NDRAProfile result = apiInstance.readNDRAProfile(ndRaProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readNDRAProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndRaProfileId** | **String**|  |

### Return type

[**NDRAProfile**](NDRAProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRedistributionConfig"></a>
# **readRedistributionConfig**
> RedistributionConfig readRedistributionConfig(logicalRouterId)

Read the Redistribution Configuration on a Logical Router

Returns information about configured route redistribution for the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    RedistributionConfig result = apiInstance.readRedistributionConfig(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readRedistributionConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**RedistributionConfig**](RedistributionConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRedistributionRuleList"></a>
# **readRedistributionRuleList**
> RedistributionRuleList readRedistributionRuleList(logicalRouterId)

Read All the Redistribution Rules on a Logical Router

Returns all the route redistribution rules for the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    RedistributionRuleList result = apiInstance.readRedistributionRuleList(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readRedistributionRuleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**RedistributionRuleList**](RedistributionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRouteMap"></a>
# **readRouteMap**
> RouteMap readRouteMap(logicalRouterId, id)

Get a specific RouteMap on a Logical Router

Read a specific RouteMap on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    RouteMap result = apiInstance.readRouteMap(logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readRouteMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**RouteMap**](RouteMap.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRoutingConfig"></a>
# **readRoutingConfig**
> RoutingConfig readRoutingConfig(logicalRouterId)

Read the Routing Configuration

Returns the routing configuration for a specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    RoutingConfig result = apiInstance.readRoutingConfig(logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readRoutingConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |

### Return type

[**RoutingConfig**](RoutingConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readStaticRoute"></a>
# **readStaticRoute**
> StaticRoute readStaticRoute(logicalRouterId, id)

Get a specific Static Route on a Logical Router

Read a specific static routes on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    StaticRoute result = apiInstance.readStaticRoute(logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#readStaticRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**StaticRoute**](StaticRoute.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unSetPasswordOnBgpNeighbor"></a>
# **unSetPasswordOnBgpNeighbor**
> BgpNeighbor unSetPasswordOnBgpNeighbor(logicalRouterId, id, action)

Unset/Delete password property on specific BGP Neighbor on Logical Router

Unset/Delete the password property on the specific BGP Neighbor. No other property of the BgpNeighbor can be updated using this API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
String action = "action_example"; // String | 
try {
    BgpNeighbor result = apiInstance.unSetPasswordOnBgpNeighbor(logicalRouterId, id, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#unSetPasswordOnBgpNeighbor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |
 **action** | **String**|  | [optional] [enum: clear_password]

### Return type

[**BgpNeighbor**](BgpNeighbor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAdvertiseRuleList"></a>
# **updateAdvertiseRuleList**
> AdvertiseRuleList updateAdvertiseRuleList(body, logicalRouterId)

Update the Advertisement Rules on a Logical Router

Modifies the advertisement rules on the specified logical router. The PUT request must include all the rules with the networks parameter. Modifiable parameters are networks, display_name, and description. Set the rules list to empty to delete/clear all rules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
AdvertiseRuleList body = new AdvertiseRuleList(); // AdvertiseRuleList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    AdvertiseRuleList result = apiInstance.updateAdvertiseRuleList(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateAdvertiseRuleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseRuleList**](AdvertiseRuleList.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**AdvertiseRuleList**](AdvertiseRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAdvertisementConfig"></a>
# **updateAdvertisementConfig**
> AdvertisementConfig updateAdvertisementConfig(body, logicalRouterId)

Update the Advertisement Configuration on a Logical Router

Modifies the route advertisement configuration on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
AdvertisementConfig body = new AdvertisementConfig(); // AdvertisementConfig | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    AdvertisementConfig result = apiInstance.updateAdvertisementConfig(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateAdvertisementConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertisementConfig**](AdvertisementConfig.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**AdvertisementConfig**](AdvertisementConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBGPCommunityList"></a>
# **updateBGPCommunityList**
> BGPCommunityList updateBGPCommunityList(body, logicalRouterId, communityListId)

Update a specific BGP community list from a Logical Router

Update a specific BGP community list from a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
BGPCommunityList body = new BGPCommunityList(); // BGPCommunityList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String communityListId = "communityListId_example"; // String | 
try {
    BGPCommunityList result = apiInstance.updateBGPCommunityList(body, logicalRouterId, communityListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateBGPCommunityList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BGPCommunityList**](BGPCommunityList.md)|  |
 **logicalRouterId** | **String**|  |
 **communityListId** | **String**|  |

### Return type

[**BGPCommunityList**](BGPCommunityList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBGPCommunityListOld"></a>
# **updateBGPCommunityListOld**
> BGPCommunityList updateBGPCommunityListOld(body, logicalRouterId, communityListId)

Update a specific BGP community list from a Logical Router

Update a specific BGP community list from a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
BGPCommunityList body = new BGPCommunityList(); // BGPCommunityList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String communityListId = "communityListId_example"; // String | 
try {
    BGPCommunityList result = apiInstance.updateBGPCommunityListOld(body, logicalRouterId, communityListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateBGPCommunityListOld");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BGPCommunityList**](BGPCommunityList.md)|  |
 **logicalRouterId** | **String**|  |
 **communityListId** | **String**|  |

### Return type

[**BGPCommunityList**](BGPCommunityList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBgpConfig"></a>
# **updateBgpConfig**
> BgpConfig updateBgpConfig(body, logicalRouterId)

Update the BGP Configuration on a Logical Router

Modifies the BGP configuration on a specified TIER0 logical router. Modifiable parameters include enabled, graceful_restart, as_number. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
BgpConfig body = new BgpConfig(); // BgpConfig | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    BgpConfig result = apiInstance.updateBgpConfig(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateBgpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BgpConfig**](BgpConfig.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**BgpConfig**](BgpConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBgpNeighbor"></a>
# **updateBgpNeighbor**
> BgpNeighbor updateBgpNeighbor(body, logicalRouterId, id)

Update a specific BGP Neighbor on a Logical Router

Update a specific BGP Neighbor on a Logical Router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
BgpNeighbor body = new BgpNeighbor(); // BgpNeighbor | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    BgpNeighbor result = apiInstance.updateBgpNeighbor(body, logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateBgpNeighbor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BgpNeighbor**](BgpNeighbor.md)|  |
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**BgpNeighbor**](BgpNeighbor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDADProfile"></a>
# **updateDADProfile**
> DADProfile updateDADProfile(body, dadProfileId)

Update DADProfile

Update DADProfile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
DADProfile body = new DADProfile(); // DADProfile | 
String dadProfileId = "dadProfileId_example"; // String | 
try {
    DADProfile result = apiInstance.updateDADProfile(body, dadProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateDADProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DADProfile**](DADProfile.md)|  |
 **dadProfileId** | **String**|  |

### Return type

[**DADProfile**](DADProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIPPrefixList"></a>
# **updateIPPrefixList**
> IPPrefixList updateIPPrefixList(body, logicalRouterId, id)

Update a specific IPPrefixList on a Logical Router

Update a specific IPPrefixList on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
IPPrefixList body = new IPPrefixList(); // IPPrefixList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    IPPrefixList result = apiInstance.updateIPPrefixList(body, logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateIPPrefixList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPPrefixList**](IPPrefixList.md)|  |
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**IPPrefixList**](IPPrefixList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNDRAProfile"></a>
# **updateNDRAProfile**
> NDRAProfile updateNDRAProfile(body, ndRaProfileId)

Update NDRA Profile

Update NDRAProfile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
NDRAProfile body = new NDRAProfile(); // NDRAProfile | 
String ndRaProfileId = "ndRaProfileId_example"; // String | 
try {
    NDRAProfile result = apiInstance.updateNDRAProfile(body, ndRaProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateNDRAProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NDRAProfile**](NDRAProfile.md)|  |
 **ndRaProfileId** | **String**|  |

### Return type

[**NDRAProfile**](NDRAProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRedistributionConfig"></a>
# **updateRedistributionConfig**
> RedistributionConfig updateRedistributionConfig(body, logicalRouterId)

Update the Redistribution Configuration on a Logical Router

Modifies existing route redistribution rules for the specified TIER0 logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
RedistributionConfig body = new RedistributionConfig(); // RedistributionConfig | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    RedistributionConfig result = apiInstance.updateRedistributionConfig(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateRedistributionConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RedistributionConfig**](RedistributionConfig.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**RedistributionConfig**](RedistributionConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRedistributionRuleList"></a>
# **updateRedistributionRuleList**
> RedistributionRuleList updateRedistributionRuleList(body, logicalRouterId)

Update All the Redistribution Rules on a Logical Router

Modifies all route redistribution rules for the specified TIER0 logical router. Set the rules list to empty to delete/clear all rules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
RedistributionRuleList body = new RedistributionRuleList(); // RedistributionRuleList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    RedistributionRuleList result = apiInstance.updateRedistributionRuleList(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateRedistributionRuleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RedistributionRuleList**](RedistributionRuleList.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**RedistributionRuleList**](RedistributionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRouteMap"></a>
# **updateRouteMap**
> RouteMap updateRouteMap(body, logicalRouterId, id)

Update a specific RouteMap on a Logical Router

Update a specific RouteMap on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
RouteMap body = new RouteMap(); // RouteMap | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    RouteMap result = apiInstance.updateRouteMap(body, logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateRouteMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteMap**](RouteMap.md)|  |
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**RouteMap**](RouteMap.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRoutingConfig"></a>
# **updateRoutingConfig**
> RoutingConfig updateRoutingConfig(body, logicalRouterId)

Update the Routing Configuration

Modifies the routing configuration for a specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
RoutingConfig body = new RoutingConfig(); // RoutingConfig | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    RoutingConfig result = apiInstance.updateRoutingConfig(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateRoutingConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoutingConfig**](RoutingConfig.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**RoutingConfig**](RoutingConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStaticRoute"></a>
# **updateStaticRoute**
> StaticRoute updateStaticRoute(body, logicalRouterId, id)

Update a specific Static Route Rule on a Logical Router

Update a specific static route on the specified logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();
StaticRoute body = new StaticRoute(); // StaticRoute | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String id = "id_example"; // String | 
try {
    StaticRoute result = apiInstance.updateStaticRoute(body, logicalRouterId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi#updateStaticRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StaticRoute**](StaticRoute.md)|  |
 **logicalRouterId** | **String**|  |
 **id** | **String**|  |

### Return type

[**StaticRoute**](StaticRoute.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

