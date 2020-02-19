# DiscoveredNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stateless** | **Boolean** | The stateless property describes whether host persists its state across reboot or not. If state persists, value is set as false otherwise true. |  [optional]
**parentComputeCollection** | **String** | External id of the compute collection to which this node belongs |  [optional]
**certificate** | **String** | Certificate of the discovered node |  [optional]
**originId** | **String** | Id of the compute manager from where this node was discovered |  [optional]
**ipAddresses** | **List&lt;String&gt;** | IP Addresses of the the discovered node. |  [optional]
**hardwareId** | **String** | Hardware Id is generated using system hardware info. It is used to retrieve fabric node of the esx. |  [optional]
**osVersion** | **String** | OS version of the discovered node |  [optional]
**nodeType** | **String** | Discovered Node type like Host |  [optional]
**osType** | **String** | OS type of the discovered node |  [optional]
**originProperties** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) | Key-Value map of additional specific properties of discovered node in the Compute Manager  |  [optional]
**externalId** | **String** | External id of the discovered node, ex. a mo-ref from VC |  [optional]
**cmLocalId** | **String** | Local Id of the discovered node in the Compute Manager |  [optional]
