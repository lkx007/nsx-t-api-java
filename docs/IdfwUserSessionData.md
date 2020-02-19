# IdfwUserSessionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | AD user ID (may not exist). |  [optional]
**userSessionId** | **Integer** | User session ID.  This also indicates whether this is VDI / RDSH. | 
**vmExtId** | **String** | Virtual machine (external ID or BIOS UUID) where login/logout events occurred. |  [optional]
**id** | **String** | Identifier of user session data. |  [optional]
**loginTime** | **Long** | Login time. | 
**userName** | **String** | AD user name. | 
**logoutTime** | **Long** | Logout time if applicable.  An active user session has no logout time. Non-active user session is stored (up to last 5 most recent entries) per VM and per user.  |  [optional]
**domainName** | **String** | AD Domain of user. | 
