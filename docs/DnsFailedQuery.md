# DnsFailedQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeSpent** | **Long** | The time the query took before it got a failed answer, in ms. |  [optional]
**recordType** | **String** | The record type be queried, e.g. A, CNAME, SOA, etc. |  [optional]
**clientIp** | **String** | The client host ip address from which the query was issued.  |  [optional]
**upstreamServerIp** | **String** | The upstream server ip address to which the query was forwarded. If the query could not be serviced from the DNS forwarder cache, this property will contain the IP address of the DNS server that serviced the request. If the request was serviced from the cache, this property will be absent.  |  [optional]
**errorMessage** | **String** | The detailed error message of the failed query, if any. |  [optional]
**address** | **String** | The address be queried, can be a FQDN or an ip address. |  [optional]
**timestamp** | **String** | Timestamp of the request, in YYYY-MM-DD HH:MM:SS.zzz format. | 
**errorType** | **String** | The type of the query failure, e.g. NXDOMAIN, etc. |  [optional]
**sourceIp** | **String** | The source ip address that is used to forward a query to an upstream server.  |  [optional]
**forwarderIp** | **String** | The DNS forwarder ip address to which the query was first received.  |  [optional]
