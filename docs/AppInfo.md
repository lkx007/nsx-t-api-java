# AppInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**osType** | [**OsTypeEnum**](#OsTypeEnum) | OS type of VM the App belongs to |  [optional]
**version** | **String** | Version of the app |  [optional]
**name** | **String** | Name of the app |  [optional]
**vmIds** | **List&lt;String&gt;** | Ids of the VMs in which this app is installed |  [optional]
**manufacturer** | **String** | Manufacturer of the app |  [optional]

<a name="OsTypeEnum"></a>
## Enum: OsTypeEnum
Name | Value
---- | -----
INVALID | &quot;INVALID&quot;
WINDOWS | &quot;WINDOWS&quot;
LINUX | &quot;LINUX&quot;
