# RAConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hopLimit** | **Long** | The maximum number of hops through which packets can pass before being discarded.  |  [optional]
**routerLifetime** | **Long** | Router lifetime value in seconds. A value of 0 indicates the router is not a default router for the receiving end. Any other value in this field specifies the lifetime, in seconds, associated with this router as a default router.  |  [optional]
**raInterval** | **Long** | Interval between 2 Router advertisement in seconds.  |  [optional]
**prefixPreferredTime** | **Long** | The time interval in seconds, in which the prefix is advertised as preferred.  |  [optional]
**prefixLifetime** | **Long** | The time interval in seconds, in which the prefix is advertised as valid.  |  [optional]
