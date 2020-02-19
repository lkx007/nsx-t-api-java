# Traceflow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operationState** | [**OperationStateEnum**](#OperationStateEnum) | Represents the traceflow operation state |  [optional]
**logicalCounters** | [**TraceflowObservationCounters**](TraceflowObservationCounters.md) |  |  [optional]
**timeout** | **Long** | Maximum time (in ms) the management plane will be waiting for this traceflow round. |  [optional]
**resultOverflowed** | **Boolean** | A flag, when set true, indicates some observations were deleted from the result set. |  [optional]
**lportId** | **String** | id of the source logical port used for injecting the traceflow packet |  [optional]
**counters** | [**TraceflowObservationCounters**](TraceflowObservationCounters.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | The status of the traceflow RPC request. SUCCESS - The traceflow request is sent successfully. TIMEOUT - The traceflow request gets timeout. SOURCE_PORT_NOT_FOUND - The source port of the request cannot be found. DATA_PATH_NOT_READY - The datapath component cannot be ready to receive request. CONNECTION_ERROR - There is connection error on datapath component. UNKNOWN - The status of traceflow request cannot be determined. |  [optional]
**analysis** | **List&lt;String&gt;** | Traceflow result analysis notes |  [optional]
**id** | **String** | The id of the traceflow round |  [optional]

<a name="OperationStateEnum"></a>
## Enum: OperationStateEnum
Name | Value
---- | -----
IN_PROGRESS | &quot;IN_PROGRESS&quot;
FINISHED | &quot;FINISHED&quot;
FAILED | &quot;FAILED&quot;

<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
TIMEOUT | &quot;TIMEOUT&quot;
SOURCE_PORT_NOT_FOUND | &quot;SOURCE_PORT_NOT_FOUND&quot;
DATA_PATH_NOT_READY | &quot;DATA_PATH_NOT_READY&quot;
CONNECTION_ERROR | &quot;CONNECTION_ERROR&quot;
UNKNOWN | &quot;UNKNOWN&quot;
