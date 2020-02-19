# LbNodeUsageSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usagePercentage** | [**BigDecimal**](BigDecimal.md) | The overall usage percentage of all nodes for the load balancer services.  |  [optional]
**currentCreditNumber** | **Long** | The current credit number reflects the overall credit usage for all nodes.  |  [optional]
**nodeUsages** | [**List&lt;LbNodeUsage&gt;**](LbNodeUsage.md) | The property contains lb node usages for each node.  |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | The severity calculation is based on current credit usage percentage of load balancer for all nodes.  |  [optional]
**nodeCounts** | [**List&lt;LbNodeCountPerSeverity&gt;**](LbNodeCountPerSeverity.md) | The property identifies array of node count for each severity (RED, ORANGE and GREEN).  |  [optional]
**remainingCreditNumber** | **Long** | The remaining credit number is the overall remaining credits that can be used for load balancer service configuration for all nodes.  |  [optional]

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
GREEN | &quot;GREEN&quot;
ORANGE | &quot;ORANGE&quot;
RED | &quot;RED&quot;
