# RoutingGlobalConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logicalUplinkMtu** | **Integer** | This is the global default MTU for all the logical uplinks in a NSX domain. Currently logical uplink MTU can only be set globally and applies to the entire NSX domain. There is no option to override this value at transport zone level or transport node level. If this value is not set, the default value of 1500 will be used. |  [optional]
**l3ForwardingMode** | [**L3ForwardingModeEnum**](#L3ForwardingModeEnum) | This setting does not restrict configuration as per other modes. But the forwarding will only work as per the mode set here. | 

<a name="L3ForwardingModeEnum"></a>
## Enum: L3ForwardingModeEnum
Name | Value
---- | -----
ONLY | &quot;IPV4_ONLY&quot;
AND_IPV6 | &quot;IPV4_AND_IPV6&quot;
