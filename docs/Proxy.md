# Proxy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Specify the user name used to authenticate with the proxy server, if required.  |  [optional]
**host** | **String** | Specify the fully qualified domain name, or ip address, of the proxy server.  |  [optional]
**password** | **String** | Specify the password used to authenticate with the proxy server, if required.  |  [optional]
**scheme** | [**SchemeEnum**](#SchemeEnum) | The scheme accepted by the proxy server. Specify one of HTTP and HTTPS.  |  [optional]
**enabled** | **Boolean** | Flag to indicate if proxy is enabled. When set to true, a scheme, host and port must be provided.  | 
**port** | **Integer** | Specify the port of the proxy server. |  [optional]

<a name="SchemeEnum"></a>
## Enum: SchemeEnum
Name | Value
---- | -----
HTTP | &quot;HTTP&quot;
HTTPS | &quot;HTTPS&quot;
