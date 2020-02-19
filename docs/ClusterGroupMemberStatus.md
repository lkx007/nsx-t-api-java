# ClusterGroupMemberStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberIp** | **String** | IP of the group member |  [optional]
**memberFqdn** | **String** | FQDN of the group member |  [optional]
**memberStatus** | [**MemberStatusEnum**](#MemberStatusEnum) | Status of the group member |  [optional]
**memberUuid** | **String** | UUID of the group member |  [optional]

<a name="MemberStatusEnum"></a>
## Enum: MemberStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
UNKNOWN | &quot;UNKNOWN&quot;
