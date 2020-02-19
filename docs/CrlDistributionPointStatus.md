# CrlDistributionPointStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the fetched CRL for this CrlDistributionPoint |  [optional]
**errorMessage** | **String** | Error message when fetching the CRL failed. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_READY | &quot;NOT_READY&quot;
FETCHING | &quot;FETCHING&quot;
READY | &quot;READY&quot;
ERROR | &quot;ERROR&quot;
