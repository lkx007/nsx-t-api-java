# HttpServiceProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**globalApiConcurrencyLimit** | **Long** | The maximum number of concurrent API requests that will be serviced. If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client.  To disable API concurrency limiting, set this value to 0. |  [optional]
**clientApiConcurrencyLimit** | **Long** | The maximum number of concurrent API requests that will be serviced for a given authenticated client.  If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client. To disable API concurrency limiting, set this value to 0. |  [optional]
**sessionTimeout** | **Long** | NSX session inactivity timeout, set to 0 to configure no timeout |  [optional]
**clientApiRateLimit** | **Long** | The maximum number of API requests that will be serviced per second for a given authenticated client.  If more API requests are received than can be serviced, a 429 Too Many Requests HTTP response will be returned. To disable API rate limiting, set this value to 0. |  [optional]
**certificate** | [**Certificate**](Certificate.md) |  |  [optional]
**redirectHost** | **String** | Host name or IP address to use for redirect location headers, or empty string to derive from current request |  [optional]
**protocolVersions** | [**List&lt;ProtocolVersion&gt;**](ProtocolVersion.md) | TLS protocol versions |  [optional]
**cipherSuites** | [**List&lt;CipherSuite&gt;**](CipherSuite.md) | Cipher suites used to secure contents of connection |  [optional]
**connectionTimeout** | **Long** | NSX connection timeout, set to 0 to configure no timeout |  [optional]
