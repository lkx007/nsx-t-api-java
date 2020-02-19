# ClusterNodeEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate** | **String** | Public certificate of the entity in PEM format | 
**entityUuid** | **String** | UUID of the entity | 
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Type of the entity | 
**subnetPrefixLength** | **Long** | Subnet mask prefix length of the entity binds to |  [optional]
**ipAddress** | **String** | IP address the entity binds to |  [optional]
**fqdn** | **String** | Domain name the entity binds to |  [optional]
**port** | **Long** | Port the entity binds to |  [optional]

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
MANAGER | &quot;MANAGER&quot;
CONTROLLER | &quot;CONTROLLER&quot;
POLICY | &quot;POLICY&quot;
HTTPS | &quot;HTTPS&quot;
CLUSTER_BOOT_MANAGER | &quot;CLUSTER_BOOT_MANAGER&quot;
DATASTORE | &quot;DATASTORE&quot;
