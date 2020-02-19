# BfdHealthMonitoringProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**probeInterval** | **Long** | The time interval (in millisec) between probe packets for tunnels between transport nodes. |  [optional]
**latencyEnabled** | **Boolean** | The flag is to turn on/off latency. A POST or PUT request with \&quot;latency_enabled\&quot; true will enable NSX to send the networking latency data to thrid-party monitoring tools like vRNI. |  [optional]
**enabled** | **Boolean** | Whether the heartbeat is enabled. A POST or PUT request with \&quot;enabled\&quot; false (with no probe intervals) will set (POST) or reset (PUT) the probe_interval to their default value. | 
