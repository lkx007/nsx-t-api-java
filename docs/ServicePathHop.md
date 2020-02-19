# ServicePathHop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isActiveFromDp** | **Boolean** | Indicating whether the corresponding service VM is active or not per DP. |  [optional]
**isActiveFromMp** | **Boolean** | Indicating whether the corresponding service VM is active or not per MP. |  [optional]
**vif** | **String** | ID of the virtual network interface. |  [optional]
**macAddress** | **String** | MAC address of the virtual network interface. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | Action that will be taken by the corresponding service VM of the hop. |  [optional]
**isActiveFromCcp** | **Boolean** | Indicating whether the corresponding service VM is active or not per CCP. |  [optional]
**inMaintenanceMode** | **Boolean** | Indicating the maintenance mode of the corresponding service VM. |  [optional]
**nshLivenessSupport** | **Boolean** | Indicating whether NSH liveness is supported or not by the corresponding service VM. |  [optional]
**canDecrementSi** | **Boolean** | Indicating whether service is configured to decrement SI field in NSH metadata. |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
SERVICE_ACTION_INVALID | &quot;SERVICE_ACTION_INVALID&quot;
COPY | &quot;COPY&quot;
REDIRECT | &quot;REDIRECT&quot;
