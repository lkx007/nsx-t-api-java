# GraphConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**graphs** | [**List&lt;GraphDefinition&gt;**](GraphDefinition.md) | Graphs | 
**axes** | [**Axes**](Axes.md) |  |  [optional]
**navigation** | **String** | Hyperlink of the specified UI page that provides details. |  [optional]
**subType** | [**SubTypeEnum**](#SubTypeEnum) | Describes the the type of graph. LINE_GRAPH shows a line graph chart BAR_GRAPH shows a simple bar graph chart STACKED_BAR_GRAPH shows a stacked bar graph chart |  [optional]
**displayXValue** | **Boolean** | If true, value of a point is shown as label on X axis. If false, value of point is not shown as label on X axis. false can be useful in situations where there are too many points and showing the X value as label can clutter the X axis. |  [optional]

<a name="SubTypeEnum"></a>
## Enum: SubTypeEnum
Name | Value
---- | -----
LINE_GRAPH | &quot;LINE_GRAPH&quot;
BAR_GRAPH | &quot;BAR_GRAPH&quot;
STACKED_BAR_GRAPH | &quot;STACKED_BAR_GRAPH&quot;
