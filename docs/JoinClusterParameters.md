# JoinClusterParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Username on the cluster node |  [optional]
**certficateSha256Thumbprint** | **String** | SHA256 Thumbprint of the API certificate of the cluster node | 
**token** | **String** | Limited time OAuth token instead of the username/password |  [optional]
**clusterId** | **String** | UUID of the cluster to join | 
**password** | **String** | Password of the user on the cluster node |  [optional]
**ipAddress** | **String** | IP address of a node already part of the cluster to join | 
**port** | **Long** | API port on the cluster node |  [optional]
