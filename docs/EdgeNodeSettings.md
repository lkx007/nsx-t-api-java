# EdgeNodeSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchDomains** | **List&lt;String&gt;** | List of domain names that are used to complete unqualified host names.  |  [optional]
**dnsServers** | **List&lt;String&gt;** | List of DNS servers.  |  [optional]
**ntpServers** | **List&lt;String&gt;** | List of NTP servers.  |  [optional]
**hostname** | **String** | Host name or FQDN for edge node. |  [optional]
**enableSsh** | **Boolean** | Enabling SSH service is not recommended for security reasons.  |  [optional]
**allowSshRootLogin** | **Boolean** | Allowing root SSH logins is not recommended for security reasons. Edit of this property is not supported when updating transport node. Use the CLI to change this property.  |  [optional]
