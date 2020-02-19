# IPv6DADStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | DAD status for IP address on the port.  |  [optional]
**transportNode** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | Array of transport node id on which DAD status is reported for given IP address.  |  [optional]
**ipAddress** | **String** | IP address on the port for which DAD status is reported.  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DUPLICATED | &quot;DUPLICATED&quot;
TENTATIVE | &quot;TENTATIVE&quot;
ASSIGNED | &quot;ASSIGNED&quot;
NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot;
UNKNOWN | &quot;UNKNOWN&quot;
