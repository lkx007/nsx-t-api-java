# NodeRouteProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**src** | **String** | Source address to prefer when sending to destinations of route |  [optional]
**fromAddress** | **String** | From address |  [optional]
**proto** | [**ProtoEnum**](#ProtoEnum) | Routing protocol identifier of route |  [optional]
**routeType** | [**RouteTypeEnum**](#RouteTypeEnum) | Route type | 
**metric** | **String** | Metric value of route |  [optional]
**destination** | **String** | Destination covered by route |  [optional]
**interfaceId** | **String** | Network interface id of route |  [optional]
**routeId** | **String** | Unique identifier for the route |  [optional]
**netmask** | **String** | Netmask of destination covered by route |  [optional]
**scope** | **String** | Scope of destinations covered by route |  [optional]
**gateway** | **String** | Address of next hop |  [optional]

<a name="ProtoEnum"></a>
## Enum: ProtoEnum
Name | Value
---- | -----
UNSPEC | &quot;unspec&quot;
REDIRECT | &quot;redirect&quot;
KERNEL | &quot;kernel&quot;
BOOT | &quot;boot&quot;
STATIC | &quot;static&quot;
GATED | &quot;gated&quot;
RA | &quot;ra&quot;
MRT | &quot;mrt&quot;
ZEBRA | &quot;zebra&quot;
BIRD | &quot;bird&quot;
DNROUTED | &quot;dnrouted&quot;
XORP | &quot;xorp&quot;
NTK | &quot;ntk&quot;
DHCP | &quot;dhcp&quot;

<a name="RouteTypeEnum"></a>
## Enum: RouteTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
STATIC | &quot;static&quot;
BLACKHOLE | &quot;blackhole&quot;
PROHIBIT | &quot;prohibit&quot;
THROW | &quot;throw&quot;
UNREACHABLE | &quot;unreachable&quot;
