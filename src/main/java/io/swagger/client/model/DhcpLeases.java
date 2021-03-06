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
import io.swagger.client.model.DhcpLeasePerIP;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DhcpLeases
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DhcpLeases {
  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("leases")
  private List<DhcpLeasePerIP> leases = null;

  @SerializedName("dhcp_server_id")
  private String dhcpServerId = null;

  public DhcpLeases timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * timestamp of the lease info
   * @return timestamp
  **/
  @Schema(description = "timestamp of the lease info")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public DhcpLeases leases(List<DhcpLeasePerIP> leases) {
    this.leases = leases;
    return this;
  }

  public DhcpLeases addLeasesItem(DhcpLeasePerIP leasesItem) {
    if (this.leases == null) {
      this.leases = new ArrayList<DhcpLeasePerIP>();
    }
    this.leases.add(leasesItem);
    return this;
  }

   /**
   * The lease info list of the server
   * @return leases
  **/
  @Schema(description = "The lease info list of the server")
  public List<DhcpLeasePerIP> getLeases() {
    return leases;
  }

  public void setLeases(List<DhcpLeasePerIP> leases) {
    this.leases = leases;
  }

  public DhcpLeases dhcpServerId(String dhcpServerId) {
    this.dhcpServerId = dhcpServerId;
    return this;
  }

   /**
   * dhcp server uuid
   * @return dhcpServerId
  **/
  @Schema(description = "dhcp server uuid")
  public String getDhcpServerId() {
    return dhcpServerId;
  }

  public void setDhcpServerId(String dhcpServerId) {
    this.dhcpServerId = dhcpServerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhcpLeases dhcpLeases = (DhcpLeases) o;
    return Objects.equals(this.timestamp, dhcpLeases.timestamp) &&
        Objects.equals(this.leases, dhcpLeases.leases) &&
        Objects.equals(this.dhcpServerId, dhcpLeases.dhcpServerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, leases, dhcpServerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhcpLeases {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    leases: ").append(toIndentedString(leases)).append("\n");
    sb.append("    dhcpServerId: ").append(toIndentedString(dhcpServerId)).append("\n");
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
