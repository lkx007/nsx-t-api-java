# HostProfileNetworkMigrationSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkMappings** | [**List&lt;VmkToLogicalSwitchMapping&gt;**](VmkToLogicalSwitchMapping.md) | Based on provided mappings, VMkernal adapters will be migrated to mentioned logical switch. Without mappings specification doesn&#x27;t make any sense, hence minium one mapping should be specified. Assuming some sane value of 10 maximum migrations which will be supported by any single specification.  |  [optional]
