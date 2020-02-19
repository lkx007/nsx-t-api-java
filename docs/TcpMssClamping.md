# TcpMssClamping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxSegmentSize** | **Long** | It defines the maximum amount of data that a host is willing to accept in a single TCP segment. This field is set in TCP header during connection establishment. To avoid packet fragmentation, you can set this field depending on uplink MTU and VPN overhead. This is optional field and in case it is left unconfigured, best possible MSS value will be calculated based on effective mtu of uplink interface. Supported MSS range is 108 to 8852. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Specifies the traffic direction for which to apply MSS Clamping. |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
INBOUND_CONNECTION | &quot;INBOUND_CONNECTION&quot;
OUTBOUND_CONNECTION | &quot;OUTBOUND_CONNECTION&quot;
BOTH | &quot;BOTH&quot;
