# LogicalRouterUpLinkPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subnets** | [**List&lt;IPSubnet&gt;**](IPSubnet.md) | Logical router port subnets | 
**linkedLogicalSwitchPortId** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**edgeClusterMemberIndex** | **List&lt;Long&gt;** | Member index of the edge node on the cluster | 
**urpfMode** | [**UrpfModeEnum**](#UrpfModeEnum) | Unicast Reverse Path Forwarding mode |  [optional]
**macAddress** | **String** | MAC address |  [optional]
**ndraPrefixConfig** | [**List&lt;NDRAPrefixConfig&gt;**](NDRAPrefixConfig.md) | Configuration to override the neighbor discovery router advertisement prefix time parameters at the subnet level. Note that users are allowed to override the prefix time only for IPv6 subnets which are configured on the port.  |  [optional]
**ndraProfileId** | **String** | Identifier of Neighbor Discovery Router Advertisement profile associated with port. When NDRA profile id is associated at both the port level and logical router level, the profile id specified at port level takes the precedence.  |  [optional]
**mtu** | **Long** | Maximum transmission unit specifies the size of the largest packet that a network protocol can transmit. If not specified, the global logical MTU set in the /api/v1/global-configs/RoutingGlobalConfig API will be used.  |  [optional]

<a name="UrpfModeEnum"></a>
## Enum: UrpfModeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
STRICT | &quot;STRICT&quot;
