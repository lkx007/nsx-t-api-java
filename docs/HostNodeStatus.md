# HostNodeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configStatus** | [**ConfigStatusEnum**](#ConfigStatusEnum) | Gives details of state of desired configuration. This property is available only if Tranport Node exists for the host. Following are the supported values pending  - Transport Node configuration status is pending in_progress - Transport Node configuration status is in progress success - Transport Node configuration status is successful failed - Transport Node configuration status is failed partial_success - Transport Node configuration status is partial success orphaned - Transport Node configuration status is orphaned unknown - Transport Node configuration status is unknown error - Error occured during Transport Node configuration |  [optional]
**nodeId** | **String** | Unique Id of the host node |  [optional]
**deploymentStatus** | [**DeploymentStatusEnum**](#DeploymentStatusEnum) | This specifies the current nsx install status for host node. Following are the supported values INSTALL_IN_PROGRESS - NSX installation is in progress on the host INSTALL_FAILED - NSX installation failed on the host INSTALL_SUCCESSFUL - NSX installation successful on the host UNINSTALL_IN_PROGRESS - NSX uninstallation in progress on the host UNINSTALL_FAILED - NSX uninstallation failed on the host UNINSTALL_SUCCESSFUL - NSX uninstallation successful on the host UNINSTALL_SCHEDULED - NSX uninstallation is scheduled on the host UPGRADE_IN_PROGRESS - NSX upgrade is in progress on the host UPGRADE_FAILED - NSX upgrade failed on the host DEPLOYMENT_QUEUED - Deployment is queued on the DEPLOYMENT_IN_PROGRESS - Deployment is in progress DEPLOYMENT_FAILED - Deployment is failed DEPLOYMENT_SUCCESSFUL - Deployment is successful UNDEPLOYMENT_QUEUED - Undeployment is queued UNDEPLOYMENT_IN_PROGRESS - Undeployment is in progress UNDEPLOYMENT_FAILED - Undeployment failed UNDEPLOYMENT_SUCCESSFUL - Undeployment is successful UPGRADE_QUEUED - Upgrade is queued HOST_DISCONNECTED - Host is disconnected POWERED_OFF - Host is powered off |  [optional]

<a name="ConfigStatusEnum"></a>
## Enum: ConfigStatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
IN_PROGRESS | &quot;in_progress&quot;
SUCCESS | &quot;success&quot;
FAILED | &quot;failed&quot;
PARTIAL_SUCCESS | &quot;partial_success&quot;
ORPHANED | &quot;orphaned&quot;
UNKNOWN | &quot;unknown&quot;
ERROR | &quot;error&quot;

<a name="DeploymentStatusEnum"></a>
## Enum: DeploymentStatusEnum
Name | Value
---- | -----
INSTALL_IN_PROGRESS | &quot;INSTALL_IN_PROGRESS&quot;
INSTALL_FAILED | &quot;INSTALL_FAILED&quot;
INSTALL_SUCCESSFUL | &quot;INSTALL_SUCCESSFUL&quot;
UNINSTALL_IN_PROGRESS | &quot;UNINSTALL_IN_PROGRESS&quot;
UNINSTALL_FAILED | &quot;UNINSTALL_FAILED&quot;
UNINSTALL_SUCCESSFUL | &quot;UNINSTALL_SUCCESSFUL&quot;
UNINSTALL_SCHEDULED | &quot;UNINSTALL_SCHEDULED&quot;
UPGRADE_IN_PROGRESS | &quot;UPGRADE_IN_PROGRESS&quot;
UPGRADE_FAILED | &quot;UPGRADE_FAILED&quot;
DEPLOYMENT_QUEUED | &quot;DEPLOYMENT_QUEUED&quot;
DEPLOYMENT_IN_PROGRESS | &quot;DEPLOYMENT_IN_PROGRESS&quot;
DEPLOYMENT_FAILED | &quot;DEPLOYMENT_FAILED&quot;
DEPLOYMENT_SUCCESSFUL | &quot;DEPLOYMENT_SUCCESSFUL&quot;
UNDEPLOYMENT_QUEUED | &quot;UNDEPLOYMENT_QUEUED&quot;
UNDEPLOYMENT_IN_PROGRESS | &quot;UNDEPLOYMENT_IN_PROGRESS&quot;
UNDEPLOYMENT_FAILED | &quot;UNDEPLOYMENT_FAILED&quot;
UNDEPLOYMENT_SUCCESSFUL | &quot;UNDEPLOYMENT_SUCCESSFUL&quot;
UPGRADE_QUEUED | &quot;UPGRADE_QUEUED&quot;
HOST_DISCONNECTED | &quot;HOST_DISCONNECTED&quot;
POWERED_OFF | &quot;POWERED_OFF&quot;
