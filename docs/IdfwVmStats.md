# IdfwVmStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vmExtId** | **String** | Virtual machine (external ID or BIOS UUID) where login/logout event occurred. | 
**activeSessions** | [**List&lt;IdfwUserSessionData&gt;**](IdfwUserSessionData.md) | List of active (still logged in) user login/sessions data (no limit) | 
**archivedSessions** | [**List&lt;IdfwUserSessionData&gt;**](IdfwUserSessionData.md) | Optional list of up to 5 most recent archived (previously logged in) user login/session data. |  [optional]
