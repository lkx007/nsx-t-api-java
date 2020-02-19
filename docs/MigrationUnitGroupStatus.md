# MigrationUnitGroupStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Migration status of migration unit group |  [optional]
**failedCount** | **Integer** | Number of nodes in the migration unit group that failed migration |  [optional]
**migrationUnitCount** | **Integer** | Number of migration units in the group |  [optional]
**groupId** | **String** | Identifier for migration unit group |  [optional]
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of migration progress in percentage |  [optional]
**groupName** | **String** | Name of the migration unit group |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSED | &quot;PAUSED&quot;
