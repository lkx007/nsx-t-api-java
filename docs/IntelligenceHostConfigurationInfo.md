# IntelligenceHostConfigurationInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextDataCollectionInterval** | **Long** | Interval in minute of reporting VM guest context data to NSX-Intelligence.  |  [optional]
**brokerTruststore** | **String** | A truststore to establish the trust between NSX and NSX-Intelligence brokers.  |  [optional]
**brokerCertificate** | **String** | A broker certificate to verify the identity of brokers.  |  [optional]
**contextUserUids** | **List&lt;String&gt;** | List of linux user uid to collect context data. Empty implies all users.  |  [optional]
**contextProcessHashes** | **List&lt;String&gt;** | List of hashes of processes to collect context data. Empty implies all processes.  |  [optional]
**enableDataCollection** | **Boolean** | Enable NSX-Intelligence data collection in host nodes.  |  [optional]
**contextProcessNames** | **List&lt;String&gt;** | List of processes to collect context data. Empty implies all processes.  |  [optional]
**privateIpPrefix** | [**List&lt;IntelligenceFlowPrivateIpPrefixInfo&gt;**](IntelligenceFlowPrivateIpPrefixInfo.md) | List of private IP prefix that NSX-Intelligence network flow is collected from.  |  [optional]
**brokerBootstrapServers** | [**List&lt;IntelligenceBrokerEndpointInfo&gt;**](IntelligenceBrokerEndpointInfo.md) | List of NSX-Intelligence broker endpoints that host nodes contact initially.  |  [optional]
**maxInactiveFlowCount** | **Long** | Maximum inactive network flow to collect in collection interval.  |  [optional]
**contextUserSids** | **List&lt;String&gt;** | List of windows user sid to collect context data. Empty implies all users.  |  [optional]
**flowDataCollectionInterval** | **Long** | Interval in minute of reporting network flow data to NSX-Intelligence.  |  [optional]
**maxActiveFlowCount** | **Long** | Maximum active network flow to collect in collection interval.  |  [optional]
