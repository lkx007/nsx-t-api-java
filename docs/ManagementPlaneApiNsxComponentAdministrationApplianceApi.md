# ManagementPlaneApiNsxComponentAdministrationApplianceApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeNodeMode**](ManagementPlaneApiNsxComponentAdministrationApplianceApi.md#changeNodeMode) | **POST** /configs/node/mode | NodeMode
[**getNodeMode**](ManagementPlaneApiNsxComponentAdministrationApplianceApi.md#getNodeMode) | **GET** /node/mode | NodeMode
[**setNodeTimeSetSystemTime**](ManagementPlaneApiNsxComponentAdministrationApplianceApi.md#setNodeTimeSetSystemTime) | **POST** /node?action&#x3D;set_system_time | Set the node system time

<a name="changeNodeMode"></a>
# **changeNodeMode**
> NodeMode changeNodeMode(body)

NodeMode

Currently only a switch from \&quot;VMC_LOCAL\&quot; to \&quot;VMC\&quot; is supported. Returns a new Node Mode, if the request successfuly changed it. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceApi();
SwitchingToVmcModeParameters body = new SwitchingToVmcModeParameters(); // SwitchingToVmcModeParameters | 
try {
    NodeMode result = apiInstance.changeNodeMode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceApi#changeNodeMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SwitchingToVmcModeParameters**](SwitchingToVmcModeParameters.md)|  |

### Return type

[**NodeMode**](NodeMode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeMode"></a>
# **getNodeMode**
> NodeMode getNodeMode()

NodeMode

Returns current Node Mode. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceApi();
try {
    NodeMode result = apiInstance.getNodeMode();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceApi#getNodeMode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeMode**](NodeMode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setNodeTimeSetSystemTime"></a>
# **setNodeTimeSetSystemTime**
> setNodeTimeSetSystemTime(body)

Set the node system time

Set the node system time to the given time in UTC in the RFC3339 format &#x27;yyyy-mm-ddThh:mm:ssZ&#x27;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceApi();
NodeTime body = new NodeTime(); // NodeTime | 
try {
    apiInstance.setNodeTimeSetSystemTime(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceApi#setNodeTimeSetSystemTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeTime**](NodeTime.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

