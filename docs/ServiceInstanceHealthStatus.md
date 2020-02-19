# ServiceInstanceHealthStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isSvaMuxIncompatible** | **Boolean** | Protocol version might be different in both Mux and SVA. |  [optional]
**connectTimestamp** | **String** | Latest timestamp when mux was connected to SVA. |  [optional]
**muxIncompatibleVersion** | **String** | Mux version when Mux and SVA are incompatible |  [optional]
**solutionVersion** | **String** | Version of third party partner solution application. |  [optional]
**syncTime** | **String** | Latest timestamp when health status is received. |  [optional]
**solutionStatus** | **String** | Status of third party partner solution application. |  [optional]
**isStale** | **Boolean** | The parameter is set if the last received health status is older than the predefined interval.  |  [optional]
**muxConnectedStatus** | **String** | Status of multiplexer which forwards the events from guest virtual machines to the partner appliance. |  [optional]
