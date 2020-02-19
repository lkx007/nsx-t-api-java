# UpgradeChecksExecutionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of execution of pre/post-upgrade checks |  [optional]
**startTime** | **Long** | Time (in milliseconds since epoch) when the execution of pre/post-upgrade checks started  |  [optional]
**nodeWithIssuesCount** | **Integer** | Number of nodes which generated failures or warnings during pre/post-upgrade checks  |  [optional]
**endTime** | **Long** | Time (in milliseconds since epoch) when the execution of pre/post-upgrade checks completed  |  [optional]
**details** | **String** | Details about current execution of pre/post-upgrade checks |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
COMPLETED | &quot;COMPLETED&quot;
