# PacketCaptureRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node** | **String** | Define the transport node to capture data. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Define the capture direction. Support three types INPUT/OUTPUT/DUAL. |  [optional]
**capduration** | **Integer** | Define the packet capture duration time. After the capture duration time, the capture process will stop working. |  [optional]
**capamount** | **Integer** | Define the packet capture amount size. |  [optional]
**capsource** | [**CapsourceEnum**](#CapsourceEnum) | This type is used to differenite the incoming request from CLI/UI. | 
**nodeIp** | **String** | Define the transport node to capture data. |  [optional]
**capvalue** | **String** | Define the capture value of given capture point. |  [optional]
**filtertype** | [**FiltertypeEnum**](#FiltertypeEnum) | Define the capture filter type. Support PRE/POST mode. |  [optional]
**cappoint** | [**CappointEnum**](#CappointEnum) | Define the point to capture data. | 
**capfilesize** | **Integer** | Define the packet capture file size limit. |  [optional]
**options** | [**PacketCaptureOptionList**](PacketCaptureOptionList.md) |  |  [optional]
**streamport** | **Integer** | Set the stream port to receive the capture packet. The STREAM mode is based on GRE-in-UDP Encapsulation(RFC8086). Packets are sent to UDP port 4754. |  [optional]
**caprate** | **Integer** | Define the rate of packet capture process. |  [optional]
**capcore** | **Integer** | The CPU core id on Edge node. |  [optional]
**capsnaplen** | **Integer** | Limit the number of bytes captured from each packet. |  [optional]
**streamaddress** | **String** | Set the stream address to receive the capture packet. |  [optional]
**capmode** | [**CapmodeEnum**](#CapmodeEnum) | Define the capture streaming mode. The STREAM mode will send the data to given stream address and port. And the STANDALONE mode will save the capture file in local folder. |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
INPUT | &quot;INPUT&quot;
OUTPUT | &quot;OUTPUT&quot;
DUAL | &quot;DUAL&quot;

<a name="CapsourceEnum"></a>
## Enum: CapsourceEnum
Name | Value
---- | -----
CLI | &quot;CLI&quot;
UI | &quot;UI&quot;

<a name="FiltertypeEnum"></a>
## Enum: FiltertypeEnum
Name | Value
---- | -----
PRE | &quot;PRE&quot;
POST | &quot;POST&quot;

<a name="CappointEnum"></a>
## Enum: CappointEnum
Name | Value
---- | -----
VNIC | &quot;VNIC&quot;
VMKNIC | &quot;VMKNIC&quot;
VMNIC | &quot;VMNIC&quot;
VDRPORT | &quot;VDRPORT&quot;
DVFILTER | &quot;DVFILTER&quot;
LOGICALPORT | &quot;LOGICALPORT&quot;
FCPORT | &quot;FCPORT&quot;
VIF | &quot;VIF&quot;
PNIC | &quot;PNIC&quot;

<a name="CapmodeEnum"></a>
## Enum: CapmodeEnum
Name | Value
---- | -----
STANDALONE | &quot;STANDALONE&quot;
STREAM | &quot;STREAM&quot;
