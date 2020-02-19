# PacketCaptureSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sessionid** | **String** | Packet capture session id. | 
**filelocation** | **String** | Packet capture file location. |  [optional]
**filesize** | **Integer** | Packet capture file Size in bytes. |  [optional]
**sessionname** | **String** | Packet capture session name. |  [optional]
**errormsg** | **String** | Error messasge in capture. |  [optional]
**endtime** | **Long** | Timestamp when session was stopped in epoch millisecond. |  [optional]
**request** | [**PacketCaptureRequest**](PacketCaptureRequest.md) |  | 
**starttime** | **Long** | Timestamp when session was created in epoch millisecond. |  [optional]
**sessionstatus** | [**SessionstatusEnum**](#SessionstatusEnum) | Packet capture session status. | 

<a name="SessionstatusEnum"></a>
## Enum: SessionstatusEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
STARTED | &quot;STARTED&quot;
STOPPED | &quot;STOPPED&quot;
FINISHED | &quot;FINISHED&quot;
ERROR | &quot;ERROR&quot;
