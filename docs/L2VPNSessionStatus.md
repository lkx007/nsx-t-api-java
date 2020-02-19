# L2VPNSessionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | L2 VPN session status, specifies UP/DOWN. |  [optional]
**transportTunnels** | [**List&lt;L2VPNTransportTunnelStatus&gt;**](L2VPNTransportTunnelStatus.md) | Transport tunnels status. |  [optional]
**displayName** | **String** | L2VPN display name. |  [optional]
**sessionId** | **String** | L2VPN session identifier. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
