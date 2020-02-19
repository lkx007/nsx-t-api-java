# BgpNeighborStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectionState** | [**ConnectionStateEnum**](#ConnectionStateEnum) | Current state of the BGP session. |  [optional]
**keepAliveInterval** | **Long** | Time in ms to wait for HELLO packet from BGP peer |  [optional]
**neighborRouterId** | **String** | Router ID of the BGP neighbor. |  [optional]
**totalOutPrefixCount** | **Long** | Sum of out prefixes counts across all address families. |  [optional]
**lrComponentId** | **String** | Logical router component(Service Router/Distributed Router) id |  [optional]
**establishedConnectionCount** | **Long** | Count of connections established |  [optional]
**messagesSent** | **Long** | Count of messages sent to the neighbor |  [optional]
**timeSinceEstablished** | **Long** | Time(in milliseconds) since connection was established. |  [optional]
**holdTime** | **Long** | Time in ms to wait for HELLO from BGP peer. If a HELLO packet is not seen from BGP Peer withing hold_time then BGP neighbor will be marked as down. |  [optional]
**gracefulRestart** | **Boolean** | Current state of graceful restart where graceful_restart &#x3D; true indicates graceful restart is enabled and graceful_restart &#x3D; false indicates graceful restart is disabled. This is deprecated field, use graceful_restart_mode instead.  |  [optional]
**gracefulRestartMode** | **String** | Current state of graceful restart of BGP neighbor. Possible values are - 1. GR_AND_HELPER - Graceful restart with Helper 2. HELPER_ONLY - Helper only 3. DISABLE - Disabled  |  [optional]
**connectionDropCount** | **Long** | Count of connection drop |  [optional]
**remotePort** | **Long** | TCP port number of remote BGP Connection |  [optional]
**totalInPrefixCount** | **Long** | Sum of in prefixes counts across all address families. |  [optional]
**messagesReceived** | **Long** | Count of messages received from the neighbor |  [optional]
**transportNode** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**localPort** | **Long** | TCP port number of Local BGP connection |  [optional]
**remoteAsNumber** | **String** | AS number of the BGP neighbor |  [optional]
**announcedCapabilities** | **List&lt;String&gt;** | BGP capabilities sent to BGP neighbor. |  [optional]
**negotiatedCapability** | **List&lt;String&gt;** | BGP capabilities negotiated with BGP neighbor. |  [optional]
**addressFamilies** | [**List&lt;BgpAddressFamily&gt;**](BgpAddressFamily.md) | Address families of BGP neighbor |  [optional]
**sourceAddress** | **String** | The Ip address of logical port |  [optional]
**neighborAddress** | **String** | The IP of the BGP neighbor |  [optional]

<a name="ConnectionStateEnum"></a>
## Enum: ConnectionStateEnum
Name | Value
---- | -----
INVALID | &quot;INVALID&quot;
IDLE | &quot;IDLE&quot;
CONNECT | &quot;CONNECT&quot;
ACTIVE | &quot;ACTIVE&quot;
OPEN_SENT | &quot;OPEN_SENT&quot;
OPEN_CONFIRM | &quot;OPEN_CONFIRM&quot;
ESTABLISHED | &quot;ESTABLISHED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
