# DnsFailedQueries

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **String** | Timestamp of the request, in YYYY-MM-DD HH:MM:SS.zzz format.  |  [optional]
**perNodeFailedQueries** | [**List&lt;PerNodeDnsFailedQueries&gt;**](PerNodeDnsFailedQueries.md) | The array of failed DNS queries on active and standby transport node. If there is no standby node, the failed queries on standby node will not be present.  |  [optional]
