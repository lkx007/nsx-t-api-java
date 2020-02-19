# AddControllerNodeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mpaMsgClientInfo** | [**MsgClientInfo**](MsgClientInfo.md) |  | 
**hostMsgClientInfo** | [**MsgClientInfo**](MsgClientInfo.md) |  | 
**clusteringParams** | [**ClusteringInfo**](ClusteringInfo.md) |  |  [optional]
**nodeId** | **String** | Only use this if an id for the node already exists with MP. If not specified, then the node_id will be set to a random id. |  [optional]
**controlPlaneServerCertificate** | **String** | Deprecated. Do not supply a value for this property. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | must be set to AddControllerNodeSpec | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADDCONTROLLERNODESPEC | &quot;AddControllerNodeSpec&quot;
