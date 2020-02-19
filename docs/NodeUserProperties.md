# NodeUserProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | User login name (must be \&quot;root\&quot; if userid is 0) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the user. This value can be ACTIVE indicating authentication attempts will be successful if the correct credentials are specified. The value can also be PASSWORD_EXPIRED indicating authentication attempts will fail because the user&#x27;s password has expired and must be changed. Or, this value can be NOT_ACTIVATED indicating the user&#x27;s password has not yet been set and must be set before the user can authenticate. |  [optional]
**lastPasswordChange** | **Long** | Number of days since password was last changed |  [optional]
**fullName** | **String** | Full name for the user |  [optional]
**passwordChangeFrequency** | **Long** | Number of days password is valid before it must be changed. This can be set to 0 to indicate no password change is required or a positive integer up to 9999. By default local user passwords must be changed every 90 days. |  [optional]
**password** | **String** | Password for the user (optionally specified on PUT, unspecified on GET) |  [optional]
**userid** | **Long** | Numeric id for the user |  [optional]
**oldPassword** | **String** | Old password for the user (required on PUT if password specified) |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
PASSWORD_EXPIRED | &quot;PASSWORD_EXPIRED&quot;
NOT_ACTIVATED | &quot;NOT_ACTIVATED&quot;
