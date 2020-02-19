# LogicalPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logicalSwitchId** | **String** | Id of the Logical switch that this port belongs to. | 
**initState** | [**InitStateEnum**](#InitStateEnum) | Set initial state when a new logical port is created. &#x27;UNBLOCKED_VLAN&#x27; means new port will be unblocked on traffic in creation, also VLAN will be set with corresponding logical switch setting. This port setting can only be configured at port creation (POST), and cannot be modified.  |  [optional]
**switchingProfileIds** | [**List&lt;SwitchingProfileTypeIdEntry&gt;**](SwitchingProfileTypeIdEntry.md) |  |  [optional]
**attachment** | [**LogicalPortAttachment**](LogicalPortAttachment.md) |  |  [optional]
**adminState** | [**AdminStateEnum**](#AdminStateEnum) | Represents Desired state of the logical port | 
**extraConfigs** | [**List&lt;ExtraConfig&gt;**](ExtraConfig.md) | This property could be used for vendor specific configuration in key value string pairs. Logical port setting will override logical switch setting if the same key was set on both logical switch and logical port.  |  [optional]
**addressBindings** | [**List&lt;PacketAddressClassifier&gt;**](PacketAddressClassifier.md) | Each address binding must contain both an IPElement and MAC address. VLAN ID is optional. This binding configuration can be used by features such as spoof-guard and overrides any discovered bindings. Any non unique entries are deduplicated to generate a unique set of address bindings and then stored. For IPv6 addresses, a subnet address cannot have host bits set. A maximum of 128 unique address bindings is allowed per port.  |  [optional]
**ignoreAddressBindings** | [**List&lt;PacketAddressClassifier&gt;**](PacketAddressClassifier.md) | IP Discovery module uses various mechanisms to discover address bindings being used on each port. If a user would like to ignore any specific discovered address bindings or prevent the discovery of a particular set of discovered bindings, then those address bindings can be provided here. Currently IP range in CIDR format is not supported.  |  [optional]

<a name="InitStateEnum"></a>
## Enum: InitStateEnum
Name | Value
---- | -----
VLAN | &quot;UNBLOCKED_VLAN&quot;

<a name="AdminStateEnum"></a>
## Enum: AdminStateEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
