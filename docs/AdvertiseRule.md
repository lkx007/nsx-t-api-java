# AdvertiseRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | ALLOW action enables the advertisment and DENY action disables the advertisement of a filtered routes to the connected TIER0 router. |  [optional]
**ruleFilter** | [**AdvertisementRuleFilter**](AdvertisementRuleFilter.md) |  |  [optional]
**displayName** | **String** | Display name |  [optional]
**networks** | **List&lt;String&gt;** | network(CIDR) to be routed | 
**description** | **String** | Description |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
DENY | &quot;DENY&quot;
ALLOW | &quot;ALLOW&quot;
