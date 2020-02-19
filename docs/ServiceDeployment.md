# ServiceDeployment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**perimeter** | [**PerimeterEnum**](#PerimeterEnum) | This indicates the deployment perimeter, such as a VC cluster or a host. |  [optional]
**deploymentSpecName** | **String** | Name of the deployment spec to be used for deployment, which specifies the OVF provided by the partner and the form factor. | 
**deploymentMode** | [**DeploymentModeEnum**](#DeploymentModeEnum) | Mode of deployment. Currently, only stand alone deployment is supported. It is a single VM deployed through this deployment spec. In future, HA configurations will be supported here. |  [optional]
**instanceDeploymentTemplate** | [**DeploymentTemplate**](DeploymentTemplate.md) |  | 
**serviceDeploymentConfig** | [**ServiceDeploymentConfig**](ServiceDeploymentConfig.md) |  | 
**serviceId** | **String** | The Service to which the service deployment is associated. |  [optional]
**clusteredDeploymentCount** | **Long** | Number of instances in case of clustered deployment. |  [optional]
**deployedTo** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of resource references where service instance be deployed. Ex. Tier 0 Logical Router in case of N-S ServiceInsertion. Service Attachment in case of E-W ServiceInsertion. |  [optional]
**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | Specifies whether the service VM should be deployed on each host such that it provides partner service locally on the host, or whether the service VMs can be deployed as a cluster. If deployment_type is CLUSTERED, then the clustered_deployment_count should be provided. |  [optional]

<a name="PerimeterEnum"></a>
## Enum: PerimeterEnum
Name | Value
---- | -----
CLUSTER | &quot;CLUSTER&quot;
HOST | &quot;HOST&quot;

<a name="DeploymentModeEnum"></a>
## Enum: DeploymentModeEnum
Name | Value
---- | -----
STAND_ALONE | &quot;STAND_ALONE&quot;
ACTIVE_STANDBY | &quot;ACTIVE_STANDBY&quot;

<a name="DeploymentTypeEnum"></a>
## Enum: DeploymentTypeEnum
Name | Value
---- | -----
HOSTLOCAL | &quot;HOSTLOCAL&quot;
CLUSTERED | &quot;CLUSTERED&quot;
