# BfdConfigParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**receiveInterval** | **Long** | The time interval (in milliseconds) between heartbeat packets for BFD when receiving heartbeats.| For edge cluster type of bare metal, this value should be &gt;&#x3D; 300ms.| For edge cluster type of virtual machine or hybrid, this value should be &gt;&#x3D; 1000ms. |  [optional]
**declareDeadMultiple** | **Long** | Number of times a packet is missed before BFD declares the neighbor down. |  [optional]
**transmitInterval** | **Long** | The time interval (in milliseconds) between heartbeat packets for BFD when sending heartbeats.| For edge cluster type of bare metal, this value should be &gt;&#x3D; 300ms.| For edge cluster type of virtual machine or hybrid, this value should be &gt;&#x3D; 1000ms. |  [optional]
