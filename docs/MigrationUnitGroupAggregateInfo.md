# MigrationUnitGroupAggregateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Migration status of migration unit group |  [optional]
**failedCount** | **Integer** | Number of nodes in the migration unit group that failed migration |  [optional]
**group** | [**MigrationUnitGroup**](MigrationUnitGroup.md) |  | 
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of migration progress in percentage |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSED | &quot;PAUSED&quot;
