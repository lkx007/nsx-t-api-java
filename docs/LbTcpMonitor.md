# LbTcpMonitor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**receive** | **String** | Expected data, if specified, can be anywhere in the response and it has to be a string, regular expressions are not supported.  |  [optional]
**send** | **String** | If both send and receive are not specified, then just a TCP connection is established (3-way handshake) to validate server is healthy, no data is sent.  |  [optional]
