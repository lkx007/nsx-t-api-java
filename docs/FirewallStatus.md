# FirewallStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**globalStatus** | [**GlobalStatusEnum**](#GlobalStatusEnum) | Firewall status for a fabric entity or in global context where firewall is supported. | 
**context** | [**ContextEnum**](#ContextEnum) | Types of firewall contexts. | 
**targetStatuses** | [**List&lt;TargetResourceStatus&gt;**](TargetResourceStatus.md) | List of firewall status on various target logical resources. This will override the global status of corresponding firewall context (e.g it will override the gloabal status of logical_routers). |  [optional]

<a name="GlobalStatusEnum"></a>
## Enum: GlobalStatusEnum
Name | Value
---- | -----
DISABLED | &quot;DISABLED&quot;
ENABLED | &quot;ENABLED&quot;

<a name="ContextEnum"></a>
## Enum: ContextEnum
Name | Value
---- | -----
TRANSPORT_NODES | &quot;transport_nodes&quot;
LOGICAL_ROUTERS | &quot;logical_routers&quot;
