# LogicalRouterCentralizedServicePort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**linkedLogicalSwitchPortId** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**subnets** | [**List&lt;IPSubnet&gt;**](IPSubnet.md) | Logical router port subnets | 
**enableNetx** | **Boolean** | Port is exclusively used for N-S service insertion |  [optional]
**urpfMode** | [**UrpfModeEnum**](#UrpfModeEnum) | Unicast Reverse Path Forwarding mode |  [optional]
**ndraProfileId** | **String** | Identifier of Neighbor Discovery Router Advertisement profile associated with port. When NDRA profile id is associated at both the port level and logical router level, the profile id specified at port level takes the precedence.  |  [optional]
**mtu** | **Long** | Maximum transmission unit specifies the size of the largest packet that a network protocol can transmit. If not specified, the global logical MTU set in the /api/v1/global-configs/RoutingGlobalConfig API will be used.  |  [optional]

<a name="UrpfModeEnum"></a>
## Enum: UrpfModeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
STRICT | &quot;STRICT&quot;
