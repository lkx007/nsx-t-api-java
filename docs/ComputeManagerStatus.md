# ComputeManagerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | Version of the compute manager |  [optional]
**connectionStatus** | [**ConnectionStatusEnum**](#ConnectionStatusEnum) | Status of connection with the compute manager |  [optional]
**connectionErrors** | [**List&lt;ErrorInfo&gt;**](ErrorInfo.md) | Errors when connecting with compute manager |  [optional]
**lastSyncTime** | **Long** | Timestamp of the last successful update of Inventory, in epoch milliseconds. |  [optional]
**connectionStatusDetails** | **String** | Details about connection status |  [optional]
**registrationErrors** | [**List&lt;ErrorInfo&gt;**](ErrorInfo.md) | Errors when registering with compute manager |  [optional]
**registrationStatus** | [**RegistrationStatusEnum**](#RegistrationStatusEnum) | Registration status of compute manager |  [optional]

<a name="ConnectionStatusEnum"></a>
## Enum: ConnectionStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
CONNECTING | &quot;CONNECTING&quot;

<a name="RegistrationStatusEnum"></a>
## Enum: RegistrationStatusEnum
Name | Value
---- | -----
REGISTERED | &quot;REGISTERED&quot;
UNREGISTERED | &quot;UNREGISTERED&quot;
REGISTERING | &quot;REGISTERING&quot;
