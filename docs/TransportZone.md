# TransportZone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isDefault** | **Boolean** | Only one transport zone can be the default one for a given transport zone type. APIs that need transport zone can choose to use the default transport zone if a transport zone is not given by the user. |  [optional]
**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | The transport type of this transport zone. | 
**hostSwitchId** | **String** | the host switch id generated by the system. |  [optional]
**hostSwitchName** | **String** | If this name is unset or empty then the default host switch name will be used. |  [optional]
**hostSwitchMode** | [**HostSwitchModeEnum**](#HostSwitchModeEnum) | STANDARD mode applies to all the hypervisors. ENS mode stands for Enhanced Networking Stack. This feature is only available for ESX hypervisor. It is not available on KVM, EDGE and Public Cloud Gateway etc. When a Transport Zone mode is set to ENS, only Transport Nodes of type ESX can participate in such a Transport Zone. |  [optional]
**nestedNsx** | **Boolean** | The flag only need to be set in nested NSX environment. |  [optional]
**uplinkTeamingPolicyNames** | **List&lt;String&gt;** | The names of switching uplink teaming policies that all transport nodes in this transport zone must support. An exception will be thrown if a transport node within the transport zone does not support a named teaming policy. The user will need to first ensure all trasnport nodes support the desired named teaming policy before assigning it to the transport zone. If the field is not specified, the host switch&#x27;s default teaming policy will be used. |  [optional]
**transportZoneProfileIds** | [**List&lt;TransportZoneProfileTypeIdEntry&gt;**](TransportZoneProfileTypeIdEntry.md) | Identifiers of the transport zone profiles associated with this TransportZone. |  [optional]

<a name="TransportTypeEnum"></a>
## Enum: TransportTypeEnum
Name | Value
---- | -----
OVERLAY | &quot;OVERLAY&quot;
VLAN | &quot;VLAN&quot;

<a name="HostSwitchModeEnum"></a>
## Enum: HostSwitchModeEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
ENS | &quot;ENS&quot;
