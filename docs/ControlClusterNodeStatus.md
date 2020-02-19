# ControlClusterNodeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mgmtConnectionStatus** | [**MgmtConnStatus**](MgmtConnStatus.md) |  |  [optional]
**controlClusterStatus** | [**ControlClusterStatusEnum**](#ControlClusterStatusEnum) | Status of this node&#x27;s connection to the control cluster |  [optional]

<a name="ControlClusterStatusEnum"></a>
## Enum: ControlClusterStatusEnum
Name | Value
---- | -----
CONNECTED | &quot;CONNECTED&quot;
DISCONNECTED | &quot;DISCONNECTED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
