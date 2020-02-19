# Alarm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sources** | [**AlarmSource**](AlarmSource.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | Alarm state | 
**sourceComp** | **String** | Alarm source component like nsx-manager, nsx-edge etc |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Severity of an Alarm |  [optional]
**sourceCompId** | **String** | Unique identifier(like UUID) for the node sending the Alarm |  [optional]
**timestamp** | **Long** | Date and time in UTC of the Alarm |  [optional]
**message** | **String** | Description of the Alarm | 
**id** | **String** | Unique identifier for an NSX Alarm |  [optional]
**sourceSubcomp** | **String** | Alarm source sub component like nsx-mpa etc |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
ACTIVE | &quot;ACTIVE&quot;
ACKNOWLEDGED | &quot;ACKNOWLEDGED&quot;
RESOLVED | &quot;RESOLVED&quot;

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
MINOR | &quot;MINOR&quot;
MAJOR | &quot;MAJOR&quot;
CRITICAL | &quot;CRITICAL&quot;
