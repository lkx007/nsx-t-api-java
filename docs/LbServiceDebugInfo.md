# LbServiceDebugInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pools** | [**List&lt;LbPool&gt;**](LbPool.md) | The pools which are associated to the given load balancer service would be included. The pools could be defined in virtual server default pool, sorry pool or load balancer rule action.  |  [optional]
**tcpProfiles** | [**List&lt;LbTcpProfile&gt;**](LbTcpProfile.md) | The TCP profiles are associated to virtual servers  |  [optional]
**virtualServers** | [**List&lt;LbVirtualServer&gt;**](LbVirtualServer.md) | The virtual servers which are associated to the given load balancer service would be included.  |  [optional]
**clientSslProfiles** | [**List&lt;LbClientSslProfile&gt;**](LbClientSslProfile.md) | The client SSL profiles are associated to virtual servers  |  [optional]
**serverSslProfiles** | [**List&lt;LbServerSslProfile&gt;**](LbServerSslProfile.md) | The server SSL profiles are associated to virtual servers  |  [optional]
**service** | [**LbService**](LbService.md) |  |  [optional]
**rules** | [**List&lt;LbRule&gt;**](LbRule.md) | The load balancer rules are associated to virtual servers  |  [optional]
**applicationProfiles** | [**List&lt;LbAppProfile&gt;**](LbAppProfile.md) | The application profiles are associated to virtual servers  |  [optional]
**persistenceProfiles** | [**List&lt;LbPersistenceProfile&gt;**](LbPersistenceProfile.md) | The persistence profiles are associated to virtual servers  |  [optional]
**monitors** | [**List&lt;LbMonitor&gt;**](LbMonitor.md) | The load balancer monitors are associated to pools.  |  [optional]
