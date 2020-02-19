# ResourceAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reservation** | [**BigDecimal**](BigDecimal.md) | Minimum guaranteed bandwidth percentage | 
**trafficType** | [**HostInfraTrafficType**](HostInfraTrafficType.md) |  | 
**limit** | [**BigDecimal**](BigDecimal.md) | The limit property specifies the maximum bandwidth allocation for a given traffic type and is expressed in percentage. The default value for this field is set to -1 which means the traffic is unbounded for the traffic type. All other negative values for this property is not supported and will be rejected by the API.  | 
**shares** | **Integer** | Shares | 
