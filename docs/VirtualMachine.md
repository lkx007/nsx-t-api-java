# VirtualMachine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**localIdOnHost** | **String** | Id of the vm unique within the host. | 
**type** | [**TypeEnum**](#TypeEnum) | Virtual Machine type; Edge, Service VM or other. |  [optional]
**guestInfo** | [**GuestInfo**](GuestInfo.md) |  |  [optional]
**powerState** | [**PowerStateEnum**](#PowerStateEnum) | Current power state of this virtual machine in the system. | 
**computeIds** | **List&lt;String&gt;** | List of external compute ids of the virtual machine in the format &#x27;id-type-key:value&#x27; , list of external compute ids [&#x27;uuid:xxxx-xxxx-xxxx-xxxx&#x27;, &#x27;moIdOnHost:moref-11&#x27;, &#x27;instanceUuid:xxxx-xxxx-xxxx-xxxx&#x27;] | 
**hostId** | **String** | Id of the host in which this virtual machine exists. |  [optional]
**externalId** | **String** | Current external id of this virtual machine in the system. | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
EDGE | &quot;EDGE&quot;
SERVICE | &quot;SERVICE&quot;
REGULAR | &quot;REGULAR&quot;

<a name="PowerStateEnum"></a>
## Enum: PowerStateEnum
Name | Value
---- | -----
VM_RUNNING | &quot;VM_RUNNING&quot;
VM_STOPPED | &quot;VM_STOPPED&quot;
VM_SUSPENDED | &quot;VM_SUSPENDED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
