# BgpConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interSrIbgp** | [**InterSRRoutingConfig**](InterSRRoutingConfig.md) |  |  [optional]
**asNumber** | **Long** | This is a deprecated property, Please use &#x27;as_num&#x27; instead. |  [optional]
**routeAggregation** | [**List&lt;BgpRouteAggregation&gt;**](BgpRouteAggregation.md) | List of routes to be aggregated |  [optional]
**logicalRouterId** | **String** | Logical router id |  [optional]
**gracefulRestart** | **Boolean** | Flag to enable graceful restart. This field is deprecated, kindly use graceful_restart_config parameter for graceful restart configuration. If both parameters are set and consistent with each other [i.e. graceful_restart&#x3D;false and graceful_restart_mode&#x3D;HELPER_ONLY OR graceful_restart&#x3D;true and graceful_restart_mode&#x3D;GR_AND_HELPER] then this is allowed, but if inconsistent with each other then this is not allowed and validation error will be thrown.  |  [optional]
**asNum** | **String** | 4 Byte ASN in ASPLAIN/ASDOT Format |  [optional]
**enabled** | **Boolean** | While creation of BGP config this flag will be set to - true for Tier0 logical router with Active-Active high-availability mode - false for Tier0 logical router with Active-Standby high-availanility mode. User can change this value while updating the config. If this property is not specified in the payload, the default value will be considered as false irrespective of the high-availability mode.  |  [optional]
**gracefulRestartConfig** | [**GracefulRestartConfig**](GracefulRestartConfig.md) |  |  [optional]
**multipathRelax** | **Boolean** | Flag to enable BGP multipath relax option |  [optional]
**ecmp** | **Boolean** | While creation of BGP config this flag will be set to - true for Tier0 logical router with Active-Active high-availability mode - false for Tier0 logical router with Active-Standby high-availability mode. User can change this value while updating BGP config. If this property is not specified in the payload, the default value will be considered as true irrespective of the high-availability mode.  |  [optional]
