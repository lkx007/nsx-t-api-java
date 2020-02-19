# HaVipConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**haVipSubnets** | [**List&lt;VIPSubnet&gt;**](VIPSubnet.md) | Array of IP address subnets which will be used as floating IP addresses. | Note - this configuration is applicable only for Active-Standby LogicalRouter. | For Active-Active LogicalRouter this configuration will be rejected. | 
**redundantUplinkPortIds** | **List&lt;String&gt;** | Identifiers of logical router uplink ports which are to be paired to provide | redundancy. Floating IP will be owned by one of these uplink ports (depending upon | which node is Active). | 
**enabled** | **Boolean** | Flag to enable this ha vip config. |  [optional]
