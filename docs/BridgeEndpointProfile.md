# BridgeEndpointProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failoverMode** | [**FailoverModeEnum**](#FailoverModeEnum) | Faileover mode can be preemmptive or non-preemptive |  [optional]
**edgeClusterMemberIndexes** | **List&lt;Integer&gt;** | First index will be used as the preferred member |  [optional]
**highAvailabilityMode** | [**HighAvailabilityModeEnum**](#HighAvailabilityModeEnum) | High avaialability mode can be active-active or active-standby |  [optional]
**edgeClusterId** | **String** | UUID of the edge cluster for this bridge endpoint | 

<a name="FailoverModeEnum"></a>
## Enum: FailoverModeEnum
Name | Value
---- | -----
PREEMPTIVE | &quot;PREEMPTIVE&quot;
NON_PREEMPTIVE | &quot;NON_PREEMPTIVE&quot;

<a name="HighAvailabilityModeEnum"></a>
## Enum: HighAvailabilityModeEnum
Name | Value
---- | -----
STANDBY | &quot;ACTIVE_STANDBY&quot;
