# TraceflowObservationDropped

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**natRuleId** | **Long** | The ID of the NAT rule that was applied to forward the traceflow packet |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason traceflow packet was dropped |  [optional]
**lportId** | **String** | The id of the logical port at which the traceflow packet was dropped |  [optional]
**lportName** | **String** | The name of the logical port at which the traceflow packet was dropped |  [optional]
**aclRuleId** | **Long** | The id of the acl rule that was applied to drop the traceflow packet |  [optional]
**arpFailReason** | [**ArpFailReasonEnum**](#ArpFailReasonEnum) | This field specifies the ARP fails reason ARP_TIMEOUT - ARP failure due to query control plane timeout ARP_CPFAIL - ARP failure due post ARP query message to control plane failure ARP_FROMCP - ARP failure due to deleting ARP entry from control plane ARP_PORTDESTROY - ARP failure due to port destruction ARP_TABLEDESTROY - ARP failure due to ARP table destruction ARP_NETDESTROY - ARP failure due to overlay network destruction |  [optional]

<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
ARP_FAIL | &quot;ARP_FAIL&quot;
BFD | &quot;BFD&quot;
DHCP | &quot;DHCP&quot;
FW_RULE | &quot;FW_RULE&quot;
GENEVE | &quot;GENEVE&quot;
GRE | &quot;GRE&quot;
IFACE | &quot;IFACE&quot;
IP | &quot;IP&quot;
IP_REASS | &quot;IP_REASS&quot;
IPSEC | &quot;IPSEC&quot;
IPSEC_VTI | &quot;IPSEC_VTI&quot;
L2VPN | &quot;L2VPN&quot;
L4PORT | &quot;L4PORT&quot;
LB | &quot;LB&quot;
LROUTER | &quot;LROUTER&quot;
LSERVICE | &quot;LSERVICE&quot;
LSWITCH | &quot;LSWITCH&quot;
MD_PROXY | &quot;MD_PROXY&quot;
NAT | &quot;NAT&quot;
ND_NS_FAIL | &quot;ND_NS_FAIL&quot;
NEIGH | &quot;NEIGH&quot;
NO_EIP_FOUND | &quot;NO_EIP_FOUND&quot;
NO_EIP_ASSOCIATION | &quot;NO_EIP_ASSOCIATION&quot;
NO_ENI_FOR_IP | &quot;NO_ENI_FOR_IP&quot;
NO_ENI_FOR_LIF | &quot;NO_ENI_FOR_LIF&quot;
NO_ROUTE | &quot;NO_ROUTE&quot;
NO_ROUTE_TABLE_FOUND | &quot;NO_ROUTE_TABLE_FOUND&quot;
NO_UNDERLAY_ROUTE_FOUND | &quot;NO_UNDERLAY_ROUTE_FOUND&quot;
NOT_VDR_DOWNLINK_ | &quot;NOT_VDR_DOWNLINK,&quot;
NO_VDR_FOUND | &quot;NO_VDR_FOUND&quot;
NO_VDR_ON_HOST | &quot;NO_VDR_ON_HOST&quot;
NOT_VDR_UPLINK_ | &quot;NOT_VDR_UPLINK,&quot;
SERVICE_INSERT | &quot;SERVICE_INSERT&quot;
TTL_ZERO | &quot;TTL_ZERO&quot;
TUNNEL | &quot;TUNNEL&quot;
VXLAN | &quot;VXLAN&quot;
VXSTT | &quot;VXSTT&quot;
VMC_NO_RESPONSE | &quot;VMC_NO_RESPONSE&quot;
WRONG_UPLINK | &quot;WRONG_UPLINK&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="ArpFailReasonEnum"></a>
## Enum: ArpFailReasonEnum
Name | Value
---- | -----
UNKNOWN | &quot;ARP_UNKNOWN&quot;
TIMEOUT | &quot;ARP_TIMEOUT&quot;
CPFAIL | &quot;ARP_CPFAIL&quot;
FROMCP | &quot;ARP_FROMCP&quot;
PORTDESTROY | &quot;ARP_PORTDESTROY&quot;
TABLEDESTROY | &quot;ARP_TABLEDESTROY&quot;
NETDESTROY | &quot;ARP_NETDESTROY&quot;
