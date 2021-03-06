# LbSslCipherInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isDefault** | **Boolean** | Default SSL cipher flag | 
**isSecure** | **Boolean** | Secure/insecure SSL cipher flag | 
**cipherGroupLabels** | [**List&lt;CipherGroupLabelsEnum&gt;**](#List&lt;CipherGroupLabelsEnum&gt;) | Several cipher groups might contain the same cipher suite, each cipher suite could have multiple cipher group labels.  |  [optional]
**cipher** | [**CipherEnum**](#CipherEnum) | SSL cipher | 

<a name="List<CipherGroupLabelsEnum>"></a>
## Enum: List&lt;CipherGroupLabelsEnum&gt;
Name | Value
---- | -----
BALANCED | &quot;BALANCED&quot;
HIGH_SECURITY | &quot;HIGH_SECURITY&quot;
HIGH_COMPATIBILITY | &quot;HIGH_COMPATIBILITY&quot;
CUSTOM | &quot;CUSTOM&quot;

<a name="CipherEnum"></a>
## Enum: CipherEnum
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
