# BgpNeighborAddressFamily

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inFilterIpprefixlistId** | **String** | Id of the IPPrefix List to be used for IN direction filter |  [optional]
**outFilterRoutemapId** | **String** | Id of the RouteMap to be used for OUT direction filter |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Address family type | 
**inFilterRoutemapId** | **String** | Id of the RouteMap to be used for IN direction filter |  [optional]
**enabled** | **Boolean** | Enable this address family |  [optional]
**outFilterIpprefixlistId** | **String** | Id of the IPPrefixList to be used for OUT direction filter |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
IPV4_UNICAST | &quot;IPV4_UNICAST&quot;
VPNV4_UNICAST | &quot;VPNV4_UNICAST&quot;
IPV6_UNICAST | &quot;IPV6_UNICAST&quot;
