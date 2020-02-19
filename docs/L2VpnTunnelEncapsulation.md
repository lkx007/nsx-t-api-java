# L2VpnTunnelEncapsulation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localEndpointIp** | **String** | IP Address of the tunnel port. For hub, the IP is allocated from L2VpnService logical_tap_ip_pool. All sessions on same L2VpnService get the same local_endpoint_ip. For spoke, the IP must be provided. |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Encapsulation protocol used by the tunnel |  [optional]
**peerEndpointIp** | **String** | IP Address of the peer tunnel port. For hub, the IP is allocated from L2VpnService logical_tap_ip_pool. For spoke, the IP must be provided. |  [optional]

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
GRE | &quot;GRE&quot;
