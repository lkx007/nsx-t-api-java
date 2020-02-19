# StaticHopBfdPeer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceAddresses** | **List&lt;String&gt;** | BFD peers will be created from all these source addresses to this neighbour. |  [optional]
**bfdConfig** | [**BfdConfigParameters**](BfdConfigParameters.md) |  |  [optional]
**enabled** | **Boolean** | Indicate BFD peer is enabled or disabled. Default is true. |  [optional]
**peerIpAddress** | **String** | IP address of BFD peer. This should be same as next hop IP address. | 
