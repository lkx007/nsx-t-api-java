# ArpHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**opCode** | [**OpCodeEnum**](#OpCodeEnum) | This field specifies the nature of the Arp message being sent. | 
**srcIp** | **String** | This field specifies the IP address of the sender. If omitted, the src_ip is set to 0.0.0.0. |  [optional]
**dstIp** | **String** | The destination IP address | 

<a name="OpCodeEnum"></a>
## Enum: OpCodeEnum
Name | Value
---- | -----
REQUEST | &quot;ARP_REQUEST&quot;
REPLY | &quot;ARP_REPLY&quot;
