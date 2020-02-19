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
import io.swagger.client.model.DhcpOptions;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Base type of ip-allocation extended by ip pool and static binding. 
 */
@Schema(description = "Base type of ip-allocation extended by ip pool and static binding. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IpAllocationBase extends ManagedResource {
  @SerializedName("lease_time")
  private Long leaseTime = 86400l;

  @SerializedName("gateway_ip")
  private String gatewayIp = null;

  @SerializedName("options")
  private DhcpOptions options = null;

  public IpAllocationBase leaseTime(Long leaseTime) {
    this.leaseTime = leaseTime;
    return this;
  }

   /**
   * Lease time, in seconds, [60-(2^32-1)]. Default is 86400.
   * minimum: 60
   * maximum: 4294967295
   * @return leaseTime
  **/
  @Schema(description = "Lease time, in seconds, [60-(2^32-1)]. Default is 86400.")
  public Long getLeaseTime() {
    return leaseTime;
  }

  public void setLeaseTime(Long leaseTime) {
    this.leaseTime = leaseTime;
  }

  public IpAllocationBase gatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
    return this;
  }

   /**
   * Gateway ip address of the allocation.
   * @return gatewayIp
  **/
  @Schema(description = "Gateway ip address of the allocation.")
  public String getGatewayIp() {
    return gatewayIp;
  }

  public void setGatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
  }

  public IpAllocationBase options(DhcpOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public DhcpOptions getOptions() {
    return options;
  }

  public void setOptions(DhcpOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAllocationBase ipAllocationBase = (IpAllocationBase) o;
    return Objects.equals(this.leaseTime, ipAllocationBase.leaseTime) &&
        Objects.equals(this.gatewayIp, ipAllocationBase.gatewayIp) &&
        Objects.equals(this.options, ipAllocationBase.options) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaseTime, gatewayIp, options, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAllocationBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    leaseTime: ").append(toIndentedString(leaseTime)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
