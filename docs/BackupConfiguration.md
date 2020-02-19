# BackupConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteFileServer** | [**RemoteFileServer**](RemoteFileServer.md) |  | 
**backupEnabled** | **Boolean** | true if automated backup is enabled |  [optional]
**passphrase** | **String** | Passphrase used to encrypt backup files. The passphrase specified must be at least 8 characters in length and must contain at least one lowercase, one uppercase, one numeric character and one special character (any other non-space character).  |  [optional]
**backupSchedule** | [**BackupSchedule**](BackupSchedule.md) |  |  [optional]
**afterInventoryUpdateInterval** | **Long** | A number of seconds after a last backup, that needs to pass, before a topology change will trigger a generation of a new cluster/node backups. If parameter is not provided, then changes in a topology will not trigger a generation of cluster/node backups. |  [optional]
**inventorySummaryInterval** | **Long** | The minimum number of seconds between each upload of the inventory summary to backup server. |  [optional]
