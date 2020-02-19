# ControlConnStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the control Node for e.g  UP, DOWN. |  [optional]
**controlNodeIp** | **String** | IP address of the control Node. |  [optional]
**failureStatus** | [**FailureStatusEnum**](#FailureStatusEnum) | Failure status of the control Node for e.g CONNECTION_REFUSED,INCOMPLETE_HOST_CERT. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;

<a name="FailureStatusEnum"></a>
## Enum: FailureStatusEnum
Name | Value
---- | -----
CONNECTION_REFUSED | &quot;CONNECTION_REFUSED&quot;
INCOMPLETE_HOST_CERT | &quot;INCOMPLETE_HOST_CERT&quot;
INCOMPLETE_CONTROLLER_CERT | &quot;INCOMPLETE_CONTROLLER_CERT&quot;
CONTROLLER_REJECTED_HOST_CERT | &quot;CONTROLLER_REJECTED_HOST_CERT&quot;
HOST_REJECTED_CONTROLLER_CERT | &quot;HOST_REJECTED_CONTROLLER_CERT&quot;
KEEP_ALIVE_TIMEOUT | &quot;KEEP_ALIVE_TIMEOUT&quot;
OTHER_SSL_ERROR | &quot;OTHER_SSL_ERROR&quot;
OTHER_ERROR | &quot;OTHER_ERROR&quot;
