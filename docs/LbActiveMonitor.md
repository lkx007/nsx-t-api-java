# LbActiveMonitor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monitorPort** | **String** | If the monitor port is specified, it would override pool member port setting for healthcheck. A port range is not supported. For ICMP monitor, monitor_port is not required.  |  [optional]
**fallCount** | **Long** | num of consecutive checks must fail before marking it down |  [optional]
**interval** | **Long** | the frequency at which the system issues the monitor check (in second) |  [optional]
**riseCount** | **Long** | num of consecutive checks must pass before marking it up |  [optional]
**timeout** | **Long** | the number of seconds the target has in which to respond to the monitor request  |  [optional]
