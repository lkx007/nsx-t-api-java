# ManagementPlaneApiFabricVifsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listVifs**](ManagementPlaneApiFabricVifsApi.md#listVifs) | **GET** /fabric/vifs | Return the List of Virtual Network Interfaces (VIFs)

<a name="listVifs"></a>
# **listVifs**
> VirtualNetworkInterfaceListResult listVifs(cursor, hostId, includedFields, lportAttachmentId, ownerVmId, pageSize, sortAscending, sortBy, vmId)

Return the List of Virtual Network Interfaces (VIFs)

Returns information about all VIFs. A virtual network interface aggregates network interfaces into a logical interface unit that is indistinuishable from a physical network interface. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiFabricVifsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiFabricVifsApi apiInstance = new ManagementPlaneApiFabricVifsApi();
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String hostId = "hostId_example"; // String | Id of the host where this vif is located.
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
String lportAttachmentId = "lportAttachmentId_example"; // String | LPort Attachment Id of the virtual network interface.
String ownerVmId = "ownerVmId_example"; // String | External id of the virtual machine.
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String vmId = "vmId_example"; // String | External id of the virtual machine.
try {
    VirtualNetworkInterfaceListResult result = apiInstance.listVifs(cursor, hostId, includedFields, lportAttachmentId, ownerVmId, pageSize, sortAscending, sortBy, vmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiFabricVifsApi#listVifs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **hostId** | **String**| Id of the host where this vif is located. | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **lportAttachmentId** | **String**| LPort Attachment Id of the virtual network interface. | [optional]
 **ownerVmId** | **String**| External id of the virtual machine. | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **vmId** | **String**| External id of the virtual machine. | [optional]

### Return type

[**VirtualNetworkInterfaceListResult**](VirtualNetworkInterfaceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

