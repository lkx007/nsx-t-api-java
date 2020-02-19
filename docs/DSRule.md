# DSRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isDefault** | **Boolean** | Flag to indicate whether rule is default. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Rule direction in case of stateless distributed service rules. This will only considered if section level parameter is set to stateless. Default to IN_OUT if not specified. |  [optional]
**ruleTag** | **String** | User level field which will be printed in CLI and packet logs. |  [optional]
**ipProtocol** | [**IpProtocolEnum**](#IpProtocolEnum) | Type of IP packet that should be matched while enforcing the rule. |  [optional]
**notes** | **String** | User notes specific to the rule. |  [optional]
**appliedTos** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of object where rule will be enforced. The section level field overrides this one. Null will be treated as any. |  [optional]
**logged** | **Boolean** | Flag to enable packet logging. Default is disabled. |  [optional]
**disabled** | **Boolean** | Flag to disable rule. Disabled will only be persisted but never provisioned/realized. |  [optional]
**sources** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of sources. Null will be treated as any. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | Action enforced on the packets which matches the distributed service rule. Currently DS Layer supports below actions. ALLOW           - Forward any packet when a rule with this action gets a match (Used by Firewall). DROP            - Drop any packet when a rule with this action gets a match. Packets won&#x27;t go further(Used by Firewall). REJECT          - Terminate TCP connection by sending TCP reset for a packet when a rule with this action gets a match (Used by Firewall). REDIRECT        - Redirect any packet to a partner appliance when a rule with this action gets a match (Used by Service Insertion). DO_NOT_REDIRECT - Do not redirect any packet to a partner appliance when a rule with this action gets a match (Used by Service Insertion). | 
**priority** | **Long** | Priority of the rule. |  [optional]
**sourcesExcluded** | **Boolean** | Negation of the source. |  [optional]
**destinationsExcluded** | **Boolean** | Negation of the destination. |  [optional]
**destinations** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | List of the destinations. Null will be treated as any. |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
IN | &quot;IN&quot;
OUT | &quot;OUT&quot;
IN_OUT | &quot;IN_OUT&quot;

<a name="IpProtocolEnum"></a>
## Enum: IpProtocolEnum
Name | Value
---- | -----
IPV4 | &quot;IPV4&quot;
IPV6 | &quot;IPV6&quot;
IPV4_IPV6 | &quot;IPV4_IPV6&quot;

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
ALLOW | &quot;ALLOW&quot;
DROP | &quot;DROP&quot;
REJECT | &quot;REJECT&quot;
REDIRECT | &quot;REDIRECT&quot;
DO_NOT_REDIRECT | &quot;DO_NOT_REDIRECT&quot;
