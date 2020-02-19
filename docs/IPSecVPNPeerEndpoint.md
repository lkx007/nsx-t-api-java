# IPSecVPNPeerEndpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**psk** | **String** | IPSec Pre-shared key. Maximum length of this field is 128 characters. |  [optional]
**peerId** | **String** | Peer identifier. | 
**ipsecTunnelProfileId** | **String** | Tunnel profile id to be used. By default it will point to system default profile. |  [optional]
**authenticationMode** | [**AuthenticationModeEnum**](#AuthenticationModeEnum) | Authentication mode used for the peer authentication. For PSK (Pre Shared Key) authentication mode, &#x27;psk&#x27; property is mandatory and for the CERTIFICATE authentication mode, &#x27;peer_id&#x27; property is mandatory. |  [optional]
**peerAddress** | **String** | IPV4 address of peer endpoint on remote site. | 
**connectionInitiationMode** | [**ConnectionInitiationModeEnum**](#ConnectionInitiationModeEnum) | Connection initiation mode used by local endpoint to establish ike connection with peer endpoint. INITIATOR - In this mode local endpoint initiates tunnel setup and will also respond to incoming tunnel setup requests from peer gateway. RESPOND_ONLY - In this mode, local endpoint shall only respond to incoming tunnel setup requests. It shall not initiate the tunnel setup. ON_DEMAND - In this mode local endpoint will initiate tunnel creation once first packet matching the policy rule is received and will also respond to incoming initiation request.  |  [optional]
**dpdProfileId** | **String** | Dead peer detection (DPD) profile id. Default will be set according to system default policy. |  [optional]
**ikeProfileId** | **String** | IKE profile id to be used. Default will be set according to system default policy. |  [optional]

<a name="AuthenticationModeEnum"></a>
## Enum: AuthenticationModeEnum
Name | Value
---- | -----
PSK | &quot;PSK&quot;
CERTIFICATE | &quot;CERTIFICATE&quot;

<a name="ConnectionInitiationModeEnum"></a>
## Enum: ConnectionInitiationModeEnum
Name | Value
---- | -----
INITIATOR | &quot;INITIATOR&quot;
RESPOND_ONLY | &quot;RESPOND_ONLY&quot;
ON_DEMAND | &quot;ON_DEMAND&quot;
