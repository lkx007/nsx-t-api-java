# DnsTtlConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ttl** | **Long** | The number of seconds that snooped DNS responses are retained in the cache. Used only when dns_ttl_type is USE_TTL. |  [optional]
**dnsTtlType** | [**DnsTtlTypeEnum**](#DnsTtlTypeEnum) | TTL type to decide how to manage ttl. | 

<a name="DnsTtlTypeEnum"></a>
## Enum: DnsTtlTypeEnum
Name | Value
---- | -----
USE_TTL | &quot;USE_TTL&quot;
AUTO | &quot;AUTO&quot;
NEVER_EXPIRE | &quot;NEVER_EXPIRE&quot;
