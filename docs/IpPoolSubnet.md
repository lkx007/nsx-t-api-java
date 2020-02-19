# IpPoolSubnet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dnsNameservers** | **List&lt;String&gt;** | The collection of upto 3 DNS servers for the subnet. |  [optional]
**cidr** | **String** | Represents network address and the prefix length which will be associated with a layer-2 broadcast domain | 
**gatewayIp** | **String** | The default gateway address on a layer-3 router. |  [optional]
**allocationRanges** | [**List&lt;IpPoolRange&gt;**](IpPoolRange.md) | A collection of IPv4 or IPv6 IP Pool Ranges. | 
**dnsSuffix** | **String** | The DNS suffix for the DNS server. |  [optional]
