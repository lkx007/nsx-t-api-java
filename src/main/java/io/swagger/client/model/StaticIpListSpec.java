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
import io.swagger.client.model.IpAssignmentSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * IP assignment specification for Static IP List.
 */
@Schema(description = "IP assignment specification for Static IP List.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class StaticIpListSpec extends IpAssignmentSpec {
  @SerializedName("subnet_mask")
  private String subnetMask = null;

  @SerializedName("ip_list")
  private List<String> ipList = new ArrayList<String>();

  @SerializedName("default_gateway")
  private String defaultGateway = null;

  public StaticIpListSpec subnetMask(String subnetMask) {
    this.subnetMask = subnetMask;
    return this;
  }

   /**
   * Subnet mask
   * @return subnetMask
  **/
  @Schema(required = true, description = "Subnet mask")
  public String getSubnetMask() {
    return subnetMask;
  }

  public void setSubnetMask(String subnetMask) {
    this.subnetMask = subnetMask;
  }

  public StaticIpListSpec ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public StaticIpListSpec addIpListItem(String ipListItem) {
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * List of IPs for transport node host switch virtual tunnel endpoints
   * @return ipList
  **/
  @Schema(required = true, description = "List of IPs for transport node host switch virtual tunnel endpoints")
  public List<String> getIpList() {
    return ipList;
  }

  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }

  public StaticIpListSpec defaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
    return this;
  }

   /**
   * Gateway IP
   * @return defaultGateway
  **/
  @Schema(required = true, description = "Gateway IP")
  public String getDefaultGateway() {
    return defaultGateway;
  }

  public void setDefaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticIpListSpec staticIpListSpec = (StaticIpListSpec) o;
    return Objects.equals(this.subnetMask, staticIpListSpec.subnetMask) &&
        Objects.equals(this.ipList, staticIpListSpec.ipList) &&
        Objects.equals(this.defaultGateway, staticIpListSpec.defaultGateway) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetMask, ipList, defaultGateway, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticIpListSpec {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    defaultGateway: ").append(toIndentedString(defaultGateway)).append("\n");
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
