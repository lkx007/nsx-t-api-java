# FirewallSessionTimerProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tcpClosed** | **Long** | The timeout value of connection in seconds after one endpoint sends an RST. | 
**tcpOpening** | **Long** | The timeout value of connection in seconds after a second packet has been transferred. | 
**udpSingle** | **Long** | The timeout value of connection in seconds if the source host sends more than one packet but the destination host has never sent one back. | 
**tcpFinwait** | **Long** | The timeout value of connection in seconds after both FINs have been exchanged and connection is closed. | 
**tcpFirstPacket** | **Long** | The timeout value of connection in seconds after the first packet has been sent. | 
**tcpClosing** | **Long** | The timeout value of connection in seconds after the first FIN has been sent. | 
**tcpEstablished** | **Long** | The timeout value of connection in seconds once the connection has become fully established. | 
**udpMultiple** | **Long** | The timeout value of connection in seconds if both hosts have sent packets. | 
**icmpErrorReply** | **Long** | The timeout value for the connection after an ICMP error came back in response to an ICMP packet. | 
**udpFirstPacket** | **Long** | The timeout value of connection in seconds after the first packet. This will be the initial timeout for the new UDP flow. | 
**icmpFirstPacket** | **Long** | The timeout value of connection in seconds after the first packet. This will be the initial timeout for the new ICMP flow. | 
