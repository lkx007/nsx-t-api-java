# ServerSslProfileBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serverAuthCrlIds** | **List&lt;String&gt;** | A Certificate Revocation List (CRL) can be specified in the server-side SSL profile binding to disallow compromised server certificates.  |  [optional]
**serverAuth** | [**ServerAuthEnum**](#ServerAuthEnum) | server authentication mode |  [optional]
**certificateChainDepth** | **Long** | authentication depth is used to set the verification depth in the server certificates chain.  |  [optional]
**clientCertificateId** | **String** | To support client authentication (load balancer acting as a client authenticating to the backend server), client certificate can be specified in the server-side SSL profile binding  |  [optional]
**serverAuthCaIds** | **List&lt;String&gt;** | If server auth type is REQUIRED, server certificate must be signed by one of the trusted Certificate Authorities (CAs), also referred to as root CAs, whose self signed certificates are specified.  |  [optional]
**sslProfileId** | **String** | Server SSL profile defines reusable, application-independent server side SSL properties.  |  [optional]

<a name="ServerAuthEnum"></a>
## Enum: ServerAuthEnum
Name | Value
---- | -----
REQUIRED | &quot;REQUIRED&quot;
IGNORE | &quot;IGNORE&quot;
