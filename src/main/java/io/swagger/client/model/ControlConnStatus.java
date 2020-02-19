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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ControlConnStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ControlConnStatus {
  /**
   * Status of the control Node for e.g  UP, DOWN.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UP("UP"),
    DOWN("DOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("control_node_ip")
  private String controlNodeIp = null;

  /**
   * Failure status of the control Node for e.g CONNECTION_REFUSED,INCOMPLETE_HOST_CERT.
   */
  @JsonAdapter(FailureStatusEnum.Adapter.class)
  public enum FailureStatusEnum {
    CONNECTION_REFUSED("CONNECTION_REFUSED"),
    INCOMPLETE_HOST_CERT("INCOMPLETE_HOST_CERT"),
    INCOMPLETE_CONTROLLER_CERT("INCOMPLETE_CONTROLLER_CERT"),
    CONTROLLER_REJECTED_HOST_CERT("CONTROLLER_REJECTED_HOST_CERT"),
    HOST_REJECTED_CONTROLLER_CERT("HOST_REJECTED_CONTROLLER_CERT"),
    KEEP_ALIVE_TIMEOUT("KEEP_ALIVE_TIMEOUT"),
    OTHER_SSL_ERROR("OTHER_SSL_ERROR"),
    OTHER_ERROR("OTHER_ERROR");

    private String value;

    FailureStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FailureStatusEnum fromValue(String text) {
      for (FailureStatusEnum b : FailureStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FailureStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FailureStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FailureStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FailureStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("failure_status")
  private FailureStatusEnum failureStatus = null;

   /**
   * Status of the control Node for e.g  UP, DOWN.
   * @return status
  **/
  @Schema(description = "Status of the control Node for e.g  UP, DOWN.")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * IP address of the control Node.
   * @return controlNodeIp
  **/
  @Schema(description = "IP address of the control Node.")
  public String getControlNodeIp() {
    return controlNodeIp;
  }

   /**
   * Failure status of the control Node for e.g CONNECTION_REFUSED,INCOMPLETE_HOST_CERT.
   * @return failureStatus
  **/
  @Schema(description = "Failure status of the control Node for e.g CONNECTION_REFUSED,INCOMPLETE_HOST_CERT.")
  public FailureStatusEnum getFailureStatus() {
    return failureStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlConnStatus controlConnStatus = (ControlConnStatus) o;
    return Objects.equals(this.status, controlConnStatus.status) &&
        Objects.equals(this.controlNodeIp, controlConnStatus.controlNodeIp) &&
        Objects.equals(this.failureStatus, controlConnStatus.failureStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, controlNodeIp, failureStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlConnStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    controlNodeIp: ").append(toIndentedString(controlNodeIp)).append("\n");
    sb.append("    failureStatus: ").append(toIndentedString(failureStatus)).append("\n");
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