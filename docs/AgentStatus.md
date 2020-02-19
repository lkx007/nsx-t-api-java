# AgentStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Agent status |  [optional]
**name** | [**NameEnum**](#NameEnum) | Agent name |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="NameEnum"></a>
## Enum: NameEnum
Name | Value
---- | -----
AGENT | &quot;NSX_AGENT&quot;
OPSAGENT | &quot;NSX_OPSAGENT&quot;
CFGAGENT | &quot;NSX_CFGAGENT&quot;
NESTDB | &quot;NSX_NESTDB&quot;
