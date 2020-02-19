# DnsForwarderStatistics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queriesForwarded** | **Long** | The total number of forwarded dns queries |  [optional]
**conditionalForwarderStatistics** | [**List&lt;PerForwarderStatistics&gt;**](PerForwarderStatistics.md) | The statistics of conditional forwarders |  [optional]
**defaultForwarderStatistics** | [**PerForwarderStatistics**](PerForwarderStatistics.md) |  |  [optional]
**queriesAnsweredLocally** | **Long** | The totocal number of queries answered from local cache |  [optional]
**usedCacheStatistics** | [**List&lt;PerNodeUsedCacheStatistics&gt;**](PerNodeUsedCacheStatistics.md) | The statistics of used cache |  [optional]
**configuredCacheSize** | **Long** | The configured cache size, in kb |  [optional]
**timestamp** | **Long** | Time stamp of the current statistics, in ms |  [optional]
**errorMessage** | **String** | Error message, if available |  [optional]
**totalQueries** | **Long** | The total number of received dns queries |  [optional]
