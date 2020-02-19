# IpfixDfwTemplateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceIcmpType** | **Boolean** | Type of the IPv4 ICMP message.  |  [optional]
**icmpCode** | **Boolean** | Code of the IPv4 ICMP message.  |  [optional]
**destinationTransportPort** | **Boolean** | The destination transport port of a monitored network flow.  |  [optional]
**octetDeltaCount** | **Boolean** | The number of octets since the previous report (if any) in incoming packets for this flow at the observation point. The number of octets include IP header(s) and payload.  |  [optional]
**vifUuid** | **Boolean** | VIF UUID - enterprise specific Information Element that uniquely identifies VIF.  |  [optional]
**protocolIdentifier** | **Boolean** | The value of the protocol number in the IP packet header.  |  [optional]
**firewallEvent** | **Boolean** | Five valid values are allowed: 1. Flow Created. 2. Flow Deleted. 3. Flow Denied. 4. Flow Alert (not used in DropKick implementation). 5. Flow Update.  |  [optional]
**flowDirection** | **Boolean** | Two valid values are allowed: 1. 0x00: igress flow to VM. 2. 0x01: egress flow from VM.  |  [optional]
**flowEnd** | **Boolean** | The absolute timestamp (seconds) of the last packet of this flow.  |  [optional]
**sourceTransportPort** | **Boolean** | The source transport port of a monitored network flow.  |  [optional]
**packetDeltaCount** | **Boolean** | The number of incoming packets since the previous report (if any) for this flow at the observation point.  |  [optional]
**destinationAddress** | **Boolean** | The destination IP address of a monitored network flow.  |  [optional]
**sourceAddress** | **Boolean** | The source IP address of a monitored network flow.  |  [optional]
**ruleId** | **Boolean** | Firewall rule Id - enterprise specific Information Element that uniquely identifies firewall rule.  |  [optional]
**flowStart** | **Boolean** | The absolute timestamp (seconds) of the first packet of this flow.  |  [optional]
