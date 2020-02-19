# DirectoryGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domainSyncNodeId** | **String** | Domain sync node under which this directory group is located. We currently sync only from Root node and hence this attribute doesn&#x27;t have a specific value set. |  [optional]
**distinguishedName** | **String** | Directory group distinguished name | 
**domainId** | **String** | Domain ID this directory group belongs to. | 
**resourceType** | **String** | Directory group resource type comes from multiple sub-classes extending this base class. For example, DirectoryAdGroup is one accepted resource_type. If there are more sub-classes defined, they will also be accepted resource_type. | 
**domainName** | **String** | Each active directory domain has a domain naming context (NC), which contains domain-specific data. The root of this naming context is represented by a domain&#x27;s distinguished name (DN) and is typically referred to as the NC head. | 
