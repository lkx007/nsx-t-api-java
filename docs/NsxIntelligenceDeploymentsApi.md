# NsxIntelligenceDeploymentsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPaceClusterNodeVM**](NsxIntelligenceDeploymentsApi.md#addPaceClusterNodeVM) | **POST** /intelligence/nodes/deployments | Deploy and register a Intelligence cluster node VM
[**deleteAutoDeployedPaceClusterNodeVMDelete**](NsxIntelligenceDeploymentsApi.md#deleteAutoDeployedPaceClusterNodeVMDelete) | **POST** /intelligence/nodes/deployments/{node-id}?action&#x3D;delete | Attempt to delete an auto-deployed cluster node VM
[**listPaceClusterNodeVMDeploymentRequests**](NsxIntelligenceDeploymentsApi.md#listPaceClusterNodeVMDeploymentRequests) | **GET** /intelligence/nodes/deployments | Returns info for all cluster node VM auto-deployment attempts
[**readPaceClusterNodeVMDeploymentRequest**](NsxIntelligenceDeploymentsApi.md#readPaceClusterNodeVMDeploymentRequest) | **GET** /intelligence/nodes/deployments/{node-id} | Returns info for a Intelligence cluster node VM auto-deployment attempt
[**readPaceClusterNodeVMDeploymentStatus**](NsxIntelligenceDeploymentsApi.md#readPaceClusterNodeVMDeploymentStatus) | **GET** /intelligence/nodes/deployments/{node-id}/status | Returns the status of the VM creation/deletion

<a name="addPaceClusterNodeVM"></a>
# **addPaceClusterNodeVM**
> IntelligenceClusterNodeVMDeploymentRequestList addPaceClusterNodeVM(body)

Deploy and register a Intelligence cluster node VM

Deploys a Intelligence cluster node VM as specified by the deployment config. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceDeploymentsApi apiInstance = new NsxIntelligenceDeploymentsApi();
AddIntelligenceClusterNodeVMInfo body = new AddIntelligenceClusterNodeVMInfo(); // AddIntelligenceClusterNodeVMInfo | 
try {
    IntelligenceClusterNodeVMDeploymentRequestList result = apiInstance.addPaceClusterNodeVM(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceDeploymentsApi#addPaceClusterNodeVM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddIntelligenceClusterNodeVMInfo**](AddIntelligenceClusterNodeVMInfo.md)|  |

### Return type

[**IntelligenceClusterNodeVMDeploymentRequestList**](IntelligenceClusterNodeVMDeploymentRequestList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAutoDeployedPaceClusterNodeVMDelete"></a>
# **deleteAutoDeployedPaceClusterNodeVMDelete**
> deleteAutoDeployedPaceClusterNodeVMDelete(nodeId, forceDelete)

Attempt to delete an auto-deployed cluster node VM

Attempts to unregister and undeploy a specified auto-deployed cluster node VM. If it is a member of a cluster, then the VM will be automatically detached from the cluster before being unregistered and undeployed. Alternatively, if the original deployment attempt failed or the VM is not found, cleans up the deployment information associated with the deployment attempt. Note: If a VM has been successfully auto-deployed, then the associated deployment information will not be deleted unless and until the VM is successfully deleted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceDeploymentsApi apiInstance = new NsxIntelligenceDeploymentsApi();
String nodeId = "nodeId_example"; // String | 
Boolean forceDelete = true; // Boolean | Delete by force
try {
    apiInstance.deleteAutoDeployedPaceClusterNodeVMDelete(nodeId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceDeploymentsApi#deleteAutoDeployedPaceClusterNodeVMDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **forceDelete** | **Boolean**| Delete by force | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPaceClusterNodeVMDeploymentRequests"></a>
# **listPaceClusterNodeVMDeploymentRequests**
> IntelligenceClusterNodeVMDeploymentRequestList listPaceClusterNodeVMDeploymentRequests()

Returns info for all cluster node VM auto-deployment attempts

Returns request information for every attempted deployment of a cluster node VM. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceDeploymentsApi apiInstance = new NsxIntelligenceDeploymentsApi();
try {
    IntelligenceClusterNodeVMDeploymentRequestList result = apiInstance.listPaceClusterNodeVMDeploymentRequests();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceDeploymentsApi#listPaceClusterNodeVMDeploymentRequests");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IntelligenceClusterNodeVMDeploymentRequestList**](IntelligenceClusterNodeVMDeploymentRequestList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPaceClusterNodeVMDeploymentRequest"></a>
# **readPaceClusterNodeVMDeploymentRequest**
> IntelligenceClusterNodeVMDeploymentRequest readPaceClusterNodeVMDeploymentRequest(nodeId)

Returns info for a Intelligence cluster node VM auto-deployment attempt

Returns deployment request information for a specific attempted deployment of a cluster node VM. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceDeploymentsApi apiInstance = new NsxIntelligenceDeploymentsApi();
String nodeId = "nodeId_example"; // String | 
try {
    IntelligenceClusterNodeVMDeploymentRequest result = apiInstance.readPaceClusterNodeVMDeploymentRequest(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceDeploymentsApi#readPaceClusterNodeVMDeploymentRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**IntelligenceClusterNodeVMDeploymentRequest**](IntelligenceClusterNodeVMDeploymentRequest.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPaceClusterNodeVMDeploymentStatus"></a>
# **readPaceClusterNodeVMDeploymentStatus**
> IntelligenceClusterNodeVMDeploymentStatusReport readPaceClusterNodeVMDeploymentStatus(nodeId)

Returns the status of the VM creation/deletion

Returns the current deployment or undeployment status for a VM along with any other relevant current information, such as error messages. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NsxIntelligenceDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NsxIntelligenceDeploymentsApi apiInstance = new NsxIntelligenceDeploymentsApi();
String nodeId = "nodeId_example"; // String | 
try {
    IntelligenceClusterNodeVMDeploymentStatusReport result = apiInstance.readPaceClusterNodeVMDeploymentStatus(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsxIntelligenceDeploymentsApi#readPaceClusterNodeVMDeploymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**IntelligenceClusterNodeVMDeploymentStatusReport**](IntelligenceClusterNodeVMDeploymentStatusReport.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

