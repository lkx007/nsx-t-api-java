# LbRuleCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inverse** | **Boolean** | A flag to indicate whether reverse the match result of this condition |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of load balancer rule condition | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LBHTTPREQUESTMETHODCONDITION | &quot;LbHttpRequestMethodCondition&quot;
LBHTTPREQUESTURICONDITION | &quot;LbHttpRequestUriCondition&quot;
LBHTTPREQUESTURIARGUMENTSCONDITION | &quot;LbHttpRequestUriArgumentsCondition&quot;
LBHTTPREQUESTVERSIONCONDITION | &quot;LbHttpRequestVersionCondition&quot;
LBHTTPREQUESTHEADERCONDITION | &quot;LbHttpRequestHeaderCondition&quot;
LBHTTPREQUESTCOOKIECONDITION | &quot;LbHttpRequestCookieCondition&quot;
LBHTTPREQUESTBODYCONDITION | &quot;LbHttpRequestBodyCondition&quot;
LBHTTPRESPONSEHEADERCONDITION | &quot;LbHttpResponseHeaderCondition&quot;
LBTCPHEADERCONDITION | &quot;LbTcpHeaderCondition&quot;
LBIPHEADERCONDITION | &quot;LbIpHeaderCondition&quot;
LBVARIABLECONDITION | &quot;LbVariableCondition&quot;
LBHTTPSSLCONDITION | &quot;LbHttpSslCondition&quot;
