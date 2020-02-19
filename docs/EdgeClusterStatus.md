# EdgeClusterStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTimestamp** | **Long** | Timestamp when the cluster status was last updated |  [optional]
**edgeClusterStatus** | [**EdgeClusterStatusEnum**](#EdgeClusterStatusEnum) | Status of an edge node | 
**memberStatus** | [**List&lt;EdgeClusterMemberStatus&gt;**](EdgeClusterMemberStatus.md) | Per Edge Node Status |  [optional]
**edgeClusterId** | **String** | Id of the edge cluster whose status is being reported | 

<a name="EdgeClusterStatusEnum"></a>
## Enum: EdgeClusterStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
