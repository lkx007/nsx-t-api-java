# IPSecVPNSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**peerEndpointId** | **String** | Peer endpoint identifier. | 
**ipsecVpnServiceId** | **String** | Identifier of VPN Service linked with local endpoint. |  [optional]
**localEndpointId** | **String** | Local endpoint identifier. | 
**tcpMssClamping** | [**TcpMssClamping**](TcpMssClamping.md) |  |  [optional]
**enabled** | **Boolean** | Enable/Disable IPSec VPN session. |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | A Policy Based VPN requires to define protect rules that match   local and peer subnets. IPSec security associations is   negotiated for each pair of local and peer subnet. A Route Based VPN is more flexible, more powerful and recommended over   policy based VPN. IP Tunnel port is created and all traffic routed via   tunnel port is protected. Routes can be configured statically   or can be learned through BGP. A route based VPN is must for establishing   redundant VPN session to remote site.  | 

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
POLICYBASEDIPSECVPNSESSION | &quot;PolicyBasedIPSecVPNSession&quot;
ROUTEBASEDIPSECVPNSESSION | &quot;RouteBasedIPSecVPNSession&quot;
