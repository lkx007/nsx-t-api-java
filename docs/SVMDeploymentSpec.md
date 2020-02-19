# SVMDeploymentSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minHostVersion** | **String** | Minimum host version supported by this ovf. If a host in the deployment cluster is having version less than this, then service deployment will not happen on that host. |  [optional]
**ovfUrl** | **String** | Location of the partner VM OVF to be deployed. | 
**serviceFormFactor** | [**ServiceFormFactorEnum**](#ServiceFormFactorEnum) | Supported ServiceInsertion Form Factor for the OVF deployment. The default FormFactor is Medium. |  [optional]
**hostType** | [**HostTypeEnum**](#HostTypeEnum) | Host Type on which the specified OVF can be deployed. | 
**name** | **String** | Deployment Spec name for ease of use, since multiple DeploymentSpec can be specified. |  [optional]

<a name="ServiceFormFactorEnum"></a>
## Enum: ServiceFormFactorEnum
Name | Value
---- | -----
SMALL | &quot;SMALL&quot;
MEDIUM | &quot;MEDIUM&quot;
LARGE | &quot;LARGE&quot;

<a name="HostTypeEnum"></a>
## Enum: HostTypeEnum
Name | Value
---- | -----
ESXI | &quot;ESXI&quot;
RHELKVM | &quot;RHELKVM&quot;
UBUNTUKVM | &quot;UBUNTUKVM&quot;
