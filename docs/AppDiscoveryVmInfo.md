# AppDiscoveryVmInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vmName** | **String** | Name of the VM |  [optional]
**osType** | [**OsTypeEnum**](#OsTypeEnum) | OS type of the VM |  [optional]
**vmExternalId** | **String** | External Id of the VM |  [optional]
**osProperties** | **List&lt;String&gt;** | OS properties of the VM |  [optional]

<a name="OsTypeEnum"></a>
## Enum: OsTypeEnum
Name | Value
---- | -----
INVALID | &quot;INVALID&quot;
WINDOWS | &quot;WINDOWS&quot;
LINUX | &quot;LINUX&quot;
