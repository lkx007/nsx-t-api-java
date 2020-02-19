# ContainerNetworkPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerClusterId** | **String** | Identifier of the container cluster this network policy belongs to. |  [optional]
**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) | Type e.g. Network Policy, ASG. |  [optional]
**originProperties** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Array of additional specific properties of container network policy in key-value format.  |  [optional]
**externalId** | **String** | Identifier of the container network policy. | 
**spec** | **String** | Container network policy specification. |  [optional]
**containerProjectId** | **String** | Identifier of the project which this network policy belongs to. |  [optional]

<a name="PolicyTypeEnum"></a>
## Enum: PolicyTypeEnum
Name | Value
---- | -----
NETWORK_POLICY | &quot;NETWORK_POLICY&quot;
ASG | &quot;ASG&quot;
