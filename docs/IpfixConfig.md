# IpfixConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedTos** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of objects where the IPFIX Config will be enabled. |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Supported IPFIX Config Types. | 

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
IPFIXSWITCHCONFIG | &quot;IpfixSwitchConfig&quot;
IPFIXDFWCONFIG | &quot;IpfixDfwConfig&quot;
