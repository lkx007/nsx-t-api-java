# ClusterNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Current clustering status of the node |  [optional]
**entities** | [**List&lt;ClusterNodeEntity&gt;**](ClusterNodeEntity.md) | Entities on the node | 
**nodeUuid** | **String** | UUID of the node | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
JOINING | &quot;JOINING&quot;
JOINED | &quot;JOINED&quot;
REMOVING | &quot;REMOVING&quot;
REMOVED | &quot;REMOVED&quot;
