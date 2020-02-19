# LbSourceIpPersistenceProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purge** | [**PurgeEnum**](#PurgeEnum) | persistence purge setting |  [optional]
**haPersistenceMirroringEnabled** | **Boolean** | Persistence entries are not synchronized to the HA peer by default.  |  [optional]
**timeout** | **Long** | When all connections complete (reference count reaches 0), persistence entry timer is started with the expiration time.  |  [optional]

<a name="PurgeEnum"></a>
## Enum: PurgeEnum
Name | Value
---- | -----
NO_PURGE | &quot;NO_PURGE&quot;
FULL | &quot;FULL&quot;
