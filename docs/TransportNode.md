# TransportNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostSwitchSpec** | [**HostSwitchSpec**](HostSwitchSpec.md) |  |  [optional]
**nodeId** | **String** | Unique Id of the fabric node |  [optional]
**nodeDeploymentInfo** | [**Node**](Node.md) |  |  [optional]
**hostSwitches** | [**List&lt;HostSwitch&gt;**](HostSwitch.md) | This property is deprecated in favor of &#x27;host_switch_spec&#x27;. Property &#x27;host_switches&#x27; can only be used for NSX managed transport nodes. &#x27;host_switch_spec&#x27; can be used for both NSX managed or manually preconfigured host switches. |  [optional]
**maintenanceMode** | [**MaintenanceModeEnum**](#MaintenanceModeEnum) | The property is read-only, used for querying result. User could update transport node maintenance mode by UpdateTransportNodeMaintenanceMode call. |  [optional]
**failureDomainId** | **String** | Set failure domain of edge transport node which will help in auto placement of TIER1 logical routers, DHCP Servers and MDProxies, if failure domain based allocation is enabled in edge cluster API. It is only supported for edge transport node and not for host transport node. In case failure domain is not set by user explicitly, it will be always assigned with default system created failure domain.  |  [optional]
**isOverridden** | **Boolean** | This flag is relevant to only those hosts which are part of a compute collection which has transport node profile (TNP) applied on it. If you change the transport node configuration and it is different than cluster level TNP then this flag will be set to true  |  [optional]
**transportZoneEndpoints** | [**List&lt;TransportZoneEndPoint&gt;**](TransportZoneEndPoint.md) | Transport zone endpoints. |  [optional]

<a name="MaintenanceModeEnum"></a>
## Enum: MaintenanceModeEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
FORCE_ENABLED | &quot;FORCE_ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
