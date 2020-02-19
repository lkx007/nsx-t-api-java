# AlarmSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threadId** | **String** | The datapath thread name ID |  [optional]
**interfaceName** | **String** | The NIC interface name |  [optional]
**quiesceBlockedTime** | **Long** | Time in milliseconds that elapsed in blocked state |  [optional]
**localIp** | **String** | VPN session/tunnel etc. local Ip(v4 or v6) address |  [optional]
**id** | **String** | Identifier of the Alarm source entity for e.g. Vpn session id, Vpn tunnel id etc. |  [optional]
**ipAddressType** | [**IpAddressTypeEnum**](#IpAddressTypeEnum) | Ip address type v4, v6 etc. |  [optional]
**processName** | **String** | Name of the process which is blocked from entering quiesce state |  [optional]
**ipAddress** | **String** | Ip address |  [optional]
**mount** | **String** | Filesystem mount name |  [optional]
**peerIp** | **String** | VPN session/tunnel etc. peer Ip(v4 or v6) address |  [optional]

<a name="IpAddressTypeEnum"></a>
## Enum: IpAddressTypeEnum
Name | Value
---- | -----
IPV4 | &quot;IPV4&quot;
IPV6 | &quot;IPV6&quot;
