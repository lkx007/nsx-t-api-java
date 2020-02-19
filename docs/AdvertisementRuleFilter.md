# AdvertisementRuleFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prefixOperator** | [**PrefixOperatorEnum**](#PrefixOperatorEnum) | GE prefix operator filters all the routes having network subset of any of the networks configured in Advertise rule. EQ prefix operator filter all the routes having network equal to any of the network configured in Advertise rule. | 
**matchRouteTypes** | [**List&lt;MatchRouteTypesEnum&gt;**](#List&lt;MatchRouteTypesEnum&gt;) | Array of route types to filter routes | 

<a name="PrefixOperatorEnum"></a>
## Enum: PrefixOperatorEnum
Name | Value
---- | -----
GE | &quot;GE&quot;
EQ | &quot;EQ&quot;

<a name="List<MatchRouteTypesEnum>"></a>
## Enum: List&lt;MatchRouteTypesEnum&gt;
Name | Value
---- | -----
ANY | &quot;ANY&quot;
STATIC | &quot;STATIC&quot;
T1_STATIC | &quot;T1_STATIC&quot;
NSX_CONNECTED | &quot;NSX_CONNECTED&quot;
T1_CONNECTED | &quot;T1_CONNECTED&quot;
T1_NAT | &quot;T1_NAT&quot;
T1_LB_VIP | &quot;T1_LB_VIP&quot;
T1_LB_SNAT | &quot;T1_LB_SNAT&quot;
T1_DNSFORWARDER | &quot;T1_DNSFORWARDER&quot;
T1_IPSEC_LOCAL_IP | &quot;T1_IPSEC_LOCAL_IP&quot;
