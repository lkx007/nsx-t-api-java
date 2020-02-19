# WeeklyTelemetrySchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minutes** | **Long** | Minute at which data will be collected. Specify a value between 0 through 59.  |  [optional]
**hourOfDay** | **Long** | Hour at which data will be collected. Specify a value between 0 through 23.  | 
**dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum) | Day of week on which data will be collected. Specify one of SUNDAY through SATURDAY.  | 

<a name="DayOfWeekEnum"></a>
## Enum: DayOfWeekEnum
Name | Value
---- | -----
SUNDAY | &quot;SUNDAY&quot;
MONDAY | &quot;MONDAY&quot;
TUESDAY | &quot;TUESDAY&quot;
WEDNESDAY | &quot;WEDNESDAY&quot;
THURSDAY | &quot;THURSDAY&quot;
FRIDAY | &quot;FRIDAY&quot;
SATURDAY | &quot;SATURDAY&quot;
