# ManagementPlaneApiServicesLoadbalancerApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLoadBalancerApplicationProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerApplicationProfile) | **POST** /loadbalancer/application-profiles | Create a load balancer application profile
[**createLoadBalancerClientSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerClientSslProfile) | **POST** /loadbalancer/client-ssl-profiles | Create a load balancer client-ssl profile
[**createLoadBalancerMonitor**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerMonitor) | **POST** /loadbalancer/monitors | Create a load balancer monitor
[**createLoadBalancerPersistenceProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerPersistenceProfile) | **POST** /loadbalancer/persistence-profiles | Create a load balancer persistence profile
[**createLoadBalancerPool**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerPool) | **POST** /loadbalancer/pools | Create a load balancer pool
[**createLoadBalancerRule**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerRule) | **POST** /loadbalancer/rules | Create a load balancer rule
[**createLoadBalancerServerSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerServerSslProfile) | **POST** /loadbalancer/server-ssl-profiles | Create a load balancer server-ssl profile
[**createLoadBalancerService**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerService) | **POST** /loadbalancer/services | Create a load balancer service
[**createLoadBalancerTcpProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerTcpProfile) | **POST** /loadbalancer/tcp-profiles | Create a load balancer TCP profile
[**createLoadBalancerVirtualServer**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerVirtualServer) | **POST** /loadbalancer/virtual-servers | Create a load balancer virtual server
[**createLoadBalancerVirtualServerWithRulesCreateWithRules**](ManagementPlaneApiServicesLoadbalancerApi.md#createLoadBalancerVirtualServerWithRulesCreateWithRules) | **POST** /loadbalancer/virtual-servers?action&#x3D;create_with_rules | Create a load balancer virtual server with rules
[**deleteLoadBalancerApplicationProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerApplicationProfile) | **DELETE** /loadbalancer/application-profiles/{application-profile-id} | Delete a load balancer application profile
[**deleteLoadBalancerClientSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerClientSslProfile) | **DELETE** /loadbalancer/client-ssl-profiles/{client-ssl-profile-id} | Delete a load balancer client-ssl profile
[**deleteLoadBalancerMonitor**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerMonitor) | **DELETE** /loadbalancer/monitors/{monitor-id} | Delete a load balancer monitor
[**deleteLoadBalancerPersistenceProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerPersistenceProfile) | **DELETE** /loadbalancer/persistence-profiles/{persistence-profile-id} | Delete a load balancer persistence profile
[**deleteLoadBalancerPool**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerPool) | **DELETE** /loadbalancer/pools/{pool-id} | Delete a load balancer pool
[**deleteLoadBalancerRule**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerRule) | **DELETE** /loadbalancer/rules/{rule-id} | Delete a load balancer rule
[**deleteLoadBalancerServerSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerServerSslProfile) | **DELETE** /loadbalancer/server-ssl-profiles/{server-ssl-profile-id} | Delete a load balancer server-ssl profile
[**deleteLoadBalancerService**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerService) | **DELETE** /loadbalancer/services/{service-id} | Delete a load balancer service
[**deleteLoadBalancerTcpProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerTcpProfile) | **DELETE** /loadbalancer/tcp-profiles/{tcp-profile-id} | Delete a load balancer TCP profile
[**deleteLoadBalancerVirtualServer**](ManagementPlaneApiServicesLoadbalancerApi.md#deleteLoadBalancerVirtualServer) | **DELETE** /loadbalancer/virtual-servers/{virtual-server-id} | Delete a load balancer virtual server
[**getLoadBalancerPoolStatistics**](ManagementPlaneApiServicesLoadbalancerApi.md#getLoadBalancerPoolStatistics) | **GET** /loadbalancer/services/{service-id}/pools/{pool-id}/statistics | Get the statistics of load balancer pool
[**getLoadBalancerPoolStatus**](ManagementPlaneApiServicesLoadbalancerApi.md#getLoadBalancerPoolStatus) | **GET** /loadbalancer/services/{service-id}/pools/{pool-id}/status | Get the status of load balancer pool
[**getLoadBalancerServiceStatistics**](ManagementPlaneApiServicesLoadbalancerApi.md#getLoadBalancerServiceStatistics) | **GET** /loadbalancer/services/{service-id}/statistics | Get the statistics of load balancer service
[**getLoadBalancerServiceStatus**](ManagementPlaneApiServicesLoadbalancerApi.md#getLoadBalancerServiceStatus) | **GET** /loadbalancer/services/{service-id}/status | Get the status of the given load balancer service
[**getLoadBalancerVirtualServerStatistics**](ManagementPlaneApiServicesLoadbalancerApi.md#getLoadBalancerVirtualServerStatistics) | **GET** /loadbalancer/services/{service-id}/virtual-servers/{virtual-server-id}/statistics | Get the statistics of the given load balancer virtual server
[**getLoadBalancerVirtualServerStatus**](ManagementPlaneApiServicesLoadbalancerApi.md#getLoadBalancerVirtualServerStatus) | **GET** /loadbalancer/services/{service-id}/virtual-servers/{virtual-server-id}/status | Get the status of the load balancer virtual server
[**listLoadBalancerApplicationProfiles**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerApplicationProfiles) | **GET** /loadbalancer/application-profiles | Retrieve a paginated list of load balancer application profiles
[**listLoadBalancerClientSslProfiles**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerClientSslProfiles) | **GET** /loadbalancer/client-ssl-profiles | Retrieve a paginated list of load balancer client-ssl profiles
[**listLoadBalancerMonitors**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerMonitors) | **GET** /loadbalancer/monitors | Retrieve a paginated list of load balancer monitors
[**listLoadBalancerPersistenceProfiles**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerPersistenceProfiles) | **GET** /loadbalancer/persistence-profiles | Retrieve a paginated list of load balancer persistence profiles
[**listLoadBalancerPoolStatistics**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerPoolStatistics) | **GET** /loadbalancer/services/{service-id}/pools/statistics | Get the statistics list of load balancer pools
[**listLoadBalancerPoolStatuses**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerPoolStatuses) | **GET** /loadbalancer/services/{service-id}/pools/status | Get the status list of load balancer pools
[**listLoadBalancerPools**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerPools) | **GET** /loadbalancer/pools | Retrieve a paginated list of load balancer pools
[**listLoadBalancerRules**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerRules) | **GET** /loadbalancer/rules | Retrieve a paginated list of load balancer rules
[**listLoadBalancerServerSslProfiles**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerServerSslProfiles) | **GET** /loadbalancer/server-ssl-profiles | Retrieve a paginated list of load balancer server-ssl profiles
[**listLoadBalancerServices**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerServices) | **GET** /loadbalancer/services | Retrieve a paginated list of load balancer services
[**listLoadBalancerSslCiphersAndProtocols**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerSslCiphersAndProtocols) | **GET** /loadbalancer/ssl/ciphers-and-protocols | Retrieve a list of supported SSL ciphers and protocols
[**listLoadBalancerTcpProfiles**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerTcpProfiles) | **GET** /loadbalancer/tcp-profiles | Retrieve a paginated list of load balancer TCP profiles
[**listLoadBalancerVirtualServerStatuses**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerVirtualServerStatuses) | **GET** /loadbalancer/services/{service-id}/virtual-servers/status | Get the status list of virtual servers in given load balancer service
[**listLoadBalancerVirtualServers**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerVirtualServers) | **GET** /loadbalancer/virtual-servers | Retrieve a paginated list of load balancer virtual servers
[**listLoadBalancerVirtualServersStatistics**](ManagementPlaneApiServicesLoadbalancerApi.md#listLoadBalancerVirtualServersStatistics) | **GET** /loadbalancer/services/{service-id}/virtual-servers/statistics | Get the statistics list of virtual servers
[**performPoolMemberAction**](ManagementPlaneApiServicesLoadbalancerApi.md#performPoolMemberAction) | **POST** /loadbalancer/pools/{pool-id} | Add, remove, or modify load balancer pool members
[**readLoadBalancerApplicationProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerApplicationProfile) | **GET** /loadbalancer/application-profiles/{application-profile-id} | Retrieve a load balancer application profile
[**readLoadBalancerClientSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerClientSslProfile) | **GET** /loadbalancer/client-ssl-profiles/{client-ssl-profile-id} | Retrieve a load balancer client-ssl profile
[**readLoadBalancerMonitor**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerMonitor) | **GET** /loadbalancer/monitors/{monitor-id} | Retrieve a load balancer monitor
[**readLoadBalancerNodeUsage**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerNodeUsage) | **GET** /loadbalancer/usage-per-node/{node-id} | Read load balancer usage for the given node
[**readLoadBalancerNodeUsageSummary**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerNodeUsageSummary) | **GET** /loadbalancer/node-usage-summary | Read load balancer node usage summary
[**readLoadBalancerPersistenceProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerPersistenceProfile) | **GET** /loadbalancer/persistence-profiles/{persistence-profile-id} | Retrieve a load balancer persistence profile
[**readLoadBalancerPool**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerPool) | **GET** /loadbalancer/pools/{pool-id} | Retrieve a load balancer pool
[**readLoadBalancerRule**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerRule) | **GET** /loadbalancer/rules/{rule-id} | Retrieve a load balancer rule
[**readLoadBalancerServerSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerServerSslProfile) | **GET** /loadbalancer/server-ssl-profiles/{server-ssl-profile-id} | Retrieve a load balancer server-ssl profile
[**readLoadBalancerService**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerService) | **GET** /loadbalancer/services/{service-id} | Retrieve a load balancer service
[**readLoadBalancerServiceDebugInfo**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerServiceDebugInfo) | **GET** /loadbalancer/services/{service-id}/debug-info | Read the debug information of the load balancer service
[**readLoadBalancerServiceUsage**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerServiceUsage) | **GET** /loadbalancer/services/{service-id}/usage | Read the usage information of the given load balancer service
[**readLoadBalancerTcpProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerTcpProfile) | **GET** /loadbalancer/tcp-profiles/{tcp-profile-id} | Retrieve a load balancer TCP profile
[**readLoadBalancerVirtualServer**](ManagementPlaneApiServicesLoadbalancerApi.md#readLoadBalancerVirtualServer) | **GET** /loadbalancer/virtual-servers/{virtual-server-id} | Retrieve a load balancer virtual server
[**updateLoadBalancerApplicationProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerApplicationProfile) | **PUT** /loadbalancer/application-profiles/{application-profile-id} | Update a load balancer application profile
[**updateLoadBalancerClientSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerClientSslProfile) | **PUT** /loadbalancer/client-ssl-profiles/{client-ssl-profile-id} | Update a load balancer client-ssl profile
[**updateLoadBalancerMonitor**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerMonitor) | **PUT** /loadbalancer/monitors/{monitor-id} | Update a load balancer monitor
[**updateLoadBalancerPersistenceProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerPersistenceProfile) | **PUT** /loadbalancer/persistence-profiles/{persistence-profile-id} | Update a load balancer persistence profile
[**updateLoadBalancerPool**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerPool) | **PUT** /loadbalancer/pools/{pool-id} | Update a load balancer pool
[**updateLoadBalancerRule**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerRule) | **PUT** /loadbalancer/rules/{rule-id} | Update a load balancer rule
[**updateLoadBalancerServerSslProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerServerSslProfile) | **PUT** /loadbalancer/server-ssl-profiles/{server-ssl-profile-id} | Update a load balancer server-ssl profile
[**updateLoadBalancerService**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerService) | **PUT** /loadbalancer/services/{service-id} | Update a load balancer service
[**updateLoadBalancerTcpProfile**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerTcpProfile) | **PUT** /loadbalancer/tcp-profiles/{tcp-profile-id} | Update a load balancer TCP profile
[**updateLoadBalancerVirtualServer**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerVirtualServer) | **PUT** /loadbalancer/virtual-servers/{virtual-server-id} | Update a load balancer virtual server
[**updateLoadBalancerVirtualServerWithRulesUpdateWithRules**](ManagementPlaneApiServicesLoadbalancerApi.md#updateLoadBalancerVirtualServerWithRulesUpdateWithRules) | **PUT** /loadbalancer/virtual-servers/{virtual-server-id}?action&#x3D;update_with_rules | Update a load balancer virtual server with rules

<a name="createLoadBalancerApplicationProfile"></a>
# **createLoadBalancerApplicationProfile**
> LbAppProfile createLoadBalancerApplicationProfile(body)

Create a load balancer application profile

Create a load balancer application profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbAppProfile body = new LbAppProfile(); // LbAppProfile | 
try {
    LbAppProfile result = apiInstance.createLoadBalancerApplicationProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerApplicationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbAppProfile**](LbAppProfile.md)|  |

### Return type

[**LbAppProfile**](LbAppProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerClientSslProfile"></a>
# **createLoadBalancerClientSslProfile**
> LbClientSslProfile createLoadBalancerClientSslProfile(body)

Create a load balancer client-ssl profile

Create a load balancer client-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbClientSslProfile body = new LbClientSslProfile(); // LbClientSslProfile | 
try {
    LbClientSslProfile result = apiInstance.createLoadBalancerClientSslProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerClientSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbClientSslProfile**](LbClientSslProfile.md)|  |

### Return type

[**LbClientSslProfile**](LbClientSslProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerMonitor"></a>
# **createLoadBalancerMonitor**
> LbMonitor createLoadBalancerMonitor(body)

Create a load balancer monitor

Create a load balancer monitor. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbMonitor body = new LbMonitor(); // LbMonitor | 
try {
    LbMonitor result = apiInstance.createLoadBalancerMonitor(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbMonitor**](LbMonitor.md)|  |

### Return type

[**LbMonitor**](LbMonitor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerPersistenceProfile"></a>
# **createLoadBalancerPersistenceProfile**
> LbPersistenceProfile createLoadBalancerPersistenceProfile(body)

Create a load balancer persistence profile

Create a load balancer persistence profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbPersistenceProfile body = new LbPersistenceProfile(); // LbPersistenceProfile | 
try {
    LbPersistenceProfile result = apiInstance.createLoadBalancerPersistenceProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerPersistenceProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbPersistenceProfile**](LbPersistenceProfile.md)|  |

### Return type

[**LbPersistenceProfile**](LbPersistenceProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerPool"></a>
# **createLoadBalancerPool**
> LbPool createLoadBalancerPool(body)

Create a load balancer pool

Create a load balancer pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbPool body = new LbPool(); // LbPool | 
try {
    LbPool result = apiInstance.createLoadBalancerPool(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbPool**](LbPool.md)|  |

### Return type

[**LbPool**](LbPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerRule"></a>
# **createLoadBalancerRule**
> LbRule createLoadBalancerRule(body)

Create a load balancer rule

Create a load balancer rule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbRule body = new LbRule(); // LbRule | 
try {
    LbRule result = apiInstance.createLoadBalancerRule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbRule**](LbRule.md)|  |

### Return type

[**LbRule**](LbRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerServerSslProfile"></a>
# **createLoadBalancerServerSslProfile**
> LbServerSslProfile createLoadBalancerServerSslProfile(body)

Create a load balancer server-ssl profile

Create a load balancer server-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbServerSslProfile body = new LbServerSslProfile(); // LbServerSslProfile | 
try {
    LbServerSslProfile result = apiInstance.createLoadBalancerServerSslProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerServerSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbServerSslProfile**](LbServerSslProfile.md)|  |

### Return type

[**LbServerSslProfile**](LbServerSslProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerService"></a>
# **createLoadBalancerService**
> LbService createLoadBalancerService(body)

Create a load balancer service

Create a load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbService body = new LbService(); // LbService | 
try {
    LbService result = apiInstance.createLoadBalancerService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbService**](LbService.md)|  |

### Return type

[**LbService**](LbService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerTcpProfile"></a>
# **createLoadBalancerTcpProfile**
> LbTcpProfile createLoadBalancerTcpProfile(body)

Create a load balancer TCP profile

Create a load balancer TCP profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbTcpProfile body = new LbTcpProfile(); // LbTcpProfile | 
try {
    LbTcpProfile result = apiInstance.createLoadBalancerTcpProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerTcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbTcpProfile**](LbTcpProfile.md)|  |

### Return type

[**LbTcpProfile**](LbTcpProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerVirtualServer"></a>
# **createLoadBalancerVirtualServer**
> LbVirtualServer createLoadBalancerVirtualServer(body)

Create a load balancer virtual server

Create a load balancer virtual server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbVirtualServer body = new LbVirtualServer(); // LbVirtualServer | 
try {
    LbVirtualServer result = apiInstance.createLoadBalancerVirtualServer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerVirtualServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbVirtualServer**](LbVirtualServer.md)|  |

### Return type

[**LbVirtualServer**](LbVirtualServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancerVirtualServerWithRulesCreateWithRules"></a>
# **createLoadBalancerVirtualServerWithRulesCreateWithRules**
> LbVirtualServerWithRule createLoadBalancerVirtualServerWithRulesCreateWithRules(body)

Create a load balancer virtual server with rules

It is used to create virtual servers, the associated rules and bind the rules to the virtual server. To add new rules, make sure the rules which have no identifier specified, the new rules are automatically generated and associated to the virtual server. If the virtual server need to consume some existed rules without change, those rules should not be specified in this array, otherwise, the rules are updated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbVirtualServerWithRule body = new LbVirtualServerWithRule(); // LbVirtualServerWithRule | 
try {
    LbVirtualServerWithRule result = apiInstance.createLoadBalancerVirtualServerWithRulesCreateWithRules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#createLoadBalancerVirtualServerWithRulesCreateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbVirtualServerWithRule**](LbVirtualServerWithRule.md)|  |

### Return type

[**LbVirtualServerWithRule**](LbVirtualServerWithRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLoadBalancerApplicationProfile"></a>
# **deleteLoadBalancerApplicationProfile**
> deleteLoadBalancerApplicationProfile(applicationProfileId)

Delete a load balancer application profile

Delete a load balancer application profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String applicationProfileId = "applicationProfileId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerApplicationProfile(applicationProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerApplicationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerClientSslProfile"></a>
# **deleteLoadBalancerClientSslProfile**
> deleteLoadBalancerClientSslProfile(clientSslProfileId)

Delete a load balancer client-ssl profile

Delete a load balancer client-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String clientSslProfileId = "clientSslProfileId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerClientSslProfile(clientSslProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerClientSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientSslProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerMonitor"></a>
# **deleteLoadBalancerMonitor**
> deleteLoadBalancerMonitor(monitorId)

Delete a load balancer monitor

Delete a load balancer monitor. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String monitorId = "monitorId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerMonitor(monitorId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitorId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerPersistenceProfile"></a>
# **deleteLoadBalancerPersistenceProfile**
> deleteLoadBalancerPersistenceProfile(persistenceProfileId)

Delete a load balancer persistence profile

Delete a load balancer persistence profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String persistenceProfileId = "persistenceProfileId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerPersistenceProfile(persistenceProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerPersistenceProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **persistenceProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerPool"></a>
# **deleteLoadBalancerPool**
> deleteLoadBalancerPool(poolId)

Delete a load balancer pool

Delete a load balancer pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String poolId = "poolId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerPool(poolId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerRule"></a>
# **deleteLoadBalancerRule**
> deleteLoadBalancerRule(ruleId)

Delete a load balancer rule

Delete a load balancer rule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String ruleId = "ruleId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerServerSslProfile"></a>
# **deleteLoadBalancerServerSslProfile**
> deleteLoadBalancerServerSslProfile(serverSslProfileId)

Delete a load balancer server-ssl profile

Delete a load balancer server-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serverSslProfileId = "serverSslProfileId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerServerSslProfile(serverSslProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerServerSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverSslProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerService"></a>
# **deleteLoadBalancerService**
> deleteLoadBalancerService(serviceId)

Delete a load balancer service

Delete a load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerService(serviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerTcpProfile"></a>
# **deleteLoadBalancerTcpProfile**
> deleteLoadBalancerTcpProfile(tcpProfileId)

Delete a load balancer TCP profile

Delete a load balancer TCP profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String tcpProfileId = "tcpProfileId_example"; // String | 
try {
    apiInstance.deleteLoadBalancerTcpProfile(tcpProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerTcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tcpProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadBalancerVirtualServer"></a>
# **deleteLoadBalancerVirtualServer**
> deleteLoadBalancerVirtualServer(virtualServerId, deleteAssociatedRules)

Delete a load balancer virtual server

Delete a load balancer virtual server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String virtualServerId = "virtualServerId_example"; // String | 
Boolean deleteAssociatedRules = true; // Boolean | Delete associated rules
try {
    apiInstance.deleteLoadBalancerVirtualServer(virtualServerId, deleteAssociatedRules);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#deleteLoadBalancerVirtualServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualServerId** | **String**|  |
 **deleteAssociatedRules** | **Boolean**| Delete associated rules | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancerPoolStatistics"></a>
# **getLoadBalancerPoolStatistics**
> LbPoolStatistics getLoadBalancerPoolStatistics(serviceId, poolId, source)

Get the statistics of load balancer pool

Returns the statistics of the given load balancer pool by given load balancer serives id and load balancer pool id. Currently, only realtime mode is supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String poolId = "poolId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbPoolStatistics result = apiInstance.getLoadBalancerPoolStatistics(serviceId, poolId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#getLoadBalancerPoolStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **poolId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbPoolStatistics**](LbPoolStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancerPoolStatus"></a>
# **getLoadBalancerPoolStatus**
> LbPoolStatus getLoadBalancerPoolStatus(serviceId, poolId, source)

Get the status of load balancer pool

Returns the status of the given load balancer pool by given load balancer serives id and load balancer pool id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String poolId = "poolId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbPoolStatus result = apiInstance.getLoadBalancerPoolStatus(serviceId, poolId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#getLoadBalancerPoolStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **poolId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbPoolStatus**](LbPoolStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancerServiceStatistics"></a>
# **getLoadBalancerServiceStatistics**
> LbServiceStatistics getLoadBalancerServiceStatistics(serviceId, source)

Get the statistics of load balancer service

Returns the statistics of the given load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbServiceStatistics result = apiInstance.getLoadBalancerServiceStatistics(serviceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#getLoadBalancerServiceStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbServiceStatistics**](LbServiceStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancerServiceStatus"></a>
# **getLoadBalancerServiceStatus**
> LbServiceStatus getLoadBalancerServiceStatus(serviceId, source)

Get the status of the given load balancer service

Returns the status of the given load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbServiceStatus result = apiInstance.getLoadBalancerServiceStatus(serviceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#getLoadBalancerServiceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbServiceStatus**](LbServiceStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancerVirtualServerStatistics"></a>
# **getLoadBalancerVirtualServerStatistics**
> LbVirtualServerStatistics getLoadBalancerVirtualServerStatistics(serviceId, virtualServerId, source)

Get the statistics of the given load balancer virtual server

Returns the statistics of the load balancer virtual server by given load  balancer serives id and load balancer virtual server id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String virtualServerId = "virtualServerId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbVirtualServerStatistics result = apiInstance.getLoadBalancerVirtualServerStatistics(serviceId, virtualServerId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#getLoadBalancerVirtualServerStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **virtualServerId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbVirtualServerStatistics**](LbVirtualServerStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancerVirtualServerStatus"></a>
# **getLoadBalancerVirtualServerStatus**
> LbVirtualServerStatus getLoadBalancerVirtualServerStatus(serviceId, virtualServerId, source)

Get the status of the load balancer virtual server

Returns the status of the virtual server by given load balancer serives id and load balancer virtual server id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String virtualServerId = "virtualServerId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbVirtualServerStatus result = apiInstance.getLoadBalancerVirtualServerStatus(serviceId, virtualServerId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#getLoadBalancerVirtualServerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **virtualServerId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbVirtualServerStatus**](LbVirtualServerStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerApplicationProfiles"></a>
# **listLoadBalancerApplicationProfiles**
> LbAppProfileListResult listLoadBalancerApplicationProfiles(cursor, includedFields, pageSize, sortAscending, sortBy, type)

Retrieve a paginated list of load balancer application profiles

Retrieve a paginated list of load balancer application profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String type = "type_example"; // String | application profile type
try {
    LbAppProfileListResult result = apiInstance.listLoadBalancerApplicationProfiles(cursor, includedFields, pageSize, sortAscending, sortBy, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerApplicationProfiles");
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
 **type** | **String**| application profile type | [optional] [enum: LbHttpProfile, LbFastTcpProfile, LbFastUdpProfile]

### Return type

[**LbAppProfileListResult**](LbAppProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerClientSslProfiles"></a>
# **listLoadBalancerClientSslProfiles**
> LbClientSslProfileListResult listLoadBalancerClientSslProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Retrieve a paginated list of load balancer client-ssl profiles

Retrieve a paginated list of load balancer client-ssl profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbClientSslProfileListResult result = apiInstance.listLoadBalancerClientSslProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerClientSslProfiles");
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

[**LbClientSslProfileListResult**](LbClientSslProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerMonitors"></a>
# **listLoadBalancerMonitors**
> LbMonitorListResult listLoadBalancerMonitors(cursor, includedFields, pageSize, sortAscending, sortBy, type)

Retrieve a paginated list of load balancer monitors

Retrieve a paginated list of load balancer monitors. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String type = "type_example"; // String | monitor query type
try {
    LbMonitorListResult result = apiInstance.listLoadBalancerMonitors(cursor, includedFields, pageSize, sortAscending, sortBy, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerMonitors");
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
 **type** | **String**| monitor query type | [optional] [enum: LbHttpMonitor, LbHttpsMonitor, LbIcmpMonitor, LbTcpMonitor, LbUdpMonitor, LbPassiveMonitor, LbActiveMonitor]

### Return type

[**LbMonitorListResult**](LbMonitorListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerPersistenceProfiles"></a>
# **listLoadBalancerPersistenceProfiles**
> LbPersistenceProfileListResult listLoadBalancerPersistenceProfiles(cursor, includedFields, pageSize, sortAscending, sortBy, type)

Retrieve a paginated list of load balancer persistence profiles

Retrieve a paginated list of load balancer persistence profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String type = "type_example"; // String | persistence profile type
try {
    LbPersistenceProfileListResult result = apiInstance.listLoadBalancerPersistenceProfiles(cursor, includedFields, pageSize, sortAscending, sortBy, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerPersistenceProfiles");
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
 **type** | **String**| persistence profile type | [optional] [enum: LbCookiePersistenceProfile, LbSourceIpPersistenceProfile, LbGenericPersistenceProfile]

### Return type

[**LbPersistenceProfileListResult**](LbPersistenceProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerPoolStatistics"></a>
# **listLoadBalancerPoolStatistics**
> LbPoolStatisticsListResult listLoadBalancerPoolStatistics(serviceId, source)

Get the statistics list of load balancer pools

Returns the statistics list of load balancer pools in given load balancer service. Currently, only realtime mode is supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbPoolStatisticsListResult result = apiInstance.listLoadBalancerPoolStatistics(serviceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerPoolStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbPoolStatisticsListResult**](LbPoolStatisticsListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerPoolStatuses"></a>
# **listLoadBalancerPoolStatuses**
> LbPoolStatusListResult listLoadBalancerPoolStatuses(serviceId, source)

Get the status list of load balancer pools

Returns the status list of load balancer pools in given load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbPoolStatusListResult result = apiInstance.listLoadBalancerPoolStatuses(serviceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerPoolStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbPoolStatusListResult**](LbPoolStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerPools"></a>
# **listLoadBalancerPools**
> LbPoolListResult listLoadBalancerPools(cursor, includedFields, pageSize, sortAscending, sortBy)

Retrieve a paginated list of load balancer pools

Retrieve a paginated list of load balancer pools. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbPoolListResult result = apiInstance.listLoadBalancerPools(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerPools");
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

[**LbPoolListResult**](LbPoolListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerRules"></a>
# **listLoadBalancerRules**
> LbRuleListResult listLoadBalancerRules(cursor, includedFields, pageSize, sortAscending, sortBy)

Retrieve a paginated list of load balancer rules

Retrieve a paginated list of load balancer rules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbRuleListResult result = apiInstance.listLoadBalancerRules(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerRules");
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

[**LbRuleListResult**](LbRuleListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerServerSslProfiles"></a>
# **listLoadBalancerServerSslProfiles**
> LbServerSslProfileListResult listLoadBalancerServerSslProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Retrieve a paginated list of load balancer server-ssl profiles

Retrieve a paginated list of load balancer server-ssl profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbServerSslProfileListResult result = apiInstance.listLoadBalancerServerSslProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerServerSslProfiles");
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

[**LbServerSslProfileListResult**](LbServerSslProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerServices"></a>
# **listLoadBalancerServices**
> LbServiceListResult listLoadBalancerServices(cursor, includedFields, logicalRouterId, pageSize, sortAscending, sortBy)

Retrieve a paginated list of load balancer services

Retrieve a paginated list of load balancer services. When logical_router_id is specified in request parameters, the associated load balancer services which are related to the given logical router returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String logicalRouterId = "logicalRouterId_example"; // String | Logical router identifier
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbServiceListResult result = apiInstance.listLoadBalancerServices(cursor, includedFields, logicalRouterId, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **logicalRouterId** | **String**| Logical router identifier | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**LbServiceListResult**](LbServiceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerSslCiphersAndProtocols"></a>
# **listLoadBalancerSslCiphersAndProtocols**
> LbSslCipherAndProtocolListResult listLoadBalancerSslCiphersAndProtocols(cursor, includedFields, pageSize, sortAscending, sortBy)

Retrieve a list of supported SSL ciphers and protocols

Retrieve a list of supported SSL ciphers and protocols. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbSslCipherAndProtocolListResult result = apiInstance.listLoadBalancerSslCiphersAndProtocols(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerSslCiphersAndProtocols");
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

[**LbSslCipherAndProtocolListResult**](LbSslCipherAndProtocolListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerTcpProfiles"></a>
# **listLoadBalancerTcpProfiles**
> LbTcpProfileListResult listLoadBalancerTcpProfiles(cursor, includedFields, pageSize, sortAscending, sortBy)

Retrieve a paginated list of load balancer TCP profiles

Retrieve a paginated list of load balancer TCP profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbTcpProfileListResult result = apiInstance.listLoadBalancerTcpProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerTcpProfiles");
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

[**LbTcpProfileListResult**](LbTcpProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerVirtualServerStatuses"></a>
# **listLoadBalancerVirtualServerStatuses**
> LbVirtualServerStatusListResult listLoadBalancerVirtualServerStatuses(serviceId, source)

Get the status list of virtual servers in given load balancer service

Returns the status list of virtual servers in given load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbVirtualServerStatusListResult result = apiInstance.listLoadBalancerVirtualServerStatuses(serviceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerVirtualServerStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbVirtualServerStatusListResult**](LbVirtualServerStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerVirtualServers"></a>
# **listLoadBalancerVirtualServers**
> LbVirtualServerListResult listLoadBalancerVirtualServers(cursor, includedFields, pageSize, sortAscending, sortBy)

Retrieve a paginated list of load balancer virtual servers

Retrieve a paginated list of load balancer virtual servers. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    LbVirtualServerListResult result = apiInstance.listLoadBalancerVirtualServers(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerVirtualServers");
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

[**LbVirtualServerListResult**](LbVirtualServerListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancerVirtualServersStatistics"></a>
# **listLoadBalancerVirtualServersStatistics**
> LbVirtualServerStatisticsListResult listLoadBalancerVirtualServersStatistics(serviceId, source)

Get the statistics list of virtual servers

Returns the statistics list of virtual servers in given load balancer service. Currently, only realtime mode is supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    LbVirtualServerStatisticsListResult result = apiInstance.listLoadBalancerVirtualServersStatistics(serviceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#listLoadBalancerVirtualServersStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**LbVirtualServerStatisticsListResult**](LbVirtualServerStatisticsListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="performPoolMemberAction"></a>
# **performPoolMemberAction**
> LbPool performPoolMemberAction(body, action, poolId)

Add, remove, or modify load balancer pool members

For ADD_MEMBERS, pool members will be created and added to load balancer pool. This action is only valid for static pool members. For REMOVE_MEMBERS, pool members will be removed from load balancer pool via IP and port in pool member settings. This action is only valid for static pool members. For UPDATE_MEMBERS, pool members admin state will be updated. This action is valid for both static pool members and dynamic pool members. For dynamic pool members, this update will be stored in customized_members field in load balancer pool member group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
PoolMemberSettingList body = new PoolMemberSettingList(); // PoolMemberSettingList | 
String action = "action_example"; // String | Specifies addition, removal and modification action
String poolId = "poolId_example"; // String | 
try {
    LbPool result = apiInstance.performPoolMemberAction(body, action, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#performPoolMemberAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolMemberSettingList**](PoolMemberSettingList.md)|  |
 **action** | **String**| Specifies addition, removal and modification action | [enum: ADD_MEMBERS, REMOVE_MEMBERS, UPDATE_MEMBERS]
 **poolId** | **String**|  |

### Return type

[**LbPool**](LbPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readLoadBalancerApplicationProfile"></a>
# **readLoadBalancerApplicationProfile**
> LbAppProfile readLoadBalancerApplicationProfile(applicationProfileId)

Retrieve a load balancer application profile

Retrieve a load balancer application profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String applicationProfileId = "applicationProfileId_example"; // String | 
try {
    LbAppProfile result = apiInstance.readLoadBalancerApplicationProfile(applicationProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerApplicationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationProfileId** | **String**|  |

### Return type

[**LbAppProfile**](LbAppProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerClientSslProfile"></a>
# **readLoadBalancerClientSslProfile**
> LbClientSslProfile readLoadBalancerClientSslProfile(clientSslProfileId)

Retrieve a load balancer client-ssl profile

Retrieve a load balancer client-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String clientSslProfileId = "clientSslProfileId_example"; // String | 
try {
    LbClientSslProfile result = apiInstance.readLoadBalancerClientSslProfile(clientSslProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerClientSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientSslProfileId** | **String**|  |

### Return type

[**LbClientSslProfile**](LbClientSslProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerMonitor"></a>
# **readLoadBalancerMonitor**
> LbMonitor readLoadBalancerMonitor(monitorId)

Retrieve a load balancer monitor

Retrieve a load balancer monitor. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String monitorId = "monitorId_example"; // String | 
try {
    LbMonitor result = apiInstance.readLoadBalancerMonitor(monitorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitorId** | **String**|  |

### Return type

[**LbMonitor**](LbMonitor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerNodeUsage"></a>
# **readLoadBalancerNodeUsage**
> LbNodeUsage readLoadBalancerNodeUsage(nodeId)

Read load balancer usage for the given node

API is used to retrieve the usage of load balancer entities which include current number and remaining number of credits, virtual Servers, pools, pool Members and different size of LB services from the given node. Currently only Edge node is supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String nodeId = "nodeId_example"; // String | 
try {
    LbNodeUsage result = apiInstance.readLoadBalancerNodeUsage(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerNodeUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**LbNodeUsage**](LbNodeUsage.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerNodeUsageSummary"></a>
# **readLoadBalancerNodeUsageSummary**
> LbNodeUsageSummary readLoadBalancerNodeUsageSummary(includeUsages)

Read load balancer node usage summary

API is used to retrieve the load balancer node usage summary for all nodes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
Boolean includeUsages = true; // Boolean | Whether to include node usages
try {
    LbNodeUsageSummary result = apiInstance.readLoadBalancerNodeUsageSummary(includeUsages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerNodeUsageSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeUsages** | **Boolean**| Whether to include node usages | [optional]

### Return type

[**LbNodeUsageSummary**](LbNodeUsageSummary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerPersistenceProfile"></a>
# **readLoadBalancerPersistenceProfile**
> LbPersistenceProfile readLoadBalancerPersistenceProfile(persistenceProfileId)

Retrieve a load balancer persistence profile

Retrieve a load balancer persistence profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String persistenceProfileId = "persistenceProfileId_example"; // String | 
try {
    LbPersistenceProfile result = apiInstance.readLoadBalancerPersistenceProfile(persistenceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerPersistenceProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **persistenceProfileId** | **String**|  |

### Return type

[**LbPersistenceProfile**](LbPersistenceProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerPool"></a>
# **readLoadBalancerPool**
> LbPool readLoadBalancerPool(poolId)

Retrieve a load balancer pool

Retrieve a load balancer pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String poolId = "poolId_example"; // String | 
try {
    LbPool result = apiInstance.readLoadBalancerPool(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**|  |

### Return type

[**LbPool**](LbPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerRule"></a>
# **readLoadBalancerRule**
> LbRule readLoadBalancerRule(ruleId)

Retrieve a load balancer rule

Retrieve a load balancer rule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String ruleId = "ruleId_example"; // String | 
try {
    LbRule result = apiInstance.readLoadBalancerRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**|  |

### Return type

[**LbRule**](LbRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerServerSslProfile"></a>
# **readLoadBalancerServerSslProfile**
> LbServerSslProfile readLoadBalancerServerSslProfile(serverSslProfileId)

Retrieve a load balancer server-ssl profile

Retrieve a load balancer server-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serverSslProfileId = "serverSslProfileId_example"; // String | 
try {
    LbServerSslProfile result = apiInstance.readLoadBalancerServerSslProfile(serverSslProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerServerSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverSslProfileId** | **String**|  |

### Return type

[**LbServerSslProfile**](LbServerSslProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerService"></a>
# **readLoadBalancerService**
> LbService readLoadBalancerService(serviceId)

Retrieve a load balancer service

Retrieve a load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
try {
    LbService result = apiInstance.readLoadBalancerService(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**LbService**](LbService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerServiceDebugInfo"></a>
# **readLoadBalancerServiceDebugInfo**
> LbServiceDebugInfo readLoadBalancerServiceDebugInfo(serviceId)

Read the debug information of the load balancer service

API to download below information which will be used for debugging and troubleshooting. 1) Load balancer service 2) Load balancer associated virtual servers 3) Load balancer associated pools 4) Load balancer associated profiles such as persistence, SSL, application. 5) Load balancer associated monitors 6) Load balancer associated rules 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
try {
    LbServiceDebugInfo result = apiInstance.readLoadBalancerServiceDebugInfo(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerServiceDebugInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**LbServiceDebugInfo**](LbServiceDebugInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerServiceUsage"></a>
# **readLoadBalancerServiceUsage**
> LbServiceUsage readLoadBalancerServiceUsage(serviceId)

Read the usage information of the given load balancer service

API to fetch the capacity and current usage of the given load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String serviceId = "serviceId_example"; // String | 
try {
    LbServiceUsage result = apiInstance.readLoadBalancerServiceUsage(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerServiceUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**LbServiceUsage**](LbServiceUsage.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerTcpProfile"></a>
# **readLoadBalancerTcpProfile**
> LbTcpProfile readLoadBalancerTcpProfile(tcpProfileId)

Retrieve a load balancer TCP profile

Retrieve a load balancer TCP profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String tcpProfileId = "tcpProfileId_example"; // String | 
try {
    LbTcpProfile result = apiInstance.readLoadBalancerTcpProfile(tcpProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerTcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tcpProfileId** | **String**|  |

### Return type

[**LbTcpProfile**](LbTcpProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLoadBalancerVirtualServer"></a>
# **readLoadBalancerVirtualServer**
> LbVirtualServer readLoadBalancerVirtualServer(virtualServerId)

Retrieve a load balancer virtual server

Retrieve a load balancer virtual server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
String virtualServerId = "virtualServerId_example"; // String | 
try {
    LbVirtualServer result = apiInstance.readLoadBalancerVirtualServer(virtualServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#readLoadBalancerVirtualServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualServerId** | **String**|  |

### Return type

[**LbVirtualServer**](LbVirtualServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoadBalancerApplicationProfile"></a>
# **updateLoadBalancerApplicationProfile**
> LbAppProfile updateLoadBalancerApplicationProfile(body, applicationProfileId)

Update a load balancer application profile

Update a load balancer application profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbAppProfile body = new LbAppProfile(); // LbAppProfile | 
String applicationProfileId = "applicationProfileId_example"; // String | 
try {
    LbAppProfile result = apiInstance.updateLoadBalancerApplicationProfile(body, applicationProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerApplicationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbAppProfile**](LbAppProfile.md)|  |
 **applicationProfileId** | **String**|  |

### Return type

[**LbAppProfile**](LbAppProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerClientSslProfile"></a>
# **updateLoadBalancerClientSslProfile**
> LbClientSslProfile updateLoadBalancerClientSslProfile(body, clientSslProfileId)

Update a load balancer client-ssl profile

Update a load balancer client-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbClientSslProfile body = new LbClientSslProfile(); // LbClientSslProfile | 
String clientSslProfileId = "clientSslProfileId_example"; // String | 
try {
    LbClientSslProfile result = apiInstance.updateLoadBalancerClientSslProfile(body, clientSslProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerClientSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbClientSslProfile**](LbClientSslProfile.md)|  |
 **clientSslProfileId** | **String**|  |

### Return type

[**LbClientSslProfile**](LbClientSslProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerMonitor"></a>
# **updateLoadBalancerMonitor**
> LbMonitor updateLoadBalancerMonitor(body, monitorId)

Update a load balancer monitor

Update a load balancer monitor. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbMonitor body = new LbMonitor(); // LbMonitor | 
String monitorId = "monitorId_example"; // String | 
try {
    LbMonitor result = apiInstance.updateLoadBalancerMonitor(body, monitorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbMonitor**](LbMonitor.md)|  |
 **monitorId** | **String**|  |

### Return type

[**LbMonitor**](LbMonitor.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerPersistenceProfile"></a>
# **updateLoadBalancerPersistenceProfile**
> LbPersistenceProfile updateLoadBalancerPersistenceProfile(body, persistenceProfileId)

Update a load balancer persistence profile

Update a load balancer persistence profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbPersistenceProfile body = new LbPersistenceProfile(); // LbPersistenceProfile | 
String persistenceProfileId = "persistenceProfileId_example"; // String | 
try {
    LbPersistenceProfile result = apiInstance.updateLoadBalancerPersistenceProfile(body, persistenceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerPersistenceProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbPersistenceProfile**](LbPersistenceProfile.md)|  |
 **persistenceProfileId** | **String**|  |

### Return type

[**LbPersistenceProfile**](LbPersistenceProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerPool"></a>
# **updateLoadBalancerPool**
> LbPool updateLoadBalancerPool(body, poolId)

Update a load balancer pool

Update a load balancer pool. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbPool body = new LbPool(); // LbPool | 
String poolId = "poolId_example"; // String | 
try {
    LbPool result = apiInstance.updateLoadBalancerPool(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbPool**](LbPool.md)|  |
 **poolId** | **String**|  |

### Return type

[**LbPool**](LbPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerRule"></a>
# **updateLoadBalancerRule**
> LbRule updateLoadBalancerRule(body, ruleId)

Update a load balancer rule

Update a load balancer rule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbRule body = new LbRule(); // LbRule | 
String ruleId = "ruleId_example"; // String | 
try {
    LbRule result = apiInstance.updateLoadBalancerRule(body, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbRule**](LbRule.md)|  |
 **ruleId** | **String**|  |

### Return type

[**LbRule**](LbRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerServerSslProfile"></a>
# **updateLoadBalancerServerSslProfile**
> LbServerSslProfile updateLoadBalancerServerSslProfile(body, serverSslProfileId)

Update a load balancer server-ssl profile

Update a load balancer server-ssl profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbServerSslProfile body = new LbServerSslProfile(); // LbServerSslProfile | 
String serverSslProfileId = "serverSslProfileId_example"; // String | 
try {
    LbServerSslProfile result = apiInstance.updateLoadBalancerServerSslProfile(body, serverSslProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerServerSslProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbServerSslProfile**](LbServerSslProfile.md)|  |
 **serverSslProfileId** | **String**|  |

### Return type

[**LbServerSslProfile**](LbServerSslProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerService"></a>
# **updateLoadBalancerService**
> LbService updateLoadBalancerService(body, serviceId)

Update a load balancer service

Update a load balancer service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbService body = new LbService(); // LbService | 
String serviceId = "serviceId_example"; // String | 
try {
    LbService result = apiInstance.updateLoadBalancerService(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbService**](LbService.md)|  |
 **serviceId** | **String**|  |

### Return type

[**LbService**](LbService.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerTcpProfile"></a>
# **updateLoadBalancerTcpProfile**
> LbTcpProfile updateLoadBalancerTcpProfile(body, tcpProfileId)

Update a load balancer TCP profile

Update a load balancer TCP profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbTcpProfile body = new LbTcpProfile(); // LbTcpProfile | 
String tcpProfileId = "tcpProfileId_example"; // String | 
try {
    LbTcpProfile result = apiInstance.updateLoadBalancerTcpProfile(body, tcpProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerTcpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbTcpProfile**](LbTcpProfile.md)|  |
 **tcpProfileId** | **String**|  |

### Return type

[**LbTcpProfile**](LbTcpProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerVirtualServer"></a>
# **updateLoadBalancerVirtualServer**
> LbVirtualServer updateLoadBalancerVirtualServer(body, virtualServerId)

Update a load balancer virtual server

Update a load balancer virtual server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbVirtualServer body = new LbVirtualServer(); // LbVirtualServer | 
String virtualServerId = "virtualServerId_example"; // String | 
try {
    LbVirtualServer result = apiInstance.updateLoadBalancerVirtualServer(body, virtualServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerVirtualServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbVirtualServer**](LbVirtualServer.md)|  |
 **virtualServerId** | **String**|  |

### Return type

[**LbVirtualServer**](LbVirtualServer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerVirtualServerWithRulesUpdateWithRules"></a>
# **updateLoadBalancerVirtualServerWithRulesUpdateWithRules**
> LbVirtualServerWithRule updateLoadBalancerVirtualServerWithRulesUpdateWithRules(body, virtualServerId)

Update a load balancer virtual server with rules

It is used to update virtual servers, the associated rules and update the binding of virtual server and rules. To add new rules, make sure the rules which have no identifier specified, the new rules are automatically generated and associated to the virtual server. To delete old rules, the rules should not be configured in new action, the UUID of deleted rules should be also removed from rule_ids. To update rules, the rules should be specified with new change and configured with identifier. If there are some rules which are not modified, those rule should not be specified in the rules list, the UUID list of rules should be specified in rule_ids of LbVirtualServer. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesLoadbalancerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesLoadbalancerApi apiInstance = new ManagementPlaneApiServicesLoadbalancerApi();
LbVirtualServerWithRule body = new LbVirtualServerWithRule(); // LbVirtualServerWithRule | 
String virtualServerId = "virtualServerId_example"; // String | 
try {
    LbVirtualServerWithRule result = apiInstance.updateLoadBalancerVirtualServerWithRulesUpdateWithRules(body, virtualServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesLoadbalancerApi#updateLoadBalancerVirtualServerWithRulesUpdateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LbVirtualServerWithRule**](LbVirtualServerWithRule.md)|  |
 **virtualServerId** | **String**|  |

### Return type

[**LbVirtualServerWithRule**](LbVirtualServerWithRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

