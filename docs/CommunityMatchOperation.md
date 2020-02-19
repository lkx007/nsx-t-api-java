# CommunityMatchOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchOperator** | [**MatchOperatorEnum**](#MatchOperatorEnum) | Match operator for communities from provided community list id. MATCH_ANY will match any community MATCH_ALL will match all communities MATCH_EXACT will do exact match on community MATCH_NONE [operator not supported] will not match any community MATCH_REGEX will match normal communities by evaluating regular expression MATCH_LARGE_COMMUNITY_REGEX will match large communities by evaluating regular expression  |  [optional]
**regularExpression** | **String** | Regular expression to match BGP communities. If match_operator is MATCH_REGEX then this value must be specified.  |  [optional]
**communityListId** | **String** | ID of BGP community list. This value is not required when match_operator is MATCH_REGEX otherwise required.  |  [optional]

<a name="MatchOperatorEnum"></a>
## Enum: MatchOperatorEnum
Name | Value
---- | -----
ANY | &quot;MATCH_ANY&quot;
ALL | &quot;MATCH_ALL&quot;
EXACT | &quot;MATCH_EXACT&quot;
NONE | &quot;MATCH_NONE&quot;
REGEX | &quot;MATCH_REGEX&quot;
LARGE_COMMUNITY_REGEX | &quot;MATCH_LARGE_COMMUNITY_REGEX&quot;
