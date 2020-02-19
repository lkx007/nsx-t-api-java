# TraceflowObservationReplicationLogical

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vtepLabel** | **Long** | The label of VTEP |  [optional]
**replicationType** | [**ReplicationTypeEnum**](#ReplicationTypeEnum) | This field specifies the type of replication message TX_VTEP - Transmit replication to all VTEPs TX_MTEP - Transmit replication to all MTEPs RX - Receive replication |  [optional]
**localIpAddress** | **String** | Local IP address of the component that replicates the packet. |  [optional]
**uplinkName** | **String** | The name of uplink |  [optional]

<a name="ReplicationTypeEnum"></a>
## Enum: ReplicationTypeEnum
Name | Value
---- | -----
TX_VTEP | &quot;TX_VTEP&quot;
TX_MTEP | &quot;TX_MTEP&quot;
RX | &quot;RX&quot;
