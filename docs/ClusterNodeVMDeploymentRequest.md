# ClusterNodeVMDeploymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentConfig** | [**ClusterNodeVMDeploymentConfig**](ClusterNodeVMDeploymentConfig.md) |  | 
**vmId** | **String** | ID of the VM maintained internally and used to recognize it. Note: This is automatically generated and cannot be modified.  |  [optional]
**userSettings** | [**NodeUserSettings**](NodeUserSettings.md) |  |  [optional]
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) | List of cluster node role (or roles) which the VM should take on. They specify what type (or types) of cluster node which the new VM should act as. Currently both CONTROLLER and MANAGER must be provided, since this permutation is the only one supported now.  | 
**formFactor** | [**FormFactorEnum**](#FormFactorEnum) | Specifies the desired \&quot;size\&quot; of the VM  |  [optional]

<a name="List<RolesEnum>"></a>
## Enum: List&lt;RolesEnum&gt;
Name | Value
---- | -----
CONTROLLER | &quot;CONTROLLER&quot;
MANAGER | &quot;MANAGER&quot;

<a name="FormFactorEnum"></a>
## Enum: FormFactorEnum
Name | Value
---- | -----
SMALL | &quot;SMALL&quot;
MEDIUM | &quot;MEDIUM&quot;
LARGE | &quot;LARGE&quot;
