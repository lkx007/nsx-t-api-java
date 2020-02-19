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
import io.swagger.client.model.BfdConfigParameters;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * StaticHopBfdPeer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class StaticHopBfdPeer extends ManagedResource {
  @SerializedName("source_addresses")
  private List<String> sourceAddresses = null;

  @SerializedName("bfd_config")
  private BfdConfigParameters bfdConfig = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("peer_ip_address")
  private String peerIpAddress = null;

  public StaticHopBfdPeer sourceAddresses(List<String> sourceAddresses) {
    this.sourceAddresses = sourceAddresses;
    return this;
  }

  public StaticHopBfdPeer addSourceAddressesItem(String sourceAddressesItem) {
    if (this.sourceAddresses == null) {
      this.sourceAddresses = new ArrayList<String>();
    }
    this.sourceAddresses.add(sourceAddressesItem);
    return this;
  }

   /**
   * BFD peers will be created from all these source addresses to this neighbour.
   * @return sourceAddresses
  **/
  @Schema(description = "BFD peers will be created from all these source addresses to this neighbour.")
  public List<String> getSourceAddresses() {
    return sourceAddresses;
  }

  public void setSourceAddresses(List<String> sourceAddresses) {
    this.sourceAddresses = sourceAddresses;
  }

  public StaticHopBfdPeer bfdConfig(BfdConfigParameters bfdConfig) {
    this.bfdConfig = bfdConfig;
    return this;
  }

   /**
   * Get bfdConfig
   * @return bfdConfig
  **/
  @Schema(description = "")
  public BfdConfigParameters getBfdConfig() {
    return bfdConfig;
  }

  public void setBfdConfig(BfdConfigParameters bfdConfig) {
    this.bfdConfig = bfdConfig;
  }

  public StaticHopBfdPeer enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicate BFD peer is enabled or disabled. Default is true.
   * @return enabled
  **/
  @Schema(description = "Indicate BFD peer is enabled or disabled. Default is true.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public StaticHopBfdPeer peerIpAddress(String peerIpAddress) {
    this.peerIpAddress = peerIpAddress;
    return this;
  }

   /**
   * IP address of BFD peer. This should be same as next hop IP address.
   * @return peerIpAddress
  **/
  @Schema(required = true, description = "IP address of BFD peer. This should be same as next hop IP address.")
  public String getPeerIpAddress() {
    return peerIpAddress;
  }

  public void setPeerIpAddress(String peerIpAddress) {
    this.peerIpAddress = peerIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticHopBfdPeer staticHopBfdPeer = (StaticHopBfdPeer) o;
    return Objects.equals(this.sourceAddresses, staticHopBfdPeer.sourceAddresses) &&
        Objects.equals(this.bfdConfig, staticHopBfdPeer.bfdConfig) &&
        Objects.equals(this.enabled, staticHopBfdPeer.enabled) &&
        Objects.equals(this.peerIpAddress, staticHopBfdPeer.peerIpAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceAddresses, bfdConfig, enabled, peerIpAddress, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticHopBfdPeer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceAddresses: ").append(toIndentedString(sourceAddresses)).append("\n");
    sb.append("    bfdConfig: ").append(toIndentedString(bfdConfig)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    peerIpAddress: ").append(toIndentedString(peerIpAddress)).append("\n");
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