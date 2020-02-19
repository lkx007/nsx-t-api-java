# ServiceDeploymentConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storageId** | **String** | Moref of the datastore in VC. If it is to be taken from &#x27;Agent VM Settings&#x27;, then it should be empty. |  [optional]
**hostId** | **String** | The service VM will be deployed on the specified host in the specified server within the cluster if host_id is specified. Note: You must ensure that storage and specified networks are accessible       by this host.  |  [optional]
**computeCollectionId** | **String** | Resource Pool or cluster Id. | 
**vmNicInfo** | [**VmNicInfo**](VmNicInfo.md) |  |  [optional]
**computeManagerId** | **String** | Context Id or VCenter Id. | 
