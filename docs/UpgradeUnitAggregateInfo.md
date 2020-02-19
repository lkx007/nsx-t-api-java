# UpgradeUnitAggregateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of upgrade unit |  [optional]
**preUpgradeChecks** | [**UpgradeCheckListResults**](UpgradeCheckListResults.md) |  |  [optional]
**errors** | **List&lt;String&gt;** | List of errors occurred during upgrade of this upgrade unit |  [optional]
**displayName** | **String** | Name of the upgrade unit |  [optional]
**postUpgradeChecks** | [**UpgradeCheckListResults**](UpgradeCheckListResults.md) |  |  [optional]
**warnings** | **List&lt;String&gt;** | List of warnings indicating issues with the upgrade unit that may result in upgrade failure |  [optional]
**currentVersion** | **String** | This is component version e.g. if upgrade unit is of type edge, then this is edge version. |  [optional]
**group** | [**UpgradeUnitGroupInfo**](UpgradeUnitGroupInfo.md) |  |  [optional]
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of upgrade progress in percentage |  [optional]
**type** | **String** | Upgrade unit type |  [optional]
**id** | **String** | Identifier of the upgrade unit |  [optional]
**metadata** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Metadata about upgrade unit |  [optional]

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
