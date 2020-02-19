# NsxRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | Role name | 
**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | Please use the /user-info/permissions api to get the permission that the user has on each feature. |  [optional]

<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
READ_ONLY_API_USERS | &quot;read_only_api_users&quot;
READ_WRITE_API_USERS | &quot;read_write_api_users&quot;
ENTERPRISE_ADMIN | &quot;enterprise_admin&quot;
AUDITOR | &quot;auditor&quot;
NETWORK_ENGINEER | &quot;network_engineer&quot;
NETWORK_OP | &quot;network_op&quot;
SECURITY_ENGINEER | &quot;security_engineer&quot;
SECURITY_OP | &quot;security_op&quot;
LB_ADMIN | &quot;lb_admin&quot;
LB_AUDITOR | &quot;lb_auditor&quot;
CLOUD_SERVICE_ADMIN | &quot;cloud_service_admin&quot;
CLOUD_SERVICE_AUDITOR | &quot;cloud_service_auditor&quot;
SITE_RELIABILITY_ENGINEER | &quot;site_reliability_engineer&quot;
SITE_RELIABILITY_AUDITOR | &quot;site_reliability_auditor&quot;
CLOUD_ADMIN | &quot;cloud_admin&quot;
CLOUD_AUDITOR | &quot;cloud_auditor&quot;

<a name="List<PermissionsEnum>"></a>
## Enum: List&lt;PermissionsEnum&gt;
Name | Value
---- | -----
READ_API | &quot;read-api&quot;
READ_WRITE_API | &quot;read-write-api&quot;
CRUD | &quot;crud&quot;
READ | &quot;read&quot;
EXECUTE | &quot;execute&quot;
NONE | &quot;none&quot;
