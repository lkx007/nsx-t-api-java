# UpgradeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostStatus** | [**HostUpgradeStatus**](HostUpgradeStatus.md) |  |  [optional]
**ccpStatus** | [**CCPUpgradeStatus**](CCPUpgradeStatus.md) |  |  [optional]
**edgeStatus** | [**EdgeUpgradeStatus**](EdgeUpgradeStatus.md) |  |  [optional]
**overallUpgradeStatus** | [**OverallUpgradeStatusEnum**](#OverallUpgradeStatusEnum) | Status of upgrade |  [optional]
**componentStatus** | [**List&lt;ComponentUpgradeStatus&gt;**](ComponentUpgradeStatus.md) | List of component statuses |  [optional]

<a name="OverallUpgradeStatusEnum"></a>
## Enum: OverallUpgradeStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
PAUSING | &quot;PAUSING&quot;
PAUSED | &quot;PAUSED&quot;
