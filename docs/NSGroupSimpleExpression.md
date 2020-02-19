# NSGroupSimpleExpression

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetResource** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**targetProperty** | **String** | Field of the resource on which this expression is evaluated | 
**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) | Type of the resource on which this expression is evaluated | 
**value** | **String** | Value that satisfies this expression | 
**op** | [**OpEnum**](#OpEnum) | Operator of the expression | 

<a name="TargetTypeEnum"></a>
## Enum: TargetTypeEnum
Name | Value
---- | -----
NSGROUP | &quot;NSGroup&quot;
IPSET | &quot;IPSet&quot;
MACSET | &quot;MACSet&quot;
LOGICALSWITCH | &quot;LogicalSwitch&quot;
LOGICALPORT | &quot;LogicalPort&quot;
VIRTUALMACHINE | &quot;VirtualMachine&quot;
DIRECTORYGROUP | &quot;DirectoryGroup&quot;
VIRTUALNETWORKINTERFACE | &quot;VirtualNetworkInterface&quot;
TRANSPORTNODE | &quot;TransportNode&quot;

<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
STARTSWITH | &quot;STARTSWITH&quot;
ENDSWITH | &quot;ENDSWITH&quot;
NOTEQUALS | &quot;NOTEQUALS&quot;
