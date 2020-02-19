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
import io.swagger.client.model.ResourceReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Transport tunnel status.
 */
@Schema(description = "Transport tunnel status.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")

public class L2VPNTransportTunnelStatus {
  /**
   * Resource types of L2VPN Transport tunnels
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    IPSECVPNTRANSPORTSTATUS("IPSecVPNTransportStatus");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypeEnum fromValue(String text) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("resource_type")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("tunnel_id")
  private ResourceReference tunnelId = null;

  public L2VPNTransportTunnelStatus() {
    this.resource_type = this.getClass().getSimpleName();
  }
  public L2VPNTransportTunnelStatus resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Resource types of L2VPN Transport tunnels
   * @return resourceType
  **/
  @Schema(required = true, description = "Resource types of L2VPN Transport tunnels")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public L2VPNTransportTunnelStatus tunnelId(ResourceReference tunnelId) {
    this.tunnelId = tunnelId;
    return this;
  }

   /**
   * Get tunnelId
   * @return tunnelId
  **/
  @Schema(description = "")
  public ResourceReference getTunnelId() {
    return tunnelId;
  }

  public void setTunnelId(ResourceReference tunnelId) {
    this.tunnelId = tunnelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L2VPNTransportTunnelStatus l2VPNTransportTunnelStatus = (L2VPNTransportTunnelStatus) o;
    return Objects.equals(this.resourceType, l2VPNTransportTunnelStatus.resourceType) &&
        Objects.equals(this.tunnelId, l2VPNTransportTunnelStatus.tunnelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, tunnelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2VPNTransportTunnelStatus {\n");
    
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tunnelId: ").append(toIndentedString(tunnelId)).append("\n");
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