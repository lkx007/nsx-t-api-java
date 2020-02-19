# RepoSyncStatusReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the repo sync operation on the single nsx-manager  | 
**statusMessage** | **String** | Describes the steps which repo sync operation is performing currently.  |  [optional]
**failureMessage** | **String** | In case if repo sync fails due to some issue, an error message will be stored here.  |  [optional]
**failureCode** | **Long** | In case of repo sync related failure, the code for the error will be stored here.  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
FAILED | &quot;FAILED&quot;
SUCCESS | &quot;SUCCESS&quot;
