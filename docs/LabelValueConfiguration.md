# LabelValueConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**layout** | [**Layout**](Layout.md) |  |  [optional]
**navigation** | **String** | Hyperlink of the specified UI page that provides details. |  [optional]
**subType** | [**SubTypeEnum**](#SubTypeEnum) | A sub-type of LabelValueConfiguration. If sub-type is not specified the parent type is rendered. For VERTICALLY_ALIGNED sub_type, the value is placed below the label. |  [optional]
**properties** | [**List&lt;PropertyItem&gt;**](PropertyItem.md) | An array of label-value properties. | 

<a name="SubTypeEnum"></a>
## Enum: SubTypeEnum
Name | Value
---- | -----
ALIGNED | &quot;VERTICALLY_ALIGNED&quot;
