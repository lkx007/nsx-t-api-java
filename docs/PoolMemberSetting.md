# PoolMemberSetting

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminState** | [**AdminStateEnum**](#AdminStateEnum) | Member admin state |  [optional]
**ipAddress** | **String** | Pool member IP address | 
**port** | **String** | Pool member port number |  [optional]
**weight** | **Long** | Only applicable to static pool members. If supplied for a pool defined by a grouping object, update API would fail.  |  [optional]
**displayName** | **String** | Only applicable to static pool members. If supplied for a pool defined by a grouping object, update API would fail.  |  [optional]

<a name="AdminStateEnum"></a>
## Enum: AdminStateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
GRACEFUL_DISABLED | &quot;GRACEFUL_DISABLED&quot;
