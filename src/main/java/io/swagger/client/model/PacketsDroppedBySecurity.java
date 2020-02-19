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
import io.swagger.client.model.PacketTypeAndCounter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PacketsDroppedBySecurity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PacketsDroppedBySecurity {
  @SerializedName("spoof_guard_dropped")
  private List<PacketTypeAndCounter> spoofGuardDropped = null;

  @SerializedName("dhcp_server_dropped_ipv4")
  private Long dhcpServerDroppedIpv4 = null;

  @SerializedName("dhcp_server_dropped_ipv6")
  private Long dhcpServerDroppedIpv6 = null;

  @SerializedName("dhcp_client_dropped_ipv4")
  private Long dhcpClientDroppedIpv4 = null;

  @SerializedName("bpdu_filter_dropped")
  private Long bpduFilterDropped = null;

  @SerializedName("dhcp_client_dropped_ipv6")
  private Long dhcpClientDroppedIpv6 = null;

  public PacketsDroppedBySecurity spoofGuardDropped(List<PacketTypeAndCounter> spoofGuardDropped) {
    this.spoofGuardDropped = spoofGuardDropped;
    return this;
  }

  public PacketsDroppedBySecurity addSpoofGuardDroppedItem(PacketTypeAndCounter spoofGuardDroppedItem) {
    if (this.spoofGuardDropped == null) {
      this.spoofGuardDropped = new ArrayList<PacketTypeAndCounter>();
    }
    this.spoofGuardDropped.add(spoofGuardDroppedItem);
    return this;
  }

   /**
   * The packets dropped by \&quot;Spoof Guard\&quot;; supported packet types are IPv4, IPv6, ARP, ND, non-IP.
   * @return spoofGuardDropped
  **/
  @Schema(description = "The packets dropped by \"Spoof Guard\"; supported packet types are IPv4, IPv6, ARP, ND, non-IP.")
  public List<PacketTypeAndCounter> getSpoofGuardDropped() {
    return spoofGuardDropped;
  }

  public void setSpoofGuardDropped(List<PacketTypeAndCounter> spoofGuardDropped) {
    this.spoofGuardDropped = spoofGuardDropped;
  }

  public PacketsDroppedBySecurity dhcpServerDroppedIpv4(Long dhcpServerDroppedIpv4) {
    this.dhcpServerDroppedIpv4 = dhcpServerDroppedIpv4;
    return this;
  }

   /**
   * The number of IPv4 packets dropped by \&quot;DHCP server block\&quot;.
   * @return dhcpServerDroppedIpv4
  **/
  @Schema(description = "The number of IPv4 packets dropped by \"DHCP server block\".")
  public Long getDhcpServerDroppedIpv4() {
    return dhcpServerDroppedIpv4;
  }

  public void setDhcpServerDroppedIpv4(Long dhcpServerDroppedIpv4) {
    this.dhcpServerDroppedIpv4 = dhcpServerDroppedIpv4;
  }

  public PacketsDroppedBySecurity dhcpServerDroppedIpv6(Long dhcpServerDroppedIpv6) {
    this.dhcpServerDroppedIpv6 = dhcpServerDroppedIpv6;
    return this;
  }

   /**
   * The number of IPv6 packets dropped by \&quot;DHCP server block\&quot;.
   * @return dhcpServerDroppedIpv6
  **/
  @Schema(description = "The number of IPv6 packets dropped by \"DHCP server block\".")
  public Long getDhcpServerDroppedIpv6() {
    return dhcpServerDroppedIpv6;
  }

  public void setDhcpServerDroppedIpv6(Long dhcpServerDroppedIpv6) {
    this.dhcpServerDroppedIpv6 = dhcpServerDroppedIpv6;
  }

  public PacketsDroppedBySecurity dhcpClientDroppedIpv4(Long dhcpClientDroppedIpv4) {
    this.dhcpClientDroppedIpv4 = dhcpClientDroppedIpv4;
    return this;
  }

   /**
   * The number of IPv4 packets dropped by \&quot;DHCP client block\&quot;.
   * @return dhcpClientDroppedIpv4
  **/
  @Schema(description = "The number of IPv4 packets dropped by \"DHCP client block\".")
  public Long getDhcpClientDroppedIpv4() {
    return dhcpClientDroppedIpv4;
  }

  public void setDhcpClientDroppedIpv4(Long dhcpClientDroppedIpv4) {
    this.dhcpClientDroppedIpv4 = dhcpClientDroppedIpv4;
  }

  public PacketsDroppedBySecurity bpduFilterDropped(Long bpduFilterDropped) {
    this.bpduFilterDropped = bpduFilterDropped;
    return this;
  }

   /**
   * The number of packets dropped by \&quot;BPDU filter\&quot;.
   * @return bpduFilterDropped
  **/
  @Schema(description = "The number of packets dropped by \"BPDU filter\".")
  public Long getBpduFilterDropped() {
    return bpduFilterDropped;
  }

  public void setBpduFilterDropped(Long bpduFilterDropped) {
    this.bpduFilterDropped = bpduFilterDropped;
  }

  public PacketsDroppedBySecurity dhcpClientDroppedIpv6(Long dhcpClientDroppedIpv6) {
    this.dhcpClientDroppedIpv6 = dhcpClientDroppedIpv6;
    return this;
  }

   /**
   * The number of IPv6 packets dropped by \&quot;DHCP client block\&quot;.
   * @return dhcpClientDroppedIpv6
  **/
  @Schema(description = "The number of IPv6 packets dropped by \"DHCP client block\".")
  public Long getDhcpClientDroppedIpv6() {
    return dhcpClientDroppedIpv6;
  }

  public void setDhcpClientDroppedIpv6(Long dhcpClientDroppedIpv6) {
    this.dhcpClientDroppedIpv6 = dhcpClientDroppedIpv6;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PacketsDroppedBySecurity packetsDroppedBySecurity = (PacketsDroppedBySecurity) o;
    return Objects.equals(this.spoofGuardDropped, packetsDroppedBySecurity.spoofGuardDropped) &&
        Objects.equals(this.dhcpServerDroppedIpv4, packetsDroppedBySecurity.dhcpServerDroppedIpv4) &&
        Objects.equals(this.dhcpServerDroppedIpv6, packetsDroppedBySecurity.dhcpServerDroppedIpv6) &&
        Objects.equals(this.dhcpClientDroppedIpv4, packetsDroppedBySecurity.dhcpClientDroppedIpv4) &&
        Objects.equals(this.bpduFilterDropped, packetsDroppedBySecurity.bpduFilterDropped) &&
        Objects.equals(this.dhcpClientDroppedIpv6, packetsDroppedBySecurity.dhcpClientDroppedIpv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spoofGuardDropped, dhcpServerDroppedIpv4, dhcpServerDroppedIpv6, dhcpClientDroppedIpv4, bpduFilterDropped, dhcpClientDroppedIpv6);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacketsDroppedBySecurity {\n");
    
    sb.append("    spoofGuardDropped: ").append(toIndentedString(spoofGuardDropped)).append("\n");
    sb.append("    dhcpServerDroppedIpv4: ").append(toIndentedString(dhcpServerDroppedIpv4)).append("\n");
    sb.append("    dhcpServerDroppedIpv6: ").append(toIndentedString(dhcpServerDroppedIpv6)).append("\n");
    sb.append("    dhcpClientDroppedIpv4: ").append(toIndentedString(dhcpClientDroppedIpv4)).append("\n");
    sb.append("    bpduFilterDropped: ").append(toIndentedString(bpduFilterDropped)).append("\n");
    sb.append("    dhcpClientDroppedIpv6: ").append(toIndentedString(dhcpClientDroppedIpv6)).append("\n");
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
