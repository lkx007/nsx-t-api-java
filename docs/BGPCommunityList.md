# BGPCommunityList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**communities** | **List&lt;String&gt;** | Array of BGP communities | 
**logicalRouterId** | **String** | Logical router id |  [optional]
**communityType** | [**CommunityTypeEnum**](#CommunityTypeEnum) | BGP community type. It has two types as NormalBGPCommunity BGP normal community which includes well-known community name as well as community value in range from [1-4294967295] or value in aa:nn format(aa/nn range from 1-65535). LargeBGPCommunity BGP large community which includes community value in aa:bb:nn format where aa, bb, nn are unsigned integers in the range [1-4294967295].  |  [optional]

<a name="CommunityTypeEnum"></a>
## Enum: CommunityTypeEnum
Name | Value
---- | -----
NORMALBGPCOMMUNITY | &quot;NormalBGPCommunity&quot;
LARGEBGPCOMMUNITY | &quot;LargeBGPCommunity&quot;
