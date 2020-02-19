# AttachmentContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocateAddresses** | [**AllocateAddressesEnum**](#AllocateAddressesEnum) | A flag to indicate whether to allocate addresses from allocation     pools bound to the parent logical switch.  |  [optional]
**resourceType** | **String** | Used to identify which concrete class it is | 

<a name="AllocateAddressesEnum"></a>
## Enum: AllocateAddressesEnum
Name | Value
---- | -----
IPPOOL | &quot;IpPool&quot;
MACPOOL | &quot;MacPool&quot;
BOTH | &quot;Both&quot;
NONE | &quot;None&quot;
