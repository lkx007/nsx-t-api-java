# ManagementPlaneApiOperationsLldpApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFabricNodeNeighborProperties**](ManagementPlaneApiOperationsLldpApi.md#listFabricNodeNeighborProperties) | **GET** /lldp/fabric-nodes/{fabric-node-id}/interfaces | List LLDP Neighbor Properties of Fabric Node
[**readFabricNodeNeighborProperties**](ManagementPlaneApiOperationsLldpApi.md#readFabricNodeNeighborProperties) | **GET** /lldp/fabric-nodes/{fabric-node-id}/interfaces/{interface-name} | Read LLDP Neighbor Properties of Fabric Node by Interface Name

<a name="listFabricNodeNeighborProperties"></a>
# **listFabricNodeNeighborProperties**
> InterfaceNeighborPropertyListResult listFabricNodeNeighborProperties(fabricNodeId)

List LLDP Neighbor Properties of Fabric Node

List LLDP Neighbor Properties for all interfaces of Fabric Node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsLldpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsLldpApi apiInstance = new ManagementPlaneApiOperationsLldpApi();
String fabricNodeId = "fabricNodeId_example"; // String | ID of fabric node
try {
    InterfaceNeighborPropertyListResult result = apiInstance.listFabricNodeNeighborProperties(fabricNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsLldpApi#listFabricNodeNeighborProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fabricNodeId** | **String**| ID of fabric node |

### Return type

[**InterfaceNeighborPropertyListResult**](InterfaceNeighborPropertyListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readFabricNodeNeighborProperties"></a>
# **readFabricNodeNeighborProperties**
> InterfaceNeighborProperties readFabricNodeNeighborProperties(fabricNodeId, interfaceName)

Read LLDP Neighbor Properties of Fabric Node by Interface Name

Read LLDP Neighbor Properties for a specific interface of Fabric Node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiOperationsLldpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiOperationsLldpApi apiInstance = new ManagementPlaneApiOperationsLldpApi();
String fabricNodeId = "fabricNodeId_example"; // String | ID of fabric node
String interfaceName = "interfaceName_example"; // String | Interface name to read
try {
    InterfaceNeighborProperties result = apiInstance.readFabricNodeNeighborProperties(fabricNodeId, interfaceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiOperationsLldpApi#readFabricNodeNeighborProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fabricNodeId** | **String**| ID of fabric node |
 **interfaceName** | **String**| Interface name to read |

### Return type

[**InterfaceNeighborProperties**](InterfaceNeighborProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

