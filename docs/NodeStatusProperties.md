# NodeStatusProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loadAverage** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | One, five, and fifteen minute load averages for the system |  [optional]
**swapUsed** | **Long** | Amount of swap disk in use, in kilobytes |  [optional]
**cpuUsage** | [**CpuUsage**](CpuUsage.md) |  |  [optional]
**nonDpdkCpuCores** | **Long** | Number of non-DPDK cores on Edge Node. |  [optional]
**swapTotal** | **Long** | Amount of disk available for swap, in kilobytes |  [optional]
**systemTime** | **Long** | Current time expressed in milliseconds since epoch |  [optional]
**cpuCores** | **Long** | Number of CPU cores on the system |  [optional]
**uptime** | **Long** | Milliseconds since system start |  [optional]
**memCache** | **Long** | Amount of RAM on the system that can be flushed out to disk, in kilobytes |  [optional]
**memTotal** | **Long** | Amount of RAM allocated to the system, in kilobytes |  [optional]
**memUsed** | **Long** | Amount of RAM in use on the system, in kilobytes |  [optional]
**dpdkCpuCores** | **Long** | Number of DPDK cores on Edge Node which are used for packet IO processing. |  [optional]
**fileSystems** | [**List&lt;NodeFileSystemProperties&gt;**](NodeFileSystemProperties.md) | File systems configured on the system |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | Source of status data. |  [optional]

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
REALTIME | &quot;realtime&quot;
CACHED | &quot;cached&quot;
