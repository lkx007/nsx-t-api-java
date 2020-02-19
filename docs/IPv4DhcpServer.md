# IPv4DhcpServer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**options** | [**DhcpOptions**](DhcpOptions.md) |  |  [optional]
**monitorIppoolUsage** | **Boolean** | Enable or disable monitoring of DHCP ip-pools usage. When enabled, system events are generated when pool usage exceeds the configured thresholds. System events can be viewed in REST API /api/v2/hpm/alarms  |  [optional]
**dhcpServerIp** | **String** | DHCP server ip in CIDR format. | 
**dnsNameservers** | **List&lt;String&gt;** | Primary and secondary DNS server address to assign host. They can be overridden by ip-pool or static-binding level property.  |  [optional]
**domainName** | **String** | Host name or prefix to be assigned to host. It can be overridden by ip-pool or static-binding level property.  |  [optional]
**gatewayIp** | **String** | Gateway ip to be assigned to host. It can be overridden by ip-pool or static-binding level property.  |  [optional]
