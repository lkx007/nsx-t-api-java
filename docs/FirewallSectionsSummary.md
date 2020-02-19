# FirewallSectionsSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sectionCount** | **Long** | Total number of sections for the section type. |  [optional]
**ruleCount** | **Long** | Total number of rules in the section. |  [optional]
**sectionType** | [**SectionTypeEnum**](#SectionTypeEnum) | Type of rules which a section can contain. |  [optional]

<a name="SectionTypeEnum"></a>
## Enum: SectionTypeEnum
Name | Value
---- | -----
L2DFW | &quot;L2DFW&quot;
L3DFW | &quot;L3DFW&quot;
L3BRIDGEPORTFW | &quot;L3BRIDGEPORTFW&quot;
L3LOGICALROUTERFW | &quot;L3LOGICALROUTERFW&quot;
