# DirectoryDomainSyncSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullSyncCronExpr** | **String** | Directory domain full synchronization schedule using cron expression. For example, cron expression \&quot;0 0 12 ? * SUN *\&quot; means full sync is scheduled every Sunday midnight. If this object is null, it means there is no background cron job running for full sync. |  [optional]
**deltaSyncInterval** | **Long** | Directory domain delta synchronization interval time between two delta sync in minutes. |  [optional]
