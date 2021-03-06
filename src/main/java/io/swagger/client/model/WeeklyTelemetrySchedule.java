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
import io.swagger.client.model.TelemetrySchedule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * WeeklyTelemetrySchedule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class WeeklyTelemetrySchedule extends TelemetrySchedule {
  @SerializedName("minutes")
  private Long minutes = 0l;

  @SerializedName("hour_of_day")
  private Long hourOfDay = null;

  /**
   * Day of week on which data will be collected. Specify one of SUNDAY through SATURDAY. 
   */
  @JsonAdapter(DayOfWeekEnum.Adapter.class)
  public enum DayOfWeekEnum {
    SUNDAY("SUNDAY"),
    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY");

    private String value;

    DayOfWeekEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DayOfWeekEnum fromValue(String text) {
      for (DayOfWeekEnum b : DayOfWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DayOfWeekEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("day_of_week")
  private DayOfWeekEnum dayOfWeek = null;

  public WeeklyTelemetrySchedule minutes(Long minutes) {
    this.minutes = minutes;
    return this;
  }

   /**
   * Minute at which data will be collected. Specify a value between 0 through 59. 
   * minimum: 0
   * maximum: 59
   * @return minutes
  **/
  @Schema(description = "Minute at which data will be collected. Specify a value between 0 through 59. ")
  public Long getMinutes() {
    return minutes;
  }

  public void setMinutes(Long minutes) {
    this.minutes = minutes;
  }

  public WeeklyTelemetrySchedule hourOfDay(Long hourOfDay) {
    this.hourOfDay = hourOfDay;
    return this;
  }

   /**
   * Hour at which data will be collected. Specify a value between 0 through 23. 
   * minimum: 0
   * maximum: 23
   * @return hourOfDay
  **/
  @Schema(required = true, description = "Hour at which data will be collected. Specify a value between 0 through 23. ")
  public Long getHourOfDay() {
    return hourOfDay;
  }

  public void setHourOfDay(Long hourOfDay) {
    this.hourOfDay = hourOfDay;
  }

  public WeeklyTelemetrySchedule dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Day of week on which data will be collected. Specify one of SUNDAY through SATURDAY. 
   * @return dayOfWeek
  **/
  @Schema(required = true, description = "Day of week on which data will be collected. Specify one of SUNDAY through SATURDAY. ")
  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeeklyTelemetrySchedule weeklyTelemetrySchedule = (WeeklyTelemetrySchedule) o;
    return Objects.equals(this.minutes, weeklyTelemetrySchedule.minutes) &&
        Objects.equals(this.hourOfDay, weeklyTelemetrySchedule.hourOfDay) &&
        Objects.equals(this.dayOfWeek, weeklyTelemetrySchedule.dayOfWeek) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minutes, hourOfDay, dayOfWeek, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeeklyTelemetrySchedule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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
