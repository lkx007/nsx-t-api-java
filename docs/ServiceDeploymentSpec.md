# ServiceDeploymentSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentSpecs** | [**List&lt;SVMDeploymentSpec&gt;**](SVMDeploymentSpec.md) | Deployment Specs holds information required to deploy the Service-VMs. i.e. OVF url where the partner Service-VM OVF is hosted. The host type on which the OVF can be deployed, Form factor to name a few. |  [optional]
**nicMetadataList** | [**List&lt;NicMetadata&gt;**](NicMetadata.md) | NIC metadata associated with the deployment spec. |  [optional]
**deploymentTemplate** | [**List&lt;DeploymentTemplate&gt;**](DeploymentTemplate.md) | Deployment Template holds the attributes specific to partner for which the service is created. These attributes are opaque to NSX Manager. | 
**svmVersion** | **String** | Partner needs to specify the Service VM version which will get deployed. Modification of this field would notify administrators that new upgrade is available. |  [optional]
