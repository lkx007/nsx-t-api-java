# RenderConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color** | [**ColorEnum**](#ColorEnum) | The color to use when rendering an entity. For example, set color as &#x27;RED&#x27; to render a portion of donut in red. |  [optional]
**condition** | **String** | If the condition is met then the rendering specified for the condition will be applied. Examples of expression syntax are provided under &#x27;example_request&#x27; section of &#x27;CreateWidgetConfiguration&#x27; API. |  [optional]
**displayValue** | **String** | If specified, overrides the field value. This can be used to display a meaningful value in situations where field value is not available or not configured. |  [optional]
**tooltip** | [**List&lt;Tooltip&gt;**](Tooltip.md) | Multi-line text to be shown on tooltip while hovering over the UI element if the condition is met. |  [optional]
**icons** | [**List&lt;Icon&gt;**](Icon.md) | Icons to be applied at dashboard for widgets and UI elements. |  [optional]

<a name="ColorEnum"></a>
## Enum: ColorEnum
Name | Value
---- | -----
GREY | &quot;GREY&quot;
DARK_GREY | &quot;DARK_GREY&quot;
LIGHT_GREY | &quot;LIGHT_GREY&quot;
SKY_BLUE | &quot;SKY_BLUE&quot;
BLUE | &quot;BLUE&quot;
GREEN | &quot;GREEN&quot;
YELLOW | &quot;YELLOW&quot;
RED | &quot;RED&quot;
DARK_RED | &quot;DARK_RED&quot;
