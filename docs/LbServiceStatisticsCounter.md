# LbServiceStatisticsCounter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**l4TotalSessions** | **Long** | Number of l4 total sessions |  [optional]
**l7CurrentSessions** | **Long** | Number of l7 current sessions |  [optional]
**l4MaxSessions** | **Long** | L4 max sessions is used to show the peak L4 max session data since load balancer starts to provide service.  |  [optional]
**l4CurrentSessions** | **Long** | Number of l4 current sessions |  [optional]
**l7TotalSessions** | **Long** | Number of l7 total sessions |  [optional]
**l4CurrentSessionRate** | [**BigDecimal**](BigDecimal.md) | The average number of l4 current sessions per second, the number is averaged over the last 5 one-second intervals.  |  [optional]
**l7CurrentSessionRate** | [**BigDecimal**](BigDecimal.md) | The average number of l7 current requests per second, the number is averaged over the last 5 one-second intervals.  |  [optional]
**l7MaxSessions** | **Long** | L7 max sessions is used to show the peak L7 max session data since load balancer starts to provide service.  |  [optional]
