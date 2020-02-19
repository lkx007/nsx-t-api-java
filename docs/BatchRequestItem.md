# BatchRequestItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **Object** |  |  [optional]
**uri** | **String** | relative uri (path and args), of the call including resource id (if this is a POST/DELETE), exclude hostname and port and prefix, exploded form of parameters | 
**method** | [**MethodEnum**](#MethodEnum) | http method type | 

<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
DELETE | &quot;DELETE&quot;
PATCH | &quot;PATCH&quot;
