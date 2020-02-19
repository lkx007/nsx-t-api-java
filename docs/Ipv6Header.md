# Ipv6Header

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**srcIp** | **String** | The source ip address. |  [optional]
**dstIp** | **String** | The destination ip address. |  [optional]
**nextHeader** | **Long** | Identifies the type of header immediately following the IPv6 header. |  [optional]
**hopLimit** | **Long** | Decremented by 1 by each node that forwards the packets. The packet is discarded if Hop Limit is decremented to zero. |  [optional]
