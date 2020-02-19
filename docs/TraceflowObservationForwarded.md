# TraceflowObservationForwarded

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uplinkName** | **String** | The name of the uplink the traceflow packet is forwarded on |  [optional]
**vtepLabel** | **Long** | The virtual tunnel endpoint label |  [optional]
**remoteIpAddress** | **String** | IP address of the destination end of the tunnel |  [optional]
**context** | **Long** | The 64bit tunnel context carried on the wire |  [optional]
**localIpAddress** | **String** | IP address of the source end of the tunnel |  [optional]
**dstTransportNodeId** | **String** | This field will not be always available. Use remote_ip_address when this field is not set. |  [optional]
**dstTransportNodeName** | **String** | The name of the transport node to which the traceflow packet is forwarded |  [optional]
