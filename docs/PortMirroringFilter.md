# PortMirroringFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterAction** | [**FilterActionEnum**](#FilterActionEnum) | If set to MIRROR, packets will be mirrored. If set to DO_NOT_MIRROR, packets will not be mirrored. |  [optional]
**ipProtocol** | [**IpProtocolEnum**](#IpProtocolEnum) | The transport protocols of TCP or UDP, used to match the transport protocol of a packet. If not provided, no filtering by IP protocols is performed. |  [optional]
**srcIps** | [**IPAddresses**](IPAddresses.md) |  |  [optional]
**dstIps** | [**IPAddresses**](IPAddresses.md) |  |  [optional]
**dstPorts** | **String** | Destination port in the form of a port or port range, used to match the destination port of a packet. If not provided, no filtering by destination port is performed. |  [optional]
**srcPorts** | **String** | Source port in the form of a port or port range, used to match the source port of a packet. If not provided, no filtering by source port is performed. |  [optional]

<a name="FilterActionEnum"></a>
## Enum: FilterActionEnum
Name | Value
---- | -----
MIRROR | &quot;MIRROR&quot;
DO_NOT_MIRROR | &quot;DO_NOT_MIRROR&quot;

<a name="IpProtocolEnum"></a>
## Enum: IpProtocolEnum
Name | Value
---- | -----
TCP | &quot;TCP&quot;
UDP | &quot;UDP&quot;
