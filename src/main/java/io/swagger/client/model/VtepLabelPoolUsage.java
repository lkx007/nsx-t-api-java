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
 * Pool usage statistics in a pool
 */
@Schema(description = "Pool usage statistics in a pool")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VtepLabelPoolUsage {
  @SerializedName("total_ids")
  private Long totalIds = null;

  @SerializedName("allocated_ids")
  private Long allocatedIds = null;

  @SerializedName("free_ids")
  private Long freeIds = null;

   /**
   * Total number of IDs in a pool
   * @return totalIds
  **/
  @Schema(description = "Total number of IDs in a pool")
  public Long getTotalIds() {
    return totalIds;
  }

   /**
   * Total number of allocated IDs in a pool
   * @return allocatedIds
  **/
  @Schema(description = "Total number of allocated IDs in a pool")
  public Long getAllocatedIds() {
    return allocatedIds;
  }

   /**
   * Total number of free IDs in a pool
   * @return freeIds
  **/
  @Schema(description = "Total number of free IDs in a pool")
  public Long getFreeIds() {
    return freeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VtepLabelPoolUsage vtepLabelPoolUsage = (VtepLabelPoolUsage) o;
    return Objects.equals(this.totalIds, vtepLabelPoolUsage.totalIds) &&
        Objects.equals(this.allocatedIds, vtepLabelPoolUsage.allocatedIds) &&
        Objects.equals(this.freeIds, vtepLabelPoolUsage.freeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalIds, allocatedIds, freeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VtepLabelPoolUsage {\n");
    
    sb.append("    totalIds: ").append(toIndentedString(totalIds)).append("\n");
    sb.append("    allocatedIds: ").append(toIndentedString(allocatedIds)).append("\n");
    sb.append("    freeIds: ").append(toIndentedString(freeIds)).append("\n");
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
