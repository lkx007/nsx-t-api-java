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
import io.swagger.client.model.ApplianceManagementTaskProperties;
import io.swagger.client.model.ListResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Appliance management task query results
 */
@Schema(description = "Appliance management task query results")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ApplianceManagementTaskListResult extends ListResult {
  @SerializedName("results")
  private List<ApplianceManagementTaskProperties> results = new ArrayList<ApplianceManagementTaskProperties>();

  public ApplianceManagementTaskListResult results(List<ApplianceManagementTaskProperties> results) {
    this.results = results;
    return this;
  }

  public ApplianceManagementTaskListResult addResultsItem(ApplianceManagementTaskProperties resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Task property results
   * @return results
  **/
  @Schema(required = true, description = "Task property results")
  public List<ApplianceManagementTaskProperties> getResults() {
    return results;
  }

  public void setResults(List<ApplianceManagementTaskProperties> results) {
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
    ApplianceManagementTaskListResult applianceManagementTaskListResult = (ApplianceManagementTaskListResult) o;
    return Objects.equals(this.results, applianceManagementTaskListResult.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplianceManagementTaskListResult {\n");
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
