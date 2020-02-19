# ManagementPlaneApiIdentityFirewallMonitoringApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getComputeCollectionStatusById**](ManagementPlaneApiIdentityFirewallMonitoringApi.md#getComputeCollectionStatusById) | **GET** /idfw/compute-collections/{compute-collection-ext-id}/status | Get list of compute collections and status.
[**listComputeCollectionStatuses**](ManagementPlaneApiIdentityFirewallMonitoringApi.md#listComputeCollectionStatuses) | **GET** /idfw/compute-collections/status | List all IDFW enabled ComputeCollection statuses.
[**listTransportNodeStatusesByComputeCollectionId**](ManagementPlaneApiIdentityFirewallMonitoringApi.md#listTransportNodeStatusesByComputeCollectionId) | **GET** /idfw/compute-collections/{cc-ext-id}/transport-nodes/status | List all transport node and statuses based on idfw enabled ComputeCollection ID.
[**listVirtualMachineStatusesByTransportNodeId**](ManagementPlaneApiIdentityFirewallMonitoringApi.md#listVirtualMachineStatusesByTransportNodeId) | **GET** /idfw/transport-nodes/{transport-node-id}/vms/status | List all VM and statuses based on transport node ID of idfw enabled compute collection.

<a name="getComputeCollectionStatusById"></a>
# **getComputeCollectionStatusById**
> IdfwComputeCollectionStatus getComputeCollectionStatusById(computeCollectionExtId)

Get list of compute collections and status.

Retrieve the compute collection status by ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallMonitoringApi apiInstance = new ManagementPlaneApiIdentityFirewallMonitoringApi();
String computeCollectionExtId = "computeCollectionExtId_example"; // String | 
try {
    IdfwComputeCollectionStatus result = apiInstance.getComputeCollectionStatusById(computeCollectionExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallMonitoringApi#getComputeCollectionStatusById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeCollectionExtId** | **String**|  |

### Return type

[**IdfwComputeCollectionStatus**](IdfwComputeCollectionStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listComputeCollectionStatuses"></a>
# **listComputeCollectionStatuses**
> IdfwComputeCollectionListResult listComputeCollectionStatuses()

List all IDFW enabled ComputeCollection statuses.

Retrieve all the Compute collection status. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallMonitoringApi apiInstance = new ManagementPlaneApiIdentityFirewallMonitoringApi();
try {
    IdfwComputeCollectionListResult result = apiInstance.listComputeCollectionStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallMonitoringApi#listComputeCollectionStatuses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IdfwComputeCollectionListResult**](IdfwComputeCollectionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransportNodeStatusesByComputeCollectionId"></a>
# **listTransportNodeStatusesByComputeCollectionId**
> IdfwTransportNodeStatusListResult listTransportNodeStatusesByComputeCollectionId(ccExtId)

List all transport node and statuses based on idfw enabled ComputeCollection ID.

Retrieve all the transport node and status by idfw enabled   ComputeCollection ID in the request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallMonitoringApi apiInstance = new ManagementPlaneApiIdentityFirewallMonitoringApi();
String ccExtId = "ccExtId_example"; // String | 
try {
    IdfwTransportNodeStatusListResult result = apiInstance.listTransportNodeStatusesByComputeCollectionId(ccExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallMonitoringApi#listTransportNodeStatusesByComputeCollectionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccExtId** | **String**|  |

### Return type

[**IdfwTransportNodeStatusListResult**](IdfwTransportNodeStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVirtualMachineStatusesByTransportNodeId"></a>
# **listVirtualMachineStatusesByTransportNodeId**
> IdfwVirtualMachineStatusListResult listVirtualMachineStatusesByTransportNodeId(transportNodeId)

List all VM and statuses based on transport node ID of idfw enabled compute collection.

Retrieve all the VM and status by transport node ID of idfw enabled compute collection in the request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiIdentityFirewallMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiIdentityFirewallMonitoringApi apiInstance = new ManagementPlaneApiIdentityFirewallMonitoringApi();
String transportNodeId = "transportNodeId_example"; // String | 
try {
    IdfwVirtualMachineStatusListResult result = apiInstance.listVirtualMachineStatusesByTransportNodeId(transportNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiIdentityFirewallMonitoringApi#listVirtualMachineStatusesByTransportNodeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transportNodeId** | **String**|  |

### Return type

[**IdfwVirtualMachineStatusListResult**](IdfwVirtualMachineStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

