# IntelligenceClusterNodeVMDeploymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentConfig** | [**IntelligenceClusterNodeVMDeploymentConfig**](IntelligenceClusterNodeVMDeploymentConfig.md) |  | 
**vmId** | **String** | ID of the VM maintained internally. Note: This is automatically generated and cannot be modified.  |  [optional]
**userSettings** | [**NodeUserSettings**](NodeUserSettings.md) |  |  [optional]
**formFactor** | [**FormFactorEnum**](#FormFactorEnum) | Specifies the desired \&quot;size\&quot; of the VM  |  [optional]

<a name="FormFactorEnum"></a>
## Enum: FormFactorEnum
Name | Value
---- | -----
SMALL | &quot;SMALL&quot;
LARGE | &quot;LARGE&quot;
