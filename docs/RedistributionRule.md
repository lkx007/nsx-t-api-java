# RedistributionRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sources** | [**List&lt;SourcesEnum&gt;**](#List&lt;SourcesEnum&gt;) | Array of redistribution protocols | 
**routeMapId** | **String** | RouteMap Id for the filter |  [optional]
**description** | **String** | Description |  [optional]
**displayName** | **String** | Display name |  [optional]
**destination** | [**DestinationEnum**](#DestinationEnum) | Destination redistribution protocol | 
**addressFamily** | [**AddressFamilyEnum**](#AddressFamilyEnum) | Address family for Route Redistribution |  [optional]

<a name="List<SourcesEnum>"></a>
## Enum: List&lt;SourcesEnum&gt;
Name | Value
---- | -----
STATIC | &quot;STATIC&quot;
T0_STATIC | &quot;T0_STATIC&quot;
NSX_CONNECTED | &quot;NSX_CONNECTED&quot;
T0_CONNECTED | &quot;T0_CONNECTED&quot;
NSX_STATIC | &quot;NSX_STATIC&quot;
T1_STATIC | &quot;T1_STATIC&quot;
T0_UPLINK | &quot;T0_UPLINK&quot;
T0_DOWNLINK | &quot;T0_DOWNLINK&quot;
T0_ROUTER_LINK | &quot;T0_ROUTER_LINK&quot;
T0_CSP | &quot;T0_CSP&quot;
T0_LOOPBACK | &quot;T0_LOOPBACK&quot;
T0_DNS_FORWARDER_IP | &quot;T0_DNS_FORWARDER_IP&quot;
T0_IPSEC_LOCAL_IP | &quot;T0_IPSEC_LOCAL_IP&quot;
TIER0_NAT | &quot;TIER0_NAT&quot;
T0_NAT | &quot;T0_NAT&quot;
TIER1_NAT | &quot;TIER1_NAT&quot;
T1_NAT | &quot;T1_NAT&quot;
TIER1_LB_VIP | &quot;TIER1_LB_VIP&quot;
T1_LB_VIP | &quot;T1_LB_VIP&quot;
TIER1_LB_SNAT | &quot;TIER1_LB_SNAT&quot;
T1_LB_SNAT | &quot;T1_LB_SNAT&quot;
T1_DNS_FORWARDER_IP | &quot;T1_DNS_FORWARDER_IP&quot;
T1_CONNECTED | &quot;T1_CONNECTED&quot;
T1_DOWNLINK | &quot;T1_DOWNLINK&quot;
T1_CSP | &quot;T1_CSP&quot;
BGP | &quot;BGP&quot;
T1_IPSEC_LOCAL_IP | &quot;T1_IPSEC_LOCAL_IP&quot;

<a name="DestinationEnum"></a>
## Enum: DestinationEnum
Name | Value
---- | -----
STATIC | &quot;STATIC&quot;
T0_STATIC | &quot;T0_STATIC&quot;
NSX_CONNECTED | &quot;NSX_CONNECTED&quot;
T0_CONNECTED | &quot;T0_CONNECTED&quot;
NSX_STATIC | &quot;NSX_STATIC&quot;
T1_STATIC | &quot;T1_STATIC&quot;
T0_UPLINK | &quot;T0_UPLINK&quot;
T0_DOWNLINK | &quot;T0_DOWNLINK&quot;
T0_ROUTER_LINK | &quot;T0_ROUTER_LINK&quot;
T0_CSP | &quot;T0_CSP&quot;
T0_LOOPBACK | &quot;T0_LOOPBACK&quot;
T0_DNS_FORWARDER_IP | &quot;T0_DNS_FORWARDER_IP&quot;
T0_IPSEC_LOCAL_IP | &quot;T0_IPSEC_LOCAL_IP&quot;
TIER0_NAT | &quot;TIER0_NAT&quot;
T0_NAT | &quot;T0_NAT&quot;
TIER1_NAT | &quot;TIER1_NAT&quot;
T1_NAT | &quot;T1_NAT&quot;
TIER1_LB_VIP | &quot;TIER1_LB_VIP&quot;
T1_LB_VIP | &quot;T1_LB_VIP&quot;
TIER1_LB_SNAT | &quot;TIER1_LB_SNAT&quot;
T1_LB_SNAT | &quot;T1_LB_SNAT&quot;
T1_DNS_FORWARDER_IP | &quot;T1_DNS_FORWARDER_IP&quot;
T1_CONNECTED | &quot;T1_CONNECTED&quot;
T1_DOWNLINK | &quot;T1_DOWNLINK&quot;
T1_CSP | &quot;T1_CSP&quot;
BGP | &quot;BGP&quot;
T1_IPSEC_LOCAL_IP | &quot;T1_IPSEC_LOCAL_IP&quot;

<a name="AddressFamilyEnum"></a>
## Enum: AddressFamilyEnum
Name | Value
---- | -----
IPV4 | &quot;IPV4&quot;
IPV6 | &quot;IPV6&quot;
IPV4_AND_IPV6 | &quot;IPV4_AND_IPV6&quot;
