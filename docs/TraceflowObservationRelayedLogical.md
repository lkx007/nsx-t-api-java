# TraceflowObservationRelayedLogical

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | This field specified the message type of the relay service REQUEST - The relay service will relay a request message to the destination server REPLY - The relay service will relay a reply message to the client |  [optional]
**dstServerAddress** | **String** | This field specified the IP address of the destination which the packet will be relayed. |  [optional]
**logicalCompUuid** | **String** | This field specified the logical component that relay service located. |  [optional]
**relayServerAddress** | **String** | This field specified the IP address of the relay service. |  [optional]

<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
REQUEST | &quot;REQUEST&quot;
REPLY | &quot;REPLY&quot;
