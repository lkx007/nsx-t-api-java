# NodeNetworkInterfaceProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**physicalAddress** | **String** | Interface MAC address |  [optional]
**broadcastAddress** | **String** | Interface broadcast address |  [optional]
**linkStatus** | [**LinkStatusEnum**](#LinkStatusEnum) | Interface administration status |  [optional]
**defaultGateway** | **String** | Interface&#x27;s default gateway |  [optional]
**bondPrimary** | **String** | Bond&#x27;s primary device name in active-backup bond mode |  [optional]
**bondSlaves** | **List&lt;String&gt;** | Bond&#x27;s slave devices |  [optional]
**ipAddresses** | [**List&lt;IPv4AddressProperties&gt;**](IPv4AddressProperties.md) | Interface IP addresses |  [optional]
**vlan** | **Long** | VLAN Id |  [optional]
**bondMode** | [**BondModeEnum**](#BondModeEnum) | Bond mode |  [optional]
**interfaceId** | **String** | Interface ID |  [optional]
**adminStatus** | [**AdminStatusEnum**](#AdminStatusEnum) | Interface administration status |  [optional]
**plane** | [**PlaneEnum**](#PlaneEnum) | Interface plane |  [optional]
**isKni** | **Boolean** | Interface is a KNI |  [optional]
**ipConfiguration** | [**IpConfigurationEnum**](#IpConfigurationEnum) | Interface configuration | 
**mtu** | **Long** | Interface MTU |  [optional]

<a name="LinkStatusEnum"></a>
## Enum: LinkStatusEnum
Name | Value
---- | -----
UP | &quot;up&quot;
DOWN | &quot;down&quot;

<a name="BondModeEnum"></a>
## Enum: BondModeEnum
Name | Value
---- | -----
ACTIVE_BACKUP | &quot;ACTIVE_BACKUP&quot;
_802_3AD | &quot;802_3AD&quot;
ROUND_ROBIN | &quot;ROUND_ROBIN&quot;
BROADCAST | &quot;BROADCAST&quot;
XOR | &quot;XOR&quot;
TLB | &quot;TLB&quot;
ALB | &quot;ALB&quot;

<a name="AdminStatusEnum"></a>
## Enum: AdminStatusEnum
Name | Value
---- | -----
UP | &quot;up&quot;
DOWN | &quot;down&quot;

<a name="PlaneEnum"></a>
## Enum: PlaneEnum
Name | Value
---- | -----
MGMT | &quot;mgmt&quot;
DEBUG | &quot;debug&quot;
NONE | &quot;none&quot;

<a name="IpConfigurationEnum"></a>
## Enum: IpConfigurationEnum
Name | Value
---- | -----
DHCP | &quot;dhcp&quot;
STATIC | &quot;static&quot;
NOT_CONFIGURED | &quot;not configured&quot;
