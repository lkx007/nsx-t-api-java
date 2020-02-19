# ManagementClusterStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The current status of the management cluster |  [optional]
**offlineNodes** | [**List&lt;ManagementPlaneBaseNodeInfo&gt;**](ManagementPlaneBaseNodeInfo.md) | Current missing management plane nodes |  [optional]
**requiredMembersForInitialization** | [**List&lt;ClusterInitializationNodeInfo&gt;**](ClusterInitializationNodeInfo.md) | The details of the cluster nodes required for cluster initialization |  [optional]
**onlineNodes** | [**List&lt;ManagementPlaneBaseNodeInfo&gt;**](ManagementPlaneBaseNodeInfo.md) | Current alive management plane nodes |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIALIZING | &quot;INITIALIZING&quot;
UNSTABLE | &quot;UNSTABLE&quot;
DEGRADED | &quot;DEGRADED&quot;
STABLE | &quot;STABLE&quot;
UNKNOWN | &quot;UNKNOWN&quot;
