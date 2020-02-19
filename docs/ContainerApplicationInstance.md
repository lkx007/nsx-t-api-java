# ContainerApplicationInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the container application instance. |  [optional]
**containerClusterId** | **String** | Identifier of the container cluster this application instance belongs to. |  [optional]
**clusterNodeId** | **String** | Cluster node id where application instance is running. |  [optional]
**externalId** | **String** | Identifier of the container application instance on container cluster. | 
**originProperties** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Array of additional specific properties of container application instance in key-value format.  |  [optional]
**containerApplicationIds** | **List&lt;String&gt;** | List of identifiers of the container application. |  [optional]
**containerProjectId** | **String** | Identifier of the container project which this container application instance belongs to.  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
HEALTHY | &quot;HEALTHY&quot;
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;
