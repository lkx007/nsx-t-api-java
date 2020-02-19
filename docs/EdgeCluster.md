# EdgeCluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberNodeType** | [**MemberNodeTypeEnum**](#MemberNodeTypeEnum) | Edge cluster is homogenous collection of transport nodes. Hence all transport nodes of the cluster must be of same type. This readonly field shows the type of transport nodes.  |  [optional]
**clusterProfileBindings** | [**List&lt;ClusterProfileTypeIdEntry&gt;**](ClusterProfileTypeIdEntry.md) | Edge cluster profile bindings |  [optional]
**allocationRules** | [**List&lt;AllocationRule&gt;**](AllocationRule.md) | Set of allocation rules and respected action for auto placement of logical router, DHCP and MDProxy on edge cluster members.  |  [optional]
**members** | [**List&lt;EdgeClusterMember&gt;**](EdgeClusterMember.md) | EdgeCluster only supports homogeneous members. These member should be backed by either EdgeNode or PublicCloudGatewayNode. TransportNode type of these nodes should be the same. DeploymentType (VIRTUAL_MACHINE|PHYSICAL_MACHINE) of these EdgeNodes is recommended to be the same. EdgeCluster supports members of different deployment types.  |  [optional]
**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | This field is a readonly field which shows the deployment_type of members. It returns UNKNOWN if there are no members, and returns VIRTUAL_MACHINE| PHYSICAL_MACHINE if all edge members are VIRTUAL_MACHINE|PHYSICAL_MACHINE. It returns HYBRID if the cluster contains edge members of both types VIRTUAL_MACHINE and PHYSICAL_MACHINE.  |  [optional]

<a name="MemberNodeTypeEnum"></a>
## Enum: MemberNodeTypeEnum
Name | Value
---- | -----
EDGE_NODE | &quot;EDGE_NODE&quot;
PUBLIC_CLOUD_GATEWAY_NODE | &quot;PUBLIC_CLOUD_GATEWAY_NODE&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="DeploymentTypeEnum"></a>
## Enum: DeploymentTypeEnum
Name | Value
---- | -----
VIRTUAL_MACHINE | &quot;VIRTUAL_MACHINE&quot;
PHYSICAL_MACHINE | &quot;PHYSICAL_MACHINE&quot;
UNKNOWN | &quot;UNKNOWN&quot;
