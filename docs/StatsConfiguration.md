# StatsConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navigation** | **String** | Hyperlink of the specified UI page that provides details. |  [optional]
**stat** | [**StatItem**](StatItem.md) |  |  [optional]
**sections** | [**List&lt;DonutSection&gt;**](DonutSection.md) | Sections |  [optional]
**subType** | [**SubTypeEnum**](#SubTypeEnum) | A sub-type of StatsConfiguration. If sub-type is not specified the parent type is rendered. The COMPACT sub_type, conserves the space for the widget. The statistic is placed on the right side on top of the status bar and the title of the widget is placed on the left side on the top of the status bar. The COMPACT style aligns itself horizontally as per the width of the container. If multiple widgets are placed insided the container then the widgets are placed one below the other to conserve the space. |  [optional]
**label** | [**Label**](Label.md) |  |  [optional]

<a name="SubTypeEnum"></a>
## Enum: SubTypeEnum
Name | Value
---- | -----
COMPACT | &quot;COMPACT&quot;
