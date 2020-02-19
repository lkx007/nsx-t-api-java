# BFDProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if tunnel is active in a gateway HA setup |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the BFD session |  [optional]
**remoteState** | [**RemoteStateEnum**](#RemoteStateEnum) | State of the remote interface&#x27;s BFD session |  [optional]
**remoteDiagnostic** | **String** | A short message indicating what the remote interface&#x27;s BFD session thinks is wrong in case of a problem |  [optional]
**forwarding** | **Boolean** | True if the BFD session believes this interface may be used to forward traffic |  [optional]
**diagnostic** | **String** | A short message indicating what the BFD session thinks is wrong in case of a problem |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
UNKNOWN_STATE | &quot;UNKNOWN_STATE&quot;
ADMIN_DOWN | &quot;ADMIN_DOWN&quot;
DOWN | &quot;DOWN&quot;
INIT | &quot;INIT&quot;
UP | &quot;UP&quot;

<a name="RemoteStateEnum"></a>
## Enum: RemoteStateEnum
Name | Value
---- | -----
UNKNOWN_STATE | &quot;UNKNOWN_STATE&quot;
ADMIN_DOWN | &quot;ADMIN_DOWN&quot;
DOWN | &quot;DOWN&quot;
INIT | &quot;INIT&quot;
UP | &quot;UP&quot;
