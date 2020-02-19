# MigrationSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetVersion** | **String** | Target system version |  [optional]
**migrationStatus** | [**MigrationStatusEnum**](#MigrationStatusEnum) | Status of migration |  [optional]
**migrationCoordinatorVersion** | **String** | Current version of migration coordinator |  [optional]
**systemVersion** | **String** | Current system version |  [optional]
**componentTargetVersions** | [**List&lt;ComponentTargetVersion&gt;**](ComponentTargetVersion.md) |  |  [optional]

<a name="MigrationStatusEnum"></a>
## Enum: MigrationStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSED | &quot;PAUSED&quot;
