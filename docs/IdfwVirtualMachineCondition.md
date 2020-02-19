# IdfwVirtualMachineCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | VM IDFW Status. | 
**statusDetail** | **String** | IDFW compute collection&#x27;s VM condition. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
VM_TOOLS_NOT_INSTALLED | &quot;VM_TOOLS_NOT_INSTALLED&quot;
IDFW_NOT_SUPPORTED | &quot;IDFW_NOT_SUPPORTED&quot;
DFW_DISABLED | &quot;DFW_DISABLED&quot;
IDFW_DISABLED | &quot;IDFW_DISABLED&quot;
