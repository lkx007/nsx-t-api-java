# ClusterGroupStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List&lt;ClusterGroupMemberStatus&gt;**](ClusterGroupMemberStatus.md) | Array of group members and their statuses |  [optional]
**groupId** | **String** | UUID of the group |  [optional]
**leaders** | [**List&lt;ClusterGroupServiceLeader&gt;**](ClusterGroupServiceLeader.md) | Array of group leaders and their attributes |  [optional]
**groupStatus** | [**GroupStatusEnum**](#GroupStatusEnum) | Group status |  [optional]
**groupType** | [**GroupTypeEnum**](#GroupTypeEnum) | Type of the group |  [optional]

<a name="GroupStatusEnum"></a>
## Enum: GroupStatusEnum
Name | Value
---- | -----
STABLE | &quot;STABLE&quot;
DEGRADED | &quot;DEGRADED&quot;
UNSTABLE | &quot;UNSTABLE&quot;
UNAVAILABLE | &quot;UNAVAILABLE&quot;

<a name="GroupTypeEnum"></a>
## Enum: GroupTypeEnum
Name | Value
---- | -----
MANAGER | &quot;MANAGER&quot;
CONTROLLER | &quot;CONTROLLER&quot;
POLICY | &quot;POLICY&quot;
HTTPS | &quot;HTTPS&quot;
DATASTORE | &quot;DATASTORE&quot;
CLUSTER_BOOT_MANAGER | &quot;CLUSTER_BOOT_MANAGER&quot;
