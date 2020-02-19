# NodeProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**systemTime** | **Long** | Current time expressed in milliseconds since epoch |  [optional]
**nodeUuid** | **String** | Node Unique Identifier |  [optional]
**motd** | **Object** | Message of the day to display when users login to node using the NSX CLI |  [optional]
**cliTimeout** | **Long** | NSX CLI inactivity timeout, set to 0 to configure no timeout |  [optional]
**kernelVersion** | **String** | Kernel version |  [optional]
**exportType** | [**ExportTypeEnum**](#ExportTypeEnum) | Export restrictions in effect, if any |  [optional]
**hostname** | **String** | Host name or fully qualified domain name of node |  [optional]
**productVersion** | **String** | Product version |  [optional]
**nodeVersion** | **String** | Node version |  [optional]
**systemDatetime** | **String** | System date time in UTC |  [optional]
**fullyQualifiedDomainName** | **String** | Fully qualified domain name |  [optional]
**timezone** | **String** | Timezone |  [optional]

<a name="ExportTypeEnum"></a>
## Enum: ExportTypeEnum
Name | Value
---- | -----
RESTRICTED | &quot;RESTRICTED&quot;
UNRESTRICTED | &quot;UNRESTRICTED&quot;
