# InstanceRuntime

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceVmId** | **String** | Service-VM/SVM id of deployed virtual-machine. |  [optional]
**deploymentStatus** | [**DeploymentStatusEnum**](#DeploymentStatusEnum) | Service-Instance Runtime deployment status of the Service-VM. It shows the latest status during the process of deployment, redeploy, upgrade, and un-deployment of VM. |  [optional]
**vmNicInfo** | [**VmNicInfo**](VmNicInfo.md) |  |  [optional]
**maintenanceMode** | [**MaintenanceModeEnum**](#MaintenanceModeEnum) | The maintenance mode indicates whether the corresponding service VM is in maintenance mode. The service VM will not be used to service new requests if it is in maintenance mode.  |  [optional]
**runtimeStatus** | [**RuntimeStatusEnum**](#RuntimeStatusEnum) | Service-Instance Runtime status of the deployed Service-VM. |  [optional]
**errorMessage** | **String** | Error message for the Service Instance Runtime if any. |  [optional]
**serviceInstanceId** | **String** | Id of an instantiation of a registered service. |  [optional]
**runtimeHealthStatusByPartner** | [**RuntimeHealthStatusByPartnerEnum**](#RuntimeHealthStatusByPartnerEnum) | Service-Instance runtime health status set by partner to indicate whether the service is running properly or not.  |  [optional]
**unhealthyReason** | **String** | Reason provided by partner for the service being unhealthy. This could be due to various reasons such as connectivity lost as an example.  |  [optional]

<a name="DeploymentStatusEnum"></a>
## Enum: DeploymentStatusEnum
Name | Value
---- | -----
DEPLOYMENT_IN_PROGRESS | &quot;DEPLOYMENT_IN_PROGRESS&quot;
DEPLOYMENT_FAILED | &quot;DEPLOYMENT_FAILED&quot;
DEPLOYMENT_SUCCESSFUL | &quot;DEPLOYMENT_SUCCESSFUL&quot;
UPGRADE_IN_PROGRESS | &quot;UPGRADE_IN_PROGRESS&quot;
UPGRADE_FAILED | &quot;UPGRADE_FAILED&quot;
UNDEPLOYMENT_IN_PROGRESS | &quot;UNDEPLOYMENT_IN_PROGRESS&quot;
UNDEPLOYMENT_FAILED | &quot;UNDEPLOYMENT_FAILED&quot;
UNDEPLOYMENT_SUCCESSFUL | &quot;UNDEPLOYMENT_SUCCESSFUL&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="MaintenanceModeEnum"></a>
## Enum: MaintenanceModeEnum
Name | Value
---- | -----
OFF | &quot;OFF&quot;
ENTERING | &quot;ENTERING&quot;
ON | &quot;ON&quot;
EXITING | &quot;EXITING&quot;

<a name="RuntimeStatusEnum"></a>
## Enum: RuntimeStatusEnum
Name | Value
---- | -----
IN_SERVICE | &quot;IN_SERVICE&quot;
OUT_OF_SERVICE | &quot;OUT_OF_SERVICE&quot;
NEEDS_ATTENTION | &quot;NEEDS_ATTENTION&quot;
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;

<a name="RuntimeHealthStatusByPartnerEnum"></a>
## Enum: RuntimeHealthStatusByPartnerEnum
Name | Value
---- | -----
HEALTHY | &quot;HEALTHY&quot;
STOPPED | &quot;STOPPED&quot;
NOT_RESPONDING | &quot;NOT_RESPONDING&quot;
