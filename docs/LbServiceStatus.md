# LbServiceStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pools** | [**List&lt;LbPoolStatus&gt;**](LbPoolStatus.md) | status of load balancer pools |  [optional]
**cpuUsage** | **Long** | Cpu usage in percentage |  [optional]
**activeTransportNodes** | **List&lt;String&gt;** | Ids of load balancer service related active transport nodes |  [optional]
**memoryUsage** | **Long** | Memory usage in percentage |  [optional]
**serviceId** | **String** | Load balancer service identifier | 
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated |  [optional]
**standbyTransportNodes** | **List&lt;String&gt;** | Ids of load balancer service related standby transport nodes |  [optional]
**errorMessage** | **String** | Error message, if available |  [optional]
**virtualServers** | [**List&lt;LbVirtualServerStatus&gt;**](LbVirtualServerStatus.md) | status of load balancer virtual servers |  [optional]
**serviceStatus** | [**ServiceStatusEnum**](#ServiceStatusEnum) | UP means the load balancer service is working fine on both transport-nodes(if have); DOWN means the load balancer service is down on both transport-nodes (if have), hence the load balancer will not respond to any requests; ERROR means error happens on transport-node(s) or no status is reported from transport-node(s). The load balancer service may be working (or not working); NO_STANDBY means load balancer service is working in one of the transport node while not in the other transport-node (if have). Hence if the load balancer service in the working transport-node goes down, the load balancer service will go down; DETACHED means that the load balancer service has no attachment setting and is not instantiated in any transport nodes; DISABLED means that admin state of load balancer service is DISABLED; UNKNOWN means that no status reported from transport-nodes.The load balancer service may be working(or not working).  |  [optional]

<a name="ServiceStatusEnum"></a>
## Enum: ServiceStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
ERROR | &quot;ERROR&quot;
NO_STANDBY | &quot;NO_STANDBY&quot;
DETACHED | &quot;DETACHED&quot;
DISABLED | &quot;DISABLED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
