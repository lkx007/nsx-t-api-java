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
import io.swagger.client.model.LbSnatIpElement;
import io.swagger.client.model.LbSnatTranslation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LbSnatIpPool
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbSnatIpPool extends LbSnatTranslation {
  @SerializedName("ip_addresses")
  private List<LbSnatIpElement> ipAddresses = new ArrayList<LbSnatIpElement>();

  public LbSnatIpPool ipAddresses(List<LbSnatIpElement> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public LbSnatIpPool addIpAddressesItem(LbSnatIpElement ipAddressesItem) {
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * If an IP range is specified, the range may contain no more than 64 IP addresses. 
   * @return ipAddresses
  **/
  @Schema(required = true, description = "If an IP range is specified, the range may contain no more than 64 IP addresses. ")
  public List<LbSnatIpElement> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<LbSnatIpElement> ipAddresses) {
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
    LbSnatIpPool lbSnatIpPool = (LbSnatIpPool) o;
    return Objects.equals(this.ipAddresses, lbSnatIpPool.ipAddresses) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbSnatIpPool {\n");
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
