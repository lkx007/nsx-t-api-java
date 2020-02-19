# HealthCheckResultPerUplink

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uplinkName** | **String** | Name of the uplink. |  [optional]
**vlanAndMtuAllowed** | [**List&lt;HealthCheckVlanRange&gt;**](HealthCheckVlanRange.md) | List of VLAN ID ranges which are allowed by VLAN and MTU settings.  |  [optional]
**vlanDisallowed** | [**List&lt;HealthCheckVlanRange&gt;**](HealthCheckVlanRange.md) | List of VLAN ID ranges which may be disallowed by VLAN settings.  |  [optional]
**mtuDisallowed** | [**List&lt;HealthCheckVlanRange&gt;**](HealthCheckVlanRange.md) | List of VLAN ID ranges which are allowed by VLAN settings but may be disallowed by MTU settings.  |  [optional]
