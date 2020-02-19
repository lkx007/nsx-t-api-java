# TunnelProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of tunnel |  [optional]
**egressInterface** | **String** | Corresponds to the interface where local_ip_address is routed. |  [optional]
**remoteNodeId** | **String** | UUID of the remote transport node |  [optional]
**bfd** | [**BFDProperties**](BFDProperties.md) |  |  [optional]
**localIp** | **String** | Local IP address of tunnel |  [optional]
**lastUpdatedTime** | **Long** | Time at which the Tunnel status has been fetched last time. |  [optional]
**name** | **String** | Name of tunnel |  [optional]
**remoteNodeDisplayName** | **String** | Represents the display name of the remote transport node at the other end of the tunnel. |  [optional]
**encap** | [**EncapEnum**](#EncapEnum) | Tunnel encap |  [optional]
**latencyType** | [**LatencyTypeEnum**](#LatencyTypeEnum) | Latency type. |  [optional]
**latencyValue** | **Long** | The latency value is set only when latency_type is VALID. |  [optional]
**remoteIp** | **String** | Remote IP address of tunnel |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="EncapEnum"></a>
## Enum: EncapEnum
Name | Value
---- | -----
STT | &quot;STT&quot;
VXLAN | &quot;VXLAN&quot;
GENEVE | &quot;GENEVE&quot;
UNKNOWN_ENCAP | &quot;UNKNOWN_ENCAP&quot;

<a name="LatencyTypeEnum"></a>
## Enum: LatencyTypeEnum
Name | Value
---- | -----
UNKNOWN_LATENCY | &quot;UNKNOWN_LATENCY&quot;
VALID | &quot;VALID&quot;
NOT_READY | &quot;NOT_READY&quot;
TIMEOUT | &quot;TIMEOUT&quot;
