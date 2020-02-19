# TraceflowObservation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestampMicro** | **Long** | Timestamp when the observation was created by the transport node (microseconds epoch) |  [optional]
**componentSubType** | [**ComponentSubTypeEnum**](#ComponentSubTypeEnum) | The sub type of the component that issued the observation. |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) | The type of the component that issued the observation. |  [optional]
**transportNodeName** | **String** | name of the transport node that observed a traceflow packet |  [optional]
**timestamp** | **Long** | Timestamp when the observation was created by the transport node (milliseconds epoch) |  [optional]
**transportNodeId** | **String** | id of the transport node that observed a traceflow packet |  [optional]
**sequenceNo** | **Long** | the hop count for observations on the transport node that a traceflow packet is injected in will be 0. The hop count is incremented each time a subsequent transport node receives the traceflow packet. The sequence number of 999 indicates that the hop count could not be determined for the containing observation. |  [optional]
**transportNodeType** | [**TransportNodeTypeEnum**](#TransportNodeTypeEnum) | type of the transport node that observed a traceflow packet |  [optional]
**componentName** | **String** | The name of the component that issued the observation. |  [optional]

<a name="ComponentSubTypeEnum"></a>
## Enum: ComponentSubTypeEnum
Name | Value
---- | -----
LR_TIER0 | &quot;LR_TIER0&quot;
LR_TIER1 | &quot;LR_TIER1&quot;
LR_VRF_TIER0 | &quot;LR_VRF_TIER0&quot;
LS_TRANSIT | &quot;LS_TRANSIT&quot;
SI_CLASSIFIER | &quot;SI_CLASSIFIER&quot;
SI_PROXY | &quot;SI_PROXY&quot;
VDR | &quot;VDR&quot;
ENI | &quot;ENI&quot;
AWS_GATEWAY | &quot;AWS_GATEWAY&quot;
TGW_ROUTE | &quot;TGW_ROUTE&quot;
EDGE_UPLINK | &quot;EDGE_UPLINK&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
TRACEFLOWOBSERVATIONFORWARDED | &quot;TraceflowObservationForwarded&quot;
TRACEFLOWOBSERVATIONDROPPED | &quot;TraceflowObservationDropped&quot;
TRACEFLOWOBSERVATIONDELIVERED | &quot;TraceflowObservationDelivered&quot;
TRACEFLOWOBSERVATIONRECEIVED | &quot;TraceflowObservationReceived&quot;
TRACEFLOWOBSERVATIONFORWARDEDLOGICAL | &quot;TraceflowObservationForwardedLogical&quot;
TRACEFLOWOBSERVATIONDROPPEDLOGICAL | &quot;TraceflowObservationDroppedLogical&quot;
TRACEFLOWOBSERVATIONRECEIVEDLOGICAL | &quot;TraceflowObservationReceivedLogical&quot;
TRACEFLOWOBSERVATIONREPLICATIONLOGICAL | &quot;TraceflowObservationReplicationLogical&quot;
TRACEFLOWOBSERVATIONRELAYEDLOGICAL | &quot;TraceflowObservationRelayedLogical&quot;

<a name="ComponentTypeEnum"></a>
## Enum: ComponentTypeEnum
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

<a name="TransportNodeTypeEnum"></a>
## Enum: TransportNodeTypeEnum
Name | Value
---- | -----
ESX | &quot;ESX&quot;
RHELKVM | &quot;RHELKVM&quot;
UBUNTUKVM | &quot;UBUNTUKVM&quot;
EDGE | &quot;EDGE&quot;
PUBLIC_CLOUD_GATEWAY_NODE | &quot;PUBLIC_CLOUD_GATEWAY_NODE&quot;
OTHERS | &quot;OTHERS&quot;
HYPERV | &quot;HYPERV&quot;
