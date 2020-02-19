# LogicalSwitch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**switchType** | [**SwitchTypeEnum**](#SwitchTypeEnum) | This field indicates purpose of a LogicalSwitch. It is set by manager internally or user can provide this field. If not set, DEFAULT type is assigned. NSX components can use this field to create LogicalSwitch that provides component specific functionality. DEFAULT type LogicalSwitches are created for basic L2 connectivity by API users. SERVICE_PLANE type LogicalSwitches are system created service plane LogicalSwitches for Service Insertion service. User can not create SERVICE_PLANE type of LogicalSwitch. DHCP_RELAY type LogicalSwitches are created by external user like Policy with special permissions or by system and will be treated as internal LogicalSwitches. Such LogicalSwitch will not be exposed to vSphere user.  |  [optional]
**replicationMode** | [**ReplicationModeEnum**](#ReplicationModeEnum) | Replication mode of the Logical Switch |  [optional]
**extraConfigs** | [**List&lt;ExtraConfig&gt;**](ExtraConfig.md) | This property could be used for vendor specific configuration in key value string pairs, the setting in extra_configs will be automatically inheritted by logical ports in the logical switch.  |  [optional]
**uplinkTeamingPolicyName** | **String** | This name has to be one of the switching uplink teaming policy names listed inside the logical switch&#x27;s TransportZone. If this field is not specified, the logical switch will not have a teaming policy associated with it and the host switch&#x27;s default teaming policy will be used. |  [optional]
**transportZoneId** | **String** | Id of the TransportZone to which this LogicalSwitch is associated | 
**ipPoolId** | **String** | IP pool id that associated with a LogicalSwitch. |  [optional]
**vlan** | **Long** | This property is dedicated to VLAN based network, to set VLAN of logical network. It is mutually exclusive with &#x27;vlan_trunk_spec&#x27;.  |  [optional]
**hybrid** | **Boolean** | If this flag is set to true, then all the logical switch ports attached to this logical switch will behave in a hybrid fashion. The hybrid logical switch port indicates to NSX that the VM intends to operate in underlay mode, but retains the ability to forward egress traffic to the NSX overlay network. This flag can be enabled only for the logical switches in the overlay type transport zone which has host switch mode as STANDARD and also has either CrossCloud or CloudScope tag scopes. Only the NSX public cloud gateway (PCG) uses this flag, other host agents like ESX, KVM and Edge will ignore it. This property cannot be modified once the logical switch is created.  |  [optional]
**macPoolId** | **String** | Mac pool id that associated with a LogicalSwitch. |  [optional]
**vni** | **Integer** | Only for OVERLAY network. A VNI will be auto-allocated from the default VNI pool if not given; otherwise the given VNI has to be inside the default pool and not used by any other LogicalSwitch.  |  [optional]
**vlanTrunkSpec** | [**VlanTrunkSpec**](VlanTrunkSpec.md) |  |  [optional]
**adminState** | [**AdminStateEnum**](#AdminStateEnum) | Represents Desired state of the Logical Switch | 
**addressBindings** | [**List&lt;PacketAddressClassifier&gt;**](PacketAddressClassifier.md) | Address bindings for the Logical switch |  [optional]
**switchingProfileIds** | [**List&lt;SwitchingProfileTypeIdEntry&gt;**](SwitchingProfileTypeIdEntry.md) |  |  [optional]

<a name="SwitchTypeEnum"></a>
## Enum: SwitchTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
SERVICE_PLANE | &quot;SERVICE_PLANE&quot;
DHCP_RELAY | &quot;DHCP_RELAY&quot;

<a name="ReplicationModeEnum"></a>
## Enum: ReplicationModeEnum
Name | Value
---- | -----
MTEP | &quot;MTEP&quot;
SOURCE | &quot;SOURCE&quot;

<a name="AdminStateEnum"></a>
## Enum: AdminStateEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
