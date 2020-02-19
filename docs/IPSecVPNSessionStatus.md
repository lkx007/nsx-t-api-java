# IPSecVPNSessionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipsecVpnSessionId** | **String** | UUID of vpn session. |  [optional]
**displayName** | **String** | Display name of vpn session. |  [optional]
**failedTunnels** | **Long** | Number of failed tunnels. |  [optional]
**negotiatedTunnels** | **Long** | Number of negotiated tunnels. |  [optional]
**sessionStatus** | [**SessionStatusEnum**](#SessionStatusEnum) | Gives session status consolidated using IKE status and tunnel status. It can be UP, DOWN, DEGRADED. If IKE and all tunnels are UP status will be UP, if all down it will be DOWN, otherwise it will be DEGRADED. |  [optional]
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated. |  [optional]
**aggregateTrafficCounters** | [**IPSecVPNTrafficCounters**](IPSecVPNTrafficCounters.md) |  |  [optional]
**ikeStatus** | [**IPSecVPNIKESessionStatus**](IPSecVPNIKESessionStatus.md) |  |  [optional]
**totalTunnels** | **Long** | Total number of tunnels. |  [optional]

<a name="SessionStatusEnum"></a>
## Enum: SessionStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;
