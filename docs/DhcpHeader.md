# DhcpHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**opCode** | [**OpCodeEnum**](#OpCodeEnum) | This is used to specify the general type of message. A client sending request to a server uses an op code of BOOTREQUEST, while a server replying uses an op code of BOOTREPLY. |  [optional]

<a name="OpCodeEnum"></a>
## Enum: OpCodeEnum
Name | Value
---- | -----
BOOTREQUEST | &quot;BOOTREQUEST&quot;
BOOTREPLY | &quot;BOOTREPLY&quot;
