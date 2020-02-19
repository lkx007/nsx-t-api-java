# LbHttpsMonitor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responseStatusCodes** | **List&lt;Integer&gt;** | The HTTP response status code should be a valid HTTP status code.  |  [optional]
**serverAuthCrlIds** | **List&lt;String&gt;** | A Certificate Revocation List (CRL) can be specified in the server-side SSL profile binding to disallow compromised server certificates.  |  [optional]
**serverAuthCaIds** | **List&lt;String&gt;** | If server auth type is REQUIRED, server certificate must be signed by one of the trusted Certificate Authorities (CAs), also referred to as root CAs, whose self signed certificates are specified.  |  [optional]
**serverAuth** | [**ServerAuthEnum**](#ServerAuthEnum) | server authentication mode |  [optional]
**requestBody** | **String** | String to send as part of HTTP health check request body. Valid only for certain HTTP methods like POST.  |  [optional]
**responseBody** | **String** | If HTTP response body match string (regular expressions not supported) is specified (using LbHttpMonitor.response_body) then the healthcheck HTTP response body is matched against the specified string and server is considered healthy only if there is a match. If the response body string is not specified, HTTP healthcheck is considered successful if the HTTP response status code is 2xx, but it can be configured to accept other status codes as successful.  |  [optional]
**ciphers** | [**List&lt;CiphersEnum&gt;**](#List&lt;CiphersEnum&gt;) | supported SSL cipher list to servers |  [optional]
**requestHeaders** | [**List&lt;LbHttpRequestHeader&gt;**](LbHttpRequestHeader.md) | Array of HTTP request headers |  [optional]
**clientCertificateId** | **String** | client certificate can be specified to support client authentication.  |  [optional]
**requestMethod** | [**RequestMethodEnum**](#RequestMethodEnum) | the health check method for HTTP monitor type |  [optional]
**isFips** | **Boolean** | This flag is set to true when all the ciphers and protocols are FIPS compliant. It is set to false when one of the ciphers or protocols are not FIPS compliant..  |  [optional]
**certificateChainDepth** | **Long** | authentication depth is used to set the verification depth in the server certificates chain.  |  [optional]
**isSecure** | **Boolean** | This flag is set to true when all the ciphers and protocols are secure. It is set to false when one of the ciphers or protocols is insecure.  |  [optional]
**requestUrl** | **String** | URL used for HTTP monitor |  [optional]
**cipherGroupLabel** | [**CipherGroupLabelEnum**](#CipherGroupLabelEnum) | It is a label of cipher group which is mostly consumed by GUI.  |  [optional]
**requestVersion** | [**RequestVersionEnum**](#RequestVersionEnum) | HTTP request version |  [optional]
**protocols** | [**List&lt;ProtocolsEnum&gt;**](#List&lt;ProtocolsEnum&gt;) | SSL versions TLS1.1 and TLS1.2 are supported and enabled by default. SSLv2, SSLv3, and TLS1.0 are supported, but disabled by default.  |  [optional]

<a name="ServerAuthEnum"></a>
## Enum: ServerAuthEnum
Name | Value
---- | -----
REQUIRED | &quot;REQUIRED&quot;
IGNORE | &quot;IGNORE&quot;

<a name="List<CiphersEnum>"></a>
## Enum: List&lt;CiphersEnum&gt;
Name | Value
---- | -----
ECDHE_RSA_WITH_AES_128_GCM_SHA256 | &quot;TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256&quot;
ECDHE_RSA_WITH_AES_256_GCM_SHA384 | &quot;TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384&quot;
ECDHE_RSA_WITH_AES_256_CBC_SHA | &quot;TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA&quot;
ECDHE_ECDSA_WITH_AES_256_CBC_SHA | &quot;TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA&quot;
ECDH_ECDSA_WITH_AES_256_CBC_SHA | &quot;TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA&quot;
ECDH_RSA_WITH_AES_256_CBC_SHA | &quot;TLS_ECDH_RSA_WITH_AES_256_CBC_SHA&quot;
RSA_WITH_AES_256_CBC_SHA | &quot;TLS_RSA_WITH_AES_256_CBC_SHA&quot;
RSA_WITH_AES_128_CBC_SHA | &quot;TLS_RSA_WITH_AES_128_CBC_SHA&quot;
RSA_WITH_3DES_EDE_CBC_SHA | &quot;TLS_RSA_WITH_3DES_EDE_CBC_SHA&quot;
ECDHE_RSA_WITH_AES_128_CBC_SHA | &quot;TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA&quot;
ECDHE_RSA_WITH_AES_128_CBC_SHA256 | &quot;TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256&quot;
ECDHE_RSA_WITH_AES_256_CBC_SHA384 | &quot;TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384&quot;
RSA_WITH_AES_128_CBC_SHA256 | &quot;TLS_RSA_WITH_AES_128_CBC_SHA256&quot;
RSA_WITH_AES_128_GCM_SHA256 | &quot;TLS_RSA_WITH_AES_128_GCM_SHA256&quot;
RSA_WITH_AES_256_CBC_SHA256 | &quot;TLS_RSA_WITH_AES_256_CBC_SHA256&quot;
RSA_WITH_AES_256_GCM_SHA384 | &quot;TLS_RSA_WITH_AES_256_GCM_SHA384&quot;
ECDHE_ECDSA_WITH_AES_128_CBC_SHA | &quot;TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA&quot;
ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 | &quot;TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256&quot;
ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 | &quot;TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256&quot;
ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 | &quot;TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384&quot;
ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 | &quot;TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384&quot;
ECDH_ECDSA_WITH_AES_128_CBC_SHA | &quot;TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA&quot;
ECDH_ECDSA_WITH_AES_128_CBC_SHA256 | &quot;TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256&quot;
ECDH_ECDSA_WITH_AES_128_GCM_SHA256 | &quot;TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256&quot;
ECDH_ECDSA_WITH_AES_256_CBC_SHA384 | &quot;TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384&quot;
ECDH_ECDSA_WITH_AES_256_GCM_SHA384 | &quot;TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384&quot;
ECDH_RSA_WITH_AES_128_CBC_SHA | &quot;TLS_ECDH_RSA_WITH_AES_128_CBC_SHA&quot;
ECDH_RSA_WITH_AES_128_CBC_SHA256 | &quot;TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256&quot;
ECDH_RSA_WITH_AES_128_GCM_SHA256 | &quot;TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256&quot;
ECDH_RSA_WITH_AES_256_CBC_SHA384 | &quot;TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384&quot;
ECDH_RSA_WITH_AES_256_GCM_SHA384 | &quot;TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384&quot;

<a name="RequestMethodEnum"></a>
## Enum: RequestMethodEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
OPTIONS | &quot;OPTIONS&quot;
POST | &quot;POST&quot;
HEAD | &quot;HEAD&quot;
PUT | &quot;PUT&quot;

<a name="CipherGroupLabelEnum"></a>
## Enum: CipherGroupLabelEnum
Name | Value
---- | -----
BALANCED | &quot;BALANCED&quot;
HIGH_SECURITY | &quot;HIGH_SECURITY&quot;
HIGH_COMPATIBILITY | &quot;HIGH_COMPATIBILITY&quot;
CUSTOM | &quot;CUSTOM&quot;

<a name="RequestVersionEnum"></a>
## Enum: RequestVersionEnum
Name | Value
---- | -----
_1_0 | &quot;HTTP_VERSION_1_0&quot;
_1_1 | &quot;HTTP_VERSION_1_1&quot;
_2_0 | &quot;HTTP_VERSION_2_0&quot;

<a name="List<ProtocolsEnum>"></a>
## Enum: List&lt;ProtocolsEnum&gt;
Name | Value
---- | -----
SSL_V2 | &quot;SSL_V2&quot;
SSL_V3 | &quot;SSL_V3&quot;
TLS_V1 | &quot;TLS_V1&quot;
TLS_V1_1 | &quot;TLS_V1_1&quot;
TLS_V1_2 | &quot;TLS_V1_2&quot;
