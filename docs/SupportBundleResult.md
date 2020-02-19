# SupportBundleResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestProperties** | [**SupportBundleRequest**](SupportBundleRequest.md) |  |  [optional]
**failedNodes** | [**List&lt;FailedNodeSupportBundleResult&gt;**](FailedNodeSupportBundleResult.md) | Nodes where bundles were not generated or not copied to remote server |  [optional]
**successNodes** | [**List&lt;SuccessNodeSupportBundleResult&gt;**](SuccessNodeSupportBundleResult.md) | Nodes whose bundles were successfully copied to remote file server |  [optional]
**remainingNodes** | [**List&lt;RemainingSupportBundleNode&gt;**](RemainingSupportBundleNode.md) | Nodes where bundle generation is pending or in progress |  [optional]
