# PacketsDroppedBySecurity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spoofGuardDropped** | [**List&lt;PacketTypeAndCounter&gt;**](PacketTypeAndCounter.md) | The packets dropped by \&quot;Spoof Guard\&quot;; supported packet types are IPv4, IPv6, ARP, ND, non-IP. |  [optional]
**dhcpServerDroppedIpv4** | **Long** | The number of IPv4 packets dropped by \&quot;DHCP server block\&quot;. |  [optional]
**dhcpServerDroppedIpv6** | **Long** | The number of IPv6 packets dropped by \&quot;DHCP server block\&quot;. |  [optional]
**dhcpClientDroppedIpv4** | **Long** | The number of IPv4 packets dropped by \&quot;DHCP client block\&quot;. |  [optional]
**bpduFilterDropped** | **Long** | The number of packets dropped by \&quot;BPDU filter\&quot;. |  [optional]
**dhcpClientDroppedIpv6** | **Long** | The number of IPv6 packets dropped by \&quot;DHCP client block\&quot;. |  [optional]
