# VsphereDeploymentConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataNetworkIds** | **List&lt;String&gt;** | List of distributed portgroup or VLAN logical identifiers to which the datapath serving vnics of edge node vm will be connected.  | 
**dnsServers** | **List&lt;String&gt;** | List of DNS servers. This field is deprecated. Use dns_servers property in EdgeNodeSettings section when creating or updating transport nodes.  |  [optional]
**ntpServers** | **List&lt;String&gt;** | List of NTP servers. This field is deprecated. Use ntp_servers property in EdgeNodeSettings section when creating or updating transport nodes.  |  [optional]
**managementNetworkId** | **String** | Distributed portgroup identifier to which the management vnic of edge node vm will be connected. This portgroup must have connectivity with MP and CCP. A VLAN logical switch identifier may also be specified.  | 
**enableSsh** | **Boolean** | Enabling SSH service is not recommended for security reasons. This field is deprecated. Use enable_ssh property in EdgeNodeSettings section when creating or updating transport nodes.  |  [optional]
**allowSshRootLogin** | **Boolean** | Allowing root SSH logins is not recommended for security reasons. This field is deprecated. Use allow_ssh_root_login property in EdgeNodeSettings section when creating transport nodes.  |  [optional]
**computeId** | **String** | The edge node vm will be deployed on the specified cluster or resourcepool. Note - all the hosts must have nsx fabric prepared in the specified cluster.  | 
**searchDomains** | **List&lt;String&gt;** | List of domain names that are used to complete unqualified host names. This field is deprecated. Use search_domains property in EdgeNodeSettings section when creating or updating transport nodes.  |  [optional]
**vcId** | **String** | The vc specific identifiers will be resolved on this VC. So all other identifiers specified here must belong to this vcenter server.  | 
**storageId** | **String** | The edge node vm will be deployed on the specified datastore. User must ensure that storage is accessible by the specified cluster/host.  | 
**defaultGatewayAddresses** | **List&lt;String&gt;** | The default gateway for edge node must be specified if all the nodes it communicates with are not in the same subnet. Note: Only single IPv4 default gateway address is supported and it must belong to management network.  |  [optional]
**managementPortSubnets** | [**List&lt;IPSubnet&gt;**](IPSubnet.md) | IP Address and subnet configuration for the management port. Note: only one IPv4 address is supported for the management port.  |  [optional]
**hostId** | **String** | The edge node vm will be deployed on the specified Host within the cluster if host_id is specified. Note - User must ensure that storage and specified networks are accessible by this host.  |  [optional]
**hostname** | **String** | Host name or FQDN for edge node. |  [optional]
