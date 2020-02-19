# LbHttpRequestUriArgumentsCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uriArguments** | **String** | URI arguments, aka query string of URI.  | 
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of URI arguments |  [optional]
**caseSensitive** | **Boolean** | If true, case is significant when comparing URI arguments.  |  [optional]

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
