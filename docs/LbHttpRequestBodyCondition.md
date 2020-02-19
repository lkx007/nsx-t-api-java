# LbHttpRequestBodyCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bodyValue** | **String** | HTTP request body | 
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of HTTP body |  [optional]
**caseSensitive** | **Boolean** | If true, case is significant when comparing HTTP body value.  |  [optional]

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
