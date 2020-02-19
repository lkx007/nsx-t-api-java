# Csr

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keySize** | **Long** | size measured in bits of the public key used in a cryptographic algorithm | 
**pemEncoded** | **String** | pem encoded certificate data |  [optional]
**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | Cryptographic algorithm(asymmetric ) used by the public key for data encryption | 
**subject** | [**Principal**](Principal.md) |  | 

<a name="AlgorithmEnum"></a>
## Enum: AlgorithmEnum
Name | Value
---- | -----
RSA | &quot;RSA&quot;
DSA | &quot;DSA&quot;
