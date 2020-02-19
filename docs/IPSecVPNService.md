# IPSecVPNService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ikeLogLevel** | [**IkeLogLevelEnum**](#IkeLogLevelEnum) | Log level for internet key exchange (IKE). |  [optional]
**logicalRouterId** | **String** | Logical router id. | 
**bypassRules** | [**List&lt;IPSecVPNPolicyRule&gt;**](IPSecVPNPolicyRule.md) | Bypass policy rules are configured using VPN service. Bypass rules always have higher priority over protect rules and they affect all policy based vpn sessions associated with the IPSec VPN service. Protect rules are defined per policy based vpn session.  |  [optional]
**enabled** | **Boolean** | If true, enable VPN services for given logical router. |  [optional]

<a name="IkeLogLevelEnum"></a>
## Enum: IkeLogLevelEnum
Name | Value
---- | -----
DEBUG | &quot;DEBUG&quot;
INFO | &quot;INFO&quot;
WARN | &quot;WARN&quot;
ERROR | &quot;ERROR&quot;
EMERGENCY | &quot;EMERGENCY&quot;
