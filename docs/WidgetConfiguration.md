# WidgetConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Supported visualization types are LabelValueConfiguration, DonutConfiguration, GridConfiguration, StatsConfiguration, MultiWidgetConfiguration, GraphConfiguration and ContainerConfiguration. | 
**displayName** | **String** | Title of the widget. If display_name is omitted, the widget will be shown without a title. |  [optional]
**datasources** | [**List&lt;Datasource&gt;**](Datasource.md) | The &#x27;datasources&#x27; represent the sources from which data will be fetched. Currently, only NSX-API is supported as a &#x27;default&#x27; datasource. An example of specifying &#x27;default&#x27; datasource along with the urls to fetch data from is given at &#x27;example_request&#x27; section of &#x27;CreateWidgetConfiguration&#x27; API. |  [optional]
**weight** | **Integer** | Specify relavite weight in WidgetItem for placement in a view. Please see WidgetItem for details. |  [optional]
**icons** | [**List&lt;Icon&gt;**](Icon.md) | Icons to be applied at dashboard for widgets and UI elements. |  [optional]
**shared** | **Boolean** | Please use the property &#x27;shared&#x27; of View instead of this. The widgets of a shared view are visible to other users. |  [optional]
**footer** | [**Footer**](Footer.md) |  |  [optional]
**drilldownId** | **String** | Id of drilldown widget, if any. Id should be a valid id of an existing widget. A widget is considered as drilldown widget when it is associated with any other widget and provides more detailed information about any data item from the parent widget. |  [optional]
**isDrilldown** | **Boolean** | Set to true if this widget should be used as a drilldown. |  [optional]
**legend** | [**Legend**](Legend.md) |  |  [optional]

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
LABELVALUECONFIGURATION | &quot;LabelValueConfiguration&quot;
DONUTCONFIGURATION | &quot;DonutConfiguration&quot;
MULTIWIDGETCONFIGURATION | &quot;MultiWidgetConfiguration&quot;
CONTAINERCONFIGURATION | &quot;ContainerConfiguration&quot;
STATSCONFIGURATION | &quot;StatsConfiguration&quot;
GRIDCONFIGURATION | &quot;GridConfiguration&quot;
GRAPHCONFIGURATION | &quot;GraphConfiguration&quot;
