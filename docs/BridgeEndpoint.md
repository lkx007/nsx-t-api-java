# BridgeEndpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**haEnable** | **Boolean** | This field will not be used if an edge cluster is being used for the bridge endpoint  |  [optional]
**bridgeClusterId** | **String** | This field will not be used if an edge cluster is being used for the bridge endpoint  |  [optional]
**vlanTransportZoneId** | **String** | This field will not be used if a bridge cluster is being used for the bridge endpoint  |  [optional]
**bridgeEndpointProfileId** | **String** | This field will not be used if a bridge cluster is being used for the bridge endpoint  |  [optional]
**uplinkTeamingPolicyName** | **String** | This name has to be one of the switching uplink teaming policy names listed inside the TransportZone. If this field is not specified, bridge will use the first pnic in host-switch config. This field will not be used if a bridge cluster is being used for the bridge endpoint |  [optional]
**vlanTrunkSpec** | [**VlanTrunkSpec**](VlanTrunkSpec.md) |  |  [optional]
**vlan** | **Long** | This property is used for VLAN specification of bridge endpoint. It&#x27;s mutually exclusive with &#x27;vlan_trunk_spec&#x27;, either &#x27;vlan&#x27; or &#x27;vlan_trunk_spec&#x27; should be specified.  |  [optional]
