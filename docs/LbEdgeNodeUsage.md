# LbEdgeNodeUsage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentCreditNumber** | **Long** | The current credit number reflects the current usage on the node. For example, configuring a medium load balancer on a node consumes 10 credits. If there are 2 medium instances configured on a node, the current credit number is 2 * 10 &#x3D; 20.  |  [optional]
**currentVirtualServers** | **Long** | The number of virtual servers configured on the node.  |  [optional]
**currentSmallLoadBalancerServices** | **Long** | The number of small load balancer services configured on the node.  |  [optional]
**currentPoolMembers** | **Long** | The number of pool members configured on the node.  |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | The severity calculation is based on current credit usage percentage of load balancer for one node.  |  [optional]
**currentPools** | **Long** | The number of pools configured on the node.  |  [optional]
**remainingPoolMembers** | **Long** | The remaining number of pool members which could be configured on the given edge node.  |  [optional]
**edgeClusterId** | **String** | The ID of edge cluster which contains the edge node.  |  [optional]
**remainingSmallLoadBalancerServices** | **Long** | The remaining number of small load balancer services which could be configured on the given edge node.  |  [optional]
**formFactor** | [**FormFactorEnum**](#FormFactorEnum) | The form factor of the given edge node.  |  [optional]
**usagePercentage** | [**BigDecimal**](BigDecimal.md) | The usage percentage of one edge node for the load balancer services.  |  [optional]
**currentLargeLoadBalancerServices** | **Long** | The number of large load balancer services configured on the node.  |  [optional]
**remainingCreditNumber** | **Long** | The remaining credit number is the remaining credits that can be used for load balancer service configuration. For example, an edge node with form factor LARGE_VIRTUAL_MACHINE has 40 credits, and a medium load balancer instance costs 10 credits. If there are currently 3 medium instances configured, the remaining credit number is 40 - (3 * 10) &#x3D; 10.  |  [optional]
**remainingLargeLoadBalancerServices** | **Long** | The remaining number of large load balancer services which could be configured on the given edge node.  |  [optional]
**remainingMediumLoadBalancerServices** | **Long** | The remaining number of medium load balancer services which could be configured on the given edge node.  |  [optional]
**currentMediumLoadBalancerServices** | **Long** | The number of medium load balancer services configured on the node.  |  [optional]

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
GREEN | &quot;GREEN&quot;
ORANGE | &quot;ORANGE&quot;
RED | &quot;RED&quot;

<a name="FormFactorEnum"></a>
## Enum: FormFactorEnum
Name | Value
---- | -----
SMALL_VIRTUAL_MACHINE | &quot;SMALL_VIRTUAL_MACHINE&quot;
MEDIUM_VIRTUAL_MACHINE | &quot;MEDIUM_VIRTUAL_MACHINE&quot;
LARGE_VIRTUAL_MACHINE | &quot;LARGE_VIRTUAL_MACHINE&quot;
PHYSICAL_MACHINE | &quot;PHYSICAL_MACHINE&quot;
