# VmToolsInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**vmType** | [**VmTypeEnum**](#VmTypeEnum) | Type of VM - Edge, Service or other. |  [optional]
**networkAgentVersion** | **String** | Version of network agent on the VM of a third party partner solution. |  [optional]
**hostLocalId** | **String** | Id of the VM which is assigned locally by the host. It is the VM-moref on ESXi hosts, in other environments it is VM UUID. |  [optional]
**externalId** | **String** | Current external id of this virtual machine in the system. |  [optional]
**toolsVersion** | **String** | Version of VMTools installed on the VM. |  [optional]
**fileAgentVersion** | **String** | Version of file agent on the VM of a third party partner solution. |  [optional]

<a name="VmTypeEnum"></a>
## Enum: VmTypeEnum
Name | Value
---- | -----
EDGE | &quot;EDGE&quot;
SERVICE | &quot;SERVICE&quot;
REGULAR | &quot;REGULAR&quot;
