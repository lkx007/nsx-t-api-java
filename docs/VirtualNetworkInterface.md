# VirtualNetworkInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**macAddress** | **String** | MAC address of the virtual network interface. | 
**ownerVmType** | [**OwnerVmTypeEnum**](#OwnerVmTypeEnum) | Owner virtual machine type; Edge, Service VM or other. |  [optional]
**deviceKey** | **String** | Device key of the virtual network interface. | 
**hostId** | **String** | Id of the host on which the vm exists. | 
**ownerVmId** | **String** | Id of the vm to which this virtual network interface belongs. | 
**vmLocalIdOnHost** | **String** | Id of the vm unique within the host. | 
**externalId** | **String** | External Id of the virtual network inferface. | 
**lportAttachmentId** | **String** | LPort Attachment Id of the virtual network interface. |  [optional]
**ipAddressInfo** | [**List&lt;IpAddressInfo&gt;**](IpAddressInfo.md) | IP Addresses of the the virtual network interface, from various sources. |  [optional]
**deviceName** | **String** | Device name of the virtual network interface. |  [optional]

<a name="OwnerVmTypeEnum"></a>
## Enum: OwnerVmTypeEnum
Name | Value
---- | -----
EDGE | &quot;EDGE&quot;
SERVICE | &quot;SERVICE&quot;
REGULAR | &quot;REGULAR&quot;
