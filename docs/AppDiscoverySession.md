# AppDiscoverySession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The status of the session |  [optional]
**endTimestamp** | **Long** | End time of the session expressed in milliseconds since epoch |  [optional]
**startTimestamp** | **Long** | Start time of the session expressed in milliseconds since epoch |  [optional]
**failedReason** | **String** | The reason for the session status failure. |  [optional]
**reclassification** | [**ReclassificationEnum**](#ReclassificationEnum) | Some App Profiles that were part of the discovery session could be modified or deleted | after the session has been completed. NOT_REQUIRED status denotes that there were no such modifications. | REQUIRED status denotes some App Profiles that were part of the session has been modified/deleted and some | and some applications might not have been classfifed correctly. Use /session/&lt;session-id&gt;/reclassify API to| re-classfy the applications discovered based on app profiles.  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
FAILED | &quot;FAILED&quot;
RUNNING | &quot;RUNNING&quot;
FINISHED | &quot;FINISHED&quot;

<a name="ReclassificationEnum"></a>
## Enum: ReclassificationEnum
Name | Value
---- | -----
NOT_REQUIRED | &quot;NOT_REQUIRED&quot;
REQUIRED | &quot;REQUIRED&quot;
