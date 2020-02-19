# MacLearningSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **Integer** | The maximum number of MAC addresses that can be learned on this port |  [optional]
**agingTime** | **Integer** | Aging time in sec for learned MAC address |  [optional]
**enabled** | **Boolean** | Allowing source MAC address learning | 
**limitPolicy** | [**LimitPolicyEnum**](#LimitPolicyEnum) | The policy after MAC Limit is exceeded |  [optional]
**unicastFloodingAllowed** | **Boolean** | Allowing flooding for unlearned MAC for ingress traffic |  [optional]

<a name="LimitPolicyEnum"></a>
## Enum: LimitPolicyEnum
Name | Value
---- | -----
ALLOW | &quot;ALLOW&quot;
DROP | &quot;DROP&quot;
