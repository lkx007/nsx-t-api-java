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
import io.swagger.client.model.ErrorResolverInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Collection of all registered ErrorResolverInfo
 */
@Schema(description = "Collection of all registered ErrorResolverInfo")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ErrorResolverInfoList {
  @SerializedName("results")
  private List<ErrorResolverInfo> results = new ArrayList<ErrorResolverInfo>();

  public ErrorResolverInfoList results(List<ErrorResolverInfo> results) {
    this.results = results;
    return this;
  }

  public ErrorResolverInfoList addResultsItem(ErrorResolverInfo resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * ErrorResolverInfo list
   * @return results
  **/
  @Schema(required = true, description = "ErrorResolverInfo list")
  public List<ErrorResolverInfo> getResults() {
    return results;
  }

  public void setResults(List<ErrorResolverInfo> results) {
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
    ErrorResolverInfoList errorResolverInfoList = (ErrorResolverInfoList) o;
    return Objects.equals(this.results, errorResolverInfoList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResolverInfoList {\n");
    
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
