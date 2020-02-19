# DADProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**waitTime** | **Long** | The time duration in seconds, to wait for Neighbor advertisement after sending the Neighbor solicitation message.  |  [optional]
**nsRetries** | **Long** | Number of Neighbor solicitation packets generated before completing the Duplicate address detection process.  |  [optional]
**dadMode** | [**DadModeEnum**](#DadModeEnum) | DAD Mode |  [optional]

<a name="DadModeEnum"></a>
## Enum: DadModeEnum
Name | Value
---- | -----
LOOSE | &quot;LOOSE&quot;
STRICT | &quot;STRICT&quot;
