# LbFastTcpProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closeTimeout** | **Long** | It is used to specify how long a closing TCP connection (both FINs received or a RST is received) should be kept for this application before cleaning up the connection.  |  [optional]
**idleTimeout** | **Long** | It is used to configure how long an idle TCP connection in ESTABLISHED state should be kept for this application before cleaning up.  |  [optional]
**haFlowMirroringEnabled** | **Boolean** | If flow mirroring is enabled, all the flows to the bounded virtual server are mirrored to the standby node.  |  [optional]
