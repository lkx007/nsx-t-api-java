# StaticRouteNextHop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blackholeAction** | [**BlackholeActionEnum**](#BlackholeActionEnum) | Action to be taken on matching packets for NULL routes. |  [optional]
**administrativeDistance** | **Long** | Administrative Distance for the next hop IP |  [optional]
**ipAddress** | **String** | Next Hop IP |  [optional]
**bfdEnabled** | **Boolean** | Status of bfd for this next hop where bfd_enabled &#x3D; true indicate bfd is enabled for this next hop and bfd_enabled &#x3D; false indicate bfd peer is disabled or not configured for this next hop. |  [optional]
**logicalRouterPortId** | [**ResourceReference**](ResourceReference.md) |  |  [optional]

<a name="BlackholeActionEnum"></a>
## Enum: BlackholeActionEnum
Name | Value
---- | -----
DISCARD | &quot;DISCARD&quot;
