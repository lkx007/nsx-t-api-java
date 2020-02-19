# DnsForwarder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditionalForwarders** | [**List&lt;ConditionalForwarderZone&gt;**](ConditionalForwarderZone.md) | The conditional zone forwarders. During matching a zone forwarder, the DNS forwarder will use the conditional fowarder with the longest domain name that matches the query.  |  [optional]
**logicalRouterId** | **String** | Specify the LogicalRouter where the DnsForwarder runs. The HA mode of the hosting LogicalRouter must be Active/Standby.  | 
**cacheSize** | **Integer** | One DNS answer cache entry will consume ~120 bytes. Hence 1 KB cache size can cache ~8 DNS answer entries, and the default 1024 KB cache size can hold ~8k DNS answer entries.  |  [optional]
**defaultForwarder** | [**ForwarderZone**](ForwarderZone.md) |  | 
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Log level of the DNS forwarder |  [optional]
**enabled** | **Boolean** | Flag to enable/disable the forwarder |  [optional]
**listenerIp** | **String** | The ip address the DNS forwarder listens on. It can be an ip address already owned by the logical-router uplink port or router-link, or a loopback port ip address. But it can not be a downlink port address. User needs to ensure the address is reachable via router or NAT from both client VMs and upstream servers. User will need to create Firewall rules if needed to allow such traffic on a Tier-1 or Tier-0.  | 

<a name="LogLevelEnum"></a>
## Enum: LogLevelEnum
Name | Value
---- | -----
DEBUG | &quot;DEBUG&quot;
INFO | &quot;INFO&quot;
WARNING | &quot;WARNING&quot;
ERROR | &quot;ERROR&quot;
FATAL | &quot;FATAL&quot;
