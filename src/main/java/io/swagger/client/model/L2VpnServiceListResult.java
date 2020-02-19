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
import io.swagger.client.model.L2VpnService;
import io.swagger.client.model.ListResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Paginated list all the L2VPN services.
 */
@Schema(description = "Paginated list all the L2VPN services.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class L2VpnServiceListResult extends ListResult {
  @SerializedName("results")
  private List<L2VpnService> results = new ArrayList<L2VpnService>();

  public L2VpnServiceListResult results(List<L2VpnService> results) {
    this.results = results;
    return this;
  }

  public L2VpnServiceListResult addResultsItem(L2VpnService resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * L2VPN serivce list result
   * @return results
  **/
  @Schema(required = true, description = "L2VPN serivce list result")
  public List<L2VpnService> getResults() {
    return results;
  }

  public void setResults(List<L2VpnService> results) {
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
    L2VpnServiceListResult l2VpnServiceListResult = (L2VpnServiceListResult) o;
    return Objects.equals(this.results, l2VpnServiceListResult.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2VpnServiceListResult {\n");
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