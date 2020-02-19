# LogicalRouterPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logicalRouterId** | **String** | Identifier for logical router on which this port is created | 
**serviceBindings** | [**List&lt;ServiceBinding&gt;**](ServiceBinding.md) | Service Bindings |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | LogicalRouterUpLinkPort is allowed only on TIER0 logical router.   It is the north facing port of the logical router. LogicalRouterLinkPortOnTIER0 is allowed only on TIER0 logical router.   This is the port where the LogicalRouterLinkPortOnTIER1 of TIER1 logical router connects to. LogicalRouterLinkPortOnTIER1 is allowed only on TIER1 logical router.   This is the port using which the user connected to TIER1 logical router for upwards connectivity via TIER0 logical router.   Connect this port to the LogicalRouterLinkPortOnTIER0 of the TIER0 logical router. LogicalRouterDownLinkPort is for the connected subnets on the logical router. LogicalRouterLoopbackPort is a loopback port for logical router component   which is placed on chosen edge cluster member. LogicalRouterIPTunnelPort is a IPSec VPN tunnel port created on   logical router when route based VPN session configured. LogicalRouterCentralizedServicePort is allowed only on Active/Standby TIER0 and TIER1   logical router. Port can be connected to VLAN or overlay logical switch.   Unlike downlink port it does not participate in distributed routing and hosted   on all edge cluster members associated with logical router.   Stateful services can be applied on this port.  | 

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
LOGICALROUTERUPLINKPORT | &quot;LogicalRouterUpLinkPort&quot;
LOGICALROUTERDOWNLINKPORT | &quot;LogicalRouterDownLinkPort&quot;
LOGICALROUTERLINKPORTONTIER0 | &quot;LogicalRouterLinkPortOnTIER0&quot;
LOGICALROUTERLINKPORTONTIER1 | &quot;LogicalRouterLinkPortOnTIER1&quot;
LOGICALROUTERLOOPBACKPORT | &quot;LogicalRouterLoopbackPort&quot;
LOGICALROUTERIPTUNNELPORT | &quot;LogicalRouterIPTunnelPort&quot;
LOGICALROUTERCENTRALIZEDSERVICEPORT | &quot;LogicalRouterCentralizedServicePort&quot;
