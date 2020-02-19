# IPMirrorDestination

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationIps** | **List&lt;String&gt;** | The destination IPs of the mirror packet will be sent to. | 
**encapsulationType** | [**EncapsulationTypeEnum**](#EncapsulationTypeEnum) | You can choose GRE, ERSPAN II or ERSPAN III. | 
**erspanId** | **Integer** | Used by physical switch for the mirror traffic forwarding. Must be provided and only effective when encapsulation type is ERSPAN type II or type III.  |  [optional]
**greKey** | **Integer** | User-configurable 32-bit key only for GRE |  [optional]

<a name="EncapsulationTypeEnum"></a>
## Enum: EncapsulationTypeEnum
Name | Value
---- | -----
GRE | &quot;GRE&quot;
ERSPAN_TWO | &quot;ERSPAN_TWO&quot;
ERSPAN_THREE | &quot;ERSPAN_THREE&quot;
