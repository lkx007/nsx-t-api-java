# LbSessionCookieTime

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cookieMaxIdle** | **Long** | Instead of using HTTP Cookie max-age and relying on client to expire the cookie, max idle time and/or max lifetime of the cookie can be used. Max idle time, if configured, specifies the maximum interval the cookie is valid for from the last time it was seen in a request. It is available for insert mode.  |  [optional]
**cookieMaxLife** | **Long** | Max life time, if configured, specifies the maximum interval the cookie is valid for from the first time the cookie was seen in a request. It is available for insert mode.  |  [optional]
