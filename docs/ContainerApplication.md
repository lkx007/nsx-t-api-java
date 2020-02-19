# ContainerApplication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the container application. |  [optional]
**containerClusterId** | **String** | Identifier of the container cluster this container application belongs to. |  [optional]
**originProperties** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Array of additional specific properties of container application in key-value format.  |  [optional]
**externalId** | **String** | Identifier of the container application on container cluster e.g. PCF app id, k8s service id.  | 
**containerProjectId** | **String** | Identifier of the project which this container application belongs to. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
HEALTHY | &quot;HEALTHY&quot;
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;
