# AllocatedService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceReference** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**highAvailabilityStatus** | [**HighAvailabilityStatusEnum**](#HighAvailabilityStatusEnum) | Represents the active or the standby state of the service. |  [optional]
**allocationDetails** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Additional properties of a service, say the sub_pool_size and sub_pool_type for a LoadBalancer.  |  [optional]

<a name="HighAvailabilityStatusEnum"></a>
## Enum: HighAvailabilityStatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
STANDBY | &quot;STANDBY&quot;
DOWN | &quot;DOWN&quot;
SYNC | &quot;SYNC&quot;
UNKNOWN | &quot;UNKNOWN&quot;
