# ManagedResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_systemOwned** | **Boolean** | Indicates system owned resource |  [optional]
**displayName** | **String** | Defaults to ID if not set |  [optional]
**description** | **String** | Description of this resource |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | Opaque identifiers meaningful to the API user |  [optional]
**_createUser** | **String** | ID of the user who created this resource |  [optional]
**_protection** | **String** | Protection status is one of the following: PROTECTED - the client who retrieved the entity is not allowed             to modify it. NOT_PROTECTED - the client who retrieved the entity is allowed                 to modify it REQUIRE_OVERRIDE - the client who retrieved the entity is a super                    user and can modify it, but only when providing                    the request header X-Allow-Overwrite&#x3D;true. UNKNOWN - the _protection field could not be determined for this           entity.  |  [optional]
**_createTime** | **Long** | Timestamp of resource creation |  [optional]
**_lastModifiedTime** | **Long** | Timestamp of last modification |  [optional]
**_lastModifiedUser** | **String** | ID of the user who last modified this resource |  [optional]
**id** | **String** | Unique identifier of this resource |  [optional]
**resourceType** | **String** | The type of this resource. |  [optional]
