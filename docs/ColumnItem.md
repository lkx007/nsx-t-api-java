# ColumnItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sortKey** | **String** | Sorting on column is based on the sort_key. sort_key represents the field in the output data on which sort is requested. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Data type of the field. | 
**tooltip** | [**List&lt;Tooltip&gt;**](Tooltip.md) | Multi-line text to be shown on tooltip while hovering over a cell in the grid. |  [optional]
**label** | [**Label**](Label.md) |  | 
**field** | **String** | Field from which values of the column will be derived. | 
**sortAscending** | **Boolean** | If true, the value of the column are sorted in ascending order. Otherwise, in descending order. |  [optional]
**drilldownId** | **String** | Id of drilldown widget, if any. Id should be a valid id of an existing widget. |  [optional]
**hidden** | **Boolean** | If set to true, hides the column |  [optional]
**navigation** | **String** | Hyperlink of the specified UI page that provides details. If drilldown_id is provided, then navigation cannot be used. |  [optional]
**columnIdentifier** | **String** | Identifies the column and used for fetching content upon an user click or drilldown. If column identifier is not provided, the column&#x27;s data will not participate in searches and drilldowns. |  [optional]
**renderConfiguration** | [**List&lt;RenderConfiguration&gt;**](RenderConfiguration.md) | Render configuration to be applied, if any. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
STRING | &quot;String&quot;
NUMBER | &quot;Number&quot;
DATE | &quot;Date&quot;
