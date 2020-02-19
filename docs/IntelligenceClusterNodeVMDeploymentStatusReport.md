# IntelligenceClusterNodeVMDeploymentStatusReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the addition or deletion of an auto-deployed NSX-Intelligence cluster node VM.  | 
**failureMessage** | **String** | In case of auto-deployment-related failure, an error message will be stored here.  |  [optional]
**failureCode** | **Long** | In case of auto-deployment-related failure, the code for the error will be stored here.  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;
VM_DEPLOYMENT_QUEUED | &quot;VM_DEPLOYMENT_QUEUED&quot;
VM_DEPLOYMENT_IN_PROGRESS | &quot;VM_DEPLOYMENT_IN_PROGRESS&quot;
VM_DEPLOYMENT_FAILED | &quot;VM_DEPLOYMENT_FAILED&quot;
VM_POWER_ON_IN_PROGRESS | &quot;VM_POWER_ON_IN_PROGRESS&quot;
VM_POWER_ON_FAILED | &quot;VM_POWER_ON_FAILED&quot;
VM_POWER_ON_SUCCESSFUL | &quot;VM_POWER_ON_SUCCESSFUL&quot;
VM_REGISTRATION_FAILED | &quot;VM_REGISTRATION_FAILED&quot;
VM_WAITING_TO_COME_ONLINE | &quot;VM_WAITING_TO_COME_ONLINE&quot;
VM_ONLINE_FAILED | &quot;VM_ONLINE_FAILED&quot;
VM_POWER_OFF_IN_PROGRESS | &quot;VM_POWER_OFF_IN_PROGRESS&quot;
VM_POWER_OFF_FAILED | &quot;VM_POWER_OFF_FAILED&quot;
WAITING_TO_UNDEPLOY_VM | &quot;WAITING_TO_UNDEPLOY_VM&quot;
VM_UNDEPLOY_IN_PROGRESS | &quot;VM_UNDEPLOY_IN_PROGRESS&quot;
VM_UNDEPLOY_FAILED | &quot;VM_UNDEPLOY_FAILED&quot;
VM_UNDEPLOY_SUCCESSFUL | &quot;VM_UNDEPLOY_SUCCESSFUL&quot;
UNKNOWN_STATE | &quot;UNKNOWN_STATE&quot;
