# DhcpServerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorMessage** | **String** | Error message, if available |  [optional]
**serviceStatus** | [**ServiceStatusEnum**](#ServiceStatusEnum) | UP means the dhcp service is working fine on both active transport-node and stand-by transport-node (if have), hence fail-over can work at this time if there is failure happens on one of the transport-node; DOWN means the dhcp service is down on both active transport-node and stand-by node (if have), hence the dhcp-service will not repsonse any dhcp request; Error means error happens on transport-node(s) or no status is reported from transport-node(s). The dhcp service may be working (or not working); NO_STANDBY means dhcp service is working in one of the transport node while not in the other transport-node (if have). Hence if the dhcp service in the working transport-node is down, fail-over will not happen and the dhcp service will go down.  | 
**standByNode** | **String** | uuid of stand_by transport node. null if non-HA mode |  [optional]
**activeNode** | **String** | uuid of active transport node | 

<a name="ServiceStatusEnum"></a>
## Enum: ServiceStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
ERROR | &quot;ERROR&quot;
NO_STANDBY | &quot;NO_STANDBY&quot;
