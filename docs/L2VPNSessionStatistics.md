# L2VPNSessionStatistics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trafficStatisticsPerLogicalSwitch** | [**List&lt;L2VPNPerLSTrafficStatistics&gt;**](L2VPNPerLSTrafficStatistics.md) | Traffic statistics per logical switch. |  [optional]
**displayName** | **String** | L2VPN display name. |  [optional]
**partialStats** | **Boolean** | Partial statistics is set to true if onle active node responds while standby does not. In case of both nodes responded statistics will be summed and partial stats will be false. If cluster has only active node, partial statistics will always be false. |  [optional]
**sessionId** | **String** | Session identifier for L2VPN. |  [optional]
**tapTrafficCounters** | [**List&lt;L2VPNTapTrafficStatistics&gt;**](L2VPNTapTrafficStatistics.md) | Tunnel port traffic counters. |  [optional]
