# ClusterNodeInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Node clustering status |  [optional]
**msgClients** | [**List&lt;NodeMessagingClientInfo&gt;**](NodeMessagingClientInfo.md) | Messaging client of all entities |  [optional]
**nodeUuid** | **String** | Unique identifier of this node |  [optional]
**displayName** | **String** | The display name of this node |  [optional]
**entities** | [**List&lt;NodeEntityInfo&gt;**](NodeEntityInfo.md) | Service endpoint of all entities |  [optional]
**certificates** | [**List&lt;NodeCertificateInfo&gt;**](NodeCertificateInfo.md) | Certificate and thumbprint of all entities |  [optional]
**fqdn** | **String** | The fqdn of this node |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
JOINING | &quot;JOINING&quot;
JOINED | &quot;JOINED&quot;
REMOVING | &quot;REMOVING&quot;
REMOVED | &quot;REMOVED&quot;
