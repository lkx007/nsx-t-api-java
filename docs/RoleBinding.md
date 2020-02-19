# RoleBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stale** | [**StaleEnum**](#StaleEnum) | Property &#x27;stale&#x27; can be considered to have these values - absent  - This type of rolebinding does not support stale property TRUE    - Rolebinding is stale in vIDM meaning the user is no longer present in vIDM FALSE   - Rolebinding is available in vIDM UNKNOWN - Rolebinding&#x27;s state of staleness in unknown Once rolebindings become stale, they can be deleted using the API POST /aaa/role-bindings?action&#x3D;delete_stale_bindings |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type |  [optional]
**name** | **String** | User/Group&#x27;s name |  [optional]
**roles** | [**List&lt;Role&gt;**](Role.md) | Roles |  [optional]

<a name="StaleEnum"></a>
## Enum: StaleEnum
Name | Value
---- | -----
TRUE | &quot;TRUE&quot;
FALSE | &quot;FALSE&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
REMOTE_USER | &quot;remote_user&quot;
REMOTE_GROUP | &quot;remote_group&quot;
LOCAL_USER | &quot;local_user&quot;
PRINCIPAL_IDENTITY | &quot;principal_identity&quot;
