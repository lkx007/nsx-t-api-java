# DhcpProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edgeClusterMemberIndexes** | **List&lt;Long&gt;** | The Edge nodes on which the DHCP servers run. If none is provided, the NSX will auto-select two edge-nodes from the given edge cluster. If only one edge node is provided, the DHCP servers will run without HA support.  |  [optional]
**enableStandbyRelocation** | **Boolean** | Flag to enable the auto-relocation of standby DHCP Service in case of edge node failure. Only tier 1 and auto placed DHCP servers are considered for the relocation.  |  [optional]
**edgeClusterId** | **String** | Edge cluster uuid on which the referencing logical DHCP server runs.  | 
