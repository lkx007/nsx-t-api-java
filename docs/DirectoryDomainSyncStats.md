# DirectoryDomainSyncStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prevSyncStatus** | [**PrevSyncStatusEnum**](#PrevSyncStatusEnum) | Directory domain previous sync status. It could be one of the following two states. |  [optional]
**avgFullSyncTime** | **Long** | All the historical full sync are counted in calculating the average full sync time in milliseconds. |  [optional]
**prevSyncType** | [**PrevSyncTypeEnum**](#PrevSyncTypeEnum) | Directory domain previous sync type. It could be one of the following three states. Right after the directory domain is configured, this field is set to IDLE. |  [optional]
**numFullSync** | **Long** | number of successful historical full sync initiated either by system or by API request. |  [optional]
**currentStateBeginTime** | **Long** | Since what time the current state has begun. The time is expressed in millisecond epoch time. |  [optional]
**avgDeltaSyncTime** | **Long** | All the historical delta sync are counted in calculating the average delta sync time in milliseconds. |  [optional]
**prevSyncError** | **String** | Directory domain previous sync status error if last status was failure. |  [optional]
**currentState** | [**CurrentStateEnum**](#CurrentStateEnum) | Current running state of the directory domain in synchronization life cycle. It could be one of the following three states. |  [optional]
**numDeltaSync** | **Long** | number of successful historical delta sync initiated either by system or by API request. |  [optional]
**prevSyncEndTime** | **Long** | Directory domain previous sync ending time expressed in millisecond epoch time. |  [optional]

<a name="PrevSyncStatusEnum"></a>
## Enum: PrevSyncStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="PrevSyncTypeEnum"></a>
## Enum: PrevSyncTypeEnum
Name | Value
---- | -----
IDLE | &quot;IDLE&quot;
FULL_SYNC | &quot;FULL_SYNC&quot;
DELTA_SYNC | &quot;DELTA_SYNC&quot;

<a name="CurrentStateEnum"></a>
## Enum: CurrentStateEnum
Name | Value
---- | -----
IDLE | &quot;IDLE&quot;
FULL_SYNC | &quot;FULL_SYNC&quot;
DELTA_SYNC | &quot;DELTA_SYNC&quot;
