# LogicalPortAttachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentType** | [**AttachmentTypeEnum**](#AttachmentTypeEnum) | Indicates the type of logical port attachment. By default it is Virtual Machine interface (VIF) |  [optional]
**context** | [**AttachmentContext**](AttachmentContext.md) |  |  [optional]
**id** | **String** | Identifier of the interface attached to the logical port | 

<a name="AttachmentTypeEnum"></a>
## Enum: AttachmentTypeEnum
Name | Value
---- | -----
VIF | &quot;VIF&quot;
LOGICALROUTER | &quot;LOGICALROUTER&quot;
BRIDGEENDPOINT | &quot;BRIDGEENDPOINT&quot;
DHCP_SERVICE | &quot;DHCP_SERVICE&quot;
METADATA_PROXY | &quot;METADATA_PROXY&quot;
L2VPN_SESSION | &quot;L2VPN_SESSION&quot;
