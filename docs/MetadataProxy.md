# MetadataProxy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secret** | **String** | secret to access metadata server |  [optional]
**metadataServerCaIds** | **List&lt;String&gt;** | The CAs referenced here must be uploaded to the truststore using the API POST /api/v1/trust-management/certificates?action&#x3D;import. User needs to ensure a correct CA for this metedata server is used. The REST API can not detect a wrong CA which was used to verify a different server. If the Metadata Proxy reports an ERROR or NO_BACKUP status, user can check the metadata proxy log at transport node for a possible CA issue.  |  [optional]
**edgeClusterMemberIndexes** | **List&lt;Long&gt;** | If none is provided, the NSX will auto-select two edge-nodes from the given edge cluster. If user provides only one edge node, there will be no HA support.  |  [optional]
**cryptoProtocols** | [**List&lt;CryptoProtocolsEnum&gt;**](#List&lt;CryptoProtocolsEnum&gt;) | The cryptographic protocols listed here are supported by the metadata proxy. The TLSv1.1 and TLSv1.2 are supported by default.  |  [optional]
**metadataServerUrl** | **String** | The URL in format scheme://host:port/path. Please note, the scheme supports only http and https as of now, port supports range 3000 - 9000, inclusive.  | 
**attachedLogicalPortId** | **String** | id of attached logical port |  [optional]
**enableStandbyRelocation** | **Boolean** | Flag to enable the auto-relocation of standby Metadata Proxy in case of edge node failure. Only tier 1 and auto placed Metadata Proxy are considered for the relocation.  |  [optional]
**edgeClusterId** | **String** | edge cluster uuid | 

<a name="List<CryptoProtocolsEnum>"></a>
## Enum: List&lt;CryptoProtocolsEnum&gt;
Name | Value
---- | -----
V1 | &quot;TLS_V1&quot;
V1_1 | &quot;TLS_V1_1&quot;
V1_2 | &quot;TLS_V1_2&quot;
