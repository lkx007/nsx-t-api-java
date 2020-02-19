# IPSecVPNTunnelProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encapsulationMode** | [**EncapsulationModeEnum**](#EncapsulationModeEnum) | Encapsulation Mode to be used for encryption of packet. Tunnel mode protects internal routing information by encrypting IP header of original packet. |  [optional]
**transformProtocol** | [**TransformProtocolEnum**](#TransformProtocolEnum) | IPSec transform specifies IPSec security protocol. |  [optional]
**digestAlgorithms** | [**List&lt;DigestAlgorithmsEnum&gt;**](#List&lt;DigestAlgorithmsEnum&gt;) | Algorithm to be used for message digest. Default digest algorithm is implicitly covered by default encryption algorithm \&quot;AES_GCM_128\&quot;. |  [optional]
**encryptionAlgorithms** | [**List&lt;EncryptionAlgorithmsEnum&gt;**](#List&lt;EncryptionAlgorithmsEnum&gt;) | Encryption algorithm to encrypt/decrypt the messages exchanged between IPSec VPN initiator and responder during tunnel negotiation. Default is AES_GCM_128. |  [optional]
**enablePerfectForwardSecrecy** | **Boolean** | If true, perfect forward secrecy (PFS) is enabled. |  [optional]
**dhGroups** | [**List&lt;DhGroupsEnum&gt;**](#List&lt;DhGroupsEnum&gt;) | Diffie-Hellman group to be used if PFS is enabled. Default is GROUP14. |  [optional]
**dfPolicy** | [**DfPolicyEnum**](#DfPolicyEnum) | Defragmentation policy helps to handle defragmentation bit present in the inner packet. COPY copies the defragmentation bit from the inner IP packet into the outer packet. CLEAR ignores the defragmentation bit present in the inner packet. |  [optional]
**saLifeTime** | **Long** | SA life time specifies the expiry time of security association. Default is 3600 seconds.  |  [optional]

<a name="EncapsulationModeEnum"></a>
## Enum: EncapsulationModeEnum
Name | Value
---- | -----
MODE | &quot;TUNNEL_MODE&quot;

<a name="TransformProtocolEnum"></a>
## Enum: TransformProtocolEnum
Name | Value
---- | -----
ESP | &quot;ESP&quot;

<a name="List<DigestAlgorithmsEnum>"></a>
## Enum: List&lt;DigestAlgorithmsEnum&gt;
Name | Value
---- | -----
SHA1 | &quot;SHA1&quot;
SHA2_256 | &quot;SHA2_256&quot;
SHA2_384 | &quot;SHA2_384&quot;
SHA2_512 | &quot;SHA2_512&quot;

<a name="List<EncryptionAlgorithmsEnum>"></a>
## Enum: List&lt;EncryptionAlgorithmsEnum&gt;
Name | Value
---- | -----
AES_128 | &quot;AES_128&quot;
AES_256 | &quot;AES_256&quot;
AES_GCM_128 | &quot;AES_GCM_128&quot;
AES_GCM_192 | &quot;AES_GCM_192&quot;
AES_GCM_256 | &quot;AES_GCM_256&quot;
NO_ENCRYPTION_AUTH_AES_GMAC_128 | &quot;NO_ENCRYPTION_AUTH_AES_GMAC_128&quot;
NO_ENCRYPTION_AUTH_AES_GMAC_192 | &quot;NO_ENCRYPTION_AUTH_AES_GMAC_192&quot;
NO_ENCRYPTION_AUTH_AES_GMAC_256 | &quot;NO_ENCRYPTION_AUTH_AES_GMAC_256&quot;
NO_ENCRYPTION | &quot;NO_ENCRYPTION&quot;

<a name="List<DhGroupsEnum>"></a>
## Enum: List&lt;DhGroupsEnum&gt;
Name | Value
---- | -----
GROUP2 | &quot;GROUP2&quot;
GROUP5 | &quot;GROUP5&quot;
GROUP14 | &quot;GROUP14&quot;
GROUP15 | &quot;GROUP15&quot;
GROUP16 | &quot;GROUP16&quot;
GROUP19 | &quot;GROUP19&quot;
GROUP20 | &quot;GROUP20&quot;
GROUP21 | &quot;GROUP21&quot;

<a name="DfPolicyEnum"></a>
## Enum: DfPolicyEnum
Name | Value
---- | -----
COPY | &quot;COPY&quot;
CLEAR | &quot;CLEAR&quot;
