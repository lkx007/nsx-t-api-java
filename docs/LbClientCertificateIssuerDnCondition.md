# LbClientCertificateIssuerDnCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caseSensitive** | **Boolean** | If true, case is significant when comparing issuer DN value.  |  [optional]
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of issuer DN |  [optional]
**issuerDn** | **String** | Value of issuer DN | 

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
