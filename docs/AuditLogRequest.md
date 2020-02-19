# AuditLogRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logFilter** | **String** | Audit logs should meet the filter condition |  [optional]
**logAgeLimit** | **Long** | Include logs with timstamps not past the age limit in days |  [optional]
**logFilterType** | [**LogFilterTypeEnum**](#LogFilterTypeEnum) | Type of log filter |  [optional]

<a name="LogFilterTypeEnum"></a>
## Enum: LogFilterTypeEnum
Name | Value
---- | -----
TEXT | &quot;TEXT&quot;
REGEX | &quot;REGEX&quot;
