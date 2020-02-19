# IPSecVPNSessionStatistics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ikeTrafficStatistics** | [**IPSecVPNIKETrafficStatistics**](IPSecVPNIKETrafficStatistics.md) |  |  [optional]
**displayName** | **String** | Display name of vpn session. |  [optional]
**policyStatistics** | [**List&lt;IPSecVPNPolicyTrafficStatistics&gt;**](IPSecVPNPolicyTrafficStatistics.md) | Gives aggregate traffic statistics across all ipsec tunnels and individual tunnel statistics. |  [optional]
**partialStats** | **Boolean** | Partial statistics if true specifies that the statistics are only from active node. |  [optional]
**ipsecVpnSessionId** | **String** | UUID of vpn session. |  [optional]
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated. |  [optional]
**ikeStatus** | [**IPSecVPNIKESessionStatus**](IPSecVPNIKESessionStatus.md) |  |  [optional]
**aggregateTrafficCounters** | [**IPSecVPNTrafficCounters**](IPSecVPNTrafficCounters.md) |  |  [optional]
