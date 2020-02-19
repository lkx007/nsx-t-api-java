# ClientTypeCollectionConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientType** | [**ClientTypeEnum**](#ClientTypeEnum) | The client type for which this data collection frequency setting applies | 
**dataTypeConfigurations** | [**List&lt;DataTypeCollectionConfiguration&gt;**](DataTypeCollectionConfiguration.md) | The set of data collection type configurations, one for each data collection type | 

<a name="ClientTypeEnum"></a>
## Enum: ClientTypeEnum
Name | Value
---- | -----
HYPERVISOR | &quot;HYPERVISOR&quot;
EDGE | &quot;EDGE&quot;
CONTROL_PLANE | &quot;CONTROL_PLANE&quot;
CONTROL_PLANE_PLATFORM | &quot;CONTROL_PLANE_PLATFORM&quot;
MANAGEMENT_PLANE | &quot;MANAGEMENT_PLANE&quot;
MANAGEMENT_PLANE_PLATFORM | &quot;MANAGEMENT_PLANE_PLATFORM&quot;
