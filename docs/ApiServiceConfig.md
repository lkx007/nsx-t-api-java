# ApiServiceConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**globalApiConcurrencyLimit** | **Long** | The maximum number of concurrent API requests that will be serviced. If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client.  To disable API concurrency limiting, set this value to 0. |  [optional]
**lockoutImmuneAddresses** | **List&lt;String&gt;** | The list of IP addresses which are not subjected to a lockout on failed login attempts. |  [optional]
**clientApiConcurrencyLimit** | **Long** | The maximum number of concurrent API requests that will be serviced for a given authenticated client.  If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client. To disable API concurrency limiting, set this value to 0. |  [optional]
**sessionTimeout** | **Long** | NSX session inactivity timeout |  [optional]
**clientApiRateLimit** | **Long** | The maximum number of API requests that will be serviced per second for a given authenticated client.  If more API requests are received than can be serviced, a 429 Too Many Requests HTTP response will be returned. To disable API rate limiting, set this value to 0. |  [optional]
**redirectHost** | **String** | Host name or IP address to use for redirect location headers, or empty string to derive from current request. To disable, set redirect_host to the empty string (\&quot;\&quot;). |  [optional]
**protocolVersions** | [**List&lt;ProtocolVersion&gt;**](ProtocolVersion.md) | The TLS protocol versions that the API service will negotiate. |  [optional]
**cipherSuites** | [**List&lt;CipherSuite&gt;**](CipherSuite.md) | The TLS cipher suites that the API service will negotiate. |  [optional]
**connectionTimeout** | **Long** | NSX connection timeout, in seconds. To disable timeout, set to 0. |  [optional]
