# DirectoryLdapServer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Directory LDAP server connection user name. |  [optional]
**host** | **String** | Directory LDAP server DNS host name or ip address which is reachable by NSX manager to be connected and do object synchronization. | 
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Directory LDAP server connection protocol which is either LDAP or LDAPS. |  [optional]
**thumbprint** | **String** | Directory LDAP server certificate thumbprint used in secure LDAPS connection. |  [optional]
**password** | **String** | Directory LDAP server connection password. |  [optional]
**domainName** | **String** | Directory domain name which best describes the domain. It could be unique fqdn name or it could also be descriptive. There is no unique contraint for domain name among different domains. |  [optional]
**port** | **Long** | Directory LDAP server connection TCP/UDP port. |  [optional]

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
LDAP | &quot;LDAP&quot;
LDAPS | &quot;LDAPS&quot;
