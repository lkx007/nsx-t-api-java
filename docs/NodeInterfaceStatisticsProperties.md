# NodeInterfaceStatisticsProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txDropped** | **Long** | Number of packets dropped |  [optional]
**rxPackets** | **Long** | Number of packets received |  [optional]
**txCarrier** | **Long** | Number of carrier losses detected |  [optional]
**rxBytes** | **Long** | Number of bytes received |  [optional]
**txErrors** | **Long** | Number of transmit errors |  [optional]
**interfaceId** | **String** | Interface ID |  [optional]
**txColls** | **Long** | Number of collisions detected |  [optional]
**rxFrame** | **Long** | Number of framing errors |  [optional]
**rxErrors** | **Long** | Number of receive errors |  [optional]
**txBytes** | **Long** | Number of bytes transmitted |  [optional]
**rxDropped** | **Long** | Number of packets dropped |  [optional]
**txPackets** | **Long** | Number of packets transmitted |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | Source of status data. |  [optional]

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
REALTIME | &quot;realtime&quot;
CACHED | &quot;cached&quot;
