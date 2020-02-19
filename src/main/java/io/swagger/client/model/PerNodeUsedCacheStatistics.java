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
 * Query statistics counters of used cache from node 
 */
@Schema(description = "Query statistics counters of used cache from node ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PerNodeUsedCacheStatistics {
  @SerializedName("cached_entries")
  private Long cachedEntries = null;

  @SerializedName("node_id")
  private String nodeId = null;

  @SerializedName("used_cache_size")
  private Long usedCacheSize = null;

   /**
   * The total number of cached entries
   * @return cachedEntries
  **/
  @Schema(description = "The total number of cached entries")
  public Long getCachedEntries() {
    return cachedEntries;
  }

   /**
   * Uuid of active/standby transport node
   * @return nodeId
  **/
  @Schema(description = "Uuid of active/standby transport node")
  public String getNodeId() {
    return nodeId;
  }

   /**
   * The memory size used in cache, in kb
   * @return usedCacheSize
  **/
  @Schema(description = "The memory size used in cache, in kb")
  public Long getUsedCacheSize() {
    return usedCacheSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerNodeUsedCacheStatistics perNodeUsedCacheStatistics = (PerNodeUsedCacheStatistics) o;
    return Objects.equals(this.cachedEntries, perNodeUsedCacheStatistics.cachedEntries) &&
        Objects.equals(this.nodeId, perNodeUsedCacheStatistics.nodeId) &&
        Objects.equals(this.usedCacheSize, perNodeUsedCacheStatistics.usedCacheSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachedEntries, nodeId, usedCacheSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerNodeUsedCacheStatistics {\n");
    
    sb.append("    cachedEntries: ").append(toIndentedString(cachedEntries)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    usedCacheSize: ").append(toIndentedString(usedCacheSize)).append("\n");
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