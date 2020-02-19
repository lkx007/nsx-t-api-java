# UpgradeHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **Long** | Timestamp (in milliseconds since epoch) when the upgrade was performed | 
**targetVersion** | **String** | Version being upgraded to | 
**initialVersion** | **String** | Version before the upgrade started | 
**upgradeStatus** | [**UpgradeStatusEnum**](#UpgradeStatusEnum) | Status of the upgrade | 

<a name="UpgradeStatusEnum"></a>
## Enum: UpgradeStatusEnum
Name | Value
---- | -----
STARTED | &quot;STARTED&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
