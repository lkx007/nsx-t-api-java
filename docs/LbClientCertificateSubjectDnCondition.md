# LbClientCertificateSubjectDnCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caseSensitive** | **Boolean** | If true, case is significant when comparing subject DN value.  |  [optional]
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match type of subject DN |  [optional]
**subjectDn** | **String** | Value of subject DN | 

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
STARTS_WITH | &quot;STARTS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
