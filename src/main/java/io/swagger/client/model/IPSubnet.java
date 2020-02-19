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
import java.util.ArrayList;
import java.util.List;
/**
 * IPSubnet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSubnet {
  @SerializedName("ip_addresses")
  private List<String> ipAddresses = new ArrayList<String>();

  @SerializedName("prefix_length")
  private Long prefixLength = null;

  public IPSubnet ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public IPSubnet addIpAddressesItem(String ipAddressesItem) {
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * All IP addresses, some of which  may be automatically configured. When updating this field, the payload may contain only the IP addresses that should be changed, or may contain the IP addresses to change as well as the automatically assigned addresses. Currently, only one updatable address and one system-maintained address are supported. Currently, the system-maintained address supported is Extended Unique Identifier(EUI)-64 address. EUI-64 address is generated by the system only when user configured ip-subnet has prefix length less than or equal to 64. 
   * @return ipAddresses
  **/
  @Schema(required = true, description = "All IP addresses, some of which  may be automatically configured. When updating this field, the payload may contain only the IP addresses that should be changed, or may contain the IP addresses to change as well as the automatically assigned addresses. Currently, only one updatable address and one system-maintained address are supported. Currently, the system-maintained address supported is Extended Unique Identifier(EUI)-64 address. EUI-64 address is generated by the system only when user configured ip-subnet has prefix length less than or equal to 64. ")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public IPSubnet prefixLength(Long prefixLength) {
    this.prefixLength = prefixLength;
    return this;
  }

   /**
   * Subnet Prefix Length
   * minimum: 1
   * maximum: 128
   * @return prefixLength
  **/
  @Schema(required = true, description = "Subnet Prefix Length")
  public Long getPrefixLength() {
    return prefixLength;
  }

  public void setPrefixLength(Long prefixLength) {
    this.prefixLength = prefixLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSubnet ipSubnet = (IPSubnet) o;
    return Objects.equals(this.ipAddresses, ipSubnet.ipAddresses) &&
        Objects.equals(this.prefixLength, ipSubnet.prefixLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, prefixLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSubnet {\n");
    
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    prefixLength: ").append(toIndentedString(prefixLength)).append("\n");
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