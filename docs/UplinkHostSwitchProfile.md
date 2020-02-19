# UplinkHostSwitchProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lags** | [**List&lt;Lag&gt;**](Lag.md) | list of LACP group |  [optional]
**transportVlan** | **Long** | VLAN used for tagging Overlay traffic of associated HostSwitch |  [optional]
**teaming** | [**TeamingPolicy**](TeamingPolicy.md) |  | 
**overlayEncap** | [**OverlayEncapEnum**](#OverlayEncapEnum) | The protocol used to encapsulate overlay traffic |  [optional]
**namedTeamings** | [**List&lt;NamedTeamingPolicy&gt;**](NamedTeamingPolicy.md) | List of named uplink teaming policies that can be used by logical switches |  [optional]
**mtu** | **Integer** | Maximum Transmission Unit used for uplinks |  [optional]

<a name="OverlayEncapEnum"></a>
## Enum: OverlayEncapEnum
Name | Value
---- | -----
VXLAN | &quot;VXLAN&quot;
GENEVE | &quot;GENEVE&quot;
