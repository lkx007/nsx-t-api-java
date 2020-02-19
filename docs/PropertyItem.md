# PropertyItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | Represents field value of the property. | 
**separator** | **Boolean** | If true, separates this property in a widget. |  [optional]
**renderConfiguration** | [**List&lt;RenderConfiguration&gt;**](RenderConfiguration.md) | Render configuration to be applied, if any. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Data type of the field. | 
**heading** | **Boolean** | Set to true if the field is a heading. Default is false. |  [optional]
**condition** | **String** | If the condition is met then the property will be displayed. Examples of expression syntax are provided under &#x27;example_request&#x27; section of &#x27;CreateWidgetConfiguration&#x27; API. |  [optional]
**label** | [**Label**](Label.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
STRING | &quot;String&quot;
NUMBER | &quot;Number&quot;
DATE | &quot;Date&quot;
URL | &quot;Url&quot;
