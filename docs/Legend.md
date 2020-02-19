# Legend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**position** | [**PositionEnum**](#PositionEnum) | Describes the relative placement of legend. The legend of a widget can be placed either to the TOP or BOTTOM or LEFT or RIGHT relative to the widget. For example, if RIGHT is chosen then legend is placed to the right of the widget. |  [optional]
**displayCount** | **Boolean** | If set to true, it will display the counts in legend. If set to false, counts of entities are not displayed in the legend. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Describes the render type for the legend. The legend for an entity describes the entity in the widget. The supported legend type is a circle against which the entity&#x27;s details such as display_name are shown. The color of the circle denotes the color of the entity shown inside the widget. |  [optional]
**alignment** | [**AlignmentEnum**](#AlignmentEnum) | Describes the alignment of legend. Alignment of a legend denotes how individual items of the legend are aligned in a container. For example, if VERTICAL is chosen then the items of the legend will appear one below the other and if HORIZONTAL is chosen then the items will appear side by side. |  [optional]

<a name="PositionEnum"></a>
## Enum: PositionEnum
Name | Value
---- | -----
TOP | &quot;TOP&quot;
BOTTOM | &quot;BOTTOM&quot;
LEFT | &quot;LEFT&quot;
RIGHT | &quot;RIGHT&quot;
TOP_RIGHT | &quot;TOP_RIGHT&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CIRCLE | &quot;CIRCLE&quot;

<a name="AlignmentEnum"></a>
## Enum: AlignmentEnum
Name | Value
---- | -----
HORIZONTAL | &quot;HORIZONTAL&quot;
VERTICAL | &quot;VERTICAL&quot;
