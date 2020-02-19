# LbHttpRequestHeaderCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headerValue** | **String** | Value of HTTP header | 
**caseSensitive** | **Boolean** | If true, case is significant when comparing HTTP header value.  |  [optional]
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of HTTP header value |  [optional]
**headerName** | **String** | Name of HTTP header | 

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
