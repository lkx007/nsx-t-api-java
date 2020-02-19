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
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * usage of each capacity type ex. vm, cpu
 */
@Schema(description = "usage of each capacity type ex. vm, cpu")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class CapacityUsage extends Resource {
  @SerializedName("usage_count")
  private Long usageCount = null;

  @SerializedName("capacity_type")
  private String capacityType = null;

   /**
   * count of number of items of capacity_type
   * @return usageCount
  **/
  @Schema(description = "count of number of items of capacity_type")
  public Long getUsageCount() {
    return usageCount;
  }

   /**
   * type of the capacity field
   * @return capacityType
  **/
  @Schema(description = "type of the capacity field")
  public String getCapacityType() {
    return capacityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityUsage capacityUsage = (CapacityUsage) o;
    return Objects.equals(this.usageCount, capacityUsage.usageCount) &&
        Objects.equals(this.capacityType, capacityUsage.capacityType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageCount, capacityType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityUsage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
    sb.append("    capacityType: ").append(toIndentedString(capacityType)).append("\n");
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
