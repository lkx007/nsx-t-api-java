# HostNodeLoginCredential

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | The username of the account on the host node |  [optional]
**password** | **String** | The authentication password of the host node |  [optional]
**thumbprint** | **String** | For ESXi hosts, the thumbprint of the ESXi management service. For KVM hosts, the SSH key fingerprint. If thumbprint is not provided then connection to host may not be established and API call will fail.  |  [optional]
