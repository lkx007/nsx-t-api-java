# NDRAProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**raMode** | [**RaModeEnum**](#RaModeEnum) | RA Mode | 
**raConfig** | [**RAConfig**](RAConfig.md) |  | 
**retransmitInterval** | **Long** | The time, in milliseconds, between retransmitted neighbour solicitation messages.  |  [optional]
**dnsConfig** | [**RaDNSConfig**](RaDNSConfig.md) |  |  [optional]
**reachableTimer** | **Long** | Neighbour reachable time duration in milliseconds. A value of 0 means unspecified.  |  [optional]

<a name="RaModeEnum"></a>
## Enum: RaModeEnum
Name | Value
---- | -----
DISABLED | &quot;DISABLED&quot;
SLAAC_DNS_THROUGH_RA | &quot;SLAAC_DNS_THROUGH_RA&quot;
SLAAC_DNS_THROUGH_DHCP | &quot;SLAAC_DNS_THROUGH_DHCP&quot;
DHCP_ADDRESS_AND_DNS_THROUGH_DHCP | &quot;DHCP_ADDRESS_AND_DNS_THROUGH_DHCP&quot;
SLAAC_AND_ADDRESS_DNS_THROUGH_DHCP | &quot;SLAAC_AND_ADDRESS_DNS_THROUGH_DHCP&quot;
