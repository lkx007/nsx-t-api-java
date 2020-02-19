# PrefixConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | Action for the IPPrefix | 
**ge** | **Long** | Greater than or equal to |  [optional]
**le** | **Long** | Less than or equal to |  [optional]
**network** | **String** | If absent, the action applies to all addresses. |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
PERMIT | &quot;PERMIT&quot;
DENY | &quot;DENY&quot;
