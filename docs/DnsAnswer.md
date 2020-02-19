# DnsAnswer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dnsServer** | **String** | Dns server ip address and port, format is \&quot;ip address#port\&quot;.  | 
**rawAnswer** | **String** | It can be NXDOMAIN or error message which is not consisted of authoritative_answer or non_authoritative_answer.  |  [optional]
**nonAuthoritativeAnswers** | [**List&lt;DnsQueryAnswer&gt;**](DnsQueryAnswer.md) | Non-authotitative answers of the query. This is a deprecated property, please use &#x27;answers&#x27; instead.  |  [optional]
**sourceIp** | **String** | The source ip used in this lookup.  | 
**edgeNodeId** | **String** | ID of the edge node that performed the query.  | 
**authoritativeAnswers** | [**List&lt;DnsQueryAnswer&gt;**](DnsQueryAnswer.md) | Authotitative answers of the query. This is a deprecated property, please use &#x27;answers&#x27; instead.  |  [optional]
**answers** | [**List&lt;DnsQueryAnswer&gt;**](DnsQueryAnswer.md) | The answers of the query.  |  [optional]
