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
 * An Endpoint object is part of HostSwitch configuration in TransportNode
 */
@Schema(description = "An Endpoint object is part of HostSwitch configuration in TransportNode")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class Endpoint {
  @SerializedName("subnet_mask")
  private String subnetMask = null;

  @SerializedName("mac")
  private String mac = null;

  @SerializedName("default_gateway")
  private String defaultGateway = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("device_name")
  private String deviceName = null;

  @SerializedName("label")
  private Integer label = null;

   /**
   * Subnet mask
   * @return subnetMask
  **/
  @Schema(description = "Subnet mask")
  public String getSubnetMask() {
    return subnetMask;
  }

   /**
   * MAC address
   * @return mac
  **/
  @Schema(description = "MAC address")
  public String getMac() {
    return mac;
  }

   /**
   * Gateway IP
   * @return defaultGateway
  **/
  @Schema(description = "Gateway IP")
  public String getDefaultGateway() {
    return defaultGateway;
  }

   /**
   * Depending upon the EndpointIpConfig used in HostSwitch, IP could be allocated either from DHCP (default) or from Static IP Pool.
   * @return ip
  **/
  @Schema(description = "Depending upon the EndpointIpConfig used in HostSwitch, IP could be allocated either from DHCP (default) or from Static IP Pool.")
  public String getIp() {
    return ip;
  }

   /**
   * Name of the virtual tunnel endpoint
   * @return deviceName
  **/
  @Schema(description = "Name of the virtual tunnel endpoint")
  public String getDeviceName() {
    return deviceName;
  }

   /**
   * Unique label for this Endpoint
   * @return label
  **/
  @Schema(description = "Unique label for this Endpoint")
  public Integer getLabel() {
    return label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.subnetMask, endpoint.subnetMask) &&
        Objects.equals(this.mac, endpoint.mac) &&
        Objects.equals(this.defaultGateway, endpoint.defaultGateway) &&
        Objects.equals(this.ip, endpoint.ip) &&
        Objects.equals(this.deviceName, endpoint.deviceName) &&
        Objects.equals(this.label, endpoint.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetMask, mac, defaultGateway, ip, deviceName, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    defaultGateway: ").append(toIndentedString(defaultGateway)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
