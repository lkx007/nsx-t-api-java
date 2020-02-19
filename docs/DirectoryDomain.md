# DirectoryDomain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ldapServers** | [**List&lt;DirectoryLdapServer&gt;**](DirectoryLdapServer.md) | Directory domain LDAP servers&#x27; information including host, name, port, protocol and so on. | 
**name** | **String** | Directory domain name which best describes the domain. It could be unique fqdn name or it could also be descriptive. There is no unique contraint for domain name among different domains. | 
**resourceType** | **String** | Domain resource type comes from multiple sub-classes extending this base class. For example, DirectoryAdDomain is one accepted resource_type. If there are more sub-classes defined, they will also be accepted resource_type. | 
