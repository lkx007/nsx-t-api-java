# SIMacLearningCounters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**macsLearned** | **Long** | Number of MACs learned |  [optional]
**macNotLearnedPacketsDropped** | **Long** | The number of packets with unknown source MAC address that are dropped without learning the source MAC address. Applicable only when the MAC limit is reached and MAC Limit policy is MAC_LEARNING_LIMIT_POLICY_DROP. |  [optional]
**macNotLearnedPacketsAllowed** | **Long** | The number of packets with unknown source MAC address that are dispatched without learning the source MAC address. Applicable only when the MAC limit is reached and MAC Limit policy is MAC_LEARNING_LIMIT_POLICY_ALLOW. |  [optional]
