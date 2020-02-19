# ManagementPlaneApiClusterNodesDeploymentsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClusterNodeVM**](ManagementPlaneApiClusterNodesDeploymentsApi.md#addClusterNodeVM) | **POST** /cluster/nodes/deployments | Deploy and register a cluster node VM
[**deleteAutoDeployedClusterNodeVMDelete**](ManagementPlaneApiClusterNodesDeploymentsApi.md#deleteAutoDeployedClusterNodeVMDelete) | **POST** /cluster/nodes/deployments/{node-id}?action&#x3D;delete | Attempt to delete an auto-deployed cluster node VM
[**getRepoSyncStatus**](ManagementPlaneApiClusterNodesDeploymentsApi.md#getRepoSyncStatus) | **GET** /cluster/nodes/{node-id}/repo_sync/status | Synchronizes the repository data between nsx managers.
[**listClusterNodeVMDeploymentRequests**](ManagementPlaneApiClusterNodesDeploymentsApi.md#listClusterNodeVMDeploymentRequests) | **GET** /cluster/nodes/deployments | Returns info for all cluster node VM auto-deployment attempts
[**performRepoSyncRepoSync**](ManagementPlaneApiClusterNodesDeploymentsApi.md#performRepoSyncRepoSync) | **POST** /cluster/node?action&#x3D;repo_sync | Synchronizes the repository data between nsx managers.
[**readClusterNodeVMDeploymentRequest**](ManagementPlaneApiClusterNodesDeploymentsApi.md#readClusterNodeVMDeploymentRequest) | **GET** /cluster/nodes/deployments/{node-id} | Returns info for a cluster-node VM auto-deployment attempt
[**readClusterNodeVMDeploymentStatus**](ManagementPlaneApiClusterNodesDeploymentsApi.md#readClusterNodeVMDeploymentStatus) | **GET** /cluster/nodes/deployments/{node-id}/status | Returns the status of the VM creation/deletion

<a name="addClusterNodeVM"></a>
# **addClusterNodeVM**
> ClusterNodeVMDeploymentRequestList addClusterNodeVM(body)

Deploy and register a cluster node VM

Deploys a cluster node VM as specified by the deployment config. Once the VM is deployed and powered on, it will automatically join the existing cluster. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiClusterNodesDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiClusterNodesDeploymentsApi apiInstance = new ManagementPlaneApiClusterNodesDeploymentsApi();
AddClusterNodeVMInfo body = new AddClusterNodeVMInfo(); // AddClusterNodeVMInfo | 
try {
    ClusterNodeVMDeploymentRequestList result = apiInstance.addClusterNodeVM(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiClusterNodesDeploymentsApi#addClusterNodeVM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddClusterNodeVMInfo**](AddClusterNodeVMInfo.md)|  |

### Return type

[**ClusterNodeVMDeploymentRequestList**](ClusterNodeVMDeploymentRequestList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAutoDeployedClusterNodeVMDelete"></a>
# **deleteAutoDeployedClusterNodeVMDelete**
> deleteAutoDeployedClusterNodeVMDelete(nodeId, forceDelete)

Attempt to delete an auto-deployed cluster node VM

Attempts to unregister and undeploy a specified auto-deployed cluster node VM. If it is a member of a cluster, then the VM will be automatically detached from the cluster before being unregistered and undeployed. Alternatively, if the original deployment attempt failed or the VM is not found, cleans up the deployment information associated with the deployment attempt. Note: If a VM has been successfully auto-deployed, then the associated deployment information will not be deleted unless and until the VM is successfully deleted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiClusterNodesDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiClusterNodesDeploymentsApi apiInstance = new ManagementPlaneApiClusterNodesDeploymentsApi();
String nodeId = "nodeId_example"; // String | 
Boolean forceDelete = true; // Boolean | Delete by force
try {
    apiInstance.deleteAutoDeployedClusterNodeVMDelete(nodeId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiClusterNodesDeploymentsApi#deleteAutoDeployedClusterNodeVMDelete");
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

<a name="getRepoSyncStatus"></a>
# **getRepoSyncStatus**
> RepoSyncStatusReport getRepoSyncStatus(nodeId)

Synchronizes the repository data between nsx managers.

Returns the synchronization status for the manager represented by given &lt;node-id&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiClusterNodesDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiClusterNodesDeploymentsApi apiInstance = new ManagementPlaneApiClusterNodesDeploymentsApi();
String nodeId = "nodeId_example"; // String | 
try {
    RepoSyncStatusReport result = apiInstance.getRepoSyncStatus(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiClusterNodesDeploymentsApi#getRepoSyncStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**RepoSyncStatusReport**](RepoSyncStatusReport.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClusterNodeVMDeploymentRequests"></a>
# **listClusterNodeVMDeploymentRequests**
> ClusterNodeVMDeploymentRequestList listClusterNodeVMDeploymentRequests()

Returns info for all cluster node VM auto-deployment attempts

Returns request information for every attempted deployment of a cluster node VM. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiClusterNodesDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiClusterNodesDeploymentsApi apiInstance = new ManagementPlaneApiClusterNodesDeploymentsApi();
try {
    ClusterNodeVMDeploymentRequestList result = apiInstance.listClusterNodeVMDeploymentRequests();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiClusterNodesDeploymentsApi#listClusterNodeVMDeploymentRequests");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterNodeVMDeploymentRequestList**](ClusterNodeVMDeploymentRequestList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="performRepoSyncRepoSync"></a>
# **performRepoSyncRepoSync**
> performRepoSyncRepoSync()

Synchronizes the repository data between nsx managers.

Attempts to synchronize the repository partition on nsx manager. Repository partition contains packages required for the install and upgrade of nsx components.Normally there is no need to call this API explicitely by the user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiClusterNodesDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiClusterNodesDeploymentsApi apiInstance = new ManagementPlaneApiClusterNodesDeploymentsApi();
try {
    apiInstance.performRepoSyncRepoSync();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiClusterNodesDeploymentsApi#performRepoSyncRepoSync");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterNodeVMDeploymentRequest"></a>
# **readClusterNodeVMDeploymentRequest**
> ClusterNodeVMDeploymentRequest readClusterNodeVMDeploymentRequest(nodeId)

Returns info for a cluster-node VM auto-deployment attempt

Returns deployment request information for a specific attempted deployment of a cluster node VM. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiClusterNodesDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiClusterNodesDeploymentsApi apiInstance = new ManagementPlaneApiClusterNodesDeploymentsApi();
String nodeId = "nodeId_example"; // String | 
try {
    ClusterNodeVMDeploymentRequest result = apiInstance.readClusterNodeVMDeploymentRequest(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiClusterNodesDeploymentsApi#readClusterNodeVMDeploymentRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**ClusterNodeVMDeploymentRequest**](ClusterNodeVMDeploymentRequest.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterNodeVMDeploymentStatus"></a>
# **readClusterNodeVMDeploymentStatus**
> ClusterNodeVMDeploymentStatusReport readClusterNodeVMDeploymentStatus(nodeId)

Returns the status of the VM creation/deletion

Returns the current deployment or undeployment status for a VM along with any other relevant current information, such as error messages. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiClusterNodesDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiClusterNodesDeploymentsApi apiInstance = new ManagementPlaneApiClusterNodesDeploymentsApi();
String nodeId = "nodeId_example"; // String | 
try {
    ClusterNodeVMDeploymentStatusReport result = apiInstance.readClusterNodeVMDeploymentStatus(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiClusterNodesDeploymentsApi#readClusterNodeVMDeploymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |

### Return type

[**ClusterNodeVMDeploymentStatusReport**](ClusterNodeVMDeploymentStatusReport.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

