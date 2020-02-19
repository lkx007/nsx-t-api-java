# IpfixDfwConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priority** | **Long** | This priority field is used to resolve conflicts in Logical Ports which are covered by more than one IPFIX profiles. The IPFIX exporter will send records to Collectors in highest priority profile (lowest number) only.  | 
**collector** | **String** | Each IPFIX DFW config can have its own collector config.  | 
**activeFlowExportTimeout** | **Long** | For long standing active flows, IPFIX records will be sent per timeout period  |  [optional]
**templateParameters** | [**IpfixDfwTemplateParameters**](IpfixDfwTemplateParameters.md) |  |  [optional]
**observationDomainId** | **Long** | An identifier that is unique to the exporting process and used to meter the Flows.  | 
