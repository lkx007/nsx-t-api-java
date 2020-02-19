# TelemetryProxy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Specify the user name used to authenticate with the proxy server, if required.  |  [optional]
**password** | **String** | Specify the password used to authenticate with the proxy server, if required. A GET call on /telemetry/config returns a non-meaningful password to maintain security. To change the password to a new value, issue a PUT call after updating this field. To remove the password, issue a PUT call after emptying this field. To retain a previously set password, issue a PUT call keeping the non-meaningful value obtained from the GET call.  |  [optional]
**scheme** | [**SchemeEnum**](#SchemeEnum) | The scheme accepted by the proxy server. Specify one of HTTP and HTTPS.  | 
**hostname** | **String** | Specify the fully qualified domain name, or ip address, of the proxy server.  | 
**port** | **Integer** | Specify the port of the proxy server. | 

<a name="SchemeEnum"></a>
## Enum: SchemeEnum
Name | Value
---- | -----
HTTP | &quot;HTTP&quot;
HTTPS | &quot;HTTPS&quot;
