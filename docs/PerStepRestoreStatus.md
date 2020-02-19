# PerStepRestoreStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the restore status |  [optional]
**value** | [**ValueEnum**](#ValueEnum) | Per step restore status value |  [optional]

<a name="ValueEnum"></a>
## Enum: ValueEnum
Name | Value
---- | -----
INITIAL | &quot;INITIAL&quot;
RUNNING | &quot;RUNNING&quot;
SUSPENDED_BY_USER | &quot;SUSPENDED_BY_USER&quot;
SUSPENDED_FOR_USER_ACTION | &quot;SUSPENDED_FOR_USER_ACTION&quot;
FAILED | &quot;FAILED&quot;
SUCCESS | &quot;SUCCESS&quot;
