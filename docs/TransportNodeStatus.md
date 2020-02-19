# TransportNodeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Roll-up status of pNIC, management connection, control connection, tunnel status, agent status |  [optional]
**threatStatus** | [**ThreatStatus**](ThreatStatus.md) |  |  [optional]
**agentStatus** | [**AgentStatusCount**](AgentStatusCount.md) |  |  [optional]
**nodeUuid** | **String** | Transport node uuid |  [optional]
**tunnelStatus** | [**TunnelStatusCount**](TunnelStatusCount.md) |  |  [optional]
**mgmtConnectionStatus** | [**MgmtConnectionStatusEnum**](#MgmtConnectionStatusEnum) | Management connection status |  [optional]
**controlConnectionStatus** | [**StatusCount**](StatusCount.md) |  |  [optional]
**pnicStatus** | [**StatusCount**](StatusCount.md) |  |  [optional]
**nodeStatus** | [**NodeStatus**](NodeStatus.md) |  |  [optional]
**nodeDisplayName** | **String** | Transport node display name |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="MgmtConnectionStatusEnum"></a>
## Enum: MgmtConnectionStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
