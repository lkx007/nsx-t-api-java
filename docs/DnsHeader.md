# DnsHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) | This is used to specify the type of the address. V4 - The address provided is an IPv4 domain name/IP address, the Type in query or response will be A V6 - The address provided is an IPv6 domain name/IP address, the Type in query or response will be AAAA |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Specifies the message type whether it is a query or a response. |  [optional]
**address** | **String** | This is used to define what is being asked or responded. |  [optional]

<a name="AddressTypeEnum"></a>
## Enum: AddressTypeEnum
Name | Value
---- | -----
V4 | &quot;V4&quot;
V6 | &quot;V6&quot;

<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
QUERY | &quot;QUERY&quot;
RESPONSE | &quot;RESPONSE&quot;
