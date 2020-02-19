# IPSecVPNTunnelTrafficStatistics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**packetsSentOtherError** | **Long** | Total number of packets dropped while sending for any reason. |  [optional]
**packetsOut** | **Long** | Total number of outgoing packets on outbound Security association (SA). |  [optional]
**droppedPacketsOut** | **Long** | Total number of outgoing packets dropped on outbound security association. |  [optional]
**integrityFailures** | **Long** | Total number of packets dropped due to integrity failures. |  [optional]
**nomatchingPolicyErrors** | **Long** | Number of packets dropped because of no matching policy is available. |  [optional]
**saMismatchErrorsIn** | **Long** | Totoal number of security association (SA) mismatch errors on incoming packets. |  [optional]
**peerSubnet** | **String** | Peer subnet to which a tunnel belongs. |  [optional]
**replayErrors** | **Long** | Total number of packets dropped due to replay check on that Security association (SA). |  [optional]
**bytesOut** | **Long** | Total number of outgoing bytes on outbound Security association (SA). |  [optional]
**localSubnet** | **String** | Local subnet to which a tunnel belongs. |  [optional]
**droppedPacketsIn** | **Long** | Total number of incoming packets dropped on inbound security association. |  [optional]
**encryptionFailures** | **Long** | Total number of packets dropped because of failure in encryption. |  [optional]
**saMismatchErrorsOut** | **Long** | Totoal number of security association (SA) mismatch errors on outgoing packets. |  [optional]
**tunnelDownReason** | **String** | Gives the detailed reason about the tunnel when it is down. If tunnel is UP tunnel down reason will be empty. |  [optional]
**packetsReceiveOtherError** | **Long** | Total number of incoming packets dropped on inbound Security association (SA)(misc). |  [optional]
**bytesIn** | **Long** | Total number of incoming bytes on inbound Security association (SA). |  [optional]
**decryptionFailures** | **Long** | Total number of packets dropped due to decryption failures. |  [optional]
**seqNumberOverflowError** | **Long** | Total number of packets dropped while sending due to overflow in sequence number. |  [optional]
**packetsIn** | **Long** | Total number of incoming packets on inbound Security association (SA). |  [optional]
**tunnelStatus** | [**TunnelStatusEnum**](#TunnelStatusEnum) | Specifies the status of tunnel. If all the SA (Security association) are negotiated then tunnels status will be UP. If negotiation fails for the SAs status will be DOWN, if SAs are in negotiating phase tunnels status will be NEGOTIATING. |  [optional]

<a name="TunnelStatusEnum"></a>
## Enum: TunnelStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
NEGOTIATING | &quot;NEGOTIATING&quot;
