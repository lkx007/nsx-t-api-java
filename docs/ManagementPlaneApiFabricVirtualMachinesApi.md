# ManagementPlaneApiFabricVirtualMachinesApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listVirtualMachines**](ManagementPlaneApiFabricVirtualMachinesApi.md#listVirtualMachines) | **GET** /fabric/virtual-machines | Return the List of Virtual Machines
[**listVmToolsInfo**](ManagementPlaneApiFabricVirtualMachinesApi.md#listVmToolsInfo) | **GET** /fabric/virtual-machines/tools-info | Return the list of tools and agents installed in VMs.
[**updateVirtualMachineTagsUpdateTags**](ManagementPlaneApiFabricVirtualMachinesApi.md#updateVirtualMachineTagsUpdateTags) | **POST** /fabric/virtual-machines?action&#x3D;update_tags | Update tags applied to a virtual machine

<a name="listVirtualMachines"></a>
# **listVirtualMachines**
> VirtualMachineListResult listVirtualMachines(cursor, displayName, externalId, hostId, includedFields, pageSize, sortAscending, sortBy)

Return the List of Virtual Machines

Returns information about all virtual machines.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricVirtualMachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricVirtualMachinesApi apiInstance = new ManagementPlaneApiFabricVirtualMachinesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String displayName = "displayName_example"; // String | Display Name of the virtual machine
String externalId = "externalId_example"; // String | External id of the virtual machine
String hostId = "hostId_example"; // String | Id of the host where this vif is located
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VirtualMachineListResult result = apiInstance.listVirtualMachines(cursor, displayName, externalId, hostId, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricVirtualMachinesApi#listVirtualMachines");
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

[**VirtualMachineListResult**](VirtualMachineListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVmToolsInfo"></a>
# **listVmToolsInfo**
> VmToolsInfoListResult listVmToolsInfo(cursor, includedFields, pageSize, sortAscending, sortBy)

Return the list of tools and agents installed in VMs.

This API returns the list of tools and agents installed in VMs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricVirtualMachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricVirtualMachinesApi apiInstance = new ManagementPlaneApiFabricVirtualMachinesApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    VmToolsInfoListResult result = apiInstance.listVmToolsInfo(cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricVirtualMachinesApi#listVmToolsInfo");
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

[**VmToolsInfoListResult**](VmToolsInfoListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVirtualMachineTagsUpdateTags"></a>
# **updateVirtualMachineTagsUpdateTags**
> updateVirtualMachineTagsUpdateTags(body)

Update tags applied to a virtual machine

Update tags applied to the virtual machine. External id of the virtual machine will be specified in the request body. Request body should contain all the tags to be applied. To clear all tags, provide an empty list. User can apply maximum 25 tags on a virtual machine. The remaining 5 are reserved for system defined tags.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricVirtualMachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricVirtualMachinesApi apiInstance = new ManagementPlaneApiFabricVirtualMachinesApi();
VirtualMachineTagUpdate body = new VirtualMachineTagUpdate(); // VirtualMachineTagUpdate | 
try {
    apiInstance.updateVirtualMachineTagsUpdateTags(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricVirtualMachinesApi#updateVirtualMachineTagsUpdateTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VirtualMachineTagUpdate**](VirtualMachineTagUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

