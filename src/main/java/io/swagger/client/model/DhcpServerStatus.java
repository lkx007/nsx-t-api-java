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
 * DhcpServerStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DhcpServerStatus {
  @SerializedName("error_message")
  private String errorMessage = null;

  /**
   * UP means the dhcp service is working fine on both active transport-node and stand-by transport-node (if have), hence fail-over can work at this time if there is failure happens on one of the transport-node; DOWN means the dhcp service is down on both active transport-node and stand-by node (if have), hence the dhcp-service will not repsonse any dhcp request; Error means error happens on transport-node(s) or no status is reported from transport-node(s). The dhcp service may be working (or not working); NO_STANDBY means dhcp service is working in one of the transport node while not in the other transport-node (if have). Hence if the dhcp service in the working transport-node is down, fail-over will not happen and the dhcp service will go down. 
   */
  @JsonAdapter(ServiceStatusEnum.Adapter.class)
  public enum ServiceStatusEnum {
    UP("UP"),
    DOWN("DOWN"),
    ERROR("ERROR"),
    NO_STANDBY("NO_STANDBY");

    private String value;

    ServiceStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ServiceStatusEnum fromValue(String text) {
      for (ServiceStatusEnum b : ServiceStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ServiceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("service_status")
  private ServiceStatusEnum serviceStatus = null;

  @SerializedName("stand_by_node")
  private String standByNode = null;

  @SerializedName("active_node")
  private String activeNode = null;

  public DhcpServerStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message, if available
   * @return errorMessage
  **/
  @Schema(description = "Error message, if available")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public DhcpServerStatus serviceStatus(ServiceStatusEnum serviceStatus) {
    this.serviceStatus = serviceStatus;
    return this;
  }

   /**
   * UP means the dhcp service is working fine on both active transport-node and stand-by transport-node (if have), hence fail-over can work at this time if there is failure happens on one of the transport-node; DOWN means the dhcp service is down on both active transport-node and stand-by node (if have), hence the dhcp-service will not repsonse any dhcp request; Error means error happens on transport-node(s) or no status is reported from transport-node(s). The dhcp service may be working (or not working); NO_STANDBY means dhcp service is working in one of the transport node while not in the other transport-node (if have). Hence if the dhcp service in the working transport-node is down, fail-over will not happen and the dhcp service will go down. 
   * @return serviceStatus
  **/
  @Schema(required = true, description = "UP means the dhcp service is working fine on both active transport-node and stand-by transport-node (if have), hence fail-over can work at this time if there is failure happens on one of the transport-node; DOWN means the dhcp service is down on both active transport-node and stand-by node (if have), hence the dhcp-service will not repsonse any dhcp request; Error means error happens on transport-node(s) or no status is reported from transport-node(s). The dhcp service may be working (or not working); NO_STANDBY means dhcp service is working in one of the transport node while not in the other transport-node (if have). Hence if the dhcp service in the working transport-node is down, fail-over will not happen and the dhcp service will go down. ")
  public ServiceStatusEnum getServiceStatus() {
    return serviceStatus;
  }

  public void setServiceStatus(ServiceStatusEnum serviceStatus) {
    this.serviceStatus = serviceStatus;
  }

  public DhcpServerStatus standByNode(String standByNode) {
    this.standByNode = standByNode;
    return this;
  }

   /**
   * uuid of stand_by transport node. null if non-HA mode
   * @return standByNode
  **/
  @Schema(description = "uuid of stand_by transport node. null if non-HA mode")
  public String getStandByNode() {
    return standByNode;
  }

  public void setStandByNode(String standByNode) {
    this.standByNode = standByNode;
  }

  public DhcpServerStatus activeNode(String activeNode) {
    this.activeNode = activeNode;
    return this;
  }

   /**
   * uuid of active transport node
   * @return activeNode
  **/
  @Schema(required = true, description = "uuid of active transport node")
  public String getActiveNode() {
    return activeNode;
  }

  public void setActiveNode(String activeNode) {
    this.activeNode = activeNode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhcpServerStatus dhcpServerStatus = (DhcpServerStatus) o;
    return Objects.equals(this.errorMessage, dhcpServerStatus.errorMessage) &&
        Objects.equals(this.serviceStatus, dhcpServerStatus.serviceStatus) &&
        Objects.equals(this.standByNode, dhcpServerStatus.standByNode) &&
        Objects.equals(this.activeNode, dhcpServerStatus.activeNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, serviceStatus, standByNode, activeNode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhcpServerStatus {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
    sb.append("    standByNode: ").append(toIndentedString(standByNode)).append("\n");
    sb.append("    activeNode: ").append(toIndentedString(activeNode)).append("\n");
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