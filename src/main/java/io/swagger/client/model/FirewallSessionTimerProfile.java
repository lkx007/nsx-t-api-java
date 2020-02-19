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
import io.swagger.client.model.BaseFirewallProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A profile holding TCP, UDP and ICMP session timeout configuration.
 */
@Schema(description = "A profile holding TCP, UDP and ICMP session timeout configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class FirewallSessionTimerProfile extends BaseFirewallProfile {
  @SerializedName("tcp_closed")
  private Long tcpClosed = 20l;

  @SerializedName("tcp_opening")
  private Long tcpOpening = 30l;

  @SerializedName("udp_single")
  private Long udpSingle = 30l;

  @SerializedName("tcp_finwait")
  private Long tcpFinwait = 45l;

  @SerializedName("tcp_first_packet")
  private Long tcpFirstPacket = 120l;

  @SerializedName("tcp_closing")
  private Long tcpClosing = 120l;

  @SerializedName("tcp_established")
  private Long tcpEstablished = 43200l;

  @SerializedName("udp_multiple")
  private Long udpMultiple = 60l;

  @SerializedName("icmp_error_reply")
  private Long icmpErrorReply = 10l;

  @SerializedName("udp_first_packet")
  private Long udpFirstPacket = 60l;

  @SerializedName("icmp_first_packet")
  private Long icmpFirstPacket = 20l;

  public FirewallSessionTimerProfile tcpClosed(Long tcpClosed) {
    this.tcpClosed = tcpClosed;
    return this;
  }

   /**
   * The timeout value of connection in seconds after one endpoint sends an RST.
   * minimum: 10
   * maximum: 4320000
   * @return tcpClosed
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds after one endpoint sends an RST.")
  public Long getTcpClosed() {
    return tcpClosed;
  }

  public void setTcpClosed(Long tcpClosed) {
    this.tcpClosed = tcpClosed;
  }

  public FirewallSessionTimerProfile tcpOpening(Long tcpOpening) {
    this.tcpOpening = tcpOpening;
    return this;
  }

   /**
   * The timeout value of connection in seconds after a second packet has been transferred.
   * minimum: 10
   * maximum: 4320000
   * @return tcpOpening
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds after a second packet has been transferred.")
  public Long getTcpOpening() {
    return tcpOpening;
  }

  public void setTcpOpening(Long tcpOpening) {
    this.tcpOpening = tcpOpening;
  }

  public FirewallSessionTimerProfile udpSingle(Long udpSingle) {
    this.udpSingle = udpSingle;
    return this;
  }

   /**
   * The timeout value of connection in seconds if the source host sends more than one packet but the destination host has never sent one back.
   * minimum: 10
   * maximum: 4320000
   * @return udpSingle
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds if the source host sends more than one packet but the destination host has never sent one back.")
  public Long getUdpSingle() {
    return udpSingle;
  }

  public void setUdpSingle(Long udpSingle) {
    this.udpSingle = udpSingle;
  }

  public FirewallSessionTimerProfile tcpFinwait(Long tcpFinwait) {
    this.tcpFinwait = tcpFinwait;
    return this;
  }

   /**
   * The timeout value of connection in seconds after both FINs have been exchanged and connection is closed.
   * minimum: 10
   * maximum: 4320000
   * @return tcpFinwait
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds after both FINs have been exchanged and connection is closed.")
  public Long getTcpFinwait() {
    return tcpFinwait;
  }

  public void setTcpFinwait(Long tcpFinwait) {
    this.tcpFinwait = tcpFinwait;
  }

  public FirewallSessionTimerProfile tcpFirstPacket(Long tcpFirstPacket) {
    this.tcpFirstPacket = tcpFirstPacket;
    return this;
  }

   /**
   * The timeout value of connection in seconds after the first packet has been sent.
   * minimum: 10
   * maximum: 4320000
   * @return tcpFirstPacket
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds after the first packet has been sent.")
  public Long getTcpFirstPacket() {
    return tcpFirstPacket;
  }

  public void setTcpFirstPacket(Long tcpFirstPacket) {
    this.tcpFirstPacket = tcpFirstPacket;
  }

  public FirewallSessionTimerProfile tcpClosing(Long tcpClosing) {
    this.tcpClosing = tcpClosing;
    return this;
  }

   /**
   * The timeout value of connection in seconds after the first FIN has been sent.
   * minimum: 10
   * maximum: 4320000
   * @return tcpClosing
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds after the first FIN has been sent.")
  public Long getTcpClosing() {
    return tcpClosing;
  }

  public void setTcpClosing(Long tcpClosing) {
    this.tcpClosing = tcpClosing;
  }

  public FirewallSessionTimerProfile tcpEstablished(Long tcpEstablished) {
    this.tcpEstablished = tcpEstablished;
    return this;
  }

   /**
   * The timeout value of connection in seconds once the connection has become fully established.
   * minimum: 120
   * maximum: 4320000
   * @return tcpEstablished
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds once the connection has become fully established.")
  public Long getTcpEstablished() {
    return tcpEstablished;
  }

  public void setTcpEstablished(Long tcpEstablished) {
    this.tcpEstablished = tcpEstablished;
  }

  public FirewallSessionTimerProfile udpMultiple(Long udpMultiple) {
    this.udpMultiple = udpMultiple;
    return this;
  }

   /**
   * The timeout value of connection in seconds if both hosts have sent packets.
   * minimum: 10
   * maximum: 4320000
   * @return udpMultiple
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds if both hosts have sent packets.")
  public Long getUdpMultiple() {
    return udpMultiple;
  }

  public void setUdpMultiple(Long udpMultiple) {
    this.udpMultiple = udpMultiple;
  }

  public FirewallSessionTimerProfile icmpErrorReply(Long icmpErrorReply) {
    this.icmpErrorReply = icmpErrorReply;
    return this;
  }

   /**
   * The timeout value for the connection after an ICMP error came back in response to an ICMP packet.
   * minimum: 10
   * maximum: 4320000
   * @return icmpErrorReply
  **/
  @Schema(required = true, description = "The timeout value for the connection after an ICMP error came back in response to an ICMP packet.")
  public Long getIcmpErrorReply() {
    return icmpErrorReply;
  }

  public void setIcmpErrorReply(Long icmpErrorReply) {
    this.icmpErrorReply = icmpErrorReply;
  }

  public FirewallSessionTimerProfile udpFirstPacket(Long udpFirstPacket) {
    this.udpFirstPacket = udpFirstPacket;
    return this;
  }

   /**
   * The timeout value of connection in seconds after the first packet. This will be the initial timeout for the new UDP flow.
   * minimum: 10
   * maximum: 4320000
   * @return udpFirstPacket
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds after the first packet. This will be the initial timeout for the new UDP flow.")
  public Long getUdpFirstPacket() {
    return udpFirstPacket;
  }

  public void setUdpFirstPacket(Long udpFirstPacket) {
    this.udpFirstPacket = udpFirstPacket;
  }

  public FirewallSessionTimerProfile icmpFirstPacket(Long icmpFirstPacket) {
    this.icmpFirstPacket = icmpFirstPacket;
    return this;
  }

   /**
   * The timeout value of connection in seconds after the first packet. This will be the initial timeout for the new ICMP flow.
   * minimum: 10
   * maximum: 4320000
   * @return icmpFirstPacket
  **/
  @Schema(required = true, description = "The timeout value of connection in seconds after the first packet. This will be the initial timeout for the new ICMP flow.")
  public Long getIcmpFirstPacket() {
    return icmpFirstPacket;
  }

  public void setIcmpFirstPacket(Long icmpFirstPacket) {
    this.icmpFirstPacket = icmpFirstPacket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallSessionTimerProfile firewallSessionTimerProfile = (FirewallSessionTimerProfile) o;
    return Objects.equals(this.tcpClosed, firewallSessionTimerProfile.tcpClosed) &&
        Objects.equals(this.tcpOpening, firewallSessionTimerProfile.tcpOpening) &&
        Objects.equals(this.udpSingle, firewallSessionTimerProfile.udpSingle) &&
        Objects.equals(this.tcpFinwait, firewallSessionTimerProfile.tcpFinwait) &&
        Objects.equals(this.tcpFirstPacket, firewallSessionTimerProfile.tcpFirstPacket) &&
        Objects.equals(this.tcpClosing, firewallSessionTimerProfile.tcpClosing) &&
        Objects.equals(this.tcpEstablished, firewallSessionTimerProfile.tcpEstablished) &&
        Objects.equals(this.udpMultiple, firewallSessionTimerProfile.udpMultiple) &&
        Objects.equals(this.icmpErrorReply, firewallSessionTimerProfile.icmpErrorReply) &&
        Objects.equals(this.udpFirstPacket, firewallSessionTimerProfile.udpFirstPacket) &&
        Objects.equals(this.icmpFirstPacket, firewallSessionTimerProfile.icmpFirstPacket) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcpClosed, tcpOpening, udpSingle, tcpFinwait, tcpFirstPacket, tcpClosing, tcpEstablished, udpMultiple, icmpErrorReply, udpFirstPacket, icmpFirstPacket, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallSessionTimerProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tcpClosed: ").append(toIndentedString(tcpClosed)).append("\n");
    sb.append("    tcpOpening: ").append(toIndentedString(tcpOpening)).append("\n");
    sb.append("    udpSingle: ").append(toIndentedString(udpSingle)).append("\n");
    sb.append("    tcpFinwait: ").append(toIndentedString(tcpFinwait)).append("\n");
    sb.append("    tcpFirstPacket: ").append(toIndentedString(tcpFirstPacket)).append("\n");
    sb.append("    tcpClosing: ").append(toIndentedString(tcpClosing)).append("\n");
    sb.append("    tcpEstablished: ").append(toIndentedString(tcpEstablished)).append("\n");
    sb.append("    udpMultiple: ").append(toIndentedString(udpMultiple)).append("\n");
    sb.append("    icmpErrorReply: ").append(toIndentedString(icmpErrorReply)).append("\n");
    sb.append("    udpFirstPacket: ").append(toIndentedString(udpFirstPacket)).append("\n");
    sb.append("    icmpFirstPacket: ").append(toIndentedString(icmpFirstPacket)).append("\n");
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