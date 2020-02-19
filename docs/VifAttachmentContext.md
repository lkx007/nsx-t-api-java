# VifAttachmentContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vifType** | [**VifTypeEnum**](#VifTypeEnum) | Type of the VIF attached to logical port | 
**parentVifId** | **String** | VIF ID of the parent VIF if vif_type is CHILD |  [optional]
**appId** | **String** | An application ID used to identify / look up a child VIF behind a parent VIF. Only effective when vif_type is CHILD.  |  [optional]
**trafficTag** | **Integer** | Current we use VLAN id as the traffic tag. Only effective when vif_type is CHILD. Each logical port inside a container must have a unique traffic tag. If the traffic_tag is not unique, no error is generated, but traffic will not be delivered to any port with a non-unique tag.  |  [optional]
**transportNodeUuid** | **String** | Only effective when vif_type is INDEPENDENT. Each logical port inside a bare metal server or container must have a transport node UUID. We use transport node ID as transport node UUID.  |  [optional]

<a name="VifTypeEnum"></a>
## Enum: VifTypeEnum
Name | Value
---- | -----
PARENT | &quot;PARENT&quot;
CHILD | &quot;CHILD&quot;
INDEPENDENT | &quot;INDEPENDENT&quot;
