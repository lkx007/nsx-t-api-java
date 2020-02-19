# IpDiscoverySwitchingProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arpSnoopingEnabled** | **Boolean** | Indicates whether ARP snooping is enabled |  [optional]
**arpBindingsLimit** | **Integer** | Indicates the number of arp snooped IP addresses to be remembered per LogicalPort. Decreasing this value, will retain the latest bindings from the existing list of address bindings. Increasing this value will retain existing bindings and also learn any new address bindings discovered on the port until the new limit is reached. This limit only applies to IPv4 addresses and is independent of the nd_bindings_limit used for IPv6 snooping. |  [optional]
**dhcpv6SnoopingEnabled** | **Boolean** | This option is the IPv6 equivalent of DHCP snooping. |  [optional]
**ndSnoopingEnabled** | **Boolean** | This option is the IPv6 equivalent of ARP snooping. |  [optional]
**vmToolsV6Enabled** | **Boolean** | This option is only supported on ESX where vm-tools is installed. |  [optional]
**dhcpSnoopingEnabled** | **Boolean** | Indicates whether DHCP snooping is enabled |  [optional]
**arpNdBindingTimeout** | **Integer** | This property controls the ARP and ND cache timeout period.It is recommended that this property be greater than the ARP/ND cache timeout on the VM.  |  [optional]
**vmToolsEnabled** | **Boolean** | This option is only supported on ESX where vm-tools is installed. |  [optional]
**trustOnFirstUseEnabled** | **Boolean** | ARP snooping being inherently susceptible to ARP spoofing, uses a turst-on-fisrt-use (TOFU) paradigm where only the first IP address discovered via ARP snooping is trusted. The remaining are ignored. In order to allow for more flexibility, we allow the user to configure how many ARP snooped address bindings should be trusted for the lifetime of the logical port. This is controlled by the arp_bindings_limit property in the IP Discovery profile. We refer to this extension of TOFU as N-TOFU. However, if TOFU is disabled, then N ARP snooped IP addresses will be trusted until they are timed out, where N is configured by arp_bindings_limit.  |  [optional]
**ndBindingsLimit** | **Integer** | Indicates the number of neighbor-discovery snooped IP addresses to be remembered per LogicalPort. Decreasing this value, will retain the latest bindings from the existing list of address bindings. Increasing this value will retain existing bindings and also learn any new address bindings discovered on the port until the new limit is reached. This limit only applies to IPv6 addresses and is independent of the arp_bindings_limit used for IPv4 snooping. |  [optional]
**duplicateIpDetection** | [**DuplicateIPDetection**](DuplicateIPDetection.md) |  |  [optional]
