# MigrationStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overallMigrationStatus** | [**OverallMigrationStatusEnum**](#OverallMigrationStatusEnum) | Status of migration |  [optional]
**componentStatus** | [**List&lt;ComponentMigrationStatus&gt;**](ComponentMigrationStatus.md) | List of component statuses |  [optional]

<a name="OverallMigrationStatusEnum"></a>
## Enum: OverallMigrationStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSED | &quot;PAUSED&quot;
