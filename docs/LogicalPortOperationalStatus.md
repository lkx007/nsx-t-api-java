# LogicalPortOperationalStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logicalPortId** | **String** | The id of the logical port |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The Operational status of the logical port | 
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated; unset if data source has never updated the data. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
UNKNOWN | &quot;UNKNOWN&quot;
