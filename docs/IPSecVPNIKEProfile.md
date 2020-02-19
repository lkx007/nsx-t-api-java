# IPSecVPNIKEProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**digestAlgorithms** | [**List&lt;DigestAlgorithmsEnum&gt;**](#List&lt;DigestAlgorithmsEnum&gt;) | Algorithm to be used for message digest during Internet Key Exchange(IKE) negotiation. Default is SHA2_256. |  [optional]
**encryptionAlgorithms** | [**List&lt;EncryptionAlgorithmsEnum&gt;**](#List&lt;EncryptionAlgorithmsEnum&gt;) | Encryption algorithm is used during Internet Key Exchange(IKE) negotiation. Default is AES_128. |  [optional]
**dhGroups** | [**List&lt;DhGroupsEnum&gt;**](#List&lt;DhGroupsEnum&gt;) | Diffie-Hellman group to be used if PFS is enabled. Default is GROUP14. |  [optional]
**saLifeTime** | **Long** | Life time for security association. Default is 86400 seconds (1 day). |  [optional]
**ikeVersion** | [**IkeVersionEnum**](#IkeVersionEnum) | IKE protocol version to be used. IKE-Flex will initiate IKE-V2 and responds to both IKE-V1 and IKE-V2. |  [optional]

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
_128 | &quot;AES_128&quot;
_256 | &quot;AES_256&quot;
GCM_128 | &quot;AES_GCM_128&quot;
GCM_192 | &quot;AES_GCM_192&quot;
GCM_256 | &quot;AES_GCM_256&quot;

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

<a name="IkeVersionEnum"></a>
## Enum: IkeVersionEnum
Name | Value
---- | -----
V1 | &quot;IKE_V1&quot;
V2 | &quot;IKE_V2&quot;
FLEX | &quot;IKE_FLEX&quot;
