# LogicalRouter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edgeClusterMemberIndices** | **List&lt;Long&gt;** | For stateful services, the logical router should be associated with edge cluster. For TIER 1 logical router, for manual placement of service router within the cluster, edge cluster member indices needs to be provided else same will be auto-allocated. You can provide maximum two indices for HA ACTIVE_STANDBY. For TIER0 logical router this property is no use and placement is derived from logical router uplink or loopback port.  |  [optional]
**ipv6Profiles** | [**IPv6Profiles**](IPv6Profiles.md) |  |  [optional]
**allocationProfile** | [**EdgeClusterMemberAllocationProfile**](EdgeClusterMemberAllocationProfile.md) |  |  [optional]
**firewallSections** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of Firewall sections related to Logical Router. |  [optional]
**failoverMode** | [**FailoverModeEnum**](#FailoverModeEnum) | Determines the behavior when a logical router instance restarts after a failure. If set to PREEMPTIVE, the preferred node will take over, even if it causes another failure. If set to NON_PREEMPTIVE, then the instance that restarted will remain secondary. This property must not be populated unless the high_availability_mode property is set to ACTIVE_STANDBY. If high_availability_mode property is set to ACTIVE_STANDBY and this property is not specified then default will be NON_PREEMPTIVE.  |  [optional]
**advancedConfig** | [**LogicalRouterConfig**](LogicalRouterConfig.md) |  |  [optional]
**routerType** | [**RouterTypeEnum**](#RouterTypeEnum) | Type of Logical Router | 
**preferredEdgeClusterMemberIndex** | **Long** | Preferred edge cluster member index which is required for PREEMPTIVE failover mode. Used for Tier0 routers only.  |  [optional]
**highAvailabilityMode** | [**HighAvailabilityModeEnum**](#HighAvailabilityModeEnum) | High availability mode |  [optional]
**edgeClusterId** | **String** | Used for tier0 routers |  [optional]

<a name="FailoverModeEnum"></a>
## Enum: FailoverModeEnum
Name | Value
---- | -----
PREEMPTIVE | &quot;PREEMPTIVE&quot;
NON_PREEMPTIVE | &quot;NON_PREEMPTIVE&quot;

<a name="RouterTypeEnum"></a>
## Enum: RouterTypeEnum
Name | Value
---- | -----
TIER0 | &quot;TIER0&quot;
TIER1 | &quot;TIER1&quot;

<a name="HighAvailabilityModeEnum"></a>
## Enum: HighAvailabilityModeEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE_ACTIVE&quot;
STANDBY | &quot;ACTIVE_STANDBY&quot;
