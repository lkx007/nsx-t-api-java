# StandardHostSwitch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pnicsUninstallMigration** | [**List&lt;Pnic&gt;**](Pnic.md) | The pnics to be migrated out to a non N-VDS switch during transport node deletion. |  [optional]
**ipAssignmentSpec** | [**IpAssignmentSpec**](IpAssignmentSpec.md) |  |  [optional]
**cpuConfig** | [**List&lt;CpuCoreConfigForEnhancedNetworkingStackSwitch&gt;**](CpuCoreConfigForEnhancedNetworkingStackSwitch.md) | CPU configuration specifies number of Logical cpu cores (Lcores) per Non Uniform Memory Access (NUMA) node dedicated to Enhanced Networking Stack enabled HostSwitch to get the best performance. |  [optional]
**isMigratePnics** | **Boolean** | If the pnics specified in the pnics field are used by a single Vsphere Standard Switch or DVS, then migrate the pnics to N-VDS. If any two pnics are not used by the same Vsphere Standard Switch or DVS, it is not supported. In such cases, please migrate them in multiple steps, one Vsphere Standard Switch or DVS at a time. |  [optional]
**vmkUninstallMigration** | [**List&lt;VmknicNetwork&gt;**](VmknicNetwork.md) | The vmk interfaces and the associated portgroups on the VSS/DVS. This field is realized on the host during transport node deletion or NSX uninstallation to specify the destination for all vmks on N-VDS switches. |  [optional]
**pnics** | [**List&lt;Pnic&gt;**](Pnic.md) | Physical NICs connected to the host switch |  [optional]
**hostSwitchName** | **String** | If this name is unset or empty then the default host switch name will be used. The name must be unique among all host switches specified in a given transport node; unset name, empty name and the default host switch name are considered the same in terms of uniqueness. |  [optional]
**vmkInstallMigration** | [**List&lt;VmknicNetwork&gt;**](VmknicNetwork.md) | The vmk interfaces and the associated logical switches on the host switch. The state of this field is realized on the transport node during creation and update. |  [optional]
**hostSwitchProfileIds** | [**List&lt;HostSwitchProfileTypeIdEntry&gt;**](HostSwitchProfileTypeIdEntry.md) | host switch profiles bound to this host switch. If a profile ID is not provided for any HostSwitchProfileType that is supported by the transport node, the corresponding default profile will be bound to the host switch. |  [optional]
