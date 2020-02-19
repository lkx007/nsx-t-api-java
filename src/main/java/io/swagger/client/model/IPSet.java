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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * IPSet is used to group individual IP addresses, range of IP addresses or subnets. An IPSet is a homogeneous group of IP addresses, either of type IPv4 or of type IPv6. IPSets can be used as source or destination in firewall rules. These can also be used as members of NSGroups. 
 */
@Schema(description = "IPSet is used to group individual IP addresses, range of IP addresses or subnets. An IPSet is a homogeneous group of IP addresses, either of type IPv4 or of type IPv6. IPSets can be used as source or destination in firewall rules. These can also be used as members of NSGroups. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSet extends ManagedResource {
  @SerializedName("ip_addresses")
  private List<String> ipAddresses = null;

  public IPSet ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public IPSet addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<String>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * IP addresses
   * @return ipAddresses
  **/
  @Schema(description = "IP addresses")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSet ipSet = (IPSet) o;
    return Objects.equals(this.ipAddresses, ipSet.ipAddresses) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSet {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
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
