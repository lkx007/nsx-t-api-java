# Ipv4Header

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**srcIp** | **String** | The source ip address. |  [optional]
**flags** | **Long** | IP flags |  [optional]
**dstIp** | **String** | The destination ip address. |  [optional]
**srcSubnetPrefixLen** | **Long** | This is used together with src_ip to calculate dst_ip for broadcast when dst_ip is not given; not used in all other cases. |  [optional]
**ttl** | **Long** | Time to live (ttl) |  [optional]
**protocol** | **Long** | IP protocol - defaults to ICMP |  [optional]
