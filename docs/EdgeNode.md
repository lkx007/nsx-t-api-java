# EdgeNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeSettings** | [**EdgeNodeSettings**](EdgeNodeSettings.md) |  |  [optional]
**deploymentConfig** | [**EdgeNodeDeploymentConfig**](EdgeNodeDeploymentConfig.md) |  |  [optional]
**allocationList** | **List&lt;String&gt;** | List of logical router ids to which this edge node is allocated. |  [optional]
**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | Supported edge deployment type. |  [optional]

<a name="DeploymentTypeEnum"></a>
## Enum: DeploymentTypeEnum
Name | Value
---- | -----
VIRTUAL_MACHINE | &quot;VIRTUAL_MACHINE&quot;
PHYSICAL_MACHINE | &quot;PHYSICAL_MACHINE&quot;
UNKNOWN | &quot;UNKNOWN&quot;
