# LogicalRouterDownLinkPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subnets** | [**List&lt;IPSubnet&gt;**](IPSubnet.md) | Logical router port subnets | 
**urpfMode** | [**UrpfModeEnum**](#UrpfModeEnum) | Unicast Reverse Path Forwarding mode |  [optional]
**macAddress** | **String** | MAC address |  [optional]
**ndraProfileId** | **String** | Identifier of Neighbor Discovery Router Advertisement profile associated with port. When NDRA profile id is associated at both the port level and logical router level, the profile id specified at port level takes the precedence.  |  [optional]
**linkedLogicalSwitchPortId** | [**ResourceReference**](ResourceReference.md) |  |  [optional]

<a name="UrpfModeEnum"></a>
## Enum: UrpfModeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
STRICT | &quot;STRICT&quot;
