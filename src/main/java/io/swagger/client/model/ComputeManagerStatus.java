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
import io.swagger.client.model.ErrorInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Runtime status information of the compute manager
 */
@Schema(description = "Runtime status information of the compute manager")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ComputeManagerStatus {
  @SerializedName("version")
  private String version = null;

  /**
   * Status of connection with the compute manager
   */
  @JsonAdapter(ConnectionStatusEnum.Adapter.class)
  public enum ConnectionStatusEnum {
    UP("UP"),
    DOWN("DOWN"),
    CONNECTING("CONNECTING");

    private String value;

    ConnectionStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConnectionStatusEnum fromValue(String text) {
      for (ConnectionStatusEnum b : ConnectionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConnectionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConnectionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConnectionStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("connection_status")
  private ConnectionStatusEnum connectionStatus = null;

  @SerializedName("connection_errors")
  private List<ErrorInfo> connectionErrors = null;

  @SerializedName("last_sync_time")
  private Long lastSyncTime = null;

  @SerializedName("connection_status_details")
  private String connectionStatusDetails = null;

  @SerializedName("registration_errors")
  private List<ErrorInfo> registrationErrors = null;

  /**
   * Registration status of compute manager
   */
  @JsonAdapter(RegistrationStatusEnum.Adapter.class)
  public enum RegistrationStatusEnum {
    REGISTERED("REGISTERED"),
    UNREGISTERED("UNREGISTERED"),
    REGISTERING("REGISTERING");

    private String value;

    RegistrationStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RegistrationStatusEnum fromValue(String text) {
      for (RegistrationStatusEnum b : RegistrationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RegistrationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegistrationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegistrationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RegistrationStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("registration_status")
  private RegistrationStatusEnum registrationStatus = null;

   /**
   * Version of the compute manager
   * @return version
  **/
  @Schema(description = "Version of the compute manager")
  public String getVersion() {
    return version;
  }

   /**
   * Status of connection with the compute manager
   * @return connectionStatus
  **/
  @Schema(description = "Status of connection with the compute manager")
  public ConnectionStatusEnum getConnectionStatus() {
    return connectionStatus;
  }

   /**
   * Errors when connecting with compute manager
   * @return connectionErrors
  **/
  @Schema(description = "Errors when connecting with compute manager")
  public List<ErrorInfo> getConnectionErrors() {
    return connectionErrors;
  }

   /**
   * Timestamp of the last successful update of Inventory, in epoch milliseconds.
   * @return lastSyncTime
  **/
  @Schema(description = "Timestamp of the last successful update of Inventory, in epoch milliseconds.")
  public Long getLastSyncTime() {
    return lastSyncTime;
  }

   /**
   * Details about connection status
   * @return connectionStatusDetails
  **/
  @Schema(description = "Details about connection status")
  public String getConnectionStatusDetails() {
    return connectionStatusDetails;
  }

   /**
   * Errors when registering with compute manager
   * @return registrationErrors
  **/
  @Schema(description = "Errors when registering with compute manager")
  public List<ErrorInfo> getRegistrationErrors() {
    return registrationErrors;
  }

   /**
   * Registration status of compute manager
   * @return registrationStatus
  **/
  @Schema(description = "Registration status of compute manager")
  public RegistrationStatusEnum getRegistrationStatus() {
    return registrationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeManagerStatus computeManagerStatus = (ComputeManagerStatus) o;
    return Objects.equals(this.version, computeManagerStatus.version) &&
        Objects.equals(this.connectionStatus, computeManagerStatus.connectionStatus) &&
        Objects.equals(this.connectionErrors, computeManagerStatus.connectionErrors) &&
        Objects.equals(this.lastSyncTime, computeManagerStatus.lastSyncTime) &&
        Objects.equals(this.connectionStatusDetails, computeManagerStatus.connectionStatusDetails) &&
        Objects.equals(this.registrationErrors, computeManagerStatus.registrationErrors) &&
        Objects.equals(this.registrationStatus, computeManagerStatus.registrationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, connectionStatus, connectionErrors, lastSyncTime, connectionStatusDetails, registrationErrors, registrationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeManagerStatus {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    connectionErrors: ").append(toIndentedString(connectionErrors)).append("\n");
    sb.append("    lastSyncTime: ").append(toIndentedString(lastSyncTime)).append("\n");
    sb.append("    connectionStatusDetails: ").append(toIndentedString(connectionStatusDetails)).append("\n");
    sb.append("    registrationErrors: ").append(toIndentedString(registrationErrors)).append("\n");
    sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
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
