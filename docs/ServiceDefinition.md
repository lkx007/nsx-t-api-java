# ServiceDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceDeploymentSpec** | [**ServiceDeploymentSpec**](ServiceDeploymentSpec.md) |  |  [optional]
**serviceCapability** | [**ServiceCapability**](ServiceCapability.md) |  |  [optional]
**functionalities** | [**List&lt;FunctionalitiesEnum&gt;**](#List&lt;FunctionalitiesEnum&gt;) | The capabilities provided by the services. Needs to be one or more of the following | NG_FW - Next Generation Firewall | IDS_IPS - Intrusion detection System / Intrusion Prevention System | NET_MON - Network Monitoring | HCX - Hybrid Cloud Exchange | BYOD - Bring Your Own Device | EPP - Endpoint Protection.(Third party AntiVirus partners using NXGI should use this functionality for the service) | 
**attachmentPoint** | [**List&lt;AttachmentPointEnum&gt;**](#List&lt;AttachmentPointEnum&gt;) | The point at which the service is deployed/attached for redirecting the traffic to the the partner appliance. Attachment Point is required if Service caters to any functionality other than EPP. |  [optional]
**serviceManagerId** | **String** | ID of the service manager to which this service is attached with. This field is not set during creation of service. This field will be set explicitly when Service Manager is created successfully using this service.  |  [optional]
**vendorId** | **String** | Id which is unique to a vendor or partner for which the service is created. | 
**onFailurePolicy** | [**OnFailurePolicyEnum**](#OnFailurePolicyEnum) | Failure policy for the service tells datapath, the action to take i.e to Allow or Block traffic during failure scenarios. For north-south ServiceInsertion, failure policy in the service instance takes precedence. For east-west ServiceInsertion, failure policy in the service chain takes precedence. BLOCK is not supported for Endpoint protection (EPP) functionality. |  [optional]
**transports** | [**List&lt;TransportsEnum&gt;**](#List&lt;TransportsEnum&gt;) | Transport Type of the service, which is the mechanism of redirecting the traffic to the the partner appliance. Transport type is required if Service caters to any functionality other than EPP. |  [optional]
**implementations** | [**List&lt;ImplementationsEnum&gt;**](#List&lt;ImplementationsEnum&gt;) | This indicates the insertion point of the service i.e whether the service will be used to protect North-South or East-West traffic in the datacenter. | 

<a name="List<FunctionalitiesEnum>"></a>
## Enum: List&lt;FunctionalitiesEnum&gt;
Name | Value
---- | -----
NG_FW | &quot;NG_FW&quot;
IDS_IPS | &quot;IDS_IPS&quot;
NET_MON | &quot;NET_MON&quot;
HCX | &quot;HCX&quot;
BYOD | &quot;BYOD&quot;
EPP | &quot;EPP&quot;

<a name="List<AttachmentPointEnum>"></a>
## Enum: List&lt;AttachmentPointEnum&gt;
Name | Value
---- | -----
TIER0_LR | &quot;TIER0_LR&quot;
TIER1_LR | &quot;TIER1_LR&quot;
SERVICE_PLANE | &quot;SERVICE_PLANE&quot;

<a name="OnFailurePolicyEnum"></a>
## Enum: OnFailurePolicyEnum
Name | Value
---- | -----
ALLOW | &quot;ALLOW&quot;
BLOCK | &quot;BLOCK&quot;

<a name="List<TransportsEnum>"></a>
## Enum: List&lt;TransportsEnum&gt;
Name | Value
---- | -----
L2_BRIDGE | &quot;L2_BRIDGE&quot;
L3_ROUTED | &quot;L3_ROUTED&quot;
NSH | &quot;NSH&quot;

<a name="List<ImplementationsEnum>"></a>
## Enum: List&lt;ImplementationsEnum&gt;
Name | Value
---- | -----
NORTH_SOUTH | &quot;NORTH_SOUTH&quot;
EAST_WEST | &quot;EAST_WEST&quot;
