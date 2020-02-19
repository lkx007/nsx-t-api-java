# MigrationSwitchInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | [**KindEnum**](#KindEnum) | Kind of switch, can be DVS, VSS. |  [optional]
**version** | **String** | Version of the switch to be migrated. |  [optional]
**pnicCount** | **Integer** | Number of PNICs associated with this switch. |  [optional]
**id** | **String** | Switch Identifier. |  [optional]
**name** | **String** | Name of the switch. |  [optional]

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
DVS | &quot;DVS&quot;
VSS | &quot;VSS&quot;
