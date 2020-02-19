# LbHttpRequestUriCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of URI |  [optional]
**uri** | **String** | A string used to identify resource | 
**caseSensitive** | **Boolean** | If true, case is significant when comparing URI.  |  [optional]

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
