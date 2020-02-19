# LbClientSslProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sessionCacheEnabled** | **Boolean** | SSL session caching allows SSL client and server to reuse previously negotiated security parameters avoiding the expensive public key operation during handshake.  |  [optional]
**sessionCacheTimeout** | **Long** | Session cache timeout specifies how long the SSL session parameters are held on to and can be reused.  |  [optional]
**cipherGroupLabel** | [**CipherGroupLabelEnum**](#CipherGroupLabelEnum) | It is a label of cipher group which is mostly consumed by GUI.  |  [optional]
**isFips** | **Boolean** | This flag is set to true when all the ciphers and protocols are FIPS compliant. It is set to false when one of the ciphers or protocols are not FIPS compliant..  |  [optional]
**isSecure** | **Boolean** | This flag is set to true when all the ciphers and protocols are secure. It is set to false when one of the ciphers or protocols is insecure.  |  [optional]
**preferServerCiphers** | **Boolean** | During SSL handshake as part of the SSL client Hello client sends an ordered list of ciphers that it can support (or prefers) and typically server selects the first one from the top of that list it can also support. For Perfect Forward Secrecy(PFS), server could override the client&#x27;s preference.  |  [optional]
**ciphers** | [**List&lt;CiphersEnum&gt;**](#List&lt;CiphersEnum&gt;) | supported SSL cipher list to client side |  [optional]
**protocols** | [**List&lt;ProtocolsEnum&gt;**](#List&lt;ProtocolsEnum&gt;) | SSL versions TLS1.1 and TLS1.2 are supported and enabled by default. SSLv2, SSLv3, and TLS1.0 are supported, but disabled by default.  |  [optional]

<a name="CipherGroupLabelEnum"></a>
## Enum: CipherGroupLabelEnum
Name | Value
---- | -----
BALANCED | &quot;BALANCED&quot;
HIGH_SECURITY | &quot;HIGH_SECURITY&quot;
HIGH_COMPATIBILITY | &quot;HIGH_COMPATIBILITY&quot;
CUSTOM | &quot;CUSTOM&quot;

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

<a name="List<ProtocolsEnum>"></a>
## Enum: List&lt;ProtocolsEnum&gt;
Name | Value
---- | -----
SSL_V2 | &quot;SSL_V2&quot;
SSL_V3 | &quot;SSL_V3&quot;
TLS_V1 | &quot;TLS_V1&quot;
TLS_V1_1 | &quot;TLS_V1_1&quot;
TLS_V1_2 | &quot;TLS_V1_2&quot;
