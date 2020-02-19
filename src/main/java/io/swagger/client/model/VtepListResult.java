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
import io.swagger.client.model.VtepTableEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VtepListResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VtepListResult extends ListResult {
  @SerializedName("last_update_timestamp")
  private Long lastUpdateTimestamp = null;

  @SerializedName("logical_switch_id")
  private String logicalSwitchId = null;

  @SerializedName("results")
  private List<VtepTableEntry> results = null;

  @SerializedName("transport_node_id")
  private String transportNodeId = null;

   /**
   * Timestamp when the data was last updated; unset if data source has never updated the data.
   * @return lastUpdateTimestamp
  **/
  @Schema(description = "Timestamp when the data was last updated; unset if data source has never updated the data.")
  public Long getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

   /**
   * The id of the logical Switch
   * @return logicalSwitchId
  **/
  @Schema(description = "The id of the logical Switch")
  public String getLogicalSwitchId() {
    return logicalSwitchId;
  }

  public VtepListResult results(List<VtepTableEntry> results) {
    this.results = results;
    return this;
  }

  public VtepListResult addResultsItem(VtepTableEntry resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<VtepTableEntry>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<VtepTableEntry> getResults() {
    return results;
  }

  public void setResults(List<VtepTableEntry> results) {
    this.results = results;
  }

   /**
   * Transport node identifier
   * @return transportNodeId
  **/
  @Schema(description = "Transport node identifier")
  public String getTransportNodeId() {
    return transportNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VtepListResult vtepListResult = (VtepListResult) o;
    return Objects.equals(this.lastUpdateTimestamp, vtepListResult.lastUpdateTimestamp) &&
        Objects.equals(this.logicalSwitchId, vtepListResult.logicalSwitchId) &&
        Objects.equals(this.results, vtepListResult.results) &&
        Objects.equals(this.transportNodeId, vtepListResult.transportNodeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTimestamp, logicalSwitchId, results, transportNodeId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VtepListResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
    sb.append("    logicalSwitchId: ").append(toIndentedString(logicalSwitchId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    transportNodeId: ").append(toIndentedString(transportNodeId)).append("\n");
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