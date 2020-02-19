# BackupOperationStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupId** | **String** | Unique identifier of a backup | 
**endTime** | **Long** | Time when operation was ended |  [optional]
**success** | **Boolean** | True if backup is successfully completed, else false | 
**startTime** | **Long** | Time when operation was started |  [optional]
**errorMessage** | **String** | Error code details |  [optional]
**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) | Error code |  [optional]

<a name="ErrorCodeEnum"></a>
## Enum: ErrorCodeEnum
Name | Value
---- | -----
NOT_RUN_ON_MASTER | &quot;BACKUP_NOT_RUN_ON_MASTER&quot;
SERVER_UNREACHABLE | &quot;BACKUP_SERVER_UNREACHABLE&quot;
AUTHENTICATION_FAILURE | &quot;BACKUP_AUTHENTICATION_FAILURE&quot;
PERMISSION_ERROR | &quot;BACKUP_PERMISSION_ERROR&quot;
TIMEOUT | &quot;BACKUP_TIMEOUT&quot;
BAD_FINGERPRINT | &quot;BACKUP_BAD_FINGERPRINT&quot;
GENERIC_ERROR | &quot;BACKUP_GENERIC_ERROR&quot;
