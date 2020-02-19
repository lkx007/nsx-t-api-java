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
import java.math.BigDecimal;
/**
 * CapacityUsageMetaInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class CapacityUsageMetaInfo {
  @SerializedName("max_global_threshold_percentage")
  private BigDecimal maxGlobalThresholdPercentage = null;

  @SerializedName("min_global_threshold_percentage")
  private BigDecimal minGlobalThresholdPercentage = null;

  @SerializedName("last_updated_timestamp")
  private Long lastUpdatedTimestamp = null;

  public CapacityUsageMetaInfo maxGlobalThresholdPercentage(BigDecimal maxGlobalThresholdPercentage) {
    this.maxGlobalThresholdPercentage = maxGlobalThresholdPercentage;
    return this;
  }

   /**
   * Indicates the maximum global threshold percentage 
   * @return maxGlobalThresholdPercentage
  **/
  @Schema(required = true, description = "Indicates the maximum global threshold percentage ")
  public BigDecimal getMaxGlobalThresholdPercentage() {
    return maxGlobalThresholdPercentage;
  }

  public void setMaxGlobalThresholdPercentage(BigDecimal maxGlobalThresholdPercentage) {
    this.maxGlobalThresholdPercentage = maxGlobalThresholdPercentage;
  }

  public CapacityUsageMetaInfo minGlobalThresholdPercentage(BigDecimal minGlobalThresholdPercentage) {
    this.minGlobalThresholdPercentage = minGlobalThresholdPercentage;
    return this;
  }

   /**
   * Indicates the minimum global threshold percentage 
   * @return minGlobalThresholdPercentage
  **/
  @Schema(required = true, description = "Indicates the minimum global threshold percentage ")
  public BigDecimal getMinGlobalThresholdPercentage() {
    return minGlobalThresholdPercentage;
  }

  public void setMinGlobalThresholdPercentage(BigDecimal minGlobalThresholdPercentage) {
    this.minGlobalThresholdPercentage = minGlobalThresholdPercentage;
  }

  public CapacityUsageMetaInfo lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

   /**
   * Timestamp at which capacity usage was last calculated
   * @return lastUpdatedTimestamp
  **/
  @Schema(required = true, description = "Timestamp at which capacity usage was last calculated")
  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityUsageMetaInfo capacityUsageMetaInfo = (CapacityUsageMetaInfo) o;
    return Objects.equals(this.maxGlobalThresholdPercentage, capacityUsageMetaInfo.maxGlobalThresholdPercentage) &&
        Objects.equals(this.minGlobalThresholdPercentage, capacityUsageMetaInfo.minGlobalThresholdPercentage) &&
        Objects.equals(this.lastUpdatedTimestamp, capacityUsageMetaInfo.lastUpdatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxGlobalThresholdPercentage, minGlobalThresholdPercentage, lastUpdatedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityUsageMetaInfo {\n");
    
    sb.append("    maxGlobalThresholdPercentage: ").append(toIndentedString(maxGlobalThresholdPercentage)).append("\n");
    sb.append("    minGlobalThresholdPercentage: ").append(toIndentedString(minGlobalThresholdPercentage)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
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
