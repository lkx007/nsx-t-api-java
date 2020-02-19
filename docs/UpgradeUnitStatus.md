# UpgradeUnitStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of upgrade unit |  [optional]
**errors** | **List&lt;String&gt;** | List of errors occurred during upgrade of this upgrade unit |  [optional]
**displayName** | **String** | Name of upgrade unit |  [optional]
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of upgrade progress in percentage |  [optional]
**id** | **String** | Identifier of upgrade unit |  [optional]
**metadata** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Metadata about upgrade unit |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSING | &quot;PAUSING&quot;
PAUSED | &quot;PAUSED&quot;
