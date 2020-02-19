# LbRuleAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The property identifies the load balancer rule action type.  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LBHTTPREQUESTURIREWRITEACTION | &quot;LbHttpRequestUriRewriteAction&quot;
LBHTTPREQUESTHEADERREWRITEACTION | &quot;LbHttpRequestHeaderRewriteAction&quot;
LBHTTPREJECTACTION | &quot;LbHttpRejectAction&quot;
LBHTTPREDIRECTACTION | &quot;LbHttpRedirectAction&quot;
LBSELECTPOOLACTION | &quot;LbSelectPoolAction&quot;
LBSELECTSERVERACTION | &quot;LbSelectServerAction&quot;
LBHTTPRESPONSEHEADERREWRITEACTION | &quot;LbHttpResponseHeaderRewriteAction&quot;
LBHTTPREQUESTHEADERDELETEACTION | &quot;LbHttpRequestHeaderDeleteAction&quot;
LBHTTPRESPONSEHEADERDELETEACTION | &quot;LbHttpResponseHeaderDeleteAction&quot;
LBVARIABLEASSIGNMENTACTION | &quot;LbVariableAssignmentAction&quot;
LBVARIABLEPERSISTENCEONACTION | &quot;LbVariablePersistenceOnAction&quot;
LBVARIABLEPERSISTENCELEARNACTION | &quot;LbVariablePersistenceLearnAction&quot;
