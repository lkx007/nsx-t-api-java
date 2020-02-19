# TraceflowObservationDelivered

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resolutionType** | [**ResolutionTypeEnum**](#ResolutionTypeEnum) | This field specifies the resolution type of ARP ARP_SUPPRESSION_PORT_CACHE - ARP request is suppressed by port DB ARP_SUPPRESSION_TABLE - ARP request is suppressed by ARP table ARP_SUPPRESSION_CP_QUERY - ARP request is suppressed by info derived from CP ARP_VM - No suppression and the ARP request is resolved. |  [optional]
**lportName** | **String** | The name of the logical port into which the traceflow packet was delivered |  [optional]
**targetMac** | **String** | The source MAC address of form: \&quot;^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$\&quot;. For example: 00:00:00:00:00:00.  |  [optional]
**vlanId** | **Long** | VLAN on bridged network |  [optional]
**lportId** | **String** | The id of the logical port into which the traceflow packet was delivered |  [optional]

<a name="ResolutionTypeEnum"></a>
## Enum: ResolutionTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
ARP_SUPPRESSION_PORT_CACHE | &quot;ARP_SUPPRESSION_PORT_CACHE&quot;
ARP_SUPPRESSION_TABLE | &quot;ARP_SUPPRESSION_TABLE&quot;
ARP_SUPPRESSION_CP_QUERY | &quot;ARP_SUPPRESSION_CP_QUERY&quot;
ARP_VM | &quot;ARP_VM&quot;
