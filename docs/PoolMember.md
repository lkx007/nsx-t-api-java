# PoolMember

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxConcurrentConnections** | **Long** | To ensure members are not overloaded, connections to a member can be capped by the load balancer. When a member reaches this limit, it is skipped during server selection. If it is not specified, it means that connections are unlimited.  |  [optional]
**adminState** | [**AdminStateEnum**](#AdminStateEnum) | member admin state |  [optional]
**backupMember** | **Boolean** | Backup servers are typically configured with a sorry page indicating to the user that the application is currently unavailable. While the pool is active (a specified minimum number of pool members are active) BACKUP members are skipped during server selection. When the pool is inactive, incoming connections are sent to only the BACKUP member(s).  |  [optional]
**weight** | **Long** | Pool member weight is used for WEIGHTED_ROUND_ROBIN balancing algorithm. The weight value would be ignored in other algorithms.  |  [optional]
**displayName** | **String** | pool member name |  [optional]
**ipAddress** | **String** | pool member IP address | 
**port** | **String** | If port is specified, all connections will be sent to this port. Only single port is supported. If unset, the same port the client connected to will be used, it could be overrode by default_pool_member_port setting in virtual server. The port should not specified for port range case.  |  [optional]

<a name="AdminStateEnum"></a>
## Enum: AdminStateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
GRACEFUL_DISABLED | &quot;GRACEFUL_DISABLED&quot;
