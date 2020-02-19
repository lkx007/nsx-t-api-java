# UpgradeUnitGroupStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Upgrade status of upgrade unit group |  [optional]
**upgradeUnitCount** | **Integer** | Number of upgrade units in the group |  [optional]
**failedCount** | **Integer** | Number of nodes in the upgrade unit group that failed upgrade |  [optional]
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of upgrade progress in percentage |  [optional]
**groupId** | **String** | Identifier for upgrade unit group |  [optional]
**groupName** | **String** | Name of the upgrade unit group |  [optional]

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
