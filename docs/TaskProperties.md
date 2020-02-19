# TaskProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Current status of the task |  [optional]
**asyncResponseAvailable** | **Boolean** | True if response for asynchronous request is available |  [optional]
**description** | **String** | Description of the task |  [optional]
**startTime** | **Long** | The start time of the task in epoch milliseconds |  [optional]
**cancelable** | **Boolean** | True if this task can be canceled |  [optional]
**requestMethod** | **String** | HTTP request method |  [optional]
**user** | **String** | Name of the user who created this task |  [optional]
**progress** | **Long** | Task progress if known, from 0 to 100 |  [optional]
**message** | **String** | A message describing the disposition of the task |  [optional]
**requestUri** | **String** | URI of the method invocation that spawned this task |  [optional]
**id** | **String** | Identifier for this task |  [optional]
**endTime** | **Long** | The end time of the task in epoch milliseconds |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
ERROR | &quot;error&quot;
SUCCESS | &quot;success&quot;
CANCELING | &quot;canceling&quot;
CANCELED | &quot;canceled&quot;
KILLED | &quot;killed&quot;
