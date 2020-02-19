# PoolMemberGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupingObject** | [**ResourceReference**](ResourceReference.md) |  | 
**ipRevisionFilter** | [**IpRevisionFilterEnum**](#IpRevisionFilterEnum) | Ip revision filter is used to filter IPv4 or IPv6 addresses from the grouping object. If the filter is not specified, both IPv4 and IPv6 addresses would be used as server IPs. The link local and loopback addresses would be always filtered out.  |  [optional]
**maxIpListSize** | **Long** | The size is used to define the maximum number of grouping object IP address list. These IP addresses would be used as pool members. If the grouping object includes more than certain number of IP addresses, the redundant parts would be ignored and those IP addresses would not be treated as pool members. If the size is not specified, one member is budgeted for this dynamic pool so that the pool has at least one member even if some other dynamic pools grow beyond the capacity of load balancer service. Other members are picked according to available dynamic capacity. The unused members would be set to DISABLED so that the load balancer system itself is not overloaded during runtime.  |  [optional]
**port** | **Integer** | If port is specified, all connections will be sent to this port. If unset, the same port the client connected to will be used, it could be overridden by default_pool_member_ports setting in virtual server. The port should not specified for multiple ports case.  |  [optional]
**customizedMembers** | [**List&lt;PoolMemberSetting&gt;**](PoolMemberSetting.md) | The list is used to show the customized pool member settings. User can only user pool member action API to update the admin state for a specific IP address.  |  [optional]

<a name="IpRevisionFilterEnum"></a>
## Enum: IpRevisionFilterEnum
Name | Value
---- | -----
IPV4 | &quot;IPV4&quot;
IPV6 | &quot;IPV6&quot;
IPV4_IPV6 | &quot;IPV4_IPV6&quot;
