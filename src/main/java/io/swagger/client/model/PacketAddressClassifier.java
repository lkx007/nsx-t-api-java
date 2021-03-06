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
 * A packet is classified to have an address binding, if its address configuration matches with all user specified properties. 
 */
@Schema(description = "A packet is classified to have an address binding, if its address configuration matches with all user specified properties. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PacketAddressClassifier {
  @SerializedName("vlan")
  private Long vlan = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("mac_address")
  private String macAddress = null;

  public PacketAddressClassifier vlan(Long vlan) {
    this.vlan = vlan;
    return this;
  }

   /**
   * Virtual Local Area Network Identifier
   * @return vlan
  **/
  @Schema(description = "Virtual Local Area Network Identifier")
  public Long getVlan() {
    return vlan;
  }

  public void setVlan(Long vlan) {
    this.vlan = vlan;
  }

  public PacketAddressClassifier ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * A single IP address or a subnet, e.g. x.x.x.x or x.x.x.x/y
   * @return ipAddress
  **/
  @Schema(description = "A single IP address or a subnet, e.g. x.x.x.x or x.x.x.x/y")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public PacketAddressClassifier macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * A single MAC address
   * @return macAddress
  **/
  @Schema(description = "A single MAC address")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PacketAddressClassifier packetAddressClassifier = (PacketAddressClassifier) o;
    return Objects.equals(this.vlan, packetAddressClassifier.vlan) &&
        Objects.equals(this.ipAddress, packetAddressClassifier.ipAddress) &&
        Objects.equals(this.macAddress, packetAddressClassifier.macAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlan, ipAddress, macAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacketAddressClassifier {\n");
    
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
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
