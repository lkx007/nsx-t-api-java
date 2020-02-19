# LbHttpRequestCookieCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of cookie value |  [optional]
**cookieName** | **String** | Name of cookie | 
**cookieValue** | **String** | Value of cookie | 
**caseSensitive** | **Boolean** | If true, case is significant when comparing cookie value.  |  [optional]

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
