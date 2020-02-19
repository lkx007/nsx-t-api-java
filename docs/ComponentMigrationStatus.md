# ComponentMigrationStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Migration status of component |  [optional]
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of migration progress in percentage |  [optional]
**canSkip** | **Boolean** | Can the migration of the remaining units in this component be skipped |  [optional]
**details** | **String** | Details about the migration status |  [optional]
**componentType** | **String** | Component type for the migration status |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSED | &quot;PAUSED&quot;
