# InstanceEndpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceAttachments** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | Id(s) of the Service Attachment where this enndpoint is connected to. Service Attachment is mandatory for LOGICAL Instance Endpoint. |  [optional]
**targetIps** | [**List&lt;IPInfo&gt;**](IPInfo.md) | Target IPs on an interface of the Service Instance. | 
**endpointType** | [**EndpointTypeEnum**](#EndpointTypeEnum) | LOGICAL - It must be created with a ServiceAttachment and identifies a destination connected to the Service Port of the ServiceAttachment, through the ServiceAttachment&#x27;s Logical Switch. VIRTUAL - It represents a L3 destination the router can route to but does not provide any further information about its location in the network. Virtual InstanceEndpoints are used for redirection targets that are not connected to Service Ports, such as the next-hop routers on the Edge uplinks. |  [optional]
**serviceInstanceId** | **String** | The Service instancee with which the instance endpoint is associated. |  [optional]
**linkIds** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | Link Ids are mandatory for VIRTUAL Instance Endpoint. Even though VIRTUAL, the Instance Endpoint should be connected/accessible through an NSX object. The link id is this NSX object id. Example - For North-South Service Insertion, this is the LogicalRouter Id through which the targetIp/L3 destination accessible. |  [optional]

<a name="EndpointTypeEnum"></a>
## Enum: EndpointTypeEnum
Name | Value
---- | -----
LOGICAL | &quot;LOGICAL&quot;
VIRTUAL | &quot;VIRTUAL&quot;
