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
import io.swagger.client.model.NatCounters;
import io.swagger.client.model.NatStatisticsPerTransportNode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * NatStatisticsPerLogicalRouter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NatStatisticsPerLogicalRouter {
  @SerializedName("last_update_timestamp")
  private Long lastUpdateTimestamp = null;

  @SerializedName("per_transport_node_statistics")
  private List<NatStatisticsPerTransportNode> perTransportNodeStatistics = null;

  @SerializedName("statistics_across_all_nodes")
  private NatCounters statisticsAcrossAllNodes = null;

  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

   /**
   * Timestamp when the data was last updated; unset if data source has never updated the data.
   * @return lastUpdateTimestamp
  **/
  @Schema(description = "Timestamp when the data was last updated; unset if data source has never updated the data.")
  public Long getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

   /**
   * Detailed per node statistics
   * @return perTransportNodeStatistics
  **/
  @Schema(description = "Detailed per node statistics")
  public List<NatStatisticsPerTransportNode> getPerTransportNodeStatistics() {
    return perTransportNodeStatistics;
  }

  public NatStatisticsPerLogicalRouter statisticsAcrossAllNodes(NatCounters statisticsAcrossAllNodes) {
    this.statisticsAcrossAllNodes = statisticsAcrossAllNodes;
    return this;
  }

   /**
   * Get statisticsAcrossAllNodes
   * @return statisticsAcrossAllNodes
  **/
  @Schema(description = "")
  public NatCounters getStatisticsAcrossAllNodes() {
    return statisticsAcrossAllNodes;
  }

  public void setStatisticsAcrossAllNodes(NatCounters statisticsAcrossAllNodes) {
    this.statisticsAcrossAllNodes = statisticsAcrossAllNodes;
  }

   /**
   * Id for the logical router
   * @return logicalRouterId
  **/
  @Schema(description = "Id for the logical router")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatStatisticsPerLogicalRouter natStatisticsPerLogicalRouter = (NatStatisticsPerLogicalRouter) o;
    return Objects.equals(this.lastUpdateTimestamp, natStatisticsPerLogicalRouter.lastUpdateTimestamp) &&
        Objects.equals(this.perTransportNodeStatistics, natStatisticsPerLogicalRouter.perTransportNodeStatistics) &&
        Objects.equals(this.statisticsAcrossAllNodes, natStatisticsPerLogicalRouter.statisticsAcrossAllNodes) &&
        Objects.equals(this.logicalRouterId, natStatisticsPerLogicalRouter.logicalRouterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTimestamp, perTransportNodeStatistics, statisticsAcrossAllNodes, logicalRouterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatStatisticsPerLogicalRouter {\n");
    
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
    sb.append("    perTransportNodeStatistics: ").append(toIndentedString(perTransportNodeStatistics)).append("\n");
    sb.append("    statisticsAcrossAllNodes: ").append(toIndentedString(statisticsAcrossAllNodes)).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
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