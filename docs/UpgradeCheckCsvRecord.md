# UpgradeCheckCsvRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the pre/post-upgrade check |  [optional]
**checkDescription** | **String** | Description of the pre/post-upgrade check |  [optional]
**failureMessages** | **String** | Space-separated list of failure messages |  [optional]
**checkName** | **String** | Display name of the pre/post-upgrade check | 
**upgradeUnitId** | **String** | Identifier of the upgrade unit |  [optional]
**upgradeUnitMetadata** | **String** | Meta-data of the upgrade-unit |  [optional]
**upgradeUnitType** | **String** | Component type of the upgrade unit | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
WARNING | &quot;WARNING&quot;
