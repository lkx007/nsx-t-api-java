# NdpHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dstIp** | **String** | The IP address of the destination of the solicitation. It MUST NOT be a multicast address. |  [optional]
**msgType** | [**MsgTypeEnum**](#MsgTypeEnum) | This field specifies the type of the Neighbor discover message being sent. NEIGHBOR_SOLICITATION - Neighbor Solicitation message to discover the link-layer address of an on-link IPv6 node or to confirm a previously determined link-layer address. NEIGHBOR_ADVERTISEMENT - Neighbor Advertisement message in response to a Neighbor Solicitation message. |  [optional]

<a name="MsgTypeEnum"></a>
## Enum: MsgTypeEnum
Name | Value
---- | -----
SOLICITATION | &quot;NEIGHBOR_SOLICITATION&quot;
ADVERTISEMENT | &quot;NEIGHBOR_ADVERTISEMENT&quot;
