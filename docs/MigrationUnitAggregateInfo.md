# MigrationUnitAggregateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of migration unit |  [optional]
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of migration progress in percentage |  [optional]
**errors** | **List&lt;String&gt;** | List of errors occurred during migration of this migration unit |  [optional]
**unit** | [**MigrationUnit**](MigrationUnit.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSED | &quot;PAUSED&quot;
