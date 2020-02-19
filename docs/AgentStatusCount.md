# AgentStatusCount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Roll-up agent status |  [optional]
**downCount** | **Integer** | Down count |  [optional]
**agents** | [**List&lt;AgentStatus&gt;**](AgentStatus.md) | List of agent statuses belonging to the transport node |  [optional]
**upCount** | **Integer** | Up count |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
UNKNOWN | &quot;UNKNOWN&quot;
