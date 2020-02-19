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
import java.util.ArrayList;
import java.util.List;
/**
 * Parameters to query results of an application discovery session. It has a list of vm ids. 
 */
@Schema(description = "Parameters to query results of an application discovery session. It has a list of vm ids. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ReportAppResultsForVmsRequestParameters {
  @SerializedName("vm_ids")
  private List<String> vmIds = null;

  public ReportAppResultsForVmsRequestParameters vmIds(List<String> vmIds) {
    this.vmIds = vmIds;
    return this;
  }

  public ReportAppResultsForVmsRequestParameters addVmIdsItem(String vmIdsItem) {
    if (this.vmIds == null) {
      this.vmIds = new ArrayList<String>();
    }
    this.vmIds.add(vmIdsItem);
    return this;
  }

   /**
   * Vm external Ids
   * @return vmIds
  **/
  @Schema(description = "Vm external Ids")
  public List<String> getVmIds() {
    return vmIds;
  }

  public void setVmIds(List<String> vmIds) {
    this.vmIds = vmIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAppResultsForVmsRequestParameters reportAppResultsForVmsRequestParameters = (ReportAppResultsForVmsRequestParameters) o;
    return Objects.equals(this.vmIds, reportAppResultsForVmsRequestParameters.vmIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAppResultsForVmsRequestParameters {\n");
    
    sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
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