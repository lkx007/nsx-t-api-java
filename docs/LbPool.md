# LbPool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberGroup** | [**PoolMemberGroup**](PoolMemberGroup.md) |  |  [optional]
**snatTranslation** | [**LbSnatTranslation**](LbSnatTranslation.md) |  |  [optional]
**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | Load balancing algorithm, configurable per pool controls how the incoming connections are distributed among the members.  |  [optional]
**members** | [**List&lt;PoolMember&gt;**](PoolMember.md) | Server pool consists of one or more pool members. Each pool member is identified, typically, by an IP address and a port.  |  [optional]
**passiveMonitorId** | **String** | Passive healthchecks are disabled by default and can be enabled by attaching a passive health monitor to a server pool. Each time a client connection to a pool member fails, its failed count is incremented. For pools bound to L7 virtual servers, a connection is considered to be failed and failed count is incremented if any TCP connection errors (e.g. TCP RST or failure to send data) or SSL handshake failures occur. For pools bound to L4 virtual servers, if no response is received to a TCP SYN sent to the pool member or if a TCP RST is received in response to a TCP SYN, then the pool member is considered to have failed and the failed count is incremented.  |  [optional]
**tcpMultiplexingNumber** | **Long** | The maximum number of TCP connections per pool that are idly kept alive for sending future client requests.  |  [optional]
**activeMonitorIds** | **List&lt;String&gt;** | In case of active healthchecks, load balancer itself initiates new connections (or sends ICMP ping) to the servers periodically to check their health, completely independent of any data traffic. Active healthchecks are disabled by default and can be enabled for a server pool by binding a health monitor to the pool. Currently, only one active health monitor can be configured per server pool.  |  [optional]
**tcpMultiplexingEnabled** | **Boolean** | TCP multiplexing allows the same TCP connection between load balancer and the backend server to be used for sending multiple client requests from different client TCP connections.  |  [optional]
**minActiveMembers** | **Long** | A pool is considered active if there are at least certain minimum number of members.  |  [optional]

<a name="AlgorithmEnum"></a>
## Enum: AlgorithmEnum
Name | Value
---- | -----
ROUND_ROBIN | &quot;ROUND_ROBIN&quot;
WEIGHTED_ROUND_ROBIN | &quot;WEIGHTED_ROUND_ROBIN&quot;
LEAST_CONNECTION | &quot;LEAST_CONNECTION&quot;
WEIGHTED_LEAST_CONNECTION | &quot;WEIGHTED_LEAST_CONNECTION&quot;
IP_HASH | &quot;IP_HASH&quot;
