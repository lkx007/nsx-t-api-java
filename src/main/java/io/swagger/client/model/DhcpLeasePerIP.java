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
 * DhcpLeasePerIP
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DhcpLeasePerIP {
  @SerializedName("subnet")
  private String subnet = null;

  @SerializedName("lease_time")
  private String leaseTime = null;

  @SerializedName("mac_address")
  private String macAddress = null;

  @SerializedName("expire_time")
  private String expireTime = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  public DhcpLeasePerIP subnet(String subnet) {
    this.subnet = subnet;
    return this;
  }

   /**
   * subnet of client network
   * @return subnet
  **/
  @Schema(description = "subnet of client network")
  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

  public DhcpLeasePerIP leaseTime(String leaseTime) {
    this.leaseTime = leaseTime;
    return this;
  }

   /**
   * lease time of the ip address, in seconds
   * @return leaseTime
  **/
  @Schema(description = "lease time of the ip address, in seconds")
  public String getLeaseTime() {
    return leaseTime;
  }

  public void setLeaseTime(String leaseTime) {
    this.leaseTime = leaseTime;
  }

  public DhcpLeasePerIP macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * mac address of client
   * @return macAddress
  **/
  @Schema(required = true, description = "mac address of client")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public DhcpLeasePerIP expireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

   /**
   * expire time of the lease
   * @return expireTime
  **/
  @Schema(description = "expire time of the lease")
  public String getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }

  public DhcpLeasePerIP startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * start time of lease
   * @return startTime
  **/
  @Schema(required = true, description = "start time of lease")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DhcpLeasePerIP ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * ip address of client
   * @return ipAddress
  **/
  @Schema(required = true, description = "ip address of client")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhcpLeasePerIP dhcpLeasePerIP = (DhcpLeasePerIP) o;
    return Objects.equals(this.subnet, dhcpLeasePerIP.subnet) &&
        Objects.equals(this.leaseTime, dhcpLeasePerIP.leaseTime) &&
        Objects.equals(this.macAddress, dhcpLeasePerIP.macAddress) &&
        Objects.equals(this.expireTime, dhcpLeasePerIP.expireTime) &&
        Objects.equals(this.startTime, dhcpLeasePerIP.startTime) &&
        Objects.equals(this.ipAddress, dhcpLeasePerIP.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnet, leaseTime, macAddress, expireTime, startTime, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhcpLeasePerIP {\n");
    
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    leaseTime: ").append(toIndentedString(leaseTime)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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