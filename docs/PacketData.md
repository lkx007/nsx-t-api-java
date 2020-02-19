# PacketData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routed** | **Boolean** | A flag, when set true, indicates that the traceflow packet is of L3 routing. |  [optional]
**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | transport type of the traceflow packet |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Packet configuration | 
**frameSize** | **Long** | If the requested frame_size is too small (given the payload and traceflow metadata requirement of 16 bytes), the traceflow request will fail with an appropriate message.  The frame will be zero padded to the requested size. |  [optional]

<a name="TransportTypeEnum"></a>
## Enum: TransportTypeEnum
Name | Value
---- | -----
BROADCAST | &quot;BROADCAST&quot;
UNICAST | &quot;UNICAST&quot;
MULTICAST | &quot;MULTICAST&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
BINARYPACKETDATA | &quot;BinaryPacketData&quot;
FIELDSPACKETDATA | &quot;FieldsPacketData&quot;
