# LbMonitor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Load balancers monitor the health of backend servers to ensure traffic is not black holed. There are two types of healthchecks: active and passive. Passive healthchecks depend on failures in actual client traffic (e.g. RST from server in response to a client connection) to detect that the server or the application is down. In case of active healthchecks, load balancer itself initiates new connections (or sends ICMP ping) to the servers periodically to check their health, completely independent of any data traffic. Currently, active health monitors are supported for HTTP, HTTPS, TCP, UDP and ICMP protocols.  | 

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
LBHTTPMONITOR | &quot;LbHttpMonitor&quot;
LBHTTPSMONITOR | &quot;LbHttpsMonitor&quot;
LBICMPMONITOR | &quot;LbIcmpMonitor&quot;
LBTCPMONITOR | &quot;LbTcpMonitor&quot;
LBUDPMONITOR | &quot;LbUdpMonitor&quot;
LBPASSIVEMONITOR | &quot;LbPassiveMonitor&quot;
