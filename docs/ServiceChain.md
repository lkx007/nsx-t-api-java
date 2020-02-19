# ServiceChain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reversePathServiceProfiles** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of ServiceInsertionServiceProfiles id. Reverse path service profiles are applied to egress traffic and is optional. 2 different set of profiles can be defined for forward and reverse path. If not defined, the reverse of the forward path service profile is applied. |  [optional]
**serviceAttachments** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | Service attachment specifies the scope i.e Service plane at which the SVMs are deployed. | 
**forwardPathServiceProfiles** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of ServiceInsertionServiceProfiles that constitutes the the service chain. The forward path service profiles are applied to ingress traffic. | 
**serviceChainId** | **String** | A unique id generated for every service chain. This is not a uuid. |  [optional]
**pathSelectionPolicy** | [**PathSelectionPolicyEnum**](#PathSelectionPolicyEnum) | Path selection policy can be - ANY - Service Insertion is free to redirect to any service path regardless of any load balancing considerations or flow pinning. LOCAL - means to prefer local service insances. REMOTE - preference is to redirect to the SVM co-located on the same host. |  [optional]
**onFailurePolicy** | [**OnFailurePolicyEnum**](#OnFailurePolicyEnum) | Failure policy for the service tells datapath, the action to take i.e to allow or block traffic during failure scenarios. |  [optional]

<a name="PathSelectionPolicyEnum"></a>
## Enum: PathSelectionPolicyEnum
Name | Value
---- | -----
ANY | &quot;ANY&quot;
LOCAL | &quot;LOCAL&quot;
REMOTE | &quot;REMOTE&quot;

<a name="OnFailurePolicyEnum"></a>
## Enum: OnFailurePolicyEnum
Name | Value
---- | -----
ALLOW | &quot;ALLOW&quot;
BLOCK | &quot;BLOCK&quot;
