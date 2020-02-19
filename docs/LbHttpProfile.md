# LbHttpProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responseTimeout** | **Long** | If server doesn&#x27;t send any packet within this time, the connection is closed.  |  [optional]
**idleTimeout** | **Long** | It is used to specify the HTTP application idle timeout, it means that how long the load balancer will keep the connection idle to wait for the client to send the next keep-alive request. It is not a TCP socket setting.  |  [optional]
**requestBodySize** | **Long** | If it is not specified, it means that request body size is unlimited.  |  [optional]
**responseHeaderSize** | **Long** | A response with header larger than response_header_size will be dropped.  |  [optional]
**ntlm** | **Boolean** | NTLM is an authentication protocol that can be used over HTTP. If the flag is set to true, LB will use NTLM challenge/response methodology.  |  [optional]
**requestHeaderSize** | **Long** | A request with header larger than request_header_size will be processed as best effort whereas a request with header below this specified size is guaranteed to be processed.  |  [optional]
**httpRedirectTo** | **String** | If a website is temporarily down or has moved, incoming requests for that virtual server can be temporarily redirected to a URL  |  [optional]
**xForwardedFor** | [**XForwardedForEnum**](#XForwardedForEnum) | insert or replace x_forwarded_for |  [optional]
**httpRedirectToHttps** | **Boolean** | Certain secure applications may want to force communication over SSL, but instead of rejecting non-SSL connections, they may choose to redirect the client automatically to use SSL.  |  [optional]

<a name="XForwardedForEnum"></a>
## Enum: XForwardedForEnum
Name | Value
---- | -----
INSERT | &quot;INSERT&quot;
REPLACE | &quot;REPLACE&quot;
