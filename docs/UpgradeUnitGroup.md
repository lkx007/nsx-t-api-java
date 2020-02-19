# UpgradeUnitGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Flag to indicate whether upgrade of this group is enabled or not |  [optional]
**upgradeUnitCount** | **Integer** | Number of upgrade units in the group |  [optional]
**type** | **String** | Component type | 
**upgradeUnits** | [**List&lt;UpgradeUnit&gt;**](UpgradeUnit.md) | List of upgrade units in the group |  [optional]
**extendedConfiguration** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Extended configuration for the group |  [optional]
**parallel** | **Boolean** | Upgrade method to specify whether the upgrade is to be performed in parallel or serially |  [optional]
