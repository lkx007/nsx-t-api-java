# AddManagementNodeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mpaMsgClientInfo** | [**MsgClientInfo**](MsgClientInfo.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | must be set to AddManagementNodeSpec | 
**password** | **String** | The password to be used to authenticate with the remote node. |  [optional]
**userName** | **String** | The username to be used to authenticate with the remote node. | 
**remoteAddress** | **String** | The host address of the remote node to which to send this join request. | 
**certThumbprint** | **String** | The certificate thumbprint of the remote node. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADDMANAGEMENTNODESPEC | &quot;AddManagementNodeSpec&quot;
