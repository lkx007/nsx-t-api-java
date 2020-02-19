# CapacityDashboardUsage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentUsageCount** | **Long** | Indicate the current usage count of object type.  | 
**maxThresholdPercentage** | [**BigDecimal**](BigDecimal.md) | This indicates the maximum threshold percentage for object type.  | 
**displayName** | **String** | Display name for NSX object type.  | 
**severity** | [**SeverityEnum**](#SeverityEnum) | Severity calculated from percentage usage  | 
**maxSupportedCount** | **Long** | This is the maximum supported count for object type in consideration.  | 
**usageType** | [**UsageTypeEnum**](#UsageTypeEnum) | Indicate the object type for which usage is calculated.  | 
**minThresholdPercentage** | [**BigDecimal**](BigDecimal.md) | This indicates the minimum threshold percentage for object type.  | 
**currentUsagePercentage** | [**BigDecimal**](BigDecimal.md) | Current usage percentage for object type  | 

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
INFO | &quot;INFO&quot;
WARNING | &quot;WARNING&quot;
CRITICAL | &quot;CRITICAL&quot;
ERROR | &quot;ERROR&quot;

<a name="UsageTypeEnum"></a>
## Enum: UsageTypeEnum
Name | Value
---- | -----
LOGICAL_SWITCHES | &quot;NUMBER_OF_LOGICAL_SWITCHES&quot;
PREPARED_HOSTS | &quot;NUMBER_OF_PREPARED_HOSTS&quot;
SYSTEM_WIDE_VIFS | &quot;NUMBER_OF_SYSTEM_WIDE_VIFS&quot;
NSGROUP | &quot;NUMBER_OF_NSGROUP&quot;
VCENTER_CLUSTERS | &quot;NUMBER_OF_VCENTER_CLUSTERS&quot;
GI_PROTECTED_HOSTS | &quot;NUMBER_OF_GI_PROTECTED_HOSTS&quot;
GI_PROTECTED_VMS | &quot;NUMBER_OF_GI_PROTECTED_VMS&quot;
DFW_RULES | &quot;NUMBER_OF_DFW_RULES&quot;
DFW_SECTIONS | &quot;NUMBER_OF_DFW_SECTIONS&quot;
L2_DFW_SECTIONS | &quot;NUMBER_OF_L2_DFW_SECTIONS&quot;
L3_DFW_SECTIONS | &quot;NUMBER_OF_L3_DFW_SECTIONS&quot;
L2_DFW_RULES | &quot;NUMBER_OF_L2_DFW_RULES&quot;
L3_DFW_RULES | &quot;NUMBER_OF_L3_DFW_RULES&quot;
L3_EDGE_SECTIONS | &quot;NUMBER_OF_L3_EDGE_SECTIONS&quot;
L3_EDGE_RULES | &quot;NUMBER_OF_L3_EDGE_RULES&quot;
L3_BRIDGEPORT_SECTIONS | &quot;NUMBER_OF_L3_BRIDGEPORT_SECTIONS&quot;
L3_BRIDGEPORT_RULES | &quot;NUMBER_OF_L3_BRIDGEPORT_RULES&quot;
IPSETS | &quot;NUMBER_OF_IPSETS&quot;
GROUPS_BASED_ON_IP_SETS | &quot;NUMBER_OF_GROUPS_BASED_ON_IP_SETS&quot;
LOGICAL_PORTS | &quot;NUMBER_OF_LOGICAL_PORTS&quot;
EDGE_CLUSTERS | &quot;NUMBER_OF_EDGE_CLUSTERS&quot;
EDGE_NODES | &quot;NUMBER_OF_EDGE_NODES&quot;
TIER0_ROUTERS | &quot;NUMBER_OF_TIER0_ROUTERS&quot;
TIER1_ROUTERS | &quot;NUMBER_OF_TIER1_ROUTERS&quot;
PREFIX_LIST | &quot;NUMBER_OF_PREFIX_LIST&quot;
NAT_RULES | &quot;NUMBER_OF_NAT_RULES&quot;
TIER1_WITH_NAT_RULE | &quot;NUMBER_OF_TIER1_WITH_NAT_RULE&quot;
DHCP_SERVERS | &quot;NUMBER_OF_DHCP_SERVERS&quot;
DHCP_IP_POOLS | &quot;NUMBER_OF_DHCP_IP_POOLS&quot;
ACTIVE_DIRECTORY_GROUPS | &quot;NUMBER_OF_ACTIVE_DIRECTORY_GROUPS&quot;
ACTIVE_DIRECTORY_DOMAINS | &quot;NUMBER_OF_ACTIVE_DIRECTORY_DOMAINS&quot;
FIREWALL_SECTIONS | &quot;NUMBER_OF_FIREWALL_SECTIONS&quot;
FIREWALL_RULES | &quot;NUMBER_OF_FIREWALL_RULES&quot;
