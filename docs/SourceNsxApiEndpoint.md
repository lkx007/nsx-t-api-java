# SourceNsxApiEndpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vcPort** | **Integer** | VC port that will be used to fetch details. |  [optional]
**vcUsername** | **String** | Username for connecting to VC. | 
**vcIp** | **String** | IP address or host name of VC. | 
**ip** | **String** | IP address or hostname of a source NSX API endpoint. This field is not applicable in case of vSphere network migration. |  [optional]
**authToken** | **String** | Auth token used to make REST calls to source NSX API endpoint. This field is not applicable in case of vSphere network migration. |  [optional]
**nsxSyncrole** | **String** | Signifies Universal Sync role status (STANDALONE, PRIMARY, SECONDARY) of a source NSX API endpoint. |  [optional]
**vcVersion** | **String** | Build version of VC. |  [optional]
**nsxUsername** | **String** | Username for connecting to NSX manager. This field is not applicable in case of vSphere network migration. |  [optional]
**nsxVersion** | **String** | Build version (major, minor, patch) of a source NSX API endpoint. |  [optional]
**nsxPassword** | **String** | Password for connecting to NSX manager. This field is not applicable in case of vSphere network migration. |  [optional]
**vcPassword** | **String** | Password for connecting to VC. |  [optional]
