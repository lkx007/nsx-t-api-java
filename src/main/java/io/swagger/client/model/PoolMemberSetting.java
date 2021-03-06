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
 * The setting is used to add, update or remove pool members from pool. For static pool members, admin_state, display_name and weight can be updated. For dynamic pool members, only admin_state can be updated. 
 */
@Schema(description = "The setting is used to add, update or remove pool members from pool. For static pool members, admin_state, display_name and weight can be updated. For dynamic pool members, only admin_state can be updated. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PoolMemberSetting {
  /**
   * Member admin state
   */
  @JsonAdapter(AdminStateEnum.Adapter.class)
  public enum AdminStateEnum {
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    GRACEFUL_DISABLED("GRACEFUL_DISABLED");

    private String value;

    AdminStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AdminStateEnum fromValue(String text) {
      for (AdminStateEnum b : AdminStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AdminStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdminStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdminStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AdminStateEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("admin_state")
  private AdminStateEnum adminState = AdminStateEnum.ENABLED;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("port")
  private String port = null;

  @SerializedName("weight")
  private Long weight = null;

  @SerializedName("display_name")
  private String displayName = null;

  public PoolMemberSetting adminState(AdminStateEnum adminState) {
    this.adminState = adminState;
    return this;
  }

   /**
   * Member admin state
   * @return adminState
  **/
  @Schema(description = "Member admin state")
  public AdminStateEnum getAdminState() {
    return adminState;
  }

  public void setAdminState(AdminStateEnum adminState) {
    this.adminState = adminState;
  }

  public PoolMemberSetting ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Pool member IP address
   * @return ipAddress
  **/
  @Schema(required = true, description = "Pool member IP address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public PoolMemberSetting port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Pool member port number
   * @return port
  **/
  @Schema(description = "Pool member port number")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public PoolMemberSetting weight(Long weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Only applicable to static pool members. If supplied for a pool defined by a grouping object, update API would fail. 
   * minimum: 1
   * maximum: 255
   * @return weight
  **/
  @Schema(description = "Only applicable to static pool members. If supplied for a pool defined by a grouping object, update API would fail. ")
  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }

  public PoolMemberSetting displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Only applicable to static pool members. If supplied for a pool defined by a grouping object, update API would fail. 
   * @return displayName
  **/
  @Schema(description = "Only applicable to static pool members. If supplied for a pool defined by a grouping object, update API would fail. ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolMemberSetting poolMemberSetting = (PoolMemberSetting) o;
    return Objects.equals(this.adminState, poolMemberSetting.adminState) &&
        Objects.equals(this.ipAddress, poolMemberSetting.ipAddress) &&
        Objects.equals(this.port, poolMemberSetting.port) &&
        Objects.equals(this.weight, poolMemberSetting.weight) &&
        Objects.equals(this.displayName, poolMemberSetting.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminState, ipAddress, port, weight, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolMemberSetting {\n");
    
    sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
