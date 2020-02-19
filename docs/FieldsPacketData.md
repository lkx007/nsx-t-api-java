# FieldsPacketData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipv6Header** | [**Ipv6Header**](Ipv6Header.md) |  |  [optional]
**arpHeader** | [**ArpHeader**](ArpHeader.md) |  |  [optional]
**transportHeader** | [**TransportProtocolHeader**](TransportProtocolHeader.md) |  |  [optional]
**ipHeader** | [**Ipv4Header**](Ipv4Header.md) |  |  [optional]
**ethHeader** | [**EthernetHeader**](EthernetHeader.md) |  |  [optional]
**payload** | **String** | Up to 1000 bytes of payload may be supplied (with a base64-encoded length of 1336 bytes.) Additional bytes of traceflow metadata will be appended to the payload. The payload contains any data the user wants to put after the transport header. |  [optional]
