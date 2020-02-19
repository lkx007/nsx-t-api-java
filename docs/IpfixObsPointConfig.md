# IpfixObsPointConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idleTimeout** | **Integer** | The time in seconds after a Flow is expired if no more packets matching this Flow are received by the cache.  |  [optional]
**observationDomainId** | **Long** | An identifier that is unique to the exporting process and used to meter the Flows.  |  [optional]
**collectors** | [**List&lt;IpfixCollector&gt;**](IpfixCollector.md) | List of IPFIX collectors |  [optional]
**activeTimeout** | **Integer** | The time in seconds after a Flow is expired even if more packets matching this Flow are received by the cache.  |  [optional]
**packetSampleProbability** | [**BigDecimal**](BigDecimal.md) | The probability in percentage that a packet is sampled. The value should be  in range (0,100] and can only have three decimal places at most. The probability  is equal for every packet.  |  [optional]
**enabled** | **Boolean** | Enabled status of IPFIX export | 
**maxFlows** | **Long** | The maximum number of flow entries in each exporter flow cache.  |  [optional]
