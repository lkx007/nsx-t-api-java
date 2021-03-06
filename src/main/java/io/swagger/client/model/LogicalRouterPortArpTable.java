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
import io.swagger.client.model.ListResult;
import io.swagger.client.model.LogicalRouterPortArpEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LogicalRouterPortArpTable
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LogicalRouterPortArpTable extends ListResult {
  @SerializedName("last_update_timestamp")
  private Long lastUpdateTimestamp = null;

  @SerializedName("results")
  private List<LogicalRouterPortArpEntry> results = null;

  @SerializedName("logical_router_port_id")
  private String logicalRouterPortId = null;

   /**
   * Timestamp when the data was last updated; unset if data source has never updated the data.
   * @return lastUpdateTimestamp
  **/
  @Schema(description = "Timestamp when the data was last updated; unset if data source has never updated the data.")
  public Long getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public LogicalRouterPortArpTable results(List<LogicalRouterPortArpEntry> results) {
    this.results = results;
    return this;
  }

  public LogicalRouterPortArpTable addResultsItem(LogicalRouterPortArpEntry resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<LogicalRouterPortArpEntry>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<LogicalRouterPortArpEntry> getResults() {
    return results;
  }

  public void setResults(List<LogicalRouterPortArpEntry> results) {
    this.results = results;
  }

  public LogicalRouterPortArpTable logicalRouterPortId(String logicalRouterPortId) {
    this.logicalRouterPortId = logicalRouterPortId;
    return this;
  }

   /**
   * The ID of the logical router port
   * @return logicalRouterPortId
  **/
  @Schema(required = true, description = "The ID of the logical router port")
  public String getLogicalRouterPortId() {
    return logicalRouterPortId;
  }

  public void setLogicalRouterPortId(String logicalRouterPortId) {
    this.logicalRouterPortId = logicalRouterPortId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalRouterPortArpTable logicalRouterPortArpTable = (LogicalRouterPortArpTable) o;
    return Objects.equals(this.lastUpdateTimestamp, logicalRouterPortArpTable.lastUpdateTimestamp) &&
        Objects.equals(this.results, logicalRouterPortArpTable.results) &&
        Objects.equals(this.logicalRouterPortId, logicalRouterPortArpTable.logicalRouterPortId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTimestamp, results, logicalRouterPortId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalRouterPortArpTable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    logicalRouterPortId: ").append(toIndentedString(logicalRouterPortId)).append("\n");
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
