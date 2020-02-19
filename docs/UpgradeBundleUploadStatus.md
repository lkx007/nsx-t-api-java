# UpgradeBundleUploadStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | URL for uploading upgrade bundle |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of upgrade bundle upload |  [optional]
**detailedStatus** | **String** | Detailed status of upgrade bundle upload |  [optional]
**percent** | [**BigDecimal**](BigDecimal.md) | Percent of bundle uploaded from URL |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UPLOADING | &quot;UPLOADING&quot;
VERIFYING | &quot;VERIFYING&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
