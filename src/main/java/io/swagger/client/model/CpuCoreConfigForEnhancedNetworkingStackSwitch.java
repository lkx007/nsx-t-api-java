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
 * Non Uniform Memory Access (NUMA) nodes and Logical cpu cores (Lcores) per NUMA node configuration for Enhanced Networking Stack enabled HostSwitch.
 */
@Schema(description = "Non Uniform Memory Access (NUMA) nodes and Logical cpu cores (Lcores) per NUMA node configuration for Enhanced Networking Stack enabled HostSwitch.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class CpuCoreConfigForEnhancedNetworkingStackSwitch {
  @SerializedName("num_lcores")
  private Integer numLcores = null;

  @SerializedName("numa_node_index")
  private Integer numaNodeIndex = null;

  public CpuCoreConfigForEnhancedNetworkingStackSwitch numLcores(Integer numLcores) {
    this.numLcores = numLcores;
    return this;
  }

   /**
   * Number of Logical cpu cores (Lcores) to be placed on a specified NUMA node
   * minimum: 1
   * @return numLcores
  **/
  @Schema(required = true, description = "Number of Logical cpu cores (Lcores) to be placed on a specified NUMA node")
  public Integer getNumLcores() {
    return numLcores;
  }

  public void setNumLcores(Integer numLcores) {
    this.numLcores = numLcores;
  }

  public CpuCoreConfigForEnhancedNetworkingStackSwitch numaNodeIndex(Integer numaNodeIndex) {
    this.numaNodeIndex = numaNodeIndex;
    return this;
  }

   /**
   * Unique index of the Non Uniform Memory Access (NUMA) node
   * minimum: 0
   * @return numaNodeIndex
  **/
  @Schema(required = true, description = "Unique index of the Non Uniform Memory Access (NUMA) node")
  public Integer getNumaNodeIndex() {
    return numaNodeIndex;
  }

  public void setNumaNodeIndex(Integer numaNodeIndex) {
    this.numaNodeIndex = numaNodeIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpuCoreConfigForEnhancedNetworkingStackSwitch cpuCoreConfigForEnhancedNetworkingStackSwitch = (CpuCoreConfigForEnhancedNetworkingStackSwitch) o;
    return Objects.equals(this.numLcores, cpuCoreConfigForEnhancedNetworkingStackSwitch.numLcores) &&
        Objects.equals(this.numaNodeIndex, cpuCoreConfigForEnhancedNetworkingStackSwitch.numaNodeIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numLcores, numaNodeIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpuCoreConfigForEnhancedNetworkingStackSwitch {\n");
    
    sb.append("    numLcores: ").append(toIndentedString(numLcores)).append("\n");
    sb.append("    numaNodeIndex: ").append(toIndentedString(numaNodeIndex)).append("\n");
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
