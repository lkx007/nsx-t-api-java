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
import io.swagger.client.model.IPSubnet;
import io.swagger.client.model.LogicalRouterPort;
import io.swagger.client.model.ResourceReference;
import io.swagger.client.model.ServiceBinding;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LogicalRouterDownLinkPort
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LogicalRouterDownLinkPort extends LogicalRouterPort {
  @SerializedName("subnets")
  private List<IPSubnet> subnets = new ArrayList<IPSubnet>();

  /**
   * Unicast Reverse Path Forwarding mode
   */
  @JsonAdapter(UrpfModeEnum.Adapter.class)
  public enum UrpfModeEnum {
    NONE("NONE"),
    STRICT("STRICT");

    private String value;

    UrpfModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UrpfModeEnum fromValue(String text) {
      for (UrpfModeEnum b : UrpfModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UrpfModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UrpfModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UrpfModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UrpfModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("urpf_mode")
  private UrpfModeEnum urpfMode = UrpfModeEnum.STRICT;

  @SerializedName("mac_address")
  private String macAddress = null;

  @SerializedName("ndra_profile_id")
  private String ndraProfileId = null;

  @SerializedName("linked_logical_switch_port_id")
  private ResourceReference linkedLogicalSwitchPortId = null;

  public LogicalRouterDownLinkPort subnets(List<IPSubnet> subnets) {
    this.subnets = subnets;
    return this;
  }

  public LogicalRouterDownLinkPort addSubnetsItem(IPSubnet subnetsItem) {
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Logical router port subnets
   * @return subnets
  **/
  @Schema(required = true, description = "Logical router port subnets")
  public List<IPSubnet> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<IPSubnet> subnets) {
    this.subnets = subnets;
  }

  public LogicalRouterDownLinkPort urpfMode(UrpfModeEnum urpfMode) {
    this.urpfMode = urpfMode;
    return this;
  }

   /**
   * Unicast Reverse Path Forwarding mode
   * @return urpfMode
  **/
  @Schema(description = "Unicast Reverse Path Forwarding mode")
  public UrpfModeEnum getUrpfMode() {
    return urpfMode;
  }

  public void setUrpfMode(UrpfModeEnum urpfMode) {
    this.urpfMode = urpfMode;
  }

   /**
   * MAC address
   * @return macAddress
  **/
  @Schema(description = "MAC address")
  public String getMacAddress() {
    return macAddress;
  }

  public LogicalRouterDownLinkPort ndraProfileId(String ndraProfileId) {
    this.ndraProfileId = ndraProfileId;
    return this;
  }

   /**
   * Identifier of Neighbor Discovery Router Advertisement profile associated with port. When NDRA profile id is associated at both the port level and logical router level, the profile id specified at port level takes the precedence. 
   * @return ndraProfileId
  **/
  @Schema(description = "Identifier of Neighbor Discovery Router Advertisement profile associated with port. When NDRA profile id is associated at both the port level and logical router level, the profile id specified at port level takes the precedence. ")
  public String getNdraProfileId() {
    return ndraProfileId;
  }

  public void setNdraProfileId(String ndraProfileId) {
    this.ndraProfileId = ndraProfileId;
  }

  public LogicalRouterDownLinkPort linkedLogicalSwitchPortId(ResourceReference linkedLogicalSwitchPortId) {
    this.linkedLogicalSwitchPortId = linkedLogicalSwitchPortId;
    return this;
  }

   /**
   * Get linkedLogicalSwitchPortId
   * @return linkedLogicalSwitchPortId
  **/
  @Schema(description = "")
  public ResourceReference getLinkedLogicalSwitchPortId() {
    return linkedLogicalSwitchPortId;
  }

  public void setLinkedLogicalSwitchPortId(ResourceReference linkedLogicalSwitchPortId) {
    this.linkedLogicalSwitchPortId = linkedLogicalSwitchPortId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalRouterDownLinkPort logicalRouterDownLinkPort = (LogicalRouterDownLinkPort) o;
    return Objects.equals(this.subnets, logicalRouterDownLinkPort.subnets) &&
        Objects.equals(this.urpfMode, logicalRouterDownLinkPort.urpfMode) &&
        Objects.equals(this.macAddress, logicalRouterDownLinkPort.macAddress) &&
        Objects.equals(this.ndraProfileId, logicalRouterDownLinkPort.ndraProfileId) &&
        Objects.equals(this.linkedLogicalSwitchPortId, logicalRouterDownLinkPort.linkedLogicalSwitchPortId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnets, urpfMode, macAddress, ndraProfileId, linkedLogicalSwitchPortId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalRouterDownLinkPort {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    urpfMode: ").append(toIndentedString(urpfMode)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    ndraProfileId: ").append(toIndentedString(ndraProfileId)).append("\n");
    sb.append("    linkedLogicalSwitchPortId: ").append(toIndentedString(linkedLogicalSwitchPortId)).append("\n");
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
