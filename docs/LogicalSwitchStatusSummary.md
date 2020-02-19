# LogicalSwitchStatusSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated; unset if data source has never updated the data. |  [optional]
**totalSwitches** | **Long** | The total number of logical switches. | 
**filters** | [**List&lt;Filter&gt;**](Filter.md) | The filters used to find the logical switches- TransportZone id, LogicalSwitchProfile id or TransportType |  [optional]
**fullyRealizedSwitches** | **Long** | The number of logical switches that are realized in all transport nodes. | 
