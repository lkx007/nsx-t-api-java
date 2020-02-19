# SwitchingToVmcModeParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sreOrg** | [**OrgInfo**](OrgInfo.md) |  |  [optional]
**defaultOrgId** | **String** | Org ID of a Client - commonly UUID. |  [optional]
**eaOrg** | [**OrgInfo**](OrgInfo.md) |  |  [optional]
**gssOrg** | [**OrgInfo**](OrgInfo.md) |  |  [optional]
**proxyHost** | **String** | IP/host of PoP (Point-of-Presence) HTTP proxy server |  [optional]
**cspTimeDrift** | **Long** | CSP time drift in milliseconds |  [optional]
**sddcId** | **String** | SDDC id |  [optional]
**basicAuthWhitelistIps** | **List&lt;String&gt;** | List of whitelist IPs for basic auth |  [optional]
**baseUrl** | **String** | Protocol and domain name (or IP address) of a CSP server, like \&quot;https://console-stg.cloud.vmware.com\&quot;. |  [optional]
**proxyPort** | **Long** | Port of PoP (Point-of-Presence) Http proxy server |  [optional]
**cspOrgUri** | **String** | Relative path on CSP server to the Org location. Can be \&quot;/csp/gateway/am/api/orgs/\&quot;. |  [optional]
**cspClientCredential** | [**Oauth2Credentials**](Oauth2Credentials.md) |  |  [optional]
**authCode** | [**Oauth2Credentials**](Oauth2Credentials.md) |  |  [optional]
**modeChangeOnly** | **Boolean** | When this parameter is set to true, only a change of the node mode happens without any update to the auth properties. When this param is not set to true i.e. set to false or not provided, mode change and update to the auth properties will both happen. |  [optional]
**cspClientIncomingCredentials** | **List&lt;String&gt;** | List of incoming client IDs |  [optional]
**serviceDefinitionId** | **String** | Service definition id |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Node Mode type |  [optional]

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
SWITCHINGTOVMCMODEPARAMETERS | &quot;SwitchingToVmcModeParameters&quot;
