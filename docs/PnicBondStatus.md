# PnicBondStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of pNIC/bond |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | type, whether the object is a pNIC or a bond |  [optional]
**name** | **String** | Name of the pNIC/bond |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
DEGRADED | &quot;DEGRADED&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN_TYPE | &quot;UNKNOWN_TYPE&quot;
PNIC | &quot;PNIC&quot;
BOND | &quot;BOND&quot;
