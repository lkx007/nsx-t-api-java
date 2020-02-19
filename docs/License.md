# License

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**features** | **String** | semicolon delimited feature list |  [optional]
**description** | **String** | license edition |  [optional]
**productVersion** | **String** | product version |  [optional]
**expiry** | **Long** | date that license expires |  [optional]
**isEval** | **Boolean** | true for evalution license |  [optional]
**isMh** | **Boolean** | multi-hypervisor support |  [optional]
**licenseKey** | **String** | license key |  [optional]
**isExpired** | **Boolean** | whether the license has expired |  [optional]
**productName** | **String** | product name |  [optional]
**capacityType** | [**CapacityTypeEnum**](#CapacityTypeEnum) | License metrics specifying the capacity type of license key. Types are: - VM - CPU - USER(Concurrent User)  |  [optional]
**quantity** | **Long** | license capacity; 0 for unlimited |  [optional]

<a name="CapacityTypeEnum"></a>
## Enum: CapacityTypeEnum
Name | Value
---- | -----
VM | &quot;VM&quot;
CPU | &quot;CPU&quot;
USER | &quot;USER&quot;
