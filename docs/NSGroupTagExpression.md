# NSGroupTagExpression

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tagOp** | [**TagOpEnum**](#TagOpEnum) | Target_type VirtualMachine supports all specified operators for tag expression while LogicalSwitch and LogicalPort supports only EQUALS operator.  |  [optional]
**scope** | **String** | The tag.scope attribute of the object |  [optional]
**scopeOp** | [**ScopeOpEnum**](#ScopeOpEnum) | Operator of the scope expression eg- tag.scope &#x3D; \&quot;S1\&quot;. |  [optional]
**tag** | **String** | The tag.tag attribute of the object |  [optional]
**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) | Type of the resource on which this expression is evaluated | 

<a name="TagOpEnum"></a>
## Enum: TagOpEnum
Name | Value
---- | -----
EQUALS | &quot;EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
STARTSWITH | &quot;STARTSWITH&quot;
ENDSWITH | &quot;ENDSWITH&quot;

<a name="ScopeOpEnum"></a>
## Enum: ScopeOpEnum
Name | Value
---- | -----
EQUALS | &quot;EQUALS&quot;

<a name="TargetTypeEnum"></a>
## Enum: TargetTypeEnum
Name | Value
---- | -----
LOGICALSWITCH | &quot;LogicalSwitch&quot;
LOGICALPORT | &quot;LogicalPort&quot;
VIRTUALMACHINE | &quot;VirtualMachine&quot;
IPSET | &quot;IPSet&quot;
