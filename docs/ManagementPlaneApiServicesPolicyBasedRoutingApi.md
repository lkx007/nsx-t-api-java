# ManagementPlaneApiServicesPolicyBasedRoutingApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPBRRuleInSection**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#addPBRRuleInSection) | **POST** /pbr/sections/{section-id}/rules | Add a Single Rule in a Section
[**addPBRRulesInSectionCreateMultiple**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#addPBRRulesInSectionCreateMultiple) | **POST** /pbr/sections/{section-id}/rules?action&#x3D;create_multiple | Add Multiple Rules in a Section
[**addPBRSection**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#addPBRSection) | **POST** /pbr/sections | Create a New Empty Section
[**addPBRSectionWithRulesCreateWithRules**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#addPBRSectionWithRulesCreateWithRules) | **POST** /pbr/sections?action&#x3D;create_with_rules | Create a Section with Rules
[**deletePBRRule**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#deletePBRRule) | **DELETE** /pbr/sections/{section-id}/rules/{rule-id} | Delete an Existing Rule
[**deletePBRSection**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#deletePBRSection) | **DELETE** /pbr/sections/{section-id} | Delete an Existing Section and Its Associated Rules
[**getPBRRule**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#getPBRRule) | **GET** /pbr/sections/{section-id}/rules/{rule-id} | Read an Existing Rule
[**getPBRRuleStats**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#getPBRRuleStats) | **GET** /pbr/sections/{section-id}/rules/{rule-id}/stats | Get PBR rule level statistics.
[**getPBRRules**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#getPBRRules) | **GET** /pbr/sections/{section-id}/rules | Get All the Rules for a Section
[**getPBRSection**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#getPBRSection) | **GET** /pbr/sections/{section-id} | Get an Existing Section
[**getPBRSectionStats**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#getPBRSectionStats) | **GET** /pbr/sections/{section-id}/rules/stats | Get PBR section level statistics.
[**getPBRSectionWithRulesListWithRules**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#getPBRSectionWithRulesListWithRules) | **POST** /pbr/sections/{section-id}?action&#x3D;list_with_rules | Get an Existing Section, Including Rules
[**listPBRSections**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#listPBRSections) | **GET** /pbr/sections | List All PBR Sections
[**revisePBRRuleRevise**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#revisePBRRuleRevise) | **POST** /pbr/sections/{section-id}/rules/{rule-id}?action&#x3D;revise | Update an Existing Rule and Reorder the Rule
[**revisePBRSectionRevise**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#revisePBRSectionRevise) | **POST** /pbr/sections/{section-id}?action&#x3D;revise | Update an Existing Section, including Its Position
[**revisePBRSectionWithRulesReviseWithRules**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#revisePBRSectionWithRulesReviseWithRules) | **POST** /pbr/sections/{section-id}?action&#x3D;revise_with_rules | Update an Existing Section with Rules
[**updatePBRRule**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#updatePBRRule) | **PUT** /pbr/sections/{section-id}/rules/{rule-id} | Update an Existing Rule
[**updatePBRSection**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#updatePBRSection) | **PUT** /pbr/sections/{section-id} | Update an Existing Section
[**updatePBRSectionWithRulesUpdateWithRules**](ManagementPlaneApiServicesPolicyBasedRoutingApi.md#updatePBRSectionWithRulesUpdateWithRules) | **POST** /pbr/sections/{section-id}?action&#x3D;update_with_rules | Update an Existing Section, Including Its Rules

<a name="addPBRRuleInSection"></a>
# **addPBRRuleInSection**
> PBRRule addPBRRuleInSection(body, sectionId, id, operation)

Add a Single Rule in a Section

Adds a new PBR rule in existing PBR section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRRule body = new PBRRule(); // PBRRule | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    PBRRule result = apiInstance.addPBRRuleInSection(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#addPBRRuleInSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRRule**](PBRRule.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**PBRRule**](PBRRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPBRRulesInSectionCreateMultiple"></a>
# **addPBRRulesInSectionCreateMultiple**
> PBRRuleList addPBRRulesInSectionCreateMultiple(body, sectionId, id, operation)

Add Multiple Rules in a Section

Create multiple PBR rules in existing PBR section bounded by limit of 1000 PBR rules per section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRRuleList body = new PBRRuleList(); // PBRRuleList | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    PBRRuleList result = apiInstance.addPBRRulesInSectionCreateMultiple(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#addPBRRulesInSectionCreateMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRRuleList**](PBRRuleList.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**PBRRuleList**](PBRRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPBRSection"></a>
# **addPBRSection**
> PBRSection addPBRSection(body, id, operation)

Create a New Empty Section

Creates new empty PBR section in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRSection body = new PBRSection(); // PBRSection | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    PBRSection result = apiInstance.addPBRSection(body, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#addPBRSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRSection**](PBRSection.md)|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**PBRSection**](PBRSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPBRSectionWithRulesCreateWithRules"></a>
# **addPBRSectionWithRulesCreateWithRules**
> PBRSectionRuleList addPBRSectionWithRulesCreateWithRules(body, id, operation)

Create a Section with Rules

Creates a new PBR section with rules. The limit on the number of rules is defined by maxItems in collection types for PBRRule (PBRRuleXXXList types). When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules with a large number of rule references is not supported.  Instead, to create sections, use: POST /api/v1/pbr/sections  To create rules, use: POST /api/v1/pbr/sections/&amp;lt;section-id&amp;gt;/rules 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRSectionRuleList body = new PBRSectionRuleList(); // PBRSectionRuleList | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    PBRSectionRuleList result = apiInstance.addPBRSectionWithRulesCreateWithRules(body, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#addPBRSectionWithRulesCreateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRSectionRuleList**](PBRSectionRuleList.md)|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**PBRSectionRuleList**](PBRSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePBRRule"></a>
# **deletePBRRule**
> deletePBRRule(sectionId, ruleId)

Delete an Existing Rule

Delete existing PBR rule in a PBR section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    apiInstance.deletePBRRule(sectionId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#deletePBRRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePBRSection"></a>
# **deletePBRSection**
> deletePBRSection(sectionId, cascade)

Delete an Existing Section and Its Associated Rules

Removes PBR section from the system. PBR section with rules can only be deleted by passing \&quot;cascade&#x3D;true\&quot; parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
Boolean cascade = true; // Boolean | Flag to cascade delete of this object to all it's child objects.
try {
    apiInstance.deletePBRSection(sectionId, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#deletePBRSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **cascade** | **Boolean**| Flag to cascade delete of this object to all it&#x27;s child objects. | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPBRRule"></a>
# **getPBRRule**
> PBRRule getPBRRule(sectionId, ruleId)

Read an Existing Rule

Return existing PBR rule information in a PBR section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    PBRRule result = apiInstance.getPBRRule(sectionId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#getPBRRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**PBRRule**](PBRRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPBRRuleStats"></a>
# **getPBRRuleStats**
> PBRStats getPBRRuleStats(sectionId, ruleId)

Get PBR rule level statistics.

Get aggregated statistics for a rule for given PBR rule. Stats include total number of packets and total number of bytes for the PBR rule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    PBRStats result = apiInstance.getPBRRuleStats(sectionId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#getPBRRuleStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**PBRStats**](PBRStats.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPBRRules"></a>
# **getPBRRules**
> PBRRuleListResult getPBRRules(sectionId, appliedTos, cursor, destinations, filterType, includedFields, pageSize, services, sortAscending, sortBy, sources)

Get All the Rules for a Section

Return all PBR rule(s) information for a given PBR section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
String appliedTos = "appliedTos_example"; // String | AppliedTo's referenced by this section or section's Distributed Service Rules .
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String destinations = "destinations_example"; // String | Destinations referenced by this section's Distributed Service Rules .
String filterType = "filterType_example"; // String | Filter type
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String services = "services_example"; // String | NSService referenced by this section's Distributed Service Rules .
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String sources = "sources_example"; // String | Sources referenced by this section's Distributed Service Rules .
try {
    PBRRuleListResult result = apiInstance.getPBRRules(sectionId, appliedTos, cursor, destinations, filterType, includedFields, pageSize, services, sortAscending, sortBy, sources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#getPBRRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **appliedTos** | **String**| AppliedTo&#x27;s referenced by this section or section&#x27;s Distributed Service Rules . | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **destinations** | **String**| Destinations referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **filterType** | **String**| Filter type | [optional] [enum: FILTER, SEARCH]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **services** | **String**| NSService referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **sources** | **String**| Sources referenced by this section&#x27;s Distributed Service Rules . | [optional]

### Return type

[**PBRRuleListResult**](PBRRuleListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPBRSection"></a>
# **getPBRSection**
> PBRSection getPBRSection(sectionId)

Get an Existing Section

Returns information about PBR section for the identifier. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
try {
    PBRSection result = apiInstance.getPBRSection(sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#getPBRSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |

### Return type

[**PBRSection**](PBRSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPBRSectionStats"></a>
# **getPBRSectionStats**
> PBRStatsList getPBRSectionStats(sectionId)

Get PBR section level statistics.

Get aggregated statistics for all rules for a given pbr section. Data includes total number of packets, and total number of bytes for all PBR rules in the given section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
try {
    PBRStatsList result = apiInstance.getPBRSectionStats(sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#getPBRSectionStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |

### Return type

[**PBRStatsList**](PBRStatsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPBRSectionWithRulesListWithRules"></a>
# **getPBRSectionWithRulesListWithRules**
> PBRSectionRuleList getPBRSectionWithRulesListWithRules(sectionId)

Get an Existing Section, Including Rules

Returns PBR section information with rules for a section identifier. When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules with a large number rule references is not supported.  Instead, to read PBR rules, use: GET /api/v1/pbr/sections/&amp;lt;section-id&amp;gt;/rules with the appropriate page_size. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String sectionId = "sectionId_example"; // String | 
try {
    PBRSectionRuleList result = apiInstance.getPBRSectionWithRulesListWithRules(sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#getPBRSectionWithRulesListWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |

### Return type

[**PBRSectionRuleList**](PBRSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPBRSections"></a>
# **listPBRSections**
> PBRSectionListResult listPBRSections(appliedTos, cursor, destinations, excludeAppliedToType, filterType, includeAppliedToType, includedFields, pageSize, services, sortAscending, sortBy, sources)

List All PBR Sections

List all PBR section in paginated form. A default page size is limited to 1000 PBR sections. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
String appliedTos = "appliedTos_example"; // String | AppliedTo's referenced by this section or section's Distributed Service Rules .
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String destinations = "destinations_example"; // String | Destinations referenced by this section's Distributed Service Rules .
String excludeAppliedToType = "excludeAppliedToType_example"; // String | Resource type valid for use as AppliedTo filter in section API
String filterType = "filterType_example"; // String | Filter type
String includeAppliedToType = "includeAppliedToType_example"; // String | Resource type valid for use as AppliedTo filter in section API
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String services = "services_example"; // String | NSService referenced by this section's Distributed Service Rules .
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String sources = "sources_example"; // String | Sources referenced by this section's Distributed Service Rules .
try {
    PBRSectionListResult result = apiInstance.listPBRSections(appliedTos, cursor, destinations, excludeAppliedToType, filterType, includeAppliedToType, includedFields, pageSize, services, sortAscending, sortBy, sources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#listPBRSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliedTos** | **String**| AppliedTo&#x27;s referenced by this section or section&#x27;s Distributed Service Rules . | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **destinations** | **String**| Destinations referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **excludeAppliedToType** | **String**| Resource type valid for use as AppliedTo filter in section API | [optional] [enum: NSGroup, LogicalSwitch, LogicalRouter, LogicalPort]
 **filterType** | **String**| Filter type | [optional] [enum: FILTER, SEARCH]
 **includeAppliedToType** | **String**| Resource type valid for use as AppliedTo filter in section API | [optional] [enum: NSGroup, LogicalSwitch, LogicalRouter, LogicalPort]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **services** | **String**| NSService referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **sources** | **String**| Sources referenced by this section&#x27;s Distributed Service Rules . | [optional]

### Return type

[**PBRSectionListResult**](PBRSectionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revisePBRRuleRevise"></a>
# **revisePBRRuleRevise**
> PBRRule revisePBRRuleRevise(body, sectionId, ruleId, id, operation)

Update an Existing Rule and Reorder the Rule

Modifies existing PBR rule along with relative position among other PBR rules inside a PBR section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRRule body = new PBRRule(); // PBRRule | 
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    PBRRule result = apiInstance.revisePBRRuleRevise(body, sectionId, ruleId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#revisePBRRuleRevise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRRule**](PBRRule.md)|  |
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**PBRRule**](PBRRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revisePBRSectionRevise"></a>
# **revisePBRSectionRevise**
> PBRSection revisePBRSectionRevise(body, sectionId, id, operation)

Update an Existing Section, including Its Position

Modifies an existing PBR section along with its relative position among other PBR sections in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRSection body = new PBRSection(); // PBRSection | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    PBRSection result = apiInstance.revisePBRSectionRevise(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#revisePBRSectionRevise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRSection**](PBRSection.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**PBRSection**](PBRSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revisePBRSectionWithRulesReviseWithRules"></a>
# **revisePBRSectionWithRulesReviseWithRules**
> PBRSectionRuleList revisePBRSectionWithRulesReviseWithRules(body, sectionId, id, operation)

Update an Existing Section with Rules

Modifies an existing PBR section along with its relative position among other PBR sections with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to move a section above or below another section, use: POST /api/v1/pbr/sections/&amp;lt;section-id&amp;gt;?action&#x3D;revise  To modify rules, use: PUT /api/v1/pbr/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRSectionRuleList body = new PBRSectionRuleList(); // PBRSectionRuleList | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    PBRSectionRuleList result = apiInstance.revisePBRSectionWithRulesReviseWithRules(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#revisePBRSectionWithRulesReviseWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRSectionRuleList**](PBRSectionRuleList.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**PBRSectionRuleList**](PBRSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePBRRule"></a>
# **updatePBRRule**
> PBRRule updatePBRRule(body, sectionId, ruleId)

Update an Existing Rule

Modifies existing rule in a PBR section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRRule body = new PBRRule(); // PBRRule | 
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    PBRRule result = apiInstance.updatePBRRule(body, sectionId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#updatePBRRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRRule**](PBRRule.md)|  |
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**PBRRule**](PBRRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePBRSection"></a>
# **updatePBRSection**
> PBRSection updatePBRSection(body, sectionId)

Update an Existing Section

Modifies the specified section, but does not modify the section&#x27;s associated rules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRSection body = new PBRSection(); // PBRSection | 
String sectionId = "sectionId_example"; // String | 
try {
    PBRSection result = apiInstance.updatePBRSection(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#updatePBRSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRSection**](PBRSection.md)|  |
 **sectionId** | **String**|  |

### Return type

[**PBRSection**](PBRSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePBRSectionWithRulesUpdateWithRules"></a>
# **updatePBRSectionWithRulesUpdateWithRules**
> PBRSectionRuleList updatePBRSectionWithRulesUpdateWithRules(body, sectionId)

Update an Existing Section, Including Its Rules

Modifies existing PBR section along with its association with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to update rule content, use: PUT /api/v1/pbr/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesPolicyBasedRoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesPolicyBasedRoutingApi apiInstance = new ManagementPlaneApiServicesPolicyBasedRoutingApi();
PBRSectionRuleList body = new PBRSectionRuleList(); // PBRSectionRuleList | 
String sectionId = "sectionId_example"; // String | 
try {
    PBRSectionRuleList result = apiInstance.updatePBRSectionWithRulesUpdateWithRules(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesPolicyBasedRoutingApi#updatePBRSectionWithRulesUpdateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBRSectionRuleList**](PBRSectionRuleList.md)|  |
 **sectionId** | **String**|  |

### Return type

[**PBRSectionRuleList**](PBRSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

