# ManagementPlaneApiGroupingObjectsNsGroupsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrRemoveNSGroupExpression**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#addOrRemoveNSGroupExpression) | **POST** /ns-groups/{ns-group-id} | Add NSGroup expression
[**createNSGroup**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#createNSGroup) | **POST** /ns-groups | Create NSGroup
[**deleteNSGroup**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#deleteNSGroup) | **DELETE** /ns-groups/{ns-group-id} | Delete NSGroup
[**getEffectiveActiveDirectoryGroups**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveActiveDirectoryGroups) | **GET** /ns-groups/{ns-group-id}/effective-directory-group-members | Get Effective Directory Groups of the specified NSGroup.
[**getEffectiveIPAddressMembers**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveIPAddressMembers) | **GET** /ns-groups/{ns-group-id}/effective-ip-address-members | Get Effective IPAddress translated from the NSGroup
[**getEffectiveIPSetMembers**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveIPSetMembers) | **GET** /ns-groups/{ns-group-id}/effective-ipset-members | Get Effective IPSets of the specified NSGroup.
[**getEffectiveLogicalPortMembers**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveLogicalPortMembers) | **GET** /ns-groups/{ns-group-id}/effective-logical-port-members | Get Effective Logical Ports translated from the NSgroup
[**getEffectiveLogicalSwitchMembers**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveLogicalSwitchMembers) | **GET** /ns-groups/{ns-group-id}/effective-logical-switch-members | Get Effective switch members translated from the NSGroup
[**getEffectiveTransportNodeMembers**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveTransportNodeMembers) | **GET** /ns-groups/{ns-group-id}/effective-transport-node-members | Get effective transport node members translated from the NSGroup
[**getEffectiveVIFMembers**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveVIFMembers) | **GET** /ns-groups/{ns-group-id}/effective-vif-members | Get effective VIF members translated from the NSGroup
[**getEffectiveVirtualMachineMembers**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getEffectiveVirtualMachineMembers) | **GET** /ns-groups/{ns-group-id}/effective-virtual-machine-members | Get Effective Virtual Machine members of the specified NSGroup.
[**getMemberTypes**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getMemberTypes) | **GET** /ns-groups/{ns-group-id}/member-types | Get member types from NSGroup
[**getServiceAssociations**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getServiceAssociations) | **GET** /ns-groups/{nsgroup-id}/service-associations | Get services to which the given nsgroup belongs to 
[**getUnassociatedVirtualMachines**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#getUnassociatedVirtualMachines) | **GET** /ns-groups/unassociated-virtual-machines | Get the list of all the virtual machines that are not a part of any existing NSGroup.
[**listNSGroups**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#listNSGroups) | **GET** /ns-groups | List NSGroups
[**readNSGroup**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#readNSGroup) | **GET** /ns-groups/{ns-group-id} | Read NSGroup
[**updateNSGroup**](ManagementPlaneApiGroupingObjectsNsGroupsApi.md#updateNSGroup) | **PUT** /ns-groups/{ns-group-id} | Update NSGroup

<a name="addOrRemoveNSGroupExpression"></a>
# **addOrRemoveNSGroupExpression**
> NSGroup addOrRemoveNSGroupExpression(body, action, nsGroupId)

Add NSGroup expression

Add/remove the expressions passed in the request body to/from the NSGroup 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
NSGroupExpressionList body = new NSGroupExpressionList(); // NSGroupExpressionList | 
String action = "action_example"; // String | Specifies addition or removal action
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
try {
    NSGroup result = apiInstance.addOrRemoveNSGroupExpression(body, action, nsGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#addOrRemoveNSGroupExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSGroupExpressionList**](NSGroupExpressionList.md)|  |
 **action** | **String**| Specifies addition or removal action | [enum: ADD_MEMBERS, REMOVE_MEMBERS]
 **nsGroupId** | **String**| NSGroup Id |

### Return type

[**NSGroup**](NSGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNSGroup"></a>
# **createNSGroup**
> NSGroup createNSGroup(body)

Create NSGroup

Creates a new NSGroup that can group NSX resources - VIFs, Lports and LSwitches as well as the grouping objects - IPSet, MACSet and other NSGroups. For NSGroups containing VM criteria(both static and dynamic), system VMs will not be included as members. This filter applies at VM level only. Exceptions are as follows: 1. LogicalPorts and VNI of System VMs will be included in NSGroup if the criteria  is based on LogicalPort, LogicalSwitch or VNI directly. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
NSGroup body = new NSGroup(); // NSGroup | 
try {
    NSGroup result = apiInstance.createNSGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#createNSGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSGroup**](NSGroup.md)|  |

### Return type

[**NSGroup**](NSGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNSGroup"></a>
# **deleteNSGroup**
> deleteNSGroup(nsGroupId, force)

Delete NSGroup

Deletes the specified NSGroup. By default, if the NSGroup is added to another NSGroup, it won&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the NSGroup. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteNSGroup(nsGroupId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#deleteNSGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveActiveDirectoryGroups"></a>
# **getEffectiveActiveDirectoryGroups**
> EffectiveMemberResourceListResult getEffectiveActiveDirectoryGroups(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get Effective Directory Groups of the specified NSGroup.

Returns effective directory groups which are members of the specified NSGroup. This API is applicable only for NSGroups containing DirectoryGroup member type. For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveMemberResourceListResult result = apiInstance.getEffectiveActiveDirectoryGroups(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveActiveDirectoryGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveMemberResourceListResult**](EffectiveMemberResourceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveIPAddressMembers"></a>
# **getEffectiveIPAddressMembers**
> EffectiveIPAddressMemberListResult getEffectiveIPAddressMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get Effective IPAddress translated from the NSGroup

Returns effective ip address members of the specified NSGroup. This API is applicable only for NSGroups containing either VirtualMachine, VIF, LogicalSwitch, LogicalPort or IPSet member type. For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveIPAddressMemberListResult result = apiInstance.getEffectiveIPAddressMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveIPAddressMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveIPAddressMemberListResult**](EffectiveIPAddressMemberListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveIPSetMembers"></a>
# **getEffectiveIPSetMembers**
> EffectiveMemberResourceListResult getEffectiveIPSetMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get Effective IPSets of the specified NSGroup.

Returns effective IPSets which are members of the specified NSGroup. This API is applicable only for NSGroups containing IPSet member type. For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveMemberResourceListResult result = apiInstance.getEffectiveIPSetMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveIPSetMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveMemberResourceListResult**](EffectiveMemberResourceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveLogicalPortMembers"></a>
# **getEffectiveLogicalPortMembers**
> EffectiveMemberResourceListResult getEffectiveLogicalPortMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get Effective Logical Ports translated from the NSgroup

Returns effective logical port members of the specified NSGroup. This API is applicable only for NSGroups containing either VirtualMachines, LogicalSwitch or LogicalPort member types.For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveMemberResourceListResult result = apiInstance.getEffectiveLogicalPortMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveLogicalPortMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveMemberResourceListResult**](EffectiveMemberResourceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveLogicalSwitchMembers"></a>
# **getEffectiveLogicalSwitchMembers**
> EffectiveMemberResourceListResult getEffectiveLogicalSwitchMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get Effective switch members translated from the NSGroup

Returns effective logical switch members of the specified NSGroup. This API is applicable for NSGroups containing LogicalSwitch members. For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveMemberResourceListResult result = apiInstance.getEffectiveLogicalSwitchMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveLogicalSwitchMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveMemberResourceListResult**](EffectiveMemberResourceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveTransportNodeMembers"></a>
# **getEffectiveTransportNodeMembers**
> EffectiveMemberResourceListResult getEffectiveTransportNodeMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get effective transport node members translated from the NSGroup

Returns effective transport node members of the specified NSGroup. This API is applicable only for NSGroups containing TransportNode member type. For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveMemberResourceListResult result = apiInstance.getEffectiveTransportNodeMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveTransportNodeMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveMemberResourceListResult**](EffectiveMemberResourceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveVIFMembers"></a>
# **getEffectiveVIFMembers**
> VirtualNetworkInterfaceListResult getEffectiveVIFMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get effective VIF members translated from the NSGroup

Returns effective VIF members of the specified NSGroup. This API is applicable only for NSGroups containing either VirtualMachines or VIF member type. For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VirtualNetworkInterfaceListResult result = apiInstance.getEffectiveVIFMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveVIFMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**VirtualNetworkInterfaceListResult**](VirtualNetworkInterfaceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEffectiveVirtualMachineMembers"></a>
# **getEffectiveVirtualMachineMembers**
> VirtualMachineListResult getEffectiveVirtualMachineMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get Effective Virtual Machine members of the specified NSGroup.

Returns effective virtual machine members of the specified NSGroup. This API is applicable only for NSGroups containing VirtualMachine member type. For NSGroups containing other member types,it returns an empty list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VirtualMachineListResult result = apiInstance.getEffectiveVirtualMachineMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getEffectiveVirtualMachineMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**VirtualMachineListResult**](VirtualMachineListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMemberTypes"></a>
# **getMemberTypes**
> EffectiveMemberTypeListResult getMemberTypes(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy)

Get member types from NSGroup

Returns member types for a specified NSGroup including child NSGroups. This considers static members and members added via membership criteria only 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    EffectiveMemberTypeListResult result = apiInstance.getMemberTypes(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getMemberTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**EffectiveMemberTypeListResult**](EffectiveMemberTypeListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceAssociations"></a>
# **getServiceAssociations**
> ServiceAssociationListResult getServiceAssociations(nsgroupId, serviceType, cursor, fetchParentgroupAssociations, includedFields, pageSize, sortAscending, sortBy)

Get services to which the given nsgroup belongs to 

Returns information about services that are associated with the given NSGroup. The service name is passed by service_type parameter 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsgroupId = "nsgroupId_example"; // String | 
String serviceType = "serviceType_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
Boolean fetchParentgroupAssociations = true; // Boolean | Fetch complete list of associated resources considering nesting 
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ServiceAssociationListResult result = apiInstance.getServiceAssociations(nsgroupId, serviceType, cursor, fetchParentgroupAssociations, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getServiceAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsgroupId** | **String**|  |
 **serviceType** | **String**|  | [enum: firewall, ipfix]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **fetchParentgroupAssociations** | **Boolean**| Fetch complete list of associated resources considering nesting  | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ServiceAssociationListResult**](ServiceAssociationListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUnassociatedVirtualMachines"></a>
# **getUnassociatedVirtualMachines**
> UnassociatedVMListResult getUnassociatedVirtualMachines(cursor, displayName, externalId, hostId, includedFields, pageSize, sortAscending, sortBy)

Get the list of all the virtual machines that are not a part of any existing NSGroup.

Get the list of all the virtual machines that are not a part of any existing NSGroup. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String displayName = "displayName_example"; // String | Display Name of the virtual machine
String externalId = "externalId_example"; // String | External id of the virtual machine
String hostId = "hostId_example"; // String | Id of the host where this vif is located
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    UnassociatedVMListResult result = apiInstance.getUnassociatedVirtualMachines(cursor, displayName, externalId, hostId, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#getUnassociatedVirtualMachines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **displayName** | **String**| Display Name of the virtual machine | [optional]
 **externalId** | **String**| External id of the virtual machine | [optional]
 **hostId** | **String**| Id of the host where this vif is located | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**UnassociatedVMListResult**](UnassociatedVMListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNSGroups"></a>
# **listNSGroups**
> NSGroupListResult listNSGroups(cursor, includedFields, memberTypes, pageSize, populateReferences, sortAscending, sortBy)

List NSGroups

List the NSGroups in a paginated format. The page size is restricted to 50 NSGroups so that the size of the response remains small even in the worst case. Optionally, specify valid member types as request parameter to filter NSGroups. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String memberTypes = "memberTypes_example"; // String | Specify member types to filter corresponding NSGroups 
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean populateReferences = true; // Boolean | Populate metadata of resource referenced by NSGroupExpressions 
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    NSGroupListResult result = apiInstance.listNSGroups(cursor, includedFields, memberTypes, pageSize, populateReferences, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#listNSGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **memberTypes** | **String**| Specify member types to filter corresponding NSGroups  | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **populateReferences** | **Boolean**| Populate metadata of resource referenced by NSGroupExpressions  | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**NSGroupListResult**](NSGroupListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNSGroup"></a>
# **readNSGroup**
> NSGroup readNSGroup(nsGroupId, populateReferences)

Read NSGroup

Returns information about the specified NSGroup. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
Boolean populateReferences = true; // Boolean | Populate metadata of resource referenced by NSGroupExpressions 
try {
    NSGroup result = apiInstance.readNSGroup(nsGroupId, populateReferences);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#readNSGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsGroupId** | **String**| NSGroup Id |
 **populateReferences** | **Boolean**| Populate metadata of resource referenced by NSGroupExpressions  | [optional]

### Return type

[**NSGroup**](NSGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNSGroup"></a>
# **updateNSGroup**
> NSGroup updateNSGroup(body, nsGroupId)

Update NSGroup

Updates the specified NSGroup. Modifiable parameters include the description, display_name and members. For NSGroups containing VM criteria(both static and dynamic), system VMs will not be included as members. This filter applies at VM level only. Exceptions are as follows. 1. LogicalPorts and VNI of system VMs will be included in NSGroup if the criteria  is based on LogicalPort, LogicalSwitch or VNI directly. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiGroupingObjectsNsGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiGroupingObjectsNsGroupsApi apiInstance = new ManagementPlaneApiGroupingObjectsNsGroupsApi();
NSGroup body = new NSGroup(); // NSGroup | 
String nsGroupId = "nsGroupId_example"; // String | NSGroup Id
try {
    NSGroup result = apiInstance.updateNSGroup(body, nsGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiGroupingObjectsNsGroupsApi#updateNSGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NSGroup**](NSGroup.md)|  |
 **nsGroupId** | **String**| NSGroup Id |

### Return type

[**NSGroup**](NSGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

