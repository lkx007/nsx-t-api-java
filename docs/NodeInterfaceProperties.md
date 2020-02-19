# NodeInterfaceProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostManaged** | **Boolean** | Indicates whether interface is managed by the host |  [optional]
**linkStatus** | [**LinkStatusEnum**](#LinkStatusEnum) | Interface administration status |  [optional]
**ensEnabled** | **Boolean** | Indicates whether interface is enabled for Enhanced Networking Stack |  [optional]
**interfaceType** | [**InterfaceTypeEnum**](#InterfaceTypeEnum) | Interface Type |  [optional]
**connectedSwitch** | **String** | Connected switch |  [optional]
**mtu** | **Long** | Interface MTU |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | Source of status data |  [optional]
**adminStatus** | [**AdminStatusEnum**](#AdminStatusEnum) | Interface administration status |  [optional]
**backingNsxManaged** | **Boolean** | Indicates whether backing of VIRTUAL network interface is managed by NSX |  [optional]
**lportAttachmentId** | **String** | LPort Attachment Id assigned to VIRTUAL network interface of a node |  [optional]
**interfaceId** | **String** | Interface ID |  [optional]
**ensCapable** | **Boolean** | Interface capability for Enhanced Networking Stack |  [optional]
**interfaceAlias** | [**List&lt;NodeInterfaceAlias&gt;**](NodeInterfaceAlias.md) | IP Alias |  [optional]

<a name="LinkStatusEnum"></a>
## Enum: LinkStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;

<a name="InterfaceTypeEnum"></a>
## Enum: InterfaceTypeEnum
Name | Value
---- | -----
PHYSICAL | &quot;PHYSICAL&quot;
VIRTUAL | &quot;VIRTUAL&quot;

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
REALTIME | &quot;realtime&quot;
CACHED | &quot;cached&quot;

<a name="AdminStatusEnum"></a>
## Enum: AdminStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
