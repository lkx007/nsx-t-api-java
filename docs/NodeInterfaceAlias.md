# NodeInterfaceAlias

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipConfiguration** | [**IpConfigurationEnum**](#IpConfigurationEnum) | Interface configuration |  [optional]
**netmask** | **String** | Interface netmask |  [optional]
**ipAddress** | **String** | Interface IP address |  [optional]
**physicalAddress** | **String** | Interface MAC address |  [optional]
**broadcastAddress** | **String** | Interface broadcast address |  [optional]

<a name="IpConfigurationEnum"></a>
## Enum: IpConfigurationEnum
Name | Value
---- | -----
DHCP | &quot;dhcp&quot;
STATIC | &quot;static&quot;
NOT_CONFIGURED | &quot;not configured&quot;
