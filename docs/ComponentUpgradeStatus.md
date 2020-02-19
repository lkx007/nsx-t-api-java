# ComponentUpgradeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Upgrade status of component |  [optional]
**preUpgradeStatus** | [**UpgradeChecksExecutionStatus**](UpgradeChecksExecutionStatus.md) |  |  [optional]
**details** | **String** | Details about the upgrade status |  [optional]
**componentType** | **String** | Component type for the upgrade status |  [optional]
**nodeCountAtTargetVersion** | **Integer** | Number of nodes of the type and at the component version |  [optional]
**targetComponentVersion** | **String** | Target component version |  [optional]
**percentComplete** | [**BigDecimal**](BigDecimal.md) | Indicator of upgrade progress in percentage |  [optional]
**canSkip** | **Boolean** | Can the upgrade of the remaining units in this component be skipped |  [optional]
**currentVersionNodeSummary** | [**NodeSummaryList**](NodeSummaryList.md) |  |  [optional]

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
