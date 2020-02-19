# CurrentBackupOperationStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentStep** | [**CurrentStepEnum**](#CurrentStepEnum) | Current step of operation |  [optional]
**backupId** | **String** | Unique identifier of current backup |  [optional]
**currentStepMessage** | **String** | Additional human-readable status information about current step |  [optional]
**endTime** | **Long** | Time when operation is expected to end |  [optional]
**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | Type of operation that is in progress. Returns none if no operation is in progress, in which case none of the other fields will be set.  | 
**startTime** | **Long** | Time when operation was started |  [optional]

<a name="CurrentStepEnum"></a>
## Enum: CurrentStepEnum
Name | Value
---- | -----
CLUSTER_BACKUP | &quot;BACKUP_CREATING_CLUSTER_BACKUP&quot;
NODE_BACKUP | &quot;BACKUP_CREATING_NODE_BACKUP&quot;

<a name="OperationTypeEnum"></a>
## Enum: OperationTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
BACKUP | &quot;BACKUP&quot;
