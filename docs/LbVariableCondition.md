# LbVariableCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variableValue** | **String** | Value of variable to be matched | 
**caseSensitive** | **Boolean** | If true, case is significant when comparing variable value.  |  [optional]
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of variable value |  [optional]
**variableName** | **String** | Name of the variable to be matched | 

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
