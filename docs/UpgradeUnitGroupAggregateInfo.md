# UpgradeUnitGroupAggregateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Upgrade status of upgrade unit group |  [optional]
**upgradeUnitCount** | **Integer** | Number of upgrade units in the group |  [optional]
**failedCount** | **Integer** | Number of nodes in the upgrade unit group that failed upgrade |  [optional]
**type** | **String** | Component type | 
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of upgrade progress in percentage |  [optional]
**postUpgradeStatus** | [**UpgradeChecksExecutionStatus**](UpgradeChecksExecutionStatus.md) |  |  [optional]
**enabled** | **Boolean** | Flag to indicate whether upgrade of this group is enabled or not |  [optional]
**upgradeUnits** | [**List&lt;UpgradeUnit&gt;**](UpgradeUnit.md) | List of upgrade units in the group |  [optional]
**extendedConfiguration** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Extended configuration for the group |  [optional]
**parallel** | **Boolean** | Upgrade method to specify whether the upgrade is to be performed in parallel or serially |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSING | &quot;PAUSING&quot;
PAUSED | &quot;PAUSED&quot;
