# DSInsertParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) | Operation |  [optional]
**id** | **String** | Identifier of the anchor rule or section. This is a required field in case operation like &#x27;insert_before&#x27; and &#x27;insert_after&#x27;. |  [optional]

<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
TOP | &quot;insert_top&quot;
BOTTOM | &quot;insert_bottom&quot;
AFTER | &quot;insert_after&quot;
BEFORE | &quot;insert_before&quot;
