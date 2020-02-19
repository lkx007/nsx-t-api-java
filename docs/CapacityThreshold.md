# CapacityThreshold

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxThresholdPercentage** | [**BigDecimal**](BigDecimal.md) | Set the maximum threshold percentage. Specify a value between 0 and 100. Usage percentage above this value is tagged as critical.  | 
**thresholdType** | [**ThresholdTypeEnum**](#ThresholdTypeEnum) | Indicate the object type for which threshold is to be set.  | 
**minThresholdPercentage** | [**BigDecimal**](BigDecimal.md) | Set the minimum threshold percentage. Specify a value between 0 and 100. Usage percentage above this value is tagged as warning.  | 

<a name="ThresholdTypeEnum"></a>
## Enum: ThresholdTypeEnum
Name | Value
---- | -----
NUMBER_OF_LOGICAL_SWITCHES | &quot;NUMBER_OF_LOGICAL_SWITCHES&quot;
NUMBER_OF_PREPARED_HOSTS | &quot;NUMBER_OF_PREPARED_HOSTS&quot;
NUMBER_OF_SYSTEM_WIDE_VIFS | &quot;NUMBER_OF_SYSTEM_WIDE_VIFS&quot;
NUMBER_OF_NSGROUP | &quot;NUMBER_OF_NSGROUP&quot;
NUMBER_OF_VCENTER_CLUSTERS | &quot;NUMBER_OF_VCENTER_CLUSTERS&quot;
NUMBER_OF_GI_PROTECTED_HOSTS | &quot;NUMBER_OF_GI_PROTECTED_HOSTS&quot;
NUMBER_OF_GI_PROTECTED_VMS | &quot;NUMBER_OF_GI_PROTECTED_VMS&quot;
NUMBER_OF_DFW_RULES | &quot;NUMBER_OF_DFW_RULES&quot;
NUMBER_OF_DFW_SECTIONS | &quot;NUMBER_OF_DFW_SECTIONS&quot;
NUMBER_OF_IPSETS | &quot;NUMBER_OF_IPSETS&quot;
NUMBER_OF_GROUPS_BASED_ON_IP_SETS | &quot;NUMBER_OF_GROUPS_BASED_ON_IP_SETS&quot;
NUMBER_OF_LOGICAL_PORTS | &quot;NUMBER_OF_LOGICAL_PORTS&quot;
NUMBER_OF_EDGE_CLUSTERS | &quot;NUMBER_OF_EDGE_CLUSTERS&quot;
NUMBER_OF_EDGE_NODES | &quot;NUMBER_OF_EDGE_NODES&quot;
NUMBER_OF_TIER0_ROUTERS | &quot;NUMBER_OF_TIER0_ROUTERS&quot;
NUMBER_OF_TIER1_ROUTERS | &quot;NUMBER_OF_TIER1_ROUTERS&quot;
NUMBER_OF_PREFIX_LIST | &quot;NUMBER_OF_PREFIX_LIST&quot;
NUMBER_OF_NAT_RULES | &quot;NUMBER_OF_NAT_RULES&quot;
NUMBER_OF_TIER1_WITH_NAT_RULE | &quot;NUMBER_OF_TIER1_WITH_NAT_RULE&quot;
NUMBER_OF_DHCP_SERVERS | &quot;NUMBER_OF_DHCP_SERVERS&quot;
NUMBER_OF_DHCP_IP_POOLS | &quot;NUMBER_OF_DHCP_IP_POOLS&quot;
NUMBER_OF_ACTIVE_DIRECTORY_GROUPS | &quot;NUMBER_OF_ACTIVE_DIRECTORY_GROUPS&quot;
NUMBER_OF_ACTIVE_DIRECTORY_DOMAINS | &quot;NUMBER_OF_ACTIVE_DIRECTORY_DOMAINS&quot;
NUMBER_OF_FIREWALL_SECTIONS | &quot;NUMBER_OF_FIREWALL_SECTIONS&quot;
NUMBER_OF_FIREWALL_RULES | &quot;NUMBER_OF_FIREWALL_RULES&quot;
GLOBAL_DEFAULT | &quot;GLOBAL_DEFAULT&quot;
