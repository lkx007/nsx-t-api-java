# X509Certificate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ecdsaEcFieldF2mks** | **List&lt;Long&gt;** | The order of the middle term(s) of the reduction polynomial in elliptic curve (EC) | characteristic 2 finite field.| Contents of this array are copied to protect against subsequent modification in ECDSA. |  [optional]
**version** | **String** | Certificate version (default v1) |  [optional]
**isCa** | **Boolean** | True if this is a CA certificate. |  [optional]
**signatureAlgorithm** | **String** | the algorithm used by the Certificate Authority to sign the certificate |  [optional]
**ecdsaPublicKeyA** | **String** | The first coefficient of this elliptic curve in ECDSA. |  [optional]
**rsaPublicKeyExponent** | **String** | An RSA public key is made up of the modulus and the public exponent. Exponent is a power number |  [optional]
**ecdsaEcFieldF2mm** | **Long** | The first coefficient of this elliptic curve in elliptic curve (EC) | characteristic 2 finite field for ECDSA. |  [optional]
**issuerCn** | **String** | the certificate issuer&#x27;s common name |  [optional]
**subjectCn** | **String** | the certificate owner&#x27;s common name |  [optional]
**ecdsaPublicKeyOrder** | **String** | The order of generator G in ECDSA. |  [optional]
**ecdsaEcFieldF2mrp** | **String** | The value whose i-th bit corresponds to the i-th coefficient of the reduction polynomial | in elliptic curve (EC) characteristic 2 finite field for ECDSA. |  [optional]
**publicKeyLength** | **Long** | size measured in bits of the public/private keys used in a cryptographic algorithm |  [optional]
**notBefore** | **Long** | the time in epoch milliseconds at which the certificate becomes valid |  [optional]
**ecdsaEcFieldF2pp** | **String** | The specified prime for the elliptic curve prime finite field in ECDSA. |  [optional]
**issuer** | **String** | the certificate issuers complete distinguished name |  [optional]
**ecdsaPublicKeyB** | **String** | The second coefficient of this elliptic curve in ECDSA. |  [optional]
**rsaPublicKeyModulus** | **String** | An RSA public key is made up of the modulus and the public exponent. Modulus is wrap around number |  [optional]
**dsaPublicKeyY** | **String** | One of the DSA cryptogaphic algorithm&#x27;s strength parameters |  [optional]
**ecdsaPublicKeyCofactor** | **Long** | The co-factor in ECDSA. |  [optional]
**notAfter** | **Long** | the time in epoch milliseconds at which the certificate becomes invalid |  [optional]
**dsaPublicKeyQ** | **String** | One of the DSA cryptogaphic algorithm&#x27;s strength parameters, sub-prime |  [optional]
**dsaPublicKeyP** | **String** | One of the DSA cryptogaphic algorithm&#x27;s strength parameters, prime |  [optional]
**ecdsaPublicKeyGeneratorY** | **String** | y co-ordinate of G (the generator which is also known as the base point) in ECDSA. |  [optional]
**ecdsaPublicKeyGeneratorX** | **String** | x co-ordinate of G (the generator which is also known as the base point) in ECDSA. |  [optional]
**publicKeyAlgo** | [**PublicKeyAlgoEnum**](#PublicKeyAlgoEnum) | Cryptographic algorithm used by the public key for data encryption. |  [optional]
**isValid** | **Boolean** | True if this certificate is valid. |  [optional]
**ecdsaPublicKeySeed** | **List&lt;String&gt;** | The bytes used during curve generation for later validation in ECDSA.| Contents of this array are copied to protect against subsequent modification. |  [optional]
**signature** | **String** | the signature value(the raw signature bits) used for signing and validate the cert |  [optional]
**serialNumber** | **String** | certificate&#x27;s serial number |  [optional]
**dsaPublicKeyG** | **String** | One of the DSA cryptogaphic algorithm&#x27;s strength parameters, base |  [optional]
**subject** | **String** | the certificate owners complete distinguished name |  [optional]
**ecdsaEcField** | [**EcdsaEcFieldEnum**](#EcdsaEcFieldEnum) | Represents an elliptic curve (EC) finite field in ECDSA. |  [optional]
**ecdsaCurveName** | **String** | The Curve name for the ECDSA certificate. |  [optional]

<a name="PublicKeyAlgoEnum"></a>
## Enum: PublicKeyAlgoEnum
Name | Value
---- | -----
RSA | &quot;RSA&quot;
DSA | &quot;DSA&quot;
ECDSA | &quot;ECDSA&quot;

<a name="EcdsaEcFieldEnum"></a>
## Enum: EcdsaEcFieldEnum
Name | Value
---- | -----
F2M | &quot;F2M&quot;
FP | &quot;FP&quot;
