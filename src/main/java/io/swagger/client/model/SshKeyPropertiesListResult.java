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
import io.swagger.client.model.SshKeyProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SSH key properties query results
 */
@Schema(description = "SSH key properties query results")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SshKeyPropertiesListResult extends ListResult {
  @SerializedName("results")
  private List<SshKeyProperties> results = new ArrayList<SshKeyProperties>();

  public SshKeyPropertiesListResult results(List<SshKeyProperties> results) {
    this.results = results;
    return this;
  }

  public SshKeyPropertiesListResult addResultsItem(SshKeyProperties resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * SSH key properties query results
   * @return results
  **/
  @Schema(required = true, description = "SSH key properties query results")
  public List<SshKeyProperties> getResults() {
    return results;
  }

  public void setResults(List<SshKeyProperties> results) {
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
    SshKeyPropertiesListResult sshKeyPropertiesListResult = (SshKeyPropertiesListResult) o;
    return Objects.equals(this.results, sshKeyPropertiesListResult.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshKeyPropertiesListResult {\n");
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
