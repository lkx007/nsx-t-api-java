# RouteMapSequenceSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localPreference** | **Long** | Local preference indicates the degree of preference for one BGP route over other BGP routes. The path/route with highest local preference value is preferred/selected. If local preference value is not specified then it will be considered as 100 by default.  |  [optional]
**weight** | **Integer** | Weight used to select certain path |  [optional]
**largeCommunity** | **String** | Set large BGP community, community value shoud be in aa:bb:nn format where aa, bb, nn are unsigned integers with range [1-4294967295]. |  [optional]
**asPathPrepend** | **String** | As Path Prepending to influence path selection |  [optional]
**community** | **String** | Set normal BGP community either well-known community name or community value in aa:nn(2byte:2byte) format.  |  [optional]
**multiExitDiscriminator** | **Long** | Multi Exit Discriminator (MED) |  [optional]
