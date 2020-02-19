# HealthCheckResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vlanMtuStatus** | [**VlanMtuStatusEnum**](#VlanMtuStatusEnum) | Status of VLAN-MTU health check result; TRUNKED - all specified VLAN IDs are allowed by VLAN and MTU settings; UNTRUNKED - some/all specified VLAN IDs may be disallowed by VLAN or MTU settings; UNKNOWN - some/all health check result are unknown due to infrastructure issues.  |  [optional]
**resultsPerTransportNode** | [**List&lt;HealthCheckResultPerTransportNode&gt;**](HealthCheckResultPerTransportNode.md) | List of health check results on specific transport node  |  [optional]

<a name="VlanMtuStatusEnum"></a>
## Enum: VlanMtuStatusEnum
Name | Value
---- | -----
TRUNKED | &quot;TRUNKED&quot;
UNTRUNKED | &quot;UNTRUNKED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
