# LbCookiePersistenceProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cookieGarble** | **Boolean** | If garble is set to true, cookie value (server IP and port) would be encrypted. If garble is set to false, cookie value would be plain text.  |  [optional]
**cookieFallback** | **Boolean** | If fallback is true, once the cookie points to a server that is down (i.e. admin state DISABLED or healthcheck state is DOWN), then a new server is selected by default to handle that request. If fallback is false, it will cause the request to be rejected if cookie points to a server  |  [optional]
**cookieMode** | [**CookieModeEnum**](#CookieModeEnum) | cookie persistence mode |  [optional]
**cookieDomain** | **String** | HTTP cookie domain could be configured, only available for insert mode.  |  [optional]
**cookieName** | **String** | cookie name | 
**cookieTime** | [**LbCookieTime**](LbCookieTime.md) |  |  [optional]
**cookiePath** | **String** | HTTP cookie path could be set, only available for insert mode.  |  [optional]

<a name="CookieModeEnum"></a>
## Enum: CookieModeEnum
Name | Value
---- | -----
INSERT | &quot;INSERT&quot;
PREFIX | &quot;PREFIX&quot;
REWRITE | &quot;REWRITE&quot;
