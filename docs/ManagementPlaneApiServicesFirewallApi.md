# ManagementPlaneApiServicesFirewallApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMemberAddMember**](ManagementPlaneApiServicesFirewallApi.md#addMemberAddMember) | **POST** /firewall/excludelist?action&#x3D;add_member | Add a new object in the exclude list
[**addRuleInSection**](ManagementPlaneApiServicesFirewallApi.md#addRuleInSection) | **POST** /firewall/sections/{section-id}/rules | Add a Single Rule in a Section
[**addRulesInSectionCreateMultiple**](ManagementPlaneApiServicesFirewallApi.md#addRulesInSectionCreateMultiple) | **POST** /firewall/sections/{section-id}/rules?action&#x3D;create_multiple | Add Multiple Rules in a Section
[**addSection**](ManagementPlaneApiServicesFirewallApi.md#addSection) | **POST** /firewall/sections | Create a New Empty Section
[**addSectionWithRulesCreateWithRules**](ManagementPlaneApiServicesFirewallApi.md#addSectionWithRulesCreateWithRules) | **POST** /firewall/sections?action&#x3D;create_with_rules | Create a Section with Rules
[**checkMemberIfExistsCheckIfExists**](ManagementPlaneApiServicesFirewallApi.md#checkMemberIfExistsCheckIfExists) | **POST** /firewall/excludelist?action&#x3D;check_if_exists | Check if the object a member of the exclude list
[**createFirewallProfile**](ManagementPlaneApiServicesFirewallApi.md#createFirewallProfile) | **POST** /firewall/profiles | Create a firewall profile.
[**deleteFirewallProfile**](ManagementPlaneApiServicesFirewallApi.md#deleteFirewallProfile) | **DELETE** /firewall/profiles/{profile-id} | Delete a firewall profile.
[**deleteRule**](ManagementPlaneApiServicesFirewallApi.md#deleteRule) | **DELETE** /firewall/sections/{section-id}/rules/{rule-id} | Delete an Existing Rule
[**deleteSection**](ManagementPlaneApiServicesFirewallApi.md#deleteSection) | **DELETE** /firewall/sections/{section-id} | Delete an Existing Section and Its Associated Rules
[**disableFirewallOnTargetResourceDisableFirewall**](ManagementPlaneApiServicesFirewallApi.md#disableFirewallOnTargetResourceDisableFirewall) | **POST** /firewall/status/{context-type}/{id}?action&#x3D;disable_firewall | Disable firewall on target resource in dfw context
[**enableFirewallOnTargetResourceEnableFirewall**](ManagementPlaneApiServicesFirewallApi.md#enableFirewallOnTargetResourceEnableFirewall) | **POST** /firewall/status/{context-type}/{id}?action&#x3D;enable_firewall | Enable firewall on target resource in dfw context
[**getExcludeList**](ManagementPlaneApiServicesFirewallApi.md#getExcludeList) | **GET** /firewall/excludelist | Get list of entities in exclude list
[**getFirewallProfile**](ManagementPlaneApiServicesFirewallApi.md#getFirewallProfile) | **GET** /firewall/profiles/{profile-id} | Get all firewall session timer profiles.
[**getFirewallSectionStats**](ManagementPlaneApiServicesFirewallApi.md#getFirewallSectionStats) | **GET** /firewall/sections/{section-id}/rules/stats | Get Firewall section level statistics section
[**getFirewallStats**](ManagementPlaneApiServicesFirewallApi.md#getFirewallStats) | **GET** /firewall/sections/{section-id}/rules/{rule-id}/stats | Get Firewall rule level statistics
[**getFirewallStatus**](ManagementPlaneApiServicesFirewallApi.md#getFirewallStatus) | **GET** /firewall/status/{context-type} | Get firewall global status for dfw context
[**getFirewallStatusOnTargetResource**](ManagementPlaneApiServicesFirewallApi.md#getFirewallStatusOnTargetResource) | **GET** /firewall/status/{context-type}/{id} | Get firewall status for target resource in dfw context
[**getRule**](ManagementPlaneApiServicesFirewallApi.md#getRule) | **GET** /firewall/sections/{section-id}/rules/{rule-id} | Read an Existing Rule
[**getRuleState**](ManagementPlaneApiServicesFirewallApi.md#getRuleState) | **GET** /firewall/rules/{rule-id}/state | Get the Realized State of a Firewall Rule
[**getRules**](ManagementPlaneApiServicesFirewallApi.md#getRules) | **GET** /firewall/sections/{section-id}/rules | Get All the Rules for a Section
[**getSection**](ManagementPlaneApiServicesFirewallApi.md#getSection) | **GET** /firewall/sections/{section-id} | Get an Existing Section
[**getSectionState**](ManagementPlaneApiServicesFirewallApi.md#getSectionState) | **GET** /firewall/sections/{section-id}/state | Get the Realized State of a Firewall Section
[**getSectionWithRulesListWithRules**](ManagementPlaneApiServicesFirewallApi.md#getSectionWithRulesListWithRules) | **POST** /firewall/sections/{section-id}?action&#x3D;list_with_rules | Get an Existing Section, Including Rules
[**getSectionsSummary**](ManagementPlaneApiServicesFirewallApi.md#getSectionsSummary) | **GET** /firewall/sections/summary | Get the summary of sections in the firewall configuration.
[**listFirewallProfiles**](ManagementPlaneApiServicesFirewallApi.md#listFirewallProfiles) | **GET** /firewall/profiles | Get firewall profiles available.
[**listFirewallStatus**](ManagementPlaneApiServicesFirewallApi.md#listFirewallStatus) | **GET** /firewall/status | List all firewall status for supported contexts
[**listSections**](ManagementPlaneApiServicesFirewallApi.md#listSections) | **GET** /firewall/sections | List All Firewall Sections
[**lockSectionLock**](ManagementPlaneApiServicesFirewallApi.md#lockSectionLock) | **POST** /firewall/sections/{section-id}?action&#x3D;lock | Lock a section
[**readFirewallRule**](ManagementPlaneApiServicesFirewallApi.md#readFirewallRule) | **GET** /firewall/rules/{rule-id} | Read an Existing Rule
[**removeMemberRemoveMember**](ManagementPlaneApiServicesFirewallApi.md#removeMemberRemoveMember) | **POST** /firewall/excludelist?action&#x3D;remove_member | Remove an existing object from the exclude list
[**resetFirewallRuleStatsReset**](ManagementPlaneApiServicesFirewallApi.md#resetFirewallRuleStatsReset) | **POST** /firewall/stats?action&#x3D;reset | Reset firewall rule statistics
[**reviseRuleRevise**](ManagementPlaneApiServicesFirewallApi.md#reviseRuleRevise) | **POST** /firewall/sections/{section-id}/rules/{rule-id}?action&#x3D;revise | Update an Existing Rule and Reorder the Rule
[**reviseSectionRevise**](ManagementPlaneApiServicesFirewallApi.md#reviseSectionRevise) | **POST** /firewall/sections/{section-id}?action&#x3D;revise | Update an Existing Section, Including Its Position
[**reviseSectionWithRulesReviseWithRules**](ManagementPlaneApiServicesFirewallApi.md#reviseSectionWithRulesReviseWithRules) | **POST** /firewall/sections/{section-id}?action&#x3D;revise_with_rules | Update an Existing Section with Rules
[**unlockSectionUnlock**](ManagementPlaneApiServicesFirewallApi.md#unlockSectionUnlock) | **POST** /firewall/sections/{section-id}?action&#x3D;unlock | Unlock a section
[**updateExcludeList**](ManagementPlaneApiServicesFirewallApi.md#updateExcludeList) | **PUT** /firewall/excludelist | Modify exclude list
[**updateFirewallProfile**](ManagementPlaneApiServicesFirewallApi.md#updateFirewallProfile) | **PUT** /firewall/profiles/{profile-id} | Update a firewall profile.
[**updateFirewallStatus**](ManagementPlaneApiServicesFirewallApi.md#updateFirewallStatus) | **PUT** /firewall/status/{context-type} | Update global firewall status for dfw context
[**updateRule**](ManagementPlaneApiServicesFirewallApi.md#updateRule) | **PUT** /firewall/sections/{section-id}/rules/{rule-id} | Update an Existing Rule
[**updateSection**](ManagementPlaneApiServicesFirewallApi.md#updateSection) | **PUT** /firewall/sections/{section-id} | Update an Existing Section
[**updateSectionWithRulesUpdateWithRules**](ManagementPlaneApiServicesFirewallApi.md#updateSectionWithRulesUpdateWithRules) | **POST** /firewall/sections/{section-id}?action&#x3D;update_with_rules | Update an Existing Section, Including Its Rules

<a name="addMemberAddMember"></a>
# **addMemberAddMember**
> ResourceReference addMemberAddMember(body)

Add a new object in the exclude list

Add a new object in the exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
ResourceReference body = new ResourceReference(); // ResourceReference | 
try {
    ResourceReference result = apiInstance.addMemberAddMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#addMemberAddMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceReference**](ResourceReference.md)|  |

### Return type

[**ResourceReference**](ResourceReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRuleInSection"></a>
# **addRuleInSection**
> FirewallRule addRuleInSection(body, sectionId, id, operation)

Add a Single Rule in a Section

Adds a new firewall rule in existing firewall section. Adding firewall rule to a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale content to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallRule body = new FirewallRule(); // FirewallRule | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    FirewallRule result = apiInstance.addRuleInSection(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#addRuleInSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallRule**](FirewallRule.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**FirewallRule**](FirewallRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRulesInSectionCreateMultiple"></a>
# **addRulesInSectionCreateMultiple**
> FirewallRuleList addRulesInSectionCreateMultiple(body, sectionId, id, operation)

Add Multiple Rules in a Section

Create multiple firewall rules in existing firewall section bounded by limit of 1000 firewall rules per section. Adding multiple firewall rules in a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallRuleList body = new FirewallRuleList(); // FirewallRuleList | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    FirewallRuleList result = apiInstance.addRulesInSectionCreateMultiple(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#addRulesInSectionCreateMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallRuleList**](FirewallRuleList.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**FirewallRuleList**](FirewallRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSection"></a>
# **addSection**
> FirewallSection addSection(body, id, operation)

Create a New Empty Section

Creates new empty firewall section in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSection body = new FirewallSection(); // FirewallSection | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    FirewallSection result = apiInstance.addSection(body, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#addSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSection**](FirewallSection.md)|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**FirewallSection**](FirewallSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSectionWithRulesCreateWithRules"></a>
# **addSectionWithRulesCreateWithRules**
> FirewallSectionRuleList addSectionWithRulesCreateWithRules(body, id, operation)

Create a Section with Rules

Creates a new firewall section with rules. The limit on the number of rules is defined by maxItems in collection types for FirewallRule (FirewallRuleXXXList types). When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules with a large number of rule references is not supported.  Instead, to create sections, use: POST /api/v1/firewall/sections  To create rules, use: POST /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSectionRuleList body = new FirewallSectionRuleList(); // FirewallSectionRuleList | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    FirewallSectionRuleList result = apiInstance.addSectionWithRulesCreateWithRules(body, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#addSectionWithRulesCreateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSectionRuleList**](FirewallSectionRuleList.md)|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**FirewallSectionRuleList**](FirewallSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkMemberIfExistsCheckIfExists"></a>
# **checkMemberIfExistsCheckIfExists**
> ResourceReference checkMemberIfExistsCheckIfExists(objectId, deepCheck, objectType)

Check if the object a member of the exclude list

Check if the object a member of the exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String objectId = "objectId_example"; // String | identifier of the object
Boolean deepCheck = true; // Boolean | Check all parents
String objectType = "objectType_example"; // String | Object type of an entity
try {
    ResourceReference result = apiInstance.checkMemberIfExistsCheckIfExists(objectId, deepCheck, objectType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#checkMemberIfExistsCheckIfExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| identifier of the object |
 **deepCheck** | **Boolean**| Check all parents | [optional]
 **objectType** | **String**| Object type of an entity | [optional] [enum: NSGroup, LogicalPort, LogicalSwitch]

### Return type

[**ResourceReference**](ResourceReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFirewallProfile"></a>
# **createFirewallProfile**
> BaseFirewallProfile createFirewallProfile(body)

Create a firewall profile.

Create a firewall profile with values provided. It creates profile based resource_type in the payload. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
BaseFirewallProfile body = new BaseFirewallProfile(); // BaseFirewallProfile | 
try {
    BaseFirewallProfile result = apiInstance.createFirewallProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#createFirewallProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseFirewallProfile**](BaseFirewallProfile.md)|  |

### Return type

[**BaseFirewallProfile**](BaseFirewallProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFirewallProfile"></a>
# **deleteFirewallProfile**
> deleteFirewallProfile(profileId)

Delete a firewall profile.

Deletes a firewall profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String profileId = "profileId_example"; // String | 
try {
    apiInstance.deleteFirewallProfile(profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#deleteFirewallProfile");
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

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(sectionId, ruleId)

Delete an Existing Rule

Delete existing firewall rule in a firewall section. Deleting firewall rule in a section modifies parent section and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    apiInstance.deleteRule(sectionId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#deleteRule");
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

<a name="deleteSection"></a>
# **deleteSection**
> deleteSection(sectionId, cascade)

Delete an Existing Section and Its Associated Rules

Removes firewall section from the system. Firewall section with rules can only be deleted by passing \&quot;cascade&#x3D;true\&quot; parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
Boolean cascade = true; // Boolean | Flag to cascade delete of this object to all it's child objects.
try {
    apiInstance.deleteSection(sectionId, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#deleteSection");
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

<a name="disableFirewallOnTargetResourceDisableFirewall"></a>
# **disableFirewallOnTargetResourceDisableFirewall**
> TargetResourceStatus disableFirewallOnTargetResourceDisableFirewall(contextType, id)

Disable firewall on target resource in dfw context

Disable firewall on target resource in dfw context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String contextType = "contextType_example"; // String | 
String id = "id_example"; // String | 
try {
    TargetResourceStatus result = apiInstance.disableFirewallOnTargetResourceDisableFirewall(contextType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#disableFirewallOnTargetResourceDisableFirewall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextType** | **String**|  |
 **id** | **String**|  |

### Return type

[**TargetResourceStatus**](TargetResourceStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableFirewallOnTargetResourceEnableFirewall"></a>
# **enableFirewallOnTargetResourceEnableFirewall**
> TargetResourceStatus enableFirewallOnTargetResourceEnableFirewall(contextType, id)

Enable firewall on target resource in dfw context

Enable firewall on target resource in dfw context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String contextType = "contextType_example"; // String | 
String id = "id_example"; // String | 
try {
    TargetResourceStatus result = apiInstance.enableFirewallOnTargetResourceEnableFirewall(contextType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#enableFirewallOnTargetResourceEnableFirewall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextType** | **String**|  |
 **id** | **String**|  |

### Return type

[**TargetResourceStatus**](TargetResourceStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExcludeList"></a>
# **getExcludeList**
> ExcludeList getExcludeList()

Get list of entities in exclude list

Get list of entities in exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
try {
    ExcludeList result = apiInstance.getExcludeList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getExcludeList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExcludeList**](ExcludeList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFirewallProfile"></a>
# **getFirewallProfile**
> BaseFirewallProfile getFirewallProfile(profileId)

Get all firewall session timer profiles.

Return firewall session timer profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String profileId = "profileId_example"; // String | 
try {
    BaseFirewallProfile result = apiInstance.getFirewallProfile(profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getFirewallProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**|  |

### Return type

[**BaseFirewallProfile**](BaseFirewallProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFirewallSectionStats"></a>
# **getFirewallSectionStats**
> FirewallStatsList getFirewallSectionStats(sectionId, source)

Get Firewall section level statistics section

Get aggregated statistics for all rules for a given firewall section. The API only supports access to cached (source&#x3D;cached) statistical data collected offline in the system. Data includes total number of packets, bytes, sessions counters and popularity index for a firewall rule and overall session count, max session count and max popularity index for all firewall rules on transport nodes or edge nodes. Aggregated statistics like maximum popularity index, maximum session count and total session count are computed with lower frequency compared to individual generic rule statistics, hence they may have a computation delay up to 15 minutes to reflect in response to this API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    FirewallStatsList result = apiInstance.getFirewallSectionStats(sectionId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getFirewallSectionStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**FirewallStatsList**](FirewallStatsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFirewallStats"></a>
# **getFirewallStats**
> FirewallStats getFirewallStats(sectionId, ruleId, source)

Get Firewall rule level statistics

Get aggregated statistics for a rule for given firewall section. The API only supports access to cached (source&#x3D;cached) statistical data collected offline in the system. Data includes total number of packets, bytes, sessions counters and popularity index for a firewall rule and overall session count, max session count and max popularity index for all firewall rules on transport nodes or edge nodes. Aggregated statistics like maximum popularity index, maximum session count and total session count are computed with lower frequency compared to individual generic rule statistics, hence they may have a computation delay up to 15 minutes to reflect in response to this API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    FirewallStats result = apiInstance.getFirewallStats(sectionId, ruleId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getFirewallStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**FirewallStats**](FirewallStats.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFirewallStatus"></a>
# **getFirewallStatus**
> FirewallStatus getFirewallStatus(contextType)

Get firewall global status for dfw context

Get firewall global status for dfw context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String contextType = "contextType_example"; // String | 
try {
    FirewallStatus result = apiInstance.getFirewallStatus(contextType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getFirewallStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextType** | **String**|  |

### Return type

[**FirewallStatus**](FirewallStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFirewallStatusOnTargetResource"></a>
# **getFirewallStatusOnTargetResource**
> TargetResourceStatus getFirewallStatusOnTargetResource(contextType, id)

Get firewall status for target resource in dfw context

Get firewall status for target resource in dfw context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String contextType = "contextType_example"; // String | 
String id = "id_example"; // String | 
try {
    TargetResourceStatus result = apiInstance.getFirewallStatusOnTargetResource(contextType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getFirewallStatusOnTargetResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextType** | **String**|  |
 **id** | **String**|  |

### Return type

[**TargetResourceStatus**](TargetResourceStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRule"></a>
# **getRule**
> FirewallRule getRule(sectionId, ruleId)

Read an Existing Rule

Return existing firewall rule information in a firewall section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    FirewallRule result = apiInstance.getRule(sectionId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**FirewallRule**](FirewallRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRuleState"></a>
# **getRuleState**
> RuleState getRuleState(ruleId, barrierId, requestId)

Get the Realized State of a Firewall Rule

Return realized state information of a firewall rule. Returned response is same as rule&#x27;s section realization state response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String ruleId = "ruleId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    RuleState result = apiInstance.getRuleState(ruleId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getRuleState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**RuleState**](RuleState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRules"></a>
# **getRules**
> FirewallRuleListResult getRules(sectionId, appliedTos, contextProfiles, cursor, deepSearch, destinations, extendedSources, filterType, includedFields, pageSize, searchInvalidReferences, services, sortAscending, sortBy, sources)

Get All the Rules for a Section

Return all firewall rule(s) information for a given firewall section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
String appliedTos = "appliedTos_example"; // String | AppliedTo's referenced by this section or section's Distributed Service Rules .
String contextProfiles = "contextProfiles_example"; // String | Limits results to sections having rules with specific Context Profiles.
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean deepSearch = true; // Boolean | Toggle to search with direct or indirect references.
String destinations = "destinations_example"; // String | Destinations referenced by this section's Distributed Service Rules .
String extendedSources = "extendedSources_example"; // String | Limits results to sections having rules with specific Extended Sources.
String filterType = "filterType_example"; // String | Filter type
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean searchInvalidReferences = true; // Boolean | Return invalid references in results.
String services = "services_example"; // String | NSService referenced by this section's Distributed Service Rules .
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String sources = "sources_example"; // String | Sources referenced by this section's Distributed Service Rules .
try {
    FirewallRuleListResult result = apiInstance.getRules(sectionId, appliedTos, contextProfiles, cursor, deepSearch, destinations, extendedSources, filterType, includedFields, pageSize, searchInvalidReferences, services, sortAscending, sortBy, sources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **appliedTos** | **String**| AppliedTo&#x27;s referenced by this section or section&#x27;s Distributed Service Rules . | [optional]
 **contextProfiles** | **String**| Limits results to sections having rules with specific Context Profiles. | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **deepSearch** | **Boolean**| Toggle to search with direct or indirect references. | [optional]
 **destinations** | **String**| Destinations referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **extendedSources** | **String**| Limits results to sections having rules with specific Extended Sources. | [optional]
 **filterType** | **String**| Filter type | [optional] [enum: FILTER, SEARCH]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **searchInvalidReferences** | **Boolean**| Return invalid references in results. | [optional]
 **services** | **String**| NSService referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **sources** | **String**| Sources referenced by this section&#x27;s Distributed Service Rules . | [optional]

### Return type

[**FirewallRuleListResult**](FirewallRuleListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSection"></a>
# **getSection**
> FirewallSection getSection(sectionId)

Get an Existing Section

Returns information about firewall section for the identifier. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
try {
    FirewallSection result = apiInstance.getSection(sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |

### Return type

[**FirewallSection**](FirewallSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionState"></a>
# **getSectionState**
> FirewallSectionState getSectionState(sectionId, barrierId, requestId)

Get the Realized State of a Firewall Section

Return realized state information of a firewall section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
Long barrierId = 789L; // Long | 
String requestId = "requestId_example"; // String | Realization request ID
try {
    FirewallSectionState result = apiInstance.getSectionState(sectionId, barrierId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getSectionState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **barrierId** | **Long**|  | [optional] [enum: ]
 **requestId** | **String**| Realization request ID | [optional]

### Return type

[**FirewallSectionState**](FirewallSectionState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionWithRulesListWithRules"></a>
# **getSectionWithRulesListWithRules**
> FirewallSectionRuleList getSectionWithRulesListWithRules(sectionId)

Get an Existing Section, Including Rules

Returns firewall section information with rules for a section identifier. When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules with a large number rule references is not supported.  Instead, to read firewall rules, use: GET /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules with the appropriate page_size. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String sectionId = "sectionId_example"; // String | 
try {
    FirewallSectionRuleList result = apiInstance.getSectionWithRulesListWithRules(sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getSectionWithRulesListWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |

### Return type

[**FirewallSectionRuleList**](FirewallSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionsSummary"></a>
# **getSectionsSummary**
> FirewallSectionsSummaryList getSectionsSummary(source)

Get the summary of sections in the firewall configuration.

List the summary of number of sections and number of rules for each firewall category (L2DFW, L3DFW). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String source = "source_example"; // String | Data source type.
try {
    FirewallSectionsSummaryList result = apiInstance.getSectionsSummary(source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#getSectionsSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**FirewallSectionsSummaryList**](FirewallSectionsSummaryList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFirewallProfiles"></a>
# **listFirewallProfiles**
> FirewallProfileListResult listFirewallProfiles(resourceType, cursor, includedFields, pageSize, sortAscending, sortBy)

Get firewall profiles available.

List all the firewall profiles available by requested resource_type. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String resourceType = "resourceType_example"; // String | Profile resource type
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    FirewallProfileListResult result = apiInstance.listFirewallProfiles(resourceType, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#listFirewallProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceType** | **String**| Profile resource type |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**FirewallProfileListResult**](FirewallProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFirewallStatus"></a>
# **listFirewallStatus**
> FirewallStatusListResult listFirewallStatus()

List all firewall status for supported contexts

List all firewall status for supported contexts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
try {
    FirewallStatusListResult result = apiInstance.listFirewallStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#listFirewallStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FirewallStatusListResult**](FirewallStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSections"></a>
# **listSections**
> FirewallSectionListResult listSections(appliedTos, contextProfiles, cursor, deepSearch, destinations, enforcedOn, excludeAppliedToType, extendedSources, filterType, includeAppliedToType, includedFields, locked, pageSize, searchInvalidReferences, searchScope, services, sortAscending, sortBy, sources, type)

List All Firewall Sections

List all firewall section in paginated form. A default page size is limited to 1000 firewall sections. By default list of section is filtered by LAYER3 type. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String appliedTos = "appliedTos_example"; // String | AppliedTo's referenced by this section or section's Distributed Service Rules .
String contextProfiles = "contextProfiles_example"; // String | Limits results to sections having rules with specific Context Profiles.
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean deepSearch = true; // Boolean | Toggle to search with direct or indirect references.
String destinations = "destinations_example"; // String | Destinations referenced by this section's Distributed Service Rules .
String enforcedOn = "enforcedOn_example"; // String | Type of attachment for logical port; for query only.
String excludeAppliedToType = "excludeAppliedToType_example"; // String | Resource type valid for use as AppliedTo filter in section API
String extendedSources = "extendedSources_example"; // String | Limits results to sections having rules with specific Extended Sources.
String filterType = "filterType_example"; // String | Filter type
String includeAppliedToType = "includeAppliedToType_example"; // String | Resource type valid for use as AppliedTo filter in section API
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Boolean locked = true; // Boolean | Limit results to sections which are locked/unlocked
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean searchInvalidReferences = true; // Boolean | Return invalid references in results.
String searchScope = "searchScope_example"; // String | Limit result to sections of a specific enforcement point
String services = "services_example"; // String | NSService referenced by this section's Distributed Service Rules .
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String sources = "sources_example"; // String | Sources referenced by this section's Distributed Service Rules .
String type = "type_example"; // String | Section Type
try {
    FirewallSectionListResult result = apiInstance.listSections(appliedTos, contextProfiles, cursor, deepSearch, destinations, enforcedOn, excludeAppliedToType, extendedSources, filterType, includeAppliedToType, includedFields, locked, pageSize, searchInvalidReferences, searchScope, services, sortAscending, sortBy, sources, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#listSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliedTos** | **String**| AppliedTo&#x27;s referenced by this section or section&#x27;s Distributed Service Rules . | [optional]
 **contextProfiles** | **String**| Limits results to sections having rules with specific Context Profiles. | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **deepSearch** | **Boolean**| Toggle to search with direct or indirect references. | [optional]
 **destinations** | **String**| Destinations referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **enforcedOn** | **String**| Type of attachment for logical port; for query only. | [optional] [enum: VIF, LOGICALROUTER, BRIDGEENDPOINT, DHCP_SERVICE, METADATA_PROXY, L2VPN_SESSION, NONE]
 **excludeAppliedToType** | **String**| Resource type valid for use as AppliedTo filter in section API | [optional] [enum: NSGroup, LogicalSwitch, LogicalRouter, LogicalPort]
 **extendedSources** | **String**| Limits results to sections having rules with specific Extended Sources. | [optional]
 **filterType** | **String**| Filter type | [optional] [enum: FILTER, SEARCH]
 **includeAppliedToType** | **String**| Resource type valid for use as AppliedTo filter in section API | [optional] [enum: NSGroup, LogicalSwitch, LogicalRouter, LogicalPort]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **locked** | **Boolean**| Limit results to sections which are locked/unlocked | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **searchInvalidReferences** | **Boolean**| Return invalid references in results. | [optional]
 **searchScope** | **String**| Limit result to sections of a specific enforcement point | [optional]
 **services** | **String**| NSService referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **sources** | **String**| Sources referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **type** | **String**| Section Type | [optional] [enum: LAYER2, LAYER3]

### Return type

[**FirewallSectionListResult**](FirewallSectionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lockSectionLock"></a>
# **lockSectionLock**
> FirewallSection lockSectionLock(body, sectionId)

Lock a section

Lock a section 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSectionLock body = new FirewallSectionLock(); // FirewallSectionLock | 
String sectionId = "sectionId_example"; // String | 
try {
    FirewallSection result = apiInstance.lockSectionLock(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#lockSectionLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSectionLock**](FirewallSectionLock.md)|  |
 **sectionId** | **String**|  |

### Return type

[**FirewallSection**](FirewallSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readFirewallRule"></a>
# **readFirewallRule**
> FirewallRule readFirewallRule(ruleId)

Read an Existing Rule

Return existing firewall rule information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String ruleId = "ruleId_example"; // String | 
try {
    FirewallRule result = apiInstance.readFirewallRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#readFirewallRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**|  |

### Return type

[**FirewallRule**](FirewallRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeMemberRemoveMember"></a>
# **removeMemberRemoveMember**
> ResourceReference removeMemberRemoveMember(objectId, deepCheck, objectType)

Remove an existing object from the exclude list

Remove an existing object from the exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String objectId = "objectId_example"; // String | identifier of the object
Boolean deepCheck = true; // Boolean | Check all parents
String objectType = "objectType_example"; // String | Object type of an entity
try {
    ResourceReference result = apiInstance.removeMemberRemoveMember(objectId, deepCheck, objectType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#removeMemberRemoveMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| identifier of the object |
 **deepCheck** | **Boolean**| Check all parents | [optional]
 **objectType** | **String**| Object type of an entity | [optional] [enum: NSGroup, LogicalPort, LogicalSwitch]

### Return type

[**ResourceReference**](ResourceReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetFirewallRuleStatsReset"></a>
# **resetFirewallRuleStatsReset**
> resetFirewallRuleStatsReset(category)

Reset firewall rule statistics

Sets firewall rule statistics counter to zero. This operation is supported for given category, for example: L3DFW i.e. for all layer3 firewall (transport nodes only) rules or L3EDGE i.e. for all layer3 edge firewall (edge nodes only) rules or L3BRIDGEPORT i.e. for all layer3 bridge port firewall (bridge ports only) rules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
String category = "category_example"; // String | Aggregation statistic category
try {
    apiInstance.resetFirewallRuleStatsReset(category);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#resetFirewallRuleStatsReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| Aggregation statistic category | [enum: L3DFW, L3EDGE, L3BRIDGEPORT]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reviseRuleRevise"></a>
# **reviseRuleRevise**
> FirewallRule reviseRuleRevise(body, sectionId, ruleId, id, operation)

Update an Existing Rule and Reorder the Rule

Modifies existing firewall rule along with relative position among other firewall rules inside a firewall section. Revising firewall rule in a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallRule body = new FirewallRule(); // FirewallRule | 
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    FirewallRule result = apiInstance.reviseRuleRevise(body, sectionId, ruleId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#reviseRuleRevise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallRule**](FirewallRule.md)|  |
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**FirewallRule**](FirewallRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reviseSectionRevise"></a>
# **reviseSectionRevise**
> FirewallSection reviseSectionRevise(body, sectionId, id, operation)

Update an Existing Section, Including Its Position

Modifies an existing firewall section along with its relative position among other firewall sections in the system. Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSection body = new FirewallSection(); // FirewallSection | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    FirewallSection result = apiInstance.reviseSectionRevise(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#reviseSectionRevise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSection**](FirewallSection.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**FirewallSection**](FirewallSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reviseSectionWithRulesReviseWithRules"></a>
# **reviseSectionWithRulesReviseWithRules**
> FirewallSectionRuleList reviseSectionWithRulesReviseWithRules(body, sectionId, id, operation)

Update an Existing Section with Rules

Modifies an existing firewall section along with its relative position among other firewall sections with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to move a section above or below another section, use: POST /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;?action&#x3D;revise  To modify rules, use: PUT /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt;  Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSectionRuleList body = new FirewallSectionRuleList(); // FirewallSectionRuleList | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    FirewallSectionRuleList result = apiInstance.reviseSectionWithRulesReviseWithRules(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#reviseSectionWithRulesReviseWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSectionRuleList**](FirewallSectionRuleList.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**FirewallSectionRuleList**](FirewallSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlockSectionUnlock"></a>
# **unlockSectionUnlock**
> FirewallSection unlockSectionUnlock(body, sectionId)

Unlock a section

Unlock a section 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSectionLock body = new FirewallSectionLock(); // FirewallSectionLock | 
String sectionId = "sectionId_example"; // String | 
try {
    FirewallSection result = apiInstance.unlockSectionUnlock(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#unlockSectionUnlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSectionLock**](FirewallSectionLock.md)|  |
 **sectionId** | **String**|  |

### Return type

[**FirewallSection**](FirewallSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExcludeList"></a>
# **updateExcludeList**
> ExcludeList updateExcludeList(body)

Modify exclude list

Modify exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
ExcludeList body = new ExcludeList(); // ExcludeList | 
try {
    ExcludeList result = apiInstance.updateExcludeList(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#updateExcludeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExcludeList**](ExcludeList.md)|  |

### Return type

[**ExcludeList**](ExcludeList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFirewallProfile"></a>
# **updateFirewallProfile**
> BaseFirewallProfile updateFirewallProfile(body, profileId)

Update a firewall profile.

Update user configurable properties of firewall profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
BaseFirewallProfile body = new BaseFirewallProfile(); // BaseFirewallProfile | 
String profileId = "profileId_example"; // String | 
try {
    BaseFirewallProfile result = apiInstance.updateFirewallProfile(body, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#updateFirewallProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseFirewallProfile**](BaseFirewallProfile.md)|  |
 **profileId** | **String**|  |

### Return type

[**BaseFirewallProfile**](BaseFirewallProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFirewallStatus"></a>
# **updateFirewallStatus**
> FirewallStatus updateFirewallStatus(body, contextType)

Update global firewall status for dfw context

Update global firewall status for dfw context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallStatus body = new FirewallStatus(); // FirewallStatus | 
String contextType = "contextType_example"; // String | 
try {
    FirewallStatus result = apiInstance.updateFirewallStatus(body, contextType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#updateFirewallStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallStatus**](FirewallStatus.md)|  |
 **contextType** | **String**|  |

### Return type

[**FirewallStatus**](FirewallStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRule"></a>
# **updateRule**
> FirewallRule updateRule(body, sectionId, ruleId)

Update an Existing Rule

Modifies existing firewall rule in a firewall section. Updating firewall rule in a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallRule body = new FirewallRule(); // FirewallRule | 
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    FirewallRule result = apiInstance.updateRule(body, sectionId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#updateRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallRule**](FirewallRule.md)|  |
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**FirewallRule**](FirewallRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSection"></a>
# **updateSection**
> FirewallSection updateSection(body, sectionId)

Update an Existing Section

Modifies the specified section, but does not modify the section&#x27;s associated rules. Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSection body = new FirewallSection(); // FirewallSection | 
String sectionId = "sectionId_example"; // String | 
try {
    FirewallSection result = apiInstance.updateSection(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#updateSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSection**](FirewallSection.md)|  |
 **sectionId** | **String**|  |

### Return type

[**FirewallSection**](FirewallSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSectionWithRulesUpdateWithRules"></a>
# **updateSectionWithRulesUpdateWithRules**
> FirewallSectionRuleList updateSectionWithRulesUpdateWithRules(body, sectionId)

Update an Existing Section, Including Its Rules

Modifies existing firewall section along with its association with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to update rule content, use: PUT /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt;  Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesFirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesFirewallApi apiInstance = new ManagementPlaneApiServicesFirewallApi();
FirewallSectionRuleList body = new FirewallSectionRuleList(); // FirewallSectionRuleList | 
String sectionId = "sectionId_example"; // String | 
try {
    FirewallSectionRuleList result = apiInstance.updateSectionWithRulesUpdateWithRules(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesFirewallApi#updateSectionWithRulesUpdateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallSectionRuleList**](FirewallSectionRuleList.md)|  |
 **sectionId** | **String**|  |

### Return type

[**FirewallSectionRuleList**](FirewallSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

