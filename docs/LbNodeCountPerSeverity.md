# LbNodeCountPerSeverity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeCount** | **Long** | Node count for specific serverity.  |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | The severity calculation is based on credit usage percentage of load balancer for one node.  |  [optional]

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
GREEN | &quot;GREEN&quot;
ORANGE | &quot;ORANGE&quot;
RED | &quot;RED&quot;
