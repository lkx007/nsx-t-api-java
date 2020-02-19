# ClusterRestoreStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GlobalRestoreStatus**](GlobalRestoreStatus.md) |  |  [optional]
**step** | [**RestoreStep**](RestoreStep.md) |  |  [optional]
**endpoints** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | The list of allowed endpoints, based on the current state of the restore process  |  [optional]
**totalSteps** | **Long** | Total number of steps in the entire restore process |  [optional]
**restoreStartTime** | **Long** | Timestamp when restore was started in epoch millisecond |  [optional]
**restoreEndTime** | **Long** | Timestamp when restore was completed in epoch millisecond |  [optional]
**backupTimestamp** | **Long** | Timestamp when backup was initiated in epoch millisecond |  [optional]
**id** | **String** | Unique id for backup request |  [optional]
**instructions** | [**List&lt;InstructionInfo&gt;**](InstructionInfo.md) | Instructions for users to reconcile Restore operations |  [optional]
