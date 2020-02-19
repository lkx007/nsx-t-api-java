# PrincipalIdentity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isProtected** | **Boolean** | Indicator whether the entities created by this principal should be protected |  [optional]
**role** | **String** | Role |  [optional]
**name** | **String** | Name of the principal | 
**permissionGroup** | [**PermissionGroupEnum**](#PermissionGroupEnum) | Use the &#x27;role&#x27; field instead and pass in &#x27;auditor&#x27; for read_only_api_users or &#x27;enterprise_admin&#x27; for the others. |  [optional]
**certificateId** | **String** | Id of the stored certificate. When used with the deprecated POST /trust-management/principal-identities API this field is required. |  [optional]
**nodeId** | **String** | Unique node-id of a principal | 

<a name="PermissionGroupEnum"></a>
## Enum: PermissionGroupEnum
Name | Value
---- | -----
READ_ONLY_API_USERS | &quot;read_only_api_users&quot;
READ_WRITE_API_USERS | &quot;read_write_api_users&quot;
SUPERUSERS | &quot;superusers&quot;
UNDEFINED | &quot;undefined&quot;
