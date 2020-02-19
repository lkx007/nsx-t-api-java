# InstanceDeploymentConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextId** | **String** | Context Id or VCenter Id. | 
**vmNicInfos** | [**List&lt;VmNicInfo&gt;**](VmNicInfo.md) | List of NIC information for VMs | 
**storageId** | **String** | Storage Id. | 
**hostId** | **String** | The service VM will be deployed on the specified host in the specified server within the cluster if host_id is specified. Note: You must ensure that storage and specified networks are accessible by this host.  |  [optional]
**computeId** | **String** | Resource Pool or Compute Id. | 
