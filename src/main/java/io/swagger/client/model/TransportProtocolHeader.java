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
import io.swagger.client.model.DhcpHeader;
import io.swagger.client.model.Dhcpv6Header;
import io.swagger.client.model.DnsHeader;
import io.swagger.client.model.IcmpEchoRequestHeader;
import io.swagger.client.model.NdpHeader;
import io.swagger.client.model.TcpHeader;
import io.swagger.client.model.UdpHeader;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TransportProtocolHeader
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class TransportProtocolHeader {
  @SerializedName("udp_header")
  private UdpHeader udpHeader = null;

  @SerializedName("dhcp_header")
  private DhcpHeader dhcpHeader = null;

  @SerializedName("tcp_header")
  private TcpHeader tcpHeader = null;

  @SerializedName("icmp_echo_request_header")
  private IcmpEchoRequestHeader icmpEchoRequestHeader = null;

  @SerializedName("dhcpv6_header")
  private Dhcpv6Header dhcpv6Header = null;

  @SerializedName("ndp_header")
  private NdpHeader ndpHeader = null;

  @SerializedName("dns_header")
  private DnsHeader dnsHeader = null;

  public TransportProtocolHeader udpHeader(UdpHeader udpHeader) {
    this.udpHeader = udpHeader;
    return this;
  }

   /**
   * Get udpHeader
   * @return udpHeader
  **/
  @Schema(description = "")
  public UdpHeader getUdpHeader() {
    return udpHeader;
  }

  public void setUdpHeader(UdpHeader udpHeader) {
    this.udpHeader = udpHeader;
  }

  public TransportProtocolHeader dhcpHeader(DhcpHeader dhcpHeader) {
    this.dhcpHeader = dhcpHeader;
    return this;
  }

   /**
   * Get dhcpHeader
   * @return dhcpHeader
  **/
  @Schema(description = "")
  public DhcpHeader getDhcpHeader() {
    return dhcpHeader;
  }

  public void setDhcpHeader(DhcpHeader dhcpHeader) {
    this.dhcpHeader = dhcpHeader;
  }

  public TransportProtocolHeader tcpHeader(TcpHeader tcpHeader) {
    this.tcpHeader = tcpHeader;
    return this;
  }

   /**
   * Get tcpHeader
   * @return tcpHeader
  **/
  @Schema(description = "")
  public TcpHeader getTcpHeader() {
    return tcpHeader;
  }

  public void setTcpHeader(TcpHeader tcpHeader) {
    this.tcpHeader = tcpHeader;
  }

  public TransportProtocolHeader icmpEchoRequestHeader(IcmpEchoRequestHeader icmpEchoRequestHeader) {
    this.icmpEchoRequestHeader = icmpEchoRequestHeader;
    return this;
  }

   /**
   * Get icmpEchoRequestHeader
   * @return icmpEchoRequestHeader
  **/
  @Schema(description = "")
  public IcmpEchoRequestHeader getIcmpEchoRequestHeader() {
    return icmpEchoRequestHeader;
  }

  public void setIcmpEchoRequestHeader(IcmpEchoRequestHeader icmpEchoRequestHeader) {
    this.icmpEchoRequestHeader = icmpEchoRequestHeader;
  }

  public TransportProtocolHeader dhcpv6Header(Dhcpv6Header dhcpv6Header) {
    this.dhcpv6Header = dhcpv6Header;
    return this;
  }

   /**
   * Get dhcpv6Header
   * @return dhcpv6Header
  **/
  @Schema(description = "")
  public Dhcpv6Header getDhcpv6Header() {
    return dhcpv6Header;
  }

  public void setDhcpv6Header(Dhcpv6Header dhcpv6Header) {
    this.dhcpv6Header = dhcpv6Header;
  }

  public TransportProtocolHeader ndpHeader(NdpHeader ndpHeader) {
    this.ndpHeader = ndpHeader;
    return this;
  }

   /**
   * Get ndpHeader
   * @return ndpHeader
  **/
  @Schema(description = "")
  public NdpHeader getNdpHeader() {
    return ndpHeader;
  }

  public void setNdpHeader(NdpHeader ndpHeader) {
    this.ndpHeader = ndpHeader;
  }

  public TransportProtocolHeader dnsHeader(DnsHeader dnsHeader) {
    this.dnsHeader = dnsHeader;
    return this;
  }

   /**
   * Get dnsHeader
   * @return dnsHeader
  **/
  @Schema(description = "")
  public DnsHeader getDnsHeader() {
    return dnsHeader;
  }

  public void setDnsHeader(DnsHeader dnsHeader) {
    this.dnsHeader = dnsHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportProtocolHeader transportProtocolHeader = (TransportProtocolHeader) o;
    return Objects.equals(this.udpHeader, transportProtocolHeader.udpHeader) &&
        Objects.equals(this.dhcpHeader, transportProtocolHeader.dhcpHeader) &&
        Objects.equals(this.tcpHeader, transportProtocolHeader.tcpHeader) &&
        Objects.equals(this.icmpEchoRequestHeader, transportProtocolHeader.icmpEchoRequestHeader) &&
        Objects.equals(this.dhcpv6Header, transportProtocolHeader.dhcpv6Header) &&
        Objects.equals(this.ndpHeader, transportProtocolHeader.ndpHeader) &&
        Objects.equals(this.dnsHeader, transportProtocolHeader.dnsHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(udpHeader, dhcpHeader, tcpHeader, icmpEchoRequestHeader, dhcpv6Header, ndpHeader, dnsHeader);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportProtocolHeader {\n");
    
    sb.append("    udpHeader: ").append(toIndentedString(udpHeader)).append("\n");
    sb.append("    dhcpHeader: ").append(toIndentedString(dhcpHeader)).append("\n");
    sb.append("    tcpHeader: ").append(toIndentedString(tcpHeader)).append("\n");
    sb.append("    icmpEchoRequestHeader: ").append(toIndentedString(icmpEchoRequestHeader)).append("\n");
    sb.append("    dhcpv6Header: ").append(toIndentedString(dhcpv6Header)).append("\n");
    sb.append("    ndpHeader: ").append(toIndentedString(ndpHeader)).append("\n");
    sb.append("    dnsHeader: ").append(toIndentedString(dnsHeader)).append("\n");
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
