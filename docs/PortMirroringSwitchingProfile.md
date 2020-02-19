# PortMirroringSwitchingProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snapLength** | **Long** | If this property not set, original package will not be truncated. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | port mirroring direction |  [optional]
**key** | **Long** | User-configurable 32-bit key |  [optional]
**destinations** | **List&lt;String&gt;** | List of destination addresses |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
INGRESS | &quot;INGRESS&quot;
EGRESS | &quot;EGRESS&quot;
BIDIRECTIONAL | &quot;BIDIRECTIONAL&quot;
