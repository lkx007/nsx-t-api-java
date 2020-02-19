# MigrationSetupInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationNsx** | [**DestinationNsxApiEndpoint**](DestinationNsxApiEndpoint.md) |  |  [optional]
**sourceNsx** | [**List&lt;SourceNsxApiEndpoint&gt;**](SourceNsxApiEndpoint.md) | List of source NSX manager endpoints. |  [optional]
**migrationMode** | [**MigrationModeEnum**](#MigrationModeEnum) | Migration mode can be VMC_V2T, ONPREMISE_V2T, ONPREMISE_VSPHERE2T |  [optional]

<a name="MigrationModeEnum"></a>
## Enum: MigrationModeEnum
Name | Value
---- | -----
VMC_V2T | &quot;VMC_V2T&quot;
ONPREMISE_V2T | &quot;ONPREMISE_V2T&quot;
ONPREMISE_VSPHERE2T | &quot;ONPREMISE_VSPHERE2T&quot;
