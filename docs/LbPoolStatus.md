# LbPoolStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | UP means that all primary members are in UP status. PARTIALLY_UP means that some(not all) primary members are in UP status, the number of these active members is larger or equal to certain number(min_active_members) which is defined in LbPool. When there are no backup members which are in the UP status, the number(min_active_members) would be ignored. PRIMARY_DOWN means that less than certain(min_active_members) primary members are in UP status but backup members are in UP status, connections to this pool would be dispatched to backup members. DOWN means that all primary and backup members are DOWN. DETACHED means that the pool is not bound to any virtual server. UNKNOWN means that the pool is not associated to any enabled virtual servers, or no status reported from transport-nodes, the associated load balancer service may be working(or not working).  |  [optional]
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated |  [optional]
**poolId** | **String** | Load balancer pool identifier | 
**members** | [**List&lt;LbPoolMemberStatus&gt;**](LbPoolMemberStatus.md) | Status of load balancer pool members |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
PARTIALLY_UP | &quot;PARTIALLY_UP&quot;
PRIMARY_DOWN | &quot;PRIMARY_DOWN&quot;
DOWN | &quot;DOWN&quot;
DETACHED | &quot;DETACHED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
