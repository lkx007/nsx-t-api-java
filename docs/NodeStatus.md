# NodeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mpaConnectivityStatus** | [**MpaConnectivityStatusEnum**](#MpaConnectivityStatusEnum) | Indicates the fabric node&#x27;s MP&amp;lt;-&amp;gt;MPA channel connectivity status, UP, DOWN, UNKNOWN. |  [optional]
**lcpConnectivityStatusDetails** | [**List&lt;ControlConnStatus&gt;**](ControlConnStatus.md) | Details, if any, about the current LCP&amp;lt;-&amp;gt;CCP channel connectivity status of the fabric node. |  [optional]
**mpaConnectivityStatusDetails** | **String** | Details, if any, about the current MP&amp;lt;-&amp;gt;MPA channel connectivity status of the fabric node. |  [optional]
**externalId** | **String** | HostNode external id |  [optional]
**softwareVersion** | **String** | Software version of the fabric node. |  [optional]
**maintenanceMode** | [**MaintenanceModeEnum**](#MaintenanceModeEnum) | Indicates the fabric node&#x27;s status of maintenance mode, OFF, ENTERING, ON, EXITING. |  [optional]
**inventorySyncPaused** | **Boolean** | Is true if inventory sync is paused else false |  [optional]
**systemStatus** | [**NodeStatusProperties**](NodeStatusProperties.md) |  |  [optional]
**inventorySyncReenableTime** | **Long** | Inventory sync auto re-enable target time, in epoch milis |  [optional]
**lcpConnectivityStatus** | [**LcpConnectivityStatusEnum**](#LcpConnectivityStatusEnum) | Indicates the fabric node&#x27;s LCP&amp;lt;-&amp;gt;CCP channel connectivity status, UP, DOWN, DEGRADED, UNKNOWN. |  [optional]
**lastHeartbeatTimestamp** | **Long** | Timestamp of the last heartbeat status change, in epoch milliseconds. |  [optional]
**lastSyncTime** | **Long** | Timestamp of the last successful update of Inventory, in epoch milliseconds. |  [optional]
**hostNodeDeploymentStatus** | [**HostNodeDeploymentStatusEnum**](#HostNodeDeploymentStatusEnum) | This enum specifies the current nsx install state for host node or current deployment and ready state for edge node. The ready status &#x27;NODE_READY&#x27; indicates whether edge node is ready to become a transport node. The status &#x27;EDGE_CONFIG_ERROR&#x27; indicates that edge hardware or underlying host is not supported. After all fabric level operations are done for an edge node, this value indicates transport node related configuration issues and state as relevant.  |  [optional]

<a name="MpaConnectivityStatusEnum"></a>
## Enum: MpaConnectivityStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="MaintenanceModeEnum"></a>
## Enum: MaintenanceModeEnum
Name | Value
---- | -----
OFF | &quot;OFF&quot;
ENTERING | &quot;ENTERING&quot;
ON | &quot;ON&quot;
EXITING | &quot;EXITING&quot;

<a name="LcpConnectivityStatusEnum"></a>
## Enum: LcpConnectivityStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="HostNodeDeploymentStatusEnum"></a>
## Enum: HostNodeDeploymentStatusEnum
Name | Value
---- | -----
NOT_PREPARED | &quot;NOT_PREPARED&quot;
INSTALL_IN_PROGRESS | &quot;INSTALL_IN_PROGRESS&quot;
INSTALL_FAILED | &quot;INSTALL_FAILED&quot;
INSTALL_SUCCESSFUL | &quot;INSTALL_SUCCESSFUL&quot;
UNINSTALL_IN_PROGRESS | &quot;UNINSTALL_IN_PROGRESS&quot;
UNINSTALL_FAILED | &quot;UNINSTALL_FAILED&quot;
UNINSTALL_SUCCESSFUL | &quot;UNINSTALL_SUCCESSFUL&quot;
UNINSTALL_SCHEDULED | &quot;UNINSTALL_SCHEDULED&quot;
UPGRADE_IN_PROGRESS | &quot;UPGRADE_IN_PROGRESS&quot;
UPGRADE_FAILED | &quot;UPGRADE_FAILED&quot;
PENDING_UPGRADE | &quot;PENDING_UPGRADE&quot;
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;
VM_DEPLOYMENT_QUEUED | &quot;VM_DEPLOYMENT_QUEUED&quot;
VM_DEPLOYMENT_IN_PROGRESS | &quot;VM_DEPLOYMENT_IN_PROGRESS&quot;
VM_DEPLOYMENT_FAILED | &quot;VM_DEPLOYMENT_FAILED&quot;
VM_POWER_ON_IN_PROGRESS | &quot;VM_POWER_ON_IN_PROGRESS&quot;
VM_POWER_ON_FAILED | &quot;VM_POWER_ON_FAILED&quot;
REGISTRATION_PENDING | &quot;REGISTRATION_PENDING&quot;
NODE_NOT_READY | &quot;NODE_NOT_READY&quot;
NODE_READY | &quot;NODE_READY&quot;
VM_POWER_OFF_IN_PROGRESS | &quot;VM_POWER_OFF_IN_PROGRESS&quot;
VM_POWER_OFF_FAILED | &quot;VM_POWER_OFF_FAILED&quot;
VM_UNDEPLOY_IN_PROGRESS | &quot;VM_UNDEPLOY_IN_PROGRESS&quot;
VM_UNDEPLOY_FAILED | &quot;VM_UNDEPLOY_FAILED&quot;
VM_UNDEPLOY_SUCCESSFUL | &quot;VM_UNDEPLOY_SUCCESSFUL&quot;
EDGE_CONFIG_ERROR | &quot;EDGE_CONFIG_ERROR&quot;
VM_DEPLOYMENT_RESTARTED | &quot;VM_DEPLOYMENT_RESTARTED&quot;
REGISTRATION_FAILED | &quot;REGISTRATION_FAILED&quot;
HOST_DISCONNECTED | &quot;HOST_DISCONNECTED&quot;
POWERED_OFF | &quot;POWERED_OFF&quot;
TRANSPORT_NODE_SYNC_PENDING | &quot;TRANSPORT_NODE_SYNC_PENDING&quot;
TRANSPORT_NODE_CONFIGURATION_MISSING | &quot;TRANSPORT_NODE_CONFIGURATION_MISSING&quot;
EDGE_HARDWARE_NOT_SUPPORTED | &quot;EDGE_HARDWARE_NOT_SUPPORTED&quot;
MULTIPLE_OVERLAY_TZS_NOT_SUPPORTED | &quot;MULTIPLE_OVERLAY_TZS_NOT_SUPPORTED&quot;
TN_OVERLAY_TZ_IN_USE_BY_EDGE_CLUSTER | &quot;TN_OVERLAY_TZ_IN_USE_BY_EDGE_CLUSTER&quot;
TZ_ENDPOINTS_NOT_SPECIFIED | &quot;TZ_ENDPOINTS_NOT_SPECIFIED&quot;
NO_PNIC_PREPARED_IN_EDGE | &quot;NO_PNIC_PREPARED_IN_EDGE&quot;
APPLIANCE_INTERNAL_ERROR | &quot;APPLIANCE_INTERNAL_ERROR&quot;
VTEP_DHCP_NOT_SUPPORTED | &quot;VTEP_DHCP_NOT_SUPPORTED&quot;
UNSUPPORTED_HOST_SWITCH_PROFILE | &quot;UNSUPPORTED_HOST_SWITCH_PROFILE&quot;
UPLINK_HOST_SWITCH_PROFILE_NOT_SPECIFIED | &quot;UPLINK_HOST_SWITCH_PROFILE_NOT_SPECIFIED&quot;
HOSTSWITCH_PROFILE_NOT_FOUND | &quot;HOSTSWITCH_PROFILE_NOT_FOUND&quot;
LLDP_SEND_ENABLED_NOT_SUPPORTED | &quot;LLDP_SEND_ENABLED_NOT_SUPPORTED&quot;
UNSUPPORTED_NAMED_TEAMING_POLICY | &quot;UNSUPPORTED_NAMED_TEAMING_POLICY&quot;
MULTIPLE_UPLINKS_IN_NAMED_TEAMING_NOT_SUPPORTED_IF_UPLINK_IN_DEFAULT_TEAMING | &quot;MULTIPLE_UPLINKS_IN_NAMED_TEAMING_NOT_SUPPORTED_IF_UPLINK_IN_DEFAULT_TEAMING&quot;
LBSRCID_NOT_SUPPORTED_FOR_EDGE_VM | &quot;LBSRCID_NOT_SUPPORTED_FOR_EDGE_VM&quot;
LACP_NOT_SUPPORTED_FOR_EDGE_VM | &quot;LACP_NOT_SUPPORTED_FOR_EDGE_VM&quot;
STANDBY_UPLINKS_NOT_SUPPORTED_FOR_EDGE_VM | &quot;STANDBY_UPLINKS_NOT_SUPPORTED_FOR_EDGE_VM&quot;
MULTIPLE_ACTIVE_UPLINKS_NOT_SUPPORTED_FOR_EDGE | &quot;MULTIPLE_ACTIVE_UPLINKS_NOT_SUPPORTED_FOR_EDGE&quot;
UNSUPPORTED_LACP_LB_ALGO_FOR_NODE | &quot;UNSUPPORTED_LACP_LB_ALGO_FOR_NODE&quot;
EDGE_NODE_VERSION_NOT_SUPPORTED | &quot;EDGE_NODE_VERSION_NOT_SUPPORTED&quot;
NO_PNIC_SPECIFIED_IN_TN | &quot;NO_PNIC_SPECIFIED_IN_TN&quot;
INVALID_PNIC_DEVICE_NAME | &quot;INVALID_PNIC_DEVICE_NAME&quot;
TRANSPORT_NODE_READY | &quot;TRANSPORT_NODE_READY&quot;
UNSUPPORTED_DEFAULT_TEAMING_POLICY | &quot;UNSUPPORTED_DEFAULT_TEAMING_POLICY&quot;
MPA_DISCONNECTED | &quot;MPA_DISCONNECTED&quot;
VM_NETWORK_EDIT_PENDING | &quot;VM_NETWORK_EDIT_PENDING&quot;
VM_RENAME_PENDING | &quot;VM_RENAME_PENDING&quot;
VM_CONFIG_EDIT_PENDING | &quot;VM_CONFIG_EDIT_PENDING&quot;
VM_NETWORK_EDIT_FAILED | &quot;VM_NETWORK_EDIT_FAILED&quot;
VM_RENAME_FAILED | &quot;VM_RENAME_FAILED&quot;
VM_CONFIG_EDIT_FAILED | &quot;VM_CONFIG_EDIT_FAILED&quot;
VM_CONFIG_DISCREPANCY | &quot;VM_CONFIG_DISCREPANCY&quot;
VM_NODE_REFRESH_FAILED | &quot;VM_NODE_REFRESH_FAILED&quot;
VM_PLACEMENT_REFRESH_FAILED | &quot;VM_PLACEMENT_REFRESH_FAILED&quot;
