# LogicalPortStatusSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalPorts** | **Long** | The total number of logical ports. | 
**lastUpdateTimestamp** | **Long** | Timestamp when the data was last updated; unset if data source has never updated the data. |  [optional]
**upPorts** | **Long** | The number of logical ports whose Operational status is UP | 
**filters** | [**List&lt;Filter&gt;**](Filter.md) | The filters used to find the logical ports- TransportZone id, LogicalSwitch id or LogicalSwitchProfile id |  [optional]
