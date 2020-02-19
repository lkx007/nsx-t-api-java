# GlobalCollectionConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modifiedFeatureStackCollectionConfigurations** | [**FeatureStackCollectionConfigurationList**](FeatureStackCollectionConfigurationList.md) |  |  [optional]
**isDataCollectionEnabled** | **Boolean** | Indicates whether data collection required by the aggregation service is enabled.  If false, no aggregation service data will be collected.  Changing this property will not affect the existing data collection frequency settings. | 
**aggregatedDataCollectionFrequency** | **Long** | The frequency in seconds at which data, which is subject to the aggregation function, is collected. | 
