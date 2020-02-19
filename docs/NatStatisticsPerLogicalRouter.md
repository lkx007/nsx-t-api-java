# NatStatisticsPerLogicalRouter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated; unset if data source has never updated the data. |  [optional]
**perTransportNodeStatistics** | [**List&lt;NatStatisticsPerTransportNode&gt;**](NatStatisticsPerTransportNode.md) | Detailed per node statistics |  [optional]
**statisticsAcrossAllNodes** | [**NatCounters**](NatCounters.md) |  |  [optional]
**logicalRouterId** | **String** | Id for the logical router |  [optional]
