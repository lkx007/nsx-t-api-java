# ManagementPlaneApiLogicalRoutingAndServicesNatApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNatRule**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#addNatRule) | **POST** /logical-routers/{logical-router-id}/nat/rules | Add a NAT rule in a specific logical router
[**addNatRulesCreateMultiple**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#addNatRulesCreateMultiple) | **POST** /logical-routers/{logical-router-id}/nat/rules?action&#x3D;create_multiple | Add multiple NAT rules in a specific logical router
[**deleteNatRule**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#deleteNatRule) | **DELETE** /logical-routers/{logical-router-id}/nat/rules/{rule-id} | Delete a specific NAT rule from a logical router
[**getNatRule**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#getNatRule) | **GET** /logical-routers/{logical-router-id}/nat/rules/{rule-id} | Get a specific NAT rule from a given logical router
[**getNatStatisticsPerLogicalRouter**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#getNatStatisticsPerLogicalRouter) | **GET** /logical-routers/{logical-router-id}/nat/rules/statistics | Get the statistics of all rules of the logical router
[**getNatStatisticsPerRule**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#getNatStatisticsPerRule) | **GET** /logical-routers/{logical-router-id}/nat/rules/{rule-id}/statistics | Get the statistics of a specified logical router NAT Rule
[**getNatStatisticsPerTransportNode**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#getNatStatisticsPerTransportNode) | **GET** /transport-nodes/{node-id}/statistics/nat-rules | Get statistics for all logical router NAT rules on a transport node
[**listNatRules**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#listNatRules) | **GET** /logical-routers/{logical-router-id}/nat/rules | List NAT rules of the logical router
[**updateNatRule**](ManagementPlaneApiLogicalRoutingAndServicesNatApi.md#updateNatRule) | **PUT** /logical-routers/{logical-router-id}/nat/rules/{rule-id} | Update a specific NAT rule from a given logical router

<a name="addNatRule"></a>
# **addNatRule**
> NatRule addNatRule(body, logicalRouterId)

Add a NAT rule in a specific logical router

Add a NAT rule in a specific logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
NatRule body = new NatRule(); // NatRule | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    NatRule result = apiInstance.addNatRule(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#addNatRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NatRule**](NatRule.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**NatRule**](NatRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addNatRulesCreateMultiple"></a>
# **addNatRulesCreateMultiple**
> NatRuleList addNatRulesCreateMultiple(body, logicalRouterId)

Add multiple NAT rules in a specific logical router

Create multiple NAT rules in a specific logical router. The API succeeds only when all rules are accepted and created successfully. Any one validation voilation will fail the API, no rule will be created. The ruleIds of each rules can be found from the responsed message. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
NatRuleList body = new NatRuleList(); // NatRuleList | 
String logicalRouterId = "logicalRouterId_example"; // String | 
try {
    NatRuleList result = apiInstance.addNatRulesCreateMultiple(body, logicalRouterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#addNatRulesCreateMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NatRuleList**](NatRuleList.md)|  |
 **logicalRouterId** | **String**|  |

### Return type

[**NatRuleList**](NatRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNatRule"></a>
# **deleteNatRule**
> deleteNatRule(logicalRouterId, ruleId)

Delete a specific NAT rule from a logical router

Delete a specific NAT rule from a logical router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    apiInstance.deleteNatRule(logicalRouterId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#deleteNatRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNatRule"></a>
# **getNatRule**
> NatRule getNatRule(logicalRouterId, ruleId)

Get a specific NAT rule from a given logical router

Get a specific NAT rule from a given logical router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    NatRule result = apiInstance.getNatRule(logicalRouterId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#getNatRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**NatRule**](NatRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNatStatisticsPerLogicalRouter"></a>
# **getNatStatisticsPerLogicalRouter**
> NatStatisticsPerLogicalRouter getNatStatisticsPerLogicalRouter(logicalRouterId, source)

Get the statistics of all rules of the logical router

Returns the summation of statistics for all rules from all nodes for the Specified Logical Router. Also gives the per transport node statistics for provided logical router. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NatStatisticsPerLogicalRouter result = apiInstance.getNatStatisticsPerLogicalRouter(logicalRouterId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#getNatStatisticsPerLogicalRouter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NatStatisticsPerLogicalRouter**](NatStatisticsPerLogicalRouter.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNatStatisticsPerRule"></a>
# **getNatStatisticsPerRule**
> NatStatisticsPerRule getNatStatisticsPerRule(logicalRouterId, ruleId, source)

Get the statistics of a specified logical router NAT Rule

Returns the summation of statistics from all nodes for the Specified Logical Router NAT Rule. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NatStatisticsPerRule result = apiInstance.getNatStatisticsPerRule(logicalRouterId, ruleId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#getNatStatisticsPerRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalRouterId** | **String**|  |
 **ruleId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NatStatisticsPerRule**](NatStatisticsPerRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNatStatisticsPerTransportNode"></a>
# **getNatStatisticsPerTransportNode**
> NatStatisticsPerTransportNode getNatStatisticsPerTransportNode(nodeId, source)

Get statistics for all logical router NAT rules on a transport node

Returns the summation of statistics for all rules from all logical routers which are present on given transport node. Only cached statistics are supported. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
String nodeId = "nodeId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    NatStatisticsPerTransportNode result = apiInstance.getNatStatisticsPerTransportNode(nodeId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#getNatStatisticsPerTransportNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**NatStatisticsPerTransportNode**](NatStatisticsPerTransportNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNatRules"></a>
# **listNatRules**
> NatRuleListResult listNatRules(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy)

List NAT rules of the logical router

Returns paginated list of all user defined NAT rules of the specific logical router 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
String logicalRouterId = "logicalRouterId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NatRuleListResult result = apiInstance.listNatRules(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#listNatRules");
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

[**NatRuleListResult**](NatRuleListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNatRule"></a>
# **updateNatRule**
> NatRule updateNatRule(body, logicalRouterId, ruleId)

Update a specific NAT rule from a given logical router

Update a specific NAT rule from a given logical router. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiLogicalRoutingAndServicesNatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiLogicalRoutingAndServicesNatApi apiInstance = new ManagementPlaneApiLogicalRoutingAndServicesNatApi();
NatRule body = new NatRule(); // NatRule | 
String logicalRouterId = "logicalRouterId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    NatRule result = apiInstance.updateNatRule(body, logicalRouterId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiLogicalRoutingAndServicesNatApi#updateNatRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NatRule**](NatRule.md)|  |
 **logicalRouterId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**NatRule**](NatRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

