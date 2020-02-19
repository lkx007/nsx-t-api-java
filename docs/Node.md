# Node

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discoveredIpAddresses** | **List&lt;String&gt;** | Discovered IP Addresses of the fabric node, version 4 or 6 |  [optional]
**ipAddresses** | **List&lt;String&gt;** | IP Addresses of the Node, version 4 or 6. This property is mandatory for all nodes except for automatic deployment of edge virtual machine node. For automatic deployment, the ip address from management_port_subnets property will be considered.  |  [optional]
**externalId** | **String** | ID of the Node maintained on the Node and used to recognize the Node |  [optional]
**fqdn** | **String** | Fully qualified domain name of the fabric node |  [optional]
**resourceType** | **String** | Fabric node type, for example &#x27;HostNode&#x27;, &#x27;EdgeNode&#x27; or &#x27;PublicCloudGatewayNode&#x27; | 
