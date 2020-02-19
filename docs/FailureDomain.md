# FailureDomain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preferredActiveEdgeServices** | **Boolean** | Set preference for edge transport node failure domain which will be considered while doing auto placement of logical router, DHCP and MDProxy on edge node. true: For preemptive failover mode, active edge cluster member       allocation preferes this failure domain. false: For preemptive failover mode, standby edge cluster member       allocation preferes this failure domain. Default will be unset. It means no explicit preference.  |  [optional]
