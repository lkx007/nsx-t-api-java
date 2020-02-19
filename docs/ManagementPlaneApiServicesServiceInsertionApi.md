# ManagementPlaneApiServicesServiceInsertionApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInstanceEndpoint**](ManagementPlaneApiServicesServiceInsertionApi.md#addInstanceEndpoint) | **POST** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-endpoints | Add an InstanceEndpoint for a Service Instance
[**addSIServiceProfile**](ManagementPlaneApiServicesServiceInsertionApi.md#addSIServiceProfile) | **POST** /serviceinsertion/services/{service-id}/service-profiles | Add ServiceProfile for a given Service.
[**addServiceAttachment**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceAttachment) | **POST** /serviceinsertion/service-attachments | Add a Service Attachment.
[**addServiceChain**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceChain) | **POST** /serviceinsertion/service-chains | Add Service Chain
[**addServiceInsertionExcludeListMemberAddMember**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceInsertionExcludeListMemberAddMember) | **POST** /serviceinsertion/excludelist?action&#x3D;add_member | Add a new member in the exclude list
[**addServiceInsertionRuleInSection**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceInsertionRuleInSection) | **POST** /serviceinsertion/sections/{section-id}/rules | Add a Single Rule in a Section
[**addServiceInsertionRulesInSectionCreateMultiple**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceInsertionRulesInSectionCreateMultiple) | **POST** /serviceinsertion/sections/{section-id}/rules?action&#x3D;create_multiple | Add Multiple Rules in a Section
[**addServiceInsertionSection**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceInsertionSection) | **POST** /serviceinsertion/sections | Create a New Empty Section
[**addServiceInsertionSectionWithRulesCreateWithRules**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceInsertionSectionWithRulesCreateWithRules) | **POST** /serviceinsertion/sections?action&#x3D;create_with_rules | Create a Section with Rules
[**addServiceInsertionService**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceInsertionService) | **POST** /serviceinsertion/services | Create a Service-Insertion Service
[**addServiceInstance**](ManagementPlaneApiServicesServiceInsertionApi.md#addServiceInstance) | **POST** /serviceinsertion/services/{service-id}/service-instances | Add a Service Instance for a specified Service.
[**addVendorTemplate**](ManagementPlaneApiServicesServiceInsertionApi.md#addVendorTemplate) | **POST** /serviceinsertion/services/{service-id}/vendor-templates | Add Vendor Template for a given Service
[**createSolutionConfig**](ManagementPlaneApiServicesServiceInsertionApi.md#createSolutionConfig) | **POST** /serviceinsertion/services/{service-id}/solution-configs | Add Solution Config for a given Service
[**deleteInstanceEndpoint**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteInstanceEndpoint) | **DELETE** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-endpoints/{instance-endpoint-id} | Delete a particular InstanceEndpoint.
[**deleteSIServiceProfile**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteSIServiceProfile) | **DELETE** /serviceinsertion/services/{service-id}/service-profiles/{service-profile-id} | Delete a particular ServiceProfile.
[**deleteServiceAttachment**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceAttachment) | **DELETE** /serviceinsertion/service-attachments/{service-attachment-id} | Delete an existing service attachment
[**deleteServiceChain**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceChain) | **DELETE** /serviceinsertion/service-chains/{service-chain-id} | Delete a Service Chain.
[**deleteServiceDeployment**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceDeployment) | **DELETE** /serviceinsertion/services/{service-id}/service-deployments/{service-deployment-id} | Remove service deployment
[**deleteServiceInsertionRule**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceInsertionRule) | **DELETE** /serviceinsertion/sections/{section-id}/rules/{rule-id} | Delete an Existing Rule
[**deleteServiceInsertionSection**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceInsertionSection) | **DELETE** /serviceinsertion/sections/{section-id} | Delete an Existing Section and Its Associated Rules
[**deleteServiceInsertionService**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceInsertionService) | **DELETE** /serviceinsertion/services/{service-id} | Delete an existing Service and the Service-Instance associated with it.
[**deleteServiceInstance**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceInstance) | **DELETE** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id} | Delete an existing Service-Instance
[**deleteServiceManager**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceManager) | **DELETE** /serviceinsertion/service-managers/{service-manager-id} | Delete service manager
[**deleteServiceVMsDelete**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteServiceVMsDelete) | **POST** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-runtimes?action&#x3D;delete | Remove service VMs either as standalone or HA
[**deleteSolutionConfig**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteSolutionConfig) | **DELETE** /serviceinsertion/services/{service-id}/solution-configs/{solution-config-id} | Deletes solution config information.
[**deleteVendorTemplate**](ManagementPlaneApiServicesServiceInsertionApi.md#deleteVendorTemplate) | **DELETE** /serviceinsertion/services/{service-id}/vendor-templates/{vendor-template-id} | Delete a particular vendor tempalte.
[**deployService**](ManagementPlaneApiServicesServiceInsertionApi.md#deployService) | **POST** /serviceinsertion/services/{service-id}/service-deployments | Deploys a particular service
[**deployServiceVMsDeploy**](ManagementPlaneApiServicesServiceInsertionApi.md#deployServiceVMsDeploy) | **POST** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-runtimes?action&#x3D;deploy | Deploy and set up service VMs either as standalone or HA
[**getInstanceEndpoint**](ManagementPlaneApiServicesServiceInsertionApi.md#getInstanceEndpoint) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-endpoints/{instance-endpoint-id} | Get a particular instance endpoint for a service instance.
[**getRuntimeInterfaceOperationalStatus**](ManagementPlaneApiServicesServiceInsertionApi.md#getRuntimeInterfaceOperationalStatus) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-runtimes/{instance-runtime-id}/interfaces/{interface_index}/status | Get operational status for an interface
[**getRuntimeInterfaceStatistics**](ManagementPlaneApiServicesServiceInsertionApi.md#getRuntimeInterfaceStatistics) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-runtimes/{instance-runtime-id}/interfaces/{interface_index}/statistics | Get statistics for a given interface identified by the interface index
[**getSIServiceProfile**](ManagementPlaneApiServicesServiceInsertionApi.md#getSIServiceProfile) | **GET** /serviceinsertion/services/{service-id}/service-profiles/{service-profile-id} | Get a particular ServiceProfile for a Service.
[**getServiceAttachment**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceAttachment) | **GET** /serviceinsertion/service-attachments/{service-attachment-id} | Get a particular service attachment.
[**getServiceChain**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceChain) | **GET** /serviceinsertion/service-chains/{service-chain-id} | Get a particular service chain.
[**getServiceDeployment**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceDeployment) | **GET** /serviceinsertion/services/{service-id}/service-deployments/{service-deployment-id} | Get a particular service deployment.
[**getServiceDeploymentState**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceDeploymentState) | **GET** /serviceinsertion/services/{service-id}/service-deployments/{service-deployment-id}/state | Get Service-Deployment state for Service.
[**getServiceDeploymentStatus**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceDeploymentStatus) | **GET** /serviceinsertion/services/{service-id}/service-deployments/{service-deployment-id}/status | Get a particular service deployment status.
[**getServiceDeployments**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceDeployments) | **GET** /serviceinsertion/services/{service-id}/service-deployments | Get all service deployments for the given service id
[**getServiceInsertionExcludeList**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInsertionExcludeList) | **GET** /serviceinsertion/excludelist | Get list of members in exclude list
[**getServiceInsertionRule**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInsertionRule) | **GET** /serviceinsertion/sections/{section-id}/rules/{rule-id} | Read an Existing Rule
[**getServiceInsertionRules**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInsertionRules) | **GET** /serviceinsertion/sections/{section-id}/rules | Get All the Rules for a Section
[**getServiceInsertionSection**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInsertionSection) | **GET** /serviceinsertion/sections/{section-id} | Get an Existing Section
[**getServiceInsertionSectionWithRulesListWithRules**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInsertionSectionWithRulesListWithRules) | **POST** /serviceinsertion/sections/{section-id}?action&#x3D;list_with_rules | Get an Existing Section, Including Rules
[**getServiceInsertionService**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInsertionService) | **GET** /serviceinsertion/services/{service-id} | Get an existing Service
[**getServiceInsertionStatus**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInsertionStatus) | **GET** /serviceinsertion/status/{context-type} | Get ServiceInsertion global status for a context
[**getServiceInstance**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInstance) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id} | Get Service-Instance for Service.
[**getServiceInstanceNSGroups**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInstanceNSGroups) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/group-associations | Get NSgroups for a given ServiceInstance.
[**getServiceInstanceState**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInstanceState) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/state | Get Service-Instance state for Service.
[**getServiceInstanceStatus**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceInstanceStatus) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/status | Get Service-Instance status for Service.
[**getServiceManager**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceManager) | **GET** /serviceinsertion/service-managers/{service-manager-id} | Get service manager
[**getServiceProfileNSGroups**](ManagementPlaneApiServicesServiceInsertionApi.md#getServiceProfileNSGroups) | **GET** /serviceinsertion/services/{service-id}/service-profiles/{service-profile-id}/nsgroups | Get NSgroups for a given ServiceProfile.
[**getSolutionConfig**](ManagementPlaneApiServicesServiceInsertionApi.md#getSolutionConfig) | **GET** /serviceinsertion/services/{service-id}/solution-configs/{solution-config-id} | Get Solution Config Information for a given solution config id.
[**getVendorTemplate**](ManagementPlaneApiServicesServiceInsertionApi.md#getVendorTemplate) | **GET** /serviceinsertion/services/{service-id}/vendor-templates/{vendor-template-id} | Get a particular vendor template for a given service.
[**listInstanceEndpoints**](ManagementPlaneApiServicesServiceInsertionApi.md#listInstanceEndpoints) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-endpoints | List all InstanceEndpoints of a Service Instance.
[**listInstanceRuntimes**](ManagementPlaneApiServicesServiceInsertionApi.md#listInstanceRuntimes) | **GET** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-runtimes | Returns list of instance runtimes of service VM being deployed
[**listSIServiceProfiles**](ManagementPlaneApiServicesServiceInsertionApi.md#listSIServiceProfiles) | **GET** /serviceinsertion/services/{service-id}/service-profiles | List all Service Profiles of a Service.
[**listServiceAttachments**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceAttachments) | **GET** /serviceinsertion/service-attachments | Get all service attachments.
[**listServiceChainMappings**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceChainMappings) | **GET** /serviceinsertion/services/{service-id}/service-profiles/{service-profile-id}/service-chain-mappings | List all ServiceChainMappings.
[**listServiceChains**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceChains) | **GET** /serviceinsertion/service-chains | List all ServiceChains.
[**listServiceInsertionSections**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceInsertionSections) | **GET** /serviceinsertion/sections | List All Service Insertion Sections
[**listServiceInsertionServices**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceInsertionServices) | **GET** /serviceinsertion/services | List all Service-Insertion Services.
[**listServiceInsertionStatus**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceInsertionStatus) | **GET** /serviceinsertion/status | List all service insertion status for supported contexts
[**listServiceInstances**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceInstances) | **GET** /serviceinsertion/service-instances | Get all Service-Instances present in system
[**listServiceInstancesForService**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceInstancesForService) | **GET** /serviceinsertion/services/{service-id}/service-instances | Get all Service-Instances for Service.
[**listServiceManagers**](ManagementPlaneApiServicesServiceInsertionApi.md#listServiceManagers) | **GET** /serviceinsertion/service-managers | List service managers
[**listServicePaths**](ManagementPlaneApiServicesServiceInsertionApi.md#listServicePaths) | **GET** /serviceinsertion/service-chains/{service-chain-id}/service-paths | List all service paths
[**listSolutionConfigs**](ManagementPlaneApiServicesServiceInsertionApi.md#listSolutionConfigs) | **GET** /serviceinsertion/services/{service-id}/solution-configs | Get Solution Config Information associated with a given service.
[**listVendorTemplates**](ManagementPlaneApiServicesServiceInsertionApi.md#listVendorTemplates) | **GET** /serviceinsertion/services/{service-id}/vendor-templates | List all VendorTemplates of a Service.
[**registerServiceManager**](ManagementPlaneApiServicesServiceInsertionApi.md#registerServiceManager) | **POST** /serviceinsertion/service-managers | Register service manager
[**removeServiceInsertionExcludeListMemberRemoveMember**](ManagementPlaneApiServicesServiceInsertionApi.md#removeServiceInsertionExcludeListMemberRemoveMember) | **POST** /serviceinsertion/excludelist?action&#x3D;remove_member | Remove an existing object from the exclude list
[**resolveSourceEntities**](ManagementPlaneApiServicesServiceInsertionApi.md#resolveSourceEntities) | **GET** /serviceinsertion/source-entities | Resolve &#x27;source node id&#x27; value to source entities.
[**reviseServiceInsertionRuleRevise**](ManagementPlaneApiServicesServiceInsertionApi.md#reviseServiceInsertionRuleRevise) | **POST** /serviceinsertion/sections/{section-id}/rules/{rule-id}?action&#x3D;revise | Update an Existing Rule and Reorder the Rule
[**reviseServiceInsertionSectionRevise**](ManagementPlaneApiServicesServiceInsertionApi.md#reviseServiceInsertionSectionRevise) | **POST** /serviceinsertion/sections/{section-id}?action&#x3D;revise | Update an Existing Section, Including Its Position
[**reviseServiceInsertionSectionWithRulesReviseWithRules**](ManagementPlaneApiServicesServiceInsertionApi.md#reviseServiceInsertionSectionWithRulesReviseWithRules) | **POST** /serviceinsertion/sections/{section-id}?action&#x3D;revise_with_rules | Update an Existing Section with Rules
[**updateServiceDeployment**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceDeployment) | **PUT** /serviceinsertion/services/{service-id}/service-deployments/{service-deployment-id} | Update an existing Service Deployment.
[**updateServiceInsertionExcludeList**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceInsertionExcludeList) | **PUT** /serviceinsertion/excludelist | Modify exclude list
[**updateServiceInsertionRule**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceInsertionRule) | **PUT** /serviceinsertion/sections/{section-id}/rules/{rule-id} | Update an Existing Rule
[**updateServiceInsertionSection**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceInsertionSection) | **PUT** /serviceinsertion/sections/{section-id} | Update an Existing Section
[**updateServiceInsertionSectionWithRulesUpdateWithRules**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceInsertionSectionWithRulesUpdateWithRules) | **POST** /serviceinsertion/sections/{section-id}?action&#x3D;update_with_rules | Update an Existing Section, Including Its Rules
[**updateServiceInsertionService**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceInsertionService) | **PUT** /serviceinsertion/services/{service-id} | Update an existing Service
[**updateServiceInsertionStatus**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceInsertionStatus) | **PUT** /serviceinsertion/status/{context-type} | Update global ServiceInsertion status for a context
[**updateServiceInstance**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceInstance) | **PUT** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id} | Update an existing Service-Instance.
[**updateServiceManager**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceManager) | **PUT** /serviceinsertion/service-managers/{service-manager-id} | Update service manager
[**updateServiceVmState**](ManagementPlaneApiServicesServiceInsertionApi.md#updateServiceVmState) | **POST** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-runtimes/{instance-runtime-id} | Update maintenance mode or runtime state of a service VM
[**updateSolutionConfig**](ManagementPlaneApiServicesServiceInsertionApi.md#updateSolutionConfig) | **PUT** /serviceinsertion/services/{service-id}/solution-configs/{solution-config-id} | Updates Solution Config for a given Service
[**upgradeServiceDeploymentUpgrade**](ManagementPlaneApiServicesServiceInsertionApi.md#upgradeServiceDeploymentUpgrade) | **POST** /serviceinsertion/services/{service-id}/service-deployments/{service-deployment-id}?action&#x3D;upgrade | Upgrade all VMs part of this service deployment using newer version of OVF. It is currently being disabled.
[**upgradeServiceVMsUpgrade**](ManagementPlaneApiServicesServiceInsertionApi.md#upgradeServiceVMsUpgrade) | **POST** /serviceinsertion/services/{service-id}/service-instances/{service-instance-id}/instance-runtimes?action&#x3D;upgrade | Upgrade service VMs using newer version of OVF

<a name="addInstanceEndpoint"></a>
# **addInstanceEndpoint**
> InstanceEndpoint addInstanceEndpoint(body, serviceId, serviceInstanceId)

Add an InstanceEndpoint for a Service Instance

Adds a new instance endpoint. It belongs to one service instance and is attached to one service attachment. It represents a redirection target for a Rule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
InstanceEndpoint body = new InstanceEndpoint(); // InstanceEndpoint | 
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    InstanceEndpoint result = apiInstance.addInstanceEndpoint(body, serviceId, serviceInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addInstanceEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceEndpoint**](InstanceEndpoint.md)|  |
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

[**InstanceEndpoint**](InstanceEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSIServiceProfile"></a>
# **addSIServiceProfile**
> BaseServiceProfile addSIServiceProfile(body, serviceId)

Add ServiceProfile for a given Service.

Adds a new service profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
BaseServiceProfile body = new BaseServiceProfile(); // BaseServiceProfile | 
String serviceId = "serviceId_example"; // String | 
try {
    BaseServiceProfile result = apiInstance.addSIServiceProfile(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addSIServiceProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseServiceProfile**](BaseServiceProfile.md)|  |
 **serviceId** | **String**|  |

### Return type

[**BaseServiceProfile**](BaseServiceProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceAttachment"></a>
# **addServiceAttachment**
> ServiceAttachment addServiceAttachment(body)

Add a Service Attachment.

Adds a new Service attachment. A service attachment represents a point on NSX entity (Example: Logical Router) to which service instance can be connected through an InstanceEndpoint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceAttachment body = new ServiceAttachment(); // ServiceAttachment | 
try {
    ServiceAttachment result = apiInstance.addServiceAttachment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceAttachment**](ServiceAttachment.md)|  |

### Return type

[**ServiceAttachment**](ServiceAttachment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceChain"></a>
# **addServiceChain**
> ServiceChain addServiceChain(body)

Add Service Chain

Adds a new service chain. Service Chains is can contain profile belonging to same or different Service(s). It represents a redirection target for a Rule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceChain body = new ServiceChain(); // ServiceChain | 
try {
    ServiceChain result = apiInstance.addServiceChain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceChain**](ServiceChain.md)|  |

### Return type

[**ServiceChain**](ServiceChain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceInsertionExcludeListMemberAddMember"></a>
# **addServiceInsertionExcludeListMemberAddMember**
> ResourceReference addServiceInsertionExcludeListMemberAddMember(body)

Add a new member in the exclude list

Add a new member in the exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ResourceReference body = new ResourceReference(); // ResourceReference | 
try {
    ResourceReference result = apiInstance.addServiceInsertionExcludeListMemberAddMember(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceInsertionExcludeListMemberAddMember");
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

<a name="addServiceInsertionRuleInSection"></a>
# **addServiceInsertionRuleInSection**
> ServiceInsertionRule addServiceInsertionRuleInSection(body, sectionId, id, operation)

Add a Single Rule in a Section

Adds a new serviceinsertion rule in existing serviceinsertion section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionRule body = new ServiceInsertionRule(); // ServiceInsertionRule | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    ServiceInsertionRule result = apiInstance.addServiceInsertionRuleInSection(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceInsertionRuleInSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionRule**](ServiceInsertionRule.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**ServiceInsertionRule**](ServiceInsertionRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceInsertionRulesInSectionCreateMultiple"></a>
# **addServiceInsertionRulesInSectionCreateMultiple**
> ServiceInsertionRuleList addServiceInsertionRulesInSectionCreateMultiple(body, sectionId, id, operation)

Add Multiple Rules in a Section

Create multiple serviceinsertion rules in existing serviceinsertion section bounded by limit of 1000 serviceinsertion rules per section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionRuleList body = new ServiceInsertionRuleList(); // ServiceInsertionRuleList | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    ServiceInsertionRuleList result = apiInstance.addServiceInsertionRulesInSectionCreateMultiple(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceInsertionRulesInSectionCreateMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionRuleList**](ServiceInsertionRuleList.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**ServiceInsertionRuleList**](ServiceInsertionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceInsertionSection"></a>
# **addServiceInsertionSection**
> ServiceInsertionSection addServiceInsertionSection(body, id, operation)

Create a New Empty Section

Creates new empty Service Insertion section in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionSection body = new ServiceInsertionSection(); // ServiceInsertionSection | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    ServiceInsertionSection result = apiInstance.addServiceInsertionSection(body, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceInsertionSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionSection**](ServiceInsertionSection.md)|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**ServiceInsertionSection**](ServiceInsertionSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceInsertionSectionWithRulesCreateWithRules"></a>
# **addServiceInsertionSectionWithRulesCreateWithRules**
> ServiceInsertionSectionRuleList addServiceInsertionSectionWithRulesCreateWithRules(body, id, operation)

Create a Section with Rules

Creates a new serviceinsertion section with rules. The limit on the number of rules is defined by maxItems in collection types for ServiceInsertionRule (ServiceInsertionRuleXXXList types). When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules are not supported.  Instead, to create sections, use: POST /api/v1/serviceinsertion/sections  To create rules, use: POST /api/v1/serviceinsertion/sections/&amp;lt;section-id&amp;gt;/rules 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionSectionRuleList body = new ServiceInsertionSectionRuleList(); // ServiceInsertionSectionRuleList | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    ServiceInsertionSectionRuleList result = apiInstance.addServiceInsertionSectionWithRulesCreateWithRules(body, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceInsertionSectionWithRulesCreateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionSectionRuleList**](ServiceInsertionSectionRuleList.md)|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**ServiceInsertionSectionRuleList**](ServiceInsertionSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceInsertionService"></a>
# **addServiceInsertionService**
> ServiceDefinition addServiceInsertionService(body)

Create a Service-Insertion Service

Creates new Service-Insertion Service in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceDefinition body = new ServiceDefinition(); // ServiceDefinition | 
try {
    ServiceDefinition result = apiInstance.addServiceInsertionService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceInsertionService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceDefinition**](ServiceDefinition.md)|  |

### Return type

[**ServiceDefinition**](ServiceDefinition.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServiceInstance"></a>
# **addServiceInstance**
> BaseServiceInstance addServiceInstance(body, serviceId)

Add a Service Instance for a specified Service.

Adds a new Service-Instance under the specified Service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
BaseServiceInstance body = new BaseServiceInstance(); // BaseServiceInstance | 
String serviceId = "serviceId_example"; // String | 
try {
    BaseServiceInstance result = apiInstance.addServiceInstance(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addServiceInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseServiceInstance**](BaseServiceInstance.md)|  |
 **serviceId** | **String**|  |

### Return type

[**BaseServiceInstance**](BaseServiceInstance.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVendorTemplate"></a>
# **addVendorTemplate**
> VendorTemplate addVendorTemplate(body, serviceId)

Add Vendor Template for a given Service

Adds a new vendor template. Vendor templates are service level objects, registered to be used in Service Profiles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
VendorTemplate body = new VendorTemplate(); // VendorTemplate | 
String serviceId = "serviceId_example"; // String | 
try {
    VendorTemplate result = apiInstance.addVendorTemplate(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#addVendorTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VendorTemplate**](VendorTemplate.md)|  |
 **serviceId** | **String**|  |

### Return type

[**VendorTemplate**](VendorTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSolutionConfig"></a>
# **createSolutionConfig**
> SolutionConfig createSolutionConfig(body, serviceId)

Add Solution Config for a given Service

Adds a solution config. Solution Config are service level objects, required for configuring the NXGI partner Service after deployment. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
SolutionConfig body = new SolutionConfig(); // SolutionConfig | 
String serviceId = "serviceId_example"; // String | 
try {
    SolutionConfig result = apiInstance.createSolutionConfig(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#createSolutionConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SolutionConfig**](SolutionConfig.md)|  |
 **serviceId** | **String**|  |

### Return type

[**SolutionConfig**](SolutionConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInstanceEndpoint"></a>
# **deleteInstanceEndpoint**
> deleteInstanceEndpoint(serviceId, serviceInstanceId, instanceEndpointId)

Delete a particular InstanceEndpoint.

Delete instance endpoint information for a given instace endpoint. Please make sure to delete all the Service Insertion Rules, which refer to this Endpoint as &#x27;redirect_tos&#x27; target. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
String instanceEndpointId = "instanceEndpointId_example"; // String | 
try {
    apiInstance.deleteInstanceEndpoint(serviceId, serviceInstanceId, instanceEndpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteInstanceEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |
 **instanceEndpointId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSIServiceProfile"></a>
# **deleteSIServiceProfile**
> deleteSIServiceProfile(serviceId, serviceProfileId)

Delete a particular ServiceProfile.

Delete service profile for a given service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceProfileId = "serviceProfileId_example"; // String | 
try {
    apiInstance.deleteSIServiceProfile(serviceId, serviceProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteSIServiceProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceProfileId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServiceAttachment"></a>
# **deleteServiceAttachment**
> deleteServiceAttachment(serviceAttachmentId)

Delete an existing service attachment

Delete existing service attachment from system. Before deletion, please make sure that, no instance endpoints are connected to this attachment. In turn no appliance should be connected to this attachment. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceAttachmentId = "serviceAttachmentId_example"; // String | 
try {
    apiInstance.deleteServiceAttachment(serviceAttachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAttachmentId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServiceChain"></a>
# **deleteServiceChain**
> deleteServiceChain(serviceChainId)

Delete a Service Chain.

Delete a particular service chain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceChainId = "serviceChainId_example"; // String | 
try {
    apiInstance.deleteServiceChain(serviceChainId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceChainId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServiceDeployment"></a>
# **deleteServiceDeployment**
> deleteServiceDeployment(serviceId, serviceDeploymentId, force)

Remove service deployment

Remove the service deployment. Will remove all the Service VMs that were created as part of this deployment. User can send optional force delete option which will force remove the deployment, but should be used only when the regular delete is not working. Regular delete will ensure proper cleanup of Service VMs and related objects. Directly calling this API without trying regular undeploy will result in unexpected results, and orphan objects. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceDeploymentId = "serviceDeploymentId_example"; // String | 
Boolean force = true; // Boolean | Force delete the resource even if it is being used somewhere 
try {
    apiInstance.deleteServiceDeployment(serviceId, serviceDeploymentId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceDeploymentId** | **String**|  |
 **force** | **Boolean**| Force delete the resource even if it is being used somewhere  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServiceInsertionRule"></a>
# **deleteServiceInsertionRule**
> deleteServiceInsertionRule(sectionId, ruleId)

Delete an Existing Rule

Delete existing serviceinsertion rule in a serviceinsertion section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    apiInstance.deleteServiceInsertionRule(sectionId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceInsertionRule");
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

<a name="deleteServiceInsertionSection"></a>
# **deleteServiceInsertionSection**
> deleteServiceInsertionSection(sectionId, cascade)

Delete an Existing Section and Its Associated Rules

Removes serviceinsertion section from the system. ServiceInsertion section with rules can only be deleted by passing \&quot;cascade&#x3D;true\&quot; parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String sectionId = "sectionId_example"; // String | 
Boolean cascade = true; // Boolean | Flag to cascade delete of this object to all it's child objects.
try {
    apiInstance.deleteServiceInsertionSection(sectionId, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceInsertionSection");
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

<a name="deleteServiceInsertionService"></a>
# **deleteServiceInsertionService**
> deleteServiceInsertionService(serviceId, cascade)

Delete an existing Service and the Service-Instance associated with it.

Removes Service-Insertion Service from the system. A Service with Service-Instances can only be deleted by passing \&quot;cascade&#x3D;true\&quot; parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
Boolean cascade = true; // Boolean | Flag to cascade delete all the child objects, associated with it.
try {
    apiInstance.deleteServiceInsertionService(serviceId, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceInsertionService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **cascade** | **Boolean**| Flag to cascade delete all the child objects, associated with it. | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServiceInstance"></a>
# **deleteServiceInstance**
> deleteServiceInstance(serviceId, serviceInstanceId)

Delete an existing Service-Instance

Delete existing Service-Instance for a given Service-Insertion Service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    apiInstance.deleteServiceInstance(serviceId, serviceInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServiceManager"></a>
# **deleteServiceManager**
> deleteServiceManager(serviceManagerId)

Delete service manager

Delete service-manager which is registered with NSX with basic details like name, username, password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceManagerId = "serviceManagerId_example"; // String | 
try {
    apiInstance.deleteServiceManager(serviceManagerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceManagerId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServiceVMsDelete"></a>
# **deleteServiceVMsDelete**
> deleteServiceVMsDelete(serviceId, serviceInstanceId)

Remove service VMs either as standalone or HA

Undeploy one service VM as standalone or two service VMs as HA. Associated deployment information and instance runtime will also be deleted once service VMs have been un-deployed successfully. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    apiInstance.deleteServiceVMsDelete(serviceId, serviceInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteServiceVMsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSolutionConfig"></a>
# **deleteSolutionConfig**
> deleteSolutionConfig(serviceId, solutionConfigId)

Deletes solution config information.

Deletes solution config information for a given service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String solutionConfigId = "solutionConfigId_example"; // String | 
try {
    apiInstance.deleteSolutionConfig(serviceId, solutionConfigId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteSolutionConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **solutionConfigId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVendorTemplate"></a>
# **deleteVendorTemplate**
> deleteVendorTemplate(serviceId, vendorTemplateId)

Delete a particular vendor tempalte.

Delete vendor template information for a given service. Please make sure to delete all the Service Profile(s), which refer to this vendor tempalte before deleting the template itself. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String vendorTemplateId = "vendorTemplateId_example"; // String | 
try {
    apiInstance.deleteVendorTemplate(serviceId, vendorTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deleteVendorTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **vendorTemplateId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deployService"></a>
# **deployService**
> ServiceDeployment deployService(body, serviceId)

Deploys a particular service

This will deploy a particular service on a given cluster / host. Internally multiple service instance can be created during the deployment. If there are no issues in the parameters, the call returns immediately, and the service VMs will be deployed asynchronously. To get the overall status of the deployment or to get the status of individual service vm, please use the deployment status APIs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceDeployment body = new ServiceDeployment(); // ServiceDeployment | 
String serviceId = "serviceId_example"; // String | 
try {
    ServiceDeployment result = apiInstance.deployService(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deployService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceDeployment**](ServiceDeployment.md)|  |
 **serviceId** | **String**|  |

### Return type

[**ServiceDeployment**](ServiceDeployment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deployServiceVMsDeploy"></a>
# **deployServiceVMsDeploy**
> deployServiceVMsDeploy(serviceId, serviceInstanceId)

Deploy and set up service VMs either as standalone or HA

Deploys one service VM as standalone, or two service VMs as HA where one VM is active and another one is standby.  During the deployment of service VMs, service will be set up based on deployment events using callbacks. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    apiInstance.deployServiceVMsDeploy(serviceId, serviceInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#deployServiceVMsDeploy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInstanceEndpoint"></a>
# **getInstanceEndpoint**
> InstanceEndpoint getInstanceEndpoint(serviceId, serviceInstanceId, instanceEndpointId)

Get a particular instance endpoint for a service instance.

Returns detailed Endpoint information for a given InstanceEndpoint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
String instanceEndpointId = "instanceEndpointId_example"; // String | 
try {
    InstanceEndpoint result = apiInstance.getInstanceEndpoint(serviceId, serviceInstanceId, instanceEndpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getInstanceEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |
 **instanceEndpointId** | **String**|  |

### Return type

[**InstanceEndpoint**](InstanceEndpoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRuntimeInterfaceOperationalStatus"></a>
# **getRuntimeInterfaceOperationalStatus**
> RuntimeInterfaceOperationalStatus getRuntimeInterfaceOperationalStatus(serviceId, serviceInstanceId, instanceRuntimeId, interfaceIndex, source)

Get operational status for an interface

Returns operational status of a specified interface

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
String instanceRuntimeId = "instanceRuntimeId_example"; // String | 
String interfaceIndex = "interfaceIndex_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    RuntimeInterfaceOperationalStatus result = apiInstance.getRuntimeInterfaceOperationalStatus(serviceId, serviceInstanceId, instanceRuntimeId, interfaceIndex, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getRuntimeInterfaceOperationalStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |
 **instanceRuntimeId** | **String**|  |
 **interfaceIndex** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**RuntimeInterfaceOperationalStatus**](RuntimeInterfaceOperationalStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRuntimeInterfaceStatistics"></a>
# **getRuntimeInterfaceStatistics**
> RuntimeInterfaceStatistics getRuntimeInterfaceStatistics(serviceId, serviceInstanceId, instanceRuntimeId, interfaceIndex, source)

Get statistics for a given interface identified by the interface index

Returns statistics of a specified interface via associated logical port. If the logical port is attached to a logical router port, query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
String instanceRuntimeId = "instanceRuntimeId_example"; // String | 
String interfaceIndex = "interfaceIndex_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    RuntimeInterfaceStatistics result = apiInstance.getRuntimeInterfaceStatistics(serviceId, serviceInstanceId, instanceRuntimeId, interfaceIndex, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getRuntimeInterfaceStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |
 **instanceRuntimeId** | **String**|  |
 **interfaceIndex** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**RuntimeInterfaceStatistics**](RuntimeInterfaceStatistics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSIServiceProfile"></a>
# **getSIServiceProfile**
> BaseServiceProfile getSIServiceProfile(serviceId, serviceProfileId)

Get a particular ServiceProfile for a Service.

Returns detailed service profile information for a given Service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceProfileId = "serviceProfileId_example"; // String | 
try {
    BaseServiceProfile result = apiInstance.getSIServiceProfile(serviceId, serviceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getSIServiceProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceProfileId** | **String**|  |

### Return type

[**BaseServiceProfile**](BaseServiceProfile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceAttachment"></a>
# **getServiceAttachment**
> ServiceAttachment getServiceAttachment(serviceAttachmentId)

Get a particular service attachment.

Returns detailed Attachment information for a given service attachment. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceAttachmentId = "serviceAttachmentId_example"; // String | 
try {
    ServiceAttachment result = apiInstance.getServiceAttachment(serviceAttachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAttachmentId** | **String**|  |

### Return type

[**ServiceAttachment**](ServiceAttachment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceChain"></a>
# **getServiceChain**
> ServiceChain getServiceChain(serviceChainId)

Get a particular service chain.

Returns detailed service chain information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceChainId = "serviceChainId_example"; // String | 
try {
    ServiceChain result = apiInstance.getServiceChain(serviceChainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceChainId** | **String**|  |

### Return type

[**ServiceChain**](ServiceChain.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceDeployment"></a>
# **getServiceDeployment**
> ServiceDeployment getServiceDeployment(serviceId, serviceDeploymentId)

Get a particular service deployment.

Returns detail of service deployment. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceDeploymentId = "serviceDeploymentId_example"; // String | 
try {
    ServiceDeployment result = apiInstance.getServiceDeployment(serviceId, serviceDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceDeploymentId** | **String**|  |

### Return type

[**ServiceDeployment**](ServiceDeployment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceDeploymentState"></a>
# **getServiceDeploymentState**
> ConfigurationState getServiceDeploymentState(serviceId, serviceDeploymentId)

Get Service-Deployment state for Service.

Returns configuration state of deployed partner service using service insertion framework. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceDeploymentId = "serviceDeploymentId_example"; // String | 
try {
    ConfigurationState result = apiInstance.getServiceDeploymentState(serviceId, serviceDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceDeploymentState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceDeploymentId** | **String**|  |

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceDeploymentStatus"></a>
# **getServiceDeploymentStatus**
> ServiceDeploymentStatus getServiceDeploymentStatus(serviceId, serviceDeploymentId, source)

Get a particular service deployment status.

Returns current status of the deployment of partner service. Available only for EPP Services. By default this API would return cached status. Caching happens every 3 minutes. For realtime status, query parameter \&quot;source&#x3D;realtime\&quot; needs to be passed. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceDeploymentId = "serviceDeploymentId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    ServiceDeploymentStatus result = apiInstance.getServiceDeploymentStatus(serviceId, serviceDeploymentId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceDeploymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceDeploymentId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**ServiceDeploymentStatus**](ServiceDeploymentStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceDeployments"></a>
# **getServiceDeployments**
> ServiceDeploymentListResult getServiceDeployments(serviceId)

Get all service deployments for the given service id

Returns the list of deployments for the given service 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
try {
    ServiceDeploymentListResult result = apiInstance.getServiceDeployments(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceDeployments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**ServiceDeploymentListResult**](ServiceDeploymentListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInsertionExcludeList"></a>
# **getServiceInsertionExcludeList**
> SIExcludeList getServiceInsertionExcludeList()

Get list of members in exclude list

Get list of members in exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
try {
    SIExcludeList result = apiInstance.getServiceInsertionExcludeList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInsertionExcludeList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SIExcludeList**](SIExcludeList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInsertionRule"></a>
# **getServiceInsertionRule**
> ServiceInsertionRule getServiceInsertionRule(sectionId, ruleId)

Read an Existing Rule

Return existing serviceinsertion rule information in a serviceinsertion section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    ServiceInsertionRule result = apiInstance.getServiceInsertionRule(sectionId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInsertionRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**ServiceInsertionRule**](ServiceInsertionRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInsertionRules"></a>
# **getServiceInsertionRules**
> ServiceInsertionRuleListResult getServiceInsertionRules(sectionId, appliedTos, cursor, destinations, filterType, includedFields, pageSize, services, sortAscending, sortBy, sources)

Get All the Rules for a Section

Return all serviceinsertion rule(s) information for a given serviceinsertion section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String sectionId = "sectionId_example"; // String | 
String appliedTos = "appliedTos_example"; // String | AppliedTo's referenced by this section or section's Distributed Service Rules .
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String destinations = "destinations_example"; // String | Destinations referenced by this section's Distributed Service Rules .
String filterType = "filterType_example"; // String | Filter type
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String services = "services_example"; // String | NSService referenced by this section's Distributed Service Rules .
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String sources = "sources_example"; // String | Sources referenced by this section's Distributed Service Rules .
try {
    ServiceInsertionRuleListResult result = apiInstance.getServiceInsertionRules(sectionId, appliedTos, cursor, destinations, filterType, includedFields, pageSize, services, sortAscending, sortBy, sources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInsertionRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |
 **appliedTos** | **String**| AppliedTo&#x27;s referenced by this section or section&#x27;s Distributed Service Rules . | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **destinations** | **String**| Destinations referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **filterType** | **String**| Filter type | [optional] [enum: FILTER, SEARCH]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **services** | **String**| NSService referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **sources** | **String**| Sources referenced by this section&#x27;s Distributed Service Rules . | [optional]

### Return type

[**ServiceInsertionRuleListResult**](ServiceInsertionRuleListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInsertionSection"></a>
# **getServiceInsertionSection**
> ServiceInsertionSection getServiceInsertionSection(sectionId)

Get an Existing Section

Returns information about serviceinsertion section for the identifier. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String sectionId = "sectionId_example"; // String | 
try {
    ServiceInsertionSection result = apiInstance.getServiceInsertionSection(sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInsertionSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |

### Return type

[**ServiceInsertionSection**](ServiceInsertionSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInsertionSectionWithRulesListWithRules"></a>
# **getServiceInsertionSectionWithRulesListWithRules**
> ServiceInsertionSectionRuleList getServiceInsertionSectionWithRulesListWithRules(sectionId)

Get an Existing Section, Including Rules

Returns serviceinsertion section information with rules for a section identifier. When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules are not supported.  Instead, to read serviceinsertion rules, use: GET /api/v1/serviceinsertion/sections/&amp;lt;section-id&amp;gt;/rules with the appropriate page_size. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String sectionId = "sectionId_example"; // String | 
try {
    ServiceInsertionSectionRuleList result = apiInstance.getServiceInsertionSectionWithRulesListWithRules(sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInsertionSectionWithRulesListWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | **String**|  |

### Return type

[**ServiceInsertionSectionRuleList**](ServiceInsertionSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInsertionService"></a>
# **getServiceInsertionService**
> ServiceDefinition getServiceInsertionService(serviceId)

Get an existing Service

Returns information about Service-Insertion Service with the given identifier. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
try {
    ServiceDefinition result = apiInstance.getServiceInsertionService(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInsertionService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**ServiceDefinition**](ServiceDefinition.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInsertionStatus"></a>
# **getServiceInsertionStatus**
> ServiceInsertionStatus getServiceInsertionStatus(contextType)

Get ServiceInsertion global status for a context

Get ServiceInsertion global status for a context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String contextType = "contextType_example"; // String | 
try {
    ServiceInsertionStatus result = apiInstance.getServiceInsertionStatus(contextType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInsertionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextType** | **String**|  |

### Return type

[**ServiceInsertionStatus**](ServiceInsertionStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInstance"></a>
# **getServiceInstance**
> BaseServiceInstance getServiceInstance(serviceId, serviceInstanceId)

Get Service-Instance for Service.

Returns Service-Instance information for a given Service-Insertion Service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    BaseServiceInstance result = apiInstance.getServiceInstance(serviceId, serviceInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

[**BaseServiceInstance**](BaseServiceInstance.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInstanceNSGroups"></a>
# **getServiceInstanceNSGroups**
> ServiceInstanceNSGroups getServiceInstanceNSGroups(serviceId, serviceInstanceId)

Get NSgroups for a given ServiceInstance.

Returns list of NSGroups used in Service Insertion North-South rules for a given Service Instance. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    ServiceInstanceNSGroups result = apiInstance.getServiceInstanceNSGroups(serviceId, serviceInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInstanceNSGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

[**ServiceInstanceNSGroups**](ServiceInstanceNSGroups.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInstanceState"></a>
# **getServiceInstanceState**
> ConfigurationState getServiceInstanceState(serviceId, serviceInstanceId)

Get Service-Instance state for Service.

Returns configuration state of one instance of a deployed partner service using service insertion framework. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    ConfigurationState result = apiInstance.getServiceInstanceState(serviceId, serviceInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInstanceState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInstanceStatus"></a>
# **getServiceInstanceStatus**
> ServiceInstanceStatus getServiceInstanceStatus(serviceId, serviceInstanceId, source)

Get Service-Instance status for Service.

Returns status of one instance of a deployed partner service using service insertion framework. By default this API would return cached status. Caching happens every 3 minutes. For realtime status, query parameter \&quot;source&#x3D;realtime\&quot; needs to be passed. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
String source = "source_example"; // String | Data source type.
try {
    ServiceInstanceStatus result = apiInstance.getServiceInstanceStatus(serviceId, serviceInstanceId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceInstanceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |
 **source** | **String**| Data source type. | [optional] [enum: realtime, cached]

### Return type

[**ServiceInstanceStatus**](ServiceInstanceStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceManager"></a>
# **getServiceManager**
> ServiceManager getServiceManager(serviceManagerId)

Get service manager

Retrieve service-manager details like name, username, password, vendor ID, thumbprint for a given ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceManagerId = "serviceManagerId_example"; // String | 
try {
    ServiceManager result = apiInstance.getServiceManager(serviceManagerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceManagerId** | **String**|  |

### Return type

[**ServiceManager**](ServiceManager.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceProfileNSGroups"></a>
# **getServiceProfileNSGroups**
> ServiceProfileNSGroups getServiceProfileNSGroups(serviceId, serviceProfileId)

Get NSgroups for a given ServiceProfile.

Returns list of NSGroups used in Service Insertion rules for a given Service Profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceProfileId = "serviceProfileId_example"; // String | 
try {
    ServiceProfileNSGroups result = apiInstance.getServiceProfileNSGroups(serviceId, serviceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getServiceProfileNSGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceProfileId** | **String**|  |

### Return type

[**ServiceProfileNSGroups**](ServiceProfileNSGroups.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSolutionConfig"></a>
# **getSolutionConfig**
> SolutionConfig getSolutionConfig(serviceId, solutionConfigId)

Get Solution Config Information for a given solution config id.

Returns Solution Config information for a given solution config id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String solutionConfigId = "solutionConfigId_example"; // String | 
try {
    SolutionConfig result = apiInstance.getSolutionConfig(serviceId, solutionConfigId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getSolutionConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **solutionConfigId** | **String**|  |

### Return type

[**SolutionConfig**](SolutionConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorTemplate"></a>
# **getVendorTemplate**
> VendorTemplate getVendorTemplate(serviceId, vendorTemplateId)

Get a particular vendor template for a given service.

Returns detailed vendor template information for a given service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String vendorTemplateId = "vendorTemplateId_example"; // String | 
try {
    VendorTemplate result = apiInstance.getVendorTemplate(serviceId, vendorTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#getVendorTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **vendorTemplateId** | **String**|  |

### Return type

[**VendorTemplate**](VendorTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInstanceEndpoints"></a>
# **listInstanceEndpoints**
> InstanceEndpointListResult listInstanceEndpoints(serviceId, serviceInstanceId)

List all InstanceEndpoints of a Service Instance.

List all InstanceEndpoints of a service instance. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    InstanceEndpointListResult result = apiInstance.listInstanceEndpoints(serviceId, serviceInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listInstanceEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

[**InstanceEndpointListResult**](InstanceEndpointListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInstanceRuntimes"></a>
# **listInstanceRuntimes**
> InstanceRuntimeListResult listInstanceRuntimes(serviceId, serviceInstanceId)

Returns list of instance runtimes of service VM being deployed

Returns list of instance runtimes of service VMs being deployed for a given service instance id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    InstanceRuntimeListResult result = apiInstance.listInstanceRuntimes(serviceId, serviceInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listInstanceRuntimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

[**InstanceRuntimeListResult**](InstanceRuntimeListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSIServiceProfiles"></a>
# **listSIServiceProfiles**
> SIServiceProfileListResult listSIServiceProfiles(serviceId)

List all Service Profiles of a Service.

List all service profiles of a service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
try {
    SIServiceProfileListResult result = apiInstance.listSIServiceProfiles(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listSIServiceProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**SIServiceProfileListResult**](SIServiceProfileListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceAttachments"></a>
# **listServiceAttachments**
> ServiceAttachmentListResult listServiceAttachments()

Get all service attachments.

Returns all Service-Attachement(s) present in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
try {
    ServiceAttachmentListResult result = apiInstance.listServiceAttachments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceAttachments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceAttachmentListResult**](ServiceAttachmentListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceChainMappings"></a>
# **listServiceChainMappings**
> ServiceChainMappingListResult listServiceChainMappings(serviceId, serviceProfileId)

List all ServiceChainMappings.

List all service chain mappings in the system for the given service profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceProfileId = "serviceProfileId_example"; // String | 
try {
    ServiceChainMappingListResult result = apiInstance.listServiceChainMappings(serviceId, serviceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceChainMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceProfileId** | **String**|  |

### Return type

[**ServiceChainMappingListResult**](ServiceChainMappingListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceChains"></a>
# **listServiceChains**
> ServiceChainListResult listServiceChains()

List all ServiceChains.

List all service chains in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
try {
    ServiceChainListResult result = apiInstance.listServiceChains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceChains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceChainListResult**](ServiceChainListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceInsertionSections"></a>
# **listServiceInsertionSections**
> ServiceInsertionSectionListResult listServiceInsertionSections(appliedTos, cursor, destinations, excludeAppliedToType, filterType, includeAppliedToType, includedFields, pageSize, services, sortAscending, sortBy, sources, type)

List All Service Insertion Sections

List all Service Insertion section in paginated form. A default page size is limited to 1000 sections. By default, the list of section is filtered by L3REDIRECT type. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String appliedTos = "appliedTos_example"; // String | AppliedTo's referenced by this section or section's Distributed Service Rules .
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String destinations = "destinations_example"; // String | Destinations referenced by this section's Distributed Service Rules .
String excludeAppliedToType = "excludeAppliedToType_example"; // String | Resource type valid for use as AppliedTo filter in section API
String filterType = "filterType_example"; // String | Filter type
String includeAppliedToType = "includeAppliedToType_example"; // String | Resource type valid for use as AppliedTo filter in section API
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
String services = "services_example"; // String | NSService referenced by this section's Distributed Service Rules .
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
String sources = "sources_example"; // String | Sources referenced by this section's Distributed Service Rules .
String type = "type_example"; // String | Section Type
try {
    ServiceInsertionSectionListResult result = apiInstance.listServiceInsertionSections(appliedTos, cursor, destinations, excludeAppliedToType, filterType, includeAppliedToType, includedFields, pageSize, services, sortAscending, sortBy, sources, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceInsertionSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appliedTos** | **String**| AppliedTo&#x27;s referenced by this section or section&#x27;s Distributed Service Rules . | [optional]
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **destinations** | **String**| Destinations referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **excludeAppliedToType** | **String**| Resource type valid for use as AppliedTo filter in section API | [optional] [enum: NSGroup, LogicalSwitch, LogicalRouter, LogicalPort]
 **filterType** | **String**| Filter type | [optional] [enum: FILTER, SEARCH]
 **includeAppliedToType** | **String**| Resource type valid for use as AppliedTo filter in section API | [optional] [enum: NSGroup, LogicalSwitch, LogicalRouter, LogicalPort]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **services** | **String**| NSService referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]
 **sources** | **String**| Sources referenced by this section&#x27;s Distributed Service Rules . | [optional]
 **type** | **String**| Section Type | [optional] [enum: L3REDIRECT]

### Return type

[**ServiceInsertionSectionListResult**](ServiceInsertionSectionListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceInsertionServices"></a>
# **listServiceInsertionServices**
> ServiceInsertionServiceListResult listServiceInsertionServices()

List all Service-Insertion Services.

List all Service-Insertion Service Definitions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
try {
    ServiceInsertionServiceListResult result = apiInstance.listServiceInsertionServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceInsertionServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceInsertionServiceListResult**](ServiceInsertionServiceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceInsertionStatus"></a>
# **listServiceInsertionStatus**
> ServiceInsertionStatusListResult listServiceInsertionStatus()

List all service insertion status for supported contexts

List all service insertion status for supported contexts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
try {
    ServiceInsertionStatusListResult result = apiInstance.listServiceInsertionStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceInsertionStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceInsertionStatusListResult**](ServiceInsertionStatusListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceInstances"></a>
# **listServiceInstances**
> ServiceInstanceListResult listServiceInstances(deployedTo, serviceDeploymentId)

Get all Service-Instances present in system

Returns all Service-Instance(s) of all Services present in system. When request parameter (deployed_to or service_deployment_id) is provided as a part of request, it will filter out Service-Instances accordingly. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String deployedTo = "deployedTo_example"; // String | Deployed_to referenced by service instances present in system
String serviceDeploymentId = "serviceDeploymentId_example"; // String | Service Deployment Id using which the instances were deployed
try {
    ServiceInstanceListResult result = apiInstance.listServiceInstances(deployedTo, serviceDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployedTo** | **String**| Deployed_to referenced by service instances present in system | [optional]
 **serviceDeploymentId** | **String**| Service Deployment Id using which the instances were deployed | [optional]

### Return type

[**ServiceInstanceListResult**](ServiceInstanceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceInstancesForService"></a>
# **listServiceInstancesForService**
> ServiceInstanceListResult listServiceInstancesForService(serviceId)

Get all Service-Instances for Service.

Returns all Service-Instance(s) for a given Service-Insertion Service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
try {
    ServiceInstanceListResult result = apiInstance.listServiceInstancesForService(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceInstancesForService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**ServiceInstanceListResult**](ServiceInstanceListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServiceManagers"></a>
# **listServiceManagers**
> ServiceManagerListResult listServiceManagers()

List service managers

List all service managers. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
try {
    ServiceManagerListResult result = apiInstance.listServiceManagers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServiceManagers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceManagerListResult**](ServiceManagerListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServicePaths"></a>
# **listServicePaths**
> ServicePathListResult listServicePaths(serviceChainId, cursor, includedFields, pageSize, sortAscending, sortBy)

List all service paths

List all service paths for the given service chain for the given service chain id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceChainId = "serviceChainId_example"; // String | 
String cursor = "cursor_example"; // String | Opaque cursor to be used for getting next page of records (supplied by current result page)
String includedFields = "includedFields_example"; // String | Comma separated list of fields that should be included in query result
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
Boolean sortAscending = true; // Boolean | 
String sortBy = "sortBy_example"; // String | Field by which records are sorted
try {
    ServicePathListResult result = apiInstance.listServicePaths(serviceChainId, cursor, includedFields, pageSize, sortAscending, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listServicePaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceChainId** | **String**|  |
 **cursor** | **String**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **includedFields** | **String**| Comma separated list of fields that should be included in query result | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]
 **sortAscending** | **Boolean**|  | [optional]
 **sortBy** | **String**| Field by which records are sorted | [optional]

### Return type

[**ServicePathListResult**](ServicePathListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSolutionConfigs"></a>
# **listSolutionConfigs**
> SolutionConfigListResult listSolutionConfigs(serviceId)

Get Solution Config Information associated with a given service.

Returns Solution Config information for a given service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
try {
    SolutionConfigListResult result = apiInstance.listSolutionConfigs(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listSolutionConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |

### Return type

[**SolutionConfigListResult**](SolutionConfigListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVendorTemplates"></a>
# **listVendorTemplates**
> VendorTemplateListResult listVendorTemplates(serviceId, vendorTemplateName)

List all VendorTemplates of a Service.

List all vendor templates of a service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String vendorTemplateName = "vendorTemplateName_example"; // String | Name of vendor template
try {
    VendorTemplateListResult result = apiInstance.listVendorTemplates(serviceId, vendorTemplateName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#listVendorTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **vendorTemplateName** | **String**| Name of vendor template | [optional]

### Return type

[**VendorTemplateListResult**](VendorTemplateListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerServiceManager"></a>
# **registerServiceManager**
> ServiceManager registerServiceManager(body)

Register service manager

Register service-manager with NSX with basic details like name, username, password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceManager body = new ServiceManager(); // ServiceManager | 
try {
    ServiceManager result = apiInstance.registerServiceManager(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#registerServiceManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceManager**](ServiceManager.md)|  |

### Return type

[**ServiceManager**](ServiceManager.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeServiceInsertionExcludeListMemberRemoveMember"></a>
# **removeServiceInsertionExcludeListMemberRemoveMember**
> ResourceReference removeServiceInsertionExcludeListMemberRemoveMember(objectId)

Remove an existing object from the exclude list

Remove an existing object from the exclude list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String objectId = "objectId_example"; // String | Identifier of the object
try {
    ResourceReference result = apiInstance.removeServiceInsertionExcludeListMemberRemoveMember(objectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#removeServiceInsertionExcludeListMemberRemoveMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| Identifier of the object |

### Return type

[**ResourceReference**](ResourceReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resolveSourceEntities"></a>
# **resolveSourceEntities**
> SourceEntityResult resolveSourceEntities(sourceNodeValue)

Resolve &#x27;source node id&#x27; value to source entities.

Service insertion data path inserts unique &#x27;source node id&#x27; value into each packet. This API can be used to identify the source of the packet using this value. It can be resolved to multiple source entities. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String sourceNodeValue = "sourceNodeValue_example"; // String | value
try {
    SourceEntityResult result = apiInstance.resolveSourceEntities(sourceNodeValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#resolveSourceEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceNodeValue** | **String**| value |

### Return type

[**SourceEntityResult**](SourceEntityResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reviseServiceInsertionRuleRevise"></a>
# **reviseServiceInsertionRuleRevise**
> ServiceInsertionRule reviseServiceInsertionRuleRevise(body, sectionId, ruleId, id, operation)

Update an Existing Rule and Reorder the Rule

Modifies existing serviceinsertion rule along with relative position among other serviceinsertion rules inside a serviceinsertion section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionRule body = new ServiceInsertionRule(); // ServiceInsertionRule | 
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    ServiceInsertionRule result = apiInstance.reviseServiceInsertionRuleRevise(body, sectionId, ruleId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#reviseServiceInsertionRuleRevise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionRule**](ServiceInsertionRule.md)|  |
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**ServiceInsertionRule**](ServiceInsertionRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reviseServiceInsertionSectionRevise"></a>
# **reviseServiceInsertionSectionRevise**
> ServiceInsertionSection reviseServiceInsertionSectionRevise(body, sectionId, id, operation)

Update an Existing Section, Including Its Position

Modifies an existing serviceinsertion section along with its relative position among other serviceinsertion sections in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionSection body = new ServiceInsertionSection(); // ServiceInsertionSection | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    ServiceInsertionSection result = apiInstance.reviseServiceInsertionSectionRevise(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#reviseServiceInsertionSectionRevise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionSection**](ServiceInsertionSection.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**ServiceInsertionSection**](ServiceInsertionSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reviseServiceInsertionSectionWithRulesReviseWithRules"></a>
# **reviseServiceInsertionSectionWithRulesReviseWithRules**
> ServiceInsertionSectionRuleList reviseServiceInsertionSectionWithRulesReviseWithRules(body, sectionId, id, operation)

Update an Existing Section with Rules

Modifies an existing serviceinsertion section along with its relative position among other serviceinsertion sections with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to move a section above or below another section, use: POST /api/v1/serviceinsertion/sections/&amp;lt;section-id&amp;gt;?action&#x3D;revise  To modify rules, use: PUT /api/v1/serviceinsertion/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionSectionRuleList body = new ServiceInsertionSectionRuleList(); // ServiceInsertionSectionRuleList | 
String sectionId = "sectionId_example"; // String | 
String id = "id_example"; // String | Identifier of the anchor rule or section. This is a required field in case operation like 'insert_before' and 'insert_after'.
String operation = "operation_example"; // String | Operation
try {
    ServiceInsertionSectionRuleList result = apiInstance.reviseServiceInsertionSectionWithRulesReviseWithRules(body, sectionId, id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#reviseServiceInsertionSectionWithRulesReviseWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionSectionRuleList**](ServiceInsertionSectionRuleList.md)|  |
 **sectionId** | **String**|  |
 **id** | **String**| Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. | [optional]
 **operation** | **String**| Operation | [optional] [enum: insert_top, insert_bottom, insert_after, insert_before]

### Return type

[**ServiceInsertionSectionRuleList**](ServiceInsertionSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceDeployment"></a>
# **updateServiceDeployment**
> ServiceDeployment updateServiceDeployment(body, serviceId, serviceDeploymentId)

Update an existing Service Deployment.

Modifies an existing Service Deployment. This will not update the already deployed service instances, deployed via this deployment. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceDeployment body = new ServiceDeployment(); // ServiceDeployment | 
String serviceId = "serviceId_example"; // String | 
String serviceDeploymentId = "serviceDeploymentId_example"; // String | 
try {
    ServiceDeployment result = apiInstance.updateServiceDeployment(body, serviceId, serviceDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceDeployment**](ServiceDeployment.md)|  |
 **serviceId** | **String**|  |
 **serviceDeploymentId** | **String**|  |

### Return type

[**ServiceDeployment**](ServiceDeployment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceInsertionExcludeList"></a>
# **updateServiceInsertionExcludeList**
> SIExcludeList updateServiceInsertionExcludeList(body)

Modify exclude list

Modify exclude list. This includes adding/removing members in the list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
SIExcludeList body = new SIExcludeList(); // SIExcludeList | 
try {
    SIExcludeList result = apiInstance.updateServiceInsertionExcludeList(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceInsertionExcludeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SIExcludeList**](SIExcludeList.md)|  |

### Return type

[**SIExcludeList**](SIExcludeList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceInsertionRule"></a>
# **updateServiceInsertionRule**
> ServiceInsertionRule updateServiceInsertionRule(body, sectionId, ruleId)

Update an Existing Rule

Modifies existing serviceinsertion rule in a serviceinsertion section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionRule body = new ServiceInsertionRule(); // ServiceInsertionRule | 
String sectionId = "sectionId_example"; // String | 
String ruleId = "ruleId_example"; // String | 
try {
    ServiceInsertionRule result = apiInstance.updateServiceInsertionRule(body, sectionId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceInsertionRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionRule**](ServiceInsertionRule.md)|  |
 **sectionId** | **String**|  |
 **ruleId** | **String**|  |

### Return type

[**ServiceInsertionRule**](ServiceInsertionRule.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceInsertionSection"></a>
# **updateServiceInsertionSection**
> ServiceInsertionSection updateServiceInsertionSection(body, sectionId)

Update an Existing Section

Modifies the specified section, but does not modify the section&#x27;s associated rules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionSection body = new ServiceInsertionSection(); // ServiceInsertionSection | 
String sectionId = "sectionId_example"; // String | 
try {
    ServiceInsertionSection result = apiInstance.updateServiceInsertionSection(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceInsertionSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionSection**](ServiceInsertionSection.md)|  |
 **sectionId** | **String**|  |

### Return type

[**ServiceInsertionSection**](ServiceInsertionSection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceInsertionSectionWithRulesUpdateWithRules"></a>
# **updateServiceInsertionSectionWithRulesUpdateWithRules**
> ServiceInsertionSectionRuleList updateServiceInsertionSectionWithRulesUpdateWithRules(body, sectionId)

Update an Existing Section, Including Its Rules

Modifies existing serviceinsertion section along with its association with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to update rule content, use: PUT /api/v1/serviceinsertion/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionSectionRuleList body = new ServiceInsertionSectionRuleList(); // ServiceInsertionSectionRuleList | 
String sectionId = "sectionId_example"; // String | 
try {
    ServiceInsertionSectionRuleList result = apiInstance.updateServiceInsertionSectionWithRulesUpdateWithRules(body, sectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceInsertionSectionWithRulesUpdateWithRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionSectionRuleList**](ServiceInsertionSectionRuleList.md)|  |
 **sectionId** | **String**|  |

### Return type

[**ServiceInsertionSectionRuleList**](ServiceInsertionSectionRuleList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceInsertionService"></a>
# **updateServiceInsertionService**
> ServiceDefinition updateServiceInsertionService(body, serviceId)

Update an existing Service

Modifies the specified Service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceDefinition body = new ServiceDefinition(); // ServiceDefinition | 
String serviceId = "serviceId_example"; // String | 
try {
    ServiceDefinition result = apiInstance.updateServiceInsertionService(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceInsertionService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceDefinition**](ServiceDefinition.md)|  |
 **serviceId** | **String**|  |

### Return type

[**ServiceDefinition**](ServiceDefinition.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceInsertionStatus"></a>
# **updateServiceInsertionStatus**
> ServiceInsertionStatus updateServiceInsertionStatus(body, contextType)

Update global ServiceInsertion status for a context

Update global ServiceInsertion status for a context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceInsertionStatus body = new ServiceInsertionStatus(); // ServiceInsertionStatus | 
String contextType = "contextType_example"; // String | 
try {
    ServiceInsertionStatus result = apiInstance.updateServiceInsertionStatus(body, contextType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceInsertionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInsertionStatus**](ServiceInsertionStatus.md)|  |
 **contextType** | **String**|  |

### Return type

[**ServiceInsertionStatus**](ServiceInsertionStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceInstance"></a>
# **updateServiceInstance**
> BaseServiceInstance updateServiceInstance(body, serviceId, serviceInstanceId)

Update an existing Service-Instance.

Modifies an existing Service-Instance for a given Service-Insertion Service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
BaseServiceInstance body = new BaseServiceInstance(); // BaseServiceInstance | 
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    BaseServiceInstance result = apiInstance.updateServiceInstance(body, serviceId, serviceInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseServiceInstance**](BaseServiceInstance.md)|  |
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

[**BaseServiceInstance**](BaseServiceInstance.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceManager"></a>
# **updateServiceManager**
> ServiceManager updateServiceManager(body, serviceManagerId)

Update service manager

Update service-manager which is registered with NSX with basic details like name, username, password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
ServiceManager body = new ServiceManager(); // ServiceManager | 
String serviceManagerId = "serviceManagerId_example"; // String | 
try {
    ServiceManager result = apiInstance.updateServiceManager(body, serviceManagerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceManager**](ServiceManager.md)|  |
 **serviceManagerId** | **String**|  |

### Return type

[**ServiceManager**](ServiceManager.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceVmState"></a>
# **updateServiceVmState**
> updateServiceVmState(serviceId, serviceInstanceId, instanceRuntimeId, action, unhealthyReason)

Update maintenance mode or runtime state of a service VM

Set service VM either in or out of maintenance mode for maintenance mode, or in service or out of service for runtime state. Only one value can be set at one time. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
String instanceRuntimeId = "instanceRuntimeId_example"; // String | 
String action = "action_example"; // String | 
String unhealthyReason = "unhealthyReason_example"; // String | Reason for the unhealthy state
try {
    apiInstance.updateServiceVmState(serviceId, serviceInstanceId, instanceRuntimeId, action, unhealthyReason);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateServiceVmState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |
 **instanceRuntimeId** | **String**|  |
 **action** | **String**|  | [optional] [enum: enable_maintenance_mode, disable_maintenance_mode, is_healthy, is_stopped, is_not_responding]
 **unhealthyReason** | **String**| Reason for the unhealthy state | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSolutionConfig"></a>
# **updateSolutionConfig**
> SolutionConfig updateSolutionConfig(body, serviceId, solutionConfigId)

Updates Solution Config for a given Service

Updates a solution config. Solution Config are service level objects, required for configuring the NXGI partner Service after deployment. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
SolutionConfig body = new SolutionConfig(); // SolutionConfig | 
String serviceId = "serviceId_example"; // String | 
String solutionConfigId = "solutionConfigId_example"; // String | 
try {
    SolutionConfig result = apiInstance.updateSolutionConfig(body, serviceId, solutionConfigId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#updateSolutionConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SolutionConfig**](SolutionConfig.md)|  |
 **serviceId** | **String**|  |
 **solutionConfigId** | **String**|  |

### Return type

[**SolutionConfig**](SolutionConfig.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="upgradeServiceDeploymentUpgrade"></a>
# **upgradeServiceDeploymentUpgrade**
> upgradeServiceDeploymentUpgrade(serviceId, serviceDeploymentId)

Upgrade all VMs part of this service deployment using newer version of OVF. It is currently being disabled.

Upgrade API is currently disabled. Please refer to vendor documentation on how to upgrade individual appliances. Upgrade all VMs part of this service deployment using newer version of OVF. New OVF version isn&#x27;t expected in this call because it is published by the partner by updating the service definition. This API simply upgrades to the latest version published by the partner. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceDeploymentId = "serviceDeploymentId_example"; // String | 
try {
    apiInstance.upgradeServiceDeploymentUpgrade(serviceId, serviceDeploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#upgradeServiceDeploymentUpgrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceDeploymentId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="upgradeServiceVMsUpgrade"></a>
# **upgradeServiceVMsUpgrade**
> upgradeServiceVMsUpgrade(serviceId, serviceInstanceId)

Upgrade service VMs using newer version of OVF

Upgrade service VMs using newer version of OVF.  In case of HA, the stand-by service VM will be upgrade first. Once it has been upgraded, it switches to be the Active one and then the other VM will be upgrade. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiServicesServiceInsertionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiServicesServiceInsertionApi apiInstance = new ManagementPlaneApiServicesServiceInsertionApi();
String serviceId = "serviceId_example"; // String | 
String serviceInstanceId = "serviceInstanceId_example"; // String | 
try {
    apiInstance.upgradeServiceVMsUpgrade(serviceId, serviceInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiServicesServiceInsertionApi#upgradeServiceVMsUpgrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**|  |
 **serviceInstanceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

