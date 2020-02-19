# RevisionedResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_revision** | **Integer** | The _revision property describes the current revision of the resource. To prevent clients from overwriting each other&#x27;s changes, PUT operations must include the current _revision of the resource, which clients should obtain by issuing a GET operation. If the _revision provided in a PUT request is missing or stale, the operation will be rejected. |  [optional]
