# IPSecVPNPolicyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sources** | [**List&lt;IPSecVPNPolicySubnet&gt;**](IPSecVPNPolicySubnet.md) | List of local subnets. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | PROTECT - Protect rules are defined per policy based IPSec VPN session. BYPASS - Bypass rules are defined per IPSec VPN service and affects all policy based IPSec VPN sessions. Bypass rules are prioritized over protect rules.  |  [optional]
**enabled** | **Boolean** | A flag to enable/disable the policy rule. |  [optional]
**logged** | **Boolean** | A flag to enable/disable the logging for the policy rule. |  [optional]
**id** | **String** | Unique policy id. |  [optional]
**destinations** | [**List&lt;IPSecVPNPolicySubnet&gt;**](IPSecVPNPolicySubnet.md) | List of peer subnets. |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
PROTECT | &quot;PROTECT&quot;
BYPASS | &quot;BYPASS&quot;
