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
import io.swagger.client.model.L2VpnTunnelEncapsulation;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.ResourceReference;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Defines the tunnel local and peer addresses along with the multiple tansport tunnels for redundancy. L2VpnSession belongs on to only one L2VpnService.
 */
@Schema(description = "Defines the tunnel local and peer addresses along with the multiple tansport tunnels for redundancy. L2VpnSession belongs on to only one L2VpnService.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class L2VpnSession extends ManagedResource {
  @SerializedName("l2vpn_service_id")
  private String l2vpnServiceId = null;

  @SerializedName("tunnel_encapsulation")
  private L2VpnTunnelEncapsulation tunnelEncapsulation = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("transport_tunnels")
  private List<ResourceReference> transportTunnels = new ArrayList<ResourceReference>();

  public L2VpnSession l2vpnServiceId(String l2vpnServiceId) {
    this.l2vpnServiceId = l2vpnServiceId;
    return this;
  }

   /**
   * L2VPN service id
   * @return l2vpnServiceId
  **/
  @Schema(required = true, description = "L2VPN service id")
  public String getL2vpnServiceId() {
    return l2vpnServiceId;
  }

  public void setL2vpnServiceId(String l2vpnServiceId) {
    this.l2vpnServiceId = l2vpnServiceId;
  }

  public L2VpnSession tunnelEncapsulation(L2VpnTunnelEncapsulation tunnelEncapsulation) {
    this.tunnelEncapsulation = tunnelEncapsulation;
    return this;
  }

   /**
   * Get tunnelEncapsulation
   * @return tunnelEncapsulation
  **/
  @Schema(description = "")
  public L2VpnTunnelEncapsulation getTunnelEncapsulation() {
    return tunnelEncapsulation;
  }

  public void setTunnelEncapsulation(L2VpnTunnelEncapsulation tunnelEncapsulation) {
    this.tunnelEncapsulation = tunnelEncapsulation;
  }

  public L2VpnSession enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable to extend all the associated logical switches.
   * @return enabled
  **/
  @Schema(description = "Enable to extend all the associated logical switches.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public L2VpnSession transportTunnels(List<ResourceReference> transportTunnels) {
    this.transportTunnels = transportTunnels;
    return this;
  }

  public L2VpnSession addTransportTunnelsItem(ResourceReference transportTunnelsItem) {
    this.transportTunnels.add(transportTunnelsItem);
    return this;
  }

   /**
   * List of transport tunnels for redundancy.
   * @return transportTunnels
  **/
  @Schema(required = true, description = "List of transport tunnels for redundancy.")
  public List<ResourceReference> getTransportTunnels() {
    return transportTunnels;
  }

  public void setTransportTunnels(List<ResourceReference> transportTunnels) {
    this.transportTunnels = transportTunnels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L2VpnSession l2VpnSession = (L2VpnSession) o;
    return Objects.equals(this.l2vpnServiceId, l2VpnSession.l2vpnServiceId) &&
        Objects.equals(this.tunnelEncapsulation, l2VpnSession.tunnelEncapsulation) &&
        Objects.equals(this.enabled, l2VpnSession.enabled) &&
        Objects.equals(this.transportTunnels, l2VpnSession.transportTunnels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l2vpnServiceId, tunnelEncapsulation, enabled, transportTunnels, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2VpnSession {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l2vpnServiceId: ").append(toIndentedString(l2vpnServiceId)).append("\n");
    sb.append("    tunnelEncapsulation: ").append(toIndentedString(tunnelEncapsulation)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    transportTunnels: ").append(toIndentedString(transportTunnels)).append("\n");
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
