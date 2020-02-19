# LogicalRouterStatusPerNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**highAvailabilityStatus** | [**HighAvailabilityStatusEnum**](#HighAvailabilityStatusEnum) | A service router&#x27;s HA status on an edge node | 
**serviceRouterId** | **String** | id of the service router where the router status is retrieved. |  [optional]
**transportNodeId** | **String** | id of the transport node where the router status is retrieved. | 

<a name="HighAvailabilityStatusEnum"></a>
## Enum: HighAvailabilityStatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
STANDBY | &quot;STANDBY&quot;
DOWN | &quot;DOWN&quot;
SYNC | &quot;SYNC&quot;
UNKNOWN | &quot;UNKNOWN&quot;
