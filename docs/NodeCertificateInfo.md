# NodeCertificateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificateSha256Thumbprint** | **String** | SHA256 of certificate |  [optional]
**certificate** | **String** | Certificate content |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Entity type of this certificate |  [optional]

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
HTTP | &quot;HTTP&quot;
DATASTORE | &quot;DATASTORE&quot;
MANAGER | &quot;MANAGER&quot;
POLICY | &quot;POLICY&quot;
CONTROLLER | &quot;CONTROLLER&quot;
