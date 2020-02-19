# AddressBindingEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**SourceEnum**](#SourceEnum) | Source from which the address binding entry was obtained |  [optional]
**binding** | [**PacketAddressClassifier**](PacketAddressClassifier.md) |  |  [optional]
**bindingTimestamp** | **Long** | Timestamp at which the binding was discovered via snooping or manually specified by the user  |  [optional]

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
INVALID | &quot;INVALID&quot;
UNKNOWN | &quot;UNKNOWN&quot;
USER_DEFINED | &quot;USER_DEFINED&quot;
ARP_SNOOPING | &quot;ARP_SNOOPING&quot;
DHCP_SNOOPING | &quot;DHCP_SNOOPING&quot;
VM_TOOLS | &quot;VM_TOOLS&quot;
ND_SNOOPING | &quot;ND_SNOOPING&quot;
DHCPV6_SNOOPING | &quot;DHCPV6_SNOOPING&quot;
VM_TOOLS_V6 | &quot;VM_TOOLS_V6&quot;
