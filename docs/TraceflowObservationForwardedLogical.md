# TraceflowObservationForwardedLogical

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**servicePathIndex** | **Long** | The path index of the service insertion component |  [optional]
**componentId** | **String** | The id of the component that forwarded the traceflow packet. |  [optional]
**resendType** | [**ResendTypeEnum**](#ResendTypeEnum) | ARP_UNKNOWN_FROM_CP - Unknown ARP query result emitted by control plane ND_NS_UNKNOWN_FROM_CP - Unknown neighbor solicitation query result emitted by control plane UNKNOWN - Unknown resend type |  [optional]
**lportName** | **String** | The name of the logical port through which the traceflow packet was forwarded. |  [optional]
**aclRuleId** | **Long** | The id of the acl rule that was applied to forward the traceflow packet |  [optional]
**serviceIndex** | **Long** | The index of the service insertion component |  [optional]
**dstComponentType** | [**DstComponentTypeEnum**](#DstComponentTypeEnum) | The type of the destination component to which the traceflow packet was forwarded. |  [optional]
**dstComponentName** | **String** | The name of the destination component to which the traceflow packet was forwarded. |  [optional]
**natRuleId** | **Long** | The ID of the NAT rule that was applied to forward the traceflow packet |  [optional]
**translatedSrcIp** | **String** | The translated source IP address of VPN/NAT |  [optional]
**translatedDstIp** | **String** | The translated destination IP address of VNP/NAT |  [optional]
**vni** | **Integer** | VNI for the logical network on which the traceflow packet was forwarded. |  [optional]
**lportId** | **String** | The id of the logical port through which the traceflow packet was forwarded. |  [optional]
**dstComponentId** | **String** | The id of the destination component to which the traceflow packet was forwarded. |  [optional]
**serviceTtl** | **Long** | The ttl of the service insertion component |  [optional]

<a name="ResendTypeEnum"></a>
## Enum: ResendTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
ARP_UNKNOWN_FROM_CP | &quot;ARP_UNKNOWN_FROM_CP&quot;
ND_NS_UNKNWON_FROM_CP | &quot;ND_NS_UNKNWON_FROM_CP&quot;

<a name="DstComponentTypeEnum"></a>
## Enum: DstComponentTypeEnum
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
