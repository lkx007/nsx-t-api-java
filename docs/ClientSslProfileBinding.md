# ClientSslProfileBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientAuth** | [**ClientAuthEnum**](#ClientAuthEnum) | client authentication mode |  [optional]
**sslProfileId** | **String** | Client SSL profile defines reusable, application-independent client side SSL properties.  |  [optional]
**certificateChainDepth** | **Long** | authentication depth is used to set the verification depth in the client certificates chain.  |  [optional]
**clientAuthCaIds** | **List&lt;String&gt;** | If client auth type is REQUIRED, client certificate must be signed by one of the trusted Certificate Authorities (CAs), also referred to as root CAs, whose self signed certificates are specified.  |  [optional]
**defaultCertificateId** | **String** | A default certificate should be specified which will be used if the server does not host multiple hostnames on the same IP address or if the client does not support SNI extension.  | 
**sniCertificateIds** | **List&lt;String&gt;** | Client-side SSL profile binding allows multiple certificates, for different hostnames, to be bound to the same virtual server.  |  [optional]
**clientAuthCrlIds** | **List&lt;String&gt;** | A Certificate Revocation List (CRL) can be specified in the client-side SSL profile binding to disallow compromised client certificates.  |  [optional]

<a name="ClientAuthEnum"></a>
## Enum: ClientAuthEnum
Name | Value
---- | -----
REQUIRED | &quot;REQUIRED&quot;
IGNORE | &quot;IGNORE&quot;
