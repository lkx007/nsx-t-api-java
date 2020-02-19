# NotificationWatcher

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Optional description that can be associated with this NotificationWatcher. |  [optional]
**sendTimeout** | **Long** | Optional time duration (in seconds) to specify request timeout to notification watcher. If the send reaches the timeout, will try to send refresh_needed as true in the next time interval. The default value is 30 seconds. |  [optional]
**uri** | **String** | URI notification requests should be made on the specified server. | 
**id** | **String** | System generated identifier to identify a notification watcher uniquely.  |  [optional]
**certificateSha256Thumbprint** | **String** | Contains the hex-encoded SHA256 thumbprint of the HTTPS certificate. It must be specified if use_https is set to true. |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | Type of method notification requests should be made on the specified server. The value must be set to POST. | 
**sendInterval** | **Long** | Optional time interval (in seconds) for which notification URIs will be accumulated. At the end of the time interval the accumulated notification URIs will be sent to this NotificationWatcher in the form of zero (nothing accumulated) or more notification requests as soon as possible. If it is not specified, the NotificationWatcher should expected to receive notifications at any time. |  [optional]
**maxSendUriCount** | **Long** | If the number of notification URIs accumulated in specified send_interval exceeds max_send_uri_count, then multiple notification requests (each with max_send_uri_count or less number of notification URIs) will be sent to this NotificationWatcher. The default value is 5000. |  [optional]
**authenticationScheme** | [**NotificationAuthenticationScheme**](NotificationAuthenticationScheme.md) |  | 
**server** | **String** | IP address or fully qualified domain name of the partner/customer watcher. | 
**port** | **Long** | Optional integer port value to specify a non-standard HTTP or HTTPS port. |  [optional]
**useHttps** | **Boolean** | Optional field, when set to true indicates REST API server should use HTTPS. |  [optional]

<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
POST | &quot;POST&quot;
