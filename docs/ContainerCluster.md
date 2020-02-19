# ContainerCluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterType** | [**ClusterTypeEnum**](#ClusterTypeEnum) | Type of the container cluster. In case of creating container cluster first time, it is expected to pass the valid cluster-type. In case of update, if there is no change in cluster-type, then this field can be omitted in the request.  |  [optional]
**originProperties** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Array of additional specific properties of container cluster in key-value format.  |  [optional]
**externalId** | **String** | External identifier of the container cluster. |  [optional]
**infrastructure** | [**ContainerInfrastructureInfo**](ContainerInfrastructureInfo.md) |  |  [optional]

<a name="ClusterTypeEnum"></a>
## Enum: ClusterTypeEnum
Name | Value
---- | -----
PAS | &quot;PAS&quot;
PKS | &quot;PKS&quot;
KUBERNETES | &quot;Kubernetes&quot;
OPENSHIFT | &quot;Openshift&quot;
WCP | &quot;WCP&quot;
OTHER | &quot;Other&quot;
