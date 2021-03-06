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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Duplicate address detection profile. 
 */
@Schema(description = "Duplicate address detection profile. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DADProfile extends ManagedResource {
  @SerializedName("wait_time")
  private Long waitTime = 1l;

  @SerializedName("ns_retries")
  private Long nsRetries = 3l;

  /**
   * DAD Mode
   */
  @JsonAdapter(DadModeEnum.Adapter.class)
  public enum DadModeEnum {
    LOOSE("LOOSE"),
    STRICT("STRICT");

    private String value;

    DadModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DadModeEnum fromValue(String text) {
      for (DadModeEnum b : DadModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DadModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DadModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DadModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DadModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("dad_mode")
  private DadModeEnum dadMode = DadModeEnum.LOOSE;

  public DADProfile waitTime(Long waitTime) {
    this.waitTime = waitTime;
    return this;
  }

   /**
   * The time duration in seconds, to wait for Neighbor advertisement after sending the Neighbor solicitation message. 
   * minimum: 0
   * maximum: 60
   * @return waitTime
  **/
  @Schema(description = "The time duration in seconds, to wait for Neighbor advertisement after sending the Neighbor solicitation message. ")
  public Long getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(Long waitTime) {
    this.waitTime = waitTime;
  }

  public DADProfile nsRetries(Long nsRetries) {
    this.nsRetries = nsRetries;
    return this;
  }

   /**
   * Number of Neighbor solicitation packets generated before completing the Duplicate address detection process. 
   * minimum: 0
   * maximum: 10
   * @return nsRetries
  **/
  @Schema(description = "Number of Neighbor solicitation packets generated before completing the Duplicate address detection process. ")
  public Long getNsRetries() {
    return nsRetries;
  }

  public void setNsRetries(Long nsRetries) {
    this.nsRetries = nsRetries;
  }

  public DADProfile dadMode(DadModeEnum dadMode) {
    this.dadMode = dadMode;
    return this;
  }

   /**
   * DAD Mode
   * @return dadMode
  **/
  @Schema(description = "DAD Mode")
  public DadModeEnum getDadMode() {
    return dadMode;
  }

  public void setDadMode(DadModeEnum dadMode) {
    this.dadMode = dadMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DADProfile daDProfile = (DADProfile) o;
    return Objects.equals(this.waitTime, daDProfile.waitTime) &&
        Objects.equals(this.nsRetries, daDProfile.nsRetries) &&
        Objects.equals(this.dadMode, daDProfile.dadMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waitTime, nsRetries, dadMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DADProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    nsRetries: ").append(toIndentedString(nsRetries)).append("\n");
    sb.append("    dadMode: ").append(toIndentedString(dadMode)).append("\n");
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
