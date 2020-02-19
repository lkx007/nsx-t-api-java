# PortMirroringSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**direction** | [**DirectionEnum**](#DirectionEnum) | Port mirroring session direction | 
**mirrorSources** | [**List&lt;MirrorSource&gt;**](MirrorSource.md) | Mirror sources | 
**encapsulationVlanId** | **Long** | Only for Remote SPAN Port Mirror. |  [optional]
**sessionType** | [**SessionTypeEnum**](#SessionTypeEnum) | If this property is unset, this session will be treated as LocalPortMirrorSession.  |  [optional]
**snapLength** | **Long** | If this property is set, the packet will be truncated to the provided length. If this property is unset, entire packet will be mirrored.  |  [optional]
**portMirroringFilters** | [**List&lt;PortMirroringFilter&gt;**](PortMirroringFilter.md) | An array of 5-tuples used to filter packets for the mirror session, if not provided, all the packets will be mirrored. |  [optional]
**preserveOriginalVlan** | **Boolean** | Only for Remote SPAN Port Mirror. Whether to preserve original VLAN. |  [optional]
**mirrorDestination** | [**MirrorDestination**](MirrorDestination.md) |  | 

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
INGRESS | &quot;INGRESS&quot;
EGRESS | &quot;EGRESS&quot;
BIDIRECTIONAL | &quot;BIDIRECTIONAL&quot;

<a name="SessionTypeEnum"></a>
## Enum: SessionTypeEnum
Name | Value
---- | -----
LOGICALPORTMIRRORSESSION | &quot;LogicalPortMirrorSession&quot;
UPLINKPORTMIRRORSESSION | &quot;UplinkPortMirrorSession&quot;
RSPANSRCMIRRORSESSION | &quot;RspanSrcMirrorSession&quot;
RSPANDSTMIRRORSESSION | &quot;RspanDstMirrorSession&quot;
LOCALPORTMIRRORSESSION | &quot;LocalPortMirrorSession&quot;
LOGICALLOCALPORTMIRRORSESSION | &quot;LogicalLocalPortMirrorSession&quot;
L3PORTMIRRORSESSION | &quot;L3PortMirrorSession&quot;
