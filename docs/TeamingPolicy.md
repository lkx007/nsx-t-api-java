# TeamingPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | [**PolicyEnum**](#PolicyEnum) | Teaming policy | 
**standbyList** | [**List&lt;Uplink&gt;**](Uplink.md) | List of Uplinks used in standby list |  [optional]
**activeList** | [**List&lt;Uplink&gt;**](Uplink.md) | List of Uplinks used in active list | 

<a name="PolicyEnum"></a>
## Enum: PolicyEnum
Name | Value
---- | -----
FAILOVER_ORDER | &quot;FAILOVER_ORDER&quot;
LOADBALANCE_SRCID | &quot;LOADBALANCE_SRCID&quot;
LOADBALANCE_SRC_MAC | &quot;LOADBALANCE_SRC_MAC&quot;
