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
import io.swagger.client.model.TunnelProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Tunnel information between two given transport nodes
 */
@Schema(description = "Tunnel information between two given transport nodes")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PortConnectionTunnel {
  @SerializedName("src_node_id")
  private String srcNodeId = null;

  @SerializedName("tunnel_properties")
  private TunnelProperties tunnelProperties = null;

  public PortConnectionTunnel srcNodeId(String srcNodeId) {
    this.srcNodeId = srcNodeId;
    return this;
  }

   /**
   * Id of the source transport node
   * @return srcNodeId
  **/
  @Schema(required = true, description = "Id of the source transport node")
  public String getSrcNodeId() {
    return srcNodeId;
  }

  public void setSrcNodeId(String srcNodeId) {
    this.srcNodeId = srcNodeId;
  }

  public PortConnectionTunnel tunnelProperties(TunnelProperties tunnelProperties) {
    this.tunnelProperties = tunnelProperties;
    return this;
  }

   /**
   * Get tunnelProperties
   * @return tunnelProperties
  **/
  @Schema(required = true, description = "")
  public TunnelProperties getTunnelProperties() {
    return tunnelProperties;
  }

  public void setTunnelProperties(TunnelProperties tunnelProperties) {
    this.tunnelProperties = tunnelProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortConnectionTunnel portConnectionTunnel = (PortConnectionTunnel) o;
    return Objects.equals(this.srcNodeId, portConnectionTunnel.srcNodeId) &&
        Objects.equals(this.tunnelProperties, portConnectionTunnel.tunnelProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcNodeId, tunnelProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortConnectionTunnel {\n");
    
    sb.append("    srcNodeId: ").append(toIndentedString(srcNodeId)).append("\n");
    sb.append("    tunnelProperties: ").append(toIndentedString(tunnelProperties)).append("\n");
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