# LbVirtualServer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipProtocol** | [**IpProtocolEnum**](#IpProtocolEnum) | Assigned Internet Protocol in IP header, TCP, UDP are supported.  |  [optional]
**serverTcpProfileId** | **String** | Only L7 virtual server could be configured with customized server side TCP profile.  |  [optional]
**sorryPoolId** | **String** | When load balancer can not select a backend server to serve the request in default pool or pool in rules, the request would be served by sorry server pool.  |  [optional]
**port** | **String** | This is a deprecated property, please use &#x27;ports&#x27; instead. Port setting could be single port for both L7 mode and L4 mode. For L4 mode, a single port range is also supported. The port setting could be a single port or port range such as \&quot;80\&quot;, \&quot;1234-1236\&quot;. If port is configured and ports are not specified, both port and ports in response payload would return the same port value. If both port and ports are configured, ports setting would take effect with higher priority.  |  [optional]
**serverSslProfileBinding** | [**ServerSslProfileBinding**](ServerSslProfileBinding.md) |  |  [optional]
**poolId** | **String** | The server pool(LbPool) contains backend servers. Server pool consists of one or more servers, also referred to as pool members, that are similarly configured and are running the same application.  |  [optional]
**clientTcpProfileId** | **String** | Only L7 virtual server could be configured with customized client side TCP profile.  |  [optional]
**defaultPoolMemberPort** | **String** | This is a deprecated property, please use &#x27;default_pool_member_ports&#x27; instead. If default_pool_member_port is configured and default_pool_member_ports are not specified, both default_pool_member_port and default_pool_member_ports in response payload would return the same port value. If both are specified, default_pool_member_ports setting would take effect with higher priority.  |  [optional]
**accessLogEnabled** | **Boolean** | Whether access log is enabled |  [optional]
**applicationProfileId** | **String** | The application profile defines the application protocol characteristics. It is used to influence how load balancing is performed. Currently, LbFastTCPProfile, LbFastUDPProfile and LbHttpProfile, etc are supported.  | 
**maxConcurrentConnections** | **Long** | To ensure one virtual server does not over consume resources, affecting other applications hosted on the same LBS, connections to a virtual server can be capped. If it is not specified, it means that connections are unlimited.  |  [optional]
**ruleIds** | **List&lt;String&gt;** | Load balancer rules allow customization of load balancing behavior using match/action rules. Currently, load balancer rules are supported for only layer 7 virtual servers with LbHttpProfile.  |  [optional]
**maxNewConnectionRate** | **Long** | To ensure one virtual server does not over consume resources, connections to a member can be rate limited. If it is not specified, it means that connection rate is unlimited.  |  [optional]
**persistenceProfileId** | **String** | Persistence profile is used to allow related client connections to be sent to the same backend server.  |  [optional]
**clientSslProfileBinding** | [**ClientSslProfileBinding**](ClientSslProfileBinding.md) |  |  [optional]
**defaultPoolMemberPorts** | **List&lt;String&gt;** | If default_pool_member_ports are configured, both default_pool_member_port and default_pool_member_ports in the response payload would include port settings, notice that the value of default_pool_member_port is the first element of default_pool_member_ports.  |  [optional]
**ipAddress** | **String** | virtual server IP address | 
**ports** | **List&lt;String&gt;** | Port setting could be a single port for both L7 mode and L4 mode. For L4 mode, multiple ports or port ranges are also supported such as \&quot;80\&quot;, \&quot;443\&quot;, \&quot;1234-1236\&quot;. If ports is configured, both port and ports in the response payload would include port settings, notice that the port field value is the first element of ports.  |  [optional]
**enabled** | **Boolean** | whether the virtual server is enabled |  [optional]

<a name="IpProtocolEnum"></a>
## Enum: IpProtocolEnum
Name | Value
---- | -----
TCP | &quot;TCP&quot;
UDP | &quot;UDP&quot;
