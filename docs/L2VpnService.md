# L2VpnService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enableFullMesh** | **Boolean** | Full mesh topology auto disables traffic replication between connected peers. However, this property is deprecated. Please refer enable_hub property instead to control client to client forwarding via the server. The value of enable_full_mesh will not be used anymore. If enable_hub is not provided explicitly, the default value of it will be used.  |  [optional]
**enableHub** | **Boolean** | This property only applies in SERVER mode. If set to true, traffic from any client will be replicated to all other clients. If set to false, traffic received from clients is only replicated to the local VPN endpoint.  |  [optional]
**logicalRouterId** | **String** | Logical router id | 
**mode** | [**ModeEnum**](#ModeEnum) | Specify an L2VPN service mode as SERVER or CLIENT. L2VPN service in SERVER mode requires user to configure L2VPN session explicitly. L2VPN service in CLIENT mode can use peercode generated from SERVER to configure L2VPN session.  |  [optional]
**logicalTapIpPool** | **List&lt;String&gt;** | IP Pool to allocate local and peer endpoint IPs for L2VpnSession logical Tap. |  [optional]

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
SERVER | &quot;SERVER&quot;
CLIENT | &quot;CLIENT&quot;
