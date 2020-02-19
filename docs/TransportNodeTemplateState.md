# TransportNodeTemplateState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) | Transport node template state on individual hosts of ComputeCollection which enabled automated transport code creation. &#x27;FAILED_TO_CREATE&#x27; means transport node isn&#x27;t created. &#x27;IN_PROGRESS&#x27; means transport node is in progress of creation. &#x27;FAILED_TO_REALIZE&#x27; means transport node has been created, but failed on host realization, it will repush to host by NSX later. &#x27;SUCCESS&#x27; means transport node creation is succeeded.  |  [optional]
**nodeId** | **String** | node id | 
**transportNodeId** | **String** | transport node id |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
FAILED_TO_CREATE | &quot;FAILED_TO_CREATE&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
FAILED_TO_REALIZE | &quot;FAILED_TO_REALIZE&quot;
SUCCESS | &quot;SUCCESS&quot;
