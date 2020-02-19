# FirewallRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**services** | [**List&lt;FirewallService&gt;**](FirewallService.md) | List of the services. Null will be treated as any. |  [optional]
**contextProfiles** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | NS Profile object which accepts attributes and sub-attributes of various network services (ex. L7 AppId, domain name, encryption algorithm) as key value pairs. |  [optional]
**extendedSources** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of NSGroups that have end point attributes like AD Groups(SID), process name, process hash etc. For Flash release, only NSGroups containing AD Groups are supported. |  [optional]
**sectionId** | **String** | Section Id of the section to which this rule belongs to. |  [optional]
