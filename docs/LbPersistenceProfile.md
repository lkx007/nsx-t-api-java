# LbPersistenceProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistenceShared** | **Boolean** | The persistence shared flag identifies whether the persistence table is shared among virtual-servers referring this profile. If persistence shared flag is not set in the cookie persistence profile bound to a virtual server, it defaults to cookie persistence that is private to each virtual server and is qualified by the pool. This is accomplished by load balancer inserting a cookie with name in the format &amp;lt;name&amp;gt;.&amp;lt;virtual_server_id&amp;gt;.&amp;lt;pool_id&amp;gt;. If persistence shared flag is set in the cookie persistence profile, in cookie insert mode, cookie persistence could be shared across multiple virtual servers that are bound to the same pools. The cookie name would be changed to &amp;lt;name&amp;gt;.&amp;lt;profile-id&amp;gt;.&amp;lt;pool-id&amp;gt;. If persistence shared flag is not set in the sourceIp persistence profile bound to a virtual server, each virtual server that the profile is bound to maintains its own private persistence table. If persistence shared flag is set in the sourceIp persistence profile, all virtual servers the profile is bound to share the same persistence table. If persistence shared flag is not set in the generic persistence profile, the persistence entries are matched and stored in the table which is identified using both virtual server ID and profile ID. If persistence shared flag is set in the generic persistence profile, the persistence entries are matched and stored in the table which is identified using profile ID. It means that virtual servers which consume the same profile in the LbRule with this flag enabled are sharing the same persistence table.  |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The resource_type property identifies persistence profile type.  | 

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
LBCOOKIEPERSISTENCEPROFILE | &quot;LbCookiePersistenceProfile&quot;
LBSOURCEIPPERSISTENCEPROFILE | &quot;LbSourceIpPersistenceProfile&quot;
LBGENERICPERSISTENCEPROFILE | &quot;LbGenericPersistenceProfile&quot;
