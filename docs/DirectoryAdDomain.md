# DirectoryAdDomain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDistinguishedName** | **String** | Each active directory domain has a domain naming context (NC), which contains domain-specific data. The root of this naming context is represented by a domain&#x27;s distinguished name (DN) and is typically referred to as the NC head. | 
**syncSettings** | [**DirectoryDomainSyncSettings**](DirectoryDomainSyncSettings.md) |  |  [optional]
**netbiosName** | **String** | NetBIOS names can contain all alphanumeric characters except for the certain disallowed characters. Names can contain a period, but names cannot start with a period. NetBIOS is similar to DNS in that it can serve as a directory service, but more limited as it has no provisions for a name hierarchy and names are limited to 15 characters. The netbios name is case insensitive and is stored in upper case regardless of input case. | 
