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
import io.swagger.client.model.NodeUserProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Node users list results
 */
@Schema(description = "Node users list results")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NodeUserPropertiesListResult extends ListResult {
  @SerializedName("results")
  private List<NodeUserProperties> results = new ArrayList<NodeUserProperties>();

  public NodeUserPropertiesListResult results(List<NodeUserProperties> results) {
    this.results = results;
    return this;
  }

  public NodeUserPropertiesListResult addResultsItem(NodeUserProperties resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * List of node users
   * @return results
  **/
  @Schema(required = true, description = "List of node users")
  public List<NodeUserProperties> getResults() {
    return results;
  }

  public void setResults(List<NodeUserProperties> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeUserPropertiesListResult nodeUserPropertiesListResult = (NodeUserPropertiesListResult) o;
    return Objects.equals(this.results, nodeUserPropertiesListResult.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeUserPropertiesListResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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