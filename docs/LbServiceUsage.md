# LbServiceUsage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**poolCapacity** | **Long** | Pool capacity means maximum number of pools which could be configured in the given load balancer service.  |  [optional]
**serviceSize** | [**ServiceSizeEnum**](#ServiceSizeEnum) | The size of load balancer service |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | The severity calculation is based on the largest usage percentage from virtual servers, pools and pool members for one load balancer service.  |  [optional]
**poolMemberCapacity** | **Long** | Pool member capacity means maximum number of pool members which could be configured in the given load balancer service.  |  [optional]
**currentVirtualServerCount** | **Long** | The current number of virtual servers which has been configured in the given load balancer service.  |  [optional]
**usagePercentage** | [**BigDecimal**](BigDecimal.md) | The usage percentage is the largest usage percentage from virtual servers, pools and pool members for the load balancer service.  |  [optional]
**serviceId** | **String** | UUID of load balancer service |  [optional]
**currentPoolCount** | **Long** | The current number of pools which has been configured in the given load balancer service.  |  [optional]
**virtualServerCapacity** | **Long** | Virtual server capacity means maximum number of virtual servers which could be configured in the given load balancer service.  |  [optional]
**currentPoolMemberCount** | **Long** | The current number of pool members which has been configured in the given load balancer service.  |  [optional]

<a name="ServiceSizeEnum"></a>
## Enum: ServiceSizeEnum
Name | Value
---- | -----
SMALL | &quot;SMALL&quot;
MEDIUM | &quot;MEDIUM&quot;
LARGE | &quot;LARGE&quot;
DLB | &quot;DLB&quot;

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
GREEN | &quot;GREEN&quot;
ORANGE | &quot;ORANGE&quot;
RED | &quot;RED&quot;
