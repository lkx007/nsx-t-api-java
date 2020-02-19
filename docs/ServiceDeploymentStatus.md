# ServiceDeploymentStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentIssues** | [**List&lt;ServiceDeploymentIssue&gt;**](ServiceDeploymentIssue.md) | List of issue and detailed description of the issue in case of deployment failure. |  [optional]
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated; unset if data source has never updated the data. |  [optional]
**deploymentStatus** | [**DeploymentStatusEnum**](#DeploymentStatusEnum) | Deployment status of NXGI Partner Service-VM on a compute collection. It shows the latest status during the process of deployment, redeploy, upgrade, and un-deployment on a compute collection such as VC cluster. |  [optional]
**svaCurrentVersion** | **String** | Currently deployed Service Virtual Appliance version. |  [optional]
**serviceDeploymentId** | **String** | Id of service deployment. |  [optional]
**svaMaxAvailableVersion** | **String** | Max available SVA version for upgrade |  [optional]

<a name="DeploymentStatusEnum"></a>
## Enum: DeploymentStatusEnum
Name | Value
---- | -----
UPGRADE_IN_PROGRESS | &quot;UPGRADE_IN_PROGRESS&quot;
UPGRADE_FAILED | &quot;UPGRADE_FAILED&quot;
DEPLOYMENT_QUEUED | &quot;DEPLOYMENT_QUEUED&quot;
DEPLOYMENT_IN_PROGRESS | &quot;DEPLOYMENT_IN_PROGRESS&quot;
DEPLOYMENT_FAILED | &quot;DEPLOYMENT_FAILED&quot;
DEPLOYMENT_SUCCESSFUL | &quot;DEPLOYMENT_SUCCESSFUL&quot;
UNDEPLOYMENT_QUEUED | &quot;UNDEPLOYMENT_QUEUED&quot;
UNDEPLOYMENT_IN_PROGRESS | &quot;UNDEPLOYMENT_IN_PROGRESS&quot;
UNDEPLOYMENT_FAILED | &quot;UNDEPLOYMENT_FAILED&quot;
UNDEPLOYMENT_SUCCESSFUL | &quot;UNDEPLOYMENT_SUCCESSFUL&quot;
UPGRADE_QUEUED | &quot;UPGRADE_QUEUED&quot;
