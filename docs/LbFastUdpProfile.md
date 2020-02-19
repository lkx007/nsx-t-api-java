# LbFastUdpProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idleTimeout** | **Long** | Though UDP is a connectionless protocol, for the purposes of load balancing, all UDP packets with the same flow signature (source and destination IP/ports and IP protocol) received within the idle timeout period are considered to belong to the same connection and are sent to the same backend server. If no packets are received for idle timeout period, the connection (association between flow signature and the selected server) is cleaned up.  |  [optional]
**flowMirroringEnabled** | **Boolean** | If flow mirroring is enabled, all the flows to the bounded virtual server are mirrored to the standby node.  |  [optional]
