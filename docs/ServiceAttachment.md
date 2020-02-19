# ServiceAttachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentStatus** | [**AttachmentStatusEnum**](#AttachmentStatusEnum) | UP - A Service Attachment will have its Service Port - UP and with a configured IP address. DOWN - An Inactive ServiceAttachment has its Service Port - DOWN. It can be used to connect set of appliances that do not need to exchange traffic to/from/through the Edge node. |  [optional]
**servicePort** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**deployedTo** | [**ResourceReference**](ResourceReference.md) |  | 
**logicalSwitch** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**localIps** | [**List&lt;IPInfo&gt;**](IPInfo.md) | Local IPs associated with this Service Attachment. |  [optional]

<a name="AttachmentStatusEnum"></a>
## Enum: AttachmentStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
