# ManualHealthCheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transportZoneId** | **String** | The entity ID works as a filter param. Entity ID and entity type should   be both provided or not at a query.  | 
**vlans** | [**HealthCheckSpecVlans**](HealthCheckSpecVlans.md) |  | 
**operationStatus** | [**OperationStatusEnum**](#OperationStatusEnum) | The operation status for health check  |  [optional]
**result** | [**HealthCheckResult**](HealthCheckResult.md) |  |  [optional]

<a name="OperationStatusEnum"></a>
## Enum: OperationStatusEnum
Name | Value
---- | -----
IN_PROGRESS | &quot;IN_PROGRESS&quot;
FINISHED | &quot;FINISHED&quot;
