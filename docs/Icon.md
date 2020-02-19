# Icon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placement** | [**PlacementEnum**](#PlacementEnum) | If specified as PRE, the icon appears before the UI element. If set as POST, the icon appears after the UI element. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Icon will be rendered based on its type. For example, if ERROR is chosen, then icon representing error will be rendered. |  [optional]
**tooltip** | [**List&lt;Tooltip&gt;**](Tooltip.md) | Multi-line text to be shown on tooltip while hovering over the icon. |  [optional]

<a name="PlacementEnum"></a>
## Enum: PlacementEnum
Name | Value
---- | -----
PRE | &quot;PRE&quot;
POST | &quot;POST&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ERROR | &quot;ERROR&quot;
WARNING | &quot;WARNING&quot;
INFO | &quot;INFO&quot;
INPROGRESS | &quot;INPROGRESS&quot;
SUCCESS | &quot;SUCCESS&quot;
DETAIL | &quot;DETAIL&quot;
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;
SECURITY | &quot;SECURITY&quot;
NETWORKING | &quot;NETWORKING&quot;
LOAD_BALANCER | &quot;LOAD_BALANCER&quot;
VPN | &quot;VPN&quot;
DOMAIN | &quot;DOMAIN&quot;
GROUP | &quot;GROUP&quot;
DISTRIBUTED_FIREWALL | &quot;DISTRIBUTED_FIREWALL&quot;
NETWORKING_TIER0 | &quot;NETWORKING_TIER0&quot;
NETWORKING_TIER1 | &quot;NETWORKING_TIER1&quot;
SEGMENT | &quot;SEGMENT&quot;
SYSTEM | &quot;SYSTEM&quot;
SYSTEM_FABRIC | &quot;SYSTEM_FABRIC&quot;
SYSTEM_BACKUPRESTORE | &quot;SYSTEM_BACKUPRESTORE&quot;
INVENTORY_GROUPS | &quot;INVENTORY_GROUPS&quot;
SECURITY_DFW | &quot;SECURITY_DFW&quot;
