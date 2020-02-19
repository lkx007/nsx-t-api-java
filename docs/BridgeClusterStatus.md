# BridgeClusterStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated; unset if data source has never updated the data. |  [optional]
**health** | [**HealthEnum**](#HealthEnum) | The health status of the cluster |  [optional]
**clusterId** | **String** | The id of the cluster |  [optional]

<a name="HealthEnum"></a>
## Enum: HealthEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
