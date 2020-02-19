# LogicalPortState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duplicateBindings** | [**List&lt;DuplicateAddressBindingEntry&gt;**](DuplicateAddressBindingEntry.md) | If any address binding discovered on the port is also found on other port on the same logical switch, then it is included in the duplicate bindings list along with the ID of the port with which it conflicts.  |  [optional]
**transportNodeIds** | **List&lt;String&gt;** | Identifiers of the transport node where the port is located |  [optional]
**discoveredBindings** | [**List&lt;AddressBindingEntry&gt;**](AddressBindingEntry.md) | Contains the list of address bindings for a logical port that were automatically dicovered using various snooping methods like ARP, DHCP etc.  |  [optional]
**id** | **String** | Id of the logical port | 
**realizedBindings** | [**List&lt;AddressBindingEntry&gt;**](AddressBindingEntry.md) | List of logical port bindings that are realized. This list may be populated from the discovered bindings or manual user specified bindings. This binding configuration can be used by features such as firewall, spoof-guard, traceflow etc.  |  [optional]
