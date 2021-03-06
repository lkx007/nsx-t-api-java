# LbRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phase** | [**PhaseEnum**](#PhaseEnum) | Each load balancer rule is used at a specific phase of load balancer processing. Currently three phases are supported, HTTP_REQUEST_REWRITE, HTTP_FORWARDING and HTTP_RESPONSE_REWRITE. When an HTTP request message is received by load balancer, all HTTP_REQUEST_REWRITE rules, if present are executed in the order they are applied to virtual server. And then if HTTP_FORWARDING rules present, only first matching rule&#x27;s action is executed, remaining rules are not checked. HTTP_FORWARDING rules can have only one action. If the request is forwarded to a backend server and the response goes back to load balancer, all HTTP_RESPONSE_REWRITE rules, if present, are executed in the order they are applied to the virtual server.  | 
**matchConditions** | [**List&lt;LbRuleCondition&gt;**](LbRuleCondition.md) | A list of match conditions used to match application traffic. Multiple match conditions can be specified in one load balancer rule, each match condition defines a criterion to match application traffic. If no match conditions are specified, then the load balancer rule will always match and it is used typically to define default rules. If more than one match condition is specified, then match strategy determines if all conditions should match or any one condition should match for the load balancer rule to considered a match.  |  [optional]
**actions** | [**List&lt;LbRuleAction&gt;**](LbRuleAction.md) | A list of actions to be executed at specified phase when load balancer rule matches. The actions are used to manipulate application traffic, such as rewrite URI of HTTP messages, redirect HTTP messages, etc.  | 
**matchStrategy** | [**MatchStrategyEnum**](#MatchStrategyEnum) | Strategy to define how load balancer rule is considered a match when multiple match conditions are specified in one rule. If match_stragety is set to ALL, then load balancer rule is considered a match only if all the conditions match. If match_strategy is set to ANY, then load balancer rule is considered a match if any one of the conditions match.  | 

<a name="PhaseEnum"></a>
## Enum: PhaseEnum
Name | Value
---- | -----
REQUEST_REWRITE | &quot;HTTP_REQUEST_REWRITE&quot;
FORWARDING | &quot;HTTP_FORWARDING&quot;
RESPONSE_REWRITE | &quot;HTTP_RESPONSE_REWRITE&quot;

<a name="MatchStrategyEnum"></a>
## Enum: MatchStrategyEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
ANY | &quot;ANY&quot;
