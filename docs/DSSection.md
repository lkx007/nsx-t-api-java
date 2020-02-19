# DSSection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stateful** | **Boolean** | Stateful or Stateless nature of distributed service section is enforced on all rules inside the section. Layer3 sections can be stateful or stateless. Layer2 sections can only be stateless. | 
**isDefault** | **Boolean** | It is a boolean flag which reflects whether a distributed service section is default section or not. Each Layer 3 and Layer 2 section will have at least and at most one default section. |  [optional]
**appliedTos** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of objects where the rules in this section will be enforced. This will take precedence over rule level appliedTo. |  [optional]
**ruleCount** | **Long** | Number of rules in this section. |  [optional]
**sectionType** | [**SectionTypeEnum**](#SectionTypeEnum) | Type of the rules which a section can contain. Only homogeneous sections are supported. | 

<a name="SectionTypeEnum"></a>
## Enum: SectionTypeEnum
Name | Value
---- | -----
LAYER2 | &quot;LAYER2&quot;
LAYER3 | &quot;LAYER3&quot;
L3REDIRECT | &quot;L3REDIRECT&quot;
