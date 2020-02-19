# ControlClusteringConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**joinToExistingCluster** | **Boolean** | Specifies whether or not the cluster node VM should try to join to the existing control cluster or initialize a new one. Only required in uncertainty case, i.e. when there are manually- deployed controllers that are registered but not connected to the cluster and no auto-deployed controllers are part of the cluster.  |  [optional]
**sharedSecret** | **String** | Shared secret to be used when joining the cluster node VM to a control cluster or for initializing a new cluster with the VM. Must contain at least 4 unique characters and be at least 6 characters long.  |  [optional]
