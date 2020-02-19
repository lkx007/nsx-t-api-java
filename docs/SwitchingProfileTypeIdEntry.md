# SwitchingProfileTypeIdEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | key value | 
**key** | [**KeyEnum**](#KeyEnum) | Supported switching profiles. &#x27;PortMirroringSwitchingProfile&#x27; is deprecated, please turn to \&quot;Troubleshooting And Monitoring: Portmirroring\&quot; and use PortMirroringSession API for port mirror function.  |  [optional]

<a name="KeyEnum"></a>
## Enum: KeyEnum
Name | Value
---- | -----
QOSSWITCHINGPROFILE | &quot;QosSwitchingProfile&quot;
PORTMIRRORINGSWITCHINGPROFILE | &quot;PortMirroringSwitchingProfile&quot;
IPDISCOVERYSWITCHINGPROFILE | &quot;IpDiscoverySwitchingProfile&quot;
SPOOFGUARDSWITCHINGPROFILE | &quot;SpoofGuardSwitchingProfile&quot;
SWITCHSECURITYSWITCHINGPROFILE | &quot;SwitchSecuritySwitchingProfile&quot;
MACMANAGEMENTSWITCHINGPROFILE | &quot;MacManagementSwitchingProfile&quot;
