/*
 * NSX-T Manager API
 * VMware NSX-T Manager REST API
 *
 * OpenAPI spec version: 2.5.1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.BackupSchedule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Schedule to specify day of the week and time to take automated backup
 */
@Schema(description = "Schedule to specify day of the week and time to take automated backup")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class WeeklyBackupSchedule extends BackupSchedule {
  @SerializedName("days_of_week")
  private List<Long> daysOfWeek = new ArrayList<Long>();

  @SerializedName("minute_of_day")
  private Long minuteOfDay = null;

  @SerializedName("hour_of_day")
  private Long hourOfDay = null;

  public WeeklyBackupSchedule daysOfWeek(List<Long> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public WeeklyBackupSchedule addDaysOfWeekItem(Long daysOfWeekItem) {
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Days of week when backup is taken. 0 - Sunday, 1 - Monday, 2 - Tuesday, 3 - Wednesday ...
   * @return daysOfWeek
  **/
  @Schema(required = true, description = "Days of week when backup is taken. 0 - Sunday, 1 - Monday, 2 - Tuesday, 3 - Wednesday ...")
  public List<Long> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Long> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public WeeklyBackupSchedule minuteOfDay(Long minuteOfDay) {
    this.minuteOfDay = minuteOfDay;
    return this;
  }

   /**
   * Time of day when backup is taken
   * minimum: 0
   * maximum: 59
   * @return minuteOfDay
  **/
  @Schema(required = true, description = "Time of day when backup is taken")
  public Long getMinuteOfDay() {
    return minuteOfDay;
  }

  public void setMinuteOfDay(Long minuteOfDay) {
    this.minuteOfDay = minuteOfDay;
  }

  public WeeklyBackupSchedule hourOfDay(Long hourOfDay) {
    this.hourOfDay = hourOfDay;
    return this;
  }

   /**
   * Time of day when backup is taken
   * minimum: 0
   * maximum: 23
   * @return hourOfDay
  **/
  @Schema(required = true, description = "Time of day when backup is taken")
  public Long getHourOfDay() {
    return hourOfDay;
  }

  public void setHourOfDay(Long hourOfDay) {
    this.hourOfDay = hourOfDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeeklyBackupSchedule weeklyBackupSchedule = (WeeklyBackupSchedule) o;
    return Objects.equals(this.daysOfWeek, weeklyBackupSchedule.daysOfWeek) &&
        Objects.equals(this.minuteOfDay, weeklyBackupSchedule.minuteOfDay) &&
        Objects.equals(this.hourOfDay, weeklyBackupSchedule.hourOfDay) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, minuteOfDay, hourOfDay, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeeklyBackupSchedule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    minuteOfDay: ").append(toIndentedString(minuteOfDay)).append("\n");
    sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
