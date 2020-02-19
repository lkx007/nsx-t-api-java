# TransportNodeState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentProgressState** | [**TransportNodeDeploymentProgressState**](TransportNodeDeploymentProgressState.md) |  |  [optional]
**nodeDeploymentState** | [**ConfigurationState**](ConfigurationState.md) |  |  [optional]
**hostSwitchStates** | [**List&lt;HostSwitchState&gt;**](HostSwitchState.md) | States of HostSwitches on the host |  [optional]
**maintenanceModeState** | [**MaintenanceModeStateEnum**](#MaintenanceModeStateEnum) | the present realized maintenance mode state |  [optional]
**transportNodeId** | **String** | Unique Id of the TransportNode |  [optional]

<a name="MaintenanceModeStateEnum"></a>
## Enum: MaintenanceModeStateEnum
Name | Value
---- | -----
ENTERING | &quot;ENTERING&quot;
ENABLED | &quot;ENABLED&quot;
EXITING | &quot;EXITING&quot;
DISABLED | &quot;DISABLED&quot;
