# LbHttpMonitor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responseStatusCodes** | **List&lt;Integer&gt;** | The HTTP response status code should be a valid HTTP status code.  |  [optional]
**requestMethod** | [**RequestMethodEnum**](#RequestMethodEnum) | the health check method for HTTP monitor type |  [optional]
**requestBody** | **String** | String to send as part of HTTP health check request body. Valid only for certain HTTP methods like POST.  |  [optional]
**responseBody** | **String** | If HTTP response body match string (regular expressions not supported) is specified (using LbHttpMonitor.response_body) then the healthcheck HTTP response body is matched against the specified string and server is considered healthy only if there is a match. If the response body string is not specified, HTTP healthcheck is considered successful if the HTTP response status code is 2xx, but it can be configured to accept other status codes as successful.  |  [optional]
**requestUrl** | **String** | URL used for HTTP monitor |  [optional]
**requestVersion** | [**RequestVersionEnum**](#RequestVersionEnum) | HTTP request version |  [optional]
**requestHeaders** | [**List&lt;LbHttpRequestHeader&gt;**](LbHttpRequestHeader.md) | Array of HTTP request headers |  [optional]

<a name="RequestMethodEnum"></a>
## Enum: RequestMethodEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
OPTIONS | &quot;OPTIONS&quot;
POST | &quot;POST&quot;
HEAD | &quot;HEAD&quot;
PUT | &quot;PUT&quot;

<a name="RequestVersionEnum"></a>
## Enum: RequestVersionEnum
Name | Value
---- | -----
_1_0 | &quot;HTTP_VERSION_1_0&quot;
_1_1 | &quot;HTTP_VERSION_1_1&quot;
_2_0 | &quot;HTTP_VERSION_2_0&quot;
