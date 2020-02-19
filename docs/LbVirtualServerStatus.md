# LbVirtualServerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | UP means that all primary members in default pool are in UP status. For L7 virtual server, if there is no default pool, the virtual server would be treated as UP. PARTIALLY_UP means that some(not all) primary members in default pool are in UP status. The size of these active primary members should be larger than or equal to the certain number(min_active_members) which is defined in LbPool. When there are no backup members which are in the UP status, the number(min_active_members) would be ignored. PRIMARY_DOWN means that less than certain(min_active_members) primary members in default pool are in UP status but backup members are in UP status, the connections would be dispatched to backup members. DOWN means that all primary and backup members are in DOWN status. DETACHED means that the virtual server is not bound to any service. DISABLED means that the admin state of the virtual server is disabled. UNKNOWN means that no status reported from transport-nodes. The associated load balancer service may be working(or not working).  |  [optional]
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated. |  [optional]
**virtualServerId** | **String** | load balancer virtual server identifier | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
PARTIALLY_UP | &quot;PARTIALLY_UP&quot;
PRIMARY_DOWN | &quot;PRIMARY_DOWN&quot;
DOWN | &quot;DOWN&quot;
DETACHED | &quot;DETACHED&quot;
DISABLED | &quot;DISABLED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
