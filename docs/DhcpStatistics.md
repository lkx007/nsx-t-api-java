# DhcpStatistics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | **Long** | The total number of DHCP errors | 
**releases** | **Long** | The total number of DHCP RELEASE packets | 
**informs** | **Long** | The total number of DHCP INFORM packets | 
**declines** | **Long** | The total number of DHCP DECLINE packets | 
**dhcpServerId** | **String** | dhcp server uuid | 
**nacks** | **Long** | The total number of DHCP NACK packets | 
**offers** | **Long** | The total number of DHCP OFFER packets | 
**discovers** | **Long** | The total number of DHCP DISCOVER packets | 
**acks** | **Long** | The total number of DHCP ACK packets | 
**timestamp** | **Long** | timestamp of the statistics | 
**requests** | **Long** | The total number of DHCP REQUEST packets | 
**ipPoolStats** | [**List&lt;DhcpIpPoolUsage&gt;**](DhcpIpPoolUsage.md) | The DHCP ip pool usage statistics |  [optional]
