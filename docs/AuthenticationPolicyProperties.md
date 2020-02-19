# AuthenticationPolicyProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiFailedAuthResetPeriod** | **Long** | In order to trigger an account lockout, all authentication failures must occur in this time window. If the reset period expires, the failed login count is reset to zero. Only applies to NSX Manager nodes. Ignored on other node types. |  [optional]
**minimumPasswordLength** | **Long** | Minimum number of characters required in account passwords |  [optional]
**cliFailedAuthLockoutPeriod** | **Long** | Once a lockout occurs, the account remains locked out of the CLI for this time period. While the lockout period is in effect, additional authentication attempts restart the lockout period, even if a valid password is specified. |  [optional]
**apiMaxAuthFailures** | **Long** | Only applies to NSX Manager nodes. Ignored on other node types. |  [optional]
**apiFailedAuthLockoutPeriod** | **Long** | Once a lockout occurs, the account remains locked out of the API for this time period. Only applies to NSX Manager nodes. Ignored on other node types. |  [optional]
**cliMaxAuthFailures** | **Long** | Number of authentication failures that trigger CLI lockout |  [optional]
