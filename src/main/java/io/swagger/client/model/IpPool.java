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
import io.swagger.client.model.IpPoolSubnet;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.PoolUsage;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A collection of one or more IPv4 or IPv6 subnets or ranges that are often not a contiguous address space. Clients are allocated IPs from an IP pool. Often used when a client that consumes addresses exhausts an initial subnet or range and needs to be expanded but the adjoining address space is not available as it has been allocated to a different client.
 */
@Schema(description = "A collection of one or more IPv4 or IPv6 subnets or ranges that are often not a contiguous address space. Clients are allocated IPs from an IP pool. Often used when a client that consumes addresses exhausts an initial subnet or range and needs to be expanded but the adjoining address space is not available as it has been allocated to a different client.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IpPool extends ManagedResource {
  @SerializedName("subnets")
  private List<IpPoolSubnet> subnets = null;

  @SerializedName("pool_usage")
  private PoolUsage poolUsage = null;

  public IpPool subnets(List<IpPoolSubnet> subnets) {
    this.subnets = subnets;
    return this;
  }

  public IpPool addSubnetsItem(IpPoolSubnet subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<IpPoolSubnet>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Subnets can be IPv4 or IPv6 and they should not overlap. The maximum number will not exceed 5 subnets.
   * @return subnets
  **/
  @Schema(description = "Subnets can be IPv4 or IPv6 and they should not overlap. The maximum number will not exceed 5 subnets.")
  public List<IpPoolSubnet> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<IpPoolSubnet> subnets) {
    this.subnets = subnets;
  }

  public IpPool poolUsage(PoolUsage poolUsage) {
    this.poolUsage = poolUsage;
    return this;
  }

   /**
   * Get poolUsage
   * @return poolUsage
  **/
  @Schema(description = "")
  public PoolUsage getPoolUsage() {
    return poolUsage;
  }

  public void setPoolUsage(PoolUsage poolUsage) {
    this.poolUsage = poolUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpPool ipPool = (IpPool) o;
    return Objects.equals(this.subnets, ipPool.subnets) &&
        Objects.equals(this.poolUsage, ipPool.poolUsage) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnets, poolUsage, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpPool {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    poolUsage: ").append(toIndentedString(poolUsage)).append("\n");
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
