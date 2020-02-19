# PBRRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabled** | **Boolean** | Flag to disable rule. Disabled will only be persisted but never provisioned/realized. |  [optional]
**sources** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of sources. Null will be treated as any. |  [optional]
**ruleTag** | **String** | User level field which will be printed in CLI and packet logs. |  [optional]
**services** | [**List&lt;PBRService&gt;**](PBRService.md) | List of the services. Null will be treated as any. |  [optional]
**notes** | **String** | User notes specific to the rule. |  [optional]
**appliedTos** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of object where rule will be enforced. field overrides this one. Null will be treated as any. |  [optional]
**logged** | **Boolean** | Flag to enable packet logging. Default is disabled. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | Action enforced on the packets which matches the PBR rule. | 
**destinations** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of the destinations. Null will be treated as any. |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
TO_UNDERLAY_NAT | &quot;ROUTE_TO_UNDERLAY_NAT&quot;
TO_OVERLAY_NAT | &quot;ROUTE_TO_OVERLAY_NAT&quot;
TO_UNDERLAY | &quot;ROUTE_TO_UNDERLAY&quot;
TO_OVERLAY | &quot;ROUTE_TO_OVERLAY&quot;
FROM_OVERLAY | &quot;ROUTE_FROM_OVERLAY&quot;
FROM_UNDERLAY | &quot;ROUTE_FROM_UNDERLAY&quot;
