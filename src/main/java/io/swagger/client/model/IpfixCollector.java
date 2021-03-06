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
 * IpfixCollector
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IpfixCollector {
  @SerializedName("collector_ip_address")
  private String collectorIpAddress = null;

  @SerializedName("collector_port")
  private Integer collectorPort = 4739;

  public IpfixCollector collectorIpAddress(String collectorIpAddress) {
    this.collectorIpAddress = collectorIpAddress;
    return this;
  }

   /**
   * IP address for the IPFIX collector
   * @return collectorIpAddress
  **/
  @Schema(required = true, description = "IP address for the IPFIX collector")
  public String getCollectorIpAddress() {
    return collectorIpAddress;
  }

  public void setCollectorIpAddress(String collectorIpAddress) {
    this.collectorIpAddress = collectorIpAddress;
  }

  public IpfixCollector collectorPort(Integer collectorPort) {
    this.collectorPort = collectorPort;
    return this;
  }

   /**
   * Port for the IPFIX collector
   * minimum: 0
   * maximum: 65535
   * @return collectorPort
  **/
  @Schema(description = "Port for the IPFIX collector")
  public Integer getCollectorPort() {
    return collectorPort;
  }

  public void setCollectorPort(Integer collectorPort) {
    this.collectorPort = collectorPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpfixCollector ipfixCollector = (IpfixCollector) o;
    return Objects.equals(this.collectorIpAddress, ipfixCollector.collectorIpAddress) &&
        Objects.equals(this.collectorPort, ipfixCollector.collectorPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectorIpAddress, collectorPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpfixCollector {\n");
    
    sb.append("    collectorIpAddress: ").append(toIndentedString(collectorIpAddress)).append("\n");
    sb.append("    collectorPort: ").append(toIndentedString(collectorPort)).append("\n");
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
