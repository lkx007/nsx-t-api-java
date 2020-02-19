# AllClusterGroupStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overallStatus** | [**OverallStatusEnum**](#OverallStatusEnum) | Overall status of the cluster |  [optional]
**clusterId** | **String** | UUID of the cluster |  [optional]
**groups** | [**List&lt;ClusterGroupStatus&gt;**](ClusterGroupStatus.md) | Array of groups and their statuses |  [optional]

<a name="OverallStatusEnum"></a>
## Enum: OverallStatusEnum
Name | Value
---- | -----
STABLE | &quot;STABLE&quot;
DEGRADED | &quot;DEGRADED&quot;
UNAVAILABLE | &quot;UNAVAILABLE&quot;
