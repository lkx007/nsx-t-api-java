# ServiceInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentSpecName** | **String** | Name of the deployment spec to be used by this service instance. | 
**instanceDeploymentTemplate** | [**DeploymentTemplate**](DeploymentTemplate.md) |  | 
**implementationType** | [**ImplementationTypeEnum**](#ImplementationTypeEnum) | Implementation to be used by this service instance for deploying the Service-VM. | 
**attachmentPoint** | [**AttachmentPointEnum**](#AttachmentPointEnum) | Attachment point to be used by this service instance for deploying the Service-VM. | 
**instanceDeploymentConfig** | [**InstanceDeploymentConfig**](InstanceDeploymentConfig.md) |  |  [optional]
**deploymentMode** | [**DeploymentModeEnum**](#DeploymentModeEnum) | Deployment mode specifies where the partner appliance will be deployed in HA or non-HA i.e standalone mode. | 
**deployedTo** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of resource references where service instance be deployed. Ex. Tier 0 Logical Router in case of N-S ServiceInsertion. | 
**serviceDeploymentId** | **String** | Id of the Service Deployment using which the instances were deployed. Its available only for instances that were deployed using service deployment API. |  [optional]

<a name="ImplementationTypeEnum"></a>
## Enum: ImplementationTypeEnum
Name | Value
---- | -----
NORTH_SOUTH | &quot;NORTH_SOUTH&quot;
EAST_WEST | &quot;EAST_WEST&quot;

<a name="AttachmentPointEnum"></a>
## Enum: AttachmentPointEnum
Name | Value
---- | -----
TIER0_LR | &quot;TIER0_LR&quot;
TIER1_LR | &quot;TIER1_LR&quot;
SERVICE_PLANE | &quot;SERVICE_PLANE&quot;
HOST | &quot;HOST&quot;

<a name="DeploymentModeEnum"></a>
## Enum: DeploymentModeEnum
Name | Value
---- | -----
STAND_ALONE | &quot;STAND_ALONE&quot;
ACTIVE_STANDBY | &quot;ACTIVE_STANDBY&quot;
