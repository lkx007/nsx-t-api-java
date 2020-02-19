# NSServiceGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultService** | **Boolean** | The default NSServiceGroups are created in the system by default. These NSServiceGroups can&#x27;t be modified/deleted  |  [optional]
**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Type of the NSServiceGroup |  [optional]
**members** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of NSService resources that can be added as members to an NSServiceGroup.  | 

<a name="ServiceTypeEnum"></a>
## Enum: ServiceTypeEnum
Name | Value
---- | -----
ETHER | &quot;ETHER&quot;
NON_ETHER | &quot;NON_ETHER&quot;
