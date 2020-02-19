# LbService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessLogEnabled** | **Boolean** | whether access log is enabled |  [optional]
**attachment** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**errorLogLevel** | [**ErrorLogLevelEnum**](#ErrorLogLevelEnum) | Load balancer engine writes information about encountered issues of different severity levels to the error log. This setting is used to define the severity level of the error log.  |  [optional]
**enabled** | **Boolean** | whether the load balancer service is enabled |  [optional]
**virtualServerIds** | **List&lt;String&gt;** | virtual servers can be associated to LbService(which is similar to physical/virtual load balancer), Lb virtual servers, pools and other entities could be defined independently, the virtual server identifier list here would be used to maintain the relationship of LbService and other Lb entities.  |  [optional]
**size** | [**SizeEnum**](#SizeEnum) | the size of load balancer service |  [optional]

<a name="ErrorLogLevelEnum"></a>
## Enum: ErrorLogLevelEnum
Name | Value
---- | -----
DEBUG | &quot;DEBUG&quot;
INFO | &quot;INFO&quot;
WARNING | &quot;WARNING&quot;
ERROR | &quot;ERROR&quot;
CRITICAL | &quot;CRITICAL&quot;
ALERT | &quot;ALERT&quot;
EMERGENCY | &quot;EMERGENCY&quot;

<a name="SizeEnum"></a>
## Enum: SizeEnum
Name | Value
---- | -----
SMALL | &quot;SMALL&quot;
MEDIUM | &quot;MEDIUM&quot;
LARGE | &quot;LARGE&quot;
DLB | &quot;DLB&quot;
