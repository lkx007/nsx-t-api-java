# TraceflowObservationReceivedLogical

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**srcComponentId** | **String** | The id of the source component from which the traceflow packet was received. |  [optional]
**componentId** | **String** | The id of the component that received the traceflow packet. |  [optional]
**lportId** | **String** | The id of the logical port at which the traceflow packet was received |  [optional]
**srcComponentType** | [**SrcComponentTypeEnum**](#SrcComponentTypeEnum) | The type of the source component from which the traceflow packet was received. |  [optional]
**lportName** | **String** | The name of the logical port at which the traceflow packet was received |  [optional]
**srcComponentName** | **String** | The name of source component from which the traceflow packet was received. |  [optional]
**vni** | **Integer** | VNI for the logical network on which the traceflow packet was received. |  [optional]

<a name="SrcComponentTypeEnum"></a>
## Enum: SrcComponentTypeEnum
Name | Value
---- | -----
PHYSICAL | &quot;PHYSICAL&quot;
LR | &quot;LR&quot;
LS | &quot;LS&quot;
DFW | &quot;DFW&quot;
BRIDGE | &quot;BRIDGE&quot;
EDGE_TUNNEL | &quot;EDGE_TUNNEL&quot;
EDGE_HOSTSWITCH | &quot;EDGE_HOSTSWITCH&quot;
FW_BRIDGE | &quot;FW_BRIDGE&quot;
LOAD_BALANCER | &quot;LOAD_BALANCER&quot;
NAT | &quot;NAT&quot;
IPSEC | &quot;IPSEC&quot;
SERVICE_INSERTION | &quot;SERVICE_INSERTION&quot;
VMC | &quot;VMC&quot;
EDGE_FW | &quot;EDGE_FW&quot;
UNKNOWN | &quot;UNKNOWN&quot;
