# NodeServiceStatusProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**health** | **String** | Service health in addition to runtime_state |  [optional]
**pids** | **List&lt;Long&gt;** | Service process ids |  [optional]
**runtimeState** | [**RuntimeStateEnum**](#RuntimeStateEnum) | Service runtime state |  [optional]
**monitorRuntimeState** | [**MonitorRuntimeStateEnum**](#MonitorRuntimeStateEnum) | Service monitor runtime state |  [optional]
**monitorPid** | **Long** | Service monitor process id |  [optional]

<a name="RuntimeStateEnum"></a>
## Enum: RuntimeStateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
STOPPED | &quot;stopped&quot;

<a name="MonitorRuntimeStateEnum"></a>
## Enum: MonitorRuntimeStateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
STOPPED | &quot;stopped&quot;
