# UpgradeSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upgradeCoordinatorUpdated** | **Boolean** | Has upgrade coordinator been updated after upload of upgrade bundle file |  [optional]
**targetVersion** | **String** | Target system version |  [optional]
**upgradeCoordinatorVersion** | **String** | Current version of upgrade coordinator |  [optional]
**upgradeStatus** | [**UpgradeStatusEnum**](#UpgradeStatusEnum) | Status of upgrade |  [optional]
**componentTargetVersions** | [**List&lt;ComponentTargetVersion&gt;**](ComponentTargetVersion.md) |  |  [optional]
**systemVersion** | **String** | Current system version |  [optional]
**upgradeBundleFileName** | **String** | Name of the last successfully uploaded upgrade bundle file |  [optional]

<a name="UpgradeStatusEnum"></a>
## Enum: UpgradeStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSING | &quot;PAUSING&quot;
PAUSED | &quot;PAUSED&quot;
