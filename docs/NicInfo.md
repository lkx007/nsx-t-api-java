# NicInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subnetMask** | **String** | Subnet mask associated with the NIC metadata. |  [optional]
**gatewayAddress** | **String** | Gateway address associated with the NIC metadata. |  [optional]
**ipAllocationType** | [**IpAllocationTypeEnum**](#IpAllocationTypeEnum) | IP allocation type with values STATIC, DHCP, or NONE indicating that IP address is not required. |  [optional]
**nicMetadata** | [**NicMetadata**](NicMetadata.md) |  |  [optional]
**networkId** | **String** | Network Id associated with the NIC metadata. It can be a moref, or a logical switch ID. If it is to be taken from &#x27;Agent VM Settings&#x27;, then it should be empty. |  [optional]
**ipPoolId** | **String** | If the nic should get IP using a static IP pool then IP pool id should be provided here. |  [optional]
**ipAddress** | **String** | IP address associated with the NIC metadata. Required only when assigning IP statically for a deployment that is for a single VM instance. |  [optional]

<a name="IpAllocationTypeEnum"></a>
## Enum: IpAllocationTypeEnum
Name | Value
---- | -----
STATIC | &quot;STATIC&quot;
DHCP | &quot;DHCP&quot;
NONE | &quot;NONE&quot;
