# HostNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discoveredNodeId** | **String** | Id of discovered node which was converted to create this node |  [optional]
**managedByServer** | **String** | The id of the vCenter server managing the ESXi type HostNode |  [optional]
**hostCredential** | [**HostNodeLoginCredential**](HostNodeLoginCredential.md) |  |  [optional]
**osVersion** | **String** | Version of the hypervisor operating system |  [optional]
**osType** | [**OsTypeEnum**](#OsTypeEnum) | Hypervisor type, for example ESXi or RHEL KVM | 
**maintenanceModeState** | [**MaintenanceModeStateEnum**](#MaintenanceModeStateEnum) | Indicates host node&#x27;s maintenance mode state. The state is ENTERING when a task to put the host in maintenance-mode is in progress.  |  [optional]

<a name="OsTypeEnum"></a>
## Enum: OsTypeEnum
Name | Value
---- | -----
ESXI | &quot;ESXI&quot;
RHELKVM | &quot;RHELKVM&quot;
RHELSERVER | &quot;RHELSERVER&quot;
RHELCONTAINER | &quot;RHELCONTAINER&quot;
UBUNTUKVM | &quot;UBUNTUKVM&quot;
UBUNTUSERVER | &quot;UBUNTUSERVER&quot;
HYPERV | &quot;HYPERV&quot;
CENTOSKVM | &quot;CENTOSKVM&quot;
CENTOSSERVER | &quot;CENTOSSERVER&quot;
CENTOSCONTAINER | &quot;CENTOSCONTAINER&quot;
SLESKVM | &quot;SLESKVM&quot;
SLESSERVER | &quot;SLESSERVER&quot;

<a name="MaintenanceModeStateEnum"></a>
## Enum: MaintenanceModeStateEnum
Name | Value
---- | -----
OFF | &quot;OFF&quot;
ENTERING | &quot;ENTERING&quot;
ON | &quot;ON&quot;
