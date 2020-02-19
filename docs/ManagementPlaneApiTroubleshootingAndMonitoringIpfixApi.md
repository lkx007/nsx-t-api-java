# ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIpfixObsPoints**](ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi.md#getIpfixObsPoints) | **GET** /ipfix-obs-points | Get the list of IPFIX observation points
[**getSwitchIpfixConfig**](ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi.md#getSwitchIpfixConfig) | **GET** /ipfix-obs-points/switch-global | Read global switch IPFIX export configuration
[**updateSwitchIpfixConfig**](ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi.md#updateSwitchIpfixConfig) | **PUT** /ipfix-obs-points/switch-global | Update global switch IPFIX export configuration

<a name="getIpfixObsPoints"></a>
# **getIpfixObsPoints**
> IpfixObsPointsListResult getIpfixObsPoints()

Get the list of IPFIX observation points

Deprecated - Please use /ipfix-profiles for switch IPFIX profile and /ipfix-collector-profiles for IPFIX collector profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi();
try {
    IpfixObsPointsListResult result = apiInstance.getIpfixObsPoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi#getIpfixObsPoints");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IpfixObsPointsListResult**](IpfixObsPointsListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSwitchIpfixConfig"></a>
# **getSwitchIpfixConfig**
> IpfixObsPointConfig getSwitchIpfixConfig()

Read global switch IPFIX export configuration

Deprecated - Please use /ipfix-profiles/&lt;ipfix-profile-id&gt; for switch IPFIX profile and /ipfix-collector-profiles/&lt;ipfix-collector-profile-id&gt; for IPFIX collector profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi();
try {
    IpfixObsPointConfig result = apiInstance.getSwitchIpfixConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi#getSwitchIpfixConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IpfixObsPointConfig**](IpfixObsPointConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSwitchIpfixConfig"></a>
# **updateSwitchIpfixConfig**
> IpfixObsPointConfig updateSwitchIpfixConfig(body)

Update global switch IPFIX export configuration

Deprecated - Please use /ipfix-profiles/&lt;ipfix-profile-id&gt; for switch IPFIX profile and /ipfix-collector-profiles/&lt;ipfix-collector-profile-id&gt; for IPFIX collector profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi apiInstance = new ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi();
IpfixObsPointConfig body = new IpfixObsPointConfig(); // IpfixObsPointConfig | 
try {
    IpfixObsPointConfig result = apiInstance.updateSwitchIpfixConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiTroubleshootingAndMonitoringIpfixApi#updateSwitchIpfixConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpfixObsPointConfig**](IpfixObsPointConfig.md)|  |

### Return type

[**IpfixObsPointConfig**](IpfixObsPointConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

