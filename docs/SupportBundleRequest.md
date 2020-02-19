# SupportBundleRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteFileServer** | [**SupportBundleRemoteFileServer**](SupportBundleRemoteFileServer.md) |  |  [optional]
**nodes** | **List&lt;String&gt;** | List of cluster/fabric node UUIDs processed in specified order | 
**contentFilters** | [**List&lt;ContentFiltersEnum&gt;**](#List&lt;ContentFiltersEnum&gt;) | Bundle should include content of specified type |  [optional]
**logAgeLimit** | **Long** | Include log files with modified times not past the age limit in days |  [optional]

<a name="List<ContentFiltersEnum>"></a>
## Enum: List&lt;ContentFiltersEnum&gt;
Name | Value
---- | -----
ALL | &quot;ALL&quot;
DEFAULT | &quot;DEFAULT&quot;
