# FirewallStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalSessionCount** | **Long** | Aggregated number of sessions processed by the all firewall rules. This is aggregated statistic which are computed with lower frequency compared to individual generic rule statistics. It may have a computation delay up to 15 minutes in response to this API. |  [optional]
**packetCount** | **Long** | Aggregated number of packets processed by the rule. |  [optional]
**popularityIndex** | **Long** | This is calculated by sessions count divided by age of the rule. |  [optional]
**maxSessionCount** | **Long** | Maximum value of sessions count of all firewall rules of the type. This is aggregated statistic which are computed with lower frequency compared to generic rule statistics. It may have a computation delay up to 15 minutes in response to this API. |  [optional]
**byteCount** | **Long** | Aggregated number of bytes processed by the rule. |  [optional]
**maxPopularityIndex** | **Long** | Maximum value of popularity index of all firewall rules of the type. This is aggregated statistic which are computed with lower frequency compared to individual generic rule statistics. It may have a computation delay up to 15 minutes in response to this API. |  [optional]
**hitCount** | **Long** | Aggregated number of hits received by the rule. |  [optional]
**sessionCount** | **Long** | Aggregated number of sessions processed by the rule. |  [optional]
**ruleId** | **String** | Rule Identifier of the Firewall rule. This is a globally unique number. |  [optional]
