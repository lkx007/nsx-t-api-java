# LbUdpMonitor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**receive** | **String** | Expected data, can be anywhere in the response and it has to be a string, regular expressions are not supported. UDP healthcheck is considered failed if there is no server response within the timeout period.  | 
**send** | **String** | The data to be sent to the monitored server.  | 
