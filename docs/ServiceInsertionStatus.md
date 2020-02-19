# ServiceInsertionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**globalStatus** | [**GlobalStatusEnum**](#GlobalStatusEnum) | service insertion status for a context type (e.g. east_west traffic). | 
**context** | [**ContextEnum**](#ContextEnum) | Type of service insertion contexts. | 

<a name="GlobalStatusEnum"></a>
## Enum: GlobalStatusEnum
Name | Value
---- | -----
DISABLED | &quot;DISABLED&quot;
ENABLED | &quot;ENABLED&quot;

<a name="ContextEnum"></a>
## Enum: ContextEnum
Name | Value
---- | -----
EAST_WEST | &quot;east_west&quot;
NORTH_SOUTH | &quot;north_south&quot;
