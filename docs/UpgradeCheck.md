# UpgradeCheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of pre/post-upgrade check |  [optional]
**displayName** | **String** | Name of the pre/post-upgrade check |  [optional]
**failureMessages** | **List&lt;String&gt;** | List of failure messages |  [optional]
**componentType** | **String** | Component type | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
WARNING | &quot;WARNING&quot;
