# NotificationAuthenticationScheme

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Username to use if scheme_name is BASIC_AUTH. |  [optional]
**certificateId** | **String** | Certificate ID with a valid certificate and private key, procured from trust-management API. |  [optional]
**schemeName** | [**SchemeNameEnum**](#SchemeNameEnum) | Authentication scheme to use when making notification requests to the partner/customer specified watcher. Specify one of BASIC_AUTH or CERTIFICATE. | 
**password** | **String** | Password to use if scheme_name is BASIC_AUTH. |  [optional]

<a name="SchemeNameEnum"></a>
## Enum: SchemeNameEnum
Name | Value
---- | -----
BASIC_AUTH | &quot;BASIC_AUTH&quot;
CERTIFICATE | &quot;CERTIFICATE&quot;
