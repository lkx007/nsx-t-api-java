# ServiceRouterAllocationConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edgeClusterMemberIndices** | **List&lt;Long&gt;** | For TIER 1 logical router, for manual placement of service router within the cluster, edge cluster member indices needs to be provided else same will be auto-allocated. You can provide maximum two indices for HA ACTIVE_STANDBY.  |  [optional]
**allocationPool** | [**EdgeClusterMemberAllocationPool**](EdgeClusterMemberAllocationPool.md) |  |  [optional]
**edgeClusterId** | **String** | To reallocate TIER1 logical router on new or existing edge cluster  | 
