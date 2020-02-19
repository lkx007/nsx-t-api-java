# IpfixSwitchUpmProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priority** | **Integer** | This priority field is used to resolve conflicts in logical ports/switch  which inherit multiple switch IPFIX profiles from NSGroups.  Override rule is : for multiple profiles inherited from NSGroups, the one with highest priority (lowest number) overrides others; the profile directly applied to logical switch overrides profiles inherited from NSGroup; the profile directly applied to logical port overides profiles inherited from logical switch and/or nsgroup;  The IPFIX exporter will send records to collectors of final effective profile only.  | 
**collectorProfile** | **String** | Each IPFIX switching profile can have its own collector profile.  | 
**idleTimeout** | **Integer** | The time in seconds after a flow is expired if no more packets matching this flow are received by the cache.  |  [optional]
**maxFlows** | **Long** | The maximum number of flow entries in each exporter flow cache.  |  [optional]
**observationDomainId** | **Long** | An identifier that is unique to the exporting process and used to meter the Flows.  | 
**activeTimeout** | **Integer** | The time in seconds after a flow is expired even if more packets matching this Flow are received by the cache.  |  [optional]
**exportOverlayFlow** | **Boolean** | It controls whether sample result includes overlay flow info.  |  [optional]
**appliedTos** | [**AppliedTos**](AppliedTos.md) |  |  [optional]
**packetSampleProbability** | [**BigDecimal**](BigDecimal.md) | The probability in percentage that a packet is sampled. The value should be  in range (0,100] and can only have three decimal places at most. The probability  is equal for every packet.  |  [optional]
